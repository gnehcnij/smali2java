package com.litecoding.smali2java.entity;

public class Instruction extends CodeEntity
{
	protected OpcodeData opcodeData = OpcodeData.UNDEFINED_OPCODE_DATA;
	
	@Override
	public void setName(String name)
	{
		super.setName(name);
		this.opcodeData = OpcodeData.getOpcodeData(name);
	}
	
	public OpcodeData getOpcodeData()
	{
		return this.opcodeData;
	}
}
