package com.litecoding.smali2java.expression;

public class ReturnExpression extends ComplexExpression
{
	protected Expression returnExpression = null;

	public ReturnExpression()
	{
		
	}
	
	public Expression getReturnExpression()
	{
		return returnExpression;
	}

	public void setReturnExpression(Expression returnExpression)
	{
		this.returnExpression = returnExpression;
	}
	
	@Override
	public ReturnExpression clone() throws CloneNotSupportedException
	{
		ReturnExpression expr = (ReturnExpression)super.clone();
		expr.returnExpression = returnExpression.clone();
		return expr;
	}
}
