package com.litecoding.smali2java;

import java.util.ArrayList;
import java.util.List;

import com.litecoding.smali2java.entity.smali.SmaliCodeEntity;
import com.litecoding.smali2java.entity.smali.EntityFactory;
import com.litecoding.smali2java.entity.smali.Label;
import com.litecoding.smali2java.entity.smali.MethodRef;
import com.litecoding.smali2java.entity.smali.Param;
import com.litecoding.smali2java.entity.smali.SmaliClass;
import com.litecoding.smali2java.entity.smali.SmaliMethod;
import com.litecoding.smali2java.entity.smali.Value;
import com.litecoding.smali2java.entity.smali.Register;
import com.litecoding.smali2java.entity.smali.RegisterGroup;
import com.litecoding.smali2java.parser.*;

public abstract class BasicSmaliBuilder extends BasicTextBuilder
{
	protected SmaliClass smaliClass = null;
	protected SmaliMethod currentMethod = null;

	@Override
	public Object visit(Rule_todoStubLine rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_padding rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_optPadding rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_listSeparator rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_qualifier rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_className rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_commentSequence rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_comment rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_emptyLine rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_skipLine rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_fileName rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_accessMode rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirClass rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirSuper rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirSource rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirImplements rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirField rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirMethod rule)
	{
		return rule.spelling;
	}	

	@Override
	public Object visit(Rule_type rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_boolValue rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_intValue rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_intDecValue rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_intHexValue rule)
	{
		return rule.spelling;
	}


	@Override
	public Object visit(Rule_strValue rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_value rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirEnd rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_dirEndMethod rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirRegisters rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_dirLocal rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_escSymbol rule)
	{
		return rule.spelling;
	}		

	@Override
	public Object visit(Rule_smaliConstructorName rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_classConstructorName rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_cmdAny rule)
	{
		//this rule should have the only child rule
		return rule.rules.get(0).accept(this);
	}

	@Override
	public Object visit(Rule_cmdInvokeDirect rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdReturnVoid rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIput rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIputWide rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIget rule)
	{	
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdReturn rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIgetObject rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdReturnObject rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIgetWide rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdReturnWide rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdConst4 rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdGoto rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIfNe rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdMove rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_codeLabel rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_label rule)
	{
		for(Rule innerRule : rule.rules) {
			if(innerRule instanceof Rule_codeLabel)
				return EntityFactory.createLabel(innerRule.rules.get(1).spelling);
		}
		return null;
	}

	@Override
	public Object visit(Rule_cmdConstString rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIfEq rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIfEqz rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIfNez rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdInvokeStatic rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdInvokeVirtual rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdMoveResultObject rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdNewInstance rule)
	{
		return generateCmdFromRules(rule.rules);
	}
	
	@Override
	public Object visit(Rule_cmdNop rule)
	{		
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdIputObject rule)
	{
		return generateCmdFromRules(rule.rules);
	}
	
	@Override
	public Object visit(Rule_cmdSputObject rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_codeRegisterP rule)
	{
		return generateRegisterFromRule(rule);
	}

	@Override
	public Object visit(Rule_codeRegisterV rule)
	{		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegister rule) {
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterVDst rule)
	{		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterP64 rule)
	{
		return generateRegisterFromRule(rule);
	}

	@Override
	public Object visit(Rule_codeRegisterV64 rule)
	{		
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegister64 rule) {
		return generateRegisterFromRule(rule);
	}
	
	@Override
	public Object visit(Rule_codeRegisterV64Dst rule) {		
		return generateRegisterFromRule(rule);
	}

		
	@Override
	public Object visit(Rule_smaliFieldRef rule)
	{		
		String className = "";
		String name = "";
		String type = "";
		
		for(Rule innerRule : rule.rules)
		{
			if(innerRule instanceof Rule_className)
				className = innerRule.spelling;
			else if(innerRule instanceof Rule_qualifier)
				name = innerRule.spelling;
			else if(innerRule instanceof Rule_type)
			{
				type = innerRule.spelling;
				smaliClass.addImport(type);
			}
		}
		return EntityFactory.createFieldRef(name, className, type);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visit(Rule_smaliMethodRef rule)
	{
		MethodRef ref = EntityFactory.createCommonMethodRef();
		for(Rule innerRule : rule.rules)
		{
			if(innerRule instanceof Rule_className)
				ref.setClassName(innerRule.spelling);
			else if(innerRule instanceof Rule_qualifier)
				ref.setName(innerRule.spelling);
			else if(innerRule instanceof Rule_smaliConstructorName)
			{
				ref.setName(innerRule.spelling);
				ref.setConstructor(true);
			}
			else if(innerRule instanceof Rule_classMethodProto)
			{
				List<Param> protoParams = (List<Param>)innerRule.accept(this);
				ref.setReturnType(protoParams.remove(0).getType());
				smaliClass.addImport(ref.getReturnType());
				for(Param param : protoParams)
				{
					ref.addParam(param);
					smaliClass.addImport(param.getType());
				}
			}
		}
		return ref;
	}	
	
	@Override
	public Object visit(Rule_codeRegisterGroup rule)
	{
		RegisterGroup group = new RegisterGroup();
		for(Rule innerRule : rule.rules)
		{
			if(innerRule instanceof Rule_codeRegisterV ||
			   innerRule instanceof Rule_codeRegisterP)
			{
				group.addArgument((SmaliCodeEntity)innerRule.accept(this));
			}
		}
		return group;
	}	

	private Object generateRegisterFromRule(Rule rule) {
		Rule testRule = rule;
		Register register = new Register();
		
		if(rule instanceof Rule_codeRegister || 
				rule instanceof Rule_codeRegister64) {
			testRule = rule.rules.get(0);
		}
		
		if(testRule instanceof Rule_codeRegisterP ||
				testRule instanceof Rule_codeRegisterP64)
			register.setParameter(true);
		
		if(testRule instanceof Rule_codeRegisterVDst || 
				testRule instanceof Rule_codeRegisterV64Dst)
			register.setDestination(true);
		
		if(testRule instanceof Rule_codeRegisterP64 ||
				testRule instanceof Rule_codeRegisterV64 || 
				testRule instanceof Rule_codeRegisterV64Dst)
			register.set64bit(true);
		
		register.setName(rule.spelling);
		register.mapRegister(currentMethod);
		
		return register;
	}
	
	private Object generateCmdFromRules(ArrayList<Rule> rules) {
		SmaliCodeEntity command = null;
		
		boolean cmdDetermined = false;
		for(Rule innerRule : rules) {
			if(innerRule instanceof Rule_padding ||
				innerRule instanceof Rule_optPadding)
				continue;
			
			if(innerRule instanceof Rule_codeLabel) {
					Label innerLabel = EntityFactory.createLabel(innerRule.rules.get(1).spelling);
					command.addArgument(innerLabel);
			} else if(innerRule instanceof Terminal_StringValue) {
				if(!cmdDetermined) {
					cmdDetermined = true;
					command = EntityFactory.createInstruction(innerRule.spelling, null);
				}				
			} else if(innerRule instanceof Rule_codeRegisterV ||
					innerRule instanceof Rule_codeRegisterVDst ||
					innerRule instanceof Rule_codeRegisterP ||
					innerRule instanceof Rule_codeRegister ||
					innerRule instanceof Rule_codeRegisterV64 ||
					innerRule instanceof Rule_codeRegisterV64Dst ||
					innerRule instanceof Rule_codeRegisterP64 ||
					innerRule instanceof Rule_codeRegister64 ||
					innerRule instanceof Rule_codeRegisterGroup ||
					innerRule instanceof Rule_smaliFieldRef ||
					innerRule instanceof Rule_smaliMethodRef) {
				command.getArguments().add((SmaliCodeEntity)innerRule.accept(this));
			} else if(innerRule instanceof Rule_intValue ||
					innerRule instanceof Rule_strValue) {
				Value innerValue = new Value();
				innerValue.setName(innerRule.spelling);
				command.getArguments().add(innerValue);
			} else if(innerRule instanceof Rule_todoStubLine) {
				System.err.println("Warning: " + command.getName() + " is not fully supported");
			}
		}
		return command;
	}
}
