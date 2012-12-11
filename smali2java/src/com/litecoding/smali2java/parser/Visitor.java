/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Tue Dec 11 13:05:34 MUT 2012
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

public interface Visitor
{
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
  public Object visit(Rule_fmtSeparator rule);
  public Object visit(Rule_escSymbol rule);
  public Object visit(Rule_qualifier rule);
  public Object visit(Rule_className rule);
  public Object visit(Rule_commentSequence rule);
  public Object visit(Rule_comment rule);
  public Object visit(Rule_emptyLine rule);
  public Object visit(Rule_skipLine rule);
  public Object visit(Rule_fileName rule);
  public Object visit(Rule_accessMode rule);
  public Object visit(Rule_type rule);
  public Object visit(Rule_boolValue rule);
  public Object visit(Rule_intDecValue rule);
  public Object visit(Rule_intHexValue rule);
  public Object visit(Rule_intValue rule);
  public Object visit(Rule_strValue rule);
  public Object visit(Rule_value rule);
  public Object visit(Rule_label rule);
  public Object visit(Rule_smaliParam rule);
  public Object visit(Rule_smaliVar rule);
  public Object visit(Rule_smaliVarDst rule);
  public Object visit(Rule_smaliVarInit rule);
  public Object visit(Rule_smaliVarGroup rule);
  public Object visit(Rule_endDirective rule);
  public Object visit(Rule_classDirective rule);
  public Object visit(Rule_superDirective rule);
  public Object visit(Rule_sourceDirective rule);
  public Object visit(Rule_implementsDirective rule);
  public Object visit(Rule_fieldDirective rule);
  public Object visit(Rule_methodDirective rule);
  public Object visit(Rule_endMethodDirective rule);
  public Object visit(Rule_registersDirective rule);
  public Object visit(Rule_localDirective rule);
  public Object visit(Rule_smali rule);
  public Object visit(Rule_todoStubLine rule);
  public Object visit(Rule_classHeader rule);
  public Object visit(Rule_classDirectiveHeader rule);
  public Object visit(Rule_superDirectiveHeader rule);
  public Object visit(Rule_sourceDirectiveHeader rule);
  public Object visit(Rule_implementsDirectiveHeader rule);
  public Object visit(Rule_classField rule);
  public Object visit(Rule_classMethod rule);
  public Object visit(Rule_classConstructorName rule);
  public Object visit(Rule_classMethodProto rule);
  public Object visit(Rule_methodBody rule);
  public Object visit(Rule_methodLineLocals rule);
  public Object visit(Rule_methodLineParam rule);
  public Object visit(Rule_methodLinePrologue rule);
  public Object visit(Rule_methodLineNumber rule);
  public Object visit(Rule_methodLineRegisters rule);
  public Object visit(Rule_methodLineLocal rule);
  public Object visit(Rule_smaliConstructorName rule);
  public Object visit(Rule_smaliFieldRef rule);
  public Object visit(Rule_smaliMethodRef rule);
  public Object visit(Rule_cmdAny rule);
  public Object visit(Rule_cmdConst4 rule);
  public Object visit(Rule_cmdConstString rule);
  public Object visit(Rule_cmdGoto rule);
  public Object visit(Rule_cmdIfEq rule);
  public Object visit(Rule_cmdIfEqz rule);
  public Object visit(Rule_cmdIfNe rule);
  public Object visit(Rule_cmdIfNez rule);
  public Object visit(Rule_cmdIget rule);
  public Object visit(Rule_cmdIgetObject rule);
  public Object visit(Rule_cmdIgetWide rule);
  public Object visit(Rule_cmdInvokeDirect rule);
  public Object visit(Rule_cmdInvokeStatic rule);
  public Object visit(Rule_cmdInvokeVirtual rule);
  public Object visit(Rule_cmdIput rule);
  public Object visit(Rule_cmdIputObject rule);
  public Object visit(Rule_cmdIputWide rule);
  public Object visit(Rule_cmdLabel rule);
  public Object visit(Rule_cmdMove rule);
  public Object visit(Rule_cmdMoveResultObject rule);
  public Object visit(Rule_cmdNewInstance rule);
  public Object visit(Rule_cmdNop rule);
  public Object visit(Rule_cmdReturn rule);
  public Object visit(Rule_cmdReturnObject rule);
  public Object visit(Rule_cmdReturnVoid rule);
  public Object visit(Rule_cmdReturnWide rule);
  public Object visit(Rule_cmdSputObject rule);

  public Object visit(Terminal_StringValue value);
  public Object visit(Terminal_NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
