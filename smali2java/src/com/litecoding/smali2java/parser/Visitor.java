/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Sun Dec 23 19:00:31 MUT 2012
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
  public Object visit(Rule_padding rule);
  public Object visit(Rule_optPadding rule);
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
  public Object visit(Rule_codeRegisterGroup rule);
  public Object visit(Rule_dirClass rule);
  public Object visit(Rule_dirEnd rule);
  public Object visit(Rule_dirEndMethod rule);
  public Object visit(Rule_dirImplements rule);
  public Object visit(Rule_dirField rule);
  public Object visit(Rule_dirLocal rule);
  public Object visit(Rule_dirMethod rule);
  public Object visit(Rule_dirRegisters rule);
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
  public Object visit(Rule_classField rule);
  public Object visit(Rule_classMethod rule);
  public Object visit(Rule_classConstructorName rule);
  public Object visit(Rule_classMethodProto rule);
  public Object visit(Rule_methodBody rule);
  public Object visit(Rule_label rule);
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
  public Object visit(Rule_cmdInvokeInterface rule);
  public Object visit(Rule_cmdInvokeStatic rule);
  public Object visit(Rule_cmdInvokeVirtual rule);
  public Object visit(Rule_cmdIput rule);
  public Object visit(Rule_cmdIputObject rule);
  public Object visit(Rule_cmdIputWide rule);
  public Object visit(Rule_cmdMove rule);
  public Object visit(Rule_cmdMoveResultObject rule);
  public Object visit(Rule_cmdNewInstance rule);
  public Object visit(Rule_cmdNop rule);
  public Object visit(Rule_cmdReturn rule);
  public Object visit(Rule_cmdReturnObject rule);
  public Object visit(Rule_cmdReturnVoid rule);
  public Object visit(Rule_cmdReturnWide rule);
  public Object visit(Rule_cmdSgetObject rule);
  public Object visit(Rule_cmdSputObject rule);

  public Object visit(Terminal_StringValue value);
  public Object visit(Terminal_NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
