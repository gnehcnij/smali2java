package com.litecoding.smali2java.entity.smali;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SmaliMethod extends SmaliEntity
{	
	protected String name = "";
	protected boolean isConstructor = false;
	protected List<Param> params = new LinkedList<Param>(); 
	protected String returnType = "";
	protected int locals = 0;
	protected List<SmaliCodeEntity> commands = new LinkedList<SmaliCodeEntity>();
	
	protected ArrayList<Integer> registerMapping = new ArrayList<Integer>();
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isConstructor()
	{
		return isConstructor;
	}
	
	public void setConstructor(boolean isConstructor)
	{
		this.isConstructor = isConstructor;
	}

	public List<Param> getParams()
	{
		return params;
	}
	
	public void addParam(Param param)
	{
		this.params.add(param);
	}
	
	public String getReturnType()
	{
		return returnType;
	}
	
	public void setReturnType(String returnType)
	{
		this.returnType = returnType;
	}

	public int getLocals()
	{
		return locals;
	}

	public void setLocals(int locals)
	{
		this.locals = locals;
	}
	
	public List<SmaliCodeEntity> getCommands()
	{
		return commands;
	}
	
	public void addCommand(SmaliCodeEntity command)
	{
		this.commands.add(command);
	}
	
	public int mapParameterToRegister(int paramId) {
		return registerMapping.get(paramId);
	}
	
	public void buildRegisterMapping() {
		registerMapping.clear();
		int currIdx = this.locals;
		
		if(!isFlagSet(STATIC)) {
			registerMapping.add(currIdx);
			currIdx++;
		}
		
		for(Param param : params) {
			registerMapping.add(currIdx);
			if("J".equals(param.getType()) ||
					"D".equals(param.getType())) {
				currIdx += 2;
			} else {
				currIdx++;
			}
		}
	}
}
