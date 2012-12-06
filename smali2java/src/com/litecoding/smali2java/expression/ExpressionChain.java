package com.litecoding.smali2java.expression;

import java.util.LinkedList;
import java.util.List;

public class ExpressionChain {
	public boolean isPlain; //is this chain contain no goto's
	public final List<ExpressionChain> subchains = new LinkedList<ExpressionChain>(); //ignored whed isPlain == true
	public final List<ExpressionChain> inboundChains = new LinkedList<ExpressionChain>();
	public String label;
	public final List<Expression> expressions = new LinkedList<Expression>();
	public ExpressionChain unconditionalOutboundChain;
	public ExpressionChain positiveOutboundChain;
	public ExpressionChain negativeOutboundChain;
	public Expression outboundCondition;
}
