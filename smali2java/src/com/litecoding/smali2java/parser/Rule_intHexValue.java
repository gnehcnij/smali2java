/* -----------------------------------------------------------------------------
 * Rule_intHexValue.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Fri Apr 12 10:40:21 MUT 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.smali2java.parser;

import java.util.ArrayList;

final public class Rule_intHexValue extends Rule {
    private Rule_intHexValue(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public static Rule_intHexValue parse(ParserContext context) {
        context.push("intHexValue");

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
                    @SuppressWarnings("unused")
                    int c1 = 0;
                    for (int i1 = 0; i1 < 1 && f1; i1++) {
                        int g1 = context.index;
                        parsed = false;
                        if (!parsed) {
                            {
                                ArrayList<Rule> e2 = new ArrayList<Rule>();
                                int s2 = context.index;
                                parsed = true;
                                if (parsed) {
                                    boolean f2 = true;
                                    int c2 = 0;
                                    for (int i2 = 0; i2 < 1 && f2; i2++) {
                                        rule = Terminal_NumericValue.parse(context, "%x2d", "[\\x2d]", 1);
                                        if ((f2 = rule != null)) {
                                            e2.add(rule);
                                            c2++;
                                        }
                                    }
                                    parsed = c2 == 1;
                                }
                                if (parsed)
                                    e1.addAll(e2);
                                else
                                    context.index = s2;
                            }
                        }
                        f1 = context.index > g1;
                        if (parsed) c1++;
                    }
                    parsed = true;
                }
                if (parsed) {
                    boolean f1 = true;
                    int c1 = 0;
                    for (int i1 = 0; i1 < 1 && f1; i1++) {
                        rule = Terminal_NumericValue.parse(context, "%x30", "[\\x30]", 1);
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
                        rule = Terminal_NumericValue.parse(context, "%x78", "[\\x78]", 1);
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
                        rule = Rule_HEXDIG.parse(context);
                        if ((f1 = rule != null)) {
                            e1.add(rule);
                            c1++;
                        }
                    }
                    while (f1) {
                        rule = Rule_HEXDIG.parse(context);
                        if ((f1 = rule != null)) {
                            e1.add(rule);
                            c1++;
                        }
                    }
                    parsed = c1 >= 1;
                }
                if (parsed)
                    e0.addAll(e1);
                else
                    context.index = s1;
            }
        }

        rule = null;
        if (parsed)
            rule = new Rule_intHexValue(context.text.substring(s0, context.index), e0);
        else
            context.index = s0;

        context.pop("intHexValue", parsed);

        return (Rule_intHexValue) rule;
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
