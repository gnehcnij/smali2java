package com.litecoding.smali2java.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a piece of code from a method body.
 * 
 * @author Dmitry S. Vorobiev
 *
 */
public abstract class CodeEntity
{
	protected String name = "";
	protected List<CodeEntity> arguments = new LinkedList<CodeEntity>();

	protected CodeEntity()
	{
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<CodeEntity> getArguments()
	{
		return arguments;
	}

	public void addArgument(CodeEntity argument)
	{
		this.arguments.add(argument);
	}
}
