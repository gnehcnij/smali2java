/* -----------------------------------------------------------------------------
 * Rule_codeRegisterV64.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Fri Apr 12 10:40:21 MUT 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

final public class Rule_codeRegisterV64 extends Rule {
    private Rule_codeRegisterV64(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public static Rule_codeRegisterV64 parse(ParserContext context) {
        context.push("codeRegisterV64");

        boolean parsed = true;
        int s0 = context.index;
        ArrayList<Rule> e0 = new ArrayList<Rule>();
        Rule rule;

        parsed = false;
        if (!parsed) {
            {
                ArrayList<Rule> e1 = new ArrayList<Rule>();
                int s1 = context.index;
                parsed = true;
                if (parsed) {
                    boolean f1 = true;
                    int c1 = 0;
                    for (int i1 = 0; i1 < 1 && f1; i1++) {
                        rule = Terminal_StringValue.parse(context, "v");
                        if ((f1 = rule != null)) {
                            e1.add(rule);
                            c1++;
                        }
                    }
                    parsed = c1 == 1;
                }
                if (parsed) {
                    boolean f1 = true;
                    int c1 = 0;
                    for (int i1 = 0; i1 < 1 && f1; i1++) {
                        rule = Rule_intDecValue.parse(context);
                        if ((f1 = rule != null)) {
                            e1.add(rule);
                            c1++;
                        }
                    }
                    parsed = c1 == 1;
                }
                if (parsed)
                    e0.addAll(e1);
                else
                    context.index = s1;
            }
        }

        rule = null;
        if (parsed)
            rule = new Rule_codeRegisterV64(context.text.substring(s0, context.index), e0);
        else
            context.index = s0;

        context.pop("codeRegisterV64", parsed);

        return (Rule_codeRegisterV64) rule;
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
