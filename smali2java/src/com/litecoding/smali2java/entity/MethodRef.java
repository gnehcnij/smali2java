package com.litecoding.smali2java.entity;

import java.util.LinkedList;
import java.util.List;

public class MethodRef extends CodeEntity
{
	protected String className = "";	
	protected boolean isConstructor = false;
	protected List<Param> params = new LinkedList<Param>(); 
	protected String returnType = "";
	
	public String getClassName()
	{
		return className;
	}
	
	public void setClassName(String className)
	{
		this.className = className;
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
}
