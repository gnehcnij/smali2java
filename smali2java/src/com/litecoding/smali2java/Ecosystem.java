package com.litecoding.smali2java;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.litecoding.smali2java.entity.SmaliClass;
import com.litecoding.smali2java.parser.Parser;
import com.litecoding.smali2java.parser.Rule;
import com.litecoding.smali2java.renderer.ClassRenderer;

public class Ecosystem
{
	private static Ecosystem instance = null;
	
	private Map<String, SmaliClass> classes = new HashMap<String, SmaliClass>();
	
	protected Ecosystem()
	{
		
	}
	
	public static Ecosystem getInstance()
	{
		if(instance == null)
			instance = new Ecosystem();
		return instance;
	}
	
	public Map<String, SmaliClass> getClasses()
	{
		return classes;
	}
	
	public void processFile(String src, String dst) throws Exception
	{
		File srcFile = new File(src);
		
		Rule classrule = Parser.parse("smali", srcFile);
		SmaliClass smaliClass = (SmaliClass)classrule.accept(new SmaliClassBuilder());
		classes.put(smaliClass.getClassName(), smaliClass);
		
		System.out.println(ClassRenderer.renderObject(smaliClass));
	}
	
}
