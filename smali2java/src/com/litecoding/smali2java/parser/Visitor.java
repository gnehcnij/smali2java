/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Fri Apr 12 10:40:21 MUT 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

public interface Visitor {
    public Object visit(Rule_padding rule);

    public Object visit(Rule_optPadding rule);

    public Object visit(Rule_widePadding rule);

    public Object visit(Rule_optWidePadding rule);

    public Object visit(Rule_listSeparator rule);

    public Object visit(Rule_escSymbol rule);

    public Object visit(Rule_qualifier rule);

    public Object visit(Rule_className rule);

    public Object visit(Rule_commentSequence rule);

    public Object visit(Rule_comment rule);

    public Object visit(Rule_emptyLine rule);

    public Object visit(Rule_skipLine rule);

    public Object visit(Rule_fileName rule);

    public Object visit(Rule_accessMode rule);

    public Object visit(Rule_interfaceMode rule);

    public Object visit(Rule_type rule);

    public Object visit(Rule_boolValue rule);

    public Object visit(Rule_intDecValue rule);

    public Object visit(Rule_intHexValue rule);

    public Object visit(Rule_intValue rule);

    public Object visit(Rule_strValue rule);

    public Object visit(Rule_value rule);

    public Object visit(Rule_codeLabel rule);

    public Object visit(Rule_codeRegisterP rule);

    public Object visit(Rule_codeRegisterP64 rule);

    public Object visit(Rule_codeRegisterV rule);

    public Object visit(Rule_codeRegisterV64 rule);

    public Object visit(Rule_codeRegisterVDst rule);

    public Object visit(Rule_codeRegisterV64Dst rule);

    public Object visit(Rule_codeRegister rule);

    public Object visit(Rule_codeRegister64 rule);

    public Object visit(Rule_codeRegisterRet rule);

    public Object visit(Rule_codeRegisterRet64 rule);

    public Object visit(Rule_codeRegisterGroup rule);

    public Object visit(Rule_dirAnnotation rule);

    public Object visit(Rule_dirClass rule);

    public Object visit(Rule_dirEnd rule);

    public Object visit(Rule_dirEndAnnotation rule);

    public Object visit(Rule_dirEndField rule);

    public Object visit(Rule_dirEndMethod rule);

    public Object visit(Rule_dirEndSubannotation rule);

    public Object visit(Rule_dirImplements rule);

    public Object visit(Rule_dirField rule);

    public Object visit(Rule_dirLocal rule);

    public Object visit(Rule_dirMethod rule);

    public Object visit(Rule_dirRegisters rule);

    public Object visit(Rule_dirSubannotation rule);

    public Object visit(Rule_dirSuper rule);

    public Object visit(Rule_dirSource rule);

    public Object visit(Rule_smali rule);

    public Object visit(Rule_todoStubLine rule);

    public Object visit(Rule_classHeader rule);

    public Object visit(Rule_classClass rule);

    public Object visit(Rule_classSuper rule);

    public Object visit(Rule_classSource rule);

    public Object visit(Rule_classImplements rule);

    public Object visit(Rule_methodLocals rule);

    public Object visit(Rule_methodParam rule);

    public Object visit(Rule_methodPrologue rule);

    public Object visit(Rule_methodLine rule);

    public Object visit(Rule_methodRegisters rule);

    public Object visit(Rule_methodLocal rule);

    public Object visit(Rule_annotation rule);

    public Object visit(Rule_annotationVisibility rule);

    public Object visit(Rule_annotationBody rule);

    public Object visit(Rule_classField rule);

    public Object visit(Rule_classMethod rule);

    public Object visit(Rule_classConstructorName rule);

    public Object visit(Rule_classMethodProto rule);

    public Object visit(Rule_methodBody rule);

    public Object visit(Rule_label rule);

    public Object visit(Rule_smaliConstructorName rule);

    public Object visit(Rule_smaliClassRef rule);

    public Object visit(Rule_smaliFieldRef rule);

    public Object visit(Rule_smaliMethodRef rule);

    public Object visit(Rule_HTAB rule);

    public Object visit(Rule_CR rule);

    public Object visit(Rule_LF rule);

    public Object visit(Rule_SP rule);

    public Object visit(Rule_CRLF rule);

    public Object visit(Rule_QUOT rule);

    public Object visit(Rule_HASH rule);

    public Object visit(Rule_COMMA rule);

    public Object visit(Rule_DOT rule);

    public Object visit(Rule_COLON rule);

    public Object visit(Rule_SEMICOLON rule);

    public Object visit(Rule_EQ rule);

    public Object visit(Rule_UNDERSCORE rule);

    public Object visit(Rule_ALPHA rule);

    public Object visit(Rule_DIGIT rule);

    public Object visit(Rule_HEXDIG rule);

    public Object visit(Rule_VCHAR rule);

    public Object visit(Rule_cmdAny rule);

    public Object visit(Rule_cmdAddFloat rule);

    public Object visit(Rule_cmdAddFloat2addr rule);

    public Object visit(Rule_cmdAddDouble rule);

    public Object visit(Rule_cmdAddDouble2addr rule);

    public Object visit(Rule_cmdAddInt rule);

    public Object visit(Rule_cmdAddInt2addr rule);

    public Object visit(Rule_cmdAddIntLit16 rule);

    public Object visit(Rule_cmdAddIntLit8 rule);

    public Object visit(Rule_cmdAddLong rule);

    public Object visit(Rule_cmdAddLong2addr rule);

    public Object visit(Rule_cmdAndInt rule);

    public Object visit(Rule_cmdAndInt2addr rule);

    public Object visit(Rule_cmdAndIntLit16 rule);

    public Object visit(Rule_cmdAndIntLit8 rule);

    public Object visit(Rule_cmdAndLong rule);

    public Object visit(Rule_cmdAndLong2addr rule);

    public Object visit(Rule_cmdAget rule);

    public Object visit(Rule_cmdAgetBoolean rule);

    public Object visit(Rule_cmdAgetByte rule);

    public Object visit(Rule_cmdAgetChar rule);

    public Object visit(Rule_cmdAgetObject rule);

    public Object visit(Rule_cmdAgetShort rule);

    public Object visit(Rule_cmdAgetWide rule);

    public Object visit(Rule_cmdAput rule);

    public Object visit(Rule_cmdAputBoolean rule);

    public Object visit(Rule_cmdAputByte rule);

    public Object visit(Rule_cmdAputChar rule);

    public Object visit(Rule_cmdAputObject rule);

    public Object visit(Rule_cmdAputShort rule);

    public Object visit(Rule_cmdAputWide rule);

    public Object visit(Rule_cmdArrayLength rule);

    public Object visit(Rule_cmdCheckCast rule);

    public Object visit(Rule_cmdCmpgDouble rule);

    public Object visit(Rule_cmdCmpgFloat rule);

    public Object visit(Rule_cmdCmplDouble rule);

    public Object visit(Rule_cmdCmplFloat rule);

    public Object visit(Rule_cmdCmpLong rule);

    public Object visit(Rule_cmdConst rule);

    public Object visit(Rule_cmdConst16 rule);

    public Object visit(Rule_cmdConst4 rule);

    public Object visit(Rule_cmdConstClass rule);

    public Object visit(Rule_cmdConstHigh16 rule);

    public Object visit(Rule_cmdConstString rule);

    public Object visit(Rule_cmdConstStringJumbo rule);

    public Object visit(Rule_cmdConstWide rule);

    public Object visit(Rule_cmdConstWide16 rule);

    public Object visit(Rule_cmdConstWide32 rule);

    public Object visit(Rule_cmdConstWideHigh16 rule);

    public Object visit(Rule_cmdDivFloat rule);

    public Object visit(Rule_cmdDivFloat2addr rule);

    public Object visit(Rule_cmdDivDouble rule);

    public Object visit(Rule_cmdDivDouble2addr rule);

    public Object visit(Rule_cmdDivInt rule);

    public Object visit(Rule_cmdDivInt2addr rule);

    public Object visit(Rule_cmdDivIntLit16 rule);

    public Object visit(Rule_cmdDivIntLit8 rule);

    public Object visit(Rule_cmdDivLong rule);

    public Object visit(Rule_cmdDivLong2addr rule);

    public Object visit(Rule_cmdDoubleToFloat rule);

    public Object visit(Rule_cmdDoubleToInt rule);

    public Object visit(Rule_cmdDoubleToLong rule);

    public Object visit(Rule_cmdFillArrayData rule);

    public Object visit(Rule_cmdFilledNewArray rule);

    public Object visit(Rule_cmdFilledNewArrayRange rule);

    public Object visit(Rule_cmdFloatToDouble rule);

    public Object visit(Rule_cmdFloatToInt rule);

    public Object visit(Rule_cmdFloatToLong rule);

    public Object visit(Rule_cmdGoto rule);

    public Object visit(Rule_cmdGoto16 rule);

    public Object visit(Rule_cmdGoto32 rule);

    public Object visit(Rule_cmdIfEq rule);

    public Object visit(Rule_cmdIfEqz rule);

    public Object visit(Rule_cmdIfGe rule);

    public Object visit(Rule_cmdIfGez rule);

    public Object visit(Rule_cmdIfGt rule);

    public Object visit(Rule_cmdIfGtz rule);

    public Object visit(Rule_cmdIfLe rule);

    public Object visit(Rule_cmdIfLez rule);

    public Object visit(Rule_cmdIfLt rule);

    public Object visit(Rule_cmdIfLtz rule);

    public Object visit(Rule_cmdIfNe rule);

    public Object visit(Rule_cmdIfNez rule);

    public Object visit(Rule_cmdIget rule);

    public Object visit(Rule_cmdIgetBoolean rule);

    public Object visit(Rule_cmdIgetByte rule);

    public Object visit(Rule_cmdIgetChar rule);

    public Object visit(Rule_cmdIgetObject rule);

    public Object visit(Rule_cmdIgetShort rule);

    public Object visit(Rule_cmdIgetWide rule);

    public Object visit(Rule_cmdInstanceOf rule);

    public Object visit(Rule_cmdIntToByte rule);

    public Object visit(Rule_cmdIntToChar rule);

    public Object visit(Rule_cmdIntToDouble rule);

    public Object visit(Rule_cmdIntToFloat rule);

    public Object visit(Rule_cmdIntToLong rule);

    public Object visit(Rule_cmdIntToShort rule);

    public Object visit(Rule_cmdInvokeDirect rule);

    public Object visit(Rule_cmdInvokeDirectRange rule);

    public Object visit(Rule_cmdInvokeInterface rule);

    public Object visit(Rule_cmdInvokeInterfaceRange rule);

    public Object visit(Rule_cmdInvokeStatic rule);

    public Object visit(Rule_cmdInvokeStaticRange rule);

    public Object visit(Rule_cmdInvokeSuper rule);

    public Object visit(Rule_cmdInvokeSuperRange rule);

    public Object visit(Rule_cmdInvokeVirtual rule);

    public Object visit(Rule_cmdInvokeVirtualRange rule);

    public Object visit(Rule_cmdIput rule);

    public Object visit(Rule_cmdIputBoolean rule);

    public Object visit(Rule_cmdIputByte rule);

    public Object visit(Rule_cmdIputChar rule);

    public Object visit(Rule_cmdIputObject rule);

    public Object visit(Rule_cmdIputShort rule);

    public Object visit(Rule_cmdIputWide rule);

    public Object visit(Rule_cmdLongToDouble rule);

    public Object visit(Rule_cmdLongToFloat rule);

    public Object visit(Rule_cmdLongToInt rule);

    public Object visit(Rule_cmdMonitorEnter rule);

    public Object visit(Rule_cmdMonitorExit rule);

    public Object visit(Rule_cmdMove rule);

    public Object visit(Rule_cmdMove16 rule);

    public Object visit(Rule_cmdMoveException rule);

    public Object visit(Rule_cmdMoveFrom16 rule);

    public Object visit(Rule_cmdMoveObject rule);

    public Object visit(Rule_cmdMoveObject16 rule);

    public Object visit(Rule_cmdMoveObjectFrom16 rule);

    public Object visit(Rule_cmdMoveResult rule);

    public Object visit(Rule_cmdMoveResultObject rule);

    public Object visit(Rule_cmdMoveResultWide rule);

    public Object visit(Rule_cmdMoveWide rule);

    public Object visit(Rule_cmdMoveWide16 rule);

    public Object visit(Rule_cmdMoveWideFrom16 rule);

    public Object visit(Rule_cmdMulFloat rule);

    public Object visit(Rule_cmdMulFloat2addr rule);

    public Object visit(Rule_cmdMulDouble rule);

    public Object visit(Rule_cmdMulDouble2addr rule);

    public Object visit(Rule_cmdMulInt rule);

    public Object visit(Rule_cmdMulInt2addr rule);

    public Object visit(Rule_cmdMulIntLit16 rule);

    public Object visit(Rule_cmdMulIntLit8 rule);

    public Object visit(Rule_cmdMulLong rule);

    public Object visit(Rule_cmdMulLong2addr rule);

    public Object visit(Rule_cmdNegDouble rule);

    public Object visit(Rule_cmdNegFloat rule);

    public Object visit(Rule_cmdNegInt rule);

    public Object visit(Rule_cmdNegLong rule);

    public Object visit(Rule_cmdNewArray rule);

    public Object visit(Rule_cmdNewInstance rule);

    public Object visit(Rule_cmdNop rule);

    public Object visit(Rule_cmdNotInt rule);

    public Object visit(Rule_cmdNotLong rule);

    public Object visit(Rule_cmdOrInt rule);

    public Object visit(Rule_cmdOrInt2addr rule);

    public Object visit(Rule_cmdOrIntLit16 rule);

    public Object visit(Rule_cmdOrIntLit8 rule);

    public Object visit(Rule_cmdOrLong rule);

    public Object visit(Rule_cmdOrLong2addr rule);

    public Object visit(Rule_cmdPackedSwitch rule);

    public Object visit(Rule_cmdRemFloat rule);

    public Object visit(Rule_cmdRemFloat2addr rule);

    public Object visit(Rule_cmdRemDouble rule);

    public Object visit(Rule_cmdRemDouble2addr rule);

    public Object visit(Rule_cmdRemInt rule);

    public Object visit(Rule_cmdRemInt2addr rule);

    public Object visit(Rule_cmdRemIntLit16 rule);

    public Object visit(Rule_cmdRemIntLit8 rule);

    public Object visit(Rule_cmdRemLong rule);

    public Object visit(Rule_cmdRemLong2addr rule);

    public Object visit(Rule_cmdReturn rule);

    public Object visit(Rule_cmdReturnObject rule);

    public Object visit(Rule_cmdReturnVoid rule);

    public Object visit(Rule_cmdReturnWide rule);

    public Object visit(Rule_cmdRsubInt rule);

    public Object visit(Rule_cmdRsubIntLit8 rule);

    public Object visit(Rule_cmdSget rule);

    public Object visit(Rule_cmdSgetBoolean rule);

    public Object visit(Rule_cmdSgetByte rule);

    public Object visit(Rule_cmdSgetChar rule);

    public Object visit(Rule_cmdSgetObject rule);

    public Object visit(Rule_cmdSgetShort rule);

    public Object visit(Rule_cmdSgetWide rule);

    public Object visit(Rule_cmdShlInt rule);

    public Object visit(Rule_cmdShlInt2addr rule);

    public Object visit(Rule_cmdShlIntLit8 rule);

    public Object visit(Rule_cmdShlLong rule);

    public Object visit(Rule_cmdShlLong2addr rule);

    public Object visit(Rule_cmdShrInt rule);

    public Object visit(Rule_cmdShrInt2addr rule);

    public Object visit(Rule_cmdShrIntLit8 rule);

    public Object visit(Rule_cmdShrLong rule);

    public Object visit(Rule_cmdShrLong2addr rule);

    public Object visit(Rule_cmdSparseSwitch rule);

    public Object visit(Rule_cmdSput rule);

    public Object visit(Rule_cmdSputBoolean rule);

    public Object visit(Rule_cmdSputByte rule);

    public Object visit(Rule_cmdSputChar rule);

    public Object visit(Rule_cmdSputObject rule);

    public Object visit(Rule_cmdSputShort rule);

    public Object visit(Rule_cmdSputWide rule);

    public Object visit(Rule_cmdSubFloat rule);

    public Object visit(Rule_cmdSubFloat2addr rule);

    public Object visit(Rule_cmdSubDouble rule);

    public Object visit(Rule_cmdSubDouble2addr rule);

    public Object visit(Rule_cmdSubInt rule);

    public Object visit(Rule_cmdSubInt2addr rule);

    public Object visit(Rule_cmdSubLong rule);

    public Object visit(Rule_cmdSubLong2addr rule);

    public Object visit(Rule_cmdThrow rule);

    public Object visit(Rule_cmdUshrInt rule);

    public Object visit(Rule_cmdUshrInt2addr rule);

    public Object visit(Rule_cmdUshrIntLit8 rule);

    public Object visit(Rule_cmdUshrLong rule);

    public Object visit(Rule_cmdUshrLong2addr rule);

    public Object visit(Rule_cmdXorInt rule);

    public Object visit(Rule_cmdXorInt2addr rule);

    public Object visit(Rule_cmdXorIntLit16 rule);

    public Object visit(Rule_cmdXorIntLit8 rule);

    public Object visit(Rule_cmdXorLong rule);

    public Object visit(Rule_cmdXorLong2addr rule);

    public Object visit(Terminal_StringValue value);

    public Object visit(Terminal_NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
