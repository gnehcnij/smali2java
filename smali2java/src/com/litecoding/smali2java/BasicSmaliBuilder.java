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
import com.litecoding.smali2java.entity.smali.Variable;
import com.litecoding.smali2java.entity.smali.VariableGroup;
import com.litecoding.smali2java.parser.Rule;
import com.litecoding.smali2java.parser.Rule_accessMode;
import com.litecoding.smali2java.parser.Rule_boolValue;
import com.litecoding.smali2java.parser.Rule_classConstructorName;
import com.litecoding.smali2java.parser.Rule_classDirective;
import com.litecoding.smali2java.parser.Rule_classMethodProto;
import com.litecoding.smali2java.parser.Rule_className;
import com.litecoding.smali2java.parser.Rule_cmdAny;
import com.litecoding.smali2java.parser.Rule_cmdConst4;
import com.litecoding.smali2java.parser.Rule_cmdConstString;
import com.litecoding.smali2java.parser.Rule_cmdGoto;
import com.litecoding.smali2java.parser.Rule_cmdIfEq;
import com.litecoding.smali2java.parser.Rule_cmdIfEqz;
import com.litecoding.smali2java.parser.Rule_cmdIfNe;
import com.litecoding.smali2java.parser.Rule_cmdIfNez;
import com.litecoding.smali2java.parser.Rule_cmdIget;
import com.litecoding.smali2java.parser.Rule_cmdIgetObject;
import com.litecoding.smali2java.parser.Rule_cmdIgetWide;
import com.litecoding.smali2java.parser.Rule_cmdInvokeDirect;
import com.litecoding.smali2java.parser.Rule_cmdInvokeStatic;
import com.litecoding.smali2java.parser.Rule_cmdInvokeVirtual;
import com.litecoding.smali2java.parser.Rule_cmdIput;
import com.litecoding.smali2java.parser.Rule_cmdIputObject;
import com.litecoding.smali2java.parser.Rule_cmdIputWide;
import com.litecoding.smali2java.parser.Rule_cmdLabel;
import com.litecoding.smali2java.parser.Rule_cmdMove;
import com.litecoding.smali2java.parser.Rule_cmdMoveResultObject;
import com.litecoding.smali2java.parser.Rule_cmdNewInstance;
import com.litecoding.smali2java.parser.Rule_cmdNop;
import com.litecoding.smali2java.parser.Rule_cmdReturn;
import com.litecoding.smali2java.parser.Rule_cmdReturnObject;
import com.litecoding.smali2java.parser.Rule_cmdReturnVoid;
import com.litecoding.smali2java.parser.Rule_cmdReturnWide;
import com.litecoding.smali2java.parser.Rule_cmdSputObject;
import com.litecoding.smali2java.parser.Rule_comment;
import com.litecoding.smali2java.parser.Rule_commentSequence;
import com.litecoding.smali2java.parser.Rule_emptyLine;
import com.litecoding.smali2java.parser.Rule_endDirective;
import com.litecoding.smali2java.parser.Rule_endMethodDirective;
import com.litecoding.smali2java.parser.Rule_escSymbol;
import com.litecoding.smali2java.parser.Rule_fieldDirective;
import com.litecoding.smali2java.parser.Rule_fileName;
import com.litecoding.smali2java.parser.Rule_fmtSeparator;
import com.litecoding.smali2java.parser.Rule_implementsDirective;
import com.litecoding.smali2java.parser.Rule_intDecValue;
import com.litecoding.smali2java.parser.Rule_intHexValue;
import com.litecoding.smali2java.parser.Rule_intValue;
import com.litecoding.smali2java.parser.Rule_label;
import com.litecoding.smali2java.parser.Rule_localDirective;
import com.litecoding.smali2java.parser.Rule_methodDirective;
import com.litecoding.smali2java.parser.Rule_qualifier;
import com.litecoding.smali2java.parser.Rule_registersDirective;
import com.litecoding.smali2java.parser.Rule_skipLine;
import com.litecoding.smali2java.parser.Rule_smaliConstructorName;
import com.litecoding.smali2java.parser.Rule_smaliFieldRef;
import com.litecoding.smali2java.parser.Rule_smaliMethodRef;
import com.litecoding.smali2java.parser.Rule_smaliParam;
import com.litecoding.smali2java.parser.Rule_smaliVar;
import com.litecoding.smali2java.parser.Rule_smaliVarGroup;
import com.litecoding.smali2java.parser.Rule_sourceDirective;
import com.litecoding.smali2java.parser.Rule_strValue;
import com.litecoding.smali2java.parser.Rule_superDirective;
import com.litecoding.smali2java.parser.Rule_type;
import com.litecoding.smali2java.parser.Rule_value;
import com.litecoding.smali2java.parser.Terminal_StringValue;


public abstract class BasicSmaliBuilder extends BasicTextBuilder
{
	protected SmaliClass smaliClass = null;
	protected SmaliMethod currentMethod = null;

	@Override
	public Object visit(Rule_fmtSeparator rule)
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
	public Object visit(Rule_classDirective rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_superDirective rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_sourceDirective rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_implementsDirective rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_fieldDirective rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_methodDirective rule)
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
	public Object visit(Rule_endDirective rule)
	{
		return rule.spelling;
	}

	@Override
	public Object visit(Rule_endMethodDirective rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_registersDirective rule)
	{
		return rule.spelling;
	}
	
	@Override
	public Object visit(Rule_localDirective rule)
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
	public Object visit(Rule_label rule)
	{
		return generateCmdFromRules(rule.rules);
	}

	@Override
	public Object visit(Rule_cmdLabel rule)
	{
		return generateCmdFromRules(rule.rules);
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
	public Object visit(Rule_smaliParam rule)
	{
		Variable var = new Variable();
		var.setName(rule.spelling);
		return var;
	}

	@Override
	public Object visit(Rule_smaliVar rule)
	{		
		Variable var = new Variable();
		var.setName(rule.spelling);
		return var;
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
	public Object visit(Rule_smaliVarGroup rule)
	{
		VariableGroup group = new VariableGroup();
		for(Rule innerRule : rule.rules)
		{
			if(innerRule instanceof Rule_smaliVar ||
			   innerRule instanceof Rule_smaliParam)
			{
				group.addArgument((SmaliCodeEntity)innerRule.accept(this));
			}
		}
		return group;
	}	

	private Object generateCmdFromRules(ArrayList<Rule> rules)
	{
		SmaliCodeEntity command = null;
		
		boolean cmdDetermined = false;
		for(Rule innerRule : rules)
		{
			if(innerRule instanceof Rule_fmtSeparator)
				continue;
			
			if(innerRule instanceof Rule_label)
			{
				if(!cmdDetermined)
				{
					cmdDetermined = true;
					command = EntityFactory.createLabel(innerRule.rules.get(1).spelling);
				}
				else
				{
					Label innerLabel = EntityFactory.createLabel(innerRule.rules.get(1).spelling);
					command.addArgument(innerLabel);
				}
			}
			else if(innerRule instanceof Terminal_StringValue)
			{
				if(!cmdDetermined)
				{
					cmdDetermined = true;
					command = EntityFactory.createInstruction(innerRule.spelling, null);
				}				
			}
			else if(innerRule instanceof Rule_smaliVar ||
					innerRule instanceof Rule_smaliParam ||
					innerRule instanceof Rule_smaliVarGroup ||
					innerRule instanceof Rule_smaliFieldRef ||
					innerRule instanceof Rule_smaliMethodRef)
			{
				command.getArguments().add((SmaliCodeEntity)innerRule.accept(this));
			}
			else if(innerRule instanceof Rule_intValue ||
					innerRule instanceof Rule_strValue)
			{
				Value innerValue = new Value();
				innerValue.setName(innerRule.spelling);
				command.getArguments().add(innerValue);
			}			
		}
		return command;
	}
}
