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
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__262=262;
    public static final int RULE_HEX_COLOR=7;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int T__264=264;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
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
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__279=279;
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
    public static final int T__269=269;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__271=271;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int T__270=270;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int T__218=218;
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
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
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
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__245=245;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int T__230=230;
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
    public static final int T__57=57;
    public static final int T__199=199;
    public static final int T__58=58;
    public static final int T__198=198;
    public static final int T__51=51;
    public static final int T__197=197;
    public static final int T__52=52;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__53=53;
    public static final int T__194=194;
    public static final int T__54=54;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__184=184;
    public static final int T__42=42;
    public static final int T__183=183;
    public static final int T__43=43;
    public static final int T__186=186;
    public static final int T__40=40;
    public static final int T__185=185;
    public static final int T__41=41;
    public static final int T__188=188;
    public static final int T__46=46;
    public static final int T__187=187;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__189=189;
    public static final int T__45=45;
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:75:7: ( 'static' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:75:9: 'static'
            {
            match("static"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:76:7: ( 'kinetic' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:76:9: 'kinetic'
            {
            match("kinetic"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:77:7: ( 'dynamic' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:77:9: 'dynamic'
            {
            match("dynamic"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:78:7: ( 'BLACK' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:78:9: 'BLACK'
            {
            match("BLACK"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:79:7: ( 'WHITE' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:79:9: 'WHITE'
            {
            match("WHITE"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:80:7: ( 'RED' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:80:9: 'RED'
            {
            match("RED"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:81:7: ( 'GREEN' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:81:9: 'GREEN'
            {
            match("GREEN"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:82:7: ( 'BLUE' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:82:9: 'BLUE'
            {
            match("BLUE"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:83:7: ( 'YELLOW' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:83:9: 'YELLOW'
            {
            match("YELLOW"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:84:7: ( 'LEFT' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:84:9: 'LEFT'
            {
            match("LEFT"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:85:7: ( 'RIGHT' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:85:9: 'RIGHT'
            {
            match("RIGHT"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:86:7: ( 'CENTER' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:86:9: 'CENTER'
            {
            match("CENTER"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:87:7: ( 'BOLD' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:87:9: 'BOLD'
            {
            match("BOLD"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:88:7: ( 'ITALIC' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:88:9: 'ITALIC'
            {
            match("ITALIC"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:89:7: ( 'BOLD_ITALIC' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:89:9: 'BOLD_ITALIC'
            {
            match("BOLD_ITALIC"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:90:7: ( 'landscape' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:90:9: 'landscape'
            {
            match("landscape"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:91:7: ( 'portrait' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:91:9: 'portrait'
            {
            match("portrait"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:92:7: ( 'package' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:92:9: 'package'
            {
            match("package"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:93:7: ( 'import' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:93:9: 'import'
            {
            match("import"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:94:7: ( '.' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:94:9: '.'
            {
            match('.'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:95:7: ( '*' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:95:9: '*'
            {
            match('*'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:96:7: ( 'generator' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:96:9: 'generator'
            {
            match("generator"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:97:7: ( '{' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:97:9: '{'
            {
            match('{'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:98:7: ( '}' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:98:9: '}'
            {
            match('}'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:99:8: ( 'target' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:99:10: 'target'
            {
            match("target"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:100:8: ( 'project' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:100:10: 'project'
            {
            match("project"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:101:8: ( 'platform' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:101:10: 'platform'
            {
            match("platform"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:102:8: ( 'version' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:102:10: 'version'
            {
            match("version"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:103:8: ( 'application' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:103:10: 'application'
            {
            match("application"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:104:8: ( 'datamodel' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:104:10: 'datamodel'
            {
            match("datamodel"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:105:8: ( 'activity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:105:10: 'activity'
            {
            match("activity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:106:8: ( 'layout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:106:10: 'layout'
            {
            match("layout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:107:8: ( 'theme' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:107:10: 'theme'
            {
            match("theme"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:108:8: ( 'tabactivity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:108:10: 'tabactivity'
            {
            match("tabactivity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:109:8: ( 'tab' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:109:10: 'tab'
            {
            match("tab"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:110:8: ( 'show' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:110:10: 'show'
            {
            match("show"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:111:8: ( 'image' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:111:10: 'image'
            {
            match("image"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:112:8: ( 'listactivity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:112:10: 'listactivity'
            {
            match("listactivity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:113:8: ( 'listitem' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:113:10: 'listitem'
            {
            match("listitem"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:114:8: ( 'content' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:114:10: 'content'
            {
            match("content"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:115:8: ( 'preferences' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:115:10: 'preferences'
            {
            match("preferences"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:116:8: ( 'entity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:116:10: 'entity'
            {
            match("entity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:117:8: ( 'extends' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:117:10: 'extends'
            {
            match("extends"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:118:8: ( ':' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:118:10: ':'
            {
            match(':'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:119:8: ( 'guimodel' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:119:10: 'guimodel'
            {
            match("guimodel"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:120:8: ( 'layoutProperties' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:120:10: 'layoutProperties'
            {
            match("layoutProperties"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:121:8: ( 'height' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:121:10: 'height'
            {
            match("height"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:122:8: ( 'width' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:122:10: 'width'
            {
            match("width"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:123:8: ( 'absolutelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:123:10: 'absolutelayout'
            {
            match("absolutelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:124:8: ( 'linearlayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:124:10: 'linearlayout'
            {
            match("linearlayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:125:8: ( 'framelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:125:10: 'framelayout'
            {
            match("framelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:126:8: ( 'relativelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:126:10: 'relativelayout'
            {
            match("relativelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:127:8: ( 'girdlayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:127:10: 'girdlayout'
            {
            match("girdlayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:128:8: ( 'tablelayout' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:128:10: 'tablelayout'
            {
            match("tablelayout"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:129:8: ( 'tablerow' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:129:10: 'tablerow'
            {
            match("tablerow"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:130:8: ( 'view' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:130:10: 'view'
            {
            match("view"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:131:8: ( 'textview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:131:10: 'textview'
            {
            match("textview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:132:8: ( 'edittext' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:132:10: 'edittext'
            {
            match("edittext"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:133:8: ( 'button' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:133:10: 'button'
            {
            match("button"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:134:8: ( 'gallery' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:134:10: 'gallery'
            {
            match("gallery"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:135:8: ( 'explistview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:135:10: 'explistview'
            {
            match("explistview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:136:8: ( 'webview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:136:10: 'webview'
            {
            match("webview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:137:8: ( 'imageview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:137:10: 'imageview'
            {
            match("imageview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:138:8: ( 'listview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:138:10: 'listview'
            {
            match("listview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:139:8: ( 'gridview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:139:10: 'gridview'
            {
            match("gridview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:140:8: ( 'spinner' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:140:10: 'spinner'
            {
            match("spinner"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:141:8: ( 'checkbox' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:141:10: 'checkbox'
            {
            match("checkbox"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:142:8: ( 'radiogroup' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:142:10: 'radiogroup'
            {
            match("radiogroup"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:143:8: ( 'ratingbar' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:143:10: 'ratingbar'
            {
            match("ratingbar"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:144:8: ( 'togglebutton' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:144:10: 'togglebutton'
            {
            match("togglebutton"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:145:8: ( 'textOn' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:145:10: 'textOn'
            {
            match("textOn"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:146:8: ( 'textOff' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:146:10: 'textOff'
            {
            match("textOff"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:147:8: ( 'radiobutton' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:147:10: 'radiobutton'
            {
            match("radiobutton"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:148:8: ( 'checkedtextview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:148:10: 'checkedtextview'
            {
            match("checkedtextview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:149:8: ( 'autocompletetextview' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:149:10: 'autocompletetextview'
            {
            match("autocompletetextview"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:150:8: ( 'multi' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:150:10: 'multi'
            {
            match("multi"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:151:8: ( 'preference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:151:10: 'preference'
            {
            match("preference"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:152:8: ( 'preferencescreen' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:152:10: 'preferencescreen'
            {
            match("preferencescreen"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:153:8: ( 'preferencecategery' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:153:10: 'preferencecategery'
            {
            match("preferencecategery"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:154:8: ( 'edittextpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:154:10: 'edittextpreference'
            {
            match("edittextpreference"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:155:8: ( 'listpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:155:10: 'listpreference'
            {
            match("listpreference"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:156:8: ( 'checkboxpreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:156:10: 'checkboxpreference'
            {
            match("checkboxpreference"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:157:8: ( 'ringtonepreference' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:157:10: 'ringtonepreference'
            {
            match("ringtonepreference"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:158:8: ( 'summary' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:158:10: 'summary'
            {
            match("summary"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:159:8: ( 'enabled' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:159:10: 'enabled'
            {
            match("enabled"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:160:8: ( 'persistent' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:160:10: 'persistent'
            {
            match("persistent"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:161:8: ( 'dialogTitle' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:161:10: 'dialogTitle'
            {
            match("dialogTitle"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:162:8: ( 'defaultValue' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:162:10: 'defaultValue'
            {
            match("defaultValue"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:163:8: ( 'entryValues' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:163:10: 'entryValues'
            {
            match("entryValues"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:164:8: ( 'span' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:164:10: 'span'
            {
            match("span"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:165:8: ( 'column' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:165:10: 'column'
            {
            match("column"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:166:8: ( 'centerVertical' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:166:10: 'centerVertical'
            {
            match("centerVertical"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:167:8: ( 'centerInParent' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:167:10: 'centerInParent'
            {
            match("centerInParent"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:168:8: ( 'centerHorizontal' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:168:10: 'centerHorizontal'
            {
            match("centerHorizontal"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:169:8: ( 'toRightOf' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:169:10: 'toRightOf'
            {
            match("toRightOf"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:170:8: ( 'toLeftOf' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:170:10: 'toLeftOf'
            {
            match("toLeftOf"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:171:8: ( 'above' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:171:10: 'above'
            {
            match("above"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:172:8: ( 'below' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:172:10: 'below'
            {
            match("below"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:173:8: ( 'alignLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:173:10: 'alignLeft'
            {
            match("alignLeft"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:174:8: ( 'alignBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:174:10: 'alignBottom'
            {
            match("alignBottom"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:175:8: ( 'alignTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:175:10: 'alignTop'
            {
            match("alignTop"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:176:8: ( 'alignParentLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:176:10: 'alignParentLeft'
            {
            match("alignParentLeft"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:177:8: ( 'alignParentTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:177:10: 'alignParentTop'
            {
            match("alignParentTop"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:178:8: ( 'alignParentRight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:178:10: 'alignParentRight'
            {
            match("alignParentRight"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:179:8: ( 'alignParentBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:179:10: 'alignParentBottom'
            {
            match("alignParentBottom"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:180:8: ( 'marginBottom' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:180:10: 'marginBottom'
            {
            match("marginBottom"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:181:8: ( 'marginRight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:181:10: 'marginRight'
            {
            match("marginRight"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:182:8: ( 'marginTop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:182:10: 'marginTop'
            {
            match("marginTop"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:183:8: ( 'weight' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:183:10: 'weight'
            {
            match("weight"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:184:8: ( 'marginLeft' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:184:10: 'marginLeft'
            {
            match("marginLeft"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:185:8: ( 'textStyle' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:185:10: 'textStyle'
            {
            match("textStyle"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:186:8: ( '|' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:186:10: '|'
            {
            match('|'); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:187:8: ( 'typeface' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:187:10: 'typeface'
            {
            match("typeface"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:188:8: ( 'textColor' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:188:10: 'textColor'
            {
            match("textColor"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:189:8: ( 'singleLine' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:189:10: 'singleLine'
            {
            match("singleLine"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:190:8: ( 'phoneNumber' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:190:10: 'phoneNumber'
            {
            match("phoneNumber"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:191:8: ( 'password' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:191:10: 'password'
            {
            match("password"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:192:8: ( 'numeric' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:192:10: 'numeric'
            {
            match("numeric"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:193:8: ( 'hint' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:193:10: 'hint'
            {
            match("hint"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:194:8: ( 'editable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:194:10: 'editable'
            {
            match("editable"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:195:8: ( 'digits' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:195:10: 'digits'
            {
            match("digits"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:196:8: ( 'capitalize' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:196:10: 'capitalize'
            {
            match("capitalize"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:197:8: ( 'autoText' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:197:10: 'autoText'
            {
            match("autoText"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:198:8: ( 'isScrollContainer' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:198:10: 'isScrollContainer'
            {
            match("isScrollContainer"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:199:8: ( 'fadeScrollBars' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:199:10: 'fadeScrollBars'
            {
            match("fadeScrollBars"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:200:8: ( 'clickable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:200:10: 'clickable'
            {
            match("clickable"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:201:8: ( 'autoLink' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:201:10: 'autoLink'
            {
            match("autoLink"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:202:8: ( 'padding' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:202:10: 'padding'
            {
            match("padding"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:203:8: ( 'gravity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:203:10: 'gravity'
            {
            match("gravity"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:204:8: ( 'textSize' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:204:10: 'textSize'
            {
            match("textSize"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:205:8: ( 'background' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:205:10: 'background'
            {
            match("background"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:206:8: ( 'horizontalSpacing' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:206:10: 'horizontalSpacing'
            {
            match("horizontalSpacing"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:207:8: ( 'numColumns' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:207:10: 'numColumns'
            {
            match("numColumns"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:208:8: ( 'stretchMode' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:208:10: 'stretchMode'
            {
            match("stretchMode"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:209:8: ( 'verticalSpacing' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:209:10: 'verticalSpacing'
            {
            match("verticalSpacing"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:210:8: ( 'entries' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:210:10: 'entries'
            {
            match("entries"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:211:8: ( 'stretch' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:211:10: 'stretch'
            {
            match("stretch"); 


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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:212:8: ( ',' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:212:10: ','
            {
            match(','); 

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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:213:8: ( 'shrink' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:213:10: 'shrink'
            {
            match("shrink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:214:8: ( 'collapse' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:214:10: 'collapse'
            {
            match("collapse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:215:8: ( 'resources' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:215:10: 'resources'
            {
            match("resources"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:216:8: ( 'string' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:216:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:217:8: ( '=' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:217:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:218:8: ( 'bool' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:218:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:219:8: ( 'color' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:219:10: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:220:8: ( 'dimension' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:220:10: 'dimension'
            {
            match("dimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:221:8: ( 'intarray' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:221:10: 'intarray'
            {
            match("intarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:222:8: ( 'stringarray' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:222:10: 'stringarray'
            {
            match("stringarray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "T__224"
    public final void mT__224() throws RecognitionException {
        try {
            int _type = T__224;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:223:8: ( 'drawable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:223:10: 'drawable'
            {
            match("drawable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__224"

    // $ANTLR start "T__225"
    public final void mT__225() throws RecognitionException {
        try {
            int _type = T__225;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:224:8: ( 'transition' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:224:10: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__225"

    // $ANTLR start "T__226"
    public final void mT__226() throws RecognitionException {
        try {
            int _type = T__226;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:225:8: ( '<->' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:225:10: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__226"

    // $ANTLR start "T__227"
    public final void mT__227() throws RecognitionException {
        try {
            int _type = T__227;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:226:8: ( 'tabdrawable' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:226:10: 'tabdrawable'
            {
            match("tabdrawable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__227"

    // $ANTLR start "T__228"
    public final void mT__228() throws RecognitionException {
        try {
            int _type = T__228;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:227:8: ( 'selected' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:227:10: 'selected'
            {
            match("selected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__228"

    // $ANTLR start "T__229"
    public final void mT__229() throws RecognitionException {
        try {
            int _type = T__229;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:228:8: ( 'unselected' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:228:10: 'unselected'
            {
            match("unselected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__229"

    // $ANTLR start "T__230"
    public final void mT__230() throws RecognitionException {
        try {
            int _type = T__230;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:229:8: ( 'gameactivity' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:229:10: 'gameactivity'
            {
            match("gameactivity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__230"

    // $ANTLR start "T__231"
    public final void mT__231() throws RecognitionException {
        try {
            int _type = T__231;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:230:8: ( 'camera' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:230:10: 'camera'
            {
            match("camera"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__231"

    // $ANTLR start "T__232"
    public final void mT__232() throws RecognitionException {
        try {
            int _type = T__232;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:231:8: ( 'orientation' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:231:10: 'orientation'
            {
            match("orientation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__232"

    // $ANTLR start "T__233"
    public final void mT__233() throws RecognitionException {
        try {
            int _type = T__233;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:232:8: ( 'scene' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:232:10: 'scene'
            {
            match("scene"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__233"

    // $ANTLR start "T__234"
    public final void mT__234() throws RecognitionException {
        try {
            int _type = T__234;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:233:8: ( 'gamegui' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:233:10: 'gamegui'
            {
            match("gamegui"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__234"

    // $ANTLR start "T__235"
    public final void mT__235() throws RecognitionException {
        try {
            int _type = T__235;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:234:8: ( 'gamelogic' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:234:10: 'gamelogic'
            {
            match("gamelogic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__235"

    // $ANTLR start "T__236"
    public final void mT__236() throws RecognitionException {
        try {
            int _type = T__236;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:235:8: ( 'box2doptions' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:235:10: 'box2doptions'
            {
            match("box2doptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__236"

    // $ANTLR start "T__237"
    public final void mT__237() throws RecognitionException {
        try {
            int _type = T__237;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:236:8: ( 'revolutejoint' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:236:10: 'revolutejoint'
            {
            match("revolutejoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__237"

    // $ANTLR start "T__238"
    public final void mT__238() throws RecognitionException {
        try {
            int _type = T__238;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:237:8: ( 'between' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:237:10: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__238"

    // $ANTLR start "T__239"
    public final void mT__239() throws RecognitionException {
        try {
            int _type = T__239;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:238:8: ( 'distancejoint' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:238:10: 'distancejoint'
            {
            match("distancejoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__239"

    // $ANTLR start "T__240"
    public final void mT__240() throws RecognitionException {
        try {
            int _type = T__240;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:239:8: ( 'linebody' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:239:10: 'linebody'
            {
            match("linebody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__240"

    // $ANTLR start "T__241"
    public final void mT__241() throws RecognitionException {
        try {
            int _type = T__241;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:240:8: ( 'fixture' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:240:10: 'fixture'
            {
            match("fixture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__241"

    // $ANTLR start "T__242"
    public final void mT__242() throws RecognitionException {
        try {
            int _type = T__242;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:241:8: ( 'circlebody' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:241:10: 'circlebody'
            {
            match("circlebody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__242"

    // $ANTLR start "T__243"
    public final void mT__243() throws RecognitionException {
        try {
            int _type = T__243;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:242:8: ( 'boxbody' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:242:10: 'boxbody'
            {
            match("boxbody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__243"

    // $ANTLR start "T__244"
    public final void mT__244() throws RecognitionException {
        try {
            int _type = T__244;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:243:8: ( 'density' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:243:10: 'density'
            {
            match("density"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__244"

    // $ANTLR start "T__245"
    public final void mT__245() throws RecognitionException {
        try {
            int _type = T__245;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:244:8: ( 'friction' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:244:10: 'friction'
            {
            match("friction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__245"

    // $ANTLR start "T__246"
    public final void mT__246() throws RecognitionException {
        try {
            int _type = T__246;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:245:8: ( 'restitution' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:245:10: 'restitution'
            {
            match("restitution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__246"

    // $ANTLR start "T__247"
    public final void mT__247() throws RecognitionException {
        try {
            int _type = T__247;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:246:8: ( 'bind' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:246:10: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__247"

    // $ANTLR start "T__248"
    public final void mT__248() throws RecognitionException {
        try {
            int _type = T__248;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:247:8: ( 'to' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:247:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__248"

    // $ANTLR start "T__249"
    public final void mT__249() throws RecognitionException {
        try {
            int _type = T__249;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:248:8: ( 'menu' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:248:10: 'menu'
            {
            match("menu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__249"

    // $ANTLR start "T__250"
    public final void mT__250() throws RecognitionException {
        try {
            int _type = T__250;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:249:8: ( 'menuitem' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:249:10: 'menuitem'
            {
            match("menuitem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__250"

    // $ANTLR start "T__251"
    public final void mT__251() throws RecognitionException {
        try {
            int _type = T__251;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:250:8: ( 'text' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:250:10: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__251"

    // $ANTLR start "T__252"
    public final void mT__252() throws RecognitionException {
        try {
            int _type = T__252;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:251:8: ( 'font' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:251:10: 'font'
            {
            match("font"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__252"

    // $ANTLR start "T__253"
    public final void mT__253() throws RecognitionException {
        try {
            int _type = T__253;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:252:8: ( 'texture' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:252:10: 'texture'
            {
            match("texture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__253"

    // $ANTLR start "T__254"
    public final void mT__254() throws RecognitionException {
        try {
            int _type = T__254;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:253:8: ( 'sequence' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:253:10: 'sequence'
            {
            match("sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__254"

    // $ANTLR start "T__255"
    public final void mT__255() throws RecognitionException {
        try {
            int _type = T__255;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:254:8: ( 'loop' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:254:10: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__255"

    // $ANTLR start "T__256"
    public final void mT__256() throws RecognitionException {
        try {
            int _type = T__256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:255:8: ( 'count' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:255:10: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__256"

    // $ANTLR start "T__257"
    public final void mT__257() throws RecognitionException {
        try {
            int _type = T__257;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:256:8: ( 'move' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:256:10: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__257"

    // $ANTLR start "T__258"
    public final void mT__258() throws RecognitionException {
        try {
            int _type = T__258;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:257:8: ( 'moveby' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:257:10: 'moveby'
            {
            match("moveby"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__258"

    // $ANTLR start "T__259"
    public final void mT__259() throws RecognitionException {
        try {
            int _type = T__259;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:258:8: ( 'scale' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:258:10: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__259"

    // $ANTLR start "T__260"
    public final void mT__260() throws RecognitionException {
        try {
            int _type = T__260;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:259:8: ( 'alphamodifier' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:259:10: 'alphamodifier'
            {
            match("alphamodifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__260"

    // $ANTLR start "T__261"
    public final void mT__261() throws RecognitionException {
        try {
            int _type = T__261;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:260:8: ( 'rotateby' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:260:10: 'rotateby'
            {
            match("rotateby"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__261"

    // $ANTLR start "T__262"
    public final void mT__262() throws RecognitionException {
        try {
            int _type = T__262;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:261:8: ( 'rotate' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:261:10: 'rotate'
            {
            match("rotate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__262"

    // $ANTLR start "T__263"
    public final void mT__263() throws RecognitionException {
        try {
            int _type = T__263;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:262:8: ( 'colormodifier' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:262:10: 'colormodifier'
            {
            match("colormodifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__263"

    // $ANTLR start "T__264"
    public final void mT__264() throws RecognitionException {
        try {
            int _type = T__264;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:263:8: ( '(' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:263:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__264"

    // $ANTLR start "T__265"
    public final void mT__265() throws RecognitionException {
        try {
            int _type = T__265;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:264:8: ( ')' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:264:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__265"

    // $ANTLR start "T__266"
    public final void mT__266() throws RecognitionException {
        try {
            int _type = T__266;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:265:8: ( 'from' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:265:10: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__266"

    // $ANTLR start "T__267"
    public final void mT__267() throws RecognitionException {
        try {
            int _type = T__267;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:266:8: ( 'by' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:266:10: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__267"

    // $ANTLR start "T__268"
    public final void mT__268() throws RecognitionException {
        try {
            int _type = T__268;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:267:8: ( 'line' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:267:10: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__268"

    // $ANTLR start "T__269"
    public final void mT__269() throws RecognitionException {
        try {
            int _type = T__269;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:268:8: ( 'lineWidth' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:268:10: 'lineWidth'
            {
            match("lineWidth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__269"

    // $ANTLR start "T__270"
    public final void mT__270() throws RecognitionException {
        try {
            int _type = T__270;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:269:8: ( 'rect' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:269:10: 'rect'
            {
            match("rect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__270"

    // $ANTLR start "T__271"
    public final void mT__271() throws RecognitionException {
        try {
            int _type = T__271;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:270:8: ( 'sprite' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:270:10: 'sprite'
            {
            match("sprite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__271"

    // $ANTLR start "T__272"
    public final void mT__272() throws RecognitionException {
        try {
            int _type = T__272;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:271:8: ( 'animsprite' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:271:10: 'animsprite'
            {
            match("animsprite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__272"

    // $ANTLR start "T__273"
    public final void mT__273() throws RecognitionException {
        try {
            int _type = T__273;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:272:8: ( 'pos' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:272:10: 'pos'
            {
            match("pos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__273"

    // $ANTLR start "T__274"
    public final void mT__274() throws RecognitionException {
        try {
            int _type = T__274;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:273:8: ( 'size' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:273:10: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__274"

    // $ANTLR start "T__275"
    public final void mT__275() throws RecognitionException {
        try {
            int _type = T__275;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:274:8: ( 'tiled' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:274:10: 'tiled'
            {
            match("tiled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__275"

    // $ANTLR start "T__276"
    public final void mT__276() throws RecognitionException {
        try {
            int _type = T__276;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:275:8: ( '-' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:275:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__276"

    // $ANTLR start "T__277"
    public final void mT__277() throws RecognitionException {
        try {
            int _type = T__277;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:276:8: ( 'all' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:276:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__277"

    // $ANTLR start "T__278"
    public final void mT__278() throws RecognitionException {
        try {
            int _type = T__278;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:277:8: ( 'auto_fit' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:277:10: 'auto_fit'
            {
            match("auto_fit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__278"

    // $ANTLR start "T__279"
    public final void mT__279() throws RecognitionException {
        try {
            int _type = T__279;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:278:8: ( 'antialias' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:278:10: 'antialias'
            {
            match("antialias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__279"

    // $ANTLR start "RULE_HEX_COLOR"
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47047:16: ( '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )? )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47047:18: '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47047:196: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47047:197: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47049:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47049:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47049:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47049:11: '^'
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47049:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47051:10: ( ( '0' .. '9' )+ )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47051:12: ( '0' .. '9' )+
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47051:12: ( '0' .. '9' )+
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
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47051:13: '0' .. '9'
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47053:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47055:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47055:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47055:24: ( options {greedy=false; } : . )*
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
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47055:52: .
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47057:41: '\\r'
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47059:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47061:16: ( . )
            // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:47061:18: .
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
        // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=276;
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
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1343: T__215
                {
                mT__215(); 

                }
                break;
            case 205 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1350: T__216
                {
                mT__216(); 

                }
                break;
            case 206 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1357: T__217
                {
                mT__217(); 

                }
                break;
            case 207 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1364: T__218
                {
                mT__218(); 

                }
                break;
            case 208 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1371: T__219
                {
                mT__219(); 

                }
                break;
            case 209 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1378: T__220
                {
                mT__220(); 

                }
                break;
            case 210 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1385: T__221
                {
                mT__221(); 

                }
                break;
            case 211 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1392: T__222
                {
                mT__222(); 

                }
                break;
            case 212 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1399: T__223
                {
                mT__223(); 

                }
                break;
            case 213 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1406: T__224
                {
                mT__224(); 

                }
                break;
            case 214 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1413: T__225
                {
                mT__225(); 

                }
                break;
            case 215 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1420: T__226
                {
                mT__226(); 

                }
                break;
            case 216 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1427: T__227
                {
                mT__227(); 

                }
                break;
            case 217 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1434: T__228
                {
                mT__228(); 

                }
                break;
            case 218 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1441: T__229
                {
                mT__229(); 

                }
                break;
            case 219 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1448: T__230
                {
                mT__230(); 

                }
                break;
            case 220 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1455: T__231
                {
                mT__231(); 

                }
                break;
            case 221 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1462: T__232
                {
                mT__232(); 

                }
                break;
            case 222 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1469: T__233
                {
                mT__233(); 

                }
                break;
            case 223 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1476: T__234
                {
                mT__234(); 

                }
                break;
            case 224 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1483: T__235
                {
                mT__235(); 

                }
                break;
            case 225 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1490: T__236
                {
                mT__236(); 

                }
                break;
            case 226 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1497: T__237
                {
                mT__237(); 

                }
                break;
            case 227 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1504: T__238
                {
                mT__238(); 

                }
                break;
            case 228 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1511: T__239
                {
                mT__239(); 

                }
                break;
            case 229 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1518: T__240
                {
                mT__240(); 

                }
                break;
            case 230 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1525: T__241
                {
                mT__241(); 

                }
                break;
            case 231 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1532: T__242
                {
                mT__242(); 

                }
                break;
            case 232 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1539: T__243
                {
                mT__243(); 

                }
                break;
            case 233 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1546: T__244
                {
                mT__244(); 

                }
                break;
            case 234 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1553: T__245
                {
                mT__245(); 

                }
                break;
            case 235 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1560: T__246
                {
                mT__246(); 

                }
                break;
            case 236 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1567: T__247
                {
                mT__247(); 

                }
                break;
            case 237 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1574: T__248
                {
                mT__248(); 

                }
                break;
            case 238 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1581: T__249
                {
                mT__249(); 

                }
                break;
            case 239 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1588: T__250
                {
                mT__250(); 

                }
                break;
            case 240 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1595: T__251
                {
                mT__251(); 

                }
                break;
            case 241 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1602: T__252
                {
                mT__252(); 

                }
                break;
            case 242 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1609: T__253
                {
                mT__253(); 

                }
                break;
            case 243 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1616: T__254
                {
                mT__254(); 

                }
                break;
            case 244 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1623: T__255
                {
                mT__255(); 

                }
                break;
            case 245 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1630: T__256
                {
                mT__256(); 

                }
                break;
            case 246 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1637: T__257
                {
                mT__257(); 

                }
                break;
            case 247 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1644: T__258
                {
                mT__258(); 

                }
                break;
            case 248 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1651: T__259
                {
                mT__259(); 

                }
                break;
            case 249 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1658: T__260
                {
                mT__260(); 

                }
                break;
            case 250 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1665: T__261
                {
                mT__261(); 

                }
                break;
            case 251 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1672: T__262
                {
                mT__262(); 

                }
                break;
            case 252 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1679: T__263
                {
                mT__263(); 

                }
                break;
            case 253 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1686: T__264
                {
                mT__264(); 

                }
                break;
            case 254 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1693: T__265
                {
                mT__265(); 

                }
                break;
            case 255 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1700: T__266
                {
                mT__266(); 

                }
                break;
            case 256 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1707: T__267
                {
                mT__267(); 

                }
                break;
            case 257 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1714: T__268
                {
                mT__268(); 

                }
                break;
            case 258 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1721: T__269
                {
                mT__269(); 

                }
                break;
            case 259 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1728: T__270
                {
                mT__270(); 

                }
                break;
            case 260 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1735: T__271
                {
                mT__271(); 

                }
                break;
            case 261 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1742: T__272
                {
                mT__272(); 

                }
                break;
            case 262 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1749: T__273
                {
                mT__273(); 

                }
                break;
            case 263 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1756: T__274
                {
                mT__274(); 

                }
                break;
            case 264 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1763: T__275
                {
                mT__275(); 

                }
                break;
            case 265 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1770: T__276
                {
                mT__276(); 

                }
                break;
            case 266 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1777: T__277
                {
                mT__277(); 

                }
                break;
            case 267 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1784: T__278
                {
                mT__278(); 

                }
                break;
            case 268 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1791: T__279
                {
                mT__279(); 

                }
                break;
            case 269 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1798: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 270 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1813: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 271 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1821: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 272 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1830: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 273 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1842: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 274 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1858: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 275 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1874: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 276 :
                // ../hu.bme.mit.androtext.lang.ui/src-gen/hu/bme/mit/androtext/lang/ui/contentassist/antlr/internal/InternalAndroTextDsl.g:1:1882: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\36\73\2\uffff\1\73\2\uffff\1\73\4\uffff\1\67\2\73\3\uffff"+
        "\2\67\2\uffff\3\67\2\uffff\3\73\1\uffff\3\73\1\u00c1\24\73\1\u00df"+
        "\1\u00e1\6\73\1\u00f1\5\73\1\u00fc\10\73\1\u010c\21\73\1\u0125\1"+
        "\u0126\30\73\2\uffff\5\73\2\uffff\6\73\5\uffff\2\73\11\uffff\7\73"+
        "\1\u0166\3\73\1\uffff\1\73\1\u016e\33\73\1\uffff\1\u018d\1\uffff"+
        "\17\73\1\uffff\12\73\1\uffff\14\73\1\u01b6\2\73\1\uffff\3\73\1\u01bd"+
        "\24\73\2\uffff\1\73\1\u01d7\33\73\1\u01f4\24\73\1\u0209\6\73\1\u0210"+
        "\2\73\1\u0213\1\u0214\1\73\1\uffff\7\73\1\uffff\1\73\1\u0223\5\73"+
        "\1\u022b\3\73\1\u022f\1\u0230\5\73\1\u0237\1\u0238\7\73\1\u0240"+
        "\2\73\1\uffff\6\73\1\u0249\1\u024a\5\73\1\u0250\5\73\1\u0256\17"+
        "\73\1\u0266\3\73\1\u026b\1\uffff\3\73\1\u0270\2\73\1\uffff\1\73"+
        "\1\u0275\27\73\1\uffff\7\73\1\u0298\3\73\1\u02a2\1\u02a3\6\73\1"+
        "\u02aa\5\73\1\u02b0\1\u02b2\1\73\1\uffff\3\73\1\u02b7\20\73\1\uffff"+
        "\6\73\1\uffff\2\73\2\uffff\10\73\1\u02de\5\73\1\uffff\1\73\1\u02e7"+
        "\1\u02e8\1\73\1\u02ea\1\73\2\uffff\3\73\2\uffff\6\73\2\uffff\4\73"+
        "\1\u02fa\2\73\1\uffff\4\73\1\u0302\3\73\2\uffff\1\u0306\4\73\1\uffff"+
        "\5\73\1\uffff\2\73\1\u0312\1\u0313\13\73\1\uffff\4\73\1\uffff\1"+
        "\u0323\1\73\1\u0325\1\73\1\uffff\1\u0327\2\73\2\uffff\1\u032a\4"+
        "\73\1\u0331\1\73\1\u0333\6\73\1\u033b\12\73\1\u0347\10\73\1\uffff"+
        "\11\73\2\uffff\1\u0359\5\73\1\uffff\4\73\1\u0364\1\uffff\1\73\1"+
        "\uffff\1\u0366\1\u0367\1\u0368\1\73\1\uffff\16\73\1\u0378\13\73"+
        "\1\u0387\6\73\1\u038e\4\73\1\uffff\1\73\1\u0394\6\73\2\uffff\1\73"+
        "\1\uffff\6\73\1\u03a2\2\73\1\u03a5\1\73\1\u03a7\2\73\1\u03aa\1\uffff"+
        "\4\73\1\u03af\1\u03b0\1\73\1\uffff\1\73\1\u03b3\1\73\1\uffff\5\73"+
        "\1\u03ba\1\u03bb\1\73\1\u03be\1\u03bf\1\73\2\uffff\6\73\1\u03c7"+
        "\3\73\1\u03cb\3\73\1\u03cf\1\uffff\1\73\1\uffff\1\73\1\uffff\1\73"+
        "\1\u03d6\1\uffff\3\73\1\u03db\2\73\1\uffff\1\73\1\uffff\1\u03e3"+
        "\4\73\1\u03e8\1\73\1\uffff\4\73\1\u03ee\6\73\1\uffff\11\73\1\u03ff"+
        "\7\73\1\uffff\10\73\1\u0410\1\73\1\uffff\1\73\3\uffff\1\u0413\1"+
        "\u0414\1\u0415\14\73\1\uffff\16\73\1\uffff\1\73\1\u0431\4\73\1\uffff"+
        "\5\73\1\uffff\1\u043b\3\73\1\u043f\4\73\1\u0444\3\73\1\uffff\2\73"+
        "\1\uffff\1\u044a\1\uffff\1\73\1\u044c\1\uffff\1\u044d\1\73\1\u044f"+
        "\1\73\2\uffff\2\73\1\uffff\5\73\1\u0458\2\uffff\1\u045a\1\73\2\uffff"+
        "\1\u045c\1\u045d\1\73\1\u045f\1\u0460\2\73\1\uffff\3\73\1\uffff"+
        "\1\u0466\2\73\1\uffff\5\73\1\u046e\1\uffff\4\73\1\uffff\2\73\1\u0475"+
        "\4\73\1\uffff\4\73\1\uffff\5\73\1\uffff\1\73\1\u0485\1\u0486\1\u0487"+
        "\3\73\1\u048b\1\73\1\u048d\1\u048e\5\73\1\uffff\20\73\1\uffff\1"+
        "\u04a4\1\73\3\uffff\3\73\1\u04a9\1\73\1\u04ab\2\73\1\u04ae\21\73"+
        "\1\u04c1\1\uffff\3\73\1\u04c5\2\73\1\u04c8\1\73\1\u04ca\1\uffff"+
        "\1\73\1\u04cc\1\73\1\uffff\1\u04ce\3\73\1\uffff\1\73\1\u04d3\1\uffff"+
        "\2\73\1\uffff\1\73\2\uffff\1\73\1\uffff\1\u04db\4\73\1\u04e0\1\u04e1"+
        "\1\73\1\uffff\1\73\1\uffff\1\73\2\uffff\1\73\2\uffff\4\73\1\u04ea"+
        "\1\uffff\6\73\1\u04f1\1\uffff\1\73\1\u04f4\2\73\1\u04f7\1\73\1\uffff"+
        "\14\73\1\u0507\1\u0508\1\73\3\uffff\2\73\1\u050c\1\uffff\1\u050d"+
        "\2\uffff\1\73\1\u050f\4\73\1\u0514\1\u0515\2\73\1\u0518\11\73\1"+
        "\u0522\1\uffff\2\73\1\u0525\1\73\1\uffff\1\73\1\uffff\1\73\1\u0529"+
        "\1\uffff\1\73\1\u052b\2\73\1\u052e\1\u052f\1\u0530\2\73\1\u0533"+
        "\10\73\1\uffff\2\73\1\u053e\1\uffff\2\73\1\uffff\1\73\1\uffff\1"+
        "\u0542\1\uffff\1\u0543\1\uffff\4\73\4\uffff\4\73\1\uffff\1\u054e"+
        "\2\73\1\u0551\2\uffff\4\73\1\u0556\1\73\1\u0558\1\73\1\uffff\1\73"+
        "\1\u055b\2\73\1\u055e\1\73\1\uffff\2\73\1\uffff\2\73\1\uffff\10"+
        "\73\1\u056c\2\73\1\u056f\3\73\2\uffff\3\73\2\uffff\1\73\1\uffff"+
        "\1\73\1\u0578\2\73\2\uffff\2\73\1\uffff\1\u057d\2\73\1\u0580\4\73"+
        "\1\u0585\1\uffff\1\73\1\u0587\1\uffff\2\73\1\u058a\1\uffff\1\73"+
        "\1\uffff\2\73\3\uffff\1\u058e\1\73\1\uffff\3\73\1\u0593\2\73\1\u0597"+
        "\1\73\1\u0599\1\73\1\uffff\3\73\2\uffff\4\73\2\uffff\1\u05a6\1\u05a7"+
        "\1\73\1\u05a9\1\uffff\1\73\1\u05ab\1\uffff\4\73\1\uffff\1\73\1\uffff"+
        "\1\73\1\u05b2\1\uffff\2\73\1\uffff\1\u05b5\1\u05b6\13\73\1\uffff"+
        "\1\u05c2\1\u05c3\1\uffff\6\73\1\u05cc\1\u05cd\1\uffff\4\73\1\uffff"+
        "\2\73\1\uffff\2\73\1\u05d6\1\73\1\uffff\1\73\1\uffff\1\u05d9\1\73"+
        "\1\uffff\3\73\1\uffff\3\73\1\u05e1\1\uffff\1\u05e2\2\73\1\uffff"+
        "\1\73\1\uffff\1\73\1\u05e7\1\u05e8\1\u05e9\3\73\1\u05ed\6\uffff"+
        "\1\73\1\uffff\1\73\1\uffff\1\73\1\u05f2\1\u05f3\1\73\1\u05f5\1\73"+
        "\1\uffff\1\73\1\u05f8\2\uffff\2\73\1\u05fb\10\73\2\uffff\3\73\1"+
        "\u0607\1\u0608\1\u0609\1\u060b\1\73\2\uffff\6\73\1\u0613\1\73\1"+
        "\uffff\1\u0615\1\u0616\1\uffff\1\73\1\u0618\2\73\1\u061b\2\73\2"+
        "\uffff\1\u0621\2\73\1\u0624\3\uffff\3\73\2\uffff\1\u062a\1\73\1"+
        "\u062d\2\uffff\1\u062e\1\uffff\1\73\1\u0630\1\uffff\2\73\1\uffff"+
        "\13\73\3\uffff\1\73\1\uffff\2\73\1\u0641\1\73\1\u0643\2\73\1\uffff"+
        "\1\73\2\uffff\1\u0647\1\uffff\2\73\1\uffff\5\73\1\uffff\2\73\1\uffff"+
        "\1\73\1\u0652\1\73\3\uffff\2\73\2\uffff\1\u0656\1\uffff\2\73\1\u0659"+
        "\5\73\1\u065f\7\73\1\uffff\1\73\1\uffff\2\73\1\u066a\1\uffff\6\73"+
        "\1\u0671\2\73\1\u0674\1\uffff\3\73\1\uffff\2\73\1\uffff\2\73\1\u067c"+
        "\1\u067d\1\73\1\uffff\7\73\1\u0686\1\73\1\u0688\1\uffff\1\u0689"+
        "\2\73\1\u068c\2\73\1\uffff\1\73\1\u0690\1\uffff\1\u0691\3\73\1\u0695"+
        "\1\u0696\1\73\2\uffff\1\73\1\u0699\6\73\1\uffff\1\73\2\uffff\1\73"+
        "\1\u06a2\1\uffff\3\73\2\uffff\3\73\2\uffff\1\73\1\u06aa\1\uffff"+
        "\3\73\1\u06ae\1\73\1\u06b0\2\73\1\uffff\1\u06b3\1\73\1\u06b5\1\u06b6"+
        "\2\73\1\u06b9\1\uffff\3\73\1\uffff\1\73\1\uffff\2\73\1\uffff\1\u06c1"+
        "\2\uffff\1\73\1\u06c3\1\uffff\1\u06c5\2\73\1\u06c8\1\u06c9\1\u06ca"+
        "\1\73\1\uffff\1\u06cc\1\uffff\1\73\1\uffff\2\73\3\uffff\1\73\1\uffff"+
        "\3\73\1\u06d4\3\73\1\uffff\11\73\1\u06e1\2\73\1\uffff\2\73\1\u06e6"+
        "\1\73\1\uffff\1\u06e8\1\uffff";
    static final String DFA13_eofS =
        "\u06e9\uffff";
    static final String DFA13_minS =
        "\1\0\2\145\2\141\1\156\1\111\1\117\1\125\1\164\1\141\1\155\2\141"+
        "\1\157\1\141\1\145\1\141\1\144\3\141\1\151\1\114\1\110\1\105\1\122"+
        "\3\105\1\124\2\uffff\1\141\2\uffff\1\142\4\uffff\1\55\1\156\1\162"+
        "\3\uffff\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\162\1\151\1\156\1"+
        "\uffff\1\162\1\145\1\141\1\60\1\142\1\145\1\170\1\160\1\154\1\144"+
        "\1\157\1\154\1\141\1\156\1\144\1\101\1\124\1\114\1\162\1\154\1\164"+
        "\1\154\1\143\1\156\2\60\2\141\1\123\1\147\1\156\1\154\1\60\1\141"+
        "\1\157\1\155\1\141\1\143\1\60\1\156\1\164\2\141\1\156\1\155\1\156"+
        "\1\160\1\60\1\154\1\156\1\162\1\142\1\141\1\144\1\141\1\154\1\156"+
        "\1\151\1\155\1\162\1\141\1\151\1\141\1\160\1\157\2\60\1\162\1\143"+
        "\1\145\1\141\1\162\1\146\2\156\1\157\1\147\1\143\1\144\1\164\1\156"+
        "\1\101\1\114\1\111\1\104\1\107\1\105\1\114\1\106\1\116\1\101\2\uffff"+
        "\1\156\1\151\1\162\1\154\1\141\2\uffff\1\160\1\164\1\157\1\164\2"+
        "\151\5\uffff\1\163\1\151\11\uffff\1\151\1\147\1\164\1\163\1\167"+
        "\1\145\1\156\1\60\1\147\1\151\1\145\1\uffff\1\147\1\60\1\155\1\164"+
        "\2\145\1\163\1\145\1\141\1\154\1\164\1\155\1\143\1\155\1\164\1\162"+
        "\1\114\1\111\1\114\1\151\1\154\1\144\1\164\1\62\1\164\1\157\1\167"+
        "\1\153\1\144\1\uffff\1\60\1\uffff\1\154\1\157\1\147\1\143\1\156"+
        "\1\147\1\145\1\163\1\151\1\164\1\145\1\165\1\143\1\156\1\151\1\uffff"+
        "\1\164\1\145\1\167\1\151\1\155\1\156\1\154\1\151\1\141\1\163\1\uffff"+
        "\2\141\1\154\1\151\1\145\1\164\1\167\1\155\1\145\1\103\1\157\1\145"+
        "\1\60\1\143\1\147\1\uffff\1\164\1\165\1\144\1\60\1\147\1\160\1\164"+
        "\1\162\1\143\1\154\1\164\1\156\1\164\1\143\1\151\1\145\1\143\1\151"+
        "\1\164\1\151\1\142\1\145\1\154\1\156\2\uffff\1\164\1\60\1\153\1"+
        "\163\1\144\1\152\1\146\1\164\1\163\1\164\1\144\1\157\1\164\1\145"+
        "\1\160\1\150\1\147\1\141\2\157\1\164\2\151\1\141\1\145\1\103\1\105"+
        "\1\104\1\124\1\60\1\110\1\105\1\114\2\124\1\114\1\145\1\155\1\144"+
        "\1\154\1\145\1\144\1\166\1\154\1\151\1\157\1\166\1\157\1\147\1\150"+
        "\1\60\1\155\1\151\2\145\1\172\1\150\1\60\2\151\2\60\1\163\1\uffff"+
        "\1\154\1\147\1\146\1\145\1\143\1\145\1\162\1\uffff\1\145\1\60\1"+
        "\146\1\144\1\145\1\123\1\164\1\46\1\165\1\145\1\164\2\60\1\157\1"+
        "\117\1\124\1\123\1\156\2\60\1\157\1\144\2\157\1\167\1\145\1\147"+
        "\1\60\1\147\1\162\1\uffff\1\151\1\162\1\145\1\162\1\145\1\154\2"+
        "\60\1\146\1\145\1\143\1\145\1\151\1\60\1\156\1\164\1\151\1\164\1"+
        "\156\1\60\1\156\1\141\2\145\1\155\1\165\1\151\2\155\1\157\1\164"+
        "\1\156\3\141\1\60\1\162\1\157\1\163\1\60\1\uffff\1\150\2\151\1\60"+
        "\1\163\1\151\1\uffff\1\150\1\46\1\150\1\141\1\153\1\155\1\141\1"+
        "\162\1\145\1\164\1\145\1\137\1\153\1\164\1\162\2\154\1\137\1\164"+
        "\1\151\1\154\1\156\1\151\1\145\1\162\1\uffff\1\141\1\167\1\151\2"+
        "\145\1\146\1\151\1\60\1\163\1\165\1\141\2\60\3\164\1\165\1\151\1"+
        "\154\1\60\1\157\1\156\2\164\1\113\2\60\1\105\1\uffff\1\124\1\116"+
        "\1\117\1\60\1\105\1\111\1\162\1\157\1\154\1\145\1\141\1\166\2\151"+
        "\1\166\1\154\1\145\1\114\1\156\1\141\1\uffff\1\163\1\141\1\154\1"+
        "\156\1\157\1\164\1\uffff\1\143\1\157\2\uffff\1\151\1\145\1\150\3"+
        "\164\1\154\1\141\1\60\1\151\1\146\1\151\1\157\1\162\1\uffff\1\141"+
        "\2\60\1\143\1\60\1\150\2\uffff\1\162\1\154\1\151\2\uffff\1\151\1"+
        "\107\1\114\1\103\1\147\1\141\2\uffff\1\155\1\157\1\144\1\156\1\60"+
        "\1\145\1\162\1\uffff\1\145\1\162\1\143\1\164\1\60\1\157\1\144\1"+
        "\145\2\uffff\1\60\1\156\1\164\2\156\1\uffff\2\145\2\143\1\147\1"+
        "\uffff\1\153\1\162\2\60\1\141\1\154\1\164\1\151\1\157\1\147\2\163"+
        "\1\156\1\142\1\154\1\uffff\1\151\1\154\1\160\1\171\1\uffff\1\60"+
        "\1\156\1\60\1\164\1\uffff\1\60\1\145\1\164\2\uffff\1\60\1\143\1"+
        "\142\1\156\1\160\1\60\1\156\1\60\1\162\1\150\3\141\1\145\1\60\1"+
        "\164\1\157\1\145\1\142\1\171\1\126\2\145\1\144\1\163\1\60\1\141"+
        "\1\147\1\157\1\156\1\143\1\162\1\157\1\163\1\uffff\1\143\1\164\1"+
        "\143\1\164\1\151\2\162\1\157\1\151\2\uffff\1\60\1\157\1\151\1\162"+
        "\1\164\1\165\1\uffff\1\142\1\147\1\145\1\151\1\60\1\uffff\1\111"+
        "\1\uffff\3\60\1\127\1\uffff\1\122\1\103\1\141\1\144\1\141\1\162"+
        "\1\143\1\165\1\157\1\151\1\164\1\143\1\151\1\165\1\60\1\157\1\145"+
        "\1\151\1\146\1\102\1\155\1\160\1\154\1\145\1\164\1\156\1\60\1\141"+
        "\1\156\1\164\1\142\1\164\1\117\1\60\1\151\1\141\1\157\1\167\1\uffff"+
        "\1\145\1\60\1\146\1\171\1\172\1\154\1\145\1\143\2\uffff\1\162\1"+
        "\uffff\1\145\1\157\1\145\1\141\1\157\1\144\1\60\1\105\1\122\1\60"+
        "\1\156\1\60\1\160\1\171\1\60\1\uffff\1\156\1\157\1\162\1\141\2\60"+
        "\1\151\1\uffff\1\154\1\60\1\114\1\uffff\1\143\1\145\1\143\1\147"+
        "\1\162\2\60\1\150\2\60\1\171\2\uffff\1\154\1\164\1\171\1\143\1\144"+
        "\1\124\1\60\1\151\1\143\1\154\1\60\1\143\1\165\1\141\1\60\1\uffff"+
        "\1\102\1\uffff\1\145\1\uffff\1\167\1\60\1\uffff\1\164\1\157\1\144"+
        "\1\60\1\163\1\157\1\uffff\1\164\1\uffff\1\60\1\145\1\157\1\142\1"+
        "\154\1\60\1\142\1\uffff\1\145\2\170\1\154\1\60\1\141\1\163\1\144"+
        "\1\163\1\164\1\165\1\uffff\1\151\1\145\1\162\1\147\1\164\1\145\1"+
        "\162\1\164\1\141\1\60\1\164\3\145\1\154\2\144\1\uffff\1\156\1\166"+
        "\1\143\1\165\1\164\1\162\1\165\1\142\1\60\1\143\1\uffff\1\124\3"+
        "\uffff\3\60\1\164\1\145\2\171\1\164\1\151\1\147\1\145\1\171\1\141"+
        "\2\164\1\uffff\1\155\1\170\1\156\1\151\1\145\2\157\1\141\1\157\1"+
        "\162\1\151\1\143\1\141\1\164\1\uffff\1\154\1\60\1\151\1\165\1\117"+
        "\1\146\1\uffff\1\166\1\171\1\167\1\141\1\167\1\uffff\1\60\1\154"+
        "\1\145\1\157\1\60\1\145\1\157\2\162\1\60\1\171\1\156\1\40\1\uffff"+
        "\1\102\1\105\1\uffff\1\60\1\uffff\1\164\1\60\1\uffff\1\60\1\165"+
        "\1\60\1\171\2\uffff\1\145\1\154\1\uffff\1\151\1\145\1\144\1\145"+
        "\1\127\1\60\2\uffff\1\60\1\162\2\uffff\2\60\1\126\2\60\1\145\1\151"+
        "\1\uffff\1\157\2\145\1\uffff\1\60\1\155\1\143\1\uffff\1\157\1\151"+
        "\1\157\1\145\1\155\1\60\1\uffff\1\145\1\170\1\164\1\151\1\uffff"+
        "\1\145\1\144\1\60\1\150\1\145\1\156\1\157\1\uffff\2\162\1\154\1"+
        "\151\1\uffff\1\157\1\170\1\137\1\164\1\145\1\uffff\1\154\3\60\1"+
        "\166\1\155\1\164\1\60\1\144\2\60\1\156\1\155\1\145\1\160\1\162\1"+
        "\uffff\1\151\1\155\1\167\1\146\1\141\1\171\1\164\3\145\1\164\1\145"+
        "\1\157\1\164\1\141\1\171\1\uffff\1\60\1\101\3\uffff\1\157\1\154"+
        "\1\157\1\60\1\151\1\60\1\151\1\167\1\60\1\164\1\171\1\145\1\160"+
        "\1\164\1\153\1\164\1\146\1\164\1\160\1\162\1\144\1\151\1\141\2\164"+
        "\1\141\1\60\1\uffff\1\157\1\164\1\146\1\60\1\151\1\157\1\60\1\142"+
        "\1\60\1\uffff\1\145\1\60\1\162\1\uffff\1\60\1\154\1\164\1\151\1"+
        "\uffff\1\157\1\60\1\62\1\101\1\105\1\uffff\1\151\2\uffff\1\156\1"+
        "\uffff\1\60\1\167\1\103\1\156\1\163\2\60\1\151\1\uffff\1\157\1\uffff"+
        "\1\162\2\uffff\1\141\2\uffff\1\154\1\164\1\156\1\152\1\60\1\uffff"+
        "\1\156\1\145\1\164\1\147\1\160\1\146\1\60\1\uffff\1\162\1\60\1\145"+
        "\1\144\1\60\1\151\1\uffff\1\145\1\157\1\162\1\120\1\162\1\164\1"+
        "\151\1\145\1\172\1\144\1\164\1\142\2\60\1\165\3\uffff\1\151\1\142"+
        "\1\60\1\uffff\1\60\2\uffff\1\143\1\60\1\156\1\145\1\157\1\166\2"+
        "\60\1\145\1\171\1\60\1\150\1\160\1\154\1\163\1\151\1\152\1\165\1"+
        "\164\1\162\1\60\1\uffff\1\114\1\162\1\60\1\165\1\uffff\1\166\1\uffff"+
        "\1\143\1\60\1\uffff\1\151\1\60\2\154\3\60\2\164\1\60\1\145\1\151"+
        "\1\164\1\163\1\145\1\151\1\154\1\160\1\uffff\1\156\1\164\1\60\1"+
        "\uffff\1\164\1\165\1\uffff\1\154\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\1\154\1\151\1\172\1\165\1\uffff\2\56\1\uffff\1\122\1\116\1\157"+
        "\1\144\1\uffff\1\60\1\157\1\145\1\60\2\uffff\2\144\1\141\1\154\1"+
        "\60\1\154\1\60\1\157\1\uffff\1\163\1\60\1\164\1\150\1\60\1\164\1"+
        "\uffff\1\163\1\162\1\uffff\1\170\1\164\1\uffff\1\146\2\162\1\164"+
        "\1\141\2\151\1\172\1\60\1\145\1\171\1\60\1\141\2\162\2\uffff\3\145"+
        "\2\uffff\1\145\1\uffff\1\164\1\60\1\160\1\151\2\uffff\1\162\1\157"+
        "\1\uffff\1\60\1\162\1\141\1\60\2\157\1\160\1\157\1\60\1\uffff\1"+
        "\111\1\60\1\uffff\1\164\1\151\1\60\1\uffff\1\157\1\uffff\1\141\1"+
        "\145\3\uffff\1\60\1\157\1\uffff\1\156\1\146\1\145\1\60\1\144\1\157"+
        "\1\60\1\141\1\60\1\157\1\uffff\1\171\1\164\1\145\2\uffff\1\102\1"+
        "\143\1\157\1\164\1\62\3\60\1\156\1\60\1\uffff\1\156\1\60\1\uffff"+
        "\1\164\1\145\1\171\1\165\1\uffff\1\145\1\uffff\1\151\1\60\1\uffff"+
        "\1\157\1\164\1\uffff\2\60\1\145\1\164\1\150\1\151\1\164\2\151\1"+
        "\162\1\172\1\143\1\157\1\uffff\2\60\1\uffff\1\143\1\157\1\145\1"+
        "\163\1\167\1\162\2\60\1\uffff\1\145\1\164\1\145\1\165\1\uffff\1"+
        "\145\1\171\1\uffff\1\156\1\151\1\60\1\156\1\uffff\1\103\1\uffff"+
        "\1\60\1\164\1\uffff\1\156\1\171\1\164\1\uffff\1\155\1\164\1\151"+
        "\1\60\1\uffff\1\60\1\156\1\160\1\uffff\1\143\1\uffff\1\156\3\60"+
        "\2\141\1\156\1\60\1\uffff\1\56\4\uffff\1\163\1\uffff\1\164\1\uffff"+
        "\1\150\2\60\1\145\1\60\1\156\1\uffff\1\155\1\60\2\uffff\1\146\1"+
        "\166\1\60\1\145\1\151\1\172\1\143\1\145\1\157\1\141\1\156\2\uffff"+
        "\1\153\1\160\1\146\4\60\1\141\2\uffff\1\162\1\171\1\156\1\164\1"+
        "\146\1\157\1\60\1\156\1\uffff\2\60\1\uffff\1\171\1\60\1\157\1\145"+
        "\1\60\1\102\1\145\2\uffff\1\60\1\141\1\151\1\60\3\uffff\1\162\1"+
        "\154\1\164\1\uffff\1\61\1\60\1\141\1\60\2\uffff\1\60\1\uffff\1\164"+
        "\1\60\1\uffff\1\145\1\151\1\uffff\1\162\1\143\1\157\1\141\2\156"+
        "\1\154\1\164\1\147\1\144\1\145\3\uffff\1\162\1\uffff\2\164\1\60"+
        "\1\143\1\60\1\145\1\165\1\uffff\1\164\2\uffff\1\60\1\uffff\1\165"+
        "\1\164\1\uffff\1\145\1\157\1\151\1\157\1\162\1\uffff\1\143\1\156"+
        "\1\uffff\1\163\1\60\1\141\3\uffff\1\151\1\156\2\uffff\1\60\1\uffff"+
        "\1\162\1\145\1\60\1\141\1\156\1\154\2\164\1\60\1\141\1\162\1\157"+
        "\1\162\2\145\1\151\1\uffff\1\145\1\uffff\1\162\1\164\1\60\1\uffff"+
        "\1\164\1\145\1\146\1\160\1\147\1\164\1\60\1\151\1\147\1\60\1\uffff"+
        "\1\154\1\156\1\151\1\uffff\1\145\1\167\1\uffff\1\154\1\164\2\60"+
        "\1\141\1\uffff\1\154\1\157\1\167\2\145\1\147\1\145\1\60\1\145\1"+
        "\60\1\uffff\1\60\1\170\1\164\1\60\1\150\1\164\1\uffff\1\156\1\60"+
        "\1\uffff\1\60\1\145\1\146\1\156\2\60\1\141\2\uffff\1\154\1\60\1"+
        "\165\3\156\1\145\1\163\1\uffff\1\156\2\uffff\1\164\1\60\1\uffff"+
        "\1\164\1\157\1\147\2\uffff\1\162\1\157\1\143\2\uffff\1\154\1\60"+
        "\1\uffff\1\156\1\137\1\143\1\60\1\162\1\60\1\143\1\166\1\uffff\1"+
        "\60\1\155\2\60\1\162\1\145\1\60\1\uffff\2\144\1\145\1\uffff\1\171"+
        "\1\uffff\1\145\1\151\1\uffff\1\60\2\uffff\1\155\1\60\1\uffff\1\60"+
        "\1\141\1\151\3\60\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff\1\162"+
        "\1\147\3\uffff\1\167\1\uffff\1\157\1\153\1\150\1\60\1\162\1\137"+
        "\1\164\1\uffff\1\155\1\146\1\137\1\141\1\162\1\146\1\154\1\141\1"+
        "\162\1\60\1\155\1\141\1\uffff\1\145\1\155\1\60\1\145\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\151\1\171\1\162\1\156\1\111\1\117\1\125\1\164"+
        "\1\171\1\164\1\165\1\171\2\165\1\162\1\157\2\170\2\157\1\151\1\117"+
        "\1\110\1\111\1\122\3\105\1\124\2\uffff\1\165\2\uffff\1\165\4\uffff"+
        "\1\55\1\156\1\162\3\uffff\1\146\1\172\2\uffff\2\uffff\1\57\2\uffff"+
        "\1\162\1\151\1\156\1\uffff\1\162\1\145\1\165\1\172\1\162\1\145\1"+
        "\170\1\160\2\154\1\157\1\170\1\157\1\156\1\144\1\101\1\124\1\114"+
        "\1\162\1\170\2\164\1\143\1\156\2\172\1\141\1\160\1\123\1\172\1\156"+
        "\1\162\1\172\2\162\1\155\1\145\1\156\1\172\1\156\1\164\1\163\1\141"+
        "\1\162\1\155\1\166\1\164\1\172\1\154\1\156\1\162\1\151\1\141\1\144"+
        "\1\145\1\165\1\156\1\151\1\160\1\162\1\141\1\151\2\164\1\157\2\172"+
        "\2\163\1\157\1\141\1\162\1\146\1\171\1\163\1\157\1\156\1\166\2\164"+
        "\1\156\1\125\1\114\1\111\1\104\1\107\1\105\1\114\1\106\1\116\1\101"+
        "\2\uffff\1\156\1\151\1\162\1\155\1\151\2\uffff\1\160\1\164\1\163"+
        "\1\164\1\160\1\164\5\uffff\1\163\1\151\11\uffff\1\151\1\147\2\164"+
        "\1\167\1\145\1\156\1\172\1\147\1\151\1\145\1\uffff\1\147\1\172\1"+
        "\155\1\164\2\145\1\163\1\145\1\141\1\154\1\164\1\155\1\143\1\155"+
        "\1\164\1\162\1\114\1\111\1\114\1\151\1\154\1\144\1\164\1\142\1\164"+
        "\1\157\1\167\1\153\1\144\1\uffff\1\172\1\uffff\1\154\1\157\1\147"+
        "\1\143\1\156\1\147\1\145\1\163\1\151\1\164\1\145\1\165\2\156\1\151"+
        "\1\uffff\1\164\1\151\1\167\1\151\1\155\1\156\1\154\1\151\1\141\1"+
        "\163\1\uffff\2\141\1\154\1\151\1\145\1\164\1\167\1\155\2\145\1\157"+
        "\1\145\1\172\1\143\1\147\1\uffff\1\164\1\165\1\144\1\172\1\147\1"+
        "\160\1\164\1\162\1\143\1\165\1\164\1\156\1\164\1\160\1\151\1\145"+
        "\1\143\1\151\1\164\1\162\1\142\1\145\1\154\1\156\2\uffff\1\164\1"+
        "\172\1\153\1\163\1\144\1\152\1\146\1\164\1\163\1\164\1\144\1\157"+
        "\1\164\1\145\1\160\1\150\1\147\1\141\1\164\1\157\1\164\2\151\1\141"+
        "\1\145\1\103\1\105\1\104\1\124\1\172\1\110\1\105\1\114\2\124\1\114"+
        "\1\145\1\155\1\144\1\154\1\145\1\144\1\166\1\154\1\151\1\157\1\166"+
        "\1\157\1\147\1\150\1\172\1\155\1\151\2\145\1\172\1\150\1\172\2\151"+
        "\2\172\1\163\1\uffff\1\154\1\147\1\146\1\145\1\143\1\145\1\162\1"+
        "\uffff\1\145\1\172\1\146\1\144\1\145\1\123\1\164\1\172\1\165\1\145"+
        "\1\164\2\172\1\157\1\117\1\124\1\123\1\156\2\172\1\157\1\144\2\157"+
        "\1\167\1\145\1\147\1\172\1\147\1\162\1\uffff\1\151\1\162\1\145\1"+
        "\162\1\145\1\154\2\172\1\146\1\145\1\143\1\145\1\151\1\172\1\156"+
        "\1\164\1\151\1\164\1\156\1\172\1\156\1\141\2\145\1\155\1\165\1\151"+
        "\2\155\1\157\1\164\1\156\3\141\1\172\1\162\1\157\1\163\1\172\1\uffff"+
        "\1\150\2\151\1\172\1\163\1\151\1\uffff\1\150\1\172\1\150\1\141\1"+
        "\153\1\155\1\141\1\162\1\145\1\164\1\145\1\137\1\153\1\164\1\162"+
        "\2\154\2\164\1\171\1\154\1\156\1\151\1\145\1\162\1\uffff\1\141\1"+
        "\167\1\151\2\145\1\146\1\151\1\172\1\163\1\165\1\166\2\172\3\164"+
        "\1\165\1\151\1\154\1\172\1\157\1\156\2\164\1\113\2\172\1\105\1\uffff"+
        "\1\124\1\116\1\117\1\172\1\105\1\111\1\162\1\157\1\154\1\145\1\154"+
        "\1\166\2\151\1\166\1\154\1\145\1\143\1\156\1\141\1\uffff\1\163\1"+
        "\141\1\154\1\156\1\157\1\164\1\uffff\1\143\1\157\2\uffff\1\151\1"+
        "\145\1\150\3\164\1\162\1\141\1\172\1\151\1\156\1\164\1\157\1\162"+
        "\1\uffff\1\141\2\172\1\143\1\172\1\166\2\uffff\1\162\1\154\1\151"+
        "\2\uffff\1\151\1\107\1\114\1\103\1\147\1\141\2\uffff\1\155\1\157"+
        "\1\144\1\156\1\172\1\145\1\162\1\uffff\1\145\1\162\1\143\1\164\1"+
        "\172\1\157\1\144\1\145\2\uffff\1\172\1\156\1\164\2\156\1\uffff\2"+
        "\145\2\143\1\147\1\uffff\1\153\1\162\2\172\1\141\1\154\1\164\1\151"+
        "\1\157\1\147\2\163\1\156\1\142\1\154\1\uffff\1\151\1\154\1\160\1"+
        "\171\1\uffff\1\172\1\156\1\172\1\164\1\uffff\1\172\1\145\1\164\2"+
        "\uffff\1\172\1\143\1\145\1\156\1\160\1\172\1\156\1\172\1\162\1\166"+
        "\3\141\1\145\1\172\1\164\1\157\1\145\1\142\1\171\1\126\2\145\1\144"+
        "\1\163\1\172\1\141\1\147\1\157\1\156\1\143\1\162\1\157\1\163\1\uffff"+
        "\1\143\1\164\1\143\1\164\1\151\2\162\1\157\1\151\2\uffff\1\172\1"+
        "\157\1\151\1\162\1\164\1\165\1\uffff\2\147\1\145\1\151\1\172\1\uffff"+
        "\1\111\1\uffff\3\172\1\127\1\uffff\1\122\1\103\1\141\1\144\1\141"+
        "\1\162\1\143\1\165\1\157\1\151\1\164\1\143\1\151\1\165\1\172\1\157"+
        "\1\145\1\151\1\146\1\124\1\155\1\160\1\154\1\145\1\164\1\156\1\172"+
        "\1\141\1\156\1\164\1\142\1\164\1\117\1\172\1\151\1\141\1\157\1\167"+
        "\1\uffff\1\145\1\172\1\146\1\171\1\172\1\154\1\145\1\143\2\uffff"+
        "\1\162\1\uffff\1\145\1\157\1\145\1\141\1\157\1\144\1\172\1\105\1"+
        "\122\1\172\1\156\1\172\1\160\1\171\1\172\1\uffff\1\156\1\157\1\162"+
        "\1\141\2\172\1\151\1\uffff\1\154\1\172\1\114\1\uffff\1\143\1\145"+
        "\1\143\1\147\1\162\2\172\1\150\2\172\1\171\2\uffff\1\154\1\164\1"+
        "\171\1\143\1\144\1\124\1\172\1\151\1\143\1\154\1\172\1\143\1\165"+
        "\1\141\1\172\1\uffff\1\124\1\uffff\1\145\1\uffff\1\167\1\172\1\uffff"+
        "\1\164\1\157\1\144\1\172\1\163\1\157\1\uffff\1\164\1\uffff\1\172"+
        "\1\145\1\157\1\142\1\154\1\172\1\142\1\uffff\1\145\2\170\1\154\1"+
        "\172\1\141\1\163\1\144\1\163\1\164\1\165\1\uffff\1\151\1\145\1\162"+
        "\1\147\1\164\1\145\1\162\1\164\1\141\1\172\1\164\3\145\1\154\2\144"+
        "\1\uffff\1\156\1\166\1\143\1\165\1\164\1\162\1\165\1\142\1\172\1"+
        "\143\1\uffff\1\124\3\uffff\3\172\1\164\1\145\2\171\1\164\1\151\1"+
        "\147\1\145\1\171\1\141\2\164\1\uffff\1\155\1\170\1\156\1\151\1\145"+
        "\2\157\1\141\1\157\1\162\1\151\1\143\1\141\1\164\1\uffff\1\154\1"+
        "\172\1\151\1\165\1\117\1\146\1\uffff\1\166\1\171\1\167\1\141\1\167"+
        "\1\uffff\1\172\1\154\1\145\1\157\1\172\1\145\1\157\2\162\1\172\1"+
        "\171\1\156\1\40\1\uffff\1\102\1\105\1\uffff\1\172\1\uffff\1\164"+
        "\1\172\1\uffff\1\172\1\165\1\172\1\171\2\uffff\1\145\1\154\1\uffff"+
        "\1\151\1\145\1\144\1\145\1\127\1\172\2\uffff\1\172\1\162\2\uffff"+
        "\2\172\1\126\2\172\1\145\1\151\1\uffff\1\157\2\145\1\uffff\1\172"+
        "\1\155\1\143\1\uffff\1\157\1\151\1\157\1\145\1\155\1\172\1\uffff"+
        "\1\145\1\170\1\164\1\151\1\uffff\1\145\1\144\1\172\1\166\1\145\1"+
        "\156\1\157\1\uffff\2\162\1\154\1\151\1\uffff\1\157\1\170\1\137\1"+
        "\164\1\145\1\uffff\1\154\3\172\1\166\1\155\1\164\1\172\1\144\2\172"+
        "\1\156\1\155\1\145\1\160\1\162\1\uffff\1\151\1\155\1\167\1\146\1"+
        "\141\1\171\1\164\3\145\1\164\1\145\1\157\1\164\1\141\1\171\1\uffff"+
        "\1\172\1\101\3\uffff\1\157\1\154\1\157\1\172\1\151\1\172\1\151\1"+
        "\167\1\172\1\164\1\171\1\145\1\160\1\164\1\153\1\164\1\146\1\164"+
        "\1\160\1\162\1\144\1\151\1\141\2\164\1\141\1\172\1\uffff\1\157\1"+
        "\164\1\146\1\172\1\151\1\157\1\172\1\142\1\172\1\uffff\1\145\1\172"+
        "\1\162\1\uffff\1\172\1\154\1\164\1\151\1\uffff\1\157\1\172\1\64"+
        "\1\101\1\105\1\uffff\1\151\2\uffff\1\156\1\uffff\1\172\1\167\1\103"+
        "\1\156\1\163\2\172\1\151\1\uffff\1\157\1\uffff\1\162\2\uffff\1\141"+
        "\2\uffff\1\154\1\164\1\156\1\152\1\172\1\uffff\1\156\1\145\1\164"+
        "\1\147\1\160\1\146\1\172\1\uffff\1\162\1\172\1\145\1\144\1\172\1"+
        "\151\1\uffff\1\145\1\157\1\162\1\120\1\162\1\164\1\151\1\145\1\172"+
        "\1\144\1\164\1\144\2\172\1\165\3\uffff\1\151\1\142\1\172\1\uffff"+
        "\1\172\2\uffff\1\143\1\172\1\156\1\145\1\157\1\166\2\172\1\145\1"+
        "\171\1\172\1\150\1\160\1\154\1\163\1\151\1\152\1\165\1\164\1\162"+
        "\1\172\1\uffff\1\114\1\162\1\172\1\165\1\uffff\1\166\1\uffff\1\143"+
        "\1\172\1\uffff\1\151\1\172\2\154\3\172\2\164\1\172\1\145\1\151\1"+
        "\164\1\163\1\145\1\151\1\154\1\160\1\uffff\1\156\1\164\1\172\1\uffff"+
        "\1\164\1\165\1\uffff\1\154\1\uffff\1\172\1\uffff\1\172\1\uffff\1"+
        "\154\1\151\1\172\1\165\1\uffff\2\56\1\uffff\1\122\1\116\1\157\1"+
        "\144\1\uffff\1\172\1\157\1\145\1\172\2\uffff\2\144\1\141\1\154\1"+
        "\172\1\154\1\172\1\157\1\uffff\1\163\1\172\1\164\1\150\1\172\1\164"+
        "\1\uffff\1\163\1\162\1\uffff\1\170\1\164\1\uffff\1\146\2\162\1\164"+
        "\1\141\2\151\2\172\1\145\1\171\1\172\1\141\2\162\2\uffff\3\145\2"+
        "\uffff\1\145\1\uffff\1\164\1\172\1\160\1\151\2\uffff\1\162\1\157"+
        "\1\uffff\1\172\1\162\1\141\1\172\2\157\1\160\1\157\1\172\1\uffff"+
        "\1\111\1\172\1\uffff\1\164\1\151\1\172\1\uffff\1\157\1\uffff\1\141"+
        "\1\145\3\uffff\1\172\1\157\1\uffff\1\156\1\146\1\145\1\172\1\144"+
        "\1\157\1\172\1\141\1\172\1\157\1\uffff\1\171\1\164\1\145\2\uffff"+
        "\1\102\1\143\1\157\1\164\1\63\1\61\2\172\1\156\1\172\1\uffff\1\156"+
        "\1\172\1\uffff\1\164\1\145\1\171\1\165\1\uffff\1\145\1\uffff\1\151"+
        "\1\172\1\uffff\1\157\1\164\1\uffff\2\172\1\145\1\164\1\150\1\151"+
        "\1\164\2\151\1\162\1\172\1\143\1\157\1\uffff\2\172\1\uffff\1\143"+
        "\1\157\1\145\1\163\1\167\1\162\2\172\1\uffff\1\145\1\164\1\145\1"+
        "\165\1\uffff\1\145\1\171\1\uffff\1\156\1\151\1\172\1\156\1\uffff"+
        "\1\103\1\uffff\1\172\1\164\1\uffff\1\156\1\171\1\164\1\uffff\1\155"+
        "\1\164\1\151\1\172\1\uffff\1\172\1\156\1\160\1\uffff\1\143\1\uffff"+
        "\1\156\3\172\2\141\1\156\1\172\1\uffff\1\56\4\uffff\1\163\1\uffff"+
        "\1\164\1\uffff\1\150\2\172\1\145\1\172\1\156\1\uffff\1\155\1\172"+
        "\2\uffff\1\146\1\166\1\172\1\145\1\151\1\172\1\143\1\145\1\157\1"+
        "\141\1\156\2\uffff\1\153\1\160\1\146\4\172\1\141\2\uffff\1\162\1"+
        "\171\1\156\1\164\1\146\1\157\1\172\1\156\1\uffff\2\172\1\uffff\1"+
        "\171\1\172\1\157\1\145\1\172\1\124\1\145\2\uffff\1\172\1\141\1\151"+
        "\1\172\3\uffff\1\162\1\154\1\164\1\uffff\1\63\1\172\1\141\1\172"+
        "\2\uffff\1\172\1\uffff\1\164\1\172\1\uffff\1\145\1\151\1\uffff\1"+
        "\162\1\143\1\157\1\141\2\156\1\154\1\164\1\147\1\144\1\145\3\uffff"+
        "\1\162\1\uffff\2\164\1\172\1\143\1\172\1\145\1\165\1\uffff\1\164"+
        "\2\uffff\1\172\1\uffff\1\165\1\164\1\uffff\1\145\1\157\1\151\1\157"+
        "\1\162\1\uffff\1\143\1\156\1\uffff\1\163\1\172\1\141\3\uffff\1\151"+
        "\1\156\2\uffff\1\172\1\uffff\1\162\1\145\1\172\1\141\1\156\1\154"+
        "\2\164\1\172\1\141\1\162\1\157\1\162\2\145\1\151\1\uffff\1\145\1"+
        "\uffff\1\162\1\164\1\172\1\uffff\1\164\1\145\1\146\1\160\1\147\1"+
        "\164\1\172\1\151\1\147\1\172\1\uffff\1\154\1\156\1\151\1\uffff\1"+
        "\145\1\167\1\uffff\1\154\1\164\2\172\1\141\1\uffff\1\154\1\157\1"+
        "\167\2\145\1\147\1\145\1\172\1\145\1\172\1\uffff\1\172\1\170\1\164"+
        "\1\172\1\150\1\164\1\uffff\1\156\1\172\1\uffff\1\172\1\145\1\146"+
        "\1\156\2\172\1\141\2\uffff\1\154\1\172\1\165\3\156\1\145\1\163\1"+
        "\uffff\1\156\2\uffff\1\164\1\172\1\uffff\1\164\1\157\1\147\2\uffff"+
        "\1\162\1\157\1\143\2\uffff\1\154\1\172\1\uffff\1\156\1\137\1\143"+
        "\1\172\1\162\1\172\1\143\1\166\1\uffff\1\172\1\155\2\172\1\162\1"+
        "\145\1\172\1\uffff\1\144\1\154\1\145\1\uffff\1\171\1\uffff\1\145"+
        "\1\151\1\uffff\1\172\2\uffff\1\155\1\172\1\uffff\1\172\1\141\1\151"+
        "\3\172\1\145\1\uffff\1\172\1\uffff\1\156\1\uffff\1\162\1\147\3\uffff"+
        "\1\167\1\uffff\1\157\1\153\1\150\1\172\1\162\1\137\1\164\1\uffff"+
        "\1\155\1\146\1\137\1\141\1\162\1\146\1\154\1\141\1\162\1\172\1\155"+
        "\1\141\1\uffff\1\145\1\155\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\37\uffff\1\124\1\125\1\uffff\1\127\1\130\1\uffff\1\154\1\u00b0"+
        "\1\u00ca\1\u00cf\3\uffff\1\u00fd\1\u00fe\1\u0109\2\uffff\1\u010e"+
        "\1\u010f\3\uffff\1\u0113\1\u0114\3\uffff\1\u010e\133\uffff\1\124"+
        "\1\125\5\uffff\1\127\1\130\6\uffff\1\154\1\u00b0\1\u00ca\1\u00cf"+
        "\1\u00d7\2\uffff\1\u00fd\1\u00fe\1\u0109\1\u010d\1\u010f\1\u0110"+
        "\1\u0111\1\u0112\1\u0113\13\uffff\1\u00ed\35\uffff\1\u0100\1\uffff"+
        "\1\100\17\uffff\1\74\12\uffff\1\73\17\uffff\1\77\30\uffff\1\75\1"+
        "\76\77\uffff\1\46\7\uffff\1\143\36\uffff\1\21\50\uffff\1\42\6\uffff"+
        "\1\37\31\uffff\1\u0106\34\uffff\1\106\24\uffff\1\u010a\6\uffff\1"+
        "\u00b7\2\uffff\1\170\1\3\16\uffff\1\u00f0\6\uffff\1\63\1\55\3\uffff"+
        "\1\u00ff\1\u00f1\6\uffff\1\u00d0\1\31\7\uffff\1\u00ec\10\uffff\1"+
        "\u0107\1\26\5\uffff\1\u009a\5\uffff\1\144\17\uffff\1\33\4\uffff"+
        "\1\u00f6\4\uffff\1\u00ee\3\uffff\1\64\1\62\42\uffff\1\50\11\uffff"+
        "\1\u0101\1\u00f4\6\uffff\1\u0103\5\uffff\1\110\1\uffff\1\115\4\uffff"+
        "\1\112\46\uffff\1\141\10\uffff\1\u0108\1\4\1\uffff\1\17\17\uffff"+
        "\1\u00a2\7\uffff\1\145\3\uffff\1\27\13\uffff\1\u00de\1\u00f8\17"+
        "\uffff\1\65\1\uffff\1\u008c\1\uffff\1\35\2\uffff\1\160\6\uffff\1"+
        "\u00d1\1\uffff\1\u00f5\7\uffff\1\40\13\uffff\1\41\21\uffff\1\51"+
        "\12\uffff\1\104\1\uffff\1\105\1\113\1\107\17\uffff\1\u00a1\16\uffff"+
        "\1\157\6\uffff\1\131\5\uffff\1\u0087\15\uffff\1\13\2\uffff\1\16"+
        "\1\uffff\1\47\2\uffff\1\173\4\uffff\1\32\1\123\2\uffff\1\23\6\uffff"+
        "\1\u0104\1\101\2\uffff\1\u00ce\1\u00cb\7\uffff\1\u00b9\3\uffff\1"+
        "\25\3\uffff\1\u00f7\6\uffff\1\u00ad\4\uffff\1\u009b\7\uffff\1\52"+
        "\4\uffff\1\u00dc\5\uffff\1\152\20\uffff\1\140\20\uffff\1\u00fb\2"+
        "\uffff\1\111\1\114\1\116\33\uffff\1\134\11\uffff\1\u0088\3\uffff"+
        "\1\u00f2\4\uffff\1\u00e6\5\uffff\1\20\1\uffff\1\u00e8\1\u00e3\1"+
        "\uffff\1\22\10\uffff\1\u0082\1\uffff\1\u00c9\1\uffff\1\u0094\1\24"+
        "\1\uffff\1\u00e9\1\103\5\uffff\1\u00b6\7\uffff\1\176\6\uffff\1\150"+
        "\17\uffff\1\u00c8\1\u0095\1\153\3\uffff\1\122\1\uffff\1\u00c0\1"+
        "\132\25\uffff\1\102\4\uffff\1\174\1\uffff\1\u00df\2\uffff\1\u00c1"+
        "\22\uffff\1\2\3\uffff\1\u00a0\2\uffff\1\167\1\uffff\1\171\1\uffff"+
        "\1\u00c2\1\uffff\1\u00b1\4\uffff\1\u00ea\2\uffff\1\12\4\uffff\1"+
        "\u00d3\4\uffff\1\u00d9\1\u00f3\10\uffff\1\u00d5\6\uffff\1\u00ef"+
        "\2\uffff\1\u0083\2\uffff\1\u00cc\17\uffff\1\172\1\u00b8\3\uffff"+
        "\1\121\1\u00b5\1\uffff\1\133\4\uffff\1\147\1\u0080\2\uffff\1\u00e5"+
        "\11\uffff\1\u00fa\2\uffff\1\155\3\uffff\1\u0081\1\uffff\1\137\2"+
        "\uffff\1\u00bb\1\u00bf\1\u010b\2\uffff\1\u00a5\12\uffff\1\u009f"+
        "\3\uffff\1\u00af\1\u00b2\12\uffff\1\177\2\uffff\1\34\4\uffff\1\136"+
        "\1\uffff\1\u00d2\2\uffff\1\30\2\uffff\1\u00ac\15\uffff\1\u00be\2"+
        "\uffff\1\66\10\uffff\1\120\4\uffff\1\u0102\2\uffff\1\u00cd\4\uffff"+
        "\1\u0085\1\uffff\1\126\2\uffff\1\u00e0\3\uffff\1\u00a3\4\uffff\1"+
        "\u010c\3\uffff\1\1\1\uffff\1\u00d6\10\uffff\1\5\1\uffff\1\10\1\11"+
        "\1\14\1\15\1\uffff\1\u00c3\1\uffff\1\u00b3\6\uffff\1\u00c5\2\uffff"+
        "\1\u00ae\1\36\13\uffff\1\u00ba\1\u00e7\10\uffff\1\u008d\1\u0096"+
        "\10\uffff\1\u0084\2\uffff\1\165\7\uffff\1\u0105\1\u00da\4\uffff"+
        "\1\142\1\166\1\u00d8\3\uffff\1\163\4\uffff\1\u00c6\1\u00d4\1\uffff"+
        "\1\u0097\2\uffff\1\u00ab\2\uffff\1\44\13\uffff\1\u0099\1\175\1\u00b4"+
        "\1\uffff\1\151\7\uffff\1\u00eb\1\uffff\1\u0089\1\117\1\uffff\1\135"+
        "\2\uffff\1\u00a4\5\uffff\1\u00dd\2\uffff\1\u0086\3\uffff\1\6\1\7"+
        "\1\u00e1\2\uffff\1\43\1\u0098\1\uffff\1\u00aa\20\uffff\1\146\1\uffff"+
        "\1\162\3\uffff\1\u00db\12\uffff\1\56\3\uffff\1\u00e4\2\uffff\1\u00fc"+
        "\5\uffff\1\60\12\uffff\1\u00e2\6\uffff\1\u00f9\2\uffff\1\u00bd\7"+
        "\uffff\1\u009c\1\u009d\10\uffff\1\u0091\1\uffff\1\164\1\161\2\uffff"+
        "\1\u00a7\3\uffff\1\u00c7\1\57\3\uffff\1\u008a\1\53\2\uffff\1\61"+
        "\10\uffff\1\u00a6\7\uffff\1\u009e\3\uffff\1\u008e\1\uffff\1\156"+
        "\2\uffff\1\u00a8\1\uffff\1\u00c4\1\u00bc\2\uffff\1\54\7\uffff\1"+
        "\u00a9\1\uffff\1\u0092\1\uffff\1\67\2\uffff\1\u0090\1\u008f\1\u0093"+
        "\1\uffff\1\45\7\uffff\1\u008b\14\uffff\1\70\4\uffff\1\71\1\uffff"+
        "\1\72";
    static final String DFA13_specialS =
        "\1\0\62\uffff\1\1\1\2\u06b4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\67\1\63\1\57\3\67\1\64\1"+
            "\54\1\55\1\40\1\67\1\47\1\56\1\37\1\65\12\62\1\45\1\67\1\51"+
            "\1\50\3\67\1\5\1\27\1\35\1\6\1\61\1\10\1\32\1\61\1\36\2\61\1"+
            "\34\1\61\1\7\3\61\1\31\1\11\3\61\1\30\1\61\1\33\1\61\3\67\1"+
            "\60\1\61\1\67\1\44\1\12\1\21\1\15\1\22\1\4\1\41\1\1\1\13\1\61"+
            "\1\26\1\24\1\17\1\16\1\53\1\23\1\61\1\25\1\14\1\3\1\52\1\2\1"+
            "\20\3\61\1\42\1\46\1\43\uff82\67",
            "\1\71\3\uffff\1\72\5\uffff\1\70",
            "\1\74\3\uffff\1\75",
            "\1\100\3\uffff\1\102\2\uffff\1\101\1\104\5\uffff\1\77\2\uffff"+
            "\1\76\6\uffff\1\103",
            "\1\105\7\uffff\1\107\2\uffff\1\106\2\uffff\1\111\2\uffff\1"+
            "\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\122\3\uffff\1\121\3\uffff\1\123\5\uffff\1\117\5\uffff\1"+
            "\120\3\uffff\1\124",
            "\1\127\1\125\4\uffff\1\130\1\126",
            "\1\132\1\uffff\1\140\1\uffff\1\133\2\uffff\1\136\1\131\6\uffff"+
            "\1\134\3\uffff\1\135\1\137",
            "\1\144\3\uffff\1\141\3\uffff\1\145\6\uffff\1\142\1\uffff\1"+
            "\146\6\uffff\1\143",
            "\1\147\5\uffff\1\150",
            "\1\152\3\uffff\1\155\7\uffff\1\153\1\uffff\1\151\5\uffff\1"+
            "\154",
            "\1\157\3\uffff\1\161\5\uffff\1\156\2\uffff\1\160",
            "\1\166\3\uffff\1\164\2\uffff\1\162\1\167\2\uffff\1\165\2\uffff"+
            "\1\163",
            "\1\171\10\uffff\1\170\1\172\11\uffff\1\173",
            "\1\u0080\3\uffff\1\u0083\2\uffff\1\174\3\uffff\1\u0082\2\uffff"+
            "\1\177\2\uffff\1\u0081\1\uffff\1\175\3\uffff\1\176",
            "\1\u0085\3\uffff\1\u0084\3\uffff\1\u0086\5\uffff\1\u0087",
            "\1\u008a\3\uffff\1\u0089\3\uffff\1\u0088\5\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d\2\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090\3\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u009c\3\uffff\1\u0099\3\uffff\1\u009b\10\uffff\1\u009d"+
            "\2\uffff\1\u009a",
            "",
            "",
            "\1\u00a2\1\u00a1\10\uffff\1\u00a4\1\uffff\1\u00a5\1\uffff"+
            "\1\u00a0\4\uffff\1\u00a3",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "\12\u00b0\7\uffff\6\u00b0\32\uffff\6\u00b0",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\0\u00b2",
            "\0\u00b2",
            "\1\u00b3\4\uffff\1\u00b4",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\23\uffff\1\u00bb",
            "\12\73\7\uffff\13\73\1\u00c0\5\73\1\u00bf\10\73\4\uffff\1"+
            "\73\1\uffff\6\73\1\u00be\10\73\1\u00bd\12\73",
            "\1\u00c3\17\uffff\1\u00c2",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c9\7\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb\13\uffff\1\u00cc",
            "\1\u00cd\7\uffff\1\u00ce\5\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d7\2\uffff\1\u00d6\4\uffff\1\u00d8\3\uffff\1\u00d9",
            "\1\u00da",
            "\1\u00db\7\uffff\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00e0\6"+
            "\73",
            "\1\u00e2",
            "\1\u00e4\16\uffff\1\u00e3",
            "\1\u00e5",
            "\1\u00e6\6\uffff\1\u00e7\13\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00ec\1\uffff\1\u00eb\2\uffff\1\u00ed\1\u00ea",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u00ee\7\73\1\u00ef"+
            "\10\73\1\u00f0\10\73",
            "\1\u00f2\20\uffff\1\u00f3",
            "\1\u00f4\2\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f8\3\uffff\1\u00f7",
            "\1\u00f9\2\uffff\1\u00fa\7\uffff\1\u00fb",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff\5\uffff\1\u0100\5\uffff\1\u0101\5\uffff\1\u0102",
            "\1\u0103",
            "\1\u0105\3\uffff\1\u0104",
            "\1\u0106",
            "\1\u0107\7\uffff\1\u0108",
            "\1\u0109\1\uffff\1\u010b\1\uffff\1\u010a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110\6\uffff\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114\3\uffff\1\u0115",
            "\1\u0116\1\uffff\1\u0117\6\uffff\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011c\2\uffff\1\u011b",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0121\22\uffff\1\u0120",
            "\1\u0123\3\uffff\1\u0122",
            "\1\u0124",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0127\1\u0128",
            "\1\u0129\1\u012b\16\uffff\1\u012a",
            "\1\u012d\11\uffff\1\u012c",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131\12\uffff\1\u0132",
            "\1\u0134\4\uffff\1\u0133",
            "\1\u0135",
            "\1\u0136\6\uffff\1\u0137",
            "\1\u013b\10\uffff\1\u0138\6\uffff\1\u0139\2\uffff\1\u013a",
            "\1\u013c\17\uffff\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140\23\uffff\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e\1\u014f",
            "\1\u0151\7\uffff\1\u0150",
            "",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0155\3\uffff\1\u0154",
            "\1\u0156",
            "\1\u0157\2\uffff\1\u0159\3\uffff\1\u0158",
            "\1\u015a\12\uffff\1\u015b",
            "",
            "",
            "",
            "",
            "",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0162\1\u0161",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u016b\2\73\1\u016d"+
            "\7\73\1\u016c\16\73",
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
            "\1\u0184\57\uffff\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u018c\3\73\1\u018b"+
            "\25\73",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a\12\uffff\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\u019f\3\uffff\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b3\41\uffff\1\u01b2",
            "\1\u01b4",
            "\1\u01b5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\25\73\1\u01bc\4"+
            "\73",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c4\2\uffff\1\u01c5\5\uffff\1\u01c3",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01ca\14\uffff\1\u01c9",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0\10\uffff\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "",
            "\1\u01d6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
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
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8\4\uffff\1\u01e9",
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
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
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
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0211",
            "\1\u0212",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0215",
            "",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "\1\u021d",
            "\12\73\7\uffff\2\73\1\u0221\13\73\1\u021f\3\73\1\u0220\7\73"+
            "\4\uffff\1\73\1\uffff\24\73\1\u0222\1\u021e\4\73",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u022a\11\uffff\12\73\7\uffff\32\73\4\uffff\1\u0229\1\uffff"+
            "\32\73",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0236\25"+
            "\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\73\1\u026a\30"+
            "\73",
            "",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u026f\21"+
            "\73",
            "\1\u0271",
            "\1\u0272",
            "",
            "\1\u0273",
            "\1\u0274\11\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff"+
            "\32\73",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285\1\uffff\1\u0288\1\u0286\21\uffff\1\u0287",
            "\1\u0289",
            "\1\u028b\17\uffff\1\u028a",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b\7\uffff\1\u029c\6\uffff\1\u029e\5\uffff\1\u029d",
            "\12\73\7\uffff\26\73\1\u02a1\3\73\4\uffff\1\73\1\uffff\1\u029f"+
            "\1\u02a0\30\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\u02b1\1\uffff\32\73",
            "\1\u02b3",
            "",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be\5\uffff\1\u02bf\4\uffff\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c9\7\uffff\1\u02c8\12\uffff\1\u02ca\3\uffff\1\u02c7",
            "\1\u02cb",
            "\1\u02cc",
            "",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "\1\u02d4",
            "",
            "",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db\5\uffff\1\u02dc",
            "\1\u02dd",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02df",
            "\1\u02e1\7\uffff\1\u02e0",
            "\1\u02e3\12\uffff\1\u02e2",
            "\1\u02e4",
            "\1\u02e5",
            "",
            "\1\u02e6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02e9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02ec\15\uffff\1\u02eb",
            "",
            "",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "",
            "",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "",
            "",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02fb",
            "\1\u02fc",
            "",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\25\73\1\u0301\4"+
            "\73",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "",
            "\1\u0310",
            "\1\u0311",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0314",
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
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0324",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0326",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0328",
            "\1\u0329",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u032b",
            "\1\u032c\2\uffff\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0330\15"+
            "\73",
            "\1\u0332",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0334",
            "\1\u0336\15\uffff\1\u0335",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\12\73\7\uffff\15\73\1\u0346\14\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "",
            "\1\u0360\4\uffff\1\u035f",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0365",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0369",
            "",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037e\11\uffff\1\u037d\3\uffff\1\u0380\3\uffff\1\u037f",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\1\u0392",
            "",
            "\1\u0393",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "",
            "",
            "\1\u039b",
            "",
            "\1\u039c",
            "\1\u039d",
            "\1\u039e",
            "\1\u039f",
            "\1\u03a0",
            "\1\u03a1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03a3",
            "\1\u03a4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03a6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03a8",
            "\1\u03a9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03b1",
            "",
            "\1\u03b2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03b4",
            "",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\1\u03b9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03bc",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u03bd\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03c0",
            "",
            "",
            "\1\u03c1",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03c8",
            "\1\u03c9",
            "\1\u03ca",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u03d0\11\uffff\1\u03d3\5\uffff\1\u03d1\1\uffff\1\u03d2",
            "",
            "\1\u03d4",
            "",
            "\1\u03d5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "\12\73\7\uffff\26\73\1\u03da\3\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u03dc",
            "\1\u03dd",
            "",
            "\1\u03de",
            "",
            "\12\73\7\uffff\7\73\1\u03e2\1\u03e1\14\73\1\u03e0\4\73\4\uffff"+
            "\1\u03df\1\uffff\32\73",
            "\1\u03e4",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03e9",
            "",
            "\1\u03ea",
            "\1\u03eb",
            "\1\u03ec",
            "\1\u03ed",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u03ef",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\1\u03fd",
            "\12\73\7\uffff\17\73\1\u03fe\12\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0400",
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
            "\1\u040a",
            "\1\u040b",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\73\1\u040f\30"+
            "\73",
            "\1\u0411",
            "",
            "\1\u0412",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0416",
            "\1\u0417",
            "\1\u0418",
            "\1\u0419",
            "\1\u041a",
            "\1\u041b",
            "\1\u041c",
            "\1\u041d",
            "\1\u041e",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "\1\u0427",
            "\1\u0428",
            "\1\u0429",
            "\1\u042a",
            "\1\u042b",
            "\1\u042c",
            "\1\u042d",
            "\1\u042e",
            "\1\u042f",
            "",
            "\1\u0430",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0432",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "",
            "\1\u0436",
            "\1\u0437",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u043c",
            "\1\u043d",
            "\1\u043e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0440",
            "\1\u0441",
            "\1\u0442",
            "\1\u0443",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0445",
            "\1\u0446",
            "\1\u0447",
            "",
            "\1\u0448",
            "\1\u0449",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u044b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u044e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0450",
            "",
            "",
            "\1\u0451",
            "\1\u0452",
            "",
            "\1\u0453",
            "\1\u0454",
            "\1\u0455",
            "\1\u0456",
            "\1\u0457",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\12\73\7\uffff\14\73\1\u0459\15\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u045b",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u045e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0461",
            "\1\u0462",
            "",
            "\1\u0463",
            "\1\u0464",
            "\1\u0465",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0467",
            "\1\u0468",
            "",
            "\1\u0469",
            "\1\u046a",
            "\1\u046b",
            "\1\u046c",
            "\1\u046d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u046f",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "",
            "\1\u0473",
            "\1\u0474",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0477\15\uffff\1\u0476",
            "\1\u0478",
            "\1\u0479",
            "\1\u047a",
            "",
            "\1\u047b",
            "\1\u047c",
            "\1\u047d",
            "\1\u047e",
            "",
            "\1\u047f",
            "\1\u0480",
            "\1\u0481",
            "\1\u0482",
            "\1\u0483",
            "",
            "\1\u0484",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0488",
            "\1\u0489",
            "\1\u048a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u048c",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u048f",
            "\1\u0490",
            "\1\u0491",
            "\1\u0492",
            "\1\u0493",
            "",
            "\1\u0494",
            "\1\u0495",
            "\1\u0496",
            "\1\u0497",
            "\1\u0498",
            "\1\u0499",
            "\1\u049a",
            "\1\u049b",
            "\1\u049c",
            "\1\u049d",
            "\1\u049e",
            "\1\u049f",
            "\1\u04a0",
            "\1\u04a1",
            "\1\u04a2",
            "\1\u04a3",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04a5",
            "",
            "",
            "",
            "\1\u04a6",
            "\1\u04a7",
            "\1\u04a8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04aa",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04ac",
            "\1\u04ad",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "\1\u04b3",
            "\1\u04b4",
            "\1\u04b5",
            "\1\u04b6",
            "\1\u04b7",
            "\1\u04b8",
            "\1\u04b9",
            "\1\u04ba",
            "\1\u04bb",
            "\1\u04bc",
            "\1\u04bd",
            "\1\u04be",
            "\1\u04bf",
            "\12\73\7\uffff\22\73\1\u04c0\7\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\u04c2",
            "\1\u04c3",
            "\1\u04c4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04c6",
            "\1\u04c7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04c9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u04cb",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04cd",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04cf",
            "\1\u04d0",
            "\1\u04d1",
            "",
            "\1\u04d2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04d4\1\u04d5\1\u04d6",
            "\1\u04d7",
            "\1\u04d8",
            "",
            "\1\u04d9",
            "",
            "",
            "\1\u04da",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04dc",
            "\1\u04dd",
            "\1\u04de",
            "\1\u04df",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04e2",
            "",
            "\1\u04e3",
            "",
            "\1\u04e4",
            "",
            "",
            "\1\u04e5",
            "",
            "",
            "\1\u04e6",
            "\1\u04e7",
            "\1\u04e8",
            "\1\u04e9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u04eb",
            "\1\u04ec",
            "\1\u04ed",
            "\1\u04ee",
            "\1\u04ef",
            "\1\u04f0",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u04f2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u04f3\12"+
            "\73",
            "\1\u04f5",
            "\1\u04f6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u04f8",
            "",
            "\1\u04f9",
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
            "\1\u0504\1\uffff\1\u0505",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u0506\12"+
            "\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0509",
            "",
            "",
            "",
            "\1\u050a",
            "\1\u050b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u050e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0510",
            "\1\u0511",
            "\1\u0512",
            "\1\u0513",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0516",
            "\1\u0517",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0519",
            "\1\u051a",
            "\1\u051b",
            "\1\u051c",
            "\1\u051d",
            "\1\u051e",
            "\1\u051f",
            "\1\u0520",
            "\1\u0521",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0523",
            "\1\u0524",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0526",
            "",
            "\1\u0527",
            "",
            "\1\u0528",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u052a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u052c",
            "\1\u052d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0531",
            "\1\u0532",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0534",
            "\1\u0535",
            "\1\u0536",
            "\1\u0537",
            "\1\u0538",
            "\1\u0539",
            "\1\u053a",
            "\1\u053b",
            "",
            "\1\u053c",
            "\1\u053d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u053f",
            "\1\u0540",
            "",
            "\1\u0541",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0544",
            "\1\u0545",
            "\1\u0546",
            "\1\u0547",
            "",
            "\1\u0548",
            "\1\u0549",
            "",
            "\1\u054a",
            "\1\u054b",
            "\1\u054c",
            "\1\u054d",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u054f",
            "\1\u0550",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0552",
            "\1\u0553",
            "\1\u0554",
            "\1\u0555",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0557",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0559",
            "",
            "\1\u055a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u055c",
            "\1\u055d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u055f",
            "",
            "\1\u0560",
            "\1\u0561",
            "",
            "\1\u0562",
            "\1\u0563",
            "",
            "\1\u0564",
            "\1\u0565",
            "\1\u0566",
            "\1\u0567",
            "\1\u0568",
            "\1\u0569",
            "\1\u056a",
            "\1\u056b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u056d",
            "\1\u056e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0570",
            "\1\u0571",
            "\1\u0572",
            "",
            "",
            "\1\u0573",
            "\1\u0574",
            "\1\u0575",
            "",
            "",
            "\1\u0576",
            "",
            "\1\u0577",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0579",
            "\1\u057a",
            "",
            "",
            "\1\u057b",
            "\1\u057c",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u057e",
            "\1\u057f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0581",
            "\1\u0582",
            "\1\u0583",
            "\1\u0584",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0586",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0588",
            "\1\u0589",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u058b",
            "",
            "\1\u058c",
            "\1\u058d",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u058f",
            "",
            "\1\u0590",
            "\1\u0591",
            "\1\u0592",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0594",
            "\1\u0595",
            "\12\73\7\uffff\22\73\1\u0596\7\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0598",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u059a",
            "",
            "\1\u059b",
            "\1\u059c",
            "\1\u059d",
            "",
            "",
            "\1\u059e",
            "\1\u059f",
            "\1\u05a0",
            "\1\u05a1",
            "\1\u05a2\1\u05a3",
            "\1\u05a4\1\u05a5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05a8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05aa",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05ac",
            "\1\u05ad",
            "\1\u05ae",
            "\1\u05af",
            "",
            "\1\u05b0",
            "",
            "\1\u05b1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05b3",
            "\1\u05b4",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05b7",
            "\1\u05b8",
            "\1\u05b9",
            "\1\u05ba",
            "\1\u05bb",
            "\1\u05bc",
            "\1\u05bd",
            "\1\u05be",
            "\1\u05bf",
            "\1\u05c0",
            "\1\u05c1",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05c4",
            "\1\u05c5",
            "\1\u05c6",
            "\1\u05c7",
            "\1\u05c8",
            "\1\u05c9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u05cb\17"+
            "\73\1\u05ca\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05ce",
            "\1\u05cf",
            "\1\u05d0",
            "\1\u05d1",
            "",
            "\1\u05d2",
            "\1\u05d3",
            "",
            "\1\u05d4",
            "\1\u05d5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05d7",
            "",
            "\1\u05d8",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05da",
            "",
            "\1\u05db",
            "\1\u05dc",
            "\1\u05dd",
            "",
            "\1\u05de",
            "\1\u05df",
            "\1\u05e0",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05e3",
            "\1\u05e4",
            "",
            "\1\u05e5",
            "",
            "\1\u05e6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05ea",
            "\1\u05eb",
            "\1\u05ec",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u05ee",
            "",
            "",
            "",
            "",
            "\1\u05ef",
            "",
            "\1\u05f0",
            "",
            "\1\u05f1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05f4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05f6",
            "",
            "\1\u05f7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u05f9",
            "\1\u05fa",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u05fc",
            "\1\u05fd",
            "\1\u05fe",
            "\1\u05ff",
            "\1\u0600",
            "\1\u0601",
            "\1\u0602",
            "\1\u0603",
            "",
            "",
            "\1\u0604",
            "\1\u0605",
            "\1\u0606",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u060a\27"+
            "\73",
            "\1\u060c",
            "",
            "",
            "\1\u060d",
            "\1\u060e",
            "\1\u060f",
            "\1\u0610",
            "\1\u0611",
            "\1\u0612",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0614",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0617",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0619",
            "\1\u061a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u061f\11\uffff\1\u061c\5\uffff\1\u061e\1\uffff\1\u061d",
            "\1\u0620",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0622",
            "\1\u0623",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\u0625",
            "\1\u0626",
            "\1\u0627",
            "",
            "\1\u0628\1\uffff\1\u0629",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u062b",
            "\12\73\7\uffff\24\73\1\u062c\5\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u062f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0631",
            "\1\u0632",
            "",
            "\1\u0633",
            "\1\u0634",
            "\1\u0635",
            "\1\u0636",
            "\1\u0637",
            "\1\u0638",
            "\1\u0639",
            "\1\u063a",
            "\1\u063b",
            "\1\u063c",
            "\1\u063d",
            "",
            "",
            "",
            "\1\u063e",
            "",
            "\1\u063f",
            "\1\u0640",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0642",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0644",
            "\1\u0645",
            "",
            "\1\u0646",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0648",
            "\1\u0649",
            "",
            "\1\u064a",
            "\1\u064b",
            "\1\u064c",
            "\1\u064d",
            "\1\u064e",
            "",
            "\1\u064f",
            "\1\u0650",
            "",
            "\1\u0651",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0653",
            "",
            "",
            "",
            "\1\u0654",
            "\1\u0655",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0657",
            "\1\u0658",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u065a",
            "\1\u065b",
            "\1\u065c",
            "\1\u065d",
            "\1\u065e",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0660",
            "\1\u0661",
            "\1\u0662",
            "\1\u0663",
            "\1\u0664",
            "\1\u0665",
            "\1\u0666",
            "",
            "\1\u0667",
            "",
            "\1\u0668",
            "\1\u0669",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u066b",
            "\1\u066c",
            "\1\u066d",
            "\1\u066e",
            "\1\u066f",
            "\1\u0670",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0672",
            "\1\u0673",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0675",
            "\1\u0676",
            "\1\u0677",
            "",
            "\1\u0678",
            "\1\u0679",
            "",
            "\1\u067a",
            "\1\u067b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u067e",
            "",
            "\1\u067f",
            "\1\u0680",
            "\1\u0681",
            "\1\u0682",
            "\1\u0683",
            "\1\u0684",
            "\1\u0685",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0687",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u068a",
            "\1\u068b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u068d",
            "\1\u068e",
            "",
            "\1\u068f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0692",
            "\1\u0693",
            "\1\u0694",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0697",
            "",
            "",
            "\1\u0698",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u069a",
            "\1\u069b",
            "\1\u069c",
            "\1\u069d",
            "\1\u069e",
            "\1\u069f",
            "",
            "\1\u06a0",
            "",
            "",
            "\1\u06a1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u06a3",
            "\1\u06a4",
            "\1\u06a5",
            "",
            "",
            "\1\u06a6",
            "\1\u06a7",
            "\1\u06a8",
            "",
            "",
            "\1\u06a9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u06ab",
            "\1\u06ac",
            "\1\u06ad",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06af",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06b1",
            "\1\u06b2",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06b4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06b7",
            "\1\u06b8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u06ba",
            "\1\u06bb\7\uffff\1\u06bc",
            "\1\u06bd",
            "",
            "\1\u06be",
            "",
            "\1\u06bf",
            "\1\u06c0",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u06c2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\u06c4\1\uffff\32\73",
            "\1\u06c6",
            "\1\u06c7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06cb",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u06cd",
            "",
            "\1\u06ce",
            "\1\u06cf",
            "",
            "",
            "",
            "\1\u06d0",
            "",
            "\1\u06d1",
            "\1\u06d2",
            "\1\u06d3",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06d5",
            "\1\u06d6",
            "\1\u06d7",
            "",
            "\1\u06d8",
            "\1\u06d9",
            "\1\u06da",
            "\1\u06db",
            "\1\u06dc",
            "\1\u06dd",
            "\1\u06de",
            "\1\u06df",
            "\1\u06e0",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06e2",
            "\1\u06e3",
            "",
            "\1\u06e4",
            "\1\u06e5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u06e7",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
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

                        else if ( (LA13_0=='k') ) {s = 22;}

                        else if ( (LA13_0=='B') ) {s = 23;}

                        else if ( (LA13_0=='W') ) {s = 24;}

                        else if ( (LA13_0=='R') ) {s = 25;}

                        else if ( (LA13_0=='G') ) {s = 26;}

                        else if ( (LA13_0=='Y') ) {s = 27;}

                        else if ( (LA13_0=='L') ) {s = 28;}

                        else if ( (LA13_0=='C') ) {s = 29;}

                        else if ( (LA13_0=='I') ) {s = 30;}

                        else if ( (LA13_0=='.') ) {s = 31;}

                        else if ( (LA13_0=='*') ) {s = 32;}

                        else if ( (LA13_0=='g') ) {s = 33;}

                        else if ( (LA13_0=='{') ) {s = 34;}

                        else if ( (LA13_0=='}') ) {s = 35;}

                        else if ( (LA13_0=='a') ) {s = 36;}

                        else if ( (LA13_0==':') ) {s = 37;}

                        else if ( (LA13_0=='|') ) {s = 38;}

                        else if ( (LA13_0==',') ) {s = 39;}

                        else if ( (LA13_0=='=') ) {s = 40;}

                        else if ( (LA13_0=='<') ) {s = 41;}

                        else if ( (LA13_0=='u') ) {s = 42;}

                        else if ( (LA13_0=='o') ) {s = 43;}

                        else if ( (LA13_0=='(') ) {s = 44;}

                        else if ( (LA13_0==')') ) {s = 45;}

                        else if ( (LA13_0=='-') ) {s = 46;}

                        else if ( (LA13_0=='#') ) {s = 47;}

                        else if ( (LA13_0=='^') ) {s = 48;}

                        else if ( (LA13_0=='E'||LA13_0=='H'||(LA13_0>='J' && LA13_0<='K')||LA13_0=='M'||(LA13_0>='O' && LA13_0<='Q')||(LA13_0>='T' && LA13_0<='V')||LA13_0=='X'||LA13_0=='Z'||LA13_0=='_'||LA13_0=='j'||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 49;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 50;}

                        else if ( (LA13_0=='\"') ) {s = 51;}

                        else if ( (LA13_0=='\'') ) {s = 52;}

                        else if ( (LA13_0=='/') ) {s = 53;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 54;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||LA13_0=='+'||LA13_0==';'||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_51 = input.LA(1);

                        s = -1;
                        if ( ((LA13_51>='\u0000' && LA13_51<='\uFFFF')) ) {s = 178;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( ((LA13_52>='\u0000' && LA13_52<='\uFFFF')) ) {s = 178;}

                        else s = 55;

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