package com.litecoding.smali2java.entity;

import java.util.LinkedList;
import java.util.List;

public class SmaliMethod extends SmaliEntity
{	
	protected String name = "";
	protected boolean isConstructor = false;
	protected List<Param> params = new LinkedList<Param>(); 
	protected String returnType = "";
	protected int locals = 0;
	protected List<CodeEntity> commands = new LinkedList<CodeEntity>();
	
	
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
	
	public List<CodeEntity> getCommands()
	{
		return commands;
	}
	
	public void addCommand(CodeEntity command)
	{
		this.commands.add(command);
	}
}
