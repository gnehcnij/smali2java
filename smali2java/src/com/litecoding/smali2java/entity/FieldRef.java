package com.litecoding.smali2java.entity;

public class FieldRef extends CodeEntity
{
	protected String className = "";
	protected String type = "";
	
	public String getClassName()
	{
		return className;
	}
	
	public void setClassName(String className)
	{
		this.className = className;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}	
}
