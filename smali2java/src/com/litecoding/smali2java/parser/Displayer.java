/* -----------------------------------------------------------------------------
 * Displayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Sun Dec 23 19:00:31 MUT 2012
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

public class Displayer implements Visitor
{

  public Object visit(Rule_HTAB rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_LF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_SP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CRLF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_QUOT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HASH rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_COMMA rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DOT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_COLON rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_SEMICOLON rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_EQ rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_UNDERSCORE rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ALPHA rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DIGIT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HEXDIG rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_VCHAR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_padding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_optPadding rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_listSeparator rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_escSymbol rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_qualifier rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_className rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_commentSequence rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_comment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_emptyLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_skipLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fileName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_accessMode rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_boolValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intDecValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intHexValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_intValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_strValue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_value rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeLabel rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterP64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterVDst rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterV64Dst rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegister rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegister64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_codeRegisterGroup rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirClass rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEnd rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirEndMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirImplements rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirField rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirRegisters rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirSuper rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dirSource rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smali rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_todoStubLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classHeader rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classClass rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classSuper rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classSource rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classImplements rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLocals rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodParam rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodPrologue rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLine rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodRegisters rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodLocal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classField rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classMethod rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classConstructorName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_classMethodProto rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_methodBody rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_label rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliConstructorName rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliFieldRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_smaliMethodRef rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdAny rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConst4 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdConstString rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdGoto rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfEq rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfEqz rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfNe rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIfNez rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIget rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIgetWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeDirect rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeInterface rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeStatic rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdInvokeVirtual rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIput rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdIputWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMove rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdMoveResultObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNewInstance rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdNop rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturn rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnVoid rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdReturnWide rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSgetObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cmdSputObject rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  private Object visitRules(ArrayList<Rule> rules)
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
