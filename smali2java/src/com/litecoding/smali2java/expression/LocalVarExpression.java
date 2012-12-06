package com.litecoding.smali2java.expression;

public class LocalVarExpression extends AtomicExpression
{
	protected int localVarIdx = 0;
	
	public LocalVarExpression()
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
	
	@Override
	public LocalVarExpression clone() throws CloneNotSupportedException
	{
		LocalVarExpression expr = (LocalVarExpression)super.clone();
		expr.localVarIdx = localVarIdx;
		return expr;
	}
}
