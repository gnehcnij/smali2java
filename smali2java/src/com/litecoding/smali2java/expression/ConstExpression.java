package com.litecoding.smali2java.expression;

public class ConstExpression extends RightSideExpression
{
	protected int localVarIdx = 0;
	private String value = "";
	
	public ConstExpression()
	{
		
	}
	
	public int getLocalVarIdx()
	{
		return localVarIdx;
	}
	
	public void setLocalVarIdx(int localVarIdx)
	{
		this.localVarIdx = localVarIdx;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}

	@Override
	public ConstExpression clone() throws CloneNotSupportedException
	{
		ConstExpression expr = (ConstExpression)super.clone();
		expr.localVarIdx = localVarIdx;
		expr.value = value;
		return expr;
	}
}
