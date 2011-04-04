// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g 2011-02-27 13:19:20

package BnfCompiler;

import java.util.HashMap;


import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class BnfEvaluatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NONTERMINAL", "TERMINAL", "WS", "'.'", "'='", "'/'", "'('", "')'", "'['", "']'", "'<'", "'>'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int NONTERMINAL=4;
    public static final int TERMINAL=5;
    public static final int WS=6;

    // delegates
    // delegators


        public BnfEvaluatorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BnfEvaluatorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BnfEvaluatorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g"; }


    	public String startRule = "";
    	HashMap<String, Link> ruleNameToLink = new HashMap<String, Link>();
    	
    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) throws RuntimeException
        	{
    		throw new RuntimeException();
        	}


    public static class bnf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bnf"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:32:1: bnf : startRule '.' ( rule '.' )* EOF ;
    public final BnfEvaluatorParser.bnf_return bnf() throws RecognitionException {
        BnfEvaluatorParser.bnf_return retval = new BnfEvaluatorParser.bnf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        Token EOF5=null;
        BnfEvaluatorParser.startRule_return startRule1 = null;

        BnfEvaluatorParser.rule_return rule3 = null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree EOF5_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:32:5: ( startRule '.' ( rule '.' )* EOF )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:32:7: startRule '.' ( rule '.' )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_startRule_in_bnf55);
            startRule1=startRule();

            state._fsp--;

            adaptor.addChild(root_0, startRule1.getTree());
            char_literal2=(Token)match(input,7,FOLLOW_7_in_bnf57); 
            char_literal2_tree = (CommonTree)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);

            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:32:21: ( rule '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NONTERMINAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:32:22: rule '.'
            	    {
            	    pushFollow(FOLLOW_rule_in_bnf60);
            	    rule3=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule3.getTree());
            	    char_literal4=(Token)match(input,7,FOLLOW_7_in_bnf62); 
            	    char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
            	    adaptor.addChild(root_0, char_literal4_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_bnf66); 
            EOF5_tree = (CommonTree)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bnf"

    public static class startRule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startRule"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:33:1: startRule : ruleName '=' expression ;
    public final BnfEvaluatorParser.startRule_return startRule() throws RecognitionException {
        BnfEvaluatorParser.startRule_return retval = new BnfEvaluatorParser.startRule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal7=null;
        BnfEvaluatorParser.ruleName_return ruleName6 = null;

        BnfEvaluatorParser.expression_return expression8 = null;


        CommonTree char_literal7_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:34:2: ( ruleName '=' expression )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:34:4: ruleName '=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_ruleName_in_startRule74);
            ruleName6=ruleName();

            state._fsp--;

            adaptor.addChild(root_0, ruleName6.getTree());
            char_literal7=(Token)match(input,8,FOLLOW_8_in_startRule76); 
            char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

            pushFollow(FOLLOW_expression_in_startRule78);
            expression8=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression8.getTree());
            startRule = (ruleName6!=null?ruleName6.value:null); ruleNameToLink.put((ruleName6!=null?ruleName6.value:null), (expression8!=null?expression8.value:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "startRule"

    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:37:1: rule : ruleName '=' expression ;
    public final BnfEvaluatorParser.rule_return rule() throws RecognitionException {
        BnfEvaluatorParser.rule_return retval = new BnfEvaluatorParser.rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal10=null;
        BnfEvaluatorParser.ruleName_return ruleName9 = null;

        BnfEvaluatorParser.expression_return expression11 = null;


        CommonTree char_literal10_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:37:6: ( ruleName '=' expression )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:37:8: ruleName '=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_ruleName_in_rule92);
            ruleName9=ruleName();

            state._fsp--;

            adaptor.addChild(root_0, ruleName9.getTree());
            char_literal10=(Token)match(input,8,FOLLOW_8_in_rule94); 
            char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);

            pushFollow(FOLLOW_expression_in_rule96);
            expression11=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression11.getTree());
            ruleNameToLink.put((ruleName9!=null?ruleName9.value:null), (expression11!=null?expression11.value:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class ruleName_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleName"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:40:1: ruleName returns [String value] : NONTERMINAL ;
    public final BnfEvaluatorParser.ruleName_return ruleName() throws RecognitionException {
        BnfEvaluatorParser.ruleName_return retval = new BnfEvaluatorParser.ruleName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NONTERMINAL12=null;

        CommonTree NONTERMINAL12_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:41:2: ( NONTERMINAL )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:41:4: NONTERMINAL
            {
            root_0 = (CommonTree)adaptor.nil();

            NONTERMINAL12=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_ruleName113); 
            NONTERMINAL12_tree = (CommonTree)adaptor.create(NONTERMINAL12);
            adaptor.addChild(root_0, NONTERMINAL12_tree);

            retval.value =(NONTERMINAL12!=null?NONTERMINAL12.getText():null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleName"

    public static class expression_return extends ParserRuleReturnScope {
        public Link value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:43:1: expression returns [Link value] : ( expr )+ ;
    public final BnfEvaluatorParser.expression_return expression() throws RecognitionException {
        BnfEvaluatorParser.expression_return retval = new BnfEvaluatorParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BnfEvaluatorParser.expr_return expr13 = null;



        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:44:2: ( ( expr )+ )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:44:4: ( expr )+
            {
            root_0 = (CommonTree)adaptor.nil();

            Link link = new Link(); retval.value = link;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:45:4: ( expr )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=NONTERMINAL && LA2_0<=TERMINAL)||LA2_0==10||LA2_0==12||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:45:6: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_expression135);
            	    expr13=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr13.getTree());
            	    link.add((expr13!=null?expr13.value:null));

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends ParserRuleReturnScope {
        public Link value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:47:1: expr returns [Link value] : start= exprBase ( '/' base= exprBase )* ;
    public final BnfEvaluatorParser.expr_return expr() throws RecognitionException {
        BnfEvaluatorParser.expr_return retval = new BnfEvaluatorParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;
        BnfEvaluatorParser.exprBase_return start = null;

        BnfEvaluatorParser.exprBase_return base = null;


        CommonTree char_literal14_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:48:2: (start= exprBase ( '/' base= exprBase )* )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:48:4: start= exprBase ( '/' base= exprBase )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Link orLink = null;
            pushFollow(FOLLOW_exprBase_in_expr160);
            start=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, start.getTree());
            Link link = (start!=null?start.value:null); retval.value = link;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:50:4: ( '/' base= exprBase )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:50:6: '/' base= exprBase
            	    {
            	    char_literal14=(Token)match(input,9,FOLLOW_9_in_expr169); 
            	    char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
            	    adaptor.addChild(root_0, char_literal14_tree);

            	    pushFollow(FOLLOW_exprBase_in_expr173);
            	    base=exprBase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, base.getTree());

            	    	  	if(orLink == null)
            	    	  	{
            	    	  		orLink = new Link(link);
            	    	  		orLink.oneOfMultiple();
            	    	  		retval.value = orLink;
            	    	  	}
            	    	  	orLink.add((base!=null?base.value:null));
            	    	  

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class exprBase_return extends ParserRuleReturnScope {
        public Link value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:61:1: exprBase returns [Link value] : ( TERMINAL | NONTERMINAL | '(' expression ')' | '[' expression ']' | '<' expression '>' );
    public final BnfEvaluatorParser.exprBase_return exprBase() throws RecognitionException {
        BnfEvaluatorParser.exprBase_return retval = new BnfEvaluatorParser.exprBase_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TERMINAL15=null;
        Token NONTERMINAL16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        BnfEvaluatorParser.expression_return expression18 = null;

        BnfEvaluatorParser.expression_return expression21 = null;

        BnfEvaluatorParser.expression_return expression24 = null;


        CommonTree TERMINAL15_tree=null;
        CommonTree NONTERMINAL16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal25_tree=null;

        try {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:62:2: ( TERMINAL | NONTERMINAL | '(' expression ')' | '[' expression ']' | '<' expression '>' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case TERMINAL:
                {
                alt4=1;
                }
                break;
            case NONTERMINAL:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            case 12:
                {
                alt4=4;
                }
                break;
            case 14:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:62:4: TERMINAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TERMINAL15=(Token)match(input,TERMINAL,FOLLOW_TERMINAL_in_exprBase193); 
                    TERMINAL15_tree = (CommonTree)adaptor.create(TERMINAL15);
                    adaptor.addChild(root_0, TERMINAL15_tree);

                    retval.value = new Link ((TERMINAL15!=null?TERMINAL15.getText():null) );

                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:63:5: NONTERMINAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NONTERMINAL16=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_exprBase201); 
                    NONTERMINAL16_tree = (CommonTree)adaptor.create(NONTERMINAL16);
                    adaptor.addChild(root_0, NONTERMINAL16_tree);

                    retval.value = new Link((NONTERMINAL16!=null?NONTERMINAL16.getText():null));

                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:64:5: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal17=(Token)match(input,10,FOLLOW_10_in_exprBase209); 
                    char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);

                    pushFollow(FOLLOW_expression_in_exprBase211);
                    expression18=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression18.getTree());
                    char_literal19=(Token)match(input,11,FOLLOW_11_in_exprBase213); 
                    char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);

                    retval.value = (expression18!=null?expression18.value:null);

                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:65:5: '[' expression ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal20=(Token)match(input,12,FOLLOW_12_in_exprBase221); 
                    char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);

                    pushFollow(FOLLOW_expression_in_exprBase223);
                    expression21=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression21.getTree());
                    char_literal22=(Token)match(input,13,FOLLOW_13_in_exprBase225); 
                    char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
                    adaptor.addChild(root_0, char_literal22_tree);

                    retval.value = (expression21!=null?expression21.value:null); retval.value.optional();

                    }
                    break;
                case 5 :
                    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:66:5: '<' expression '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal23=(Token)match(input,14,FOLLOW_14_in_exprBase233); 
                    char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);

                    pushFollow(FOLLOW_expression_in_exprBase235);
                    expression24=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression24.getTree());
                    char_literal25=(Token)match(input,15,FOLLOW_15_in_exprBase237); 
                    char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
                    adaptor.addChild(root_0, char_literal25_tree);

                    retval.value = (expression24!=null?expression24.value:null); retval.value.loop();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase"

    // Delegated rules


 

    public static final BitSet FOLLOW_startRule_in_bnf55 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_bnf57 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule_in_bnf60 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_bnf62 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EOF_in_bnf66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_startRule74 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_startRule76 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_expression_in_startRule78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rule94 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_expression_in_rule96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONTERMINAL_in_ruleName113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression135 = new BitSet(new long[]{0x0000000000005432L});
    public static final BitSet FOLLOW_exprBase_in_expr160 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_expr169 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_exprBase_in_expr173 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TERMINAL_in_exprBase193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONTERMINAL_in_exprBase201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_exprBase209 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_expression_in_exprBase211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_exprBase213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_exprBase221 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_expression_in_exprBase223 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_exprBase225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_exprBase233 = new BitSet(new long[]{0x0000000000005430L});
    public static final BitSet FOLLOW_expression_in_exprBase235 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_exprBase237 = new BitSet(new long[]{0x0000000000000002L});

}