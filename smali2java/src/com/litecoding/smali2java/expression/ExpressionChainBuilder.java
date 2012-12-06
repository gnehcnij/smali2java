package com.litecoding.smali2java.expression;

import java.util.LinkedList;
import java.util.List;

import com.litecoding.smali2java.entity.CodeEntity;
import com.litecoding.smali2java.entity.FieldRef;
import com.litecoding.smali2java.entity.Instruction;
import com.litecoding.smali2java.entity.OpcodeData;
import com.litecoding.smali2java.entity.Variable;

import dalvik.bytecode.Opcodes;

public class ExpressionChainBuilder
{
	public static ExpressionChain buildExpressionChain(List<CodeEntity> commands)
	{
		ExpressionChain chain = new ExpressionChain();
		Expression currExpr = null;
		VariableContext context = new VariableContext();
		
		for(CodeEntity command : commands)
		{
			if(command instanceof Instruction)
			{
				Instruction inst = (Instruction)command;
				
				//BEGIN temporary part
				if(inst.getOpcodeData() == null) continue;
				//END temporary part
				
				switch(inst.getOpcodeData().getType())
				{
					case OpcodeData.TYPE_CONST:
					{
						currExpr = new ConstExpression();				
						((ConstExpression)currExpr).setLocalVarIdx(((Variable)inst.getArguments().get(0)).getId());
						((ConstExpression)currExpr).setValue(inst.getArguments().get(1).getName());
						context.setVariable(((ConstExpression)currExpr).getLocalVarIdx(), currExpr);
						break;
					}
					case OpcodeData.TYPE_GET:
					{
						currExpr = new FieldRefExpression();
						int opcode = inst.getOpcodeData().getOpcode();						
						if(opcode >= Opcodes.OP_IGET && opcode <= Opcodes.OP_IGET_SHORT)
						{
							//BEGIN temporary part
							if(inst.getArguments().size() >= 3)
							{
							//END temporary part
								Variable toVar = (Variable)inst.getArguments().get(0);
								Variable objRef = (Variable)inst.getArguments().get(1);
								FieldRef fieldRef = (FieldRef)inst.getArguments().get(2);
								((FieldRefExpression)currExpr).setClassName(fieldRef.getClassName());
								((FieldRefExpression)currExpr).setFieldName(fieldRef.getName());
								((FieldRefExpression)currExpr).setFieldType(fieldRef.getType());
								if(!objRef.isParameter())
									((FieldRefExpression)currExpr).setObject(context.getVariables().get(objRef.getId()));
								else if(objRef.getId() == 0)
									((FieldRefExpression)currExpr).setObject(null);
								context.setVariable(toVar.getId(), currExpr);
							//BEGIN temporary part
							}
							//END temporary part
						} else if(opcode >= Opcodes.OP_IPUT && opcode <= Opcodes.OP_IPUT_SHORT) {
							//BEGIN temporary part
							if(inst.getArguments().size() >= 3)
							{
							//END temporary part
								Variable fromVar = (Variable)inst.getArguments().get(0);
								Variable objRef = (Variable)inst.getArguments().get(1);
								FieldRef fieldRef = (FieldRef)inst.getArguments().get(2);
								((FieldRefExpression)currExpr).setClassName(fieldRef.getClassName());
								((FieldRefExpression)currExpr).setFieldName(fieldRef.getName());
								((FieldRefExpression)currExpr).setFieldType(fieldRef.getType());
								if(!objRef.isParameter())
									((FieldRefExpression)currExpr).setObject(context.getVariables().get(objRef.getId()));
								else if(objRef.getId() == 0)
									((FieldRefExpression)currExpr).setObject(null);
								context.setVariable(fromVar.getId(), currExpr);
							//BEGIN temporary part
							}
							//END temporary part
						}
						break;
					}
					case OpcodeData.TYPE_RETURN:
					{
						currExpr = new ReturnExpression();
						if(inst.getArguments().size() != 0)
						{
							int retValId = ((Variable)inst.getArguments().get(0)).getId();
							((ReturnExpression)currExpr).setReturnExpression(context.getVariables().get(retValId));								
						}
						chain.expressions.add(currExpr);
						break;
					}
					default:
					{
						break;
					}
				} //switch
			} //if
		} //for
		return chain;
	}

}
