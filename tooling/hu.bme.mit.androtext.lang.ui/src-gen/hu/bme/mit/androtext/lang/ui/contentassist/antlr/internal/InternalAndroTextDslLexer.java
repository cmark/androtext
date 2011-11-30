package hu.bme.mit.androtext.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroTextDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_HEX_COLOR=7;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int T__143=143;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__213=213;
    public static final int T__214=214;
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
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__199=199;
    public static final int T__57=57;
    public static final int T__198=198;
    public static final int T__58=58;
    public static final int T__197=197;
    public static final int T__51=51;
    public static final int T__196=196;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__195=195;
    public static final int T__54=54;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__184=184;
    public static final int T__43=43;
    public static final int T__183=183;
    public static final int T__40=40;
    public static final int T__186=186;
    public static final int T__41=41;
    public static final int T__185=185;
    public static final int T__46=46;
    public static final int T__188=188;
    public static final int T__47=47;
    public static final int T__187=187;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__189=189;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__30=30;
    public static final int T__173=173;
    public static final int T__31=31;
    public static final int T__172=172;
    public static final int T__32=32;
    public static final int T__179=179;
    public static final int T__33=33;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int T__177=177;
    public static final int T__35=35;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int RULE_WS=10;
    public static final int T__169=169;

    // delegates
    // delegators

    public InternalAndroTextDslLexer() {;} 
    public InternalAndroTextDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAndroTextDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:11:7: ( 'horizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:11:9: 'horizontal'
            {
            match("horizontal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:12:7: ( 'vertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:12:9: 'vertical'
            {
            match("vertical"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:13:7: ( 'true' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:13:9: 'true'
            {
            match("true"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:14:7: ( 'false' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:14:9: 'false'
            {
            match("false"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:15:7: ( 'Android 2.2' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:15:9: 'Android 2.2'
            {
            match("Android 2.2"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:16:7: ( 'Android 2.3.1' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:16:9: 'Android 2.3.1'
            {
            match("Android 2.3.1"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:17:7: ( 'Android 2.3.3' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:17:9: 'Android 2.3.3'
            {
            match("Android 2.3.3"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:18:7: ( 'Android 3.0' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:18:9: 'Android 3.0'
            {
            match("Android 3.0"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:19:7: ( 'Android 3.1' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:19:9: 'Android 3.1'
            {
            match("Android 3.1"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:20:7: ( 'Android 4.0' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:20:9: 'Android 4.0'
            {
            match("Android 4.0"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:21:7: ( 'DIALOG' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:21:9: 'DIALOG'
            {
            match("DIALOG"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:22:7: ( 'NOTITLEBAR' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:22:9: 'NOTITLEBAR'
            {
            match("NOTITLEBAR"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:23:7: ( 'FULLSCREEN' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:23:9: 'FULLSCREEN'
            {
            match("FULLSCREEN"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:24:7: ( 'String' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:24:9: 'String'
            {
            match("String"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:25:7: ( 'float' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:25:9: 'float'
            {
            match("float"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:26:7: ( 'boolean' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:26:9: 'boolean'
            {
            match("boolean"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:27:7: ( 'int' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:27:9: 'int'
            {
            match("int"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:28:7: ( 'integer' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:28:9: 'integer'
            {
            match("integer"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:29:7: ( 'signed' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:29:9: 'signed'
            {
            match("signed"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:30:7: ( 'decimal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:30:9: 'decimal'
            {
            match("decimal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:31:7: ( 'normal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:31:9: 'normal'
            {
            match("normal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:32:7: ( 'sans' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:32:9: 'sans'
            {
            match("sans"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:33:7: ( 'serif' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:33:9: 'serif'
            {
            match("serif"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34:7: ( 'monospace' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34:9: 'monospace'
            {
            match("monospace"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:35:7: ( 'bold' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:35:9: 'bold'
            {
            match("bold"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:36:7: ( 'italic' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:36:9: 'italic'
            {
            match("italic"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:37:7: ( 'none' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:37:9: 'none'
            {
            match("none"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:38:7: ( 'sentences' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:38:9: 'sentences'
            {
            match("sentences"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:39:7: ( 'words' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:39:9: 'words'
            {
            match("words"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:40:7: ( 'characters' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:40:9: 'characters'
            {
            match("characters"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:41:7: ( 'web' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:41:9: 'web'
            {
            match("web"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:42:7: ( 'email' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:42:9: 'email'
            {
            match("email"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:43:7: ( 'phone' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:43:9: 'phone'
            {
            match("phone"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:44:7: ( 'map' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:44:9: 'map'
            {
            match("map"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:45:7: ( 'spacingWidth' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:45:9: 'spacingWidth'
            {
            match("spacingWidth"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:46:7: ( 'columnWidth' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:46:9: 'columnWidth'
            {
            match("columnWidth"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47:7: ( 'spacingWidthUniform' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47:9: 'spacingWidthUniform'
            {
            match("spacingWidthUniform"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:48:7: ( 'top' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:48:9: 'top'
            {
            match("top"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:49:7: ( 'bottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:49:9: 'bottom'
            {
            match("bottom"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:50:7: ( 'left' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:50:9: 'left'
            {
            match("left"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:51:7: ( 'right' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:51:9: 'right'
            {
            match("right"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:52:7: ( 'center' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:52:9: 'center'
            {
            match("center"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:53:7: ( 'center_vertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:53:9: 'center_vertical'
            {
            match("center_vertical"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:54:7: ( 'center_horizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:54:9: 'center_horizontal'
            {
            match("center_horizontal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:55:7: ( 'fill' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:55:9: 'fill'
            {
            match("fill"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:56:7: ( 'fill_vertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:56:9: 'fill_vertical'
            {
            match("fill_vertical"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:57:7: ( 'fill_horizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:57:9: 'fill_horizontal'
            {
            match("fill_horizontal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:58:7: ( 'clip_vertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:58:9: 'clip_vertical'
            {
            match("clip_vertical"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:59:7: ( 'clip_horizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:59:9: 'clip_horizontal'
            {
            match("clip_horizontal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:60:7: ( 'wrap' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:60:9: 'wrap'
            {
            match("wrap"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:61:7: ( 'fill&wrap' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:61:9: 'fill&wrap'
            {
            match("fill&wrap"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:62:7: ( 'wrap&fill' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:62:9: 'wrap&fill'
            {
            match("wrap&fill"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:63:7: ( 'match' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:63:9: 'match'
            {
            match("match"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:64:7: ( 'edit_text' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:64:9: 'edit_text'
            {
            match("edit_text"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:65:7: ( 'editbox_background' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:65:9: 'editbox_background'
            {
            match("editbox_background"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:66:7: ( 'editbox_background_normal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:66:9: 'editbox_background_normal'
            {
            match("editbox_background_normal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:67:7: ( 'editbox_dropdown_dark_frame' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:67:9: 'editbox_dropdown_dark_frame'
            {
            match("editbox_dropdown_dark_frame"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:68:7: ( 'editbox_dropdown_light_frame' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:68:9: 'editbox_dropdown_light_frame'
            {
            match("editbox_dropdown_light_frame"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:69:7: ( 'dp' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:69:9: 'dp'
            {
            match("dp"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:70:7: ( 'sp' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:70:9: 'sp'
            {
            match("sp"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:71:7: ( 'pt' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:71:9: 'pt'
            {
            match("pt"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:72:7: ( 'px' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:72:9: 'px'
            {
            match("px"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:73:7: ( 'mm' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:73:9: 'mm'
            {
            match("mm"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:74:7: ( 'in' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:74:9: 'in'
            {
            match("in"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:75:7: ( 'package' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:75:9: 'package'
            {
            match("package"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:76:7: ( 'import' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:76:9: 'import'
            {
            match("import"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:77:7: ( '.' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:77:9: '.'
            {
            match('.'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:78:7: ( '*' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:78:9: '*'
            {
            match('*'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:79:7: ( 'generator' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:79:9: 'generator'
            {
            match("generator"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:80:7: ( '{' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:80:9: '{'
            {
            match('{'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:81:7: ( '}' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:81:9: '}'
            {
            match('}'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:82:7: ( 'target' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:82:9: 'target'
            {
            match("target"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:83:7: ( 'project' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:83:9: 'project'
            {
            match("project"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:84:7: ( 'platform' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:84:9: 'platform'
            {
            match("platform"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:85:7: ( 'version' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:85:9: 'version'
            {
            match("version"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:86:7: ( 'application' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:86:9: 'application'
            {
            match("application"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:87:7: ( 'datamodel' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:87:9: 'datamodel'
            {
            match("datamodel"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:88:7: ( 'activity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:88:9: 'activity'
            {
            match("activity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:89:7: ( 'layout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:89:9: 'layout'
            {
            match("layout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:90:7: ( 'theme' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:90:9: 'theme'
            {
            match("theme"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:91:7: ( 'tabactivity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:91:9: 'tabactivity'
            {
            match("tabactivity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:92:7: ( 'tab' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:92:9: 'tab'
            {
            match("tab"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:93:7: ( 'show' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:93:9: 'show'
            {
            match("show"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:94:7: ( 'image' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:94:9: 'image'
            {
            match("image"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:95:7: ( 'listactivity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:95:9: 'listactivity'
            {
            match("listactivity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:96:7: ( 'listitem' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:96:9: 'listitem'
            {
            match("listitem"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:97:7: ( 'content' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:97:9: 'content'
            {
            match("content"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:98:7: ( 'preferences' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:98:9: 'preferences'
            {
            match("preferences"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:99:8: ( 'entity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:99:10: 'entity'
            {
            match("entity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:100:8: ( 'extends' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:100:10: 'extends'
            {
            match("extends"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:101:8: ( ':' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:101:10: ':'
            {
            match(':'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:102:8: ( 'guimodel' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:102:10: 'guimodel'
            {
            match("guimodel"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:103:8: ( 'layoutProperties' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:103:10: 'layoutProperties'
            {
            match("layoutProperties"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:104:8: ( 'height' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:104:10: 'height'
            {
            match("height"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:105:8: ( 'width' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:105:10: 'width'
            {
            match("width"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:106:8: ( 'absolutelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:106:10: 'absolutelayout'
            {
            match("absolutelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:107:8: ( 'linearlayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:107:10: 'linearlayout'
            {
            match("linearlayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:108:8: ( 'framelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:108:10: 'framelayout'
            {
            match("framelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:109:8: ( 'relativelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:109:10: 'relativelayout'
            {
            match("relativelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:110:8: ( 'girdlayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:110:10: 'girdlayout'
            {
            match("girdlayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:111:8: ( 'tablelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:111:10: 'tablelayout'
            {
            match("tablelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:112:8: ( 'tablerow' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:112:10: 'tablerow'
            {
            match("tablerow"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:113:8: ( 'view' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:113:10: 'view'
            {
            match("view"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:114:8: ( 'textview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:114:10: 'textview'
            {
            match("textview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:115:8: ( 'edittext' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:115:10: 'edittext'
            {
            match("edittext"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:116:8: ( 'button' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:116:10: 'button'
            {
            match("button"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:117:8: ( 'gallery' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:117:10: 'gallery'
            {
            match("gallery"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:118:8: ( 'explistview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:118:10: 'explistview'
            {
            match("explistview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:119:8: ( 'webview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:119:10: 'webview'
            {
            match("webview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:120:8: ( 'imageview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:120:10: 'imageview'
            {
            match("imageview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:121:8: ( 'listview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:121:10: 'listview'
            {
            match("listview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:122:8: ( 'gridview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:122:10: 'gridview'
            {
            match("gridview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:123:8: ( 'spinner' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:123:10: 'spinner'
            {
            match("spinner"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:124:8: ( 'checkbox' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:124:10: 'checkbox'
            {
            match("checkbox"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:125:8: ( 'radiogroup' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:125:10: 'radiogroup'
            {
            match("radiogroup"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:126:8: ( 'ratingbar' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:126:10: 'ratingbar'
            {
            match("ratingbar"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:127:8: ( 'togglebutton' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:127:10: 'togglebutton'
            {
            match("togglebutton"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:128:8: ( 'textOn' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:128:10: 'textOn'
            {
            match("textOn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:129:8: ( 'textOff' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:129:10: 'textOff'
            {
            match("textOff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:130:8: ( 'radiobutton' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:130:10: 'radiobutton'
            {
            match("radiobutton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:131:8: ( 'checkedtextview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:131:10: 'checkedtextview'
            {
            match("checkedtextview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:132:8: ( 'autocompletetextview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:132:10: 'autocompletetextview'
            {
            match("autocompletetextview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:133:8: ( 'multi' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:133:10: 'multi'
            {
            match("multi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:134:8: ( 'preference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:134:10: 'preference'
            {
            match("preference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:135:8: ( 'preferencescreen' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:135:10: 'preferencescreen'
            {
            match("preferencescreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:136:8: ( 'preferencecategery' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:136:10: 'preferencecategery'
            {
            match("preferencecategery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:137:8: ( 'edittextpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:137:10: 'edittextpreference'
            {
            match("edittextpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:138:8: ( 'listpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:138:10: 'listpreference'
            {
            match("listpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:139:8: ( 'checkboxpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:139:10: 'checkboxpreference'
            {
            match("checkboxpreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:140:8: ( 'ringtonepreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:140:10: 'ringtonepreference'
            {
            match("ringtonepreference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:141:8: ( 'summary' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:141:10: 'summary'
            {
            match("summary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:142:8: ( 'enabled' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:142:10: 'enabled'
            {
            match("enabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:143:8: ( 'persistent' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:143:10: 'persistent'
            {
            match("persistent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:144:8: ( 'dialogTitle' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:144:10: 'dialogTitle'
            {
            match("dialogTitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:145:8: ( 'defaultValue' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:145:10: 'defaultValue'
            {
            match("defaultValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:146:8: ( 'entryValues' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:146:10: 'entryValues'
            {
            match("entryValues"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:147:8: ( 'span' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:147:10: 'span'
            {
            match("span"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:148:8: ( 'column' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:148:10: 'column'
            {
            match("column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:149:8: ( 'centerVertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:149:10: 'centerVertical'
            {
            match("centerVertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:150:8: ( 'centerInParent' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:150:10: 'centerInParent'
            {
            match("centerInParent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:151:8: ( 'centerHorizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:151:10: 'centerHorizontal'
            {
            match("centerHorizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:152:8: ( 'toRightOf' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:152:10: 'toRightOf'
            {
            match("toRightOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:153:8: ( 'toLeftOf' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:153:10: 'toLeftOf'
            {
            match("toLeftOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:154:8: ( 'above' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:154:10: 'above'
            {
            match("above"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:155:8: ( 'below' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:155:10: 'below'
            {
            match("below"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:156:8: ( 'alignLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:156:10: 'alignLeft'
            {
            match("alignLeft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:157:8: ( 'alignBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:157:10: 'alignBottom'
            {
            match("alignBottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:158:8: ( 'alignTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:158:10: 'alignTop'
            {
            match("alignTop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:159:8: ( 'alignParentLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:159:10: 'alignParentLeft'
            {
            match("alignParentLeft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:160:8: ( 'alignParentTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:160:10: 'alignParentTop'
            {
            match("alignParentTop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:161:8: ( 'alignParentRight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:161:10: 'alignParentRight'
            {
            match("alignParentRight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:162:8: ( 'alignParentBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:162:10: 'alignParentBottom'
            {
            match("alignParentBottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:163:8: ( 'marginBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:163:10: 'marginBottom'
            {
            match("marginBottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:164:8: ( 'marginRight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:164:10: 'marginRight'
            {
            match("marginRight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:165:8: ( 'marginTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:165:10: 'marginTop'
            {
            match("marginTop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:166:8: ( 'weight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:166:10: 'weight'
            {
            match("weight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:167:8: ( 'marginLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:167:10: 'marginLeft'
            {
            match("marginLeft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:168:8: ( 'textStyle' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:168:10: 'textStyle'
            {
            match("textStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:169:8: ( '|' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:169:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:170:8: ( 'typeface' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:170:10: 'typeface'
            {
            match("typeface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:171:8: ( 'textColor' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:171:10: 'textColor'
            {
            match("textColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:172:8: ( 'singleLine' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:172:10: 'singleLine'
            {
            match("singleLine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:173:8: ( 'phoneNumber' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:173:10: 'phoneNumber'
            {
            match("phoneNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:174:8: ( 'password' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:174:10: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:175:8: ( 'numeric' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:175:10: 'numeric'
            {
            match("numeric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:176:8: ( 'hint' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:176:10: 'hint'
            {
            match("hint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:177:8: ( 'editable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:177:10: 'editable'
            {
            match("editable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:178:8: ( 'digits' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:178:10: 'digits'
            {
            match("digits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:179:8: ( 'capitalize' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:179:10: 'capitalize'
            {
            match("capitalize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:180:8: ( 'autoText' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:180:10: 'autoText'
            {
            match("autoText"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:181:8: ( 'isScrollContainer' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:181:10: 'isScrollContainer'
            {
            match("isScrollContainer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:182:8: ( 'fadeScrollBars' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:182:10: 'fadeScrollBars'
            {
            match("fadeScrollBars"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:183:8: ( 'clickable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:183:10: 'clickable'
            {
            match("clickable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:184:8: ( 'autoLink' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:184:10: 'autoLink'
            {
            match("autoLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:185:8: ( 'padding' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:185:10: 'padding'
            {
            match("padding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:186:8: ( 'gravity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:186:10: 'gravity'
            {
            match("gravity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:187:8: ( 'textSize' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:187:10: 'textSize'
            {
            match("textSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:188:8: ( 'background' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:188:10: 'background'
            {
            match("background"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:189:8: ( 'horizontalSpacing' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:189:10: 'horizontalSpacing'
            {
            match("horizontalSpacing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:190:8: ( 'numColumns' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:190:10: 'numColumns'
            {
            match("numColumns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:191:8: ( 'stretchMode' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:191:10: 'stretchMode'
            {
            match("stretchMode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:192:8: ( 'verticalSpacing' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:192:10: 'verticalSpacing'
            {
            match("verticalSpacing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:193:8: ( 'entries' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:193:10: 'entries'
            {
            match("entries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:194:8: ( 'stretch' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:194:10: 'stretch'
            {
            match("stretch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:195:8: ( ',' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:195:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:196:8: ( 'shrink' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:196:10: 'shrink'
            {
            match("shrink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:197:8: ( 'collapse' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:197:10: 'collapse'
            {
            match("collapse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:198:8: ( 'resources' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:198:10: 'resources'
            {
            match("resources"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:199:8: ( 'string' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:199:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:200:8: ( '=' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:200:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:201:8: ( 'bool' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:201:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:202:8: ( 'color' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:202:10: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:203:8: ( 'dimension' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:203:10: 'dimension'
            {
            match("dimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:204:8: ( 'intarray' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:204:10: 'intarray'
            {
            match("intarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:205:8: ( 'stringarray' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:205:10: 'stringarray'
            {
            match("stringarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:206:8: ( 'drawable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:206:10: 'drawable'
            {
            match("drawable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:207:8: ( 'transition' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:207:10: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:208:8: ( '<->' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:208:10: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:209:8: ( 'tabdrawable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:209:10: 'tabdrawable'
            {
            match("tabdrawable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:210:8: ( 'selected' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:210:10: 'selected'
            {
            match("selected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:211:8: ( 'unselected' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:211:10: 'unselected'
            {
            match("unselected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:212:8: ( 'all' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:212:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:213:8: ( 'auto_fit' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:213:10: 'auto_fit'
            {
            match("auto_fit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "RULE_HEX_COLOR"
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34382:16: ( '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )? )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34382:18: '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34382:196: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34382:197: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34384:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34384:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34384:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34384:11: '^'
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34384:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34386:10: ( ( '0' .. '9' )+ )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34386:12: ( '0' .. '9' )+
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34386:12: ( '0' .. '9' )+
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
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34386:13: '0' .. '9'
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34388:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34390:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34390:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34390:24: ( options {greedy=false; } : . )*
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
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34390:52: .
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34392:41: '\\r'
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34394:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34394:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34394:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34396:16: ( . )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:34396:18: .
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
        // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=211;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:671: T__119
                {
                mT__119(); 

                }
                break;
            case 109 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:678: T__120
                {
                mT__120(); 

                }
                break;
            case 110 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:685: T__121
                {
                mT__121(); 

                }
                break;
            case 111 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:692: T__122
                {
                mT__122(); 

                }
                break;
            case 112 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:699: T__123
                {
                mT__123(); 

                }
                break;
            case 113 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:706: T__124
                {
                mT__124(); 

                }
                break;
            case 114 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:713: T__125
                {
                mT__125(); 

                }
                break;
            case 115 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:720: T__126
                {
                mT__126(); 

                }
                break;
            case 116 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:727: T__127
                {
                mT__127(); 

                }
                break;
            case 117 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:734: T__128
                {
                mT__128(); 

                }
                break;
            case 118 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:741: T__129
                {
                mT__129(); 

                }
                break;
            case 119 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:748: T__130
                {
                mT__130(); 

                }
                break;
            case 120 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:755: T__131
                {
                mT__131(); 

                }
                break;
            case 121 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:762: T__132
                {
                mT__132(); 

                }
                break;
            case 122 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:769: T__133
                {
                mT__133(); 

                }
                break;
            case 123 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:776: T__134
                {
                mT__134(); 

                }
                break;
            case 124 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:783: T__135
                {
                mT__135(); 

                }
                break;
            case 125 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:790: T__136
                {
                mT__136(); 

                }
                break;
            case 126 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:797: T__137
                {
                mT__137(); 

                }
                break;
            case 127 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:804: T__138
                {
                mT__138(); 

                }
                break;
            case 128 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:811: T__139
                {
                mT__139(); 

                }
                break;
            case 129 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:818: T__140
                {
                mT__140(); 

                }
                break;
            case 130 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:825: T__141
                {
                mT__141(); 

                }
                break;
            case 131 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:832: T__142
                {
                mT__142(); 

                }
                break;
            case 132 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:839: T__143
                {
                mT__143(); 

                }
                break;
            case 133 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:846: T__144
                {
                mT__144(); 

                }
                break;
            case 134 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:853: T__145
                {
                mT__145(); 

                }
                break;
            case 135 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:860: T__146
                {
                mT__146(); 

                }
                break;
            case 136 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:867: T__147
                {
                mT__147(); 

                }
                break;
            case 137 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:874: T__148
                {
                mT__148(); 

                }
                break;
            case 138 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:881: T__149
                {
                mT__149(); 

                }
                break;
            case 139 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:888: T__150
                {
                mT__150(); 

                }
                break;
            case 140 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:895: T__151
                {
                mT__151(); 

                }
                break;
            case 141 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:902: T__152
                {
                mT__152(); 

                }
                break;
            case 142 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:909: T__153
                {
                mT__153(); 

                }
                break;
            case 143 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:916: T__154
                {
                mT__154(); 

                }
                break;
            case 144 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:923: T__155
                {
                mT__155(); 

                }
                break;
            case 145 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:930: T__156
                {
                mT__156(); 

                }
                break;
            case 146 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:937: T__157
                {
                mT__157(); 

                }
                break;
            case 147 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:944: T__158
                {
                mT__158(); 

                }
                break;
            case 148 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:951: T__159
                {
                mT__159(); 

                }
                break;
            case 149 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:958: T__160
                {
                mT__160(); 

                }
                break;
            case 150 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:965: T__161
                {
                mT__161(); 

                }
                break;
            case 151 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:972: T__162
                {
                mT__162(); 

                }
                break;
            case 152 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:979: T__163
                {
                mT__163(); 

                }
                break;
            case 153 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:986: T__164
                {
                mT__164(); 

                }
                break;
            case 154 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:993: T__165
                {
                mT__165(); 

                }
                break;
            case 155 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1000: T__166
                {
                mT__166(); 

                }
                break;
            case 156 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1007: T__167
                {
                mT__167(); 

                }
                break;
            case 157 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1014: T__168
                {
                mT__168(); 

                }
                break;
            case 158 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1021: T__169
                {
                mT__169(); 

                }
                break;
            case 159 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1028: T__170
                {
                mT__170(); 

                }
                break;
            case 160 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1035: T__171
                {
                mT__171(); 

                }
                break;
            case 161 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1042: T__172
                {
                mT__172(); 

                }
                break;
            case 162 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1049: T__173
                {
                mT__173(); 

                }
                break;
            case 163 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1056: T__174
                {
                mT__174(); 

                }
                break;
            case 164 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1063: T__175
                {
                mT__175(); 

                }
                break;
            case 165 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1070: T__176
                {
                mT__176(); 

                }
                break;
            case 166 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1077: T__177
                {
                mT__177(); 

                }
                break;
            case 167 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1084: T__178
                {
                mT__178(); 

                }
                break;
            case 168 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1091: T__179
                {
                mT__179(); 

                }
                break;
            case 169 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1098: T__180
                {
                mT__180(); 

                }
                break;
            case 170 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1105: T__181
                {
                mT__181(); 

                }
                break;
            case 171 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1112: T__182
                {
                mT__182(); 

                }
                break;
            case 172 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1119: T__183
                {
                mT__183(); 

                }
                break;
            case 173 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1126: T__184
                {
                mT__184(); 

                }
                break;
            case 174 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1133: T__185
                {
                mT__185(); 

                }
                break;
            case 175 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1140: T__186
                {
                mT__186(); 

                }
                break;
            case 176 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1147: T__187
                {
                mT__187(); 

                }
                break;
            case 177 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1154: T__188
                {
                mT__188(); 

                }
                break;
            case 178 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1161: T__189
                {
                mT__189(); 

                }
                break;
            case 179 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1168: T__190
                {
                mT__190(); 

                }
                break;
            case 180 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1175: T__191
                {
                mT__191(); 

                }
                break;
            case 181 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1182: T__192
                {
                mT__192(); 

                }
                break;
            case 182 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1189: T__193
                {
                mT__193(); 

                }
                break;
            case 183 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1196: T__194
                {
                mT__194(); 

                }
                break;
            case 184 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1203: T__195
                {
                mT__195(); 

                }
                break;
            case 185 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1210: T__196
                {
                mT__196(); 

                }
                break;
            case 186 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1217: T__197
                {
                mT__197(); 

                }
                break;
            case 187 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1224: T__198
                {
                mT__198(); 

                }
                break;
            case 188 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1231: T__199
                {
                mT__199(); 

                }
                break;
            case 189 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1238: T__200
                {
                mT__200(); 

                }
                break;
            case 190 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1245: T__201
                {
                mT__201(); 

                }
                break;
            case 191 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1252: T__202
                {
                mT__202(); 

                }
                break;
            case 192 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1259: T__203
                {
                mT__203(); 

                }
                break;
            case 193 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1266: T__204
                {
                mT__204(); 

                }
                break;
            case 194 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1273: T__205
                {
                mT__205(); 

                }
                break;
            case 195 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1280: T__206
                {
                mT__206(); 

                }
                break;
            case 196 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1287: T__207
                {
                mT__207(); 

                }
                break;
            case 197 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1294: T__208
                {
                mT__208(); 

                }
                break;
            case 198 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1301: T__209
                {
                mT__209(); 

                }
                break;
            case 199 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1308: T__210
                {
                mT__210(); 

                }
                break;
            case 200 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1315: T__211
                {
                mT__211(); 

                }
                break;
            case 201 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1322: T__212
                {
                mT__212(); 

                }
                break;
            case 202 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1329: T__213
                {
                mT__213(); 

                }
                break;
            case 203 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1336: T__214
                {
                mT__214(); 

                }
                break;
            case 204 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1343: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 205 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1358: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 206 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1366: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 207 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1375: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 208 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1387: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 209 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1403: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 210 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1419: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 211 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1427: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\25\56\2\uffff\1\56\2\uffff\1\56\4\uffff\1\52\1\56\2\52"+
        "\2\uffff\3\52\2\uffff\3\56\1\uffff\25\56\1\u00af\6\56\1\u00bc\4"+
        "\56\1\u00c3\7\56\1\u00d0\17\56\1\u00e5\1\u00e6\12\56\2\uffff\5\56"+
        "\2\uffff\5\56\5\uffff\1\56\6\uffff\7\56\1\u010e\4\56\1\u0116\23"+
        "\56\1\u012c\1\uffff\14\56\1\uffff\6\56\1\uffff\11\56\1\u014b\2\56"+
        "\1\uffff\2\56\1\u0151\21\56\2\uffff\35\56\1\u0184\3\56\1\u0188\2"+
        "\56\1\u018b\1\u018c\1\56\1\uffff\7\56\1\uffff\6\56\1\u01a0\6\56"+
        "\1\u01a8\1\u01a9\6\56\1\uffff\6\56\1\u01b6\4\56\1\u01bb\1\56\1\u01bd"+
        "\14\56\1\u01ca\3\56\1\uffff\5\56\1\uffff\1\56\1\u01d5\32\56\1\u01f4"+
        "\25\56\1\uffff\3\56\1\uffff\2\56\2\uffff\10\56\1\u021e\5\56\1\u0226"+
        "\1\56\1\u0228\1\56\2\uffff\7\56\2\uffff\2\56\1\u0234\5\56\1\u023b"+
        "\3\56\1\uffff\1\u023f\3\56\1\uffff\1\56\1\uffff\14\56\1\uffff\3"+
        "\56\1\u0253\1\56\1\u0255\1\u0256\2\56\2\uffff\1\u0259\4\56\1\u025f"+
        "\5\56\1\u0266\12\56\1\u0272\7\56\1\uffff\6\56\1\u0280\16\56\1\u0290"+
        "\7\56\1\u029b\6\56\1\u02a2\4\56\1\uffff\1\56\1\u02a8\5\56\1\uffff"+
        "\1\56\1\uffff\4\56\1\u02b3\2\56\1\u02b6\1\56\1\u02b8\1\u02b9\1\uffff"+
        "\3\56\1\u02bd\1\u02be\1\56\1\uffff\1\56\1\u02c1\1\56\1\uffff\4\56"+
        "\1\u02c7\2\56\1\u02cb\4\56\1\u02d0\2\56\1\u02d3\3\56\1\uffff\1\56"+
        "\2\uffff\1\56\1\u02dc\1\uffff\3\56\1\u02e1\1\56\1\uffff\1\56\1\u02e8"+
        "\4\56\1\uffff\4\56\1\u02f1\6\56\1\uffff\7\56\1\u0300\5\56\1\uffff"+
        "\17\56\1\uffff\12\56\1\uffff\1\56\1\u0320\4\56\1\uffff\5\56\1\uffff"+
        "\1\u032a\11\56\1\uffff\2\56\1\uffff\1\u0336\2\uffff\1\56\1\u0338"+
        "\1\56\2\uffff\2\56\1\uffff\4\56\1\u0340\1\uffff\1\u0341\1\u0343"+
        "\1\56\1\uffff\1\u0345\3\56\1\uffff\2\56\1\uffff\1\u034b\6\56\1\u0352"+
        "\1\uffff\4\56\1\uffff\1\56\1\u0358\4\56\1\uffff\10\56\1\uffff\1"+
        "\56\1\u0367\1\u0368\1\u0369\2\56\1\u036c\1\56\1\u036e\1\u036f\4"+
        "\56\1\uffff\16\56\1\u0382\1\56\1\u0384\15\56\1\u0393\1\uffff\3\56"+
        "\1\u0397\2\56\1\u039a\1\56\1\u039c\1\uffff\1\56\1\u039e\1\56\1\u03a0"+
        "\4\56\1\uffff\2\56\1\uffff\1\56\1\uffff\1\u03ab\4\56\1\u03b0\1\56"+
        "\2\uffff\1\56\1\uffff\1\56\1\uffff\4\56\1\u03b8\1\uffff\6\56\1\uffff"+
        "\1\56\1\u03c1\2\56\1\u03c4\1\uffff\13\56\1\u03d2\1\u03d3\1\56\3"+
        "\uffff\2\56\1\uffff\1\u03d7\2\uffff\1\56\1\u03d9\3\56\1\u03dd\1"+
        "\u03de\11\56\1\u03e8\1\56\1\uffff\1\u03ea\1\uffff\1\56\1\u03ec\2"+
        "\56\1\u03ef\1\u03f0\1\u03f1\2\56\1\u03f4\4\56\1\uffff\2\56\1\u03fb"+
        "\1\uffff\2\56\1\uffff\1\56\1\uffff\1\u03ff\1\uffff\1\u0400\1\uffff"+
        "\4\56\3\uffff\3\56\1\uffff\1\u040a\2\56\1\u040d\1\uffff\4\56\1\u0412"+
        "\1\56\1\u0414\1\uffff\1\56\1\u0416\2\56\1\u0419\3\56\1\uffff\2\56"+
        "\1\uffff\7\56\1\u0426\1\56\1\u0428\3\56\2\uffff\3\56\1\uffff\1\56"+
        "\1\uffff\3\56\2\uffff\4\56\1\u0437\2\56\1\u043a\1\u043b\1\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\2\56\3\uffff\1\u0440\1\56\1\uffff\2\56"+
        "\1\u0445\1\56\1\u0447\1\56\1\uffff\3\56\2\uffff\4\56\2\uffff\1\u0454"+
        "\1\u0455\1\u0456\1\uffff\1\56\1\u0458\1\uffff\4\56\1\uffff\1\56"+
        "\1\uffff\1\u045e\1\uffff\2\56\1\uffff\1\u0461\1\u0462\12\56\1\uffff"+
        "\1\u046d\1\uffff\6\56\1\u0476\1\u0477\6\56\1\uffff\1\u047e\1\56"+
        "\2\uffff\1\u0480\3\56\1\uffff\2\56\1\u0486\1\56\1\uffff\1\56\1\uffff"+
        "\1\56\1\u048a\1\u048b\1\u048c\3\56\1\u0490\7\uffff\1\56\1\uffff"+
        "\1\56\1\u0494\1\u0495\1\56\1\u0497\1\uffff\1\56\1\u0499\2\uffff"+
        "\2\56\1\u049c\7\56\1\uffff\3\56\1\u04a7\1\u04a8\1\u04a9\1\u04ab"+
        "\1\56\2\uffff\6\56\1\uffff\1\u04b3\1\uffff\1\u04b4\2\56\1\u04b7"+
        "\1\56\1\uffff\2\56\1\u04be\3\uffff\3\56\2\uffff\1\56\1\u04c6\2\uffff"+
        "\1\u04c7\1\uffff\1\u04c8\1\uffff\2\56\1\uffff\12\56\3\uffff\1\56"+
        "\1\uffff\2\56\1\u04d8\1\56\1\u04da\2\56\2\uffff\2\56\1\uffff\6\56"+
        "\1\uffff\1\56\1\u04e6\1\56\2\uffff\2\56\3\uffff\7\56\1\u04f1\7\56"+
        "\1\uffff\1\56\1\uffff\12\56\1\u0504\1\uffff\7\56\1\u050c\1\u050d"+
        "\1\56\1\uffff\7\56\1\u0516\1\56\1\u0518\1\u0519\2\56\1\u051c\3\56"+
        "\1\u0520\1\uffff\1\u0521\3\56\1\u0525\1\u0526\1\56\2\uffff\1\56"+
        "\1\u0529\6\56\1\uffff\1\56\2\uffff\1\56\1\u0532\1\uffff\3\56\2\uffff"+
        "\3\56\2\uffff\1\56\1\u053a\1\uffff\3\56\1\u053e\1\56\1\u0540\2\56"+
        "\1\uffff\1\u0543\1\56\1\u0545\1\u0546\2\56\1\u0549\1\uffff\3\56"+
        "\1\uffff\1\56\1\uffff\2\56\1\uffff\1\u0551\2\uffff\1\56\1\u0553"+
        "\1\uffff\1\u0555\2\56\1\u0558\1\u0559\1\u055a\1\56\1\uffff\1\u055c"+
        "\1\uffff\1\56\1\uffff\2\56\3\uffff\1\56\1\uffff\3\56\1\u0564\3\56"+
        "\1\uffff\11\56\1\u0571\2\56\1\uffff\2\56\1\u0576\1\56\1\uffff\1"+
        "\u0578\1\uffff";
    static final String DFA13_eofS =
        "\u0579\uffff";
    static final String DFA13_minS =
        "\1\0\2\145\2\141\1\156\1\111\1\117\1\125\1\164\1\141\1\155\2\141"+
        "\1\157\1\141\1\145\1\141\1\144\3\141\2\uffff\1\141\2\uffff\1\142"+
        "\4\uffff\1\55\1\156\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\162\1"+
        "\151\1\156\1\uffff\1\162\1\145\1\141\1\114\1\142\1\145\1\170\1\160"+
        "\1\144\1\157\1\154\1\141\1\144\1\101\1\124\1\114\1\162\1\154\1\164"+
        "\1\154\1\143\1\60\2\141\1\123\1\147\1\156\1\154\1\60\1\157\1\155"+
        "\1\162\1\143\1\60\1\164\2\141\1\156\1\155\1\156\1\160\1\60\1\154"+
        "\1\162\1\142\1\141\1\144\1\141\1\154\1\156\1\151\1\160\1\141\1\151"+
        "\1\141\1\160\1\157\2\60\1\143\1\145\1\141\1\162\1\146\1\171\1\156"+
        "\1\147\1\154\1\144\2\uffff\1\156\1\151\1\162\1\154\1\141\2\uffff"+
        "\1\160\1\164\1\157\1\164\1\151\5\uffff\1\163\6\uffff\1\151\1\147"+
        "\1\164\1\163\1\167\1\145\1\156\1\60\1\147\1\151\1\145\1\147\1\60"+
        "\1\155\1\164\1\145\1\163\1\145\1\141\1\154\1\155\1\162\1\114\1\111"+
        "\1\114\1\151\1\154\1\144\2\164\1\157\1\153\1\60\1\uffff\1\154\1"+
        "\157\1\147\1\143\1\156\1\147\1\163\1\151\1\164\1\145\1\143\1\156"+
        "\1\uffff\1\167\1\151\1\155\1\145\1\151\1\141\1\uffff\1\141\1\154"+
        "\1\151\1\145\1\167\1\155\1\145\1\103\1\157\1\60\1\143\1\147\1\uffff"+
        "\1\164\1\144\1\60\1\147\1\160\1\164\1\162\1\143\1\154\2\164\1\143"+
        "\2\151\1\164\1\151\1\142\1\145\1\154\1\156\2\uffff\1\153\1\163\1"+
        "\144\1\152\1\146\1\164\1\163\1\164\1\157\1\164\1\145\1\150\1\147"+
        "\1\141\1\157\2\151\1\145\1\155\1\144\1\154\1\144\1\166\1\154\1\151"+
        "\1\157\1\166\1\157\1\147\1\60\1\145\1\172\1\150\1\60\2\151\2\60"+
        "\1\163\1\uffff\1\154\1\147\1\146\1\145\1\143\1\145\1\162\1\uffff"+
        "\1\145\1\103\1\146\1\145\1\123\1\164\1\46\1\145\1\157\1\117\1\124"+
        "\1\123\1\156\2\60\2\157\1\167\2\147\1\162\1\uffff\1\151\1\162\1"+
        "\145\1\162\1\145\1\154\1\60\1\146\1\145\1\143\1\151\1\60\1\156\1"+
        "\60\1\156\1\141\1\164\1\156\1\155\1\165\1\155\1\157\1\164\1\156"+
        "\2\141\1\60\1\162\1\157\1\163\1\uffff\1\150\2\151\1\163\1\151\1"+
        "\uffff\1\150\1\46\1\150\1\141\1\153\1\155\1\141\1\162\2\145\1\137"+
        "\1\153\1\164\1\154\1\137\1\164\1\151\1\154\1\156\1\151\1\145\1\141"+
        "\1\167\1\151\2\145\1\146\1\151\1\60\1\165\2\141\3\164\1\165\1\157"+
        "\1\156\1\162\1\157\1\154\1\145\1\166\2\151\1\166\1\154\1\145\1\114"+
        "\1\156\1\uffff\1\154\1\157\1\164\1\uffff\1\143\1\157\2\uffff\1\151"+
        "\1\145\1\150\3\164\1\154\1\141\1\60\1\151\1\146\1\151\1\157\1\141"+
        "\1\60\1\143\1\60\1\150\2\uffff\1\154\1\151\1\107\1\114\1\103\1\147"+
        "\1\141\2\uffff\1\155\1\156\1\60\1\162\1\145\1\162\1\143\1\164\1"+
        "\60\1\157\1\144\1\145\1\uffff\1\60\1\156\1\164\1\156\1\uffff\1\145"+
        "\1\uffff\1\153\1\162\1\143\1\147\1\141\1\154\1\157\1\147\2\163\1"+
        "\142\1\154\1\uffff\1\151\1\154\1\160\1\60\1\156\2\60\1\145\1\164"+
        "\2\uffff\1\60\1\143\1\142\1\156\1\160\1\60\1\156\1\162\1\150\2\141"+
        "\1\60\1\164\1\157\1\145\1\142\1\171\1\126\2\145\1\144\1\163\1\60"+
        "\1\147\1\157\1\156\1\143\1\162\1\157\1\163\1\uffff\1\164\1\143\1"+
        "\164\1\151\2\162\1\60\1\157\1\151\1\162\1\142\1\147\1\141\1\144"+
        "\1\141\1\162\1\151\1\164\1\143\1\151\1\165\1\60\1\157\1\145\1\151"+
        "\1\146\1\102\1\145\1\156\1\60\1\141\1\156\1\164\1\142\1\164\1\117"+
        "\1\60\1\151\1\141\1\157\1\167\1\uffff\1\145\1\60\1\146\1\171\1\172"+
        "\1\154\1\143\1\uffff\1\162\1\uffff\1\145\1\157\1\141\1\144\1\60"+
        "\1\105\1\122\1\60\1\156\2\60\1\uffff\1\157\1\162\1\141\2\60\1\151"+
        "\1\uffff\1\154\1\60\1\114\1\uffff\1\143\1\145\1\147\1\162\1\60\1"+
        "\171\1\150\1\60\1\154\1\164\1\144\1\124\1\60\1\151\1\154\1\60\1"+
        "\143\1\165\1\141\1\uffff\1\102\2\uffff\1\167\1\60\1\uffff\1\164"+
        "\1\157\1\144\1\60\1\163\1\uffff\1\164\1\60\1\145\1\157\1\142\1\154"+
        "\1\uffff\1\145\2\170\1\154\1\60\1\141\1\163\1\144\1\163\1\164\1"+
        "\165\1\uffff\1\145\1\162\1\147\1\164\1\145\1\162\1\164\1\60\1\164"+
        "\3\145\1\154\1\uffff\1\156\1\166\1\143\1\162\1\165\1\142\1\164\1"+
        "\145\2\171\1\145\1\171\1\141\2\164\1\uffff\1\155\1\170\1\156\1\151"+
        "\1\145\2\157\1\141\1\143\1\164\1\uffff\1\154\1\60\1\151\1\165\1"+
        "\117\1\146\1\uffff\1\166\1\171\1\167\1\141\1\167\1\uffff\1\60\1"+
        "\154\1\145\1\157\1\145\1\157\2\162\1\171\1\40\1\uffff\1\102\1\105"+
        "\1\uffff\1\60\2\uffff\1\165\1\60\1\171\2\uffff\1\145\1\154\1\uffff"+
        "\1\151\1\145\1\144\1\127\1\60\1\uffff\2\60\1\162\1\uffff\1\60\1"+
        "\126\1\145\1\151\1\uffff\1\157\1\145\1\uffff\1\60\1\155\1\143\1"+
        "\157\1\151\1\157\1\145\1\60\1\uffff\1\145\1\170\1\164\1\151\1\uffff"+
        "\1\145\1\60\1\150\1\145\1\156\1\157\1\uffff\2\162\1\154\1\151\1"+
        "\170\1\137\1\164\1\145\1\uffff\1\154\3\60\1\166\1\155\1\60\1\144"+
        "\2\60\1\156\1\155\1\145\1\162\1\uffff\1\151\1\155\1\167\1\146\1"+
        "\141\3\145\1\157\1\164\1\141\1\157\1\154\1\157\1\60\1\167\1\60\1"+
        "\164\1\171\1\145\1\160\1\164\1\153\1\164\1\146\1\164\1\160\1\162"+
        "\1\164\1\141\1\60\1\uffff\1\157\1\164\1\146\1\60\1\151\1\157\1\60"+
        "\1\142\1\60\1\uffff\1\145\1\60\1\162\1\60\1\154\1\164\1\151\1\157"+
        "\1\62\1\101\1\105\1\uffff\1\156\1\uffff\1\60\1\167\1\103\1\156\1"+
        "\163\1\60\1\151\2\uffff\1\157\1\uffff\1\162\1\uffff\1\141\1\154"+
        "\1\164\1\156\1\60\1\uffff\1\156\1\145\1\164\1\147\1\160\1\146\1"+
        "\uffff\1\162\1\60\1\145\1\144\1\60\1\uffff\1\145\1\157\1\162\1\120"+
        "\1\162\1\164\1\151\1\145\1\172\1\164\1\142\2\60\1\165\3\uffff\1"+
        "\151\1\142\1\uffff\1\60\2\uffff\1\143\1\60\1\156\1\157\1\166\2\60"+
        "\1\145\1\171\1\160\1\154\1\163\1\165\1\164\2\162\1\60\1\165\1\uffff"+
        "\1\60\1\uffff\1\151\1\60\2\154\3\60\2\164\1\60\2\145\1\154\1\160"+
        "\1\uffff\1\156\1\164\1\60\1\uffff\1\164\1\165\1\uffff\1\154\1\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\1\154\1\151\1\172\1\165\2\56\1\uffff"+
        "\1\122\1\116\1\144\1\uffff\1\60\1\157\1\145\1\60\1\uffff\2\144\1"+
        "\141\1\154\1\60\1\154\1\60\1\uffff\1\163\1\60\1\164\1\150\1\60\1"+
        "\164\1\163\1\162\1\uffff\1\170\1\164\1\uffff\2\162\1\164\1\141\2"+
        "\151\1\172\1\60\1\145\1\60\1\141\2\162\2\uffff\3\145\1\uffff\1\145"+
        "\1\uffff\1\164\1\160\1\151\2\uffff\1\162\1\157\1\162\1\141\1\60"+
        "\1\160\1\157\2\60\1\uffff\1\164\1\uffff\1\157\1\uffff\1\141\1\145"+
        "\3\uffff\1\60\1\157\1\uffff\1\156\1\144\1\60\1\141\1\60\1\157\1"+
        "\uffff\1\171\1\164\1\145\2\uffff\1\102\1\143\1\157\1\164\1\62\4"+
        "\60\1\uffff\1\156\1\60\1\uffff\1\164\1\145\1\171\1\165\1\uffff\1"+
        "\145\1\uffff\1\60\1\uffff\1\157\1\164\1\uffff\2\60\1\145\1\164\1"+
        "\150\1\164\2\151\1\162\1\172\1\143\1\157\1\uffff\1\60\1\uffff\1"+
        "\143\1\157\1\145\1\163\1\167\1\162\2\60\1\145\1\164\1\145\1\165"+
        "\1\145\1\171\1\uffff\1\60\1\156\2\uffff\1\60\1\156\1\171\1\164\1"+
        "\uffff\1\155\1\164\1\60\1\160\1\uffff\1\143\1\uffff\1\156\3\60\2"+
        "\141\1\156\1\60\1\uffff\1\56\5\uffff\1\164\1\uffff\1\150\2\60\1"+
        "\145\1\60\1\uffff\1\155\1\60\2\uffff\1\146\1\166\1\60\1\151\1\172"+
        "\1\143\1\145\1\157\1\141\1\156\1\uffff\1\153\1\160\1\146\4\60\1"+
        "\141\2\uffff\1\162\1\171\1\156\1\164\1\146\1\157\1\uffff\1\60\1"+
        "\uffff\1\60\1\157\1\145\1\60\1\102\1\uffff\1\141\1\151\1\60\3\uffff"+
        "\1\162\1\154\1\164\1\uffff\1\61\1\141\1\60\2\uffff\1\60\1\uffff"+
        "\1\60\1\uffff\1\145\1\151\1\uffff\1\143\1\157\1\141\2\156\1\154"+
        "\1\164\1\147\1\144\1\145\3\uffff\1\162\1\uffff\2\164\1\60\1\143"+
        "\1\60\1\145\1\165\2\uffff\1\165\1\164\1\uffff\1\145\1\157\1\151"+
        "\1\157\1\143\1\156\1\uffff\1\163\1\60\1\141\2\uffff\1\151\1\156"+
        "\3\uffff\1\162\1\145\1\141\1\156\1\154\2\164\1\60\1\141\1\162\1"+
        "\157\1\162\2\145\1\151\1\uffff\1\145\1\uffff\1\162\2\164\1\145\1"+
        "\146\1\160\1\147\1\164\1\151\1\147\1\60\1\uffff\1\154\1\156\1\151"+
        "\1\145\1\167\1\154\1\164\2\60\1\141\1\uffff\1\154\1\157\1\167\2"+
        "\145\1\147\1\145\1\60\1\145\2\60\1\170\1\164\1\60\1\150\1\164\1"+
        "\156\1\60\1\uffff\1\60\1\145\1\146\1\156\2\60\1\141\2\uffff\1\154"+
        "\1\60\1\165\3\156\1\145\1\163\1\uffff\1\156\2\uffff\1\164\1\60\1"+
        "\uffff\1\164\1\157\1\147\2\uffff\1\162\1\157\1\143\2\uffff\1\154"+
        "\1\60\1\uffff\1\156\1\137\1\143\1\60\1\162\1\60\1\143\1\166\1\uffff"+
        "\1\60\1\155\2\60\1\162\1\145\1\60\1\uffff\2\144\1\145\1\uffff\1"+
        "\171\1\uffff\1\145\1\151\1\uffff\1\60\2\uffff\1\155\1\60\1\uffff"+
        "\1\60\1\141\1\151\3\60\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff"+
        "\1\162\1\147\3\uffff\1\167\1\uffff\1\157\1\153\1\150\1\60\1\162"+
        "\1\137\1\164\1\uffff\1\155\1\146\1\137\1\141\1\162\1\146\1\154\1"+
        "\141\1\162\1\60\1\155\1\141\1\uffff\1\145\1\155\1\60\1\145\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\151\1\171\1\162\1\156\1\111\1\117\1\125\1\164"+
        "\1\165\1\164\1\165\1\162\2\165\1\162\1\157\2\170\2\151\2\uffff\1"+
        "\165\2\uffff\1\165\4\uffff\1\55\1\156\1\146\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\162\1\151\1\156\1\uffff\1\162\1\145\1\165\1\160"+
        "\1\162\1\145\1\170\1\160\1\154\1\157\1\154\1\141\1\144\1\101\1\124"+
        "\1\114\1\162\2\164\1\154\1\143\1\172\1\141\1\160\1\123\2\156\1\162"+
        "\1\172\1\162\1\155\1\162\1\146\1\172\1\164\1\155\1\141\1\162\1\155"+
        "\1\156\1\164\1\172\1\154\1\162\1\151\1\141\1\144\1\145\2\156\1\151"+
        "\1\160\1\141\1\151\2\164\1\157\2\172\1\163\1\157\1\141\1\162\1\146"+
        "\1\171\1\163\1\156\1\163\1\164\2\uffff\1\156\1\151\1\162\1\154\1"+
        "\151\2\uffff\1\160\1\164\1\163\1\164\1\154\5\uffff\1\163\6\uffff"+
        "\1\151\1\147\2\164\1\167\1\145\1\156\1\172\1\147\1\151\1\145\1\147"+
        "\1\172\1\155\1\164\1\145\1\163\1\145\1\141\1\154\1\155\1\162\1\114"+
        "\1\111\1\114\1\151\1\154\1\144\2\164\1\157\1\153\1\172\1\uffff\1"+
        "\154\1\157\1\147\1\143\1\156\1\147\1\163\1\151\1\164\1\145\2\156"+
        "\1\uffff\1\167\1\151\1\155\2\151\1\141\1\uffff\1\141\1\154\1\151"+
        "\1\145\1\167\1\155\2\145\1\157\1\172\1\143\1\147\1\uffff\1\164\1"+
        "\144\1\172\1\147\1\160\1\164\1\162\1\143\1\165\2\164\1\160\2\151"+
        "\1\164\1\162\1\142\1\145\1\154\1\156\2\uffff\1\153\1\163\1\144\1"+
        "\152\1\146\1\164\1\163\1\164\1\157\1\164\1\145\1\150\1\147\1\141"+
        "\1\157\2\151\1\145\1\155\1\144\1\154\1\144\1\166\1\154\1\151\1\157"+
        "\1\166\1\157\1\147\1\172\1\145\1\172\1\150\1\172\2\151\2\172\1\163"+
        "\1\uffff\1\154\1\147\1\146\1\145\1\143\1\145\1\162\1\uffff\1\145"+
        "\1\166\1\146\1\145\1\123\1\164\1\172\1\145\1\157\1\117\1\124\1\123"+
        "\1\156\2\172\2\157\1\167\2\147\1\162\1\uffff\1\151\1\162\1\145\1"+
        "\162\1\145\1\154\1\172\1\146\1\145\1\143\1\151\1\172\1\156\1\172"+
        "\1\156\1\141\1\164\1\156\1\155\1\165\1\155\1\157\1\164\1\156\2\141"+
        "\1\172\1\162\1\157\1\163\1\uffff\1\150\2\151\1\163\1\151\1\uffff"+
        "\1\150\1\172\1\150\1\141\1\153\1\155\1\141\1\162\2\145\1\137\1\153"+
        "\1\164\1\154\2\164\1\171\1\154\1\156\1\151\1\145\1\141\1\167\1\151"+
        "\2\145\1\146\1\151\1\172\1\165\1\166\1\141\3\164\1\165\1\157\1\156"+
        "\1\162\1\157\1\154\1\145\1\166\2\151\1\166\1\154\1\145\1\143\1\156"+
        "\1\uffff\1\154\1\157\1\164\1\uffff\1\143\1\157\2\uffff\1\151\1\145"+
        "\1\150\3\164\1\162\1\141\1\172\1\151\1\156\1\164\1\157\1\141\1\172"+
        "\1\143\1\172\1\166\2\uffff\1\154\1\151\1\107\1\114\1\103\1\147\1"+
        "\141\2\uffff\1\155\1\156\1\172\1\162\1\145\1\162\1\143\1\164\1\172"+
        "\1\157\1\144\1\145\1\uffff\1\172\1\156\1\164\1\156\1\uffff\1\145"+
        "\1\uffff\1\153\1\162\1\143\1\147\1\141\1\154\1\157\1\147\2\163\1"+
        "\142\1\154\1\uffff\1\151\1\154\1\160\1\172\1\156\2\172\1\145\1\164"+
        "\2\uffff\1\172\1\143\1\145\1\156\1\160\1\172\1\156\1\162\1\166\2"+
        "\141\1\172\1\164\1\157\1\145\1\142\1\171\1\126\2\145\1\144\1\163"+
        "\1\172\1\147\1\157\1\156\1\143\1\162\1\157\1\163\1\uffff\1\164\1"+
        "\143\1\164\1\151\2\162\1\172\1\157\1\151\1\162\2\147\1\141\1\144"+
        "\1\141\1\162\1\151\1\164\1\143\1\151\1\165\1\172\1\157\1\145\1\151"+
        "\1\146\1\124\1\145\1\156\1\172\1\141\1\156\1\164\1\142\1\164\1\117"+
        "\1\172\1\151\1\141\1\157\1\167\1\uffff\1\145\1\172\1\146\1\171\1"+
        "\172\1\154\1\143\1\uffff\1\162\1\uffff\1\145\1\157\1\141\1\144\1"+
        "\172\1\105\1\122\1\172\1\156\2\172\1\uffff\1\157\1\162\1\141\2\172"+
        "\1\151\1\uffff\1\154\1\172\1\114\1\uffff\1\143\1\145\1\147\1\162"+
        "\1\172\1\171\1\150\1\172\1\154\1\164\1\144\1\124\1\172\1\151\1\154"+
        "\1\172\1\143\1\165\1\141\1\uffff\1\124\2\uffff\1\167\1\172\1\uffff"+
        "\1\164\1\157\1\144\1\172\1\163\1\uffff\1\164\1\172\1\145\1\157\1"+
        "\142\1\154\1\uffff\1\145\2\170\1\154\1\172\1\141\1\163\1\144\1\163"+
        "\1\164\1\165\1\uffff\1\145\1\162\1\147\1\164\1\145\1\162\1\164\1"+
        "\172\1\164\3\145\1\154\1\uffff\1\156\1\166\1\143\1\162\1\165\1\142"+
        "\1\164\1\145\2\171\1\145\1\171\1\141\2\164\1\uffff\1\155\1\170\1"+
        "\156\1\151\1\145\2\157\1\141\1\143\1\164\1\uffff\1\154\1\172\1\151"+
        "\1\165\1\117\1\146\1\uffff\1\166\1\171\1\167\1\141\1\167\1\uffff"+
        "\1\172\1\154\1\145\1\157\1\145\1\157\2\162\1\171\1\40\1\uffff\1"+
        "\102\1\105\1\uffff\1\172\2\uffff\1\165\1\172\1\171\2\uffff\1\145"+
        "\1\154\1\uffff\1\151\1\145\1\144\1\127\1\172\1\uffff\2\172\1\162"+
        "\1\uffff\1\172\1\126\1\145\1\151\1\uffff\1\157\1\145\1\uffff\1\172"+
        "\1\155\1\143\1\157\1\151\1\157\1\145\1\172\1\uffff\1\145\1\170\1"+
        "\164\1\151\1\uffff\1\145\1\172\1\166\1\145\1\156\1\157\1\uffff\2"+
        "\162\1\154\1\151\1\170\1\137\1\164\1\145\1\uffff\1\154\3\172\1\166"+
        "\1\155\1\172\1\144\2\172\1\156\1\155\1\145\1\162\1\uffff\1\151\1"+
        "\155\1\167\1\146\1\141\3\145\1\157\1\164\1\141\1\157\1\154\1\157"+
        "\1\172\1\167\1\172\1\164\1\171\1\145\1\160\1\164\1\153\1\164\1\146"+
        "\1\164\1\160\1\162\1\164\1\141\1\172\1\uffff\1\157\1\164\1\146\1"+
        "\172\1\151\1\157\1\172\1\142\1\172\1\uffff\1\145\1\172\1\162\1\172"+
        "\1\154\1\164\1\151\1\157\1\64\1\101\1\105\1\uffff\1\156\1\uffff"+
        "\1\172\1\167\1\103\1\156\1\163\1\172\1\151\2\uffff\1\157\1\uffff"+
        "\1\162\1\uffff\1\141\1\154\1\164\1\156\1\172\1\uffff\1\156\1\145"+
        "\1\164\1\147\1\160\1\146\1\uffff\1\162\1\172\1\145\1\144\1\172\1"+
        "\uffff\1\145\1\157\1\162\1\120\1\162\1\164\1\151\1\145\1\172\1\164"+
        "\1\144\2\172\1\165\3\uffff\1\151\1\142\1\uffff\1\172\2\uffff\1\143"+
        "\1\172\1\156\1\157\1\166\2\172\1\145\1\171\1\160\1\154\1\163\1\165"+
        "\1\164\2\162\1\172\1\165\1\uffff\1\172\1\uffff\1\151\1\172\2\154"+
        "\3\172\2\164\1\172\2\145\1\154\1\160\1\uffff\1\156\1\164\1\172\1"+
        "\uffff\1\164\1\165\1\uffff\1\154\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\154\1\151\1\172\1\165\2\56\1\uffff\1\122\1\116\1\144\1\uffff"+
        "\1\172\1\157\1\145\1\172\1\uffff\2\144\1\141\1\154\1\172\1\154\1"+
        "\172\1\uffff\1\163\1\172\1\164\1\150\1\172\1\164\1\163\1\162\1\uffff"+
        "\1\170\1\164\1\uffff\2\162\1\164\1\141\2\151\2\172\1\145\1\172\1"+
        "\141\2\162\2\uffff\3\145\1\uffff\1\145\1\uffff\1\164\1\160\1\151"+
        "\2\uffff\1\162\1\157\1\162\1\141\1\172\1\160\1\157\2\172\1\uffff"+
        "\1\164\1\uffff\1\157\1\uffff\1\141\1\145\3\uffff\1\172\1\157\1\uffff"+
        "\1\156\1\144\1\172\1\141\1\172\1\157\1\uffff\1\171\1\164\1\145\2"+
        "\uffff\1\102\1\143\1\157\1\164\1\63\1\61\3\172\1\uffff\1\156\1\172"+
        "\1\uffff\1\164\1\145\1\171\1\165\1\uffff\1\145\1\uffff\1\172\1\uffff"+
        "\1\157\1\164\1\uffff\2\172\1\145\1\164\1\150\1\164\2\151\1\162\1"+
        "\172\1\143\1\157\1\uffff\1\172\1\uffff\1\143\1\157\1\145\1\163\1"+
        "\167\1\162\2\172\1\145\1\164\1\145\1\165\1\145\1\171\1\uffff\1\172"+
        "\1\156\2\uffff\1\172\1\156\1\171\1\164\1\uffff\1\155\1\164\1\172"+
        "\1\160\1\uffff\1\143\1\uffff\1\156\3\172\2\141\1\156\1\172\1\uffff"+
        "\1\56\5\uffff\1\164\1\uffff\1\150\2\172\1\145\1\172\1\uffff\1\155"+
        "\1\172\2\uffff\1\146\1\166\1\172\1\151\1\172\1\143\1\145\1\157\1"+
        "\141\1\156\1\uffff\1\153\1\160\1\146\4\172\1\141\2\uffff\1\162\1"+
        "\171\1\156\1\164\1\146\1\157\1\uffff\1\172\1\uffff\1\172\1\157\1"+
        "\145\1\172\1\124\1\uffff\1\141\1\151\1\172\3\uffff\1\162\1\154\1"+
        "\164\1\uffff\1\63\1\141\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\145\1\151\1\uffff\1\143\1\157\1\141\2\156\1\154\1\164\1\147\1"+
        "\144\1\145\3\uffff\1\162\1\uffff\2\164\1\172\1\143\1\172\1\145\1"+
        "\165\2\uffff\1\165\1\164\1\uffff\1\145\1\157\1\151\1\157\1\143\1"+
        "\156\1\uffff\1\163\1\172\1\141\2\uffff\1\151\1\156\3\uffff\1\162"+
        "\1\145\1\141\1\156\1\154\2\164\1\172\1\141\1\162\1\157\1\162\2\145"+
        "\1\151\1\uffff\1\145\1\uffff\1\162\2\164\1\145\1\146\1\160\1\147"+
        "\1\164\1\151\1\147\1\172\1\uffff\1\154\1\156\1\151\1\145\1\167\1"+
        "\154\1\164\2\172\1\141\1\uffff\1\154\1\157\1\167\2\145\1\147\1\145"+
        "\1\172\1\145\2\172\1\170\1\164\1\172\1\150\1\164\1\156\1\172\1\uffff"+
        "\1\172\1\145\1\146\1\156\2\172\1\141\2\uffff\1\154\1\172\1\165\3"+
        "\156\1\145\1\163\1\uffff\1\156\2\uffff\1\164\1\172\1\uffff\1\164"+
        "\1\157\1\147\2\uffff\1\162\1\157\1\143\2\uffff\1\154\1\172\1\uffff"+
        "\1\156\1\137\1\143\1\172\1\162\1\172\1\143\1\166\1\uffff\1\172\1"+
        "\155\2\172\1\162\1\145\1\172\1\uffff\1\144\1\154\1\145\1\uffff\1"+
        "\171\1\uffff\1\145\1\151\1\uffff\1\172\2\uffff\1\155\1\172\1\uffff"+
        "\1\172\1\141\1\151\3\172\1\145\1\uffff\1\172\1\uffff\1\156\1\uffff"+
        "\1\162\1\147\3\uffff\1\167\1\uffff\1\157\1\153\1\150\1\172\1\162"+
        "\1\137\1\164\1\uffff\1\155\1\146\1\137\1\141\1\162\1\146\1\154\1"+
        "\141\1\162\1\172\1\155\1\141\1\uffff\1\145\1\155\1\172\1\145\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\26\uffff\1\103\1\104\1\uffff\1\106\1\107\1\uffff\1\133\1\u009f"+
        "\1\u00b9\1\u00be\4\uffff\1\u00cd\1\u00ce\3\uffff\1\u00d2\1\u00d3"+
        "\3\uffff\1\u00cd\105\uffff\1\103\1\104\5\uffff\1\106\1\107\5\uffff"+
        "\1\133\1\u009f\1\u00b9\1\u00be\1\u00c6\1\uffff\1\u00cc\1\u00ce\1"+
        "\u00cf\1\u00d0\1\u00d1\1\u00d2\41\uffff\1\100\14\uffff\1\74\6\uffff"+
        "\1\73\14\uffff\1\77\24\uffff\1\75\1\76\47\uffff\1\46\7\uffff\1\122"+
        "\25\uffff\1\21\36\uffff\1\42\5\uffff\1\37\62\uffff\1\u00ca\3\uffff"+
        "\1\u00a6\2\uffff\1\147\1\3\22\uffff\1\63\1\55\7\uffff\1\u00bf\1"+
        "\31\14\uffff\1\26\4\uffff\1\u0089\1\uffff\1\123\14\uffff\1\33\11"+
        "\uffff\1\64\1\62\36\uffff\1\50\51\uffff\1\120\7\uffff\1\4\1\uffff"+
        "\1\17\13\uffff\1\u0091\6\uffff\1\124\3\uffff\1\27\23\uffff\1\65"+
        "\1\uffff\1\173\1\35\2\uffff\1\137\5\uffff\1\u00c0\6\uffff\1\40\13"+
        "\uffff\1\41\15\uffff\1\51\17\uffff\1\u0090\12\uffff\1\136\6\uffff"+
        "\1\110\5\uffff\1\166\12\uffff\1\13\2\uffff\1\16\1\uffff\1\47\1\152"+
        "\3\uffff\1\32\1\102\2\uffff\1\23\5\uffff\1\u00ba\3\uffff\1\u00bd"+
        "\4\uffff\1\u00a8\2\uffff\1\25\10\uffff\1\u009c\4\uffff\1\u008a\6"+
        "\uffff\1\52\10\uffff\1\131\16\uffff\1\117\37\uffff\1\113\11\uffff"+
        "\1\167\13\uffff\1\20\1\uffff\1\22\7\uffff\1\161\1\u0083\1\uffff"+
        "\1\u00b8\1\uffff\1\24\5\uffff\1\u00a5\6\uffff\1\155\5\uffff\1\127"+
        "\16\uffff\1\u00b7\1\u0084\1\132\2\uffff\1\101\1\uffff\1\u00af\1"+
        "\111\22\uffff\1\153\1\uffff\1\u00b0\16\uffff\1\2\3\uffff\1\u008f"+
        "\2\uffff\1\146\1\uffff\1\150\1\uffff\1\u00b1\1\uffff\1\u00a0\6\uffff"+
        "\1\12\3\uffff\1\u00c2\4\uffff\1\u00c8\7\uffff\1\u00c4\10\uffff\1"+
        "\162\2\uffff\1\u00bb\15\uffff\1\151\1\u00a7\3\uffff\1\u00a4\1\uffff"+
        "\1\112\3\uffff\1\126\1\157\11\uffff\1\134\1\uffff\1\160\1\uffff"+
        "\1\116\2\uffff\1\u00aa\1\u00ae\1\u00cb\2\uffff\1\u0094\6\uffff\1"+
        "\u008e\3\uffff\1\u009e\1\u00a1\11\uffff\1\156\2\uffff\1\34\4\uffff"+
        "\1\115\1\uffff\1\u00c1\1\uffff\1\30\2\uffff\1\u009b\14\uffff\1\u00ad"+
        "\1\uffff\1\66\16\uffff\1\u00bc\2\uffff\1\164\1\105\4\uffff\1\u0092"+
        "\4\uffff\1\1\1\uffff\1\u00c5\10\uffff\1\5\1\uffff\1\10\1\11\1\14"+
        "\1\15\1\u00b2\1\uffff\1\u00a2\5\uffff\1\u00b4\2\uffff\1\u009d\1"+
        "\36\12\uffff\1\u00a9\10\uffff\1\174\1\u0085\6\uffff\1\163\1\uffff"+
        "\1\144\5\uffff\1\u00c9\3\uffff\1\121\1\145\1\u00c7\3\uffff\1\142"+
        "\3\uffff\1\u00b5\1\u00c3\1\uffff\1\u0086\1\uffff\1\u009a\2\uffff"+
        "\1\44\12\uffff\1\u0088\1\154\1\u00a3\1\uffff\1\130\7\uffff\1\170"+
        "\1\114\2\uffff\1\u0093\6\uffff\1\165\3\uffff\1\6\1\7\2\uffff\1\43"+
        "\1\u0087\1\u0099\17\uffff\1\125\1\uffff\1\141\13\uffff\1\56\12\uffff"+
        "\1\60\22\uffff\1\u00ac\7\uffff\1\u008b\1\u008c\10\uffff\1\u0080"+
        "\1\uffff\1\143\1\140\2\uffff\1\u0096\3\uffff\1\u00b6\1\57\3\uffff"+
        "\1\171\1\53\2\uffff\1\61\10\uffff\1\u0095\7\uffff\1\u008d\3\uffff"+
        "\1\175\1\uffff\1\135\2\uffff\1\u0097\1\uffff\1\u00b3\1\u00ab\2\uffff"+
        "\1\54\7\uffff\1\u0098\1\uffff\1\u0081\1\uffff\1\67\2\uffff\1\177"+
        "\1\176\1\u0082\1\uffff\1\45\7\uffff\1\172\14\uffff\1\70\4\uffff"+
        "\1\71\1\uffff\1\72";
    static final String DFA13_specialS =
        "\1\2\45\uffff\1\1\1\0\u0551\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\1\42\3\52\1\47\2"+
            "\52\1\27\1\52\1\36\1\52\1\26\1\50\12\45\1\34\1\52\1\40\1\37"+
            "\3\52\1\5\2\44\1\6\1\44\1\10\7\44\1\7\4\44\1\11\7\44\3\52\1"+
            "\43\1\44\1\52\1\33\1\12\1\21\1\15\1\22\1\4\1\30\1\1\1\13\2\44"+
            "\1\24\1\17\1\16\1\44\1\23\1\44\1\25\1\14\1\3\1\41\1\2\1\20\3"+
            "\44\1\31\1\35\1\32\uff82\52",
            "\1\54\3\uffff\1\55\5\uffff\1\53",
            "\1\57\3\uffff\1\60",
            "\1\63\3\uffff\1\65\2\uffff\1\64\6\uffff\1\62\2\uffff\1\61"+
            "\6\uffff\1\66",
            "\1\67\7\uffff\1\71\2\uffff\1\70\5\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\103\3\uffff\1\102\11\uffff\1\100\5\uffff\1\101",
            "\1\106\1\104\4\uffff\1\107\1\105",
            "\1\111\3\uffff\1\112\2\uffff\1\114\1\110\6\uffff\1\113\3\uffff"+
            "\1\116\1\115",
            "\1\121\3\uffff\1\117\3\uffff\1\122\6\uffff\1\120\1\uffff\1"+
            "\123",
            "\1\124\5\uffff\1\125",
            "\1\127\13\uffff\1\130\1\uffff\1\126\5\uffff\1\131",
            "\1\133\3\uffff\1\135\5\uffff\1\132\2\uffff\1\134",
            "\1\142\3\uffff\1\140\2\uffff\1\136\3\uffff\1\141\2\uffff\1"+
            "\137",
            "\1\144\10\uffff\1\143\1\145\11\uffff\1\146",
            "\1\152\3\uffff\1\155\2\uffff\1\147\3\uffff\1\154\5\uffff\1"+
            "\153\1\uffff\1\150\3\uffff\1\151",
            "\1\157\3\uffff\1\156\3\uffff\1\160",
            "\1\163\3\uffff\1\162\3\uffff\1\161",
            "",
            "",
            "\1\171\3\uffff\1\166\3\uffff\1\170\10\uffff\1\172\2\uffff"+
            "\1\167",
            "",
            "",
            "\1\177\1\176\10\uffff\1\u0081\3\uffff\1\175\4\uffff\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\12\u0088\7\uffff\6\u0088\32\uffff\6\u0088",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\u008a",
            "\0\u008a",
            "\1\u008b\4\uffff\1\u008c",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\23\uffff\1\u0093",
            "\1\u0098\5\uffff\1\u0097\24\uffff\1\u0096\10\uffff\1\u0095",
            "\1\u009a\17\uffff\1\u0099",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009f\7\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a9\2\uffff\1\u00a8\4\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ae\6"+
            "\56",
            "\1\u00b0",
            "\1\u00b2\16\uffff\1\u00b1",
            "\1\u00b3",
            "\1\u00b4\6\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b9\1\uffff\1\u00b8\3\uffff\1\u00b7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ba\7\56\1\u00bb"+
            "\21\56",
            "\1\u00bd\2\uffff\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\2\uffff\1\u00c2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c4",
            "\1\u00c5\5\uffff\1\u00c6\5\uffff\1\u00c7",
            "\1\u00c8",
            "\1\u00ca\3\uffff\1\u00c9",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\1\uffff\1\u00cf\1\uffff\1\u00ce",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\6\uffff\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\3\uffff\1\u00d8",
            "\1\u00d9\1\uffff\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\22\uffff\1\u00e0",
            "\1\u00e3\3\uffff\1\u00e2",
            "\1\u00e4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e7\1\u00e9\16\uffff\1\u00e8",
            "\1\u00eb\11\uffff\1\u00ea",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f1\4\uffff\1\u00f0",
            "\1\u00f2\6\uffff\1\u00f3",
            "\1\u00f4\6\uffff\1\u00f5",
            "\1\u00f6\17\uffff\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fd\7\uffff\1\u00fc",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0101\3\uffff\1\u0100",
            "\1\u0102",
            "\1\u0103\2\uffff\1\u0104",
            "",
            "",
            "",
            "",
            "",
            "\1\u0105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u010a\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0113\2\56\1\u0115"+
            "\7\56\1\u0114\16\56",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u012b\3\56\1\u012a"+
            "\25\56",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137\12\uffff\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d\3\uffff\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0149\41\uffff\1\u0148",
            "\1\u014a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\u014f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u0150\4"+
            "\56",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0158\2\uffff\1\u0159\5\uffff\1\u0157",
            "\1\u015a",
            "\1\u015b",
            "\1\u015d\14\uffff\1\u015c",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161\10\uffff\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0189",
            "\1\u018a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u018d",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0199\13\uffff\1\u0197\3\uffff\1\u0198\42\uffff\1\u0196",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019f\11\uffff\12\56\7\uffff\32\56\4\uffff\1\u019e\1\uffff"+
            "\32\56",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a7\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01bc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "",
            "\1\u01d3",
            "\1\u01d4\11\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff"+
            "\32\56",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2\1\uffff\1\u01e5\1\u01e3\21\uffff\1\u01e4",
            "\1\u01e6",
            "\1\u01e8\17\uffff\1\u01e7",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01f5",
            "\1\u01f6\7\uffff\1\u01f7\6\uffff\1\u01f9\5\uffff\1\u01f8",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020d\7\uffff\1\u020c\12\uffff\1\u020e\3\uffff\1\u020b",
            "\1\u020f",
            "",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\1\u0214",
            "",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b\5\uffff\1\u021c",
            "\1\u021d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u021f",
            "\1\u0221\7\uffff\1\u0220",
            "\1\u0223\12\uffff\1\u0222",
            "\1\u0224",
            "\1\u0225",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0227",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u022a\15\uffff\1\u0229",
            "",
            "",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "",
            "",
            "\1\u0232",
            "\1\u0233",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u023a\4"+
            "\56",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0254",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0257",
            "\1\u0258",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u025a",
            "\1\u025b\2\uffff\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0260",
            "\1\u0261",
            "\1\u0263\15\uffff\1\u0262",
            "\1\u0264",
            "\1\u0265",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\12\56\7\uffff\15\56\1\u0271\14\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0285\4\uffff\1\u0284",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0296\11\uffff\1\u0295\3\uffff\1\u0298\3\uffff\1\u0297",
            "\1\u0299",
            "\1\u029a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "\1\u02a7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02b4",
            "\1\u02b5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02b7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02bf",
            "",
            "\1\u02c0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02c2",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02c8",
            "\1\u02c9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u02ca\31\56",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02d1",
            "\1\u02d2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "",
            "\1\u02d7\11\uffff\1\u02da\5\uffff\1\u02d8\1\uffff\1\u02d9",
            "",
            "",
            "\1\u02db",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\12\56\7\uffff\26\56\1\u02e0\3\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02e2",
            "",
            "\1\u02e3",
            "\12\56\7\uffff\7\56\1\u02e7\1\u02e6\14\56\1\u02e5\4\56\4\uffff"+
            "\1\u02e4\1\uffff\32\56",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\12\56\7\uffff\17\56\1\u02ff\12\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "",
            "\1\u031f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "",
            "\1\u0334",
            "\1\u0335",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0337",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0339",
            "",
            "",
            "\1\u033a",
            "\1\u033b",
            "",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\14\56\1\u0342\15\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0344",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "",
            "\1\u0349",
            "\1\u034a",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "",
            "\1\u0357",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u035a\15\uffff\1\u0359",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "",
            "\1\u0366",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u036a",
            "\1\u036b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u036d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0383",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\12\56\7\uffff\22\56\1\u0392\7\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0398",
            "\1\u0399",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u039b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u039d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u039f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5\1\u03a6\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "",
            "\1\u03aa",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03b1",
            "",
            "",
            "\1\u03b2",
            "",
            "\1\u03b3",
            "",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "",
            "\1\u03bf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u03c0\12"+
            "\56",
            "\1\u03c2",
            "\1\u03c3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf\1\uffff\1\u03d0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u03d1\12"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03d4",
            "",
            "",
            "",
            "\1\u03d5",
            "\1\u03d6",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u03d8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03da",
            "\1\u03db",
            "\1\u03dc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03df",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\1\u03e4",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03e9",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u03eb",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03ed",
            "\1\u03ee",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03f2",
            "\1\u03f3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "",
            "\1\u03f9",
            "\1\u03fa",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u03fc",
            "\1\u03fd",
            "",
            "\1\u03fe",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u040b",
            "\1\u040c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u040e",
            "\1\u040f",
            "\1\u0410",
            "\1\u0411",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0413",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0415",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0417",
            "\1\u0418",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u041a",
            "\1\u041b",
            "\1\u041c",
            "",
            "\1\u041d",
            "\1\u041e",
            "",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "\1\u0425",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0427",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0429",
            "\1\u042a",
            "\1\u042b",
            "",
            "",
            "\1\u042c",
            "\1\u042d",
            "\1\u042e",
            "",
            "\1\u042f",
            "",
            "\1\u0430",
            "\1\u0431",
            "\1\u0432",
            "",
            "",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0438",
            "\1\u0439",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u043c",
            "",
            "\1\u043d",
            "",
            "\1\u043e",
            "\1\u043f",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0441",
            "",
            "\1\u0442",
            "\1\u0443",
            "\12\56\7\uffff\22\56\1\u0444\7\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0446",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0448",
            "",
            "\1\u0449",
            "\1\u044a",
            "\1\u044b",
            "",
            "",
            "\1\u044c",
            "\1\u044d",
            "\1\u044e",
            "\1\u044f",
            "\1\u0450\1\u0451",
            "\1\u0452\1\u0453",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0457",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0459",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "",
            "\1\u045d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u045f",
            "\1\u0460",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0463",
            "\1\u0464",
            "\1\u0465",
            "\1\u0466",
            "\1\u0467",
            "\1\u0468",
            "\1\u0469",
            "\1\u046a",
            "\1\u046b",
            "\1\u046c",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u046e",
            "\1\u046f",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "\1\u0473",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0475\17"+
            "\56\1\u0474\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0478",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "\1\u047c",
            "\1\u047d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u047f",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0481",
            "\1\u0482",
            "\1\u0483",
            "",
            "\1\u0484",
            "\1\u0485",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0487",
            "",
            "\1\u0488",
            "",
            "\1\u0489",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u048d",
            "\1\u048e",
            "\1\u048f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0491",
            "",
            "",
            "",
            "",
            "",
            "\1\u0492",
            "",
            "\1\u0493",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0496",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0498",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u049a",
            "\1\u049b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u049d",
            "\1\u049e",
            "\1\u049f",
            "\1\u04a0",
            "\1\u04a1",
            "\1\u04a2",
            "\1\u04a3",
            "",
            "\1\u04a4",
            "\1\u04a5",
            "\1\u04a6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u04aa\27"+
            "\56",
            "\1\u04ac",
            "",
            "",
            "\1\u04ad",
            "\1\u04ae",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04b5",
            "\1\u04b6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04bb\11\uffff\1\u04b8\5\uffff\1\u04ba\1\uffff\1\u04b9",
            "",
            "\1\u04bc",
            "\1\u04bd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\u04bf",
            "\1\u04c0",
            "\1\u04c1",
            "",
            "\1\u04c2\1\uffff\1\u04c3",
            "\1\u04c4",
            "\12\56\7\uffff\24\56\1\u04c5\5\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u04c9",
            "\1\u04ca",
            "",
            "\1\u04cb",
            "\1\u04cc",
            "\1\u04cd",
            "\1\u04ce",
            "\1\u04cf",
            "\1\u04d0",
            "\1\u04d1",
            "\1\u04d2",
            "\1\u04d3",
            "\1\u04d4",
            "",
            "",
            "",
            "\1\u04d5",
            "",
            "\1\u04d6",
            "\1\u04d7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04d9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04db",
            "\1\u04dc",
            "",
            "",
            "\1\u04dd",
            "\1\u04de",
            "",
            "\1\u04df",
            "\1\u04e0",
            "\1\u04e1",
            "\1\u04e2",
            "\1\u04e3",
            "\1\u04e4",
            "",
            "\1\u04e5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04e7",
            "",
            "",
            "\1\u04e8",
            "\1\u04e9",
            "",
            "",
            "",
            "\1\u04ea",
            "\1\u04eb",
            "\1\u04ec",
            "\1\u04ed",
            "\1\u04ee",
            "\1\u04ef",
            "\1\u04f0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u04f2",
            "\1\u04f3",
            "\1\u04f4",
            "\1\u04f5",
            "\1\u04f6",
            "\1\u04f7",
            "\1\u04f8",
            "",
            "\1\u04f9",
            "",
            "\1\u04fa",
            "\1\u04fb",
            "\1\u04fc",
            "\1\u04fd",
            "\1\u04fe",
            "\1\u04ff",
            "\1\u0500",
            "\1\u0501",
            "\1\u0502",
            "\1\u0503",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0505",
            "\1\u0506",
            "\1\u0507",
            "\1\u0508",
            "\1\u0509",
            "\1\u050a",
            "\1\u050b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u050e",
            "",
            "\1\u050f",
            "\1\u0510",
            "\1\u0511",
            "\1\u0512",
            "\1\u0513",
            "\1\u0514",
            "\1\u0515",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0517",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u051a",
            "\1\u051b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u051d",
            "\1\u051e",
            "\1\u051f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0522",
            "\1\u0523",
            "\1\u0524",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0527",
            "",
            "",
            "\1\u0528",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u052a",
            "\1\u052b",
            "\1\u052c",
            "\1\u052d",
            "\1\u052e",
            "\1\u052f",
            "",
            "\1\u0530",
            "",
            "",
            "\1\u0531",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0533",
            "\1\u0534",
            "\1\u0535",
            "",
            "",
            "\1\u0536",
            "\1\u0537",
            "\1\u0538",
            "",
            "",
            "\1\u0539",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u053b",
            "\1\u053c",
            "\1\u053d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u053f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0541",
            "\1\u0542",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0544",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0547",
            "\1\u0548",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u054a",
            "\1\u054b\7\uffff\1\u054c",
            "\1\u054d",
            "",
            "\1\u054e",
            "",
            "\1\u054f",
            "\1\u0550",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0552",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\u0554\1\uffff\32\56",
            "\1\u0556",
            "\1\u0557",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u055b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u055d",
            "",
            "\1\u055e",
            "\1\u055f",
            "",
            "",
            "",
            "\1\u0560",
            "",
            "\1\u0561",
            "\1\u0562",
            "\1\u0563",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0565",
            "\1\u0566",
            "\1\u0567",
            "",
            "\1\u0568",
            "\1\u0569",
            "\1\u056a",
            "\1\u056b",
            "\1\u056c",
            "\1\u056d",
            "\1\u056e",
            "\1\u056f",
            "\1\u0570",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0572",
            "\1\u0573",
            "",
            "\1\u0574",
            "\1\u0575",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0577",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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

    static class DFA13 extends DFA {

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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 138;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 138;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='h') ) {s = 1;}

                        else if ( (LA13_0=='v') ) {s = 2;}

                        else if ( (LA13_0=='t') ) {s = 3;}

                        else if ( (LA13_0=='f') ) {s = 4;}

                        else if ( (LA13_0=='A') ) {s = 5;}

                        else if ( (LA13_0=='D') ) {s = 6;}

                        else if ( (LA13_0=='N') ) {s = 7;}

                        else if ( (LA13_0=='F') ) {s = 8;}

                        else if ( (LA13_0=='S') ) {s = 9;}

                        else if ( (LA13_0=='b') ) {s = 10;}

                        else if ( (LA13_0=='i') ) {s = 11;}

                        else if ( (LA13_0=='s') ) {s = 12;}

                        else if ( (LA13_0=='d') ) {s = 13;}

                        else if ( (LA13_0=='n') ) {s = 14;}

                        else if ( (LA13_0=='m') ) {s = 15;}

                        else if ( (LA13_0=='w') ) {s = 16;}

                        else if ( (LA13_0=='c') ) {s = 17;}

                        else if ( (LA13_0=='e') ) {s = 18;}

                        else if ( (LA13_0=='p') ) {s = 19;}

                        else if ( (LA13_0=='l') ) {s = 20;}

                        else if ( (LA13_0=='r') ) {s = 21;}

                        else if ( (LA13_0=='.') ) {s = 22;}

                        else if ( (LA13_0=='*') ) {s = 23;}

                        else if ( (LA13_0=='g') ) {s = 24;}

                        else if ( (LA13_0=='{') ) {s = 25;}

                        else if ( (LA13_0=='}') ) {s = 26;}

                        else if ( (LA13_0=='a') ) {s = 27;}

                        else if ( (LA13_0==':') ) {s = 28;}

                        else if ( (LA13_0=='|') ) {s = 29;}

                        else if ( (LA13_0==',') ) {s = 30;}

                        else if ( (LA13_0=='=') ) {s = 31;}

                        else if ( (LA13_0=='<') ) {s = 32;}

                        else if ( (LA13_0=='u') ) {s = 33;}

                        else if ( (LA13_0=='#') ) {s = 34;}

                        else if ( (LA13_0=='^') ) {s = 35;}

                        else if ( ((LA13_0>='B' && LA13_0<='C')||LA13_0=='E'||(LA13_0>='G' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 36;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( (LA13_0=='/') ) {s = 40;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 41;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||LA13_0=='+'||LA13_0=='-'||LA13_0==';'||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 42;}

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