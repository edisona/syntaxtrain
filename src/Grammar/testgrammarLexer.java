// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g 2011-04-03 14:00:32

package Grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testgrammarLexer extends Lexer {
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

    public testgrammarLexer() {;} 
    public testgrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public testgrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:7:7: ( ',' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:8:7: ( 'try' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:8:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:9:7: ( 'catch' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:9:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:10:7: ( '(' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:11:7: ( ')' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:12:7: ( 'finally' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:12:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:13:7: ( 'if' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:13:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:14:7: ( 'else' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:14:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:15:7: ( 'interface' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:15:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:16:7: ( 'extends' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:16:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:17:7: ( '{' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:18:7: ( '}' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:19:7: ( 'while' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:19:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:20:7: ( '.' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:20:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:21:7: ( '[' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:22:7: ( ']' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:23:7: ( '=' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:24:7: ( 'new' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:24:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:25:7: ( ';' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:26:7: ( '-' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:27:7: ( '++' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:27:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:28:7: ( '--' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:28:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:29:7: ( 'for' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:29:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:7: ( 'switch' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:30:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:31:7: ( 'case' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:31:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:32:7: ( ':' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:32:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:33:7: ( 'default' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:33:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:34:7: ( 'null' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:34:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:7: ( 'super' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:35:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:36:7: ( 'this' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:36:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:37:7: ( 'instanceof' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:37:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:38:7: ( 'static' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:38:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:39:7: ( 'import' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:39:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:7: ( '*' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:40:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:41:7: ( 'class' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:41:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:42:7: ( 'implements' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:42:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:43:7: ( '/**' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:43:9: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:44:7: ( '... text ...' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:44:9: '... text ...'
            {
            match("... text ..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:7: ( '*/' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:45:9: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:46:7: ( 'do' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:46:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:47:7: ( 'public' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:47:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:48:7: ( 'private' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:48:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:49:7: ( 'protected' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:49:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:7: ( 'final' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:50:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:51:7: ( 'native' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:51:9: 'native'
            {
            match("native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:52:7: ( 'synchronized' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:52:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:53:7: ( 'abstract' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:53:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:54:7: ( 'threadsafe' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:54:9: 'threadsafe'
            {
            match("threadsafe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:7: ( 'transient' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:55:9: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:56:7: ( 'return' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:56:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:57:7: ( 'throw' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:57:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:58:7: ( 'break' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:58:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:59:7: ( 'continue' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:59:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:7: ( 'package' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:60:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:61:7: ( 'boolean' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:61:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:62:7: ( 'byte' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:62:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:63:7: ( 'char' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:63:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:64:7: ( 'short' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:64:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:7: ( 'int' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:65:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:66:7: ( 'float' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:66:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:67:7: ( 'long' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:67:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:68:7: ( 'double' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:68:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:69:7: ( 'l' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:69:9: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:7: ( '0x' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:70:9: '0x'
            {
            match("0x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:228:5: ( ( '0' .. '9' )+ )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:228:7: ( '0' .. '9' )+
            {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:228:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:228:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:9: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:25: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:37: ( EXPONENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:232:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:233:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:233:13: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:233:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:233:25: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:233:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:234:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:234:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:234:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:238:2: ( '0' .. '9' | 'a' .. 'f' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:241:1: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:241:4: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:241:8: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:241:10: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:241:20: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:245:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:245:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:245:22: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:245:33: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:245:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:248:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:248:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:252:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt12=1;
                    }
                    break;
                case 'u':
                    {
                    alt12=2;
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
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:252:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:253:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:254:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='3')) ) {
                    int LA13_2 = input.LA(3);

                    if ( ((LA13_2>='0' && LA13_2<='7')) ) {
                        int LA13_4 = input.LA(4);

                        if ( ((LA13_4>='0' && LA13_4<='7')) ) {
                            alt13=1;
                        }
                        else {
                            alt13=2;}
                    }
                    else {
                        alt13=3;}
                }
                else if ( ((LA13_1>='4' && LA13_1<='7')) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>='0' && LA13_3<='7')) ) {
                        alt13=2;
                    }
                    else {
                        alt13=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:14: ( '0' .. '3' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:25: ( '0' .. '7' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:36: ( '0' .. '7' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:259:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:260:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:260:14: ( '0' .. '7' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:260:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:260:25: ( '0' .. '7' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:260:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:261:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:261:14: ( '0' .. '7' )
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:261:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:266:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:266:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='/') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='/') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='*') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:14: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:28: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:270:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:271:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:271:14: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='*') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='/') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:271:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:274:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:274:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:274:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:
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
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:276:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:276:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | INT | FLOAT | HEX | STRING | COMMENT | IDENTIFIER | WS )
        int alt19=71;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:394: INT
                {
                mINT(); 

                }
                break;
            case 66 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:398: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 67 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:404: HEX
                {
                mHEX(); 

                }
                break;
            case 68 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:408: STRING
                {
                mSTRING(); 

                }
                break;
            case 69 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:415: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 70 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:423: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 71 :
                // C:\\Programming\\Bachelor project\\AGILS\\testgrammar.g:1:434: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA8_eotS =
        "\5\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\2\56\3\uffff";
    static final String DFA8_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "231:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA19_eotS =
        "\2\uffff\1\41\1\51\2\uffff\1\51\1\41\1\51\2\uffff\1\41\1\64\3\uffff"+
        "\1\41\1\uffff\1\72\1\uffff\1\41\1\uffff\1\51\1\103\1\uffff\1\41"+
        "\1\51\1\41\1\51\1\117\2\121\3\uffff\6\41\1\uffff\3\41\1\137\5\41"+
        "\3\uffff\3\41\2\uffff\6\41\1\160\4\uffff\11\41\3\uffff\1\121\1\174"+
        "\11\41\1\u0087\1\41\1\uffff\1\u008a\5\41\1\u0091\11\41\1\uffff\1"+
        "\u009b\12\41\1\uffff\1\41\1\u00a7\3\41\1\u00ab\2\41\1\u00ae\1\41"+
        "\1\uffff\2\41\1\uffff\3\41\1\u00b5\2\41\1\uffff\1\u00b8\10\41\1"+
        "\uffff\10\41\1\u00c9\1\u00ca\1\41\1\uffff\1\41\1\u00cd\1\u00ce\1"+
        "\uffff\1\u00cf\1\41\1\uffff\1\u00d2\1\u00d3\4\41\1\uffff\1\41\1"+
        "\u00d9\1\uffff\2\41\1\u00dc\2\41\1\u00df\10\41\1\u00e8\1\41\2\uffff"+
        "\2\41\3\uffff\2\41\2\uffff\2\41\1\u00f0\2\41\1\uffff\1\u00f3\1\u00f4"+
        "\1\uffff\1\u00f5\1\41\1\uffff\1\41\1\u00f8\1\u00f9\4\41\1\u00fe"+
        "\1\uffff\4\41\1\u0103\2\41\1\uffff\1\41\1\u0107\3\uffff\1\41\1\u0109"+
        "\2\uffff\1\u010a\1\41\1\u010c\1\41\1\uffff\1\u010e\2\41\1\u0111"+
        "\1\uffff\3\41\1\uffff\1\41\2\uffff\1\41\1\uffff\1\u0117\1\uffff"+
        "\1\u0118\1\41\1\uffff\1\u011a\3\41\1\u011e\2\uffff\1\u011f\1\uffff"+
        "\1\u0120\1\u0121\1\41\4\uffff\1\41\1\u0124\1\uffff";
    static final String DFA19_eofS =
        "\u0125\uffff";
    static final String DFA19_minS =
        "\1\11\1\uffff\1\150\1\60\2\uffff\1\60\1\146\1\60\2\uffff\1\150"+
        "\1\56\3\uffff\1\141\1\uffff\1\55\1\uffff\1\150\1\uffff\1\60\1\57"+
        "\1\52\1\141\1\60\1\145\2\60\2\56\3\uffff\1\141\1\151\1\163\1\141"+
        "\1\156\1\141\1\uffff\1\156\1\162\1\157\1\60\1\163\1\160\1\163\1"+
        "\164\1\151\3\uffff\1\167\1\154\1\164\2\uffff\1\151\1\160\1\141\1"+
        "\156\1\157\1\146\1\60\2\uffff\1\0\1\uffff\1\142\1\151\1\143\1\163"+
        "\1\164\1\145\1\157\1\164\1\156\3\uffff\1\56\1\60\1\156\1\163\1\145"+
        "\1\143\1\145\1\163\1\164\1\162\1\141\1\60\1\141\1\uffff\1\60\1\164"+
        "\1\154\2\145\1\154\1\60\1\154\1\151\1\164\1\145\1\164\1\143\1\162"+
        "\1\141\1\142\1\uffff\1\0\1\154\1\166\1\164\1\153\1\164\1\165\1\141"+
        "\1\154\1\145\1\147\1\uffff\1\163\1\60\1\141\1\167\1\150\1\60\1\163"+
        "\1\151\1\60\1\154\1\uffff\1\164\1\162\1\uffff\1\141\1\162\1\145"+
        "\1\60\1\156\1\145\1\uffff\1\60\1\166\1\143\1\162\1\151\1\150\1\164"+
        "\1\165\1\154\1\uffff\1\151\1\141\1\145\1\141\2\162\1\153\1\145\2"+
        "\60\1\151\1\uffff\1\144\2\60\1\uffff\1\60\1\156\1\uffff\2\60\1\146"+
        "\1\156\1\164\1\155\1\uffff\1\144\1\60\1\uffff\1\145\1\150\1\60\1"+
        "\143\1\162\1\60\1\154\1\145\1\143\1\164\1\143\1\147\1\141\1\156"+
        "\1\60\1\141\2\uffff\1\145\1\163\3\uffff\1\165\1\171\2\uffff\1\141"+
        "\1\143\1\60\1\145\1\163\1\uffff\2\60\1\uffff\1\60\1\157\1\uffff"+
        "\1\164\2\60\1\145\1\164\1\145\1\143\1\60\1\uffff\2\156\1\141\1\145"+
        "\1\60\1\143\1\145\1\uffff\1\156\1\60\3\uffff\1\156\1\60\2\uffff"+
        "\1\60\1\145\1\60\1\164\1\uffff\1\60\1\164\1\146\1\60\1\uffff\1\145"+
        "\1\157\1\164\1\uffff\1\151\2\uffff\1\144\1\uffff\1\60\1\uffff\1"+
        "\60\1\145\1\uffff\1\60\1\146\1\163\1\172\1\60\2\uffff\1\60\1\uffff"+
        "\2\60\1\145\4\uffff\1\144\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\175\1\uffff\1\162\1\172\2\uffff\1\172\1\156\1\172\2\uffff\1"+
        "\150\1\71\3\uffff\1\165\1\uffff\1\55\1\uffff\1\171\1\uffff\1\172"+
        "\2\57\1\165\1\172\1\145\2\172\1\170\1\145\3\uffff\1\171\1\162\1"+
        "\164\1\141\1\156\1\141\1\uffff\1\156\1\162\1\157\1\172\1\164\1\160"+
        "\1\163\1\164\1\151\3\uffff\1\167\1\154\1\164\2\uffff\1\151\1\160"+
        "\1\141\1\156\1\157\1\146\1\172\2\uffff\1\uffff\1\uffff\1\142\1\157"+
        "\1\143\1\163\1\164\1\145\1\157\1\164\1\156\3\uffff\1\145\1\172\1"+
        "\156\1\163\1\157\1\143\1\145\1\163\1\164\1\162\1\141\1\172\1\141"+
        "\1\uffff\1\172\1\164\1\157\2\145\1\154\1\172\1\154\1\151\1\164\1"+
        "\145\1\164\1\143\1\162\1\141\1\142\1\uffff\1\uffff\1\154\1\166\1"+
        "\164\1\153\1\164\1\165\1\141\1\154\1\145\1\147\1\uffff\1\163\1\172"+
        "\1\141\1\167\1\150\1\172\1\163\1\151\1\172\1\154\1\uffff\1\164\1"+
        "\162\1\uffff\1\141\1\162\1\145\1\172\1\156\1\145\1\uffff\1\172\1"+
        "\166\1\143\1\162\1\151\1\150\1\164\1\165\1\154\1\uffff\1\151\1\141"+
        "\1\145\1\141\2\162\1\153\1\145\2\172\1\151\1\uffff\1\144\2\172\1"+
        "\uffff\1\172\1\156\1\uffff\2\172\1\146\1\156\1\164\1\155\1\uffff"+
        "\1\144\1\172\1\uffff\1\145\1\150\1\172\1\143\1\162\1\172\1\154\1"+
        "\145\1\143\1\164\1\143\1\147\1\141\1\156\1\172\1\141\2\uffff\1\145"+
        "\1\163\3\uffff\1\165\1\171\2\uffff\1\141\1\143\1\172\1\145\1\163"+
        "\1\uffff\2\172\1\uffff\1\172\1\157\1\uffff\1\164\2\172\1\145\1\164"+
        "\1\145\1\143\1\172\1\uffff\2\156\1\141\1\145\1\172\1\143\1\145\1"+
        "\uffff\1\156\1\172\3\uffff\1\156\1\172\2\uffff\1\172\1\145\1\172"+
        "\1\164\1\uffff\1\172\1\164\1\146\1\172\1\uffff\1\145\1\157\1\164"+
        "\1\uffff\1\151\2\uffff\1\144\1\uffff\1\172\1\uffff\1\172\1\145\1"+
        "\uffff\1\172\1\146\1\163\2\172\2\uffff\1\172\1\uffff\2\172\1\145"+
        "\4\uffff\1\144\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\3\uffff\1\13\1\14\2\uffff\1\17\1\20"+
        "\1\21\1\uffff\1\23\1\uffff\1\25\1\uffff\1\32\12\uffff\1\104\1\106"+
        "\1\107\6\uffff\1\103\11\uffff\1\46\1\16\1\102\3\uffff\1\26\1\24"+
        "\7\uffff\1\47\1\42\1\uffff\1\105\11\uffff\1\77\1\100\1\101\15\uffff"+
        "\1\7\20\uffff\1\50\13\uffff\1\2\12\uffff\1\27\2\uffff\1\73\6\uffff"+
        "\1\22\11\uffff\1\45\13\uffff\1\36\3\uffff\1\31\2\uffff\1\71\6\uffff"+
        "\1\10\2\uffff\1\34\20\uffff\1\70\1\75\2\uffff\1\63\1\3\1\43\2\uffff"+
        "\1\54\1\74\5\uffff\1\15\2\uffff\1\35\2\uffff\1\72\10\uffff\1\64"+
        "\7\uffff\1\41\2\uffff\1\55\1\30\1\40\2\uffff\1\76\1\51\4\uffff\1"+
        "\62\4\uffff\1\6\3\uffff\1\12\1\uffff\1\33\1\52\1\uffff\1\66\1\uffff"+
        "\1\67\2\uffff\1\65\5\uffff\1\57\1\61\1\uffff\1\11\3\uffff\1\53\1"+
        "\60\1\37\1\44\2\uffff\1\56";
    static final String DFA19_specialS =
        "\104\uffff\1\1\54\uffff\1\0\u00b3\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\uffff\1\40\5\uffff\1\4\1"+
            "\5\1\27\1\23\1\1\1\22\1\14\1\30\1\36\11\37\1\25\1\21\1\uffff"+
            "\1\17\3\uffff\32\41\1\15\1\uffff\1\16\1\uffff\1\41\1\uffff\1"+
            "\32\1\34\1\3\1\26\1\10\1\6\2\41\1\7\2\41\1\35\1\41\1\20\1\41"+
            "\1\31\1\41\1\33\1\24\1\2\2\41\1\13\3\41\1\11\1\uffff\1\12",
            "",
            "\1\44\11\uffff\1\43",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\45\6\41\1\50\3"+
            "\41\1\46\2\41\1\47\13\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\10\41\1\52\2\41"+
            "\1\54\2\41\1\53\13\41",
            "\1\55\6\uffff\1\57\1\56",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\60\13\41"+
            "\1\61\2\41",
            "",
            "",
            "\1\62",
            "\1\63\1\uffff\12\65",
            "",
            "",
            "",
            "\1\70\3\uffff\1\66\17\uffff\1\67",
            "",
            "\1\71",
            "",
            "\1\77\13\uffff\1\75\1\74\1\uffff\1\73\1\uffff\1\76",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\100\11\41"+
            "\1\101\13\41",
            "\1\102",
            "\1\104\4\uffff\1\105",
            "\1\110\20\uffff\1\107\2\uffff\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\41\1\111\30\41",
            "\1\112",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\114\2\41"+
            "\1\113\6\41\1\115\1\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\116\13\41",
            "\1\65\1\uffff\12\122\13\uffff\1\65\37\uffff\1\65\22\uffff"+
            "\1\120",
            "\1\65\1\uffff\12\122\13\uffff\1\65\37\uffff\1\65",
            "",
            "",
            "",
            "\1\124\27\uffff\1\123",
            "\1\125\10\uffff\1\126",
            "\1\130\1\127",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\141\1\140",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\24\41\1\157\5\41",
            "",
            "",
            "\52\105\1\161\uffd5\105",
            "",
            "\1\162",
            "\1\163\5\uffff\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "",
            "\1\65\1\uffff\12\122\13\uffff\1\65\37\uffff\1\65",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\175",
            "\1\176",
            "\1\177\11\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0088",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\u0089\25"+
            "\41",
            "\1\u008b",
            "\1\u008d\2\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\0\105",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ac",
            "\1\u00ad",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d0",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\u00d1\16"+
            "\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00da",
            "\1\u00db",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00dd",
            "\1\u00de",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\u0108",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u010b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u010d",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u010f",
            "\1\u0110",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "",
            "",
            "\1\u0116",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0119",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0122",
            "",
            "",
            "",
            "",
            "\1\u0123",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | INT | FLOAT | HEX | STRING | COMMENT | IDENTIFIER | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_113 = input.LA(1);

                        s = -1;
                        if ( ((LA19_113>='\u0000' && LA19_113<='\uFFFF')) ) {s = 69;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_68 = input.LA(1);

                        s = -1;
                        if ( (LA19_68=='*') ) {s = 113;}

                        else if ( ((LA19_68>='\u0000' && LA19_68<=')')||(LA19_68>='+' && LA19_68<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}