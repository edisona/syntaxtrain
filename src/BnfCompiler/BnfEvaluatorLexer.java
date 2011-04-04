// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g 2011-02-27 13:19:20

package BnfCompiler;


import org.antlr.runtime.*;

public class BnfEvaluatorLexer extends Lexer {
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

    public BnfEvaluatorLexer() {;} 
    public BnfEvaluatorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BnfEvaluatorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:7:6: ( '.' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:7:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:8:6: ( '=' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:8:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:9:6: ( '/' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:9:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:10:7: ( '(' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:11:7: ( ')' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:12:7: ( '[' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:13:7: ( ']' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:14:7: ( '<' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:15:7: ( '>' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:15:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "TERMINAL"
    public final void mTERMINAL() throws RecognitionException {
        try {
            int _type = TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:69:2: ( '\"' (~ '\"' )* '\"' )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:69:4: '\"' (~ '\"' )* '\"'
            {
            match('\"'); 
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:69:8: (~ '\"' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:69:9: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TERMINAL"

    // $ANTLR start "NONTERMINAL"
    public final void mNONTERMINAL() throws RecognitionException {
        try {
            int _type = NONTERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:70:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:70:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:70:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NONTERMINAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:72:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:72:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | TERMINAL | NONTERMINAL | WS )
        int alt3=12;
        switch ( input.LA(1) ) {
        case '.':
            {
            alt3=1;
            }
            break;
        case '=':
            {
            alt3=2;
            }
            break;
        case '/':
            {
            alt3=3;
            }
            break;
        case '(':
            {
            alt3=4;
            }
            break;
        case ')':
            {
            alt3=5;
            }
            break;
        case '[':
            {
            alt3=6;
            }
            break;
        case ']':
            {
            alt3=7;
            }
            break;
        case '<':
            {
            alt3=8;
            }
            break;
        case '>':
            {
            alt3=9;
            }
            break;
        case '\"':
            {
            alt3=10;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:61: TERMINAL
                {
                mTERMINAL(); 

                }
                break;
            case 11 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:70: NONTERMINAL
                {
                mNONTERMINAL(); 

                }
                break;
            case 12 :
                // C:\\Programming\\Bachelor project\\ANTLR\\BnfEvaluator.g:1:82: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}