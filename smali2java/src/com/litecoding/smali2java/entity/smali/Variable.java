package com.litecoding.smali2java.entity.smali;

public class Variable extends SmaliCodeEntity
{
	protected boolean isParameter = false;
	protected int id = 0;
	protected boolean isDestination = false;
	protected boolean isInit = false;
	protected String type = null;
		
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
	
	public boolean isDestination()
	{
		return isDestination;
	}
	
	public void setDestination(boolean isDestination)
	{
		this.isDestination = isDestination;
	}
	
	public boolean isInit()
	{
		return isInit;
	}
	
	public void setInit(boolean isInit)
	{
		this.isInit = isInit;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
