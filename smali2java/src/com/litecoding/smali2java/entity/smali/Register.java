package com.litecoding.smali2java.entity.smali;

public class Register extends SmaliCodeEntity
{
	protected boolean isParameter = false;
	protected int id = 0;
	
	/**
	 * Id of vXX register, where pYY register was mapped.
	 * Used when isParameter == true only.
	 * Read more: {@link http://code.google.com/p/smali/wiki/Registers}
	 */
	protected int mappedId = 0;
	protected boolean isDestination = false;
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
	
	public int getMappedId()
	{
		return mappedId;
	}
	
	public void setMappedId(int mappedId)
	{
		this.mappedId = mappedId;
	}
		
	public boolean isDestination()
	{
		return isDestination;
	}
	
	public void setDestination(boolean isDestination)
	{
		this.isDestination = isDestination;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void mapRegister(SmaliMethod method) {
		if(!isParameter)
			return;
		
		mappedId = method.mapParameterToRegister(id);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
