/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Tue Dec 18 10:26:21 MUT 2012
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

public class XmlDisplayer implements Visitor
{
  private boolean terminal = true;

  public Object visit(Rule_HTAB rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HTAB>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HTAB>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_LF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_SP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CRLF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_QUOT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<QUOT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</QUOT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HASH rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HASH>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HASH>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_COMMA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<COMMA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</COMMA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DOT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DOT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DOT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_COLON rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<COLON>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</COLON>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_SEMICOLON rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SEMICOLON>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SEMICOLON>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_EQ rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<EQ>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</EQ>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_UNDERSCORE rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<UNDERSCORE>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</UNDERSCORE>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ALPHA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HEXDIG rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HEXDIG>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HEXDIG>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_VCHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<VCHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</VCHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fmtSeparator rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fmtSeparator>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fmtSeparator>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_escSymbol rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<escSymbol>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</escSymbol>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_qualifier rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qualifier>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qualifier>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_className rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<className>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</className>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_commentSequence rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<commentSequence>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</commentSequence>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_emptyLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<emptyLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</emptyLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_skipLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<skipLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</skipLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fileName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fileName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fileName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_accessMode rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<accessMode>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</accessMode>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_boolValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<boolValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</boolValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intDecValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intDecValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intDecValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intHexValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intHexValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intHexValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_intValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<intValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</intValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_strValue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<strValue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</strValue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeLabel rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeLabel>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeLabel>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterV rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterV>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterV>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterVDst rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterVDst>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterVDst>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegister rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegister>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegister>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_codeRegisterGroup rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<codeRegisterGroup>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</codeRegisterGroup>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirClass rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirClass>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirClass>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEnd rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEnd>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEnd>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirEndMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirEndMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirEndMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirImplements rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirImplements>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirImplements>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirField rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirField>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirField>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirRegisters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirRegisters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirRegisters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirSuper rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirSuper>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirSuper>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dirSource rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dirSource>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dirSource>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smali rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smali>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smali>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_todoStubLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<todoStubLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</todoStubLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classHeader>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classClass rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classClass>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classClass>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classSuper rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classSuper>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classSuper>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classSource rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classSource>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classSource>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classImplements rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classImplements>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classImplements>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLocals rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLocals>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLocals>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodParam rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodParam>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodParam>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodPrologue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodPrologue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodPrologue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLine rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLine>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLine>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodRegisters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodRegisters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodRegisters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLocal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classField rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classField>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classField>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classMethod rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classMethod>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classMethod>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classConstructorName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classConstructorName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classConstructorName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classMethodProto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classMethodProto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classMethodProto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodBody rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodBody>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodBody>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_label rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<label>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</label>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliConstructorName rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliConstructorName>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliConstructorName>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliFieldRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliFieldRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliFieldRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliMethodRef rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliMethodRef>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliMethodRef>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdAny rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdAny>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdAny>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConst4 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConst4>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConst4>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdConstString rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdConstString>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdConstString>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdGoto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdGoto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdGoto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfEq rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfEq>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfEq>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfEqz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfEqz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfEqz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfNe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfNe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfNe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIfNez rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIfNez>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIfNez>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIget rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIget>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIget>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIgetWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIgetWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIgetWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeDirect rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeDirect>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeDirect>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeStatic rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeStatic>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeStatic>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdInvokeVirtual rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdInvokeVirtual>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdInvokeVirtual>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIput rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIput>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIput>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdIputWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdIputWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdIputWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMove rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMove>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMove>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdMoveResultObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdMoveResultObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdMoveResultObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNewInstance rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNewInstance>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNewInstance>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdNop rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdNop>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdNop>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturn rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturn>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturn>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnObject>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnVoid rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnVoid>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnVoid>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdReturnWide rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdReturnWide>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdReturnWide>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cmdSputObject rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdSputObject>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdSputObject>");
    terminal = false;
    return null;
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  private Boolean visitRules(ArrayList<Rule> rules)
  {
    for (Rule rule : rules)
      rule.accept(this);
    return null;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
