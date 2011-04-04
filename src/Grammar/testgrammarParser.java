// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g 2011-04-03 14:00:32

package Grammar;

import java.util.Stack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testgrammarParser extends BnfParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLOAT", "STRING", "IDENTIFIER", "INT", "HEX", "EXPONENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "COMMENT", "WS", "','", "'try'", "'catch'", "'('", "')'", "'finally'", "'if'", "'else'", "'interface'", "'extends'", "'{'", "'}'", "'while'", "'.'", "'['", "']'", "'='", "'new'", "';'", "'-'", "'++'", "'--'", "'for'", "'switch'", "'case'", "':'", "'default'", "'null'", "'super'", "'this'", "'instanceof'", "'static'", "'import'", "'*'", "'class'", "'implements'", "'/**'", "'... text ...'", "'*/'", "'do'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'synchronized'", "'abstract'", "'threadsafe'", "'transient'", "'return'", "'throw'", "'break'", "'continue'", "'package'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'l'", "'0x'"
    };
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int FLOAT=4;
    public static final int STRING=5;
    public static final int IDENTIFIER=6;
    public static final int INT=7;
    public static final int HEX=8;
    public static final int EXPONENT=9;
    public static final int ESC_SEQ=10;
    public static final int HEX_DIGIT=11;
    public static final int UNICODE_ESC=12;
    public static final int OCTAL_ESC=13;
    public static final int COMMENT=14;
    public static final int WS=15;

    // delegates
    // delegators


        public testgrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public testgrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return testgrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g"; }


    	public void bnf() throws RecognitionException
    	{
    		compilation_unit();
    	}



    // $ANTLR start "compilation_unit"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:28:1: compilation_unit : ( ( package_statement ) )? ( ( import_statement ) )* ( ( type_declaration ) )* ;
    public final void compilation_unit() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:28:18: ( ( ( package_statement ) )? ( ( import_statement ) )* ( ( type_declaration ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:29:3: ( ( package_statement ) )? ( ( import_statement ) )* ( ( type_declaration ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("compilation_unit");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:1: ( ( package_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==69) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:3: ( package_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:3: ( package_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:4: package_statement
                    {
                    pushFollow(FOLLOW_package_statement_in_compilation_unit49);
                    package_statement();

                    state._fsp--;

                    stack.push("id0");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:46: ( ( import_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==48) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:48: ( import_statement )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:48: ( import_statement )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:49: import_statement
            	    {
            	    pushFollow(FOLLOW_import_statement_in_compilation_unit59);
            	    import_statement();

            	    state._fsp--;

            	    stack.push("id1");

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:90: ( ( type_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24||LA3_0==47||LA3_0==50||LA3_0==52||(LA3_0>=56 && LA3_0<=64)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:92: ( type_declaration )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:92: ( type_declaration )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:93: type_declaration
            	    {
            	    pushFollow(FOLLOW_type_declaration_in_compilation_unit69);
            	    type_declaration();

            	    state._fsp--;

            	    stack.push("id2");

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compilation_unit"


    // $ANTLR start "arglist"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:33:1: arglist : ( expression ) ( ( ',' ) ( expression ) )* ;
    public final void arglist() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:33:9: ( ( expression ) ( ( ',' ) ( expression ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:34:3: ( expression ) ( ( ',' ) ( expression ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("arglist");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:2: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:3: expression
            {
            pushFollow(FOLLOW_expression_in_arglist93);
            expression();

            state._fsp--;

            stack.push("id223");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:38: ( ( ',' ) ( expression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:40: ( ',' ) ( expression )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:40: ( ',' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:41: ','
            	    {
            	    match(input,16,FOLLOW_16_in_arglist101); 
            	    stack.push("id224");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:70: ( expression )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:71: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_arglist108);
            	    expression();

            	    state._fsp--;

            	    stack.push("id225");

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "expression"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:38:1: expression : ( ( expressionPrefix ) )? ( expressionMain ) ( ( expressionPost ) )? ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:38:12: ( ( ( expressionPrefix ) )? ( expressionMain ) ( ( expressionPost ) )? )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:39:3: ( ( expressionPrefix ) )? ( expressionMain ) ( ( expressionPost ) )?
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("expression");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:1: ( ( expressionPrefix ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=35 && LA5_0<=37)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:3: ( expressionPrefix )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:3: ( expressionPrefix )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:4: expressionPrefix
                    {
                    pushFollow(FOLLOW_expressionPrefix_in_expression133);
                    expressionPrefix();

                    state._fsp--;

                    stack.push("id176");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:48: ( expressionMain )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:49: expressionMain
            {
            pushFollow(FOLLOW_expressionMain_in_expression142);
            expressionMain();

            state._fsp--;

            stack.push("id177");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:88: ( ( expressionPost ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:90: ( expressionPost )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:90: ( expressionPost )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:91: expressionPost
                    {
                    pushFollow(FOLLOW_expressionPost_in_expression150);
                    expressionPost();

                    state._fsp--;

                    stack.push("id178");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "try_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:43:1: try_statement : ( 'try' ) ( statement_block ) ( ( 'catch' ) ( '(' ) ( parameter ) ( ')' ) ( statement_block ) )* ( ( 'finally' ) ( statement_block ) )? ;
    public final void try_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:43:15: ( ( 'try' ) ( statement_block ) ( ( 'catch' ) ( '(' ) ( parameter ) ( ')' ) ( statement_block ) )* ( ( 'finally' ) ( statement_block ) )? )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:44:3: ( 'try' ) ( statement_block ) ( ( 'catch' ) ( '(' ) ( parameter ) ( ')' ) ( statement_block ) )* ( ( 'finally' ) ( statement_block ) )?
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("try_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:2: ( 'try' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:3: 'try'
            {
            match(input,17,FOLLOW_17_in_try_statement174); 
            stack.push("id155");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:34: ( statement_block )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:35: statement_block
            {
            pushFollow(FOLLOW_statement_block_in_try_statement181);
            statement_block();

            state._fsp--;

            stack.push("id156");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:75: ( ( 'catch' ) ( '(' ) ( parameter ) ( ')' ) ( statement_block ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:77: ( 'catch' ) ( '(' ) ( parameter ) ( ')' ) ( statement_block )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:77: ( 'catch' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:78: 'catch'
            	    {
            	    match(input,18,FOLLOW_18_in_try_statement189); 
            	    stack.push("id157");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:111: ( '(' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:112: '('
            	    {
            	    match(input,19,FOLLOW_19_in_try_statement196); 
            	    stack.push("id158");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:141: ( parameter )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:142: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_try_statement203);
            	    parameter();

            	    state._fsp--;

            	    stack.push("id159");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:177: ( ')' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:178: ')'
            	    {
            	    match(input,20,FOLLOW_20_in_try_statement210); 
            	    stack.push("id160");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:207: ( statement_block )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:208: statement_block
            	    {
            	    pushFollow(FOLLOW_statement_block_in_try_statement217);
            	    statement_block();

            	    state._fsp--;

            	    stack.push("id161");

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:250: ( ( 'finally' ) ( statement_block ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:252: ( 'finally' ) ( statement_block )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:252: ( 'finally' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:253: 'finally'
                    {
                    match(input,21,FOLLOW_21_in_try_statement227); 
                    stack.push("id162");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:288: ( statement_block )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:289: statement_block
                    {
                    pushFollow(FOLLOW_statement_block_in_try_statement234);
                    statement_block();

                    state._fsp--;

                    stack.push("id163");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "try_statement"


    // $ANTLR start "if_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:48:1: if_statement : ( 'if' ) ( '(' ) ( expression ) ( ')' ) ( statement_block ) ( ( 'else' ) ( statement_block ) )? ;
    public final void if_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:48:14: ( ( 'if' ) ( '(' ) ( expression ) ( ')' ) ( statement_block ) ( ( 'else' ) ( statement_block ) )? )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:49:3: ( 'if' ) ( '(' ) ( expression ) ( ')' ) ( statement_block ) ( ( 'else' ) ( statement_block ) )?
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("if_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:2: ( 'if' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:3: 'if'
            {
            match(input,22,FOLLOW_22_in_if_statement258); 
            stack.push("id124");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:33: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:34: '('
            {
            match(input,19,FOLLOW_19_in_if_statement265); 
            stack.push("id125");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:63: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:64: expression
            {
            pushFollow(FOLLOW_expression_in_if_statement272);
            expression();

            state._fsp--;

            stack.push("id126");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:100: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:101: ')'
            {
            match(input,20,FOLLOW_20_in_if_statement279); 
            stack.push("id127");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:130: ( statement_block )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:131: statement_block
            {
            pushFollow(FOLLOW_statement_block_in_if_statement286);
            statement_block();

            state._fsp--;

            stack.push("id128");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:171: ( ( 'else' ) ( statement_block ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:173: ( 'else' ) ( statement_block )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:173: ( 'else' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:174: 'else'
                    {
                    match(input,23,FOLLOW_23_in_if_statement294); 
                    stack.push("id129");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:206: ( statement_block )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:207: statement_block
                    {
                    pushFollow(FOLLOW_statement_block_in_if_statement301);
                    statement_block();

                    state._fsp--;

                    stack.push("id130");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_statement"


    // $ANTLR start "literal_expression"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:53:1: literal_expression : ( ( integer_literal ) | ( FLOAT ) | ( STRING ) | ( IDENTIFIER ) ) ;
    public final void literal_expression() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:53:20: ( ( ( integer_literal ) | ( FLOAT ) | ( STRING ) | ( IDENTIFIER ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:54:3: ( ( integer_literal ) | ( FLOAT ) | ( STRING ) | ( IDENTIFIER ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("literal_expression");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:1: ( ( integer_literal ) | ( FLOAT ) | ( STRING ) | ( IDENTIFIER ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case FLOAT:
                {
                alt10=2;
                }
                break;
            case STRING:
                {
                alt10=3;
                }
                break;
            case IDENTIFIER:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:3: ( integer_literal )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:3: ( integer_literal )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal_expression326);
                    integer_literal();

                    state._fsp--;

                    stack.push("id219");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:46: ( FLOAT )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:46: ( FLOAT )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:47: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal_expression334); 
                    stack.push("id220");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:79: ( STRING )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:79: ( STRING )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:80: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_literal_expression342); 
                    stack.push("id221");

                    }


                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:113: ( IDENTIFIER )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:113: ( IDENTIFIER )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:114: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literal_expression350); 
                    stack.push("id222");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal_expression"


    // $ANTLR start "interface_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:58:1: interface_declaration : ( ( modifier ) )* ( 'interface' ) ( IDENTIFIER ) ( ( 'extends' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' ) ;
    public final void interface_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:58:23: ( ( ( modifier ) )* ( 'interface' ) ( IDENTIFIER ) ( ( 'extends' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:59:3: ( ( modifier ) )* ( 'interface' ) ( IDENTIFIER ) ( ( 'extends' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("interface_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:1: ( ( modifier ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47||(LA11_0>=56 && LA11_0<=64)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:3: ( modifier )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:3: ( modifier )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_interface_declaration374);
            	    modifier();

            	    state._fsp--;

            	    stack.push("id31");

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:39: ( 'interface' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:40: 'interface'
            {
            match(input,24,FOLLOW_24_in_interface_declaration383); 
            stack.push("id32");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:76: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:77: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interface_declaration390); 
            stack.push("id33");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:111: ( ( 'extends' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:113: ( 'extends' ) ( interface_name ) ( ( ',' ) ( interface_name ) )*
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:113: ( 'extends' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:114: 'extends'
                    {
                    match(input,25,FOLLOW_25_in_interface_declaration398); 
                    stack.push("id34");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:148: ( interface_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:149: interface_name
                    {
                    pushFollow(FOLLOW_interface_name_in_interface_declaration405);
                    interface_name();

                    state._fsp--;

                    stack.push("id35");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:187: ( ( ',' ) ( interface_name ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:189: ( ',' ) ( interface_name )
                    	    {
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:189: ( ',' )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:190: ','
                    	    {
                    	    match(input,16,FOLLOW_16_in_interface_declaration413); 
                    	    stack.push("id36");

                    	    }

                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:218: ( interface_name )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:219: interface_name
                    	    {
                    	    pushFollow(FOLLOW_interface_name_in_interface_declaration420);
                    	    interface_name();

                    	    state._fsp--;

                    	    stack.push("id37");

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:262: ( '{' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:263: '{'
            {
            match(input,26,FOLLOW_26_in_interface_declaration431); 
            stack.push("id38");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:290: ( ( field_declaration ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==IDENTIFIER||LA14_0==34||LA14_0==47||LA14_0==52||(LA14_0>=56 && LA14_0<=64)||(LA14_0>=70 && LA14_0<=77)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:292: ( field_declaration )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:292: ( field_declaration )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:293: field_declaration
            	    {
            	    pushFollow(FOLLOW_field_declaration_in_interface_declaration439);
            	    field_declaration();

            	    state._fsp--;

            	    stack.push("id39");

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:337: ( '}' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:338: '}'
            {
            match(input,27,FOLLOW_27_in_interface_declaration448); 
            stack.push("id40");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interface_declaration"


    // $ANTLR start "while_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:63:1: while_statement : ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( statement ) ;
    public final void while_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:63:17: ( ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( statement ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:64:3: ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( statement )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("while_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:2: ( 'while' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:3: 'while'
            {
            match(input,28,FOLLOW_28_in_while_statement470); 
            stack.push("id138");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:36: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:37: '('
            {
            match(input,19,FOLLOW_19_in_while_statement477); 
            stack.push("id139");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:66: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:67: expression
            {
            pushFollow(FOLLOW_expression_in_while_statement484);
            expression();

            state._fsp--;

            stack.push("id140");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:103: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:104: ')'
            {
            match(input,20,FOLLOW_20_in_while_statement491); 
            stack.push("id141");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:133: ( statement )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:134: statement
            {
            pushFollow(FOLLOW_statement_in_while_statement498);
            statement();

            state._fsp--;

            stack.push("id142");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while_statement"


    // $ANTLR start "interface_name"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:68:1: interface_name : ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) ;
    public final void interface_name() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:68:16: ( ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:69:3: ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("interface_name");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:1: ( ( IDENTIFIER ) ( '.' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENTIFIER) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==29) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:3: ( IDENTIFIER ) ( '.' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:3: ( IDENTIFIER )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:4: IDENTIFIER
            	    {
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interface_name521); 
            	    stack.push("id254");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:40: ( '.' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:41: '.'
            	    {
            	    match(input,29,FOLLOW_29_in_interface_name528); 
            	    stack.push("id255");

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:72: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:73: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interface_name537); 
            stack.push("id256");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interface_name"


    // $ANTLR start "class_name"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:73:1: class_name : ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) ;
    public final void class_name() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:73:12: ( ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:74:3: ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("class_name");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:1: ( ( IDENTIFIER ) ( '.' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==29) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:3: ( IDENTIFIER ) ( '.' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:3: ( IDENTIFIER )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:4: IDENTIFIER
            	    {
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_name560); 
            	    stack.push("id251");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:40: ( '.' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:41: '.'
            	    {
            	    match(input,29,FOLLOW_29_in_class_name567); 
            	    stack.push("id252");

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:72: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:75:73: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_name576); 
            stack.push("id253");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "class_name"


    // $ANTLR start "type"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:78:1: type : ( type_specifier ) ( ( '[' ) ( ']' ) )* ;
    public final void type() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:78:6: ( ( type_specifier ) ( ( '[' ) ( ']' ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:79:3: ( type_specifier ) ( ( '[' ) ( ']' ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("type");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:2: ( type_specifier )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:3: type_specifier
            {
            pushFollow(FOLLOW_type_specifier_in_type598);
            type_specifier();

            state._fsp--;

            stack.push("id226");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:42: ( ( '[' ) ( ']' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:44: ( '[' ) ( ']' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:44: ( '[' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:45: '['
            	    {
            	    match(input,30,FOLLOW_30_in_type606); 
            	    stack.push("id227");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:74: ( ']' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:80:75: ']'
            	    {
            	    match(input,31,FOLLOW_31_in_type613); 
            	    stack.push("id228");

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "variable_declarator"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:83:1: variable_declarator : ( IDENTIFIER ) ( ( '[' ) ( ']' ) )* ( ( '=' ) ( variable_initializer ) )? ;
    public final void variable_declarator() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:83:21: ( ( IDENTIFIER ) ( ( '[' ) ( ']' ) )* ( ( '=' ) ( variable_initializer ) )? )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:84:3: ( IDENTIFIER ) ( ( '[' ) ( ']' ) )* ( ( '=' ) ( variable_initializer ) )?
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("variable_declarator");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:2: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:3: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declarator637); 
            stack.push("id72");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:37: ( ( '[' ) ( ']' ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:39: ( '[' ) ( ']' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:39: ( '[' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:40: '['
            	    {
            	    match(input,30,FOLLOW_30_in_variable_declarator645); 
            	    stack.push("id73");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:68: ( ']' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:69: ']'
            	    {
            	    match(input,31,FOLLOW_31_in_variable_declarator652); 
            	    stack.push("id74");

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:98: ( ( '=' ) ( variable_initializer ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:100: ( '=' ) ( variable_initializer )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:100: ( '=' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:101: '='
                    {
                    match(input,32,FOLLOW_32_in_variable_declarator662); 
                    stack.push("id75");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:129: ( variable_initializer )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:85:130: variable_initializer
                    {
                    pushFollow(FOLLOW_variable_initializer_in_variable_declarator669);
                    variable_initializer();

                    state._fsp--;

                    stack.push("id76");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_declarator"


    // $ANTLR start "variable_initializer"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:88:1: variable_initializer : ( ( expression ) | ( '{' ) ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )? ( '}' ) ) ;
    public final void variable_initializer() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:88:22: ( ( ( expression ) | ( '{' ) ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )? ( '}' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:89:3: ( ( expression ) | ( '{' ) ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )? ( '}' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("variable_initializer");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:1: ( ( expression ) | ( '{' ) ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )? ( '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER||LA23_0==16||LA23_0==19||(LA23_0>=29 && LA23_0<=30)||(LA23_0>=35 && LA23_0<=37)||(LA23_0>=43 && LA23_0<=46)) ) {
                alt23=1;
            }
            else if ( (LA23_0==26) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:3: ( expression )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:3: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_variable_initializer694);
                    expression();

                    state._fsp--;

                    stack.push("id77");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:40: ( '{' ) ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )? ( '}' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:40: ( '{' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:41: '{'
                    {
                    match(input,26,FOLLOW_26_in_variable_initializer702); 
                    stack.push("id78");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:68: ( ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )? )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==IDENTIFIER||LA22_0==16||LA22_0==19||LA22_0==26||(LA22_0>=29 && LA22_0<=30)||(LA22_0>=35 && LA22_0<=37)||(LA22_0>=43 && LA22_0<=46)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:70: ( variable_initializer ) ( ( ',' ) ( variable_initializer ) )* ( ( ',' ) )?
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:70: ( variable_initializer )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:71: variable_initializer
                            {
                            pushFollow(FOLLOW_variable_initializer_in_variable_initializer710);
                            variable_initializer();

                            state._fsp--;

                            stack.push("id79");

                            }

                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:115: ( ( ',' ) ( variable_initializer ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==16) ) {
                                    int LA20_1 = input.LA(2);

                                    if ( (LA20_1==IDENTIFIER||LA20_1==16||LA20_1==19||LA20_1==26||(LA20_1>=29 && LA20_1<=30)||(LA20_1>=35 && LA20_1<=37)||(LA20_1>=43 && LA20_1<=46)) ) {
                                        alt20=1;
                                    }


                                }


                                switch (alt20) {
                            	case 1 :
                            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:117: ( ',' ) ( variable_initializer )
                            	    {
                            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:117: ( ',' )
                            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:118: ','
                            	    {
                            	    match(input,16,FOLLOW_16_in_variable_initializer718); 
                            	    stack.push("id80");

                            	    }

                            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:146: ( variable_initializer )
                            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:147: variable_initializer
                            	    {
                            	    pushFollow(FOLLOW_variable_initializer_in_variable_initializer725);
                            	    variable_initializer();

                            	    state._fsp--;

                            	    stack.push("id81");

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:193: ( ( ',' ) )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==16) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:195: ( ',' )
                                    {
                                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:195: ( ',' )
                                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:196: ','
                                    {
                                    match(input,16,FOLLOW_16_in_variable_initializer735); 
                                    stack.push("id82");

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:228: ( '}' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:90:229: '}'
                    {
                    match(input,27,FOLLOW_27_in_variable_initializer746); 
                    stack.push("id83");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_initializer"


    // $ANTLR start "creating_expression"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:93:1: creating_expression : ( 'new' ) ( ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' ) | ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )* | ( '(' ) ( expression ) ( ')' ) ) ;
    public final void creating_expression() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:93:21: ( ( 'new' ) ( ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' ) | ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )* | ( '(' ) ( expression ) ( ')' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:94:3: ( 'new' ) ( ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' ) | ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )* | ( '(' ) ( expression ) ( ')' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("creating_expression");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:2: ( 'new' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:3: 'new'
            {
            match(input,33,FOLLOW_33_in_creating_expression769); 
            stack.push("id205");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:33: ( ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' ) | ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )* | ( '(' ) ( expression ) ( ')' ) )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:35: ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:35: ( class_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:36: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_creating_expression777);
                    class_name();

                    state._fsp--;

                    stack.push("id206");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:72: ( '(' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:73: '('
                    {
                    match(input,19,FOLLOW_19_in_creating_expression784); 
                    stack.push("id207");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:101: ( ( arglist ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER||LA24_0==16||LA24_0==19||(LA24_0>=29 && LA24_0<=30)||(LA24_0>=35 && LA24_0<=37)||(LA24_0>=43 && LA24_0<=46)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:103: ( arglist )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:103: ( arglist )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:104: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_creating_expression792);
                            arglist();

                            state._fsp--;

                            stack.push("id208");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:139: ( ')' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:140: ')'
                    {
                    match(input,20,FOLLOW_20_in_creating_expression801); 
                    stack.push("id209");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:170: ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )*
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:170: ( type_specifier )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:171: type_specifier
                    {
                    pushFollow(FOLLOW_type_specifier_in_creating_expression809);
                    type_specifier();

                    state._fsp--;

                    stack.push("id210");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:210: ( ( '[' ) ( expression ) ( ']' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==30) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==IDENTIFIER||LA25_1==16||LA25_1==19||(LA25_1>=29 && LA25_1<=30)||(LA25_1>=35 && LA25_1<=37)||(LA25_1>=43 && LA25_1<=46)) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:212: ( '[' ) ( expression ) ( ']' )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:212: ( '[' )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:213: '['
                            {
                            match(input,30,FOLLOW_30_in_creating_expression817); 
                            stack.push("id211");

                            }

                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:242: ( expression )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:243: expression
                            {
                            pushFollow(FOLLOW_expression_in_creating_expression824);
                            expression();

                            state._fsp--;

                            stack.push("id212");

                            }

                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:279: ( ']' )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:280: ']'
                            {
                            match(input,31,FOLLOW_31_in_creating_expression831); 
                            stack.push("id213");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:310: ( ( '[' ) ( ']' ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==30) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:312: ( '[' ) ( ']' )
                    	    {
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:312: ( '[' )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:313: '['
                    	    {
                    	    match(input,30,FOLLOW_30_in_creating_expression841); 
                    	    stack.push("id214");

                    	    }

                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:342: ( ']' )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:343: ']'
                    	    {
                    	    match(input,31,FOLLOW_31_in_creating_expression848); 
                    	    stack.push("id215");

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:375: ( '(' ) ( expression ) ( ')' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:375: ( '(' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:376: '('
                    {
                    match(input,19,FOLLOW_19_in_creating_expression858); 
                    stack.push("id216");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:405: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:406: expression
                    {
                    pushFollow(FOLLOW_expression_in_creating_expression865);
                    expression();

                    state._fsp--;

                    stack.push("id217");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:442: ( ')' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:95:443: ')'
                    {
                    match(input,20,FOLLOW_20_in_creating_expression872); 
                    stack.push("id218");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "creating_expression"


    // $ANTLR start "variable_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:98:1: variable_declaration : ( ( modifier ) )* ( type ) ( variable_declarator ) ( ( ',' ) ( variable_declarator ) )* ( ';' ) ;
    public final void variable_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:98:22: ( ( ( modifier ) )* ( type ) ( variable_declarator ) ( ( ',' ) ( variable_declarator ) )* ( ';' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:99:3: ( ( modifier ) )* ( type ) ( variable_declarator ) ( ( ',' ) ( variable_declarator ) )* ( ';' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("variable_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:1: ( ( modifier ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47||(LA28_0>=56 && LA28_0<=64)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:3: ( modifier )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:3: ( modifier )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_variable_declaration896);
            	    modifier();

            	    state._fsp--;

            	    stack.push("id66");

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:39: ( type )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:40: type
            {
            pushFollow(FOLLOW_type_in_variable_declaration905);
            type();

            state._fsp--;

            stack.push("id67");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:69: ( variable_declarator )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:70: variable_declarator
            {
            pushFollow(FOLLOW_variable_declarator_in_variable_declaration912);
            variable_declarator();

            state._fsp--;

            stack.push("id68");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:113: ( ( ',' ) ( variable_declarator ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:115: ( ',' ) ( variable_declarator )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:115: ( ',' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:116: ','
            	    {
            	    match(input,16,FOLLOW_16_in_variable_declaration920); 
            	    stack.push("id69");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:144: ( variable_declarator )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:145: variable_declarator
            	    {
            	    pushFollow(FOLLOW_variable_declarator_in_variable_declaration927);
            	    variable_declarator();

            	    state._fsp--;

            	    stack.push("id70");

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:191: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:100:192: ';'
            {
            match(input,34,FOLLOW_34_in_variable_declaration936); 
            stack.push("id71");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_declaration"


    // $ANTLR start "parameter"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:103:1: parameter : ( type ) ( IDENTIFIER ) ( ( '[' ) ( ']' ) )* ;
    public final void parameter() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:103:11: ( ( type ) ( IDENTIFIER ) ( ( '[' ) ( ']' ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:104:3: ( type ) ( IDENTIFIER ) ( ( '[' ) ( ']' ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("parameter");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:2: ( type )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:3: type
            {
            pushFollow(FOLLOW_type_in_parameter958);
            type();

            state._fsp--;

            stack.push("id89");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:32: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:33: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter965); 
            stack.push("id90");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:67: ( ( '[' ) ( ']' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:69: ( '[' ) ( ']' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:69: ( '[' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:70: '['
            	    {
            	    match(input,30,FOLLOW_30_in_parameter973); 
            	    stack.push("id91");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:98: ( ']' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:105:99: ']'
            	    {
            	    match(input,31,FOLLOW_31_in_parameter980); 
            	    stack.push("id92");

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "constructor_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:108:1: constructor_declaration : ( ( modifier ) )* ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( statement_block ) ;
    public final void constructor_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:108:25: ( ( ( modifier ) )* ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( statement_block ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:109:3: ( ( modifier ) )* ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( statement_block )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("constructor_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:1: ( ( modifier ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47||(LA31_0>=56 && LA31_0<=64)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:3: ( modifier )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:3: ( modifier )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_constructor_declaration1005);
            	    modifier();

            	    state._fsp--;

            	    stack.push("id57");

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:39: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:40: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constructor_declaration1014); 
            stack.push("id58");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:75: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:76: '('
            {
            match(input,19,FOLLOW_19_in_constructor_declaration1021); 
            stack.push("id59");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:103: ( ( parameter_list ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENTIFIER||(LA32_0>=70 && LA32_0<=77)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:105: ( parameter_list )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:105: ( parameter_list )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:106: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_declaration1029);
                    parameter_list();

                    state._fsp--;

                    stack.push("id60");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:147: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:148: ')'
            {
            match(input,20,FOLLOW_20_in_constructor_declaration1038); 
            stack.push("id61");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:176: ( statement_block )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:110:177: statement_block
            {
            pushFollow(FOLLOW_statement_block_in_constructor_declaration1045);
            statement_block();

            state._fsp--;

            stack.push("id62");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constructor_declaration"


    // $ANTLR start "field_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:113:1: field_declaration : ( ( ( doc_comment ) )? ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) ) | ( static_initializer ) | ( ';' ) ) ;
    public final void field_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:113:19: ( ( ( ( doc_comment ) )? ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) ) | ( static_initializer ) | ( ';' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:114:3: ( ( ( doc_comment ) )? ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) ) | ( static_initializer ) | ( ';' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("field_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:1: ( ( ( doc_comment ) )? ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) ) | ( static_initializer ) | ( ';' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case 52:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt35=1;
                }
                break;
            case 47:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==IDENTIFIER||LA35_2==47||(LA35_2>=56 && LA35_2<=64)||(LA35_2>=70 && LA35_2<=77)) ) {
                    alt35=1;
                }
                else if ( (LA35_2==26) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:2: ( ( doc_comment ) )? ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:2: ( ( doc_comment ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==52) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:4: ( doc_comment )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:4: ( doc_comment )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:5: doc_comment
                            {
                            pushFollow(FOLLOW_doc_comment_in_field_declaration1069);
                            doc_comment();

                            state._fsp--;

                            stack.push("id41");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:42: ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) )
                    int alt34=3;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:44: ( method_declaration )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:44: ( method_declaration )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:45: method_declaration
                            {
                            pushFollow(FOLLOW_method_declaration_in_field_declaration1079);
                            method_declaration();

                            state._fsp--;

                            stack.push("id42");

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:89: ( constructor_declaration )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:89: ( constructor_declaration )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:90: constructor_declaration
                            {
                            pushFollow(FOLLOW_constructor_declaration_in_field_declaration1087);
                            constructor_declaration();

                            state._fsp--;

                            stack.push("id43");

                            }


                            }
                            break;
                        case 3 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:139: ( variable_declaration )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:139: ( variable_declaration )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:140: variable_declaration
                            {
                            pushFollow(FOLLOW_variable_declaration_in_field_declaration1095);
                            variable_declaration();

                            state._fsp--;

                            stack.push("id44");

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:187: ( static_initializer )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:187: ( static_initializer )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:188: static_initializer
                    {
                    pushFollow(FOLLOW_static_initializer_in_field_declaration1104);
                    static_initializer();

                    state._fsp--;

                    stack.push("id45");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:232: ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:232: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:115:233: ';'
                    {
                    match(input,34,FOLLOW_34_in_field_declaration1112); 
                    stack.push("id46");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_declaration"


    // $ANTLR start "expressionPrefix"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:118:1: expressionPrefix : ( ( '-' ) | ( '++' ) | ( '--' ) ) ;
    public final void expressionPrefix() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:118:18: ( ( ( '-' ) | ( '++' ) | ( '--' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:119:3: ( ( '-' ) | ( '++' ) | ( '--' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("expressionPrefix");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:1: ( ( '-' ) | ( '++' ) | ( '--' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt36=1;
                }
                break;
            case 36:
                {
                alt36=2;
                }
                break;
            case 37:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:3: ( '-' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:3: ( '-' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:4: '-'
                    {
                    match(input,35,FOLLOW_35_in_expressionPrefix1136); 
                    stack.push("id179");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:34: ( '++' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:34: ( '++' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:35: '++'
                    {
                    match(input,36,FOLLOW_36_in_expressionPrefix1144); 
                    stack.push("id180");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:66: ( '--' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:66: ( '--' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:120:67: '--'
                    {
                    match(input,37,FOLLOW_37_in_expressionPrefix1152); 
                    stack.push("id181");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionPrefix"


    // $ANTLR start "expressionPost"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:123:1: expressionPost : ( '(' ) ( ( arglist ) )? ( ')' ) ;
    public final void expressionPost() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:123:16: ( ( '(' ) ( ( arglist ) )? ( ')' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:124:3: ( '(' ) ( ( arglist ) )? ( ')' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("expressionPost");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:2: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:3: '('
            {
            match(input,19,FOLLOW_19_in_expressionPost1175); 
            stack.push("id198");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:31: ( ( arglist ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENTIFIER||LA37_0==16||LA37_0==19||(LA37_0>=29 && LA37_0<=30)||(LA37_0>=35 && LA37_0<=37)||(LA37_0>=43 && LA37_0<=46)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:33: ( arglist )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:33: ( arglist )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:34: arglist
                    {
                    pushFollow(FOLLOW_arglist_in_expressionPost1183);
                    arglist();

                    state._fsp--;

                    stack.push("id199");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:69: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:125:70: ')'
            {
            match(input,20,FOLLOW_20_in_expressionPost1192); 
            stack.push("id200");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionPost"


    // $ANTLR start "for_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:128:1: for_statement : ( 'for' ) ( '(' ) ( ( variable_declaration ) | ( expression ) ( ';' ) | ( ';' ) ) ( ( expression ) )? ( ';' ) ( ( expression ) )? ( ';' ) ( ')' ) ( statement ) ;
    public final void for_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:128:15: ( ( 'for' ) ( '(' ) ( ( variable_declaration ) | ( expression ) ( ';' ) | ( ';' ) ) ( ( expression ) )? ( ';' ) ( ( expression ) )? ( ';' ) ( ')' ) ( statement ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:129:3: ( 'for' ) ( '(' ) ( ( variable_declaration ) | ( expression ) ( ';' ) | ( ';' ) ) ( ( expression ) )? ( ';' ) ( ( expression ) )? ( ';' ) ( ')' ) ( statement )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("for_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:2: ( 'for' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:3: 'for'
            {
            match(input,38,FOLLOW_38_in_for_statement1214); 
            stack.push("id143");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:34: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:35: '('
            {
            match(input,19,FOLLOW_19_in_for_statement1221); 
            stack.push("id144");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:63: ( ( variable_declaration ) | ( expression ) ( ';' ) | ( ';' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 47:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt38=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==IDENTIFIER||(LA38_2>=29 && LA38_2<=30)) ) {
                    alt38=1;
                }
                else if ( (LA38_2==19||LA38_2==34) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
            case 19:
            case 29:
            case 30:
            case 35:
            case 36:
            case 37:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt38=2;
                }
                break;
            case 34:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:65: ( variable_declaration )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:65: ( variable_declaration )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:66: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_for_statement1229);
                    variable_declaration();

                    state._fsp--;

                    stack.push("id145");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:113: ( expression ) ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:113: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:114: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1237);
                    expression();

                    state._fsp--;

                    stack.push("id146");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:150: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:151: ';'
                    {
                    match(input,34,FOLLOW_34_in_for_statement1244); 
                    stack.push("id147");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:181: ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:181: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:182: ';'
                    {
                    match(input,34,FOLLOW_34_in_for_statement1252); 
                    stack.push("id148");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:211: ( ( expression ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENTIFIER||LA39_0==16||LA39_0==19||(LA39_0>=29 && LA39_0<=30)||(LA39_0>=35 && LA39_0<=37)||(LA39_0>=43 && LA39_0<=46)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:213: ( expression )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:213: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:214: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1261);
                    expression();

                    state._fsp--;

                    stack.push("id149");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:252: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:253: ';'
            {
            match(input,34,FOLLOW_34_in_for_statement1270); 
            stack.push("id150");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:281: ( ( expression ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IDENTIFIER||LA40_0==16||LA40_0==19||(LA40_0>=29 && LA40_0<=30)||(LA40_0>=35 && LA40_0<=37)||(LA40_0>=43 && LA40_0<=46)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:283: ( expression )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:283: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:284: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1278);
                    expression();

                    state._fsp--;

                    stack.push("id151");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:322: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:323: ';'
            {
            match(input,34,FOLLOW_34_in_for_statement1287); 
            stack.push("id152");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:352: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:353: ')'
            {
            match(input,20,FOLLOW_20_in_for_statement1294); 
            stack.push("id153");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:382: ( statement )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:130:383: statement
            {
            pushFollow(FOLLOW_statement_in_for_statement1301);
            statement();

            state._fsp--;

            stack.push("id154");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_statement"


    // $ANTLR start "switch_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:133:1: switch_statement : ( 'switch' ) ( '(' ) ( expression ) ( ')' ) ( '{' ) ( ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) ) )* ( '}' ) ;
    public final void switch_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:133:18: ( ( 'switch' ) ( '(' ) ( expression ) ( ')' ) ( '{' ) ( ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) ) )* ( '}' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:134:3: ( 'switch' ) ( '(' ) ( expression ) ( ')' ) ( '{' ) ( ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) ) )* ( '}' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("switch_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:2: ( 'switch' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:3: 'switch'
            {
            match(input,39,FOLLOW_39_in_switch_statement1323); 
            stack.push("id164");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:37: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:38: '('
            {
            match(input,19,FOLLOW_19_in_switch_statement1330); 
            stack.push("id165");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:67: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:68: expression
            {
            pushFollow(FOLLOW_expression_in_switch_statement1337);
            expression();

            state._fsp--;

            stack.push("id166");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:104: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:105: ')'
            {
            match(input,20,FOLLOW_20_in_switch_statement1344); 
            stack.push("id167");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:134: ( '{' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:135: '{'
            {
            match(input,26,FOLLOW_26_in_switch_statement1351); 
            stack.push("id168");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:163: ( ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==IDENTIFIER||(LA42_0>=16 && LA42_0<=17)||LA42_0==19||LA42_0==22||LA42_0==26||(LA42_0>=28 && LA42_0<=30)||(LA42_0>=34 && LA42_0<=40)||(LA42_0>=42 && LA42_0<=47)||(LA42_0>=55 && LA42_0<=64)||(LA42_0>=65 && LA42_0<=68)||(LA42_0>=70 && LA42_0<=77)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:164: ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:164: ( ( 'case' ) ( expression ) ( ':' ) | ( 'default' ) ( ':' ) | ( statement ) )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case IDENTIFIER:
            	    case 16:
            	    case 17:
            	    case 19:
            	    case 22:
            	    case 26:
            	    case 28:
            	    case 29:
            	    case 30:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 46:
            	    case 47:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 60:
            	    case 61:
            	    case 62:
            	    case 63:
            	    case 64:
            	    case 65:
            	    case 66:
            	    case 67:
            	    case 68:
            	    case 70:
            	    case 71:
            	    case 72:
            	    case 73:
            	    case 74:
            	    case 75:
            	    case 76:
            	    case 77:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:166: ( 'case' ) ( expression ) ( ':' )
            	            {
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:166: ( 'case' )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:167: 'case'
            	            {
            	            match(input,40,FOLLOW_40_in_switch_statement1360); 
            	            stack.push("id169");

            	            }

            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:199: ( expression )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:200: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_switch_statement1367);
            	            expression();

            	            state._fsp--;

            	            stack.push("id170");

            	            }

            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:236: ( ':' )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:237: ':'
            	            {
            	            match(input,41,FOLLOW_41_in_switch_statement1374); 
            	            stack.push("id171");

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:267: ( 'default' ) ( ':' )
            	            {
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:267: ( 'default' )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:268: 'default'
            	            {
            	            match(input,42,FOLLOW_42_in_switch_statement1382); 
            	            stack.push("id172");

            	            }

            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:303: ( ':' )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:304: ':'
            	            {
            	            match(input,41,FOLLOW_41_in_switch_statement1389); 
            	            stack.push("id173");

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:334: ( statement )
            	            {
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:334: ( statement )
            	            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:335: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_switch_statement1397);
            	            statement();

            	            state._fsp--;

            	            stack.push("id174");

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:373: ( '}' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:135:374: '}'
            {
            match(input,27,FOLLOW_27_in_switch_statement1407); 
            stack.push("id175");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "switch_statement"


    // $ANTLR start "expressionMain"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:138:1: expressionMain : ( ( 'null' ) | ( 'super' ) | ( 'this' ) | ( IDENTIFIER ) | ( '(' ) ( expression ) ( ')' ) | ( '[' ) ( expression ) ( ']' ) | ( '.' ) ( expression ) | ( ',' ) ( expression ) | ( 'instanceof' ) ( class_name ) ) ;
    public final void expressionMain() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:138:16: ( ( ( 'null' ) | ( 'super' ) | ( 'this' ) | ( IDENTIFIER ) | ( '(' ) ( expression ) ( ')' ) | ( '[' ) ( expression ) ( ']' ) | ( '.' ) ( expression ) | ( ',' ) ( expression ) | ( 'instanceof' ) ( class_name ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:139:3: ( ( 'null' ) | ( 'super' ) | ( 'this' ) | ( IDENTIFIER ) | ( '(' ) ( expression ) ( ')' ) | ( '[' ) ( expression ) ( ']' ) | ( '.' ) ( expression ) | ( ',' ) ( expression ) | ( 'instanceof' ) ( class_name ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("expressionMain");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:1: ( ( 'null' ) | ( 'super' ) | ( 'this' ) | ( IDENTIFIER ) | ( '(' ) ( expression ) ( ')' ) | ( '[' ) ( expression ) ( ']' ) | ( '.' ) ( expression ) | ( ',' ) ( expression ) | ( 'instanceof' ) ( class_name ) )
            int alt43=9;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt43=1;
                }
                break;
            case 44:
                {
                alt43=2;
                }
                break;
            case 45:
                {
                alt43=3;
                }
                break;
            case IDENTIFIER:
                {
                alt43=4;
                }
                break;
            case 19:
                {
                alt43=5;
                }
                break;
            case 30:
                {
                alt43=6;
                }
                break;
            case 29:
                {
                alt43=7;
                }
                break;
            case 16:
                {
                alt43=8;
                }
                break;
            case 46:
                {
                alt43=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:3: ( 'null' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:3: ( 'null' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:4: 'null'
                    {
                    match(input,43,FOLLOW_43_in_expressionMain1430); 
                    stack.push("id182");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:37: ( 'super' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:37: ( 'super' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:38: 'super'
                    {
                    match(input,44,FOLLOW_44_in_expressionMain1438); 
                    stack.push("id183");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:72: ( 'this' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:72: ( 'this' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:73: 'this'
                    {
                    match(input,45,FOLLOW_45_in_expressionMain1446); 
                    stack.push("id184");

                    }


                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:106: ( IDENTIFIER )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:106: ( IDENTIFIER )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:107: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expressionMain1454); 
                    stack.push("id185");

                    }


                    }
                    break;
                case 5 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:144: ( '(' ) ( expression ) ( ')' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:144: ( '(' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:145: '('
                    {
                    match(input,19,FOLLOW_19_in_expressionMain1462); 
                    stack.push("id186");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:174: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:175: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionMain1469);
                    expression();

                    state._fsp--;

                    stack.push("id187");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:211: ( ')' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:212: ')'
                    {
                    match(input,20,FOLLOW_20_in_expressionMain1476); 
                    stack.push("id188");

                    }


                    }
                    break;
                case 6 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:242: ( '[' ) ( expression ) ( ']' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:242: ( '[' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:243: '['
                    {
                    match(input,30,FOLLOW_30_in_expressionMain1484); 
                    stack.push("id189");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:272: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:273: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionMain1491);
                    expression();

                    state._fsp--;

                    stack.push("id190");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:309: ( ']' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:310: ']'
                    {
                    match(input,31,FOLLOW_31_in_expressionMain1498); 
                    stack.push("id191");

                    }


                    }
                    break;
                case 7 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:340: ( '.' ) ( expression )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:340: ( '.' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:341: '.'
                    {
                    match(input,29,FOLLOW_29_in_expressionMain1506); 
                    stack.push("id192");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:370: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:371: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionMain1513);
                    expression();

                    state._fsp--;

                    stack.push("id193");

                    }


                    }
                    break;
                case 8 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:408: ( ',' ) ( expression )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:408: ( ',' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:409: ','
                    {
                    match(input,16,FOLLOW_16_in_expressionMain1521); 
                    stack.push("id194");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:438: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:439: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionMain1528);
                    expression();

                    state._fsp--;

                    stack.push("id195");

                    }


                    }
                    break;
                case 9 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:476: ( 'instanceof' ) ( class_name )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:476: ( 'instanceof' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:477: 'instanceof'
                    {
                    match(input,46,FOLLOW_46_in_expressionMain1536); 
                    stack.push("id196");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:515: ( class_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:140:516: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_expressionMain1543);
                    class_name();

                    state._fsp--;

                    stack.push("id197");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionMain"


    // $ANTLR start "classOrInterface_name"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:143:1: classOrInterface_name : ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) ;
    public final void classOrInterface_name() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:143:23: ( ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:144:3: ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("classOrInterface_name");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:1: ( ( IDENTIFIER ) ( '.' ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==IDENTIFIER) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==29) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:3: ( IDENTIFIER ) ( '.' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:3: ( IDENTIFIER )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:4: IDENTIFIER
            	    {
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterface_name1567); 
            	    stack.push("id257");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:40: ( '.' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:41: '.'
            	    {
            	    match(input,29,FOLLOW_29_in_classOrInterface_name1574); 
            	    stack.push("id258");

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:72: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:145:73: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterface_name1583); 
            stack.push("id259");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classOrInterface_name"


    // $ANTLR start "static_initializer"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:148:1: static_initializer : ( 'static' ) ( statement_block ) ;
    public final void static_initializer() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:148:20: ( ( 'static' ) ( statement_block ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:149:3: ( 'static' ) ( statement_block )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("static_initializer");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:150:2: ( 'static' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:150:3: 'static'
            {
            match(input,47,FOLLOW_47_in_static_initializer1605); 
            stack.push("id84");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:150:36: ( statement_block )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:150:37: statement_block
            {
            pushFollow(FOLLOW_statement_block_in_static_initializer1612);
            statement_block();

            state._fsp--;

            stack.push("id85");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "static_initializer"


    // $ANTLR start "import_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:153:1: import_statement : ( 'import' ) ( ( package_name ) ( '.' ) ( '*' ) ( ';' ) | ( class_name ) ) ( ';' ) ;
    public final void import_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:153:18: ( ( 'import' ) ( ( package_name ) ( '.' ) ( '*' ) ( ';' ) | ( class_name ) ) ( ';' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:154:3: ( 'import' ) ( ( package_name ) ( '.' ) ( '*' ) ( ';' ) | ( class_name ) ) ( ';' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("import_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:2: ( 'import' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:3: 'import'
            {
            match(input,48,FOLLOW_48_in_import_statement1634); 
            stack.push("id6");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:34: ( ( package_name ) ( '.' ) ( '*' ) ( ';' ) | ( class_name ) )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:36: ( package_name ) ( '.' ) ( '*' ) ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:36: ( package_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:37: package_name
                    {
                    pushFollow(FOLLOW_package_name_in_import_statement1642);
                    package_name();

                    state._fsp--;

                    stack.push("id7");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:73: ( '.' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:74: '.'
                    {
                    match(input,29,FOLLOW_29_in_import_statement1649); 
                    stack.push("id8");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:101: ( '*' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:102: '*'
                    {
                    match(input,49,FOLLOW_49_in_import_statement1656); 
                    stack.push("id9");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:129: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:130: ';'
                    {
                    match(input,34,FOLLOW_34_in_import_statement1663); 
                    stack.push("id10");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:159: ( class_name )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:159: ( class_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:160: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_import_statement1671);
                    class_name();

                    state._fsp--;

                    stack.push("id11");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:196: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:155:197: ';'
            {
            match(input,34,FOLLOW_34_in_import_statement1679); 
            stack.push("id12");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_statement"


    // $ANTLR start "class_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:158:1: class_declaration : ( ( modifier ) )* ( 'class' ) ( IDENTIFIER ) ( ( 'extends' ) ( class_name ) )? ( ( 'implements' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' ) ;
    public final void class_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:158:19: ( ( ( modifier ) )* ( 'class' ) ( IDENTIFIER ) ( ( 'extends' ) ( class_name ) )? ( ( 'implements' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:159:3: ( ( modifier ) )* ( 'class' ) ( IDENTIFIER ) ( ( 'extends' ) ( class_name ) )? ( ( 'implements' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )? ( '{' ) ( ( field_declaration ) )* ( '}' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("class_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:1: ( ( modifier ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==47||(LA46_0>=56 && LA46_0<=64)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:3: ( modifier )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:3: ( modifier )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_class_declaration1702);
            	    modifier();

            	    state._fsp--;

            	    stack.push("id19");

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:39: ( 'class' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:40: 'class'
            {
            match(input,50,FOLLOW_50_in_class_declaration1711); 
            stack.push("id20");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:72: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:73: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration1718); 
            stack.push("id21");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:107: ( ( 'extends' ) ( class_name ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:109: ( 'extends' ) ( class_name )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:109: ( 'extends' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:110: 'extends'
                    {
                    match(input,25,FOLLOW_25_in_class_declaration1726); 
                    stack.push("id22");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:144: ( class_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:145: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_class_declaration1733);
                    class_name();

                    state._fsp--;

                    stack.push("id23");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:181: ( ( 'implements' ) ( interface_name ) ( ( ',' ) ( interface_name ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:183: ( 'implements' ) ( interface_name ) ( ( ',' ) ( interface_name ) )*
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:183: ( 'implements' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:184: 'implements'
                    {
                    match(input,51,FOLLOW_51_in_class_declaration1743); 
                    stack.push("id24");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:221: ( interface_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:222: interface_name
                    {
                    pushFollow(FOLLOW_interface_name_in_class_declaration1750);
                    interface_name();

                    state._fsp--;

                    stack.push("id25");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:260: ( ( ',' ) ( interface_name ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==16) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:262: ( ',' ) ( interface_name )
                    	    {
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:262: ( ',' )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:263: ','
                    	    {
                    	    match(input,16,FOLLOW_16_in_class_declaration1758); 
                    	    stack.push("id26");

                    	    }

                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:291: ( interface_name )
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:292: interface_name
                    	    {
                    	    pushFollow(FOLLOW_interface_name_in_class_declaration1765);
                    	    interface_name();

                    	    state._fsp--;

                    	    stack.push("id27");

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:335: ( '{' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:336: '{'
            {
            match(input,26,FOLLOW_26_in_class_declaration1776); 
            stack.push("id28");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:363: ( ( field_declaration ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==IDENTIFIER||LA50_0==34||LA50_0==47||LA50_0==52||(LA50_0>=56 && LA50_0<=64)||(LA50_0>=70 && LA50_0<=77)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:365: ( field_declaration )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:365: ( field_declaration )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:366: field_declaration
            	    {
            	    pushFollow(FOLLOW_field_declaration_in_class_declaration1784);
            	    field_declaration();

            	    state._fsp--;

            	    stack.push("id29");

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:410: ( '}' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:160:411: '}'
            {
            match(input,27,FOLLOW_27_in_class_declaration1793); 
            stack.push("id30");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "class_declaration"


    // $ANTLR start "doc_comment"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:163:1: doc_comment : ( '/**' ) ( '... text ...' ) ( '*/' ) ;
    public final void doc_comment() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:163:13: ( ( '/**' ) ( '... text ...' ) ( '*/' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:164:3: ( '/**' ) ( '... text ...' ) ( '*/' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("doc_comment");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:2: ( '/**' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:3: '/**'
            {
            match(input,52,FOLLOW_52_in_doc_comment1815); 
            stack.push("id16");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:33: ( '... text ...' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:34: '... text ...'
            {
            match(input,53,FOLLOW_53_in_doc_comment1822); 
            stack.push("id17");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:73: ( '*/' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:165:74: '*/'
            {
            match(input,54,FOLLOW_54_in_doc_comment1829); 
            stack.push("id18");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "doc_comment"


    // $ANTLR start "casting_expression"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:168:1: casting_expression : ( '(' ) ( type ) ( ')' ) ( expression ) ;
    public final void casting_expression() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:168:20: ( ( '(' ) ( type ) ( ')' ) ( expression ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:169:3: ( '(' ) ( type ) ( ')' ) ( expression )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("casting_expression");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:2: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:3: '('
            {
            match(input,19,FOLLOW_19_in_casting_expression1851); 
            stack.push("id201");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:32: ( type )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:33: type
            {
            pushFollow(FOLLOW_type_in_casting_expression1858);
            type();

            state._fsp--;

            stack.push("id202");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:63: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:64: ')'
            {
            match(input,20,FOLLOW_20_in_casting_expression1865); 
            stack.push("id203");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:93: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:170:94: expression
            {
            pushFollow(FOLLOW_expression_in_casting_expression1872);
            expression();

            state._fsp--;

            stack.push("id204");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "casting_expression"


    // $ANTLR start "package_name"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:173:1: package_name : ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) ;
    public final void package_name() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:173:14: ( ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:174:3: ( ( IDENTIFIER ) ( '.' ) )* ( IDENTIFIER )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("package_name");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:1: ( ( IDENTIFIER ) ( '.' ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==IDENTIFIER) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==29) ) {
                        int LA51_2 = input.LA(3);

                        if ( (LA51_2==IDENTIFIER) ) {
                            alt51=1;
                        }


                    }


                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:3: ( IDENTIFIER ) ( '.' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:3: ( IDENTIFIER )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:4: IDENTIFIER
            	    {
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_package_name1895); 
            	    stack.push("id248");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:40: ( '.' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:41: '.'
            	    {
            	    match(input,29,FOLLOW_29_in_package_name1902); 
            	    stack.push("id249");

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:72: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:175:73: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_package_name1911); 
            stack.push("id250");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "package_name"


    // $ANTLR start "do_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:178:1: do_statement : ( 'do' ) ( statement_block ) ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( ';' ) ;
    public final void do_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:178:14: ( ( 'do' ) ( statement_block ) ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( ';' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:179:3: ( 'do' ) ( statement_block ) ( 'while' ) ( '(' ) ( expression ) ( ')' ) ( ';' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("do_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:2: ( 'do' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:3: 'do'
            {
            match(input,55,FOLLOW_55_in_do_statement1933); 
            stack.push("id131");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:33: ( statement_block )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:34: statement_block
            {
            pushFollow(FOLLOW_statement_block_in_do_statement1940);
            statement_block();

            state._fsp--;

            stack.push("id132");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:75: ( 'while' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:76: 'while'
            {
            match(input,28,FOLLOW_28_in_do_statement1947); 
            stack.push("id133");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:109: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:110: '('
            {
            match(input,19,FOLLOW_19_in_do_statement1954); 
            stack.push("id134");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:139: ( expression )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:140: expression
            {
            pushFollow(FOLLOW_expression_in_do_statement1961);
            expression();

            state._fsp--;

            stack.push("id135");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:176: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:177: ')'
            {
            match(input,20,FOLLOW_20_in_do_statement1968); 
            stack.push("id136");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:206: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:180:207: ';'
            {
            match(input,34,FOLLOW_34_in_do_statement1975); 
            stack.push("id137");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "do_statement"


    // $ANTLR start "type_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:183:1: type_declaration : ( ( doc_comment ) )? ( ( class_declaration ) | ( interface_declaration ) ) ;
    public final void type_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:183:18: ( ( ( doc_comment ) )? ( ( class_declaration ) | ( interface_declaration ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:184:3: ( ( doc_comment ) )? ( ( class_declaration ) | ( interface_declaration ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("type_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:1: ( ( doc_comment ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:3: ( doc_comment )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:3: ( doc_comment )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:4: doc_comment
                    {
                    pushFollow(FOLLOW_doc_comment_in_type_declaration1998);
                    doc_comment();

                    state._fsp--;

                    stack.push("id13");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:41: ( ( class_declaration ) | ( interface_declaration ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:43: ( class_declaration )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:43: ( class_declaration )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:44: class_declaration
                    {
                    pushFollow(FOLLOW_class_declaration_in_type_declaration2008);
                    class_declaration();

                    state._fsp--;

                    stack.push("id14");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:87: ( interface_declaration )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:87: ( interface_declaration )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:185:88: interface_declaration
                    {
                    pushFollow(FOLLOW_interface_declaration_in_type_declaration2016);
                    interface_declaration();

                    state._fsp--;

                    stack.push("id15");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_declaration"


    // $ANTLR start "modifier"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:188:1: modifier : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'static' ) | ( 'final' ) | ( 'native' ) | ( 'synchronized' ) | ( 'abstract' ) | ( 'threadsafe' ) | ( 'transient' ) ) ;
    public final void modifier() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:188:10: ( ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'static' ) | ( 'final' ) | ( 'native' ) | ( 'synchronized' ) | ( 'abstract' ) | ( 'threadsafe' ) | ( 'transient' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:189:3: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'static' ) | ( 'final' ) | ( 'native' ) | ( 'synchronized' ) | ( 'abstract' ) | ( 'threadsafe' ) | ( 'transient' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("modifier");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'static' ) | ( 'final' ) | ( 'native' ) | ( 'synchronized' ) | ( 'abstract' ) | ( 'threadsafe' ) | ( 'transient' ) )
            int alt54=10;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt54=1;
                }
                break;
            case 57:
                {
                alt54=2;
                }
                break;
            case 58:
                {
                alt54=3;
                }
                break;
            case 47:
                {
                alt54=4;
                }
                break;
            case 59:
                {
                alt54=5;
                }
                break;
            case 60:
                {
                alt54=6;
                }
                break;
            case 61:
                {
                alt54=7;
                }
                break;
            case 62:
                {
                alt54=8;
                }
                break;
            case 63:
                {
                alt54=9;
                }
                break;
            case 64:
                {
                alt54=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:3: ( 'public' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:3: ( 'public' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:4: 'public'
                    {
                    match(input,56,FOLLOW_56_in_modifier2040); 
                    stack.push("id238");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:39: ( 'private' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:39: ( 'private' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:40: 'private'
                    {
                    match(input,57,FOLLOW_57_in_modifier2048); 
                    stack.push("id239");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:76: ( 'protected' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:76: ( 'protected' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:77: 'protected'
                    {
                    match(input,58,FOLLOW_58_in_modifier2056); 
                    stack.push("id240");

                    }


                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:115: ( 'static' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:115: ( 'static' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:116: 'static'
                    {
                    match(input,47,FOLLOW_47_in_modifier2064); 
                    stack.push("id241");

                    }


                    }
                    break;
                case 5 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:151: ( 'final' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:151: ( 'final' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:152: 'final'
                    {
                    match(input,59,FOLLOW_59_in_modifier2072); 
                    stack.push("id242");

                    }


                    }
                    break;
                case 6 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:186: ( 'native' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:186: ( 'native' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:187: 'native'
                    {
                    match(input,60,FOLLOW_60_in_modifier2080); 
                    stack.push("id243");

                    }


                    }
                    break;
                case 7 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:222: ( 'synchronized' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:222: ( 'synchronized' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:223: 'synchronized'
                    {
                    match(input,61,FOLLOW_61_in_modifier2088); 
                    stack.push("id244");

                    }


                    }
                    break;
                case 8 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:264: ( 'abstract' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:264: ( 'abstract' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:265: 'abstract'
                    {
                    match(input,62,FOLLOW_62_in_modifier2096); 
                    stack.push("id245");

                    }


                    }
                    break;
                case 9 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:302: ( 'threadsafe' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:302: ( 'threadsafe' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:303: 'threadsafe'
                    {
                    match(input,63,FOLLOW_63_in_modifier2104); 
                    stack.push("id246");

                    }


                    }
                    break;
                case 10 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:342: ( 'transient' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:342: ( 'transient' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:190:343: 'transient'
                    {
                    match(input,64,FOLLOW_64_in_modifier2112); 
                    stack.push("id247");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:193:1: statement : ( ( variable_declaration ) | ( expression ) ( ';' ) | ( statement_block ) | ( if_statement ) | ( do_statement ) | ( while_statement ) | ( for_statement ) | ( try_statement ) | ( switch_statement ) | ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement ) | ( 'return' ) ( ( expression ) )? ( ';' ) | ( 'throw' ) ( expression ) ( ';' ) | ( IDENTIFIER ) ( ':' ) ( statement ) | ( 'break' ) ( ( IDENTIFIER ) )? ( ';' ) | ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' ) | ( ';' ) ) ;
    public final void statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:193:11: ( ( ( variable_declaration ) | ( expression ) ( ';' ) | ( statement_block ) | ( if_statement ) | ( do_statement ) | ( while_statement ) | ( for_statement ) | ( try_statement ) | ( switch_statement ) | ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement ) | ( 'return' ) ( ( expression ) )? ( ';' ) | ( 'throw' ) ( expression ) ( ';' ) | ( IDENTIFIER ) ( ':' ) ( statement ) | ( 'break' ) ( ( IDENTIFIER ) )? ( ';' ) | ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' ) | ( ';' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:194:3: ( ( variable_declaration ) | ( expression ) ( ';' ) | ( statement_block ) | ( if_statement ) | ( do_statement ) | ( while_statement ) | ( for_statement ) | ( try_statement ) | ( switch_statement ) | ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement ) | ( 'return' ) ( ( expression ) )? ( ';' ) | ( 'throw' ) ( expression ) ( ';' ) | ( IDENTIFIER ) ( ':' ) ( statement ) | ( 'break' ) ( ( IDENTIFIER ) )? ( ';' ) | ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' ) | ( ';' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1: ( ( variable_declaration ) | ( expression ) ( ';' ) | ( statement_block ) | ( if_statement ) | ( do_statement ) | ( while_statement ) | ( for_statement ) | ( try_statement ) | ( switch_statement ) | ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement ) | ( 'return' ) ( ( expression ) )? ( ';' ) | ( 'throw' ) ( expression ) ( ';' ) | ( IDENTIFIER ) ( ':' ) ( statement ) | ( 'break' ) ( ( IDENTIFIER ) )? ( ';' ) | ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' ) | ( ';' ) )
            int alt58=16;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:3: ( variable_declaration )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:3: ( variable_declaration )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:4: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_statement2136);
                    variable_declaration();

                    state._fsp--;

                    stack.push("id93");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:50: ( expression ) ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:50: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:51: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2144);
                    expression();

                    state._fsp--;

                    stack.push("id94");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:86: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:87: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2151); 
                    stack.push("id95");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:116: ( statement_block )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:116: ( statement_block )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:117: statement_block
                    {
                    pushFollow(FOLLOW_statement_block_in_statement2159);
                    statement_block();

                    state._fsp--;

                    stack.push("id96");

                    }


                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:158: ( if_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:158: ( if_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:159: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement2167);
                    if_statement();

                    state._fsp--;

                    stack.push("id97");

                    }


                    }
                    break;
                case 5 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:197: ( do_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:197: ( do_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:198: do_statement
                    {
                    pushFollow(FOLLOW_do_statement_in_statement2175);
                    do_statement();

                    state._fsp--;

                    stack.push("id98");

                    }


                    }
                    break;
                case 6 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:236: ( while_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:236: ( while_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:237: while_statement
                    {
                    pushFollow(FOLLOW_while_statement_in_statement2183);
                    while_statement();

                    state._fsp--;

                    stack.push("id99");

                    }


                    }
                    break;
                case 7 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:278: ( for_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:278: ( for_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:279: for_statement
                    {
                    pushFollow(FOLLOW_for_statement_in_statement2191);
                    for_statement();

                    state._fsp--;

                    stack.push("id100");

                    }


                    }
                    break;
                case 8 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:319: ( try_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:319: ( try_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:320: try_statement
                    {
                    pushFollow(FOLLOW_try_statement_in_statement2199);
                    try_statement();

                    state._fsp--;

                    stack.push("id101");

                    }


                    }
                    break;
                case 9 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:360: ( switch_statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:360: ( switch_statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:361: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_statement2207);
                    switch_statement();

                    state._fsp--;

                    stack.push("id102");

                    }


                    }
                    break;
                case 10 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:404: ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:404: ( 'synchronized' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:405: 'synchronized'
                    {
                    match(input,61,FOLLOW_61_in_statement2215); 
                    stack.push("id103");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:445: ( '(' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:446: '('
                    {
                    match(input,19,FOLLOW_19_in_statement2222); 
                    stack.push("id104");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:475: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:476: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2229);
                    expression();

                    state._fsp--;

                    stack.push("id105");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:512: ( ')' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:513: ')'
                    {
                    match(input,20,FOLLOW_20_in_statement2236); 
                    stack.push("id106");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:542: ( statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:543: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement2243);
                    statement();

                    state._fsp--;

                    stack.push("id107");

                    }


                    }
                    break;
                case 11 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:579: ( 'return' ) ( ( expression ) )? ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:579: ( 'return' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:580: 'return'
                    {
                    match(input,65,FOLLOW_65_in_statement2251); 
                    stack.push("id108");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:613: ( ( expression ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==IDENTIFIER||LA55_0==16||LA55_0==19||(LA55_0>=29 && LA55_0<=30)||(LA55_0>=35 && LA55_0<=37)||(LA55_0>=43 && LA55_0<=46)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:615: ( expression )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:615: ( expression )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:616: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2259);
                            expression();

                            state._fsp--;

                            stack.push("id109");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:654: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:655: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2268); 
                    stack.push("id110");

                    }


                    }
                    break;
                case 12 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:685: ( 'throw' ) ( expression ) ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:685: ( 'throw' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:686: 'throw'
                    {
                    match(input,66,FOLLOW_66_in_statement2276); 
                    stack.push("id111");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:719: ( expression )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:720: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2283);
                    expression();

                    state._fsp--;

                    stack.push("id112");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:756: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:757: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2290); 
                    stack.push("id113");

                    }


                    }
                    break;
                case 13 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:787: ( IDENTIFIER ) ( ':' ) ( statement )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:787: ( IDENTIFIER )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:788: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2298); 
                    stack.push("id114");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:824: ( ':' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:825: ':'
                    {
                    match(input,41,FOLLOW_41_in_statement2305); 
                    stack.push("id115");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:854: ( statement )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:855: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement2312);
                    statement();

                    state._fsp--;

                    stack.push("id116");

                    }


                    }
                    break;
                case 14 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:891: ( 'break' ) ( ( IDENTIFIER ) )? ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:891: ( 'break' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:892: 'break'
                    {
                    match(input,67,FOLLOW_67_in_statement2320); 
                    stack.push("id117");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:924: ( ( IDENTIFIER ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==IDENTIFIER) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:926: ( IDENTIFIER )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:926: ( IDENTIFIER )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:927: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2328); 
                            stack.push("id118");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:965: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:966: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2337); 
                    stack.push("id119");

                    }


                    }
                    break;
                case 15 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:996: ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:996: ( 'continue' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:997: 'continue'
                    {
                    match(input,68,FOLLOW_68_in_statement2345); 
                    stack.push("id120");

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1032: ( ( IDENTIFIER ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==IDENTIFIER) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1034: ( IDENTIFIER )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1034: ( IDENTIFIER )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1035: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2353); 
                            stack.push("id121");

                            }


                            }
                            break;

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1073: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1074: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2362); 
                    stack.push("id122");

                    }


                    }
                    break;
                case 16 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1104: ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1104: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:195:1105: ';'
                    {
                    match(input,34,FOLLOW_34_in_statement2370); 
                    stack.push("id123");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "package_statement"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:198:1: package_statement : ( 'package' ) ( package_name ) ( ';' ) ;
    public final void package_statement() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:198:19: ( ( 'package' ) ( package_name ) ( ';' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:199:3: ( 'package' ) ( package_name ) ( ';' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("package_statement");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:2: ( 'package' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:3: 'package'
            {
            match(input,69,FOLLOW_69_in_package_statement2393); 
            stack.push("id3");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:36: ( package_name )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:37: package_name
            {
            pushFollow(FOLLOW_package_name_in_package_statement2400);
            package_name();

            state._fsp--;

            stack.push("id4");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:73: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:200:74: ';'
            {
            match(input,34,FOLLOW_34_in_package_statement2407); 
            stack.push("id5");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "package_statement"


    // $ANTLR start "statement_block"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:203:1: statement_block : ( '{' ) ( ( statement ) )* ( '}' ) ;
    public final void statement_block() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:203:17: ( ( '{' ) ( ( statement ) )* ( '}' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:204:3: ( '{' ) ( ( statement ) )* ( '}' )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("statement_block");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:2: ( '{' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:3: '{'
            {
            match(input,26,FOLLOW_26_in_statement_block2429); 
            stack.push("id63");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:30: ( ( statement ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==IDENTIFIER||(LA59_0>=16 && LA59_0<=17)||LA59_0==19||LA59_0==22||LA59_0==26||(LA59_0>=28 && LA59_0<=30)||(LA59_0>=34 && LA59_0<=39)||(LA59_0>=43 && LA59_0<=47)||(LA59_0>=55 && LA59_0<=64)||(LA59_0>=65 && LA59_0<=68)||(LA59_0>=70 && LA59_0<=77)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:32: ( statement )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:32: ( statement )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:33: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_block2437);
            	    statement();

            	    state._fsp--;

            	    stack.push("id64");

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:69: ( '}' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:205:70: '}'
            {
            match(input,27,FOLLOW_27_in_statement_block2446); 
            stack.push("id65");

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement_block"


    // $ANTLR start "method_declaration"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:208:1: method_declaration : ( ( modifier ) )* ( type ) ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( ( '[' ) ( ']' ) )* ( ( statement_block ) | ( ';' ) ) ;
    public final void method_declaration() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:208:20: ( ( ( modifier ) )* ( type ) ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( ( '[' ) ( ']' ) )* ( ( statement_block ) | ( ';' ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:209:3: ( ( modifier ) )* ( type ) ( IDENTIFIER ) ( '(' ) ( ( parameter_list ) )? ( ')' ) ( ( '[' ) ( ']' ) )* ( ( statement_block ) | ( ';' ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("method_declaration");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:1: ( ( modifier ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==47||(LA60_0>=56 && LA60_0<=64)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:3: ( modifier )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:3: ( modifier )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_method_declaration2469);
            	    modifier();

            	    state._fsp--;

            	    stack.push("id47");

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:39: ( type )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:40: type
            {
            pushFollow(FOLLOW_type_in_method_declaration2478);
            type();

            state._fsp--;

            stack.push("id48");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:69: ( IDENTIFIER )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:70: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_declaration2485); 
            stack.push("id49");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:105: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:106: '('
            {
            match(input,19,FOLLOW_19_in_method_declaration2492); 
            stack.push("id50");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:133: ( ( parameter_list ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER||(LA61_0>=70 && LA61_0<=77)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:135: ( parameter_list )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:135: ( parameter_list )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:136: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_method_declaration2500);
                    parameter_list();

                    state._fsp--;

                    stack.push("id51");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:177: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:178: ')'
            {
            match(input,20,FOLLOW_20_in_method_declaration2509); 
            stack.push("id52");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:205: ( ( '[' ) ( ']' ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==30) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:207: ( '[' ) ( ']' )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:207: ( '[' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:208: '['
            	    {
            	    match(input,30,FOLLOW_30_in_method_declaration2517); 
            	    stack.push("id53");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:236: ( ']' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:237: ']'
            	    {
            	    match(input,31,FOLLOW_31_in_method_declaration2524); 
            	    stack.push("id54");

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:266: ( ( statement_block ) | ( ';' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==26) ) {
                alt63=1;
            }
            else if ( (LA63_0==34) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:268: ( statement_block )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:268: ( statement_block )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:269: statement_block
                    {
                    pushFollow(FOLLOW_statement_block_in_method_declaration2534);
                    statement_block();

                    state._fsp--;

                    stack.push("id55");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:310: ( ';' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:310: ( ';' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:210:311: ';'
                    {
                    match(input,34,FOLLOW_34_in_method_declaration2542); 
                    stack.push("id56");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "method_declaration"


    // $ANTLR start "type_specifier"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:213:1: type_specifier : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( classOrInterface_name ) ) ;
    public final void type_specifier() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:213:16: ( ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( classOrInterface_name ) ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:214:3: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( classOrInterface_name ) )
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("type_specifier");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( classOrInterface_name ) )
            int alt64=9;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt64=1;
                }
                break;
            case 71:
                {
                alt64=2;
                }
                break;
            case 72:
                {
                alt64=3;
                }
                break;
            case 73:
                {
                alt64=4;
                }
                break;
            case 74:
                {
                alt64=5;
                }
                break;
            case 75:
                {
                alt64=6;
                }
                break;
            case 76:
                {
                alt64=7;
                }
                break;
            case 77:
                {
                alt64=8;
                }
                break;
            case IDENTIFIER:
                {
                alt64=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:3: ( 'boolean' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:3: ( 'boolean' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:4: 'boolean'
                    {
                    match(input,70,FOLLOW_70_in_type_specifier2566); 
                    stack.push("id229");

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:40: ( 'byte' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:40: ( 'byte' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:41: 'byte'
                    {
                    match(input,71,FOLLOW_71_in_type_specifier2574); 
                    stack.push("id230");

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:74: ( 'char' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:74: ( 'char' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:75: 'char'
                    {
                    match(input,72,FOLLOW_72_in_type_specifier2582); 
                    stack.push("id231");

                    }


                    }
                    break;
                case 4 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:108: ( 'short' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:108: ( 'short' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:109: 'short'
                    {
                    match(input,73,FOLLOW_73_in_type_specifier2590); 
                    stack.push("id232");

                    }


                    }
                    break;
                case 5 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:143: ( 'int' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:143: ( 'int' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:144: 'int'
                    {
                    match(input,74,FOLLOW_74_in_type_specifier2598); 
                    stack.push("id233");

                    }


                    }
                    break;
                case 6 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:176: ( 'float' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:176: ( 'float' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:177: 'float'
                    {
                    match(input,75,FOLLOW_75_in_type_specifier2606); 
                    stack.push("id234");

                    }


                    }
                    break;
                case 7 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:211: ( 'long' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:211: ( 'long' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:212: 'long'
                    {
                    match(input,76,FOLLOW_76_in_type_specifier2614); 
                    stack.push("id235");

                    }


                    }
                    break;
                case 8 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:245: ( 'double' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:245: ( 'double' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:246: 'double'
                    {
                    match(input,77,FOLLOW_77_in_type_specifier2622); 
                    stack.push("id236");

                    }


                    }
                    break;
                case 9 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:281: ( classOrInterface_name )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:281: ( classOrInterface_name )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:215:282: classOrInterface_name
                    {
                    pushFollow(FOLLOW_classOrInterface_name_in_type_specifier2630);
                    classOrInterface_name();

                    state._fsp--;

                    stack.push("id237");

                    }


                    }
                    break;

            }

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_specifier"


    // $ANTLR start "integer_literal"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:218:1: integer_literal : ( INT ) ( ( ( 'l' ) )? | ( '0x' ) ) ( HEX ) ( ( HEX ) )* ;
    public final void integer_literal() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:218:17: ( ( INT ) ( ( ( 'l' ) )? | ( '0x' ) ) ( HEX ) ( ( HEX ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:219:3: ( INT ) ( ( ( 'l' ) )? | ( '0x' ) ) ( HEX ) ( ( HEX ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("integer_literal");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:2: ( INT )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:3: INT
            {
            match(input,INT,FOLLOW_INT_in_integer_literal2653); 
            stack.push("id260");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:31: ( ( ( 'l' ) )? | ( '0x' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==HEX||LA66_0==78) ) {
                alt66=1;
            }
            else if ( (LA66_0==79) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:32: ( ( 'l' ) )?
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:32: ( ( 'l' ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==78) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:34: ( 'l' )
                            {
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:34: ( 'l' )
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:35: 'l'
                            {
                            match(input,78,FOLLOW_78_in_integer_literal2662); 
                            stack.push("id261");

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:67: ( '0x' )
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:67: ( '0x' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:68: '0x'
                    {
                    match(input,79,FOLLOW_79_in_integer_literal2672); 
                    stack.push("id262");

                    }


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:99: ( HEX )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:100: HEX
            {
            match(input,HEX,FOLLOW_HEX_in_integer_literal2680); 
            stack.push("id263");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:128: ( ( HEX ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==HEX) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:130: ( HEX )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:130: ( HEX )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:220:131: HEX
            	    {
            	    match(input,HEX,FOLLOW_HEX_in_integer_literal2688); 
            	    stack.push("id264");

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "integer_literal"


    // $ANTLR start "parameter_list"
    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:223:1: parameter_list : ( parameter ) ( ( ',' ) ( parameter ) )* ;
    public final void parameter_list() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:223:16: ( ( parameter ) ( ( ',' ) ( parameter ) )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:224:3: ( parameter ) ( ( ',' ) ( parameter ) )*
            {
            Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push("parameter_list");
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:2: ( parameter )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:3: parameter
            {
            pushFollow(FOLLOW_parameter_in_parameter_list2712);
            parameter();

            state._fsp--;

            stack.push("id86");

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:36: ( ( ',' ) ( parameter ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==16) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:38: ( ',' ) ( parameter )
            	    {
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:38: ( ',' )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:39: ','
            	    {
            	    match(input,16,FOLLOW_16_in_parameter_list2720); 
            	    stack.push("id87");

            	    }

            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:67: ( parameter )
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:225:68: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameter_list2727);
            	    parameter();

            	    state._fsp--;

            	    stack.push("id88");

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            trace.pop();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter_list"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA27_eotS =
        "\6\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\2\4\uffff";
    static final String DFA27_minS =
        "\1\6\1\23\2\uffff\1\6\1\uffff";
    static final String DFA27_maxS =
        "\1\115\1\36\2\uffff\1\6\1\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\1";
    static final String DFA27_specialS =
        "\6\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\14\uffff\1\3\62\uffff\10\2",
            "\1\5\11\uffff\1\4\1\2",
            "",
            "",
            "\1\1",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "95:33: ( ( class_name ) ( '(' ) ( ( arglist ) )? ( ')' ) | ( type_specifier ) ( ( '[' ) ( expression ) ( ']' ) )? ( ( '[' ) ( ']' ) )* | ( '(' ) ( expression ) ( ')' ) )";
        }
    }
    static final String DFA34_eotS =
        "\34\uffff";
    static final String DFA34_eofS =
        "\34\uffff";
    static final String DFA34_minS =
        "\24\6\1\37\1\20\1\6\1\uffff\1\6\2\uffff\1\6";
    static final String DFA34_maxS =
        "\13\115\11\36\1\37\1\42\1\6\1\uffff\1\36\2\uffff\1\36";
    static final String DFA34_acceptS =
        "\27\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA34_specialS =
        "\34\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\23\50\uffff\1\4\10\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\27\uffff\1\24",
            "\1\25\14\uffff\1\27\11\uffff\1\26\1\24",
            "\1\30",
            "\1\32\2\uffff\1\31\12\uffff\1\32\1\uffff\1\32\1\uffff\1\32",
            "\1\33",
            "",
            "\1\25\27\uffff\1\24",
            "",
            "",
            "\1\25\26\uffff\1\26\1\24"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "115:42: ( ( method_declaration ) | ( constructor_declaration ) | ( variable_declaration ) )";
        }
    }
    static final String DFA45_eotS =
        "\5\uffff";
    static final String DFA45_eofS =
        "\5\uffff";
    static final String DFA45_minS =
        "\1\6\1\35\1\6\2\uffff";
    static final String DFA45_maxS =
        "\1\6\1\42\1\61\2\uffff";
    static final String DFA45_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA45_specialS =
        "\5\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1",
            "\1\2\4\uffff\1\3",
            "\1\1\52\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "155:34: ( ( package_name ) ( '.' ) ( '*' ) ( ';' ) | ( class_name ) )";
        }
    }
    static final String DFA53_eotS =
        "\15\uffff";
    static final String DFA53_eofS =
        "\15\uffff";
    static final String DFA53_minS =
        "\13\30\2\uffff";
    static final String DFA53_maxS =
        "\13\100\2\uffff";
    static final String DFA53_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA53_specialS =
        "\15\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1\6"+
            "\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "\1\14\26\uffff\1\4\2\uffff\1\13\5\uffff\1\1\1\2\1\3\1\5\1"+
            "\6\1\7\1\10\1\11\1\12",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "185:41: ( ( class_declaration ) | ( interface_declaration ) )";
        }
    }
    static final String DFA58_eotS =
        "\23\uffff";
    static final String DFA58_eofS =
        "\23\uffff";
    static final String DFA58_minS =
        "\1\6\1\uffff\2\6\17\uffff";
    static final String DFA58_maxS =
        "\1\115\1\uffff\1\115\1\51\17\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\16\1\17\1\20\1\12\1\15";
    static final String DFA58_specialS =
        "\23\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\3\11\uffff\1\4\1\12\1\uffff\1\4\2\uffff\1\6\3\uffff\1\5"+
            "\1\uffff\1\10\2\4\3\uffff\1\20\3\4\1\11\1\13\3\uffff\4\4\1\1"+
            "\7\uffff\1\7\5\1\1\2\3\1\1\14\1\15\1\16\1\17\1\uffff\10\1",
            "",
            "\1\1\14\uffff\1\21\33\uffff\1\1\10\uffff\11\1\5\uffff\10\1",
            "\1\1\14\uffff\1\4\11\uffff\2\1\3\uffff\1\4\6\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "195:1: ( ( variable_declaration ) | ( expression ) ( ';' ) | ( statement_block ) | ( if_statement ) | ( do_statement ) | ( while_statement ) | ( for_statement ) | ( try_statement ) | ( switch_statement ) | ( 'synchronized' ) ( '(' ) ( expression ) ( ')' ) ( statement ) | ( 'return' ) ( ( expression ) )? ( ';' ) | ( 'throw' ) ( expression ) ( ';' ) | ( IDENTIFIER ) ( ':' ) ( statement ) | ( 'break' ) ( ( IDENTIFIER ) )? ( ';' ) | ( 'continue' ) ( ( IDENTIFIER ) )? ( ';' ) | ( ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_package_statement_in_compilation_unit49 = new BitSet(new long[]{0xFF15800001000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_import_statement_in_compilation_unit59 = new BitSet(new long[]{0xFF15800001000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_declaration_in_compilation_unit69 = new BitSet(new long[]{0xFF14800001000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_arglist93 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_arglist101 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_arglist108 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_expressionPrefix_in_expression133 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expressionMain_in_expression142 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expressionPost_in_expression150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_try_statement174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_try_statement181 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_try_statement189 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_try_statement196 = new BitSet(new long[]{0x0000000000000040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_parameter_in_try_statement203 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_try_statement210 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_try_statement217 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_21_in_try_statement227 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_try_statement234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_if_statement258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_statement265 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_if_statement272 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_if_statement279 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_if_statement286 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_if_statement294 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_if_statement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal_expression326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_expression334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_expression342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literal_expression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_interface_declaration374 = new BitSet(new long[]{0xFF00800001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24_in_interface_declaration383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interface_declaration390 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_interface_declaration398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration405 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_interface_declaration413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration420 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_interface_declaration431 = new BitSet(new long[]{0xFF10800408000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_field_declaration_in_interface_declaration439 = new BitSet(new long[]{0xFF10800408000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_27_in_interface_declaration448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_while_statement470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_while_statement477 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_while_statement484 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_while_statement491 = new BitSet(new long[]{0xFF90F8FC744B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_while_statement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interface_name521 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_interface_name528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interface_name537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_name560 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_class_name567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_name576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type598 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_type606 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_type613 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_declarator637 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_30_in_variable_declarator645 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_variable_declarator652 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_32_in_variable_declarator662 = new BitSet(new long[]{0x0000783864090040L});
    public static final BitSet FOLLOW_variable_initializer_in_variable_declarator669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variable_initializer694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_variable_initializer702 = new BitSet(new long[]{0x000078386C090040L});
    public static final BitSet FOLLOW_variable_initializer_in_variable_initializer710 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_16_in_variable_initializer718 = new BitSet(new long[]{0x0000783864090040L});
    public static final BitSet FOLLOW_variable_initializer_in_variable_initializer725 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_16_in_variable_initializer735 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_variable_initializer746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_creating_expression769 = new BitSet(new long[]{0x0000000000080040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_class_name_in_creating_expression777 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_creating_expression784 = new BitSet(new long[]{0x0000783860190040L});
    public static final BitSet FOLLOW_arglist_in_creating_expression792 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_creating_expression801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_creating_expression809 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_creating_expression817 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_creating_expression824 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_creating_expression831 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_creating_expression841 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_creating_expression848 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_19_in_creating_expression858 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_creating_expression865 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_creating_expression872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_variable_declaration896 = new BitSet(new long[]{0xFF00800000000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_type_in_variable_declaration905 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_variable_declarator_in_variable_declaration912 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_16_in_variable_declaration920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_variable_declarator_in_variable_declaration927 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_34_in_variable_declaration936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter965 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parameter973 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parameter980 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_modifier_in_constructor_declaration1005 = new BitSet(new long[]{0xFF00800000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constructor_declaration1014 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_constructor_declaration1021 = new BitSet(new long[]{0x0000000000100040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_declaration1029 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_constructor_declaration1038 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_constructor_declaration1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doc_comment_in_field_declaration1069 = new BitSet(new long[]{0xFF10800000000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_method_declaration_in_field_declaration1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_declaration_in_field_declaration1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_field_declaration1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_initializer_in_field_declaration1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_field_declaration1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_expressionPrefix1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_expressionPrefix1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_expressionPrefix1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expressionPost1175 = new BitSet(new long[]{0x0000783860190040L});
    public static final BitSet FOLLOW_arglist_in_expressionPost1183 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expressionPost1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_for_statement1214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_for_statement1221 = new BitSet(new long[]{0xFF10F83C60090040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_variable_declaration_in_for_statement1229 = new BitSet(new long[]{0x0000783C60090040L});
    public static final BitSet FOLLOW_expression_in_for_statement1237 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_for_statement1244 = new BitSet(new long[]{0x0000783C60090040L});
    public static final BitSet FOLLOW_34_in_for_statement1252 = new BitSet(new long[]{0x0000783C60090040L});
    public static final BitSet FOLLOW_expression_in_for_statement1261 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_for_statement1270 = new BitSet(new long[]{0x0000783C60090040L});
    public static final BitSet FOLLOW_expression_in_for_statement1278 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_for_statement1287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_for_statement1294 = new BitSet(new long[]{0xFF90F8FC744B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_for_statement1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_switch_statement1323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_switch_statement1330 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_switch_statement1337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_switch_statement1344 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_switch_statement1351 = new BitSet(new long[]{0xFF90FDFC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_40_in_switch_statement1360 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_switch_statement1367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_switch_statement1374 = new BitSet(new long[]{0xFF90FDFC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_42_in_switch_statement1382 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_switch_statement1389 = new BitSet(new long[]{0xFF90FDFC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_switch_statement1397 = new BitSet(new long[]{0xFF90FDFC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_27_in_switch_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_expressionMain1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expressionMain1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_expressionMain1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expressionMain1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expressionMain1462 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_expressionMain1469 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expressionMain1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expressionMain1484 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_expressionMain1491 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_expressionMain1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_expressionMain1506 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_expressionMain1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expressionMain1521 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_expressionMain1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_expressionMain1536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_class_name_in_expressionMain1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterface_name1567 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_classOrInterface_name1574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterface_name1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_static_initializer1605 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_static_initializer1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_import_statement1634 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_package_name_in_import_statement1642 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_import_statement1649 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_import_statement1656 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_import_statement1663 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_class_name_in_import_statement1671 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_import_statement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_declaration1702 = new BitSet(new long[]{0xFF04800000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50_in_class_declaration1711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration1718 = new BitSet(new long[]{0x0008000006000000L});
    public static final BitSet FOLLOW_25_in_class_declaration1726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_class_name_in_class_declaration1733 = new BitSet(new long[]{0x0008000004000000L});
    public static final BitSet FOLLOW_51_in_class_declaration1743 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_interface_name_in_class_declaration1750 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_class_declaration1758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_interface_name_in_class_declaration1765 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_class_declaration1776 = new BitSet(new long[]{0xFF10800408000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_field_declaration_in_class_declaration1784 = new BitSet(new long[]{0xFF10800408000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_27_in_class_declaration1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_doc_comment1815 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_doc_comment1822 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_doc_comment1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_casting_expression1851 = new BitSet(new long[]{0x0000000000000040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_type_in_casting_expression1858 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_casting_expression1865 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_casting_expression1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_package_name1895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_package_name1902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_package_name1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_do_statement1933 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statement_block_in_do_statement1940 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_do_statement1947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_do_statement1954 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_do_statement1961 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_do_statement1968 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_do_statement1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doc_comment_in_type_declaration1998 = new BitSet(new long[]{0xFF14800001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_class_declaration_in_type_declaration2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_type_declaration2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_modifier2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_modifier2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_modifier2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_modifier2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_modifier2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_modifier2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_modifier2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_modifier2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_modifier2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_statement2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement2144 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_statement2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_block_in_statement2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_statement_in_statement2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_statement_in_statement2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_statement2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_statement2215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_statement2222 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_statement2229 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement2236 = new BitSet(new long[]{0xFF90F8FC744B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_statement2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_statement2251 = new BitSet(new long[]{0x0000783C60090040L});
    public static final BitSet FOLLOW_expression_in_statement2259 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_statement2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_statement2276 = new BitSet(new long[]{0x0000783860090040L});
    public static final BitSet FOLLOW_expression_in_statement2283 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_statement2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2298 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement2305 = new BitSet(new long[]{0xFF90F8FC744B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_statement2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_statement2320 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2328 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_statement2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_statement2345 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2353 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_statement2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_statement2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_package_statement2393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_package_name_in_package_statement2400 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_package_statement2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement_block2429 = new BitSet(new long[]{0xFF90F8FC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_statement_in_statement_block2437 = new BitSet(new long[]{0xFF90F8FC7C4B0040L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_27_in_statement_block2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_method_declaration2469 = new BitSet(new long[]{0xFF00800000000040L,0x0000000000003FC1L});
    public static final BitSet FOLLOW_type_in_method_declaration2478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_declaration2485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_method_declaration2492 = new BitSet(new long[]{0x0000000000100040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_parameter_list_in_method_declaration2500 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_declaration2509 = new BitSet(new long[]{0x0000000444000000L});
    public static final BitSet FOLLOW_30_in_method_declaration2517 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_method_declaration2524 = new BitSet(new long[]{0x0000000444000000L});
    public static final BitSet FOLLOW_statement_block_in_method_declaration2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_method_declaration2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_type_specifier2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_type_specifier2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_type_specifier2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_type_specifier2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_type_specifier2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_type_specifier2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_type_specifier2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_type_specifier2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterface_name_in_type_specifier2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integer_literal2653 = new BitSet(new long[]{0x0000000000000100L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_integer_literal2662 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_79_in_integer_literal2672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HEX_in_integer_literal2680 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_HEX_in_integer_literal2688 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2712 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_parameter_list2720 = new BitSet(new long[]{0x0000000000000040L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2727 = new BitSet(new long[]{0x0000000000010002L});

}