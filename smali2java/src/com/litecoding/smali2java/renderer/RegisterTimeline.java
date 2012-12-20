package com.litecoding.smali2java.renderer;

import java.util.ArrayList;
import java.util.List;

import com.litecoding.smali2java.entity.smali.Register.RegisterInfo;
import com.litecoding.smali2java.entity.smali.SmaliMethod;

public class RegisterTimeline {
	private boolean isInitialized = false;
	
	private int sliceLength = 0;
	private int linesCount = 0;
	
	private ArrayList<ArrayList<RegisterInfo>> timeline = null;
	
	public RegisterTimeline() {
		this.isInitialized = false;
	}
	
	public RegisterTimeline(SmaliMethod method, int linesCount) {
		this.isInitialized = true;
		init(method, linesCount);
	}
	
	public void init(SmaliMethod method, int linesCount) {
		if(isInitialized)
			return;
		
		this.linesCount = linesCount;
		
		this.sliceLength = method.getRegisters();
		
		this.timeline = new ArrayList<ArrayList<RegisterInfo>>(linesCount);
		for(int i = 0; i < linesCount; i++) {
			ArrayList<RegisterInfo> slice = new ArrayList<RegisterInfo>(sliceLength);
			this.timeline.add(slice);
			for(int j = 0; j < sliceLength; j++)
				slice.add(new RegisterInfo());
		}
	}
	
	public boolean isInitialized() {
		return isInitialized;
	}
	
	public int getSliceLength() {
		return sliceLength;
	}
	
	public int getLinesCount() {
		return linesCount;
	}
	
	public List<? extends List<RegisterInfo>> getTimeline() {
		return timeline;
	}
	
	public List<RegisterInfo> getSlice(int line) {
		return timeline.get(line);
	}
	
	public RegisterInfo getRegister(int line, int register) {
		return timeline.get(line).get(register);
	}
	
}
