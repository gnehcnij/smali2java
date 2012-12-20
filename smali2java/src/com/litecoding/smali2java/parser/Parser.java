/* -----------------------------------------------------------------------------
 * Parser.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Wed Dec 19 11:27:34 MUT 2012
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.Stack;
import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

public class Parser
{
  private Parser() {}

  static public void main(String[] args)
  {
    Properties arguments = new Properties();
    String error = "";
    boolean ok = args.length > 0;

    if (ok)
    {
      arguments.setProperty("Trace", "Off");
      arguments.setProperty("Rule", "HTAB");

      for (int i = 0; i < args.length; i++)
      {
        if (args[i].equals("-trace"))
          arguments.setProperty("Trace", "On");
        else if (args[i].equals("-visitor"))
          arguments.setProperty("Visitor", args[++i]);
        else if (args[i].equals("-file"))
          arguments.setProperty("File", args[++i]);
        else if (args[i].equals("-string"))
          arguments.setProperty("String", args[++i]);
        else if (args[i].equals("-rule"))
          arguments.setProperty("Rule", args[++i]);
        else
        {
          error = "unknown argument: " + args[i];
          ok = false;
        }
      }
    }

    if (ok)
    {
      if (arguments.getProperty("File") == null &&
          arguments.getProperty("String") == null)
      {
        error = "insufficient arguments: -file or -string required";
        ok = false;
      }
    }

    if (!ok)
    {
      System.out.println("error: " + error);
      System.out.println("usage: Parser [-rule rulename] [-trace] <-file file | -string string> [-visitor visitor]");
    }
    else
    {
      try
      {
        Rule rule = null;

        if (arguments.getProperty("File") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              new File(arguments.getProperty("File")), 
              arguments.getProperty("Trace").equals("On"));
        }
        else if (arguments.getProperty("String") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              arguments.getProperty("String"), 
              arguments.getProperty("Trace").equals("On"));
        }

        if (arguments.getProperty("Visitor") != null)
        {
          Visitor visitor = 
            (Visitor)Class.forName(arguments.getProperty("Visitor")).newInstance();
          rule.accept(visitor);
        }
      }
      catch (IllegalArgumentException e)
      {
        System.out.println("argument error: " + e.getMessage());
      }
      catch (IOException e)
      {
        System.out.println("io error: " + e.getMessage());
      }
      catch (ParserException e)
      {
        System.out.println("parser error: " + e.getMessage());
      }
      catch (ClassNotFoundException e)
      {
        System.out.println("visitor error: class not found - " + e.getMessage());
      }
      catch (IllegalAccessException e)
      {
        System.out.println("visitor error: illegal access - " + e.getMessage());
      }
      catch (InstantiationException e)
      {
        System.out.println("visitor error: instantiation failure - " + e.getMessage());
      }
    }
  }

  static public Rule parse(String rulename, String string)
  throws IllegalArgumentException,
         ParserException
  {
    return parse(rulename, string, false);
  }

  static public Rule parse(String rulename, InputStream in)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, in, false);
  }

  static public Rule parse(String rulename, File file)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, file, false);
  }

  static private Rule parse(String rulename, String string, boolean trace)
  throws IllegalArgumentException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (string == null)
      throw new IllegalArgumentException("null string");

    ParserContext context = new ParserContext(string, trace);

    Rule rule = null;
    if (rulename.equalsIgnoreCase("HTAB")) rule = Rule_HTAB.parse(context);
    else if (rulename.equalsIgnoreCase("CR")) rule = Rule_CR.parse(context);
    else if (rulename.equalsIgnoreCase("LF")) rule = Rule_LF.parse(context);
    else if (rulename.equalsIgnoreCase("SP")) rule = Rule_SP.parse(context);
    else if (rulename.equalsIgnoreCase("CRLF")) rule = Rule_CRLF.parse(context);
    else if (rulename.equalsIgnoreCase("QUOT")) rule = Rule_QUOT.parse(context);
    else if (rulename.equalsIgnoreCase("HASH")) rule = Rule_HASH.parse(context);
    else if (rulename.equalsIgnoreCase("COMMA")) rule = Rule_COMMA.parse(context);
    else if (rulename.equalsIgnoreCase("DOT")) rule = Rule_DOT.parse(context);
    else if (rulename.equalsIgnoreCase("COLON")) rule = Rule_COLON.parse(context);
    else if (rulename.equalsIgnoreCase("SEMICOLON")) rule = Rule_SEMICOLON.parse(context);
    else if (rulename.equalsIgnoreCase("EQ")) rule = Rule_EQ.parse(context);
    else if (rulename.equalsIgnoreCase("UNDERSCORE")) rule = Rule_UNDERSCORE.parse(context);
    else if (rulename.equalsIgnoreCase("ALPHA")) rule = Rule_ALPHA.parse(context);
    else if (rulename.equalsIgnoreCase("DIGIT")) rule = Rule_DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("HEXDIG")) rule = Rule_HEXDIG.parse(context);
    else if (rulename.equalsIgnoreCase("VCHAR")) rule = Rule_VCHAR.parse(context);
    else if (rulename.equalsIgnoreCase("fmtSeparator")) rule = Rule_fmtSeparator.parse(context);
    else if (rulename.equalsIgnoreCase("escSymbol")) rule = Rule_escSymbol.parse(context);
    else if (rulename.equalsIgnoreCase("qualifier")) rule = Rule_qualifier.parse(context);
    else if (rulename.equalsIgnoreCase("className")) rule = Rule_className.parse(context);
    else if (rulename.equalsIgnoreCase("commentSequence")) rule = Rule_commentSequence.parse(context);
    else if (rulename.equalsIgnoreCase("comment")) rule = Rule_comment.parse(context);
    else if (rulename.equalsIgnoreCase("emptyLine")) rule = Rule_emptyLine.parse(context);
    else if (rulename.equalsIgnoreCase("skipLine")) rule = Rule_skipLine.parse(context);
    else if (rulename.equalsIgnoreCase("fileName")) rule = Rule_fileName.parse(context);
    else if (rulename.equalsIgnoreCase("accessMode")) rule = Rule_accessMode.parse(context);
    else if (rulename.equalsIgnoreCase("type")) rule = Rule_type.parse(context);
    else if (rulename.equalsIgnoreCase("boolValue")) rule = Rule_boolValue.parse(context);
    else if (rulename.equalsIgnoreCase("intDecValue")) rule = Rule_intDecValue.parse(context);
    else if (rulename.equalsIgnoreCase("intHexValue")) rule = Rule_intHexValue.parse(context);
    else if (rulename.equalsIgnoreCase("intValue")) rule = Rule_intValue.parse(context);
    else if (rulename.equalsIgnoreCase("strValue")) rule = Rule_strValue.parse(context);
    else if (rulename.equalsIgnoreCase("value")) rule = Rule_value.parse(context);
    else if (rulename.equalsIgnoreCase("codeLabel")) rule = Rule_codeLabel.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterP")) rule = Rule_codeRegisterP.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterP64")) rule = Rule_codeRegisterP64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV")) rule = Rule_codeRegisterV.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV64")) rule = Rule_codeRegisterV64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterVDst")) rule = Rule_codeRegisterVDst.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterV64Dst")) rule = Rule_codeRegisterV64Dst.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegister")) rule = Rule_codeRegister.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegister64")) rule = Rule_codeRegister64.parse(context);
    else if (rulename.equalsIgnoreCase("codeRegisterGroup")) rule = Rule_codeRegisterGroup.parse(context);
    else if (rulename.equalsIgnoreCase("dirClass")) rule = Rule_dirClass.parse(context);
    else if (rulename.equalsIgnoreCase("dirEnd")) rule = Rule_dirEnd.parse(context);
    else if (rulename.equalsIgnoreCase("dirEndMethod")) rule = Rule_dirEndMethod.parse(context);
    else if (rulename.equalsIgnoreCase("dirImplements")) rule = Rule_dirImplements.parse(context);
    else if (rulename.equalsIgnoreCase("dirField")) rule = Rule_dirField.parse(context);
    else if (rulename.equalsIgnoreCase("dirLocal")) rule = Rule_dirLocal.parse(context);
    else if (rulename.equalsIgnoreCase("dirMethod")) rule = Rule_dirMethod.parse(context);
    else if (rulename.equalsIgnoreCase("dirRegisters")) rule = Rule_dirRegisters.parse(context);
    else if (rulename.equalsIgnoreCase("dirSuper")) rule = Rule_dirSuper.parse(context);
    else if (rulename.equalsIgnoreCase("dirSource")) rule = Rule_dirSource.parse(context);
    else if (rulename.equalsIgnoreCase("smali")) rule = Rule_smali.parse(context);
    else if (rulename.equalsIgnoreCase("todoStubLine")) rule = Rule_todoStubLine.parse(context);
    else if (rulename.equalsIgnoreCase("classHeader")) rule = Rule_classHeader.parse(context);
    else if (rulename.equalsIgnoreCase("classClass")) rule = Rule_classClass.parse(context);
    else if (rulename.equalsIgnoreCase("classSuper")) rule = Rule_classSuper.parse(context);
    else if (rulename.equalsIgnoreCase("classSource")) rule = Rule_classSource.parse(context);
    else if (rulename.equalsIgnoreCase("classImplements")) rule = Rule_classImplements.parse(context);
    else if (rulename.equalsIgnoreCase("methodLocals")) rule = Rule_methodLocals.parse(context);
    else if (rulename.equalsIgnoreCase("methodParam")) rule = Rule_methodParam.parse(context);
    else if (rulename.equalsIgnoreCase("methodPrologue")) rule = Rule_methodPrologue.parse(context);
    else if (rulename.equalsIgnoreCase("methodLine")) rule = Rule_methodLine.parse(context);
    else if (rulename.equalsIgnoreCase("methodRegisters")) rule = Rule_methodRegisters.parse(context);
    else if (rulename.equalsIgnoreCase("methodLocal")) rule = Rule_methodLocal.parse(context);
    else if (rulename.equalsIgnoreCase("classField")) rule = Rule_classField.parse(context);
    else if (rulename.equalsIgnoreCase("classMethod")) rule = Rule_classMethod.parse(context);
    else if (rulename.equalsIgnoreCase("classConstructorName")) rule = Rule_classConstructorName.parse(context);
    else if (rulename.equalsIgnoreCase("classMethodProto")) rule = Rule_classMethodProto.parse(context);
    else if (rulename.equalsIgnoreCase("methodBody")) rule = Rule_methodBody.parse(context);
    else if (rulename.equalsIgnoreCase("label")) rule = Rule_label.parse(context);
    else if (rulename.equalsIgnoreCase("smaliConstructorName")) rule = Rule_smaliConstructorName.parse(context);
    else if (rulename.equalsIgnoreCase("smaliFieldRef")) rule = Rule_smaliFieldRef.parse(context);
    else if (rulename.equalsIgnoreCase("smaliMethodRef")) rule = Rule_smaliMethodRef.parse(context);
    else if (rulename.equalsIgnoreCase("cmdAny")) rule = Rule_cmdAny.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConst4")) rule = Rule_cmdConst4.parse(context);
    else if (rulename.equalsIgnoreCase("cmdConstString")) rule = Rule_cmdConstString.parse(context);
    else if (rulename.equalsIgnoreCase("cmdGoto")) rule = Rule_cmdGoto.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfEq")) rule = Rule_cmdIfEq.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfEqz")) rule = Rule_cmdIfEqz.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfNe")) rule = Rule_cmdIfNe.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIfNez")) rule = Rule_cmdIfNez.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIget")) rule = Rule_cmdIget.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetObject")) rule = Rule_cmdIgetObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIgetWide")) rule = Rule_cmdIgetWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeDirect")) rule = Rule_cmdInvokeDirect.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeStatic")) rule = Rule_cmdInvokeStatic.parse(context);
    else if (rulename.equalsIgnoreCase("cmdInvokeVirtual")) rule = Rule_cmdInvokeVirtual.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIput")) rule = Rule_cmdIput.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputObject")) rule = Rule_cmdIputObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdIputWide")) rule = Rule_cmdIputWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMove")) rule = Rule_cmdMove.parse(context);
    else if (rulename.equalsIgnoreCase("cmdMoveResultObject")) rule = Rule_cmdMoveResultObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNewInstance")) rule = Rule_cmdNewInstance.parse(context);
    else if (rulename.equalsIgnoreCase("cmdNop")) rule = Rule_cmdNop.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturn")) rule = Rule_cmdReturn.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnObject")) rule = Rule_cmdReturnObject.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnVoid")) rule = Rule_cmdReturnVoid.parse(context);
    else if (rulename.equalsIgnoreCase("cmdReturnWide")) rule = Rule_cmdReturnWide.parse(context);
    else if (rulename.equalsIgnoreCase("cmdSputObject")) rule = Rule_cmdSputObject.parse(context);
    else throw new IllegalArgumentException("unknown rule");

    if (rule == null)
    {
      throw new ParserException(
        "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
        context.text,
        context.getErrorIndex(),
        context.getErrorStack());
    }

    if (context.text.length() > context.index)
    {
      ParserException primaryError = 
        new ParserException(
          "extra data found",
          context.text,
          context.index,
          new Stack<String>());

      if (context.getErrorIndex() > context.index)
      {
        ParserException secondaryError = 
          new ParserException(
            "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
            context.text,
            context.getErrorIndex(),
            context.getErrorStack());

        primaryError.initCause(secondaryError);
      }

      throw primaryError;
    }

    return rule;
  }

  static private Rule parse(String rulename, InputStream in, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (in == null)
      throw new IllegalArgumentException("null input stream");

    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    return parse(rulename, out.toString(), trace);
  }

  static private Rule parse(String rulename, File file, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (file == null)
      throw new IllegalArgumentException("null file");

    BufferedReader in = new BufferedReader(new FileReader(file));
    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    in.close();

    return parse(rulename, out.toString(), trace);
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
