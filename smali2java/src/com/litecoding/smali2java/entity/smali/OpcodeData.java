package com.litecoding.smali2java.entity.smali;

import java.util.HashMap;
import java.util.Map;

import dalvik.bytecode.Opcodes;

public class OpcodeData
{
	public static final byte TYPE_UNUSED    = -1;
	public static final byte TYPE_OTHER     = 0;
	public static final byte TYPE_MOVE      = 1;
	public static final byte TYPE_RETURN    = 2;
	public static final byte TYPE_CONST     = 3;
	public static final byte TYPE_NEW       = 4;
	public static final byte TYPE_GOTO      = 5;
	public static final byte TYPE_CMP       = 6;
	public static final byte TYPE_CONDITION = 7;
	public static final byte TYPE_GET       = 8;
	public static final byte TYPE_PUT       = 9;
	public static final byte TYPE_INVOKE    = 10;
	public static final byte TYPE_MATH      = 11;
	
	public static final OpcodeData UNDEFINED_OPCODE_DATA = new OpcodeData("", 0, TYPE_UNUSED); 
	
	private static Map<String, OpcodeData> data = new HashMap<String, OpcodeData>();
	private String name = "";
	private int opcode = 0;
	private byte type = TYPE_UNUSED;
	
	static
	{
		putOpcodeData(new OpcodeData("nop", Opcodes.OP_NOP, TYPE_OTHER));
		putOpcodeData(new OpcodeData("move", Opcodes.OP_MOVE, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move/from16", Opcodes.OP_MOVE_FROM16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move/16", Opcodes.OP_MOVE_16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-wide", Opcodes.OP_MOVE_WIDE, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-wide/from16", Opcodes.OP_MOVE_WIDE_FROM16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-wide/16", Opcodes.OP_MOVE_WIDE_16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-object", Opcodes.OP_MOVE_OBJECT, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-object/from16", Opcodes.OP_MOVE_OBJECT_FROM16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-object/16", Opcodes.OP_MOVE_OBJECT_16, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-result", Opcodes.OP_MOVE_RESULT, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-result-wide", Opcodes.OP_MOVE_RESULT_WIDE, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-result-object", Opcodes.OP_MOVE_RESULT_OBJECT, TYPE_MOVE));
		putOpcodeData(new OpcodeData("move-exception", Opcodes.OP_MOVE_EXCEPTION, TYPE_MOVE));
		putOpcodeData(new OpcodeData("return-void", Opcodes.OP_RETURN_VOID, TYPE_RETURN));
		putOpcodeData(new OpcodeData("return", Opcodes.OP_RETURN, TYPE_RETURN));
		putOpcodeData(new OpcodeData("return-wide", Opcodes.OP_RETURN_WIDE, TYPE_RETURN));
		putOpcodeData(new OpcodeData("return-object", Opcodes.OP_RETURN_OBJECT, TYPE_RETURN));
		putOpcodeData(new OpcodeData("const/4", Opcodes.OP_CONST_4, TYPE_CONST));
		putOpcodeData(new OpcodeData("const/16", Opcodes.OP_CONST_16, TYPE_CONST));
		putOpcodeData(new OpcodeData("const", Opcodes.OP_CONST, TYPE_CONST));
		putOpcodeData(new OpcodeData("const/high16", Opcodes.OP_CONST_HIGH16, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-wide/16", Opcodes.OP_CONST_WIDE_16, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-wide/32", Opcodes.OP_CONST_WIDE_32, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-wide", Opcodes.OP_CONST_WIDE, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-wide/high16", Opcodes.OP_CONST_WIDE_HIGH16, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-string", Opcodes.OP_CONST_STRING, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-string-jumbo", Opcodes.OP_CONST_STRING_JUMBO, TYPE_CONST));
		putOpcodeData(new OpcodeData("const-class", Opcodes.OP_CONST_CLASS, TYPE_CONST));
		putOpcodeData(new OpcodeData("monitor-enter", Opcodes.OP_MONITOR_ENTER, TYPE_OTHER));
		putOpcodeData(new OpcodeData("monitor-exit", Opcodes.OP_MONITOR_EXIT, TYPE_OTHER));
		putOpcodeData(new OpcodeData("check-cast", Opcodes.OP_CHECK_CAST, TYPE_OTHER));
		putOpcodeData(new OpcodeData("instance-of", Opcodes.OP_INSTANCE_OF, TYPE_OTHER));
		putOpcodeData(new OpcodeData("array-length", Opcodes.OP_ARRAY_LENGTH, TYPE_OTHER));
		putOpcodeData(new OpcodeData("new-instance", Opcodes.OP_NEW_INSTANCE, TYPE_NEW));
		putOpcodeData(new OpcodeData("new-array", Opcodes.OP_NEW_ARRAY, TYPE_NEW));
		putOpcodeData(new OpcodeData("filled-new-array", Opcodes.OP_FILLED_NEW_ARRAY, TYPE_NEW));
		putOpcodeData(new OpcodeData("filled-new-array-range", Opcodes.OP_FILLED_NEW_ARRAY_RANGE, TYPE_NEW));
		putOpcodeData(new OpcodeData("fill-array-data", Opcodes.OP_FILL_ARRAY_DATA, TYPE_OTHER));
		putOpcodeData(new OpcodeData("throw", Opcodes.OP_THROW, TYPE_OTHER));
		putOpcodeData(new OpcodeData("goto", Opcodes.OP_GOTO, TYPE_GOTO));
		putOpcodeData(new OpcodeData("goto/16", Opcodes.OP_GOTO_16, TYPE_GOTO));
		putOpcodeData(new OpcodeData("goto/32", Opcodes.OP_GOTO_32, TYPE_GOTO));
		putOpcodeData(new OpcodeData("packed-switch", Opcodes.OP_PACKED_SWITCH, TYPE_UNUSED));
		putOpcodeData(new OpcodeData("sparse-switch", Opcodes.OP_SPARSE_SWITCH, TYPE_UNUSED));
		putOpcodeData(new OpcodeData("cmpl-float", Opcodes.OP_CMPL_FLOAT, TYPE_CMP));
		putOpcodeData(new OpcodeData("cmpg-float", Opcodes.OP_CMPG_FLOAT, TYPE_CMP));
		putOpcodeData(new OpcodeData("cmpl-double", Opcodes.OP_CMPL_DOUBLE, TYPE_CMP));
		putOpcodeData(new OpcodeData("cmpg-double", Opcodes.OP_CMPG_DOUBLE, TYPE_CMP));
		putOpcodeData(new OpcodeData("cmp-long", Opcodes.OP_CMP_LONG, TYPE_CMP));
		putOpcodeData(new OpcodeData("if-eq", Opcodes.OP_IF_EQ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-ne", Opcodes.OP_IF_NE, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-lt", Opcodes.OP_IF_LT, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-ge", Opcodes.OP_IF_GE, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-gt", Opcodes.OP_IF_GT, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-le", Opcodes.OP_IF_LE, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-eqz", Opcodes.OP_IF_EQZ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-nez", Opcodes.OP_IF_NEZ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-ltz", Opcodes.OP_IF_LTZ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-gez", Opcodes.OP_IF_GEZ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-gtz", Opcodes.OP_IF_GTZ, TYPE_CONDITION));
		putOpcodeData(new OpcodeData("if-lez", Opcodes.OP_IF_LEZ, TYPE_CONDITION));
	    /* 3e-43 unused */
		putOpcodeData(new OpcodeData("aget", Opcodes.OP_AGET, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-wide", Opcodes.OP_AGET_WIDE, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-object", Opcodes.OP_AGET_OBJECT, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-boolean", Opcodes.OP_AGET_BOOLEAN, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-byte", Opcodes.OP_AGET_BYTE, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-char", Opcodes.OP_AGET_CHAR, TYPE_GET));
		putOpcodeData(new OpcodeData("aget-short", Opcodes.OP_AGET_SHORT, TYPE_GET));
		putOpcodeData(new OpcodeData("aput", Opcodes.OP_APUT, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-wide", Opcodes.OP_APUT_WIDE, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-object", Opcodes.OP_APUT_OBJECT, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-boolean", Opcodes.OP_APUT_BOOLEAN, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-byte", Opcodes.OP_APUT_BYTE, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-char", Opcodes.OP_APUT_CHAR, TYPE_PUT));
		putOpcodeData(new OpcodeData("aput-short", Opcodes.OP_APUT_SHORT, TYPE_PUT));
		putOpcodeData(new OpcodeData("iget", Opcodes.OP_IGET, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-wide", Opcodes.OP_IGET_WIDE, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-object", Opcodes.OP_IGET_OBJECT, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-boolean", Opcodes.OP_IGET_BOOLEAN, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-byte", Opcodes.OP_IGET_BYTE, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-char", Opcodes.OP_IGET_CHAR, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-short", Opcodes.OP_IGET_SHORT, TYPE_GET));
		putOpcodeData(new OpcodeData("iput", Opcodes.OP_IPUT, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-wide", Opcodes.OP_IPUT_WIDE, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-object", Opcodes.OP_IPUT_OBJECT, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-boolean", Opcodes.OP_IPUT_BOOLEAN, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-byte", Opcodes.OP_IPUT_BYTE, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-char", Opcodes.OP_IPUT_CHAR, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-short", Opcodes.OP_IPUT_SHORT, TYPE_PUT));
		putOpcodeData(new OpcodeData("sget", Opcodes.OP_SGET, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-wide", Opcodes.OP_SGET_WIDE, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-object", Opcodes.OP_SGET_OBJECT, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-boolean", Opcodes.OP_SGET_BOOLEAN, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-byte", Opcodes.OP_SGET_BYTE, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-char", Opcodes.OP_SGET_CHAR, TYPE_GET));
		putOpcodeData(new OpcodeData("sget-short", Opcodes.OP_SGET_SHORT, TYPE_GET));
		putOpcodeData(new OpcodeData("sput", Opcodes.OP_SPUT, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-wide", Opcodes.OP_SPUT_WIDE, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-object", Opcodes.OP_SPUT_OBJECT, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-boolean", Opcodes.OP_SPUT_BOOLEAN, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-byte", Opcodes.OP_SPUT_BYTE, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-char", Opcodes.OP_SPUT_CHAR, TYPE_PUT));
		putOpcodeData(new OpcodeData("sput-short", Opcodes.OP_SPUT_SHORT, TYPE_PUT));
		putOpcodeData(new OpcodeData("invoke-virtual", Opcodes.OP_INVOKE_VIRTUAL, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-super", Opcodes.OP_INVOKE_SUPER, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-direct", Opcodes.OP_INVOKE_DIRECT, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-static", Opcodes.OP_INVOKE_STATIC, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-interface", Opcodes.OP_INVOKE_INTERFACE, TYPE_INVOKE));
	    /* 73 unused */
		putOpcodeData(new OpcodeData("invoke-virtual/range", Opcodes.OP_INVOKE_VIRTUAL_RANGE, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-super/range", Opcodes.OP_INVOKE_SUPER_RANGE, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-direct/range", Opcodes.OP_INVOKE_DIRECT_RANGE, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-static/range", Opcodes.OP_INVOKE_STATIC_RANGE, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-interface/range", Opcodes.OP_INVOKE_INTERFACE_RANGE, TYPE_INVOKE));
	    /* 79-7a unused */
		putOpcodeData(new OpcodeData("neg-int", Opcodes.OP_NEG_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("not-int", Opcodes.OP_NOT_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("neg-long", Opcodes.OP_NEG_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("not-long", Opcodes.OP_NOT_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("neg-float", Opcodes.OP_NEG_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("neg-double", Opcodes.OP_NEG_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-long", Opcodes.OP_INT_TO_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-float", Opcodes.OP_INT_TO_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-double", Opcodes.OP_INT_TO_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("long-to-int", Opcodes.OP_LONG_TO_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("long-to-float", Opcodes.OP_LONG_TO_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("long-to-double", Opcodes.OP_LONG_TO_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("float-to-int", Opcodes.OP_FLOAT_TO_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("float-to-long", Opcodes.OP_FLOAT_TO_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("float-to-double", Opcodes.OP_FLOAT_TO_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("double-to-int", Opcodes.OP_DOUBLE_TO_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("double-to-long", Opcodes.OP_DOUBLE_TO_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("double-to-float", Opcodes.OP_DOUBLE_TO_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-byte", Opcodes.OP_INT_TO_BYTE, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-char", Opcodes.OP_INT_TO_CHAR, TYPE_MATH));
		putOpcodeData(new OpcodeData("int-to-short", Opcodes.OP_INT_TO_SHORT, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-int", Opcodes.OP_ADD_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-int", Opcodes.OP_SUB_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-int", Opcodes.OP_MUL_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-int", Opcodes.OP_DIV_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-int", Opcodes.OP_REM_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-int", Opcodes.OP_AND_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-int", Opcodes.OP_OR_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-int", Opcodes.OP_XOR_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("shl-int", Opcodes.OP_SHL_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("shr-int", Opcodes.OP_SHR_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("ushr-int", Opcodes.OP_USHR_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-long", Opcodes.OP_ADD_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-long", Opcodes.OP_SUB_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-long", Opcodes.OP_MUL_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-long", Opcodes.OP_DIV_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-long", Opcodes.OP_REM_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-long", Opcodes.OP_AND_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-long", Opcodes.OP_OR_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-long", Opcodes.OP_XOR_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("shl-long", Opcodes.OP_SHL_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("shr-long", Opcodes.OP_SHR_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("ushr-long", Opcodes.OP_USHR_LONG, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-float", Opcodes.OP_ADD_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-float", Opcodes.OP_SUB_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-float", Opcodes.OP_MUL_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-float", Opcodes.OP_DIV_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-float", Opcodes.OP_REM_FLOAT, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-double", Opcodes.OP_ADD_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-double", Opcodes.OP_SUB_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-double", Opcodes.OP_MUL_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-double", Opcodes.OP_DIV_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-double", Opcodes.OP_REM_DOUBLE, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-int/2addr", Opcodes.OP_ADD_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-int/2addr", Opcodes.OP_SUB_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-int/2addr", Opcodes.OP_MUL_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-int/2addr", Opcodes.OP_DIV_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-int/2addr", Opcodes.OP_REM_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-int/2addr", Opcodes.OP_AND_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-int/2addr", Opcodes.OP_OR_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-int/2addr", Opcodes.OP_XOR_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("shl-int/2addr", Opcodes.OP_SHL_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("shr-int/2addr", Opcodes.OP_SHR_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("ushr-int/2addr", Opcodes.OP_USHR_INT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-long/2addr", Opcodes.OP_ADD_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-long/2addr", Opcodes.OP_SUB_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-long/2addr", Opcodes.OP_MUL_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-long/2addr", Opcodes.OP_DIV_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-long/2addr", Opcodes.OP_REM_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-long/2addr", Opcodes.OP_AND_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-long/2addr", Opcodes.OP_OR_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-long/2addr", Opcodes.OP_XOR_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("shl-long/2addr", Opcodes.OP_SHL_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("shr-long/2addr", Opcodes.OP_SHR_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("ushr-long/2addr", Opcodes.OP_USHR_LONG_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-float/2addr", Opcodes.OP_ADD_FLOAT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-float/2addr", Opcodes.OP_SUB_FLOAT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-float/2addr", Opcodes.OP_MUL_FLOAT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-float/2addr", Opcodes.OP_DIV_FLOAT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-float/2addr", Opcodes.OP_REM_FLOAT_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-double/2addr", Opcodes.OP_ADD_DOUBLE_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("sub-double/2addr", Opcodes.OP_SUB_DOUBLE_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-double/2addr", Opcodes.OP_MUL_DOUBLE_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-double/2addr", Opcodes.OP_DIV_DOUBLE_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-double/2addr", Opcodes.OP_REM_DOUBLE_2ADDR, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-int/lit16", Opcodes.OP_ADD_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("rsub-int", Opcodes.OP_RSUB_INT, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-int/lit16", Opcodes.OP_MUL_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-int/lit16", Opcodes.OP_DIV_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-int/lit16", Opcodes.OP_REM_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-int/lit16", Opcodes.OP_AND_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-int/lit16", Opcodes.OP_OR_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-int/lit16", Opcodes.OP_XOR_INT_LIT16, TYPE_MATH));
		putOpcodeData(new OpcodeData("add-int/lit8", Opcodes.OP_ADD_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("rsub-int/lit8", Opcodes.OP_RSUB_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("mul-int/lit8", Opcodes.OP_MUL_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("div-int/lit8", Opcodes.OP_DIV_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("rem-int/lit8", Opcodes.OP_REM_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("and-int/lit8", Opcodes.OP_AND_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("or-int/lit8", Opcodes.OP_OR_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("xor-int/lit8", Opcodes.OP_XOR_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("shl-int/lit8", Opcodes.OP_SHL_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("shr-int/lit8", Opcodes.OP_SHR_INT_LIT8, TYPE_MATH));
		putOpcodeData(new OpcodeData("ushr-int/lit8", Opcodes.OP_USHR_INT_LIT8, TYPE_MATH));
	    /* e3-e7 unused */
	    /*
	     * The rest of these are either generated by dexopt for optimized
	     * code, or inserted by the VM at runtime.  They are never generated
	     * by "dx".
	     */
		putOpcodeData(new OpcodeData("iget-wide-volatile", Opcodes.OP_IGET_WIDE_VOLATILE, TYPE_GET));
		putOpcodeData(new OpcodeData("iput-wide-volatile", Opcodes.OP_IPUT_WIDE_VOLATILE, TYPE_PUT));
		putOpcodeData(new OpcodeData("sget-wide-volatile", Opcodes.OP_SGET_WIDE_VOLATILE, TYPE_GET));
		putOpcodeData(new OpcodeData("sput-wide-volatile", Opcodes.OP_SPUT_WIDE_VOLATILE, TYPE_PUT));
		putOpcodeData(new OpcodeData("breakpoint", Opcodes.OP_BREAKPOINT, TYPE_OTHER));
		putOpcodeData(new OpcodeData("throw-verification-error", Opcodes.OP_THROW_VERIFICATION_ERROR, TYPE_OTHER));
		putOpcodeData(new OpcodeData("execute-inline", Opcodes.OP_EXECUTE_INLINE, TYPE_OTHER));
		putOpcodeData(new OpcodeData("execute-inline-range", Opcodes.OP_EXECUTE_INLINE_RANGE, TYPE_OTHER));
		putOpcodeData(new OpcodeData("invoke-direct-empty", Opcodes.OP_INVOKE_DIRECT_EMPTY, TYPE_INVOKE));
	    /* f1 unused (OP_INVOKE_DIRECT_EMPTY_RANGE?) */
		putOpcodeData(new OpcodeData("iget-quick", Opcodes.OP_IGET_QUICK, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-wide-quick", Opcodes.OP_IGET_WIDE_QUICK, TYPE_GET));
		putOpcodeData(new OpcodeData("iget-object-quick", Opcodes.OP_IGET_OBJECT_QUICK, TYPE_GET));
		putOpcodeData(new OpcodeData("iput-quick", Opcodes.OP_IPUT_QUICK, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-wide-quick", Opcodes.OP_IPUT_WIDE_QUICK, TYPE_PUT));
		putOpcodeData(new OpcodeData("iput-object-quick", Opcodes.OP_IPUT_OBJECT_QUICK, TYPE_PUT));
		putOpcodeData(new OpcodeData("invoke-virtual-quick", Opcodes.OP_INVOKE_VIRTUAL_QUICK, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-virtual-quick-range", Opcodes.OP_INVOKE_VIRTUAL_QUICK_RANGE, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-super-quick", Opcodes.OP_INVOKE_SUPER_QUICK, TYPE_INVOKE));
		putOpcodeData(new OpcodeData("invoke-super-quick-range", Opcodes.OP_INVOKE_SUPER_QUICK_RANGE, TYPE_INVOKE));
	    /* fc unused (OP_INVOKE_DIRECT_QUICK?) */
	    /* fd unused (OP_INVOKE_DIRECT_QUICK_RANGE?) */
	    /* fe unused (OP_INVOKE_INTERFACE_QUICK?) */
	    /* ff unused (OP_INVOKE_INTERFACE_QUICK_RANGE?) */
	}
	
	private OpcodeData(String name, int opcode, byte type)
	{
		this.name = name;
		this.opcode = opcode;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public int getOpcode()
	{
		return opcode;
	}
	
	public int getType()
	{
		return type;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		switch(type) {
		case TYPE_UNUSED: {
			builder.append("type: UNUSED ");
			break;
		}
		case TYPE_OTHER: {
			builder.append("type: OTHER ");
			break;
		}
		case TYPE_MOVE: {
			builder.append("type: MOVE ");
			break;
		}
		case TYPE_RETURN: {
			builder.append("type: RETURN ");
			break;
		}
		case TYPE_CONST: {
			builder.append("type: CONST ");
			break;
		}
		case TYPE_NEW: {
			builder.append("type: NEW ");
			break;
		}
		case TYPE_GOTO: {
			builder.append("type: GOTO ");
			break;
		}
		case TYPE_CMP: {
			builder.append("type: CMP ");
			break;
		}
		case TYPE_CONDITION: {
			builder.append("type: CONDITION ");
			break;
		}
		case TYPE_GET: {
			builder.append("type: GET ");
			break;
		}
		case TYPE_PUT: {
			builder.append("type: PUT ");
			break;
		}
		case TYPE_INVOKE: {
			builder.append("type: INVOKE ");
			break;
		}
		case TYPE_MATH: {
			builder.append("type: MATH ");
			break;
		}
		default: {
			builder.append("type: [UNKNOWN] ");
		}
		}
		builder.append(name);
		return builder.toString();
	}

	public static OpcodeData getOpcodeData(String name)
	{
		if(name == null) return null;
		OpcodeData retVal = data.get(name.toLowerCase());
		if(retVal == null) retVal = UNDEFINED_OPCODE_DATA;
		return retVal;
	}
	
	private static void putOpcodeData(OpcodeData opcodeData)
	{
		data.put(opcodeData.getName(), opcodeData);
	}
}
