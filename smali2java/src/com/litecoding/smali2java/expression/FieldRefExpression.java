package com.litecoding.smali2java.expression;

public class FieldRefExpression extends AtomicExpression
{
	protected String className = "";
	protected String fieldName = "";
	protected String fieldType = "";	
	protected Expression object = null; //use null for 'this'

	public FieldRefExpression()
	{
		
	}
	
	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getFieldName()
	{
		return fieldName;
	}

	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}

	public String getFieldType()
	{
		return fieldType;
	}

	public void setFieldType(String fieldType)
	{
		this.fieldType = fieldType;
	}
	
	public Expression getObject()
	{
		return object;
	}

	public void setObject(Expression object)
	{
		this.object = object;
	}

	@Override
	public FieldRefExpression clone() throws CloneNotSupportedException
	{
		FieldRefExpression expr = (FieldRefExpression)super.clone();
		expr.className = className;
		expr.fieldName = fieldName;
		expr.fieldType = fieldType;
		return expr;
	}
}
