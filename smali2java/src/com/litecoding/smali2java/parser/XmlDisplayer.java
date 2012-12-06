/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Thu Dec 06 08:37:20 MUT 2012
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

  public Object visit(Rule_smaliParam rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliParam>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliParam>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliVar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliVar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliVar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_smaliVarGroup rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<smaliVarGroup>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</smaliVarGroup>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_endDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<endDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</endDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_classDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_superDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<superDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</superDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sourceDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sourceDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sourceDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_implementsDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<implementsDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</implementsDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fieldDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fieldDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fieldDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_endMethodDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<endMethodDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</endMethodDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_registersDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<registersDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</registersDirective>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_localDirective rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<localDirective>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</localDirective>");
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

  public Object visit(Rule_classDirectiveHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<classDirectiveHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</classDirectiveHeader>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_superDirectiveHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<superDirectiveHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</superDirectiveHeader>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sourceDirectiveHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sourceDirectiveHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sourceDirectiveHeader>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_implementsDirectiveHeader rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<implementsDirectiveHeader>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</implementsDirectiveHeader>");
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

  public Object visit(Rule_methodLineLocals rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLineLocals>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLineLocals>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLineParam rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLineParam>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLineParam>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLinePrologue rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLinePrologue>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLinePrologue>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLineNumber rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLineNumber>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLineNumber>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLineRegisters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLineRegisters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLineRegisters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_methodLineLocal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<methodLineLocal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</methodLineLocal>");
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

  public Object visit(Rule_cmdLabel rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cmdLabel>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cmdLabel>");
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
