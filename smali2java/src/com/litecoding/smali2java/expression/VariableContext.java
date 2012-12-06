package com.litecoding.smali2java.expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VariableContext
{
	protected List<Expression> variables;

	public VariableContext()
	{
		variables = new ArrayList<Expression>(256);
		for(int i = 0; i < 256; i++)
			variables.add(null);
	}
	
	public List<Expression> getVariables()
	{
		return Collections.unmodifiableList(variables);
	}
	
	public void setVariable(int idx, Expression expression)
	{
		variables.add(idx, expression);
	}
	
	@Override
	public VariableContext clone() throws CloneNotSupportedException
	{
		VariableContext context = new VariableContext();
		
		int count = variables.size();
		for(int i = 0; i < count; i++)
			if(variables.get(i) != null)
				context.setVariable(i, variables.get(i).clone());
		
		return context;
	}
}
