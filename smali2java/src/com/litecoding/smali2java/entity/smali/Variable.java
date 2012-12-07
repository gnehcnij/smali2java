package com.litecoding.smali2java.entity.smali;

public class Variable extends SmaliCodeEntity
{
	protected boolean isParameter = false;
	protected int id = 0;
		
	@Override
	public void setName(String name)
	{
		super.setName(name);
		if(name.startsWith("p"))
			isParameter = true;
		else
			isParameter = false;
		
		id = Integer.parseInt(name.substring(1));
	}
	
	public boolean isParameter()
	{
		return isParameter;
	}
	
	public void setParameter(boolean isParameter)
	{
		this.isParameter = isParameter;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
