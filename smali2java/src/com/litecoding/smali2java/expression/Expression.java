package com.litecoding.smali2java.expression;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Expression implements Cloneable
{
	protected boolean hasLabel     = false;
	protected boolean hasCondition = false;
	protected List<Expression> nestedExpressions = new LinkedList<Expression>();
	
	public Expression()
	{
		
	}
	
	public boolean isHasLabel()
	{
		return hasLabel;
	}
	
	public void setHasLabel(boolean hasLabel)
	{
		this.hasLabel = hasLabel;
	}
	
	public boolean isHasCondition()
	{
		return hasCondition;
	}
	
	public void setHasCondition(boolean hasCondition)
	{
		this.hasCondition = hasCondition;
	}
	
	public List<Expression> getNestedExpressions()
	{
		return Collections.unmodifiableList(nestedExpressions);
	}
	
	@Override
	public Expression clone() throws CloneNotSupportedException
	{
		Expression expr = (Expression)super.clone();
		expr.hasCondition = hasCondition;
		expr.hasLabel = hasLabel;
		for(Expression nestedExpr : nestedExpressions)
			expr.nestedExpressions.add(nestedExpr.clone());
		return expr;
	}
}
