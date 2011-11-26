package hu.bme.mit.androtext.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroTextDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_HEX_COLOR=7;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=6;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=5;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalAndroTextDslLexer() {;} 
    public InternalAndroTextDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAndroTextDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:11:7: ( 'package' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:11:9: 'package'
            {
            match("package"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:12:7: ( 'import' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:12:9: 'import'
            {
            match("import"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:13:7: ( '.' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:13:9: '.'
            {
            match('.'); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:14:7: ( '*' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:15:7: ( 'generator' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:15:9: 'generator'
            {
            match("generator"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:16:7: ( '{' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:16:9: '{'
            {
            match('{'); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:17:7: ( '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:17:9: '}'
            {
            match('}'); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:18:7: ( 'target' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:18:9: 'target'
            {
            match("target"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:19:7: ( 'project' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:19:9: 'project'
            {
            match("project"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:20:7: ( 'platform' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:20:9: 'platform'
            {
            match("platform"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:21:7: ( 'version' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:21:9: 'version'
            {
            match("version"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:22:7: ( 'application' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:22:9: 'application'
            {
            match("application"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:23:7: ( 'datamodel' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:23:9: 'datamodel'
            {
            match("datamodel"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:24:7: ( 'activity' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:24:9: 'activity'
            {
            match("activity"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:25:7: ( 'layout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:25:9: 'layout'
            {
            match("layout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:26:7: ( 'theme' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:26:9: 'theme'
            {
            match("theme"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:27:7: ( 'tabactivity' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:27:9: 'tabactivity'
            {
            match("tabactivity"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:28:7: ( 'tab' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:28:9: 'tab'
            {
            match("tab"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:29:7: ( 'show' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:29:9: 'show'
            {
            match("show"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:30:7: ( 'listactivity' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:30:9: 'listactivity'
            {
            match("listactivity"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:31:7: ( 'listitem' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:31:9: 'listitem'
            {
            match("listitem"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:32:7: ( 'preferences' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:32:9: 'preferences'
            {
            match("preferences"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:33:7: ( 'goto' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:33:9: 'goto'
            {
            match("goto"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:34:7: ( 'entity' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:34:9: 'entity'
            {
            match("entity"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:35:7: ( 'extends' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:35:9: 'extends'
            {
            match("extends"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:36:7: ( ':' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:36:9: ':'
            {
            match(':'); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:37:7: ( 'guimodel' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:37:9: 'guimodel'
            {
            match("guimodel"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:38:7: ( 'weight' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:38:9: 'weight'
            {
            match("weight"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:39:7: ( 'margin' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:39:9: 'margin'
            {
            match("margin"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:40:7: ( ',' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:40:9: ','
            {
            match(','); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:41:7: ( 'alignParent' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:41:9: 'alignParent'
            {
            match("alignParent"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:42:7: ( 'gravity' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:42:9: 'gravity'
            {
            match("gravity"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:43:7: ( '|' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:43:9: '|'
            {
            match('|'); 

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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:44:7: ( 'absolutelayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:44:9: 'absolutelayout'
            {
            match("absolutelayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:45:7: ( 'linearlayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:45:9: 'linearlayout'
            {
            match("linearlayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:46:7: ( 'vertical' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:46:9: 'vertical'
            {
            match("vertical"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:47:7: ( 'horizontal' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:47:9: 'horizontal'
            {
            match("horizontal"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:48:7: ( 'layoutparams' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:48:9: 'layoutparams'
            {
            match("layoutparams"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:49:7: ( 'framelayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:49:9: 'framelayout'
            {
            match("framelayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:50:7: ( 'relativelayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:50:9: 'relativelayout'
            {
            match("relativelayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:51:7: ( 'girdlayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:51:9: 'girdlayout'
            {
            match("girdlayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:52:7: ( 'tablelayout' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:52:9: 'tablelayout'
            {
            match("tablelayout"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:53:7: ( 'gallery' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:53:9: 'gallery'
            {
            match("gallery"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:54:7: ( 'explistview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:54:9: 'explistview'
            {
            match("explistview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:55:7: ( 'webview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:55:9: 'webview'
            {
            match("webview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:56:7: ( 'imageview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:56:9: 'imageview'
            {
            match("imageview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:57:7: ( 'textview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:57:9: 'textview'
            {
            match("textview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:58:7: ( 'textSize' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:58:9: 'textSize'
            {
            match("textSize"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:59:7: ( 'background' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:59:9: 'background'
            {
            match("background"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:60:7: ( 'edittext' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:60:9: 'edittext'
            {
            match("edittext"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:61:7: ( 'button' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:61:9: 'button'
            {
            match("button"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:62:7: ( 'listview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:62:9: 'listview'
            {
            match("listview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:63:7: ( 'entries' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:63:9: 'entries'
            {
            match("entries"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:64:7: ( 'gridview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:64:9: 'gridview'
            {
            match("gridview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:65:7: ( 'spinner' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:65:9: 'spinner'
            {
            match("spinner"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:66:7: ( 'checkbox' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:66:9: 'checkbox'
            {
            match("checkbox"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:67:7: ( 'radiogroup' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:67:9: 'radiogroup'
            {
            match("radiogroup"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:68:7: ( 'ratingbar' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:68:9: 'ratingbar'
            {
            match("ratingbar"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:69:7: ( 'togglebutton' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:69:9: 'togglebutton'
            {
            match("togglebutton"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:70:7: ( 'textOn' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:70:9: 'textOn'
            {
            match("textOn"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:71:7: ( 'textOff' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:71:9: 'textOff'
            {
            match("textOff"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:72:7: ( 'radiobutton' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:72:9: 'radiobutton'
            {
            match("radiobutton"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:73:7: ( 'checkedtextview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:73:9: 'checkedtextview'
            {
            match("checkedtextview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:74:7: ( 'autocompletetextview' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:74:9: 'autocompletetextview'
            {
            match("autocompletetextview"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:75:7: ( 'preference' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:75:9: 'preference'
            {
            match("preference"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:76:7: ( 'preferencescreen' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:76:9: 'preferencescreen'
            {
            match("preferencescreen"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:77:7: ( 'preferencecategery' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:77:9: 'preferencecategery'
            {
            match("preferencecategery"); 


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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:78:7: ( 'edittextpreference' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:78:9: 'edittextpreference'
            {
            match("edittextpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:79:7: ( 'listpreference' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:79:9: 'listpreference'
            {
            match("listpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:80:7: ( 'checkboxpreference' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:80:9: 'checkboxpreference'
            {
            match("checkboxpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:7: ( 'ringtonepreference' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:9: 'ringtonepreference'
            {
            match("ringtonepreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:82:7: ( 'summary' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:82:9: 'summary'
            {
            match("summary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:83:7: ( 'enabled' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:83:9: 'enabled'
            {
            match("enabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:84:7: ( 'persistent' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:84:9: 'persistent'
            {
            match("persistent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:85:7: ( 'dialogTitle' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:85:9: 'dialogTitle'
            {
            match("dialogTitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:86:7: ( 'defaultValue' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:86:9: 'defaultValue'
            {
            match("defaultValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:87:7: ( 'entryValues' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:87:9: 'entryValues'
            {
            match("entryValues"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:88:7: ( 'resources' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:88:9: 'resources'
            {
            match("resources"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:89:7: ( '=' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:89:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:90:7: ( 'intarray' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:90:9: 'intarray'
            {
            match("intarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:91:7: ( 'stringarray' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:91:9: 'stringarray'
            {
            match("stringarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:92:7: ( '<->' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:92:9: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:93:7: ( 'true' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:93:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:94:7: ( 'false' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:94:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:95:7: ( 'Android 2.2' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:95:9: 'Android 2.2'
            {
            match("Android 2.2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:96:7: ( 'Android 2.3.1' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:96:9: 'Android 2.3.1'
            {
            match("Android 2.3.1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:97:7: ( 'Android 2.3.3' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:97:9: 'Android 2.3.3'
            {
            match("Android 2.3.3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:98:7: ( 'Android 3.0' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:98:9: 'Android 3.0'
            {
            match("Android 3.0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:99:8: ( 'Android 3.1' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:99:10: 'Android 3.1'
            {
            match("Android 3.1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:100:8: ( 'Android 4.0' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:100:10: 'Android 4.0'
            {
            match("Android 4.0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:101:8: ( 'DIALOG' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:101:10: 'DIALOG'
            {
            match("DIALOG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:102:8: ( 'NOTITLE' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:102:10: 'NOTITLE'
            {
            match("NOTITLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:103:8: ( 'FULLSCREEN' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:103:10: 'FULLSCREEN'
            {
            match("FULLSCREEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:104:8: ( 'String' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:104:10: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:105:8: ( 'float' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:105:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:106:8: ( 'boolean' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:106:10: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:107:8: ( 'int' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:107:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:108:8: ( 'top' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:108:10: 'top'
            {
            match("top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:109:8: ( 'bottom' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:109:10: 'bottom'
            {
            match("bottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:110:8: ( 'left' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:110:10: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:111:8: ( 'right' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:111:10: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:112:8: ( 'center' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:112:10: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:113:8: ( 'center_vertical' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:113:10: 'center_vertical'
            {
            match("center_vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:114:8: ( 'center_horizontal' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:114:10: 'center_horizontal'
            {
            match("center_horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:115:8: ( 'fill' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:115:10: 'fill'
            {
            match("fill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:116:8: ( 'fill_vertical' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:116:10: 'fill_vertical'
            {
            match("fill_vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:117:8: ( 'fill_horizontal' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:117:10: 'fill_horizontal'
            {
            match("fill_horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:118:8: ( 'clip_vertical' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:118:10: 'clip_vertical'
            {
            match("clip_vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:119:8: ( 'clip_horizontal' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:119:10: 'clip_horizontal'
            {
            match("clip_horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:120:8: ( 'wrap' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:120:10: 'wrap'
            {
            match("wrap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:121:8: ( 'fill&wrap' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:121:10: 'fill&wrap'
            {
            match("fill&wrap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:122:8: ( 'wrap&fill' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:122:10: 'wrap&fill'
            {
            match("wrap&fill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:123:8: ( 'dp' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:123:10: 'dp'
            {
            match("dp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:124:8: ( 'sp' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:124:10: 'sp'
            {
            match("sp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:125:8: ( 'pt' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:125:10: 'pt'
            {
            match("pt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:126:8: ( 'px' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:126:10: 'px'
            {
            match("px"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:127:8: ( 'mm' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:127:10: 'mm'
            {
            match("mm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:128:8: ( 'in' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:128:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "RULE_HEX_COLOR"
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7862:16: ( '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7862:18: '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            {
            match('#'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7862:196: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7862:197: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_COLOR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7864:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7864:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7864:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7864:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7864:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7866:10: ( ( '0' .. '9' )+ )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7866:12: ( '0' .. '9' )+
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7866:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7866:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7868:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7870:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7870:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7870:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7870:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7872:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7874:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7874:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7874:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7876:16: ( . )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:7876:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=126;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:671: T__119
                {
                mT__119(); 

                }
                break;
            case 109 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:678: T__120
                {
                mT__120(); 

                }
                break;
            case 110 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:685: T__121
                {
                mT__121(); 

                }
                break;
            case 111 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:692: T__122
                {
                mT__122(); 

                }
                break;
            case 112 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:699: T__123
                {
                mT__123(); 

                }
                break;
            case 113 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:706: T__124
                {
                mT__124(); 

                }
                break;
            case 114 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:713: T__125
                {
                mT__125(); 

                }
                break;
            case 115 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:720: T__126
                {
                mT__126(); 

                }
                break;
            case 116 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:727: T__127
                {
                mT__127(); 

                }
                break;
            case 117 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:734: T__128
                {
                mT__128(); 

                }
                break;
            case 118 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:741: T__129
                {
                mT__129(); 

                }
                break;
            case 119 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:748: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 120 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:763: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 121 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:771: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 122 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:780: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 123 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:792: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 124 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:808: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 125 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:824: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 126 :
                // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1:832: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\57\2\uffff\1\57\2\uffff\7\57\1\uffff\2\57\2\uffff\5"+
        "\57\1\uffff\1\50\5\57\2\50\2\uffff\3\50\2\uffff\4\57\1\174\1\175"+
        "\1\uffff\1\57\1\u0081\2\uffff\6\57\2\uffff\16\57\1\u0099\4\57\1"+
        "\u00a0\5\57\1\uffff\3\57\1\u00ac\2\uffff\16\57\2\uffff\5\57\6\uffff"+
        "\5\57\2\uffff\2\57\1\u00cc\1\uffff\10\57\1\u00d7\3\57\1\u00db\12"+
        "\57\1\uffff\6\57\1\uffff\13\57\1\uffff\37\57\1\uffff\1\57\1\u0119"+
        "\10\57\1\uffff\3\57\1\uffff\1\u0127\15\57\1\u0138\1\u0139\13\57"+
        "\1\u0147\5\57\1\u014f\33\57\1\uffff\10\57\1\u0173\4\57\1\uffff\20"+
        "\57\2\uffff\14\57\2\uffff\3\57\1\u0198\1\u0199\1\57\2\uffff\5\57"+
        "\1\u01a2\21\57\1\u01b6\10\57\1\u01bf\2\57\1\uffff\2\57\1\u01c4\14"+
        "\57\1\u01d2\10\57\1\u01db\6\57\1\u01e2\1\57\1\u01e4\2\57\2\uffff"+
        "\10\57\1\uffff\1\57\1\u01f0\1\57\1\u01f2\2\57\1\u01f6\3\57\1\u01fa"+
        "\2\57\1\u01fd\1\u01fe\1\u01ff\3\57\1\uffff\4\57\1\u0207\2\57\1\u020a"+
        "\1\uffff\4\57\1\uffff\1\u020f\1\57\1\u0211\12\57\1\uffff\5\57\1"+
        "\u0221\1\u0222\1\57\1\uffff\1\u0224\1\57\1\u0226\1\u0227\2\57\1"+
        "\uffff\1\u022a\1\uffff\13\57\1\uffff\1\u0236\1\uffff\3\57\1\uffff"+
        "\3\57\1\uffff\1\u023e\1\57\3\uffff\1\57\1\u0241\2\57\1\u0244\1\57"+
        "\1\u0246\1\uffff\1\u0247\1\57\1\uffff\2\57\1\u024b\1\u024c\1\uffff"+
        "\1\57\1\uffff\1\u024e\1\57\1\u0250\10\57\1\u0259\1\u025a\2\57\2"+
        "\uffff\1\57\1\uffff\1\57\2\uffff\1\57\1\u0261\1\uffff\13\57\1\uffff"+
        "\1\u026e\5\57\2\uffff\2\57\1\uffff\1\57\1\u027a\1\uffff\1\u027b"+
        "\2\uffff\3\57\2\uffff\1\57\1\uffff\1\57\1\uffff\3\57\1\u0284\4\57"+
        "\2\uffff\6\57\1\uffff\5\57\1\u0294\2\57\1\u0297\3\57\1\uffff\5\57"+
        "\3\uffff\1\57\1\u02a5\1\u02a6\2\uffff\1\u02a7\7\57\1\uffff\12\57"+
        "\1\u02b9\4\57\1\uffff\1\u02be\1\57\1\uffff\1\57\1\u02c1\6\57\2\uffff"+
        "\1\u02cc\1\u02ce\1\57\3\uffff\1\u02d0\1\u02d1\1\57\1\u02d3\1\u02d4"+
        "\2\57\1\u02d7\5\57\1\u02dd\1\u02de\1\u02df\1\57\1\uffff\1\u02e1"+
        "\3\57\1\uffff\1\u02e5\1\57\1\uffff\6\57\5\uffff\1\57\1\uffff\1\57"+
        "\2\uffff\1\u02f0\2\uffff\2\57\1\uffff\1\u02f3\1\u02f4\1\u02f5\1"+
        "\57\1\u02f7\3\uffff\1\57\1\uffff\3\57\1\uffff\7\57\1\uffff\2\57"+
        "\1\uffff\2\57\3\uffff\1\57\1\uffff\1\57\1\u030b\7\57\1\u0313\1\57"+
        "\2\uffff\2\57\1\u0317\1\57\1\u0319\1\57\1\uffff\1\57\1\u031c\5\57"+
        "\1\uffff\3\57\1\uffff\1\57\1\uffff\1\57\1\u0327\1\uffff\2\57\1\u032a"+
        "\1\u032b\1\57\1\u032d\1\u032e\3\57\1\uffff\2\57\2\uffff\1\57\2\uffff"+
        "\5\57\1\u033a\1\u033b\1\57\1\u033d\1\u033e\1\u033f\2\uffff\1\57"+
        "\3\uffff\1\u0341\1\uffff";
    static final String DFA13_eofS =
        "\u0342\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\155\2\uffff\1\141\2\uffff\1\141\1\145\1\142\2\141"+
        "\1\150\1\144\1\uffff\1\145\1\141\2\uffff\1\157\3\141\1\145\1\uffff"+
        "\1\55\1\156\1\111\1\117\1\125\1\164\1\60\1\101\2\uffff\2\0\1\52"+
        "\2\uffff\1\143\1\145\1\141\1\162\2\60\1\uffff\1\141\1\60\2\uffff"+
        "\1\156\1\164\1\151\1\141\1\162\1\154\2\uffff\1\142\1\145\1\170\1"+
        "\147\1\165\1\162\1\160\1\164\1\151\1\163\2\164\1\141\1\146\1\60"+
        "\1\171\1\156\1\146\1\157\1\60\1\155\1\162\1\141\1\160\1\151\1\uffff"+
        "\1\142\1\141\1\162\1\60\2\uffff\1\162\1\141\1\154\1\157\2\154\1"+
        "\144\1\147\1\143\1\164\1\157\1\145\1\156\1\151\2\uffff\1\144\1\101"+
        "\1\124\1\114\1\162\6\uffff\1\153\1\152\1\146\1\164\1\163\2\uffff"+
        "\1\157\1\147\1\60\1\uffff\1\145\1\157\1\155\1\166\2\144\1\154\1"+
        "\147\1\60\1\155\1\164\1\147\1\60\1\145\1\163\1\154\1\151\1\147\2"+
        "\157\1\141\1\154\1\141\1\uffff\1\157\1\164\1\145\1\164\1\167\1\156"+
        "\1\uffff\1\155\2\151\1\142\1\145\1\154\1\164\1\147\1\166\1\160\1"+
        "\147\1\uffff\1\151\1\155\1\163\1\141\1\154\1\141\1\157\2\151\1\147"+
        "\1\150\1\153\1\164\1\154\1\164\1\143\1\164\1\160\1\162\1\114\1\111"+
        "\1\114\1\151\1\141\2\145\1\146\1\151\1\162\1\145\1\162\1\uffff\1"+
        "\162\1\60\1\157\1\151\1\166\1\154\2\145\1\143\1\145\1\uffff\1\145"+
        "\1\117\1\154\1\uffff\1\60\3\151\1\166\1\156\1\154\1\143\1\155\1"+
        "\157\2\165\2\141\2\60\1\156\1\141\1\156\1\164\1\151\1\154\1\156"+
        "\1\151\1\164\1\150\1\151\1\46\1\151\1\172\2\145\1\164\1\46\1\164"+
        "\1\165\1\157\1\156\2\164\1\147\1\157\1\145\1\157\1\153\1\145\1\137"+
        "\1\157\1\117\1\124\1\123\1\156\1\147\1\143\1\162\1\157\1\163\1\164"+
        "\1\166\1\162\1\141\1\uffff\1\144\1\164\1\151\1\141\1\162\2\164\1"+
        "\154\1\60\2\151\1\146\1\145\1\uffff\1\157\2\143\1\151\1\120\1\165"+
        "\2\157\1\147\1\154\1\164\1\143\1\164\1\151\2\162\2\uffff\1\145\1"+
        "\162\1\147\1\171\1\145\1\126\1\145\1\144\1\163\1\145\1\164\1\145"+
        "\2\uffff\1\156\1\157\1\154\2\60\1\150\2\uffff\1\151\1\162\1\142"+
        "\1\147\1\157\1\60\1\162\1\156\1\141\1\155\1\142\1\162\1\150\1\151"+
        "\1\107\1\114\1\103\1\147\1\145\1\164\1\145\1\162\1\164\1\60\1\151"+
        "\1\141\1\164\1\145\1\171\1\145\2\171\1\60\1\151\1\141\1\uffff\1"+
        "\145\1\172\1\60\1\146\1\142\1\156\2\141\1\164\1\141\1\164\1\155"+
        "\1\144\1\124\1\164\1\60\1\164\3\145\1\154\1\162\1\171\1\141\1\60"+
        "\1\163\1\141\1\144\1\163\1\164\1\170\1\60\1\167\1\60\1\156\1\141"+
        "\2\uffff\1\145\1\157\1\166\1\143\1\162\1\165\1\142\1\156\1\uffff"+
        "\1\157\1\60\1\156\1\60\1\157\1\144\1\60\1\145\1\157\1\144\1\60\1"+
        "\105\1\122\3\60\1\156\1\155\1\145\1\uffff\1\145\1\171\1\157\1\154"+
        "\1\60\1\167\1\157\1\60\1\uffff\1\166\1\171\1\167\1\145\1\uffff\1"+
        "\60\1\165\1\60\1\154\1\164\1\171\1\162\1\145\1\160\1\145\1\151\1"+
        "\126\1\141\1\uffff\1\151\1\155\1\167\1\146\1\141\2\60\1\162\1\uffff"+
        "\1\60\1\154\2\60\1\166\1\164\1\uffff\1\60\1\uffff\1\164\1\171\2"+
        "\162\2\145\1\157\1\164\1\141\1\145\1\165\1\uffff\1\60\1\uffff\1"+
        "\170\1\164\1\150\1\uffff\2\162\1\40\1\uffff\1\60\1\105\3\uffff\1"+
        "\143\1\60\1\156\1\167\1\60\1\162\1\60\1\uffff\1\60\1\165\1\uffff"+
        "\1\151\1\157\2\60\1\uffff\1\164\1\uffff\1\60\1\151\1\60\1\145\3"+
        "\154\1\164\1\141\1\162\1\166\2\60\1\145\1\171\2\uffff\1\162\1\uffff"+
        "\1\165\2\uffff\1\151\1\60\1\uffff\1\141\1\157\1\164\1\151\1\154"+
        "\1\163\1\165\1\164\1\162\1\160\1\156\1\uffff\1\60\2\145\1\157\1"+
        "\164\1\151\1\62\1\uffff\1\105\1\145\1\uffff\1\164\1\60\1\uffff\1"+
        "\60\2\uffff\2\164\1\165\2\uffff\1\164\1\uffff\1\157\1\uffff\1\156"+
        "\1\141\1\145\1\60\2\154\1\141\1\151\2\uffff\1\162\1\157\1\141\2"+
        "\145\1\162\1\uffff\1\154\1\165\1\151\1\172\1\141\1\60\1\160\1\157"+
        "\1\60\1\162\1\144\1\162\1\uffff\1\170\2\162\1\151\1\172\2\56\1\uffff"+
        "\1\116\2\60\2\uffff\1\60\1\171\1\164\1\157\1\156\1\164\1\171\1\164"+
        "\1\uffff\1\145\1\165\1\155\1\164\1\145\1\165\1\171\1\163\1\167\1"+
        "\145\1\60\1\164\1\143\1\157\1\171\1\uffff\1\60\1\156\1\uffff\1\145"+
        "\1\60\1\145\2\164\1\151\1\143\1\157\1\62\3\60\1\141\3\uffff\2\60"+
        "\1\156\2\60\1\157\1\145\1\60\1\145\1\163\1\171\1\156\1\164\3\60"+
        "\1\146\1\uffff\1\60\1\141\1\156\1\157\1\uffff\1\60\1\146\1\uffff"+
        "\1\146\1\166\1\151\1\172\1\141\1\156\1\uffff\1\56\3\uffff\1\162"+
        "\1\uffff\1\164\2\uffff\1\60\2\uffff\1\165\1\164\1\uffff\3\60\1\143"+
        "\1\60\3\uffff\1\145\1\uffff\1\154\1\164\1\165\1\uffff\2\145\1\151"+
        "\1\143\1\157\1\154\1\164\1\61\2\145\1\uffff\1\164\1\145\3\uffff"+
        "\1\145\1\uffff\1\162\1\60\1\141\1\164\2\162\1\145\1\141\1\156\1"+
        "\60\1\141\2\uffff\1\145\1\147\1\60\1\170\1\60\1\145\1\uffff\1\154"+
        "\1\60\2\145\1\167\1\154\1\164\1\uffff\1\154\1\156\1\145\1\uffff"+
        "\1\164\1\uffff\1\156\1\60\1\uffff\2\156\2\60\1\141\2\60\1\162\1"+
        "\166\1\143\1\uffff\2\143\2\uffff\1\154\2\uffff\1\171\1\151\3\145"+
        "\2\60\1\145\3\60\2\uffff\1\167\3\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\170\1\156\2\uffff\1\165\2\uffff\1\162\1\145\1\165\1"+
        "\160\1\151\1\165\1\170\1\uffff\1\162\1\155\2\uffff\1\157\1\162\1"+
        "\151\1\165\1\154\1\uffff\1\55\1\156\1\111\1\117\1\125\1\164\1\146"+
        "\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\157\1\141\1\162\2\172"+
        "\1\uffff\1\160\1\172\2\uffff\1\156\1\164\2\151\1\162\1\154\2\uffff"+
        "\1\162\1\145\1\170\1\160\1\165\1\162\1\160\1\164\1\151\1\163\2\164"+
        "\1\141\1\146\1\172\1\171\1\163\1\146\1\157\1\172\1\155\1\162\2\164"+
        "\1\151\1\uffff\1\151\1\141\1\162\1\172\2\uffff\1\162\1\141\1\154"+
        "\1\157\1\154\1\163\1\164\1\156\1\143\2\164\1\145\1\156\1\151\2\uffff"+
        "\1\144\1\101\1\124\1\114\1\162\6\uffff\1\153\1\152\1\146\1\164\1"+
        "\163\2\uffff\1\157\1\147\1\172\1\uffff\1\145\1\157\1\155\1\166\2"+
        "\144\1\154\1\147\1\172\1\155\1\164\1\147\1\172\1\145\1\164\1\154"+
        "\1\151\1\147\2\157\1\141\1\154\1\141\1\uffff\1\157\1\164\1\145\1"+
        "\164\1\167\1\156\1\uffff\1\155\1\151\1\162\1\142\1\145\1\154\1\164"+
        "\1\147\1\166\1\160\1\147\1\uffff\1\151\1\155\1\163\1\141\1\154\1"+
        "\141\1\157\2\151\1\147\1\150\1\153\1\164\1\154\1\164\1\143\1\164"+
        "\1\160\1\162\1\114\1\111\1\114\1\151\1\141\2\145\1\146\1\151\1\162"+
        "\1\145\1\162\1\uffff\1\162\1\172\1\157\1\151\1\166\1\154\2\145\1"+
        "\143\1\145\1\uffff\1\145\1\166\1\154\1\uffff\1\172\3\151\1\166\1"+
        "\156\1\154\1\143\1\155\1\157\2\165\1\166\1\141\2\172\1\156\1\141"+
        "\1\156\1\164\1\171\1\154\1\156\1\151\1\164\1\150\1\151\1\172\1\151"+
        "\1\172\2\145\1\164\1\172\1\164\1\165\1\157\1\156\2\164\1\147\1\157"+
        "\1\145\1\157\1\153\1\145\1\137\1\157\1\117\1\124\1\123\1\156\1\147"+
        "\1\143\1\162\1\157\1\163\1\164\1\166\1\162\1\141\1\uffff\1\144\1"+
        "\164\1\151\1\141\1\162\2\164\1\154\1\172\2\151\1\156\1\145\1\uffff"+
        "\1\157\2\143\1\151\1\120\1\165\2\157\1\147\1\154\1\164\1\143\1\164"+
        "\1\151\2\162\2\uffff\1\145\1\162\1\147\1\171\1\145\1\126\1\145\1"+
        "\144\1\163\1\145\1\164\1\145\2\uffff\1\156\1\157\1\154\2\172\1\166"+
        "\2\uffff\1\151\1\162\2\147\1\157\1\172\1\162\1\156\1\141\1\155\1"+
        "\145\1\162\1\166\1\151\1\107\1\114\1\103\1\147\1\145\1\164\1\145"+
        "\1\162\1\164\1\172\1\151\1\141\1\164\1\145\1\171\1\145\2\171\1\172"+
        "\1\151\1\141\1\uffff\1\145\2\172\1\146\1\142\1\156\2\141\1\164\1"+
        "\141\1\164\1\155\1\144\1\124\1\164\1\172\1\164\3\145\1\154\1\162"+
        "\1\171\1\141\1\172\1\163\1\141\1\144\1\163\1\164\1\170\1\172\1\167"+
        "\1\172\1\156\1\141\2\uffff\1\145\1\157\1\166\1\143\1\162\1\165\1"+
        "\142\1\156\1\uffff\1\157\1\172\1\156\1\172\1\157\1\144\1\172\1\145"+
        "\1\157\1\144\1\172\1\105\1\122\3\172\1\156\1\155\1\145\1\uffff\1"+
        "\145\1\171\1\157\1\154\1\172\1\167\1\157\1\172\1\uffff\1\166\1\171"+
        "\1\167\1\145\1\uffff\1\172\1\165\1\172\1\154\1\164\1\171\1\162\1"+
        "\145\1\160\1\145\1\151\1\126\1\141\1\uffff\1\151\1\155\1\167\1\146"+
        "\1\141\2\172\1\162\1\uffff\1\172\1\154\2\172\1\166\1\164\1\uffff"+
        "\1\172\1\uffff\1\164\1\171\2\162\2\145\1\157\1\164\1\141\1\145\1"+
        "\165\1\uffff\1\172\1\uffff\1\170\1\164\1\166\1\uffff\2\162\1\40"+
        "\1\uffff\1\172\1\105\3\uffff\1\143\1\172\1\156\1\167\1\172\1\162"+
        "\1\172\1\uffff\1\172\1\165\1\uffff\1\151\1\157\2\172\1\uffff\1\164"+
        "\1\uffff\1\172\1\151\1\172\1\145\3\154\1\164\1\141\1\162\1\166\2"+
        "\172\1\145\1\171\2\uffff\1\162\1\uffff\1\165\2\uffff\1\151\1\172"+
        "\1\uffff\1\141\1\157\1\164\1\151\1\154\1\163\1\165\1\164\1\162\1"+
        "\160\1\156\1\uffff\1\172\2\145\1\157\1\164\1\151\1\64\1\uffff\1"+
        "\105\1\145\1\uffff\1\164\1\172\1\uffff\1\172\2\uffff\2\164\1\165"+
        "\2\uffff\1\164\1\uffff\1\157\1\uffff\1\156\1\141\1\145\1\172\2\154"+
        "\1\141\1\151\2\uffff\1\162\1\157\1\141\2\145\1\162\1\uffff\1\154"+
        "\1\165\1\151\1\172\1\141\1\172\1\160\1\157\1\172\1\162\1\144\1\162"+
        "\1\uffff\1\170\2\162\1\151\1\172\2\56\1\uffff\1\116\2\172\2\uffff"+
        "\1\172\1\171\1\164\1\157\1\156\1\164\1\171\1\164\1\uffff\1\145\1"+
        "\165\1\155\1\164\1\145\1\165\1\171\1\163\1\167\1\145\1\172\1\164"+
        "\1\143\1\157\1\171\1\uffff\1\172\1\156\1\uffff\1\145\1\172\1\145"+
        "\2\164\1\151\1\143\1\157\1\63\1\61\2\172\1\141\3\uffff\2\172\1\156"+
        "\2\172\1\157\1\145\1\172\1\145\1\163\1\171\1\156\1\164\3\172\1\146"+
        "\1\uffff\1\172\1\141\1\156\1\157\1\uffff\1\172\1\146\1\uffff\1\146"+
        "\1\166\1\151\1\172\1\141\1\156\1\uffff\1\56\3\uffff\1\162\1\uffff"+
        "\1\164\2\uffff\1\172\2\uffff\1\165\1\164\1\uffff\3\172\1\143\1\172"+
        "\3\uffff\1\145\1\uffff\1\154\1\164\1\165\1\uffff\2\145\1\151\1\143"+
        "\1\157\1\154\1\164\1\63\2\145\1\uffff\1\164\1\145\3\uffff\1\145"+
        "\1\uffff\1\162\1\172\1\141\1\164\2\162\1\145\1\141\1\156\1\172\1"+
        "\141\2\uffff\1\145\1\147\1\172\1\170\1\172\1\145\1\uffff\1\154\1"+
        "\172\2\145\1\167\1\154\1\164\1\uffff\1\154\1\156\1\145\1\uffff\1"+
        "\164\1\uffff\1\156\1\172\1\uffff\2\156\2\172\1\141\2\172\1\162\1"+
        "\166\1\143\1\uffff\2\143\2\uffff\1\154\2\uffff\1\171\1\151\3\145"+
        "\2\172\1\145\3\172\2\uffff\1\167\3\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\7\7\uffff\1\32\2\uffff\1\36\1\41"+
        "\5\uffff\1\117\10\uffff\1\170\1\171\3\uffff\1\175\1\176\6\uffff"+
        "\1\170\2\uffff\1\3\1\4\6\uffff\1\6\1\7\31\uffff\1\32\4\uffff\1\36"+
        "\1\41\16\uffff\1\117\1\122\5\uffff\1\167\1\171\1\172\1\173\1\174"+
        "\1\175\5\uffff\1\163\1\164\3\uffff\1\166\27\uffff\1\161\6\uffff"+
        "\1\162\13\uffff\1\165\37\uffff\1\141\12\uffff\1\22\3\uffff\1\142"+
        "\75\uffff\1\27\15\uffff\1\123\20\uffff\1\144\1\23\14\uffff\1\160"+
        "\1\156\6\uffff\1\157\1\151\43\uffff\1\20\44\uffff\1\124\1\137\10"+
        "\uffff\1\145\23\uffff\1\2\10\uffff\1\10\4\uffff\1\74\15\uffff\1"+
        "\17\10\uffff\1\30\6\uffff\1\34\1\uffff\1\35\13\uffff\1\63\1\uffff"+
        "\1\143\3\uffff\1\146\3\uffff\1\133\2\uffff\1\136\1\1\1\11\7\uffff"+
        "\1\40\2\uffff\1\53\4\uffff\1\75\1\uffff\1\13\17\uffff\1\67\1\110"+
        "\1\uffff\1\65\1\uffff\1\111\1\31\2\uffff\1\55\13\uffff\1\140\7\uffff"+
        "\1\134\2\uffff\1\12\2\uffff\1\120\1\uffff\1\33\1\66\3\uffff\1\57"+
        "\1\60\1\uffff\1\44\1\uffff\1\16\10\uffff\1\25\1\64\6\uffff\1\62"+
        "\14\uffff\1\70\7\uffff\1\132\3\uffff\1\56\1\5\10\uffff\1\15\17\uffff"+
        "\1\116\2\uffff\1\72\15\uffff\1\101\1\112\1\51\21\uffff\1\45\4\uffff"+
        "\1\71\2\uffff\1\61\6\uffff\1\125\1\uffff\1\130\1\131\1\135\1\uffff"+
        "\1\26\1\uffff\1\21\1\52\1\uffff\1\14\1\37\2\uffff\1\113\5\uffff"+
        "\1\121\1\115\1\54\1\uffff\1\47\3\uffff\1\76\12\uffff\1\73\2\uffff"+
        "\1\114\1\46\1\24\1\uffff\1\43\13\uffff\1\126\1\127\6\uffff\1\152"+
        "\7\uffff\1\154\3\uffff\1\42\1\uffff\1\105\2\uffff\1\50\12\uffff"+
        "\1\153\2\uffff\1\77\1\147\1\uffff\1\155\1\102\13\uffff\1\150\1\103"+
        "\1\uffff\1\104\1\107\1\106\1\uffff\1\100";
    static final String DFA13_specialS =
        "\1\2\43\uffff\1\0\1\1\u031c\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\44\1\40\3\50\1\45\2"+
            "\50\1\4\1\50\1\22\1\50\1\3\1\46\12\43\1\17\1\50\1\32\1\31\3"+
            "\50\1\33\2\42\1\34\1\42\1\36\7\42\1\35\4\42\1\37\7\42\3\50\1"+
            "\41\1\42\1\50\1\12\1\27\1\30\1\13\1\16\1\25\1\5\1\24\1\2\2\42"+
            "\1\14\1\21\2\42\1\1\1\42\1\26\1\15\1\10\1\42\1\11\1\20\3\42"+
            "\1\6\1\23\1\7\uff82\50",
            "\1\51\3\uffff\1\54\6\uffff\1\53\5\uffff\1\52\1\uffff\1\55"+
            "\3\uffff\1\56",
            "\1\60\1\61",
            "",
            "",
            "\1\71\3\uffff\1\64\3\uffff\1\70\5\uffff\1\65\2\uffff\1\67"+
            "\2\uffff\1\66",
            "",
            "",
            "\1\74\3\uffff\1\76\2\uffff\1\75\6\uffff\1\77\2\uffff\1\100",
            "\1\101",
            "\1\105\1\103\10\uffff\1\104\3\uffff\1\102\4\uffff\1\106",
            "\1\107\3\uffff\1\111\3\uffff\1\110\6\uffff\1\112",
            "\1\113\3\uffff\1\115\3\uffff\1\114",
            "\1\116\7\uffff\1\117\3\uffff\1\121\1\120",
            "\1\124\11\uffff\1\122\11\uffff\1\123",
            "",
            "\1\126\14\uffff\1\127",
            "\1\130\13\uffff\1\131",
            "",
            "",
            "\1\134",
            "\1\136\7\uffff\1\140\2\uffff\1\137\5\uffff\1\135",
            "\1\142\3\uffff\1\141\3\uffff\1\143",
            "\1\144\15\uffff\1\146\5\uffff\1\145",
            "\1\150\2\uffff\1\147\3\uffff\1\151",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\161\7\uffff\6\161\32\uffff\6\161",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\0\163",
            "\0\163",
            "\1\164\4\uffff\1\165",
            "",
            "",
            "\1\167",
            "\1\171\11\uffff\1\170",
            "\1\172",
            "\1\173",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\177\16\uffff\1\176",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0080\6"+
            "\57",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\7\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "\1\u008a\17\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\10\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009a",
            "\1\u009c\4\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u009f\21"+
            "\57",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\22\uffff\1\u00a3",
            "\1\u00a6\3\uffff\1\u00a5",
            "\1\u00a7",
            "",
            "\1\u00a9\6\uffff\1\u00a8",
            "\1\u00aa",
            "\1\u00ab",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\6\uffff\1\u00b3",
            "\1\u00b4\17\uffff\1\u00b5",
            "\1\u00b7\6\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\4\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00cb\31\57",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00d5\12\57\1"+
            "\u00d6\16\57",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00dc",
            "\1\u00dd\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef\10\uffff\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0125\3\uffff\1\u0124\42\uffff\1\u0123",
            "\1\u0126",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133\7\uffff\1\u0134\6\uffff\1\u0136\5\uffff\1\u0135",
            "\1\u0137",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e\17\uffff\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146\11\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014e\11\uffff\12\57\7\uffff\32\57\4\uffff\1\u014d\1\uffff"+
            "\32\57",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0174",
            "\1\u0175",
            "\1\u0177\7\uffff\1\u0176",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u019b\15\uffff\1\u019a",
            "",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019f\4\uffff\1\u019e",
            "\1\u01a0",
            "\1\u01a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7\2\uffff\1\u01a8",
            "\1\u01a9",
            "\1\u01ab\15\uffff\1\u01aa",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01d1\12"+
            "\57",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01e3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01f1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01f3",
            "\1\u01f4",
            "\12\57\7\uffff\32\57\4\uffff\1\u01f5\1\uffff\32\57",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01fb",
            "\1\u01fc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0208",
            "\1\u0209",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0210",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0223",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0225",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0228",
            "\1\u0229",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\u023a\15\uffff\1\u0239",
            "",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u023f",
            "",
            "",
            "",
            "\1\u0240",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0242",
            "\1\u0243",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0245",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0248",
            "",
            "\1\u0249",
            "\1\u024a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u024d",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u024f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u025b",
            "\1\u025c",
            "",
            "",
            "\1\u025d",
            "",
            "\1\u025e",
            "",
            "",
            "\1\u025f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u0260\12"+
            "\57",
            "",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u026d\12"+
            "\57",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274\1\u0275\1\u0276",
            "",
            "\1\u0277",
            "\1\u0278",
            "",
            "\1\u0279",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "",
            "",
            "\1\u027f",
            "",
            "\1\u0280",
            "",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "",
            "",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0295",
            "\1\u0296",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u02a4\17"+
            "\57\1\u02a3\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02bf",
            "",
            "\1\u02c0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8\1\u02c9",
            "\1\u02ca\1\u02cb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u02cd\27"+
            "\57",
            "\1\u02cf",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02d5",
            "\1\u02d6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02e0",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02e6",
            "",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "",
            "\1\u02ed",
            "",
            "",
            "",
            "\1\u02ee",
            "",
            "\1\u02ef",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u02f1",
            "\1\u02f2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02f6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u02f8",
            "",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303\1\uffff\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "",
            "\1\u0307",
            "\1\u0308",
            "",
            "",
            "",
            "\1\u0309",
            "",
            "\1\u030a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0314",
            "",
            "",
            "\1\u0315",
            "\1\u0316",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0318",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u031a",
            "",
            "\1\u031b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "",
            "\1\u0325",
            "",
            "\1\u0326",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0328",
            "\1\u0329",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u032c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "",
            "\1\u0332",
            "\1\u0333",
            "",
            "",
            "\1\u0334",
            "",
            "",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u033c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0340",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 115;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 115;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0=='.') ) {s = 3;}

                        else if ( (LA13_0=='*') ) {s = 4;}

                        else if ( (LA13_0=='g') ) {s = 5;}

                        else if ( (LA13_0=='{') ) {s = 6;}

                        else if ( (LA13_0=='}') ) {s = 7;}

                        else if ( (LA13_0=='t') ) {s = 8;}

                        else if ( (LA13_0=='v') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='d') ) {s = 11;}

                        else if ( (LA13_0=='l') ) {s = 12;}

                        else if ( (LA13_0=='s') ) {s = 13;}

                        else if ( (LA13_0=='e') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='w') ) {s = 16;}

                        else if ( (LA13_0=='m') ) {s = 17;}

                        else if ( (LA13_0==',') ) {s = 18;}

                        else if ( (LA13_0=='|') ) {s = 19;}

                        else if ( (LA13_0=='h') ) {s = 20;}

                        else if ( (LA13_0=='f') ) {s = 21;}

                        else if ( (LA13_0=='r') ) {s = 22;}

                        else if ( (LA13_0=='b') ) {s = 23;}

                        else if ( (LA13_0=='c') ) {s = 24;}

                        else if ( (LA13_0=='=') ) {s = 25;}

                        else if ( (LA13_0=='<') ) {s = 26;}

                        else if ( (LA13_0=='A') ) {s = 27;}

                        else if ( (LA13_0=='D') ) {s = 28;}

                        else if ( (LA13_0=='N') ) {s = 29;}

                        else if ( (LA13_0=='F') ) {s = 30;}

                        else if ( (LA13_0=='S') ) {s = 31;}

                        else if ( (LA13_0=='#') ) {s = 32;}

                        else if ( (LA13_0=='^') ) {s = 33;}

                        else if ( ((LA13_0>='B' && LA13_0<='C')||LA13_0=='E'||(LA13_0>='G' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||LA13_0=='u'||(LA13_0>='x' && LA13_0<='z')) ) {s = 34;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 35;}

                        else if ( (LA13_0=='\"') ) {s = 36;}

                        else if ( (LA13_0=='\'') ) {s = 37;}

                        else if ( (LA13_0=='/') ) {s = 38;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 39;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||LA13_0=='+'||LA13_0=='-'||LA13_0==';'||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}