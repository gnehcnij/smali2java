package com.litecoding.smali2java.entity.smali;

public class RegisterInfo {
	public boolean isUsedAs64bitRegister = false;
	public boolean isUsedAs64bitMasterRegister = false;
	public String type = "";
	public boolean isThis = false;
	public boolean isRead = false;
	public boolean isWritten = false;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		if(isRead)
			builder.append("r");
		else
			builder.append("-");
		
		if(isWritten)
			builder.append("w");
		else
			builder.append("-");
		
		builder.append(" ");
		
		if(isUsedAs64bitRegister) {
			builder.append("64");
			if(isUsedAs64bitMasterRegister)
				builder.append("M");
			else
				builder.append("S");
			
			builder.append(" ");
		}
		
		builder.append(type);
		
		if(isThis) {
			builder.append(" (this)");
		}
		
		return builder.toString();
	}
}