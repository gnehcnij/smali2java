package com.litecoding.smali2java.renderer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import com.litecoding.smali2java.entity.smali.Instruction;
import com.litecoding.smali2java.entity.smali.Label;
import com.litecoding.smali2java.entity.smali.OpcodeData;
import com.litecoding.smali2java.entity.smali.SmaliCodeEntity;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.litecoding.smali2java.entity.smali.Variable;

/**
 * This class converts smali entities to java entities
 * @author Dmitry Vorobiev
 *
 */
public class SmaliRenderer {
	public static class Block {
		public static final AtomicInteger ID = new AtomicInteger();
		
		/**
		 * Id of this block
		 */
		public final int id;
		
		/**
		 * List of blocks that redirect execution flow to this block. 
		 */
		public final List<Block> referencedBy = new LinkedList<Block>();
		
		/**
		 * List of variables read and written by this block
		 */
		public final List<String> usedVariables = new LinkedList<String>();
		
		/**
		 * List of variables written by this block
		 */
		public final List<String> modifiedVariables = new LinkedList<String>();
		
		public boolean isRootBlock = false;
		
		/**
		 * Label associated with this block.
		 */
		public Label smaliLabel = null;
		
		public final List<Instruction> instructions = new LinkedList<Instruction>();
		
		/**
		 * Last instruction is if-*.
		 */
		public boolean isEndsByCondition = false;
		
		public Instruction condition = null;
		
		/**
		 * Last instruction is goto*.
		 */
		public boolean isEndsByGoto = false;
		
		/**
		 * Last instruction is return*
		 */
		public boolean isEndsByReturn = false;
		
		public Instruction returnInstruction = null;
		
		/**
		 * Link to next block in cases of true condition, goto or simple redirect.
		 */
		public Block nextBlockIfTrue = null;
		
		/**
		 * Link to next block in case of false condition.
		 */
		public Block nextBlockIfFalse = null;
		
		
		/*
		 * Internal variables
		 */
		
		/**
		 * Shows is block never used before
		 */
		public boolean internalIsEmpty = true;
		public Label internalNextLabelIfTrue = null;
		
		public Block() {
			this.id = ID.incrementAndGet();
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			final String separator = "========================================\n";
			
			builder.append(separator);
			builder.append("id: ");
			builder.append(id);
			builder.append("\n");
			
			if(isRootBlock) {
				builder.append("This is the first block\n");
			} else {
				builder.append("referenced by: ");
				for(Block block : referencedBy) {
					builder.append(block.id);
					builder.append(" ");
				}
				builder.append("\n");
			}
			
			builder.append("used variables: ");
			builder.append(usedVariables.toString());
			builder.append("\n");
			
			builder.append("modified variables: ");
			builder.append(modifiedVariables.toString());
			builder.append("\n");
			
			if(smaliLabel != null) {
				builder.append("smali label: ");
				builder.append(smaliLabel.getName());
				builder.append("\n");
			}
			
			builder.append("instructions:\n");
			for(Instruction instruction : instructions) {
				builder.append("    ");
				builder.append(instruction.toString());
				builder.append("\n");
			}
			
			if(isEndsByCondition) {
				builder.append("Ends by condition: ");
				builder.append(condition.toString());
				builder.append("\n");
			} else if(isEndsByGoto) {
				builder.append("Ends by goto\n");
			} else if(isEndsByReturn) {
				builder.append("Ends by return: ");
				builder.append(returnInstruction.toString());
				builder.append("\n");
			} else {
				builder.append("Ends by beginning of the next block\n");
			}
			
			if(nextBlockIfTrue != null) {
				builder.append("next block if true: ");
				builder.append(nextBlockIfTrue.id);
				builder.append("\n");
			}
			
			if(nextBlockIfFalse != null) {
				builder.append("next block if false: ");
				builder.append(nextBlockIfFalse.id);
				builder.append("\n");
			}
			
			return builder.toString();
		}
	}
	
	public static Block generateBlocks(SmaliMethod smaliMethod) throws UnknownLabelException {
		Map<String, Block> labeledBlocks = new HashMap<String, Block>();
		List<Block> allBlocks = new LinkedList<Block>();
		
		//generate root block
		Block rootBlock = new Block();
		rootBlock.isRootBlock = true;
		
		Block block = rootBlock;
		
		for(SmaliCodeEntity codeEntity : smaliMethod.getCommands()) {
			//label for outer breaking
			mainLoop:
		
			if(codeEntity instanceof Instruction) {
				Instruction instruction = (Instruction) codeEntity;
				switch(instruction.getOpcodeData().getType()) {
				case OpcodeData.TYPE_GOTO: {
					block.internalIsEmpty = false;
					block.isEndsByGoto = true;
					block.internalNextLabelIfTrue = (Label) instruction.getArguments().get(0);
					
					//register block in labeled & all
					if(block.smaliLabel != null)
						labeledBlocks.put(block.smaliLabel.getName(), block);
					allBlocks.add(block);
					
					block = new Block();
					break mainLoop;
				}
				case OpcodeData.TYPE_CONDITION: {
					block.internalIsEmpty = false;
					block.isEndsByCondition = true;
					block.condition = instruction;
					block.internalNextLabelIfTrue = 
							(Label) instruction.getArguments().get(instruction.getArguments().size() - 1);
					
					//register variables in block
					int count = instruction.getArguments().size();
					for(int i = 0; i < count - 1; i++) {
						Variable currVar = (Variable) instruction.getArguments().get(i);
						if(!currVar.isParameter() && !block.usedVariables.contains(currVar.getName())) {
							block.usedVariables.add(currVar.getName());
						}
					}
					
					//register block in labeled & all
					if(block.smaliLabel != null)
						labeledBlocks.put(block.smaliLabel.getName(), block);
					allBlocks.add(block);
					
					//now we should create a block that follows the current if condition is false
					Block prevBlock = block;
					block = new Block();
					prevBlock.nextBlockIfFalse = block;
					
					break mainLoop;
				}
				case OpcodeData.TYPE_RETURN: {
					block.internalIsEmpty = false;
					block.isEndsByReturn = true;
					block.returnInstruction = instruction;
					
					//register variables in block
					int count = instruction.getArguments().size();
					for(int i = 0; i < count; i++) {
						Variable currVar = (Variable) instruction.getArguments().get(i);
						if(!currVar.isParameter() && !block.usedVariables.contains(currVar.getName())) {
							block.usedVariables.add(currVar.getName());
						}
					}
					
					//register block in labeled & all
					if(block.smaliLabel != null)
						labeledBlocks.put(block.smaliLabel.getName(), block);
					allBlocks.add(block);
					
					block = new Block();
					break mainLoop;
				}
				default: {
					block.internalIsEmpty = false;
					block.instructions.add(instruction);
					break mainLoop;
				}
				}
			} else if(codeEntity instanceof Label) {
				Label label = (Label) codeEntity;
				if(!block.internalIsEmpty) {
					//This means that end of current block is regular instruction 
					//(not a condition or goto)
					
					//finishing previous block & creating the next
					block.internalNextLabelIfTrue = label;
					
					//register block in labeled & all
					if(block.smaliLabel != null)
						labeledBlocks.put(block.smaliLabel.getName(), block);
					allBlocks.add(block);
					
					block = new Block();
				}
				
				//here we have a brand-new block
				block.internalIsEmpty = false;
				block.smaliLabel = label;
				break mainLoop;
			}
		}
		
		//resolve labels
		for(Block currBlock : allBlocks) {
			if(currBlock.internalNextLabelIfTrue != null) {
				String labelName = currBlock.internalNextLabelIfTrue.getName();
				if(!labeledBlocks.containsKey(labelName)) {
					throw new UnknownLabelException("Unknown label: " + labelName);
				}
				
				currBlock.nextBlockIfTrue = labeledBlocks.get(labelName);
			}
			
			if(currBlock.nextBlockIfTrue != null)
				currBlock.nextBlockIfTrue.referencedBy.add(currBlock);
			
			if(currBlock.nextBlockIfFalse != null)
				currBlock.nextBlockIfFalse.referencedBy.add(currBlock);
		}
		
		allBlocks.clear();
		labeledBlocks.clear();
		return rootBlock;
	}
	
	public static void printBlockChain(Block rootBlock) {
		List<Block> printed = new LinkedList<Block>();
		List<Block> scheduled = new LinkedList<Block>();
		scheduled.add(rootBlock);
		
		while(!scheduled.isEmpty()) {
			Block currBlock = scheduled.remove(0);
			if(!printed.contains(currBlock)) {
				System.out.println(currBlock);
				printed.add(currBlock);
			}
			
			if(currBlock.nextBlockIfTrue != null && !printed.contains(currBlock.nextBlockIfTrue))
				scheduled.add(currBlock.nextBlockIfTrue);
			
			if(currBlock.nextBlockIfFalse != null && !printed.contains(currBlock.nextBlockIfFalse))
				scheduled.add(currBlock.nextBlockIfFalse);
		}
	}
}
