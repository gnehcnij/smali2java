package com.litecoding.smali2java.entity;

/**
 * SmaliMethod parameter class
 * @author Dmitry S. Vorobiev
 *
 */
public class Param
{
	private String type = "";
	private String name = "";
	
	public Param()
	{
		
	}
	
	public Param(String type)
	{
		this.type = type;
	}
	
	public Param(String type, String name)
	{
		this.type = type;
		this.name = name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
