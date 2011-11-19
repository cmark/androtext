package hu.bme.mit.androtext.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.androtext.lang.services.AndroTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroTextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HEX_COLOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'*'", "'generator'", "'{'", "'}'", "'target'", "'project'", "'platform'", "'version'", "'application'", "'datamodel'", "'activity'", "'layout'", "'tabactivity'", "'entity'", "'extends'", "':'", "'guimodel'", "'absolutelayout'", "'linearlayout'", "'horizontal'", "'vertical'", "'framelayout'", "'relativelayout'", "'textview'", "'edittext'", "'button'", "'listview'", "'entries'", "'listitem'", "'spinner'", "'checkbox'", "'radiogroup'", "'ratingbar'", "'togglebutton'", "'textOn'", "'textOff'", "'radiobutton'", "'preferencescreen'", "'resources'", "'='", "'intarray'", "','", "'stringarray'", "'<->'", "'dp'", "'sp'", "'pt'", "'px'", "'mm'", "'in'", "'YES'", "'NO'", "'Android 2.2'", "'Android 2.3.1'", "'Android 2.3.3'", "'Android 3.0'", "'Android 3.1'", "'Android 4.0'", "'String'", "'float'", "'boolean'", "'int'", "'fill'", "'wrap'", "'fill&wrap'", "'wrap&fill'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_HEX_COLOR=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalAndroTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAndroTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAndroTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g"; }



     	private AndroTextDslGrammarAccess grammarAccess;
     	
        public InternalAndroTextDslParser(TokenStream input, AndroTextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AndroTextModelRoot";	
       	}
       	
       	@Override
       	protected AndroTextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAndroTextModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:68:1: entryRuleAndroTextModelRoot returns [EObject current=null] : iv_ruleAndroTextModelRoot= ruleAndroTextModelRoot EOF ;
    public final EObject entryRuleAndroTextModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroTextModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:69:2: (iv_ruleAndroTextModelRoot= ruleAndroTextModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:70:2: iv_ruleAndroTextModelRoot= ruleAndroTextModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroTextModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroTextModelRoot_in_entryRuleAndroTextModelRoot75);
            iv_ruleAndroTextModelRoot=ruleAndroTextModelRoot();

            state._fsp--;

             current =iv_ruleAndroTextModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroTextModelRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroTextModelRoot"


    // $ANTLR start "ruleAndroTextModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:77:1: ruleAndroTextModelRoot returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_actualModelRoot_3_0= ruleModelRoot ) ) ) ;
    public final EObject ruleAndroTextModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_actualModelRoot_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:80:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_actualModelRoot_3_0= ruleModelRoot ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_actualModelRoot_3_0= ruleModelRoot ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_actualModelRoot_3_0= ruleModelRoot ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_actualModelRoot_3_0= ruleModelRoot ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:81:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleAndroTextModelRoot123); 

                        	newLeafNode(otherlv_0, grammarAccess.getAndroTextModelRootAccess().getPackageKeyword_0_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:87:3: lv_name_1_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAndroTextModelRootAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAndroTextModelRoot144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAndroTextModelRootRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:103:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroTextModelRootAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleAndroTextModelRoot167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroTextModelRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:121:3: ( (lv_actualModelRoot_3_0= ruleModelRoot ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:122:1: (lv_actualModelRoot_3_0= ruleModelRoot )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:122:1: (lv_actualModelRoot_3_0= ruleModelRoot )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:123:3: lv_actualModelRoot_3_0= ruleModelRoot
            {
             
            	        newCompositeNode(grammarAccess.getAndroTextModelRootAccess().getActualModelRootModelRootParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModelRoot_in_ruleAndroTextModelRoot189);
            lv_actualModelRoot_3_0=ruleModelRoot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndroTextModelRootRule());
            	        }
                   		set(
                   			current, 
                   			"actualModelRoot",
                    		lv_actualModelRoot_3_0, 
                    		"ModelRoot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroTextModelRoot"


    // $ANTLR start "entryRuleModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:147:1: entryRuleModelRoot returns [EObject current=null] : iv_ruleModelRoot= ruleModelRoot EOF ;
    public final EObject entryRuleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:148:2: (iv_ruleModelRoot= ruleModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:149:2: iv_ruleModelRoot= ruleModelRoot EOF
            {
             newCompositeNode(grammarAccess.getModelRootRule()); 
            pushFollow(FOLLOW_ruleModelRoot_in_entryRuleModelRoot225);
            iv_ruleModelRoot=ruleModelRoot();

            state._fsp--;

             current =iv_ruleModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelRoot235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRoot"


    // $ANTLR start "ruleModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:156:1: ruleModelRoot returns [EObject current=null] : (this_AndroGenModelRoot_0= ruleAndroGenModelRoot | this_AndroidApplication_1= ruleAndroidApplication | this_AndroGuiModelRoot_2= ruleAndroGuiModelRoot | this_AndroDataModelRoot_3= ruleAndroDataModelRoot | this_AndroResModelRoot_4= ruleAndroResModelRoot ) ;
    public final EObject ruleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject this_AndroGenModelRoot_0 = null;

        EObject this_AndroidApplication_1 = null;

        EObject this_AndroGuiModelRoot_2 = null;

        EObject this_AndroDataModelRoot_3 = null;

        EObject this_AndroResModelRoot_4 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:159:28: ( (this_AndroGenModelRoot_0= ruleAndroGenModelRoot | this_AndroidApplication_1= ruleAndroidApplication | this_AndroGuiModelRoot_2= ruleAndroGuiModelRoot | this_AndroDataModelRoot_3= ruleAndroDataModelRoot | this_AndroResModelRoot_4= ruleAndroResModelRoot ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:160:1: (this_AndroGenModelRoot_0= ruleAndroGenModelRoot | this_AndroidApplication_1= ruleAndroidApplication | this_AndroGuiModelRoot_2= ruleAndroGuiModelRoot | this_AndroDataModelRoot_3= ruleAndroDataModelRoot | this_AndroResModelRoot_4= ruleAndroResModelRoot )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:160:1: (this_AndroGenModelRoot_0= ruleAndroGenModelRoot | this_AndroidApplication_1= ruleAndroidApplication | this_AndroGuiModelRoot_2= ruleAndroGuiModelRoot | this_AndroDataModelRoot_3= ruleAndroDataModelRoot | this_AndroResModelRoot_4= ruleAndroResModelRoot )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 53:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:161:5: this_AndroGenModelRoot_0= ruleAndroGenModelRoot
                    {
                     
                            newCompositeNode(grammarAccess.getModelRootAccess().getAndroGenModelRootParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAndroGenModelRoot_in_ruleModelRoot282);
                    this_AndroGenModelRoot_0=ruleAndroGenModelRoot();

                    state._fsp--;

                     
                            current = this_AndroGenModelRoot_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:171:5: this_AndroidApplication_1= ruleAndroidApplication
                    {
                     
                            newCompositeNode(grammarAccess.getModelRootAccess().getAndroidApplicationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAndroidApplication_in_ruleModelRoot309);
                    this_AndroidApplication_1=ruleAndroidApplication();

                    state._fsp--;

                     
                            current = this_AndroidApplication_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:181:5: this_AndroGuiModelRoot_2= ruleAndroGuiModelRoot
                    {
                     
                            newCompositeNode(grammarAccess.getModelRootAccess().getAndroGuiModelRootParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAndroGuiModelRoot_in_ruleModelRoot336);
                    this_AndroGuiModelRoot_2=ruleAndroGuiModelRoot();

                    state._fsp--;

                     
                            current = this_AndroGuiModelRoot_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:191:5: this_AndroDataModelRoot_3= ruleAndroDataModelRoot
                    {
                     
                            newCompositeNode(grammarAccess.getModelRootAccess().getAndroDataModelRootParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAndroDataModelRoot_in_ruleModelRoot363);
                    this_AndroDataModelRoot_3=ruleAndroDataModelRoot();

                    state._fsp--;

                     
                            current = this_AndroDataModelRoot_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:201:5: this_AndroResModelRoot_4= ruleAndroResModelRoot
                    {
                     
                            newCompositeNode(grammarAccess.getModelRootAccess().getAndroResModelRootParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAndroResModelRoot_in_ruleModelRoot390);
                    this_AndroResModelRoot_4=ruleAndroResModelRoot();

                    state._fsp--;

                     
                            current = this_AndroResModelRoot_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelRoot"


    // $ANTLR start "entryRuleImport"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:217:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:218:2: (iv_ruleImport= ruleImport EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:219:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport425);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:226:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:229:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:230:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:230:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:230:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport472); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:234:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:235:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:235:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:236:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport493);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:260:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:261:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:262:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName530);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:269:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:272:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:273:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName581); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:280:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:281:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName600); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName615); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:301:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:302:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:303:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard663);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:310:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:313:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:315:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard721);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:325:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:326:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard753); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleAndroGenModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:345:1: entryRuleAndroGenModelRoot returns [EObject current=null] : iv_ruleAndroGenModelRoot= ruleAndroGenModelRoot EOF ;
    public final EObject entryRuleAndroGenModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroGenModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:346:2: (iv_ruleAndroGenModelRoot= ruleAndroGenModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:347:2: iv_ruleAndroGenModelRoot= ruleAndroGenModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroGenModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroGenModelRoot_in_entryRuleAndroGenModelRoot795);
            iv_ruleAndroGenModelRoot=ruleAndroGenModelRoot();

            state._fsp--;

             current =iv_ruleAndroGenModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroGenModelRoot805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroGenModelRoot"


    // $ANTLR start "ruleAndroGenModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:354:1: ruleAndroGenModelRoot returns [EObject current=null] : (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_targetApplications_3_0= ruleTargetApplication ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroGenModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_targetApplications_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:357:28: ( (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_targetApplications_3_0= ruleTargetApplication ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:358:1: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_targetApplications_3_0= ruleTargetApplication ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:358:1: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_targetApplications_3_0= ruleTargetApplication ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:358:3: otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_targetApplications_3_0= ruleTargetApplication ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAndroGenModelRoot842); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroGenModelRootAccess().getGeneratorKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:362:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:363:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:363:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:364:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroGenModelRoot859); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndroGenModelRootAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroGenModelRootRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroGenModelRoot876); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroGenModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:384:1: ( (lv_targetApplications_3_0= ruleTargetApplication ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:385:1: (lv_targetApplications_3_0= ruleTargetApplication )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:385:1: (lv_targetApplications_3_0= ruleTargetApplication )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:386:3: lv_targetApplications_3_0= ruleTargetApplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroGenModelRootAccess().getTargetApplicationsTargetApplicationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTargetApplication_in_ruleAndroGenModelRoot897);
            	    lv_targetApplications_3_0=ruleTargetApplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroGenModelRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"targetApplications",
            	            		lv_targetApplications_3_0, 
            	            		"TargetApplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroGenModelRoot910); 

                	newLeafNode(otherlv_4, grammarAccess.getAndroGenModelRootAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroGenModelRoot"


    // $ANTLR start "entryRuleTargetApplication"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:414:1: entryRuleTargetApplication returns [EObject current=null] : iv_ruleTargetApplication= ruleTargetApplication EOF ;
    public final EObject entryRuleTargetApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetApplication = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:415:2: (iv_ruleTargetApplication= ruleTargetApplication EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:416:2: iv_ruleTargetApplication= ruleTargetApplication EOF
            {
             newCompositeNode(grammarAccess.getTargetApplicationRule()); 
            pushFollow(FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication946);
            iv_ruleTargetApplication=ruleTargetApplication();

            state._fsp--;

             current =iv_ruleTargetApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetApplication956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetApplication"


    // $ANTLR start "ruleTargetApplication"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:423:1: ruleTargetApplication returns [EObject current=null] : (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= '}' ) ) ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_version_10_0=null;
        AntlrDatatypeRuleToken lv_projectName_4_0 = null;

        AntlrDatatypeRuleToken lv_packageName_6_0 = null;

        Enumerator lv_target_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:426:28: ( (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= '}' ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:1: (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= '}' ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:1: (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= '}' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:3: otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTargetApplication993); 

                	newLeafNode(otherlv_0, grammarAccess.getTargetApplicationAccess().getTargetKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:431:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:432:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:432:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:433:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTargetApplicationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getApplicationAndroidApplicationCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTargetApplication1016);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTargetApplication1028); 

                	newLeafNode(otherlv_2, grammarAccess.getTargetApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTargetApplication1040); 

                	newLeafNode(otherlv_3, grammarAccess.getTargetApplicationAccess().getProjectKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:454:1: ( (lv_projectName_4_0= ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:455:1: (lv_projectName_4_0= ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:455:1: (lv_projectName_4_0= ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:456:3: lv_projectName_4_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getProjectNameQualifiedNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTargetApplication1061);
            lv_projectName_4_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"projectName",
                    		lv_projectName_4_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:472:2: (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:472:4: otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) )
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleTargetApplication1074); 

                        	newLeafNode(otherlv_5, grammarAccess.getTargetApplicationAccess().getPackageKeyword_5_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:476:1: ( (lv_packageName_6_0= ruleAndroidPackageName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:477:1: (lv_packageName_6_0= ruleAndroidPackageName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:477:1: (lv_packageName_6_0= ruleAndroidPackageName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:478:3: lv_packageName_6_0= ruleAndroidPackageName
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getPackageNameAndroidPackageNameParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAndroidPackageName_in_ruleTargetApplication1095);
                    lv_packageName_6_0=ruleAndroidPackageName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetApplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"packageName",
                            		lv_packageName_6_0, 
                            		"AndroidPackageName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTargetApplication1109); 

                	newLeafNode(otherlv_7, grammarAccess.getTargetApplicationAccess().getPlatformKeyword_6());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:498:1: ( (lv_target_8_0= ruleApiLevel ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:499:1: (lv_target_8_0= ruleApiLevel )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:499:1: (lv_target_8_0= ruleApiLevel )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:500:3: lv_target_8_0= ruleApiLevel
            {
             
            	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getTargetApiLevelEnumRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleApiLevel_in_ruleTargetApplication1130);
            lv_target_8_0=ruleApiLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_8_0, 
                    		"ApiLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleTargetApplication1142); 

                	newLeafNode(otherlv_9, grammarAccess.getTargetApplicationAccess().getVersionKeyword_8());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:520:1: ( (lv_version_10_0= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:521:1: (lv_version_10_0= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:521:1: (lv_version_10_0= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:522:3: lv_version_10_0= '}'
            {
            lv_version_10_0=(Token)match(input,18,FOLLOW_18_in_ruleTargetApplication1160); 

                    newLeafNode(lv_version_10_0, grammarAccess.getTargetApplicationAccess().getVersionRightCurlyBracketKeyword_9_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTargetApplicationRule());
            	        }
                   		setWithLastConsumed(current, "version", lv_version_10_0, "}");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetApplication"


    // $ANTLR start "entryRuleAndroidPackageName"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:543:1: entryRuleAndroidPackageName returns [String current=null] : iv_ruleAndroidPackageName= ruleAndroidPackageName EOF ;
    public final String entryRuleAndroidPackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndroidPackageName = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:544:2: (iv_ruleAndroidPackageName= ruleAndroidPackageName EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:545:2: iv_ruleAndroidPackageName= ruleAndroidPackageName EOF
            {
             newCompositeNode(grammarAccess.getAndroidPackageNameRule()); 
            pushFollow(FOLLOW_ruleAndroidPackageName_in_entryRuleAndroidPackageName1210);
            iv_ruleAndroidPackageName=ruleAndroidPackageName();

            state._fsp--;

             current =iv_ruleAndroidPackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidPackageName1221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroidPackageName"


    // $ANTLR start "ruleAndroidPackageName"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:552:1: ruleAndroidPackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleAndroidPackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:555:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:556:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:556:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:556:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidPackageName1261); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAndroidPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:563:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:564:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleAndroidPackageName1280); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAndroidPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidPackageName1295); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getAndroidPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroidPackageName"


    // $ANTLR start "entryRuleAndroidApplication"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:584:1: entryRuleAndroidApplication returns [EObject current=null] : iv_ruleAndroidApplication= ruleAndroidApplication EOF ;
    public final EObject entryRuleAndroidApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidApplication = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:585:2: (iv_ruleAndroidApplication= ruleAndroidApplication EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:586:2: iv_ruleAndroidApplication= ruleAndroidApplication EOF
            {
             newCompositeNode(grammarAccess.getAndroidApplicationRule()); 
            pushFollow(FOLLOW_ruleAndroidApplication_in_entryRuleAndroidApplication1342);
            iv_ruleAndroidApplication=ruleAndroidApplication();

            state._fsp--;

             current =iv_ruleAndroidApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidApplication1352); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroidApplication"


    // $ANTLR start "ruleAndroidApplication"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:593:1: ruleAndroidApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleAndroidApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_mainActivity_5_0 = null;

        EObject lv_modelElements_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:596:28: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:597:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:597:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:597:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAndroidApplication1389); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroidApplicationAccess().getApplicationKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:601:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:602:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:602:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:603:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidApplication1406); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndroidApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroidApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroidApplication1423); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroidApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAndroidApplication1435); 

                	newLeafNode(otherlv_3, grammarAccess.getAndroidApplicationAccess().getDatamodelKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:627:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:628:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:628:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:629:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroidApplicationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getDatarootAndroDataModelRootCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAndroidApplication1458);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:642:2: ( (lv_mainActivity_5_0= ruleActivity ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:643:1: (lv_mainActivity_5_0= ruleActivity )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:643:1: (lv_mainActivity_5_0= ruleActivity )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:644:3: lv_mainActivity_5_0= ruleActivity
            {
             
            	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getMainActivityActivityParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleActivity_in_ruleAndroidApplication1479);
            lv_mainActivity_5_0=ruleActivity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndroidApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"mainActivity",
                    		lv_mainActivity_5_0, 
                    		"Activity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:660:2: ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:661:1: (lv_modelElements_6_0= ruleAndroidApplicationModelElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:661:1: (lv_modelElements_6_0= ruleAndroidApplicationModelElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:662:3: lv_modelElements_6_0= ruleAndroidApplicationModelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getModelElementsAndroidApplicationModelElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndroidApplicationModelElement_in_ruleAndroidApplication1500);
            	    lv_modelElements_6_0=ruleAndroidApplicationModelElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroidApplicationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelElements",
            	            		lv_modelElements_6_0, 
            	            		"AndroidApplicationModelElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleAndroidApplication1513); 

                	newLeafNode(otherlv_7, grammarAccess.getAndroidApplicationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroidApplication"


    // $ANTLR start "entryRuleAndroidApplicationModelElement"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:690:1: entryRuleAndroidApplicationModelElement returns [EObject current=null] : iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF ;
    public final EObject entryRuleAndroidApplicationModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidApplicationModelElement = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:691:2: (iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:692:2: iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF
            {
             newCompositeNode(grammarAccess.getAndroidApplicationModelElementRule()); 
            pushFollow(FOLLOW_ruleAndroidApplicationModelElement_in_entryRuleAndroidApplicationModelElement1549);
            iv_ruleAndroidApplicationModelElement=ruleAndroidApplicationModelElement();

            state._fsp--;

             current =iv_ruleAndroidApplicationModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidApplicationModelElement1559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroidApplicationModelElement"


    // $ANTLR start "ruleAndroidApplicationModelElement"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:699:1: ruleAndroidApplicationModelElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity ) ;
    public final EObject ruleAndroidApplicationModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_TabActivity_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:702:28: ( (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:703:1: (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:703:1: (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:704:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getAndroidApplicationModelElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleAndroidApplicationModelElement1606);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:714:5: this_TabActivity_1= ruleTabActivity
                    {
                     
                            newCompositeNode(grammarAccess.getAndroidApplicationModelElementAccess().getTabActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTabActivity_in_ruleAndroidApplicationModelElement1633);
                    this_TabActivity_1=ruleTabActivity();

                    state._fsp--;

                     
                            current = this_TabActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroidApplicationModelElement"


    // $ANTLR start "entryRuleActivity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:730:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:731:2: (iv_ruleActivity= ruleActivity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:732:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1668);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1678); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:739:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:742:28: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:743:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:743:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:743:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleActivity1715); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:747:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:748:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:748:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:749:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1732); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleActivity1749); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLayoutKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:769:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:770:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:770:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:771:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getLayoutRootLayoutCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity1772);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleTabActivity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:792:1: entryRuleTabActivity returns [EObject current=null] : iv_ruleTabActivity= ruleTabActivity EOF ;
    public final EObject entryRuleTabActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabActivity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:793:2: (iv_ruleTabActivity= ruleTabActivity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:794:2: iv_ruleTabActivity= ruleTabActivity EOF
            {
             newCompositeNode(grammarAccess.getTabActivityRule()); 
            pushFollow(FOLLOW_ruleTabActivity_in_entryRuleTabActivity1808);
            iv_ruleTabActivity=ruleTabActivity();

            state._fsp--;

             current =iv_ruleTabActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabActivity1818); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTabActivity"


    // $ANTLR start "ruleTabActivity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:801:1: ruleTabActivity returns [EObject current=null] : (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTabActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:804:28: ( (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:805:1: (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:805:1: (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:805:3: otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleTabActivity1855); 

                	newLeafNode(otherlv_0, grammarAccess.getTabActivityAccess().getTabactivityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:809:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:810:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:810:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:811:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabActivity1872); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTabActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTabActivity"


    // $ANTLR start "entryRuleAndroDataModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:835:1: entryRuleAndroDataModelRoot returns [EObject current=null] : iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF ;
    public final EObject entryRuleAndroDataModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroDataModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:836:2: (iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:837:2: iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroDataModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroDataModelRoot_in_entryRuleAndroDataModelRoot1913);
            iv_ruleAndroDataModelRoot=ruleAndroDataModelRoot();

            state._fsp--;

             current =iv_ruleAndroDataModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroDataModelRoot1923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroDataModelRoot"


    // $ANTLR start "ruleAndroDataModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:844:1: ruleAndroDataModelRoot returns [EObject current=null] : (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroDataModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:847:28: ( (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:848:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:848:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:848:3: otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAndroDataModelRoot1960); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroDataModelRootAccess().getDatamodelKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:852:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:853:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:853:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:854:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroDataModelRoot1977); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndroDataModelRootAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroDataModelRootRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroDataModelRoot1994); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroDataModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:874:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:875:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:875:1: (lv_entities_3_0= ruleEntity )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:876:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroDataModelRootAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleAndroDataModelRoot2015);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroDataModelRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_3_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroDataModelRoot2028); 

                	newLeafNode(otherlv_4, grammarAccess.getAndroDataModelRootAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroDataModelRoot"


    // $ANTLR start "entryRuleEntity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:904:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:905:2: (iv_ruleEntity= ruleEntity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:906:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2064);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2074); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:913:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:916:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:917:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:917:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:917:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleEntity2111); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:922:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:922:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2128); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:939:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:939:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleEntity2146); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:943:1: ( (otherlv_3= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:944:1: (otherlv_3= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:944:1: (otherlv_3= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:945:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2166); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEntity2180); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:960:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:961:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:961:1: (lv_properties_5_0= ruleProperty )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:962:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2201);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEntity2214); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:990:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:991:2: (iv_ruleProperty= ruleProperty EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:992:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2250);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:999:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1002:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1003:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1003:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1003:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1003:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1004:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1004:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1005:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2302); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleProperty2319); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1025:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1026:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1026:1: (lv_type_2_0= ruleTypeRef )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1027:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleProperty2340);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTypeRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1051:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1052:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1053:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2376);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1060:1: ruleTypeRef returns [EObject current=null] : (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypesRef_0 = null;

        EObject this_EntityTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1063:28: ( (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1064:1: (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1064:1: (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=73 && LA14_0<=76)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1065:5: this_DataTypesRef_0= ruleDataTypesRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getDataTypesRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataTypesRef_in_ruleTypeRef2433);
                    this_DataTypesRef_0=ruleDataTypesRef();

                    state._fsp--;

                     
                            current = this_DataTypesRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1075:5: this_EntityTypeRef_1= ruleEntityTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getEntityTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityTypeRef_in_ruleTypeRef2460);
                    this_EntityTypeRef_1=ruleEntityTypeRef();

                    state._fsp--;

                     
                            current = this_EntityTypeRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleDataTypesRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1091:1: entryRuleDataTypesRef returns [EObject current=null] : iv_ruleDataTypesRef= ruleDataTypesRef EOF ;
    public final EObject entryRuleDataTypesRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypesRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1092:2: (iv_ruleDataTypesRef= ruleDataTypesRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1093:2: iv_ruleDataTypesRef= ruleDataTypesRef EOF
            {
             newCompositeNode(grammarAccess.getDataTypesRefRule()); 
            pushFollow(FOLLOW_ruleDataTypesRef_in_entryRuleDataTypesRef2495);
            iv_ruleDataTypesRef=ruleDataTypesRef();

            state._fsp--;

             current =iv_ruleDataTypesRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypesRef2505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypesRef"


    // $ANTLR start "ruleDataTypesRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1100:1: ruleDataTypesRef returns [EObject current=null] : ( (lv_type_0_0= ruleDataTypes ) ) ;
    public final EObject ruleDataTypesRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1103:28: ( ( (lv_type_0_0= ruleDataTypes ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1104:1: ( (lv_type_0_0= ruleDataTypes ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1104:1: ( (lv_type_0_0= ruleDataTypes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1105:1: (lv_type_0_0= ruleDataTypes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1105:1: (lv_type_0_0= ruleDataTypes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1106:3: lv_type_0_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypesRefAccess().getTypeDataTypesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleDataTypesRef2550);
            lv_type_0_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypesRefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypesRef"


    // $ANTLR start "entryRuleEntityTypeRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1130:1: entryRuleEntityTypeRef returns [EObject current=null] : iv_ruleEntityTypeRef= ruleEntityTypeRef EOF ;
    public final EObject entryRuleEntityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1131:2: (iv_ruleEntityTypeRef= ruleEntityTypeRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1132:2: iv_ruleEntityTypeRef= ruleEntityTypeRef EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRefRule()); 
            pushFollow(FOLLOW_ruleEntityTypeRef_in_entryRuleEntityTypeRef2585);
            iv_ruleEntityTypeRef=ruleEntityTypeRef();

            state._fsp--;

             current =iv_ruleEntityTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityTypeRef2595); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTypeRef"


    // $ANTLR start "ruleEntityTypeRef"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1139:1: ruleEntityTypeRef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleEntityTypeRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1142:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1143:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1143:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1144:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1144:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1145:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityTypeRefAccess().getTypeEntityCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntityTypeRef2642);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTypeRef"


    // $ANTLR start "entryRuleAndroGuiModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1166:1: entryRuleAndroGuiModelRoot returns [EObject current=null] : iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF ;
    public final EObject entryRuleAndroGuiModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroGuiModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1167:2: (iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1168:2: iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroGuiModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroGuiModelRoot_in_entryRuleAndroGuiModelRoot2677);
            iv_ruleAndroGuiModelRoot=ruleAndroGuiModelRoot();

            state._fsp--;

             current =iv_ruleAndroGuiModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroGuiModelRoot2687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroGuiModelRoot"


    // $ANTLR start "ruleAndroGuiModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1175:1: ruleAndroGuiModelRoot returns [EObject current=null] : (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroGuiModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rootLayout_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1178:28: ( (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1179:1: (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1179:1: (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1179:3: otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAndroGuiModelRoot2724); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroGuiModelRootAccess().getGuimodelKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1183:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1184:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1184:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1185:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroGuiModelRoot2741); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndroGuiModelRootAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroGuiModelRootRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroGuiModelRoot2758); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroGuiModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1205:1: ( (lv_rootLayout_3_0= ruleRootLayout ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)||(LA15_0>=36 && LA15_0<=37)||LA15_0==52) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1206:1: (lv_rootLayout_3_0= ruleRootLayout )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1206:1: (lv_rootLayout_3_0= ruleRootLayout )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1207:3: lv_rootLayout_3_0= ruleRootLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroGuiModelRootAccess().getRootLayoutRootLayoutParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRootLayout_in_ruleAndroGuiModelRoot2779);
            	    lv_rootLayout_3_0=ruleRootLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroGuiModelRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rootLayout",
            	            		lv_rootLayout_3_0, 
            	            		"RootLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroGuiModelRoot2792); 

                	newLeafNode(otherlv_4, grammarAccess.getAndroGuiModelRootAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroGuiModelRoot"


    // $ANTLR start "entryRuleUIElement"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1235:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1236:2: (iv_ruleUIElement= ruleUIElement EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1237:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement2828);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement2838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1244:1: ruleUIElement returns [EObject current=null] : (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Widget_0 = null;

        EObject this_Layout_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1247:28: ( (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1248:1: (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1248:1: (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=38 && LA16_0<=41)||(LA16_0>=44 && LA16_0<=48)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=32 && LA16_0<=33)||(LA16_0>=36 && LA16_0<=37)||LA16_0==52) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1249:5: this_Widget_0= ruleWidget
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getWidgetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWidget_in_ruleUIElement2885);
                    this_Widget_0=ruleWidget();

                    state._fsp--;

                     
                            current = this_Widget_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1259:5: this_Layout_1= ruleLayout
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLayout_in_ruleUIElement2912);
                    this_Layout_1=ruleLayout();

                    state._fsp--;

                     
                            current = this_Layout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1275:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1276:2: (iv_ruleLayout= ruleLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1277:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout2947);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout2957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1284:1: ruleLayout returns [EObject current=null] : this_RootLayout_0= ruleRootLayout ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_RootLayout_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1287:28: (this_RootLayout_0= ruleRootLayout )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1289:5: this_RootLayout_0= ruleRootLayout
            {
             
                    newCompositeNode(grammarAccess.getLayoutAccess().getRootLayoutParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRootLayout_in_ruleLayout3003);
            this_RootLayout_0=ruleRootLayout();

            state._fsp--;

             
                    current = this_RootLayout_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleRootLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1305:1: entryRuleRootLayout returns [EObject current=null] : iv_ruleRootLayout= ruleRootLayout EOF ;
    public final EObject entryRuleRootLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1306:2: (iv_ruleRootLayout= ruleRootLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1307:2: iv_ruleRootLayout= ruleRootLayout EOF
            {
             newCompositeNode(grammarAccess.getRootLayoutRule()); 
            pushFollow(FOLLOW_ruleRootLayout_in_entryRuleRootLayout3037);
            iv_ruleRootLayout=ruleRootLayout();

            state._fsp--;

             current =iv_ruleRootLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootLayout3047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootLayout"


    // $ANTLR start "ruleRootLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1314:1: ruleRootLayout returns [EObject current=null] : (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen ) ;
    public final EObject ruleRootLayout() throws RecognitionException {
        EObject current = null;

        EObject this_BaseLayout_0 = null;

        EObject this_PreferenceScreen_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1317:28: ( (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1318:1: (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1318:1: (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=32 && LA17_0<=33)||(LA17_0>=36 && LA17_0<=37)) ) {
                alt17=1;
            }
            else if ( (LA17_0==52) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1319:5: this_BaseLayout_0= ruleBaseLayout
                    {
                     
                            newCompositeNode(grammarAccess.getRootLayoutAccess().getBaseLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseLayout_in_ruleRootLayout3094);
                    this_BaseLayout_0=ruleBaseLayout();

                    state._fsp--;

                     
                            current = this_BaseLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1329:5: this_PreferenceScreen_1= rulePreferenceScreen
                    {
                     
                            newCompositeNode(grammarAccess.getRootLayoutAccess().getPreferenceScreenParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePreferenceScreen_in_ruleRootLayout3121);
                    this_PreferenceScreen_1=rulePreferenceScreen();

                    state._fsp--;

                     
                            current = this_PreferenceScreen_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootLayout"


    // $ANTLR start "entryRuleBaseLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1345:1: entryRuleBaseLayout returns [EObject current=null] : iv_ruleBaseLayout= ruleBaseLayout EOF ;
    public final EObject entryRuleBaseLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1346:2: (iv_ruleBaseLayout= ruleBaseLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1347:2: iv_ruleBaseLayout= ruleBaseLayout EOF
            {
             newCompositeNode(grammarAccess.getBaseLayoutRule()); 
            pushFollow(FOLLOW_ruleBaseLayout_in_entryRuleBaseLayout3156);
            iv_ruleBaseLayout=ruleBaseLayout();

            state._fsp--;

             current =iv_ruleBaseLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseLayout3166); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseLayout"


    // $ANTLR start "ruleBaseLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1354:1: ruleBaseLayout returns [EObject current=null] : (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout ) ;
    public final EObject ruleBaseLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LinearLayout_0 = null;

        EObject this_AbsoluteLayout_1 = null;

        EObject this_FrameLayout_2 = null;

        EObject this_RelativeLayout_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1357:28: ( (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1358:1: (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1358:1: (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1359:5: this_LinearLayout_0= ruleLinearLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getLinearLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinearLayout_in_ruleBaseLayout3213);
                    this_LinearLayout_0=ruleLinearLayout();

                    state._fsp--;

                     
                            current = this_LinearLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1369:5: this_AbsoluteLayout_1= ruleAbsoluteLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getAbsoluteLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbsoluteLayout_in_ruleBaseLayout3240);
                    this_AbsoluteLayout_1=ruleAbsoluteLayout();

                    state._fsp--;

                     
                            current = this_AbsoluteLayout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1379:5: this_FrameLayout_2= ruleFrameLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getFrameLayoutParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFrameLayout_in_ruleBaseLayout3267);
                    this_FrameLayout_2=ruleFrameLayout();

                    state._fsp--;

                     
                            current = this_FrameLayout_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1389:5: this_RelativeLayout_3= ruleRelativeLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getRelativeLayoutParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRelativeLayout_in_ruleBaseLayout3294);
                    this_RelativeLayout_3=ruleRelativeLayout();

                    state._fsp--;

                     
                            current = this_RelativeLayout_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseLayout"


    // $ANTLR start "entryRuleAbsoluteLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1405:1: entryRuleAbsoluteLayout returns [EObject current=null] : iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF ;
    public final EObject entryRuleAbsoluteLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1406:2: (iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1407:2: iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteLayoutRule()); 
            pushFollow(FOLLOW_ruleAbsoluteLayout_in_entryRuleAbsoluteLayout3329);
            iv_ruleAbsoluteLayout=ruleAbsoluteLayout();

            state._fsp--;

             current =iv_ruleAbsoluteLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteLayout3339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbsoluteLayout"


    // $ANTLR start "ruleAbsoluteLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1414:1: ruleAbsoluteLayout returns [EObject current=null] : (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleAbsoluteLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_layoutStyle_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1417:28: ( (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1418:1: (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1418:1: (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1418:3: otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAbsoluteLayout3376); 

                	newLeafNode(otherlv_0, grammarAccess.getAbsoluteLayoutAccess().getAbsolutelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1422:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1423:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1423:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1424:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbsoluteLayout3393); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getAbsoluteLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbsoluteLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1440:3: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1441:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1441:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1442:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getAbsoluteLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleAbsoluteLayout3420);
            lv_layoutStyle_2_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbsoluteLayoutRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_2_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAbsoluteLayout3432); 

                	newLeafNode(otherlv_3, grammarAccess.getAbsoluteLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1462:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=32 && LA20_0<=33)||(LA20_0>=36 && LA20_0<=41)||(LA20_0>=44 && LA20_0<=48)||LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1463:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1463:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1464:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbsoluteLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleAbsoluteLayout3453);
            	    lv_elements_4_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAbsoluteLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleAbsoluteLayout3466); 

                	newLeafNode(otherlv_5, grammarAccess.getAbsoluteLayoutAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbsoluteLayout"


    // $ANTLR start "entryRuleLinearLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1492:1: entryRuleLinearLayout returns [EObject current=null] : iv_ruleLinearLayout= ruleLinearLayout EOF ;
    public final EObject entryRuleLinearLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1493:2: (iv_ruleLinearLayout= ruleLinearLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1494:2: iv_ruleLinearLayout= ruleLinearLayout EOF
            {
             newCompositeNode(grammarAccess.getLinearLayoutRule()); 
            pushFollow(FOLLOW_ruleLinearLayout_in_entryRuleLinearLayout3502);
            iv_ruleLinearLayout=ruleLinearLayout();

            state._fsp--;

             current =iv_ruleLinearLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearLayout3512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinearLayout"


    // $ANTLR start "ruleLinearLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1501:1: ruleLinearLayout returns [EObject current=null] : (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleLinearLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_orientation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_layoutStyle_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1504:28: ( (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1505:1: (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1505:1: (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1505:3: otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLinearLayout3549); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearLayoutAccess().getLinearlayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1509:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1510:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1510:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1511:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinearLayout3566); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getLinearLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinearLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1527:3: ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            else if ( (LA22_0==35) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1527:4: ( (lv_orientation_2_0= 'horizontal' ) )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1527:4: ( (lv_orientation_2_0= 'horizontal' ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1528:1: (lv_orientation_2_0= 'horizontal' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1528:1: (lv_orientation_2_0= 'horizontal' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1529:3: lv_orientation_2_0= 'horizontal'
                    {
                    lv_orientation_2_0=(Token)match(input,34,FOLLOW_34_in_ruleLinearLayout3591); 

                            newLeafNode(lv_orientation_2_0, grammarAccess.getLinearLayoutAccess().getOrientationHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinearLayoutRule());
                    	        }
                           		setWithLastConsumed(current, "orientation", true, "horizontal");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1543:7: otherlv_3= 'vertical'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleLinearLayout3622); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinearLayoutAccess().getVerticalKeyword_2_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1547:3: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1548:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1548:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1549:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getLinearLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleLinearLayout3645);
            lv_layoutStyle_4_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearLayoutRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_4_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleLinearLayout3657); 

                	newLeafNode(otherlv_5, grammarAccess.getLinearLayoutAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1569:1: ( (lv_elements_6_0= ruleUIElement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=32 && LA23_0<=33)||(LA23_0>=36 && LA23_0<=41)||(LA23_0>=44 && LA23_0<=48)||LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1570:1: (lv_elements_6_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1570:1: (lv_elements_6_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1571:3: lv_elements_6_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinearLayoutAccess().getElementsUIElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleLinearLayout3678);
            	    lv_elements_6_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinearLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_6_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleLinearLayout3691); 

                	newLeafNode(otherlv_7, grammarAccess.getLinearLayoutAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinearLayout"


    // $ANTLR start "entryRuleFrameLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1599:1: entryRuleFrameLayout returns [EObject current=null] : iv_ruleFrameLayout= ruleFrameLayout EOF ;
    public final EObject entryRuleFrameLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrameLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1600:2: (iv_ruleFrameLayout= ruleFrameLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1601:2: iv_ruleFrameLayout= ruleFrameLayout EOF
            {
             newCompositeNode(grammarAccess.getFrameLayoutRule()); 
            pushFollow(FOLLOW_ruleFrameLayout_in_entryRuleFrameLayout3727);
            iv_ruleFrameLayout=ruleFrameLayout();

            state._fsp--;

             current =iv_ruleFrameLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameLayout3737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrameLayout"


    // $ANTLR start "ruleFrameLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1608:1: ruleFrameLayout returns [EObject current=null] : (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleFrameLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_layoutStyle_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1611:28: ( (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1612:1: (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1612:1: (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1612:3: otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFrameLayout3774); 

                	newLeafNode(otherlv_0, grammarAccess.getFrameLayoutAccess().getFramelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1616:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1617:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1617:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1618:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrameLayout3791); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getFrameLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFrameLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1634:3: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1635:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1635:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1636:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getFrameLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleFrameLayout3818);
            lv_layoutStyle_2_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFrameLayoutRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_2_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFrameLayout3830); 

                	newLeafNode(otherlv_3, grammarAccess.getFrameLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1656:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=32 && LA25_0<=33)||(LA25_0>=36 && LA25_0<=41)||(LA25_0>=44 && LA25_0<=48)||LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1657:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1657:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1658:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleFrameLayout3851);
            	    lv_elements_4_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFrameLayout3864); 

                	newLeafNode(otherlv_5, grammarAccess.getFrameLayoutAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameLayout"


    // $ANTLR start "entryRuleRelativeLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1686:1: entryRuleRelativeLayout returns [EObject current=null] : iv_ruleRelativeLayout= ruleRelativeLayout EOF ;
    public final EObject entryRuleRelativeLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1687:2: (iv_ruleRelativeLayout= ruleRelativeLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1688:2: iv_ruleRelativeLayout= ruleRelativeLayout EOF
            {
             newCompositeNode(grammarAccess.getRelativeLayoutRule()); 
            pushFollow(FOLLOW_ruleRelativeLayout_in_entryRuleRelativeLayout3900);
            iv_ruleRelativeLayout=ruleRelativeLayout();

            state._fsp--;

             current =iv_ruleRelativeLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeLayout3910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeLayout"


    // $ANTLR start "ruleRelativeLayout"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1695:1: ruleRelativeLayout returns [EObject current=null] : (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelativeLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_layoutStyle_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1698:28: ( (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1699:1: (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1699:1: (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1699:3: otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) )? ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleRelativeLayout3947); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeLayoutAccess().getRelativelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1703:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1704:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1704:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1705:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelativeLayout3964); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getRelativeLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelativeLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1721:3: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1722:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1722:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1723:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRelativeLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRelativeLayout3991);
            lv_layoutStyle_2_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeLayoutRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_2_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRelativeLayout4003); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1743:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=33)||(LA27_0>=36 && LA27_0<=41)||(LA27_0>=44 && LA27_0<=48)||LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1744:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1744:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1745:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativeLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleRelativeLayout4024);
            	    lv_elements_4_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelativeLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRelativeLayout4037); 

                	newLeafNode(otherlv_5, grammarAccess.getRelativeLayoutAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeLayout"


    // $ANTLR start "entryRuleWidget"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1773:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1774:2: (iv_ruleWidget= ruleWidget EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1775:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget4073);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget4083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1782:1: ruleWidget returns [EObject current=null] : (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_TextView_0 = null;

        EObject this_EditText_1 = null;

        EObject this_Button_2 = null;

        EObject this_ListView_3 = null;

        EObject this_Spinner_4 = null;

        EObject this_RadioGroup_5 = null;

        EObject this_CheckBox_6 = null;

        EObject this_RatingBar_7 = null;

        EObject this_ToggleButton_8 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1785:28: ( (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1786:1: (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1786:1: (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt28=1;
                }
                break;
            case 39:
                {
                alt28=2;
                }
                break;
            case 40:
                {
                alt28=3;
                }
                break;
            case 41:
                {
                alt28=4;
                }
                break;
            case 44:
                {
                alt28=5;
                }
                break;
            case 46:
                {
                alt28=6;
                }
                break;
            case 45:
                {
                alt28=7;
                }
                break;
            case 47:
                {
                alt28=8;
                }
                break;
            case 48:
                {
                alt28=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1787:5: this_TextView_0= ruleTextView
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextView_in_ruleWidget4130);
                    this_TextView_0=ruleTextView();

                    state._fsp--;

                     
                            current = this_TextView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1797:5: this_EditText_1= ruleEditText
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEditText_in_ruleWidget4157);
                    this_EditText_1=ruleEditText();

                    state._fsp--;

                     
                            current = this_EditText_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1807:5: this_Button_2= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleWidget4184);
                    this_Button_2=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1817:5: this_ListView_3= ruleListView
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getListViewParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleListView_in_ruleWidget4211);
                    this_ListView_3=ruleListView();

                    state._fsp--;

                     
                            current = this_ListView_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1827:5: this_Spinner_4= ruleSpinner
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSpinner_in_ruleWidget4238);
                    this_Spinner_4=ruleSpinner();

                    state._fsp--;

                     
                            current = this_Spinner_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1837:5: this_RadioGroup_5= ruleRadioGroup
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getRadioGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadioGroup_in_ruleWidget4265);
                    this_RadioGroup_5=ruleRadioGroup();

                    state._fsp--;

                     
                            current = this_RadioGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1847:5: this_CheckBox_6= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCheckBoxParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleWidget4292);
                    this_CheckBox_6=ruleCheckBox();

                    state._fsp--;

                     
                            current = this_CheckBox_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1857:5: this_RatingBar_7= ruleRatingBar
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getRatingBarParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleRatingBar_in_ruleWidget4319);
                    this_RatingBar_7=ruleRatingBar();

                    state._fsp--;

                     
                            current = this_RatingBar_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1867:5: this_ToggleButton_8= ruleToggleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getToggleButtonParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleToggleButton_in_ruleWidget4346);
                    this_ToggleButton_8=ruleToggleButton();

                    state._fsp--;

                     
                            current = this_ToggleButton_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextView"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1883:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1884:2: (iv_ruleTextView= ruleTextView EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1885:2: iv_ruleTextView= ruleTextView EOF
            {
             newCompositeNode(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_ruleTextView_in_entryRuleTextView4381);
            iv_ruleTextView=ruleTextView();

            state._fsp--;

             current =iv_ruleTextView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextView4391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextView"


    // $ANTLR start "ruleTextView"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1892:1: ruleTextView returns [EObject current=null] : (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1895:28: ( (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1896:1: (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1896:1: (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1896:3: otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTextView4428); 

                	newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTextviewKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1900:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1901:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1901:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1902:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextView4445); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextViewRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1918:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1919:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1919:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1920:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextView4468); 

            			newLeafNode(lv_text_2_0, grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1936:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1937:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1937:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1938:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getTextViewAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleTextView4494);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextViewRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleEditText"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1962:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1963:2: (iv_ruleEditText= ruleEditText EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1964:2: iv_ruleEditText= ruleEditText EOF
            {
             newCompositeNode(grammarAccess.getEditTextRule()); 
            pushFollow(FOLLOW_ruleEditText_in_entryRuleEditText4530);
            iv_ruleEditText=ruleEditText();

            state._fsp--;

             current =iv_ruleEditText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditText4540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEditText"


    // $ANTLR start "ruleEditText"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1971:1: ruleEditText returns [EObject current=null] : (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1974:28: ( (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1975:1: (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1975:1: (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1975:3: otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEditText4577); 

                	newLeafNode(otherlv_0, grammarAccess.getEditTextAccess().getEdittextKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1979:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1980:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1980:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1981:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditText4594); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEditTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1997:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1998:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1998:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1999:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditText4617); 

            			newLeafNode(lv_text_2_0, grammarAccess.getEditTextAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2015:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2016:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2016:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2017:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getEditTextAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleEditText4643);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditTextRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEditText"


    // $ANTLR start "entryRuleButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2041:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2042:2: (iv_ruleButton= ruleButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2043:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton4679);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton4689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2050:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2053:28: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2054:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2054:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2054:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleButton4726); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2058:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2059:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2059:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2060:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton4743); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2076:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2077:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2077:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2078:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton4766); 

            			newLeafNode(lv_text_2_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2094:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2095:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2095:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2096:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleButton4792);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleListView"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2120:1: entryRuleListView returns [EObject current=null] : iv_ruleListView= ruleListView EOF ;
    public final EObject entryRuleListView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListView = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2121:2: (iv_ruleListView= ruleListView EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2122:2: iv_ruleListView= ruleListView EOF
            {
             newCompositeNode(grammarAccess.getListViewRule()); 
            pushFollow(FOLLOW_ruleListView_in_entryRuleListView4828);
            iv_ruleListView=ruleListView();

            state._fsp--;

             current =iv_ruleListView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListView4838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListView"


    // $ANTLR start "ruleListView"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2129:1: ruleListView returns [EObject current=null] : (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleListView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_layoutStyle_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2132:28: ( (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2133:1: (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2133:1: (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2133:3: otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleListView4875); 

                	newLeafNode(otherlv_0, grammarAccess.getListViewAccess().getListviewKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2137:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2138:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2138:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2139:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListView4892); 

            			newLeafNode(lv_name_1_0, grammarAccess.getListViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2155:2: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2156:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2156:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2157:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getListViewAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleListView4918);
            lv_layoutStyle_2_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListViewRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_2_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleListView4930); 

                	newLeafNode(otherlv_3, grammarAccess.getListViewAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2177:1: (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2177:3: otherlv_4= 'entries' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleListView4943); 

                        	newLeafNode(otherlv_4, grammarAccess.getListViewAccess().getEntriesKeyword_4_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2181:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2182:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2182:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2183:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getListViewAccess().getEntriesArrayResourceCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleListView4966);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2196:4: (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2196:6: otherlv_6= 'listitem' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleListView4981); 

                        	newLeafNode(otherlv_6, grammarAccess.getListViewAccess().getListitemKeyword_5_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2200:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2201:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2201:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2202:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getListViewAccess().getLayoutLayoutCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleListView5004);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleListView5018); 

                	newLeafNode(otherlv_8, grammarAccess.getListViewAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListView"


    // $ANTLR start "entryRuleSpinner"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2227:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2228:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2229:2: iv_ruleSpinner= ruleSpinner EOF
            {
             newCompositeNode(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_ruleSpinner_in_entryRuleSpinner5054);
            iv_ruleSpinner=ruleSpinner();

            state._fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinner5064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpinner"


    // $ANTLR start "ruleSpinner"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2236:1: ruleSpinner returns [EObject current=null] : (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_layoutStyle_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2239:28: ( (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2240:1: (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2240:1: (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2240:3: otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSpinner5101); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinnerAccess().getSpinnerKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2244:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2245:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2245:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2246:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinner5118); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2262:3: (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2262:5: otherlv_2= 'entries' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSpinner5137); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpinnerAccess().getEntriesKeyword_2_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2266:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2267:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2267:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2268:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinnerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSpinnerAccess().getEntriesResourceCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpinner5160);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2281:4: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2282:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2282:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2283:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getSpinnerAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleSpinner5183);
            lv_layoutStyle_4_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpinnerRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_4_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpinner"


    // $ANTLR start "entryRuleCheckBox"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2307:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2308:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2309:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox5219);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox5229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2316:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2319:28: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2320:1: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2320:1: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2320:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCheckBox5266); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckboxKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2324:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2325:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2325:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2326:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBox5283); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getCheckBoxAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2342:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2343:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2343:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2344:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckBox5306); 

            			newLeafNode(lv_text_2_0, grammarAccess.getCheckBoxAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2360:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2361:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2361:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2362:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getCheckBoxAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleCheckBox5332);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCheckBoxRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioGroup"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2386:1: entryRuleRadioGroup returns [EObject current=null] : iv_ruleRadioGroup= ruleRadioGroup EOF ;
    public final EObject entryRuleRadioGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioGroup = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2387:2: (iv_ruleRadioGroup= ruleRadioGroup EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2388:2: iv_ruleRadioGroup= ruleRadioGroup EOF
            {
             newCompositeNode(grammarAccess.getRadioGroupRule()); 
            pushFollow(FOLLOW_ruleRadioGroup_in_entryRuleRadioGroup5368);
            iv_ruleRadioGroup=ruleRadioGroup();

            state._fsp--;

             current =iv_ruleRadioGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioGroup5378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioGroup"


    // $ANTLR start "ruleRadioGroup"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2395:1: ruleRadioGroup returns [EObject current=null] : (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' ) ;
    public final EObject ruleRadioGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_orientation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_layoutStyle_4_0 = null;

        EObject lv_radiobuttons_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2398:28: ( (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2399:1: (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2399:1: (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2399:3: otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) )? ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleRadioGroup5415); 

                	newLeafNode(otherlv_0, grammarAccess.getRadioGroupAccess().getRadiogroupKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2403:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2404:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2404:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2405:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRadioGroup5432); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getRadioGroupAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2421:3: ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            else if ( (LA38_0==35) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2421:4: ( (lv_orientation_2_0= 'horizontal' ) )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2421:4: ( (lv_orientation_2_0= 'horizontal' ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2422:1: (lv_orientation_2_0= 'horizontal' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2422:1: (lv_orientation_2_0= 'horizontal' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2423:3: lv_orientation_2_0= 'horizontal'
                    {
                    lv_orientation_2_0=(Token)match(input,34,FOLLOW_34_in_ruleRadioGroup5457); 

                            newLeafNode(lv_orientation_2_0, grammarAccess.getRadioGroupAccess().getOrientationHorizontalKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioGroupRule());
                    	        }
                           		setWithLastConsumed(current, "orientation", true, "horizontal");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2437:7: otherlv_3= 'vertical'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRadioGroup5488); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadioGroupAccess().getVerticalKeyword_2_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2441:3: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2442:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2442:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2443:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRadioGroupAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRadioGroup5511);
            lv_layoutStyle_4_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRadioGroupRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_4_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleRadioGroup5523); 

                	newLeafNode(otherlv_5, grammarAccess.getRadioGroupAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2463:1: ( (lv_radiobuttons_6_0= ruleRadioButton ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==51) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2464:1: (lv_radiobuttons_6_0= ruleRadioButton )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2464:1: (lv_radiobuttons_6_0= ruleRadioButton )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2465:3: lv_radiobuttons_6_0= ruleRadioButton
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRadioGroupAccess().getRadiobuttonsRadioButtonParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRadioButton_in_ruleRadioGroup5544);
            	    lv_radiobuttons_6_0=ruleRadioButton();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRadioGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"radiobuttons",
            	            		lv_radiobuttons_6_0, 
            	            		"RadioButton");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRadioGroup5557); 

                	newLeafNode(otherlv_7, grammarAccess.getRadioGroupAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioGroup"


    // $ANTLR start "entryRuleRatingBar"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2493:1: entryRuleRatingBar returns [EObject current=null] : iv_ruleRatingBar= ruleRatingBar EOF ;
    public final EObject entryRuleRatingBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingBar = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2494:2: (iv_ruleRatingBar= ruleRatingBar EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2495:2: iv_ruleRatingBar= ruleRatingBar EOF
            {
             newCompositeNode(grammarAccess.getRatingBarRule()); 
            pushFollow(FOLLOW_ruleRatingBar_in_entryRuleRatingBar5593);
            iv_ruleRatingBar=ruleRatingBar();

            state._fsp--;

             current =iv_ruleRatingBar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRatingBar5603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRatingBar"


    // $ANTLR start "ruleRatingBar"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2502:1: ruleRatingBar returns [EObject current=null] : (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) )? ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleRatingBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_numStars_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2505:28: ( (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) )? ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2506:1: (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) )? ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2506:1: (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) )? ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2506:3: otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) )? ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleRatingBar5640); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingBarAccess().getRatingbarKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2510:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2511:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2511:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2512:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRatingBar5657); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getRatingBarAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRatingBarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2528:3: ( (lv_numStars_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2529:1: (lv_numStars_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2529:1: (lv_numStars_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2530:3: lv_numStars_2_0= RULE_INT
            {
            lv_numStars_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRatingBar5680); 

            			newLeafNode(lv_numStars_2_0, grammarAccess.getRatingBarAccess().getNumStarsINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingBarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numStars",
                    		lv_numStars_2_0, 
                    		"INT");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2546:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2547:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2547:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2548:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRatingBarAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRatingBar5706);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingBarRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRatingBar"


    // $ANTLR start "entryRuleToggleButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2572:1: entryRuleToggleButton returns [EObject current=null] : iv_ruleToggleButton= ruleToggleButton EOF ;
    public final EObject entryRuleToggleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToggleButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2573:2: (iv_ruleToggleButton= ruleToggleButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2574:2: iv_ruleToggleButton= ruleToggleButton EOF
            {
             newCompositeNode(grammarAccess.getToggleButtonRule()); 
            pushFollow(FOLLOW_ruleToggleButton_in_entryRuleToggleButton5742);
            iv_ruleToggleButton=ruleToggleButton();

            state._fsp--;

             current =iv_ruleToggleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToggleButton5752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToggleButton"


    // $ANTLR start "ruleToggleButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2581:1: ruleToggleButton returns [EObject current=null] : (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleToggleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_textOn_3_0=null;
        Token otherlv_4=null;
        Token lv_textOff_5_0=null;
        Enumerator lv_layoutStyle_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2584:28: ( (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2585:1: (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2585:1: (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2585:3: otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleToggleButton5789); 

                	newLeafNode(otherlv_0, grammarAccess.getToggleButtonAccess().getTogglebuttonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2589:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2590:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2590:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2591:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToggleButton5806); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getToggleButtonAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getToggleButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleToggleButton5824); 

                	newLeafNode(otherlv_2, grammarAccess.getToggleButtonAccess().getTextOnKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2611:1: ( (lv_textOn_3_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2612:1: (lv_textOn_3_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2612:1: (lv_textOn_3_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2613:3: lv_textOn_3_0= RULE_STRING
            {
            lv_textOn_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToggleButton5841); 

            			newLeafNode(lv_textOn_3_0, grammarAccess.getToggleButtonAccess().getTextOnSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToggleButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"textOn",
                    		lv_textOn_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleToggleButton5858); 

                	newLeafNode(otherlv_4, grammarAccess.getToggleButtonAccess().getTextOffKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2633:1: ( (lv_textOff_5_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2634:1: (lv_textOff_5_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2634:1: (lv_textOff_5_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2635:3: lv_textOff_5_0= RULE_STRING
            {
            lv_textOff_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToggleButton5875); 

            			newLeafNode(lv_textOff_5_0, grammarAccess.getToggleButtonAccess().getTextOffSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToggleButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"textOff",
                    		lv_textOff_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2651:2: ( (lv_layoutStyle_6_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2652:1: (lv_layoutStyle_6_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2652:1: (lv_layoutStyle_6_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2653:3: lv_layoutStyle_6_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getToggleButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleToggleButton5901);
            lv_layoutStyle_6_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getToggleButtonRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_6_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToggleButton"


    // $ANTLR start "entryRuleRadioButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2677:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2678:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2679:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton5937);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton5947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2686:1: ruleRadioButton returns [EObject current=null] : (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2689:28: ( (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2690:1: (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2690:1: (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2690:3: otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleRadioButton5984); 

                	newLeafNode(otherlv_0, grammarAccess.getRadioButtonAccess().getRadiobuttonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2694:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2695:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2695:1: (lv_name_1_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2696:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRadioButton6001); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getRadioButtonAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2712:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2713:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2713:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2714:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioButton6024); 

            			newLeafNode(lv_text_2_0, grammarAccess.getRadioButtonAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2730:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2731:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2731:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2732:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRadioButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRadioButton6050);
            lv_layoutStyle_3_0=ruleLayoutStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRadioButtonRule());
            	        }
                   		set(
                   			current, 
                   			"layoutStyle",
                    		lv_layoutStyle_3_0, 
                    		"LayoutStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRulePreferenceScreen"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2756:1: entryRulePreferenceScreen returns [EObject current=null] : iv_rulePreferenceScreen= rulePreferenceScreen EOF ;
    public final EObject entryRulePreferenceScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferenceScreen = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2757:2: (iv_rulePreferenceScreen= rulePreferenceScreen EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2758:2: iv_rulePreferenceScreen= rulePreferenceScreen EOF
            {
             newCompositeNode(grammarAccess.getPreferenceScreenRule()); 
            pushFollow(FOLLOW_rulePreferenceScreen_in_entryRulePreferenceScreen6086);
            iv_rulePreferenceScreen=rulePreferenceScreen();

            state._fsp--;

             current =iv_rulePreferenceScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferenceScreen6096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreferenceScreen"


    // $ANTLR start "rulePreferenceScreen"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2765:1: rulePreferenceScreen returns [EObject current=null] : (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject rulePreferenceScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2768:28: ( (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2769:1: (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2769:1: (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2769:3: otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_rulePreferenceScreen6133); 

                	newLeafNode(otherlv_0, grammarAccess.getPreferenceScreenAccess().getPreferencescreenKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2773:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2774:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2774:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2775:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreferenceScreen6150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPreferenceScreenAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferenceScreenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2791:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2792:1: (lv_title_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2792:1: (lv_title_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2793:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferenceScreen6172); 

            			newLeafNode(lv_title_2_0, grammarAccess.getPreferenceScreenAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferenceScreenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePreferenceScreen6189); 

                	newLeafNode(otherlv_3, grammarAccess.getPreferenceScreenAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePreferenceScreen6201); 

                	newLeafNode(otherlv_4, grammarAccess.getPreferenceScreenAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreferenceScreen"


    // $ANTLR start "entryRuleAndroResModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2825:1: entryRuleAndroResModelRoot returns [EObject current=null] : iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF ;
    public final EObject entryRuleAndroResModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroResModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2826:2: (iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2827:2: iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroResModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroResModelRoot_in_entryRuleAndroResModelRoot6237);
            iv_ruleAndroResModelRoot=ruleAndroResModelRoot();

            state._fsp--;

             current =iv_ruleAndroResModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroResModelRoot6247); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroResModelRoot"


    // $ANTLR start "ruleAndroResModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2834:1: ruleAndroResModelRoot returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroResModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resources_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2837:28: ( (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2838:1: (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2838:1: (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2838:3: otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAndroResModelRoot6284); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroResModelRootAccess().getResourcesKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2842:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2843:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2843:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroResModelRoot6301); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndroResModelRootAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndroResModelRootRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroResModelRoot6318); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroResModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2864:1: ( (lv_resources_3_0= ruleResource ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==55||LA43_0==57) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2865:1: (lv_resources_3_0= ruleResource )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2865:1: (lv_resources_3_0= ruleResource )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2866:3: lv_resources_3_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroResModelRootAccess().getResourcesResourceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleAndroResModelRoot6339);
            	    lv_resources_3_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroResModelRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_3_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroResModelRoot6352); 

                	newLeafNode(otherlv_4, grammarAccess.getAndroResModelRootAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroResModelRoot"


    // $ANTLR start "entryRuleResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2894:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2895:2: (iv_ruleResource= ruleResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2896:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource6388);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource6398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2903:1: ruleResource returns [EObject current=null] : (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_StringResource_0 = null;

        EObject this_IntegerResource_1 = null;

        EObject this_BooleanResource_2 = null;

        EObject this_ColorResource_3 = null;

        EObject this_DimensionResource_4 = null;

        EObject this_ArrayResource_5 = null;

        EObject this_DrawableResource_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2906:28: ( (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2907:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2907:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )
            int alt44=7;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2908:5: this_StringResource_0= ruleStringResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getStringResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringResource_in_ruleResource6445);
                    this_StringResource_0=ruleStringResource();

                    state._fsp--;

                     
                            current = this_StringResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2918:5: this_IntegerResource_1= ruleIntegerResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getIntegerResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerResource_in_ruleResource6472);
                    this_IntegerResource_1=ruleIntegerResource();

                    state._fsp--;

                     
                            current = this_IntegerResource_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2928:5: this_BooleanResource_2= ruleBooleanResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getBooleanResourceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanResource_in_ruleResource6499);
                    this_BooleanResource_2=ruleBooleanResource();

                    state._fsp--;

                     
                            current = this_BooleanResource_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2938:5: this_ColorResource_3= ruleColorResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getColorResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleColorResource_in_ruleResource6526);
                    this_ColorResource_3=ruleColorResource();

                    state._fsp--;

                     
                            current = this_ColorResource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2948:5: this_DimensionResource_4= ruleDimensionResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDimensionResourceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDimensionResource_in_ruleResource6553);
                    this_DimensionResource_4=ruleDimensionResource();

                    state._fsp--;

                     
                            current = this_DimensionResource_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2958:5: this_ArrayResource_5= ruleArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getArrayResourceParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleArrayResource_in_ruleResource6580);
                    this_ArrayResource_5=ruleArrayResource();

                    state._fsp--;

                     
                            current = this_ArrayResource_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2968:5: this_DrawableResource_6= ruleDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDrawableResourceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDrawableResource_in_ruleResource6607);
                    this_DrawableResource_6=ruleDrawableResource();

                    state._fsp--;

                     
                            current = this_DrawableResource_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleStringResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2984:1: entryRuleStringResource returns [EObject current=null] : iv_ruleStringResource= ruleStringResource EOF ;
    public final EObject entryRuleStringResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2985:2: (iv_ruleStringResource= ruleStringResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2986:2: iv_ruleStringResource= ruleStringResource EOF
            {
             newCompositeNode(grammarAccess.getStringResourceRule()); 
            pushFollow(FOLLOW_ruleStringResource_in_entryRuleStringResource6642);
            iv_ruleStringResource=ruleStringResource();

            state._fsp--;

             current =iv_ruleStringResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringResource6652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringResource"


    // $ANTLR start "ruleStringResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2993:1: ruleStringResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2996:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2997:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2997:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2997:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2997:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2998:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2998:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2999:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringResource6694); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStringResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleStringResource6711); 

                	newLeafNode(otherlv_1, grammarAccess.getStringResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3019:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3020:1: (lv_value_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3020:1: (lv_value_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3021:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringResource6728); 

            			newLeafNode(lv_value_2_0, grammarAccess.getStringResourceAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringResource"


    // $ANTLR start "entryRuleIntegerResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3045:1: entryRuleIntegerResource returns [EObject current=null] : iv_ruleIntegerResource= ruleIntegerResource EOF ;
    public final EObject entryRuleIntegerResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3046:2: (iv_ruleIntegerResource= ruleIntegerResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3047:2: iv_ruleIntegerResource= ruleIntegerResource EOF
            {
             newCompositeNode(grammarAccess.getIntegerResourceRule()); 
            pushFollow(FOLLOW_ruleIntegerResource_in_entryRuleIntegerResource6769);
            iv_ruleIntegerResource=ruleIntegerResource();

            state._fsp--;

             current =iv_ruleIntegerResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerResource6779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerResource"


    // $ANTLR start "ruleIntegerResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3054:1: ruleIntegerResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3057:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3058:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3058:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3058:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3058:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3059:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3059:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3060:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerResource6821); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIntegerResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleIntegerResource6838); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3080:1: ( (lv_value_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3081:1: (lv_value_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3081:1: (lv_value_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3082:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerResource6855); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIntegerResourceAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerResource"


    // $ANTLR start "entryRuleBooleanResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3106:1: entryRuleBooleanResource returns [EObject current=null] : iv_ruleBooleanResource= ruleBooleanResource EOF ;
    public final EObject entryRuleBooleanResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3107:2: (iv_ruleBooleanResource= ruleBooleanResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3108:2: iv_ruleBooleanResource= ruleBooleanResource EOF
            {
             newCompositeNode(grammarAccess.getBooleanResourceRule()); 
            pushFollow(FOLLOW_ruleBooleanResource_in_entryRuleBooleanResource6896);
            iv_ruleBooleanResource=ruleBooleanResource();

            state._fsp--;

             current =iv_ruleBooleanResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanResource6906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanResource"


    // $ANTLR start "ruleBooleanResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3115:1: ruleBooleanResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) ;
    public final EObject ruleBooleanResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3118:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3119:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3119:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3119:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3119:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3120:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3120:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3121:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanResource6948); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBooleanResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleBooleanResource6965); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3141:1: ( (lv_value_2_0= ruleBOOL ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3142:1: (lv_value_2_0= ruleBOOL )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3142:1: (lv_value_2_0= ruleBOOL )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3143:3: lv_value_2_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanResourceAccess().getValueBOOLParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanResource6986);
            lv_value_2_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanResourceRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanResource"


    // $ANTLR start "entryRuleColorResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3167:1: entryRuleColorResource returns [EObject current=null] : iv_ruleColorResource= ruleColorResource EOF ;
    public final EObject entryRuleColorResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3168:2: (iv_ruleColorResource= ruleColorResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3169:2: iv_ruleColorResource= ruleColorResource EOF
            {
             newCompositeNode(grammarAccess.getColorResourceRule()); 
            pushFollow(FOLLOW_ruleColorResource_in_entryRuleColorResource7022);
            iv_ruleColorResource=ruleColorResource();

            state._fsp--;

             current =iv_ruleColorResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorResource7032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorResource"


    // $ANTLR start "ruleColorResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3176:1: ruleColorResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) ) ;
    public final EObject ruleColorResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3179:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3180:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3180:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3180:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3180:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3181:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3181:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3182:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorResource7074); 

            			newLeafNode(lv_name_0_0, grammarAccess.getColorResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleColorResource7091); 

                	newLeafNode(otherlv_1, grammarAccess.getColorResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3202:1: ( (lv_value_2_0= RULE_HEX_COLOR ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3203:1: (lv_value_2_0= RULE_HEX_COLOR )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3203:1: (lv_value_2_0= RULE_HEX_COLOR )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3204:3: lv_value_2_0= RULE_HEX_COLOR
            {
            lv_value_2_0=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleColorResource7108); 

            			newLeafNode(lv_value_2_0, grammarAccess.getColorResourceAccess().getValueHEX_COLORTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"HEX_COLOR");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorResource"


    // $ANTLR start "entryRuleDimensionResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3228:1: entryRuleDimensionResource returns [EObject current=null] : iv_ruleDimensionResource= ruleDimensionResource EOF ;
    public final EObject entryRuleDimensionResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3229:2: (iv_ruleDimensionResource= ruleDimensionResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3230:2: iv_ruleDimensionResource= ruleDimensionResource EOF
            {
             newCompositeNode(grammarAccess.getDimensionResourceRule()); 
            pushFollow(FOLLOW_ruleDimensionResource_in_entryRuleDimensionResource7149);
            iv_ruleDimensionResource=ruleDimensionResource();

            state._fsp--;

             current =iv_ruleDimensionResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionResource7159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionResource"


    // $ANTLR start "ruleDimensionResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3237:1: ruleDimensionResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) ) ;
    public final EObject ruleDimensionResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3240:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3241:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3241:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3241:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3241:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3242:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3242:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3243:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDimensionResource7201); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDimensionResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDimensionResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleDimensionResource7218); 

                	newLeafNode(otherlv_1, grammarAccess.getDimensionResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3263:1: ( (lv_value_2_0= ruleDimensionValue ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3264:1: (lv_value_2_0= ruleDimensionValue )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3264:1: (lv_value_2_0= ruleDimensionValue )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3265:3: lv_value_2_0= ruleDimensionValue
            {
             
            	        newCompositeNode(grammarAccess.getDimensionResourceAccess().getValueDimensionValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDimensionValue_in_ruleDimensionResource7239);
            lv_value_2_0=ruleDimensionValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDimensionResourceRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"DimensionValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionResource"


    // $ANTLR start "entryRuleArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3289:1: entryRuleArrayResource returns [EObject current=null] : iv_ruleArrayResource= ruleArrayResource EOF ;
    public final EObject entryRuleArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3290:2: (iv_ruleArrayResource= ruleArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3291:2: iv_ruleArrayResource= ruleArrayResource EOF
            {
             newCompositeNode(grammarAccess.getArrayResourceRule()); 
            pushFollow(FOLLOW_ruleArrayResource_in_entryRuleArrayResource7275);
            iv_ruleArrayResource=ruleArrayResource();

            state._fsp--;

             current =iv_ruleArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayResource7285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayResource"


    // $ANTLR start "ruleArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3298:1: ruleArrayResource returns [EObject current=null] : (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource ) ;
    public final EObject ruleArrayResource() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerArrayResource_0 = null;

        EObject this_StringArrayResource_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3301:28: ( (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3302:1: (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3302:1: (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            else if ( (LA45_0==57) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3303:5: this_IntegerArrayResource_0= ruleIntegerArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getArrayResourceAccess().getIntegerArrayResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerArrayResource_in_ruleArrayResource7332);
                    this_IntegerArrayResource_0=ruleIntegerArrayResource();

                    state._fsp--;

                     
                            current = this_IntegerArrayResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3313:5: this_StringArrayResource_1= ruleStringArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getArrayResourceAccess().getStringArrayResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayResource_in_ruleArrayResource7359);
                    this_StringArrayResource_1=ruleStringArrayResource();

                    state._fsp--;

                     
                            current = this_StringArrayResource_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayResource"


    // $ANTLR start "entryRuleIntegerArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3329:1: entryRuleIntegerArrayResource returns [EObject current=null] : iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF ;
    public final EObject entryRuleIntegerArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3330:2: (iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3331:2: iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF
            {
             newCompositeNode(grammarAccess.getIntegerArrayResourceRule()); 
            pushFollow(FOLLOW_ruleIntegerArrayResource_in_entryRuleIntegerArrayResource7394);
            iv_ruleIntegerArrayResource=ruleIntegerArrayResource();

            state._fsp--;

             current =iv_ruleIntegerArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerArrayResource7404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerArrayResource"


    // $ANTLR start "ruleIntegerArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3338:1: ruleIntegerArrayResource returns [EObject current=null] : (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleIntegerArrayResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_entries_3_0 = null;

        EObject lv_entries_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3341:28: ( (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:1: (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:1: (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:3: otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleIntegerArrayResource7441); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerArrayResourceAccess().getIntarrayKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3346:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3347:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3347:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3348:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerArrayResource7458); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIntegerArrayResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerArrayResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIntegerArrayResource7475); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerArrayResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3368:1: ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3368:2: ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )*
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3368:2: ( (lv_entries_3_0= ruleIntegerArrayEntry ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3369:1: (lv_entries_3_0= ruleIntegerArrayEntry )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3369:1: (lv_entries_3_0= ruleIntegerArrayEntry )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3370:3: lv_entries_3_0= ruleIntegerArrayEntry
            {
             
            	        newCompositeNode(grammarAccess.getIntegerArrayResourceAccess().getEntriesIntegerArrayEntryParserRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource7497);
            lv_entries_3_0=ruleIntegerArrayEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerArrayResourceRule());
            	        }
                   		add(
                   			current, 
                   			"entries",
                    		lv_entries_3_0, 
                    		"IntegerArrayEntry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3386:2: (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==56) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3386:4: otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) )
            	    {
            	    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleIntegerArrayResource7510); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIntegerArrayResourceAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3390:1: ( (lv_entries_5_0= ruleIntegerArrayEntry ) )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3391:1: (lv_entries_5_0= ruleIntegerArrayEntry )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3391:1: (lv_entries_5_0= ruleIntegerArrayEntry )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3392:3: lv_entries_5_0= ruleIntegerArrayEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerArrayResourceAccess().getEntriesIntegerArrayEntryParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource7531);
            	    lv_entries_5_0=ruleIntegerArrayEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntegerArrayResourceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_5_0, 
            	            		"IntegerArrayEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleIntegerArrayResource7546); 

                	newLeafNode(otherlv_6, grammarAccess.getIntegerArrayResourceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerArrayResource"


    // $ANTLR start "entryRuleIntegerArrayEntry"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3420:1: entryRuleIntegerArrayEntry returns [EObject current=null] : iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF ;
    public final EObject entryRuleIntegerArrayEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerArrayEntry = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3421:2: (iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3422:2: iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF
            {
             newCompositeNode(grammarAccess.getIntegerArrayEntryRule()); 
            pushFollow(FOLLOW_ruleIntegerArrayEntry_in_entryRuleIntegerArrayEntry7582);
            iv_ruleIntegerArrayEntry=ruleIntegerArrayEntry();

            state._fsp--;

             current =iv_ruleIntegerArrayEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerArrayEntry7592); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerArrayEntry"


    // $ANTLR start "ruleIntegerArrayEntry"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3429:1: ruleIntegerArrayEntry returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerArrayEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3432:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3433:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3434:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3434:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3435:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerArrayEntry7635); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getIntegerArrayEntryAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerArrayEntryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleIntegerArrayEntry7652); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntegerArrayEntryAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3455:3: ( (lv_value_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3456:1: (lv_value_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3456:1: (lv_value_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3457:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerArrayEntry7671); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIntegerArrayEntryAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerArrayEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerArrayEntry"


    // $ANTLR start "entryRuleStringArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3481:1: entryRuleStringArrayResource returns [EObject current=null] : iv_ruleStringArrayResource= ruleStringArrayResource EOF ;
    public final EObject entryRuleStringArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3482:2: (iv_ruleStringArrayResource= ruleStringArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3483:2: iv_ruleStringArrayResource= ruleStringArrayResource EOF
            {
             newCompositeNode(grammarAccess.getStringArrayResourceRule()); 
            pushFollow(FOLLOW_ruleStringArrayResource_in_entryRuleStringArrayResource7712);
            iv_ruleStringArrayResource=ruleStringArrayResource();

            state._fsp--;

             current =iv_ruleStringArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayResource7722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringArrayResource"


    // $ANTLR start "ruleStringArrayResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3490:1: ruleStringArrayResource returns [EObject current=null] : (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleStringArrayResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_entries_3_0 = null;

        EObject lv_entries_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3493:28: ( (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3494:1: (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3494:1: (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3494:3: otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleStringArrayResource7759); 

                	newLeafNode(otherlv_0, grammarAccess.getStringArrayResourceAccess().getStringarrayKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3498:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3499:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3499:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3500:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringArrayResource7776); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringArrayResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringArrayResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringArrayResource7793); 

                	newLeafNode(otherlv_2, grammarAccess.getStringArrayResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3520:1: ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3520:2: ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )*
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3520:2: ( (lv_entries_3_0= ruleStringArrayEntry ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3521:1: (lv_entries_3_0= ruleStringArrayEntry )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3521:1: (lv_entries_3_0= ruleStringArrayEntry )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3522:3: lv_entries_3_0= ruleStringArrayEntry
            {
             
            	        newCompositeNode(grammarAccess.getStringArrayResourceAccess().getEntriesStringArrayEntryParserRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource7815);
            lv_entries_3_0=ruleStringArrayEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringArrayResourceRule());
            	        }
                   		add(
                   			current, 
                   			"entries",
                    		lv_entries_3_0, 
                    		"StringArrayEntry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3538:2: (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==56) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3538:4: otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) )
            	    {
            	    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleStringArrayResource7828); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStringArrayResourceAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3542:1: ( (lv_entries_5_0= ruleStringArrayEntry ) )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3543:1: (lv_entries_5_0= ruleStringArrayEntry )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3543:1: (lv_entries_5_0= ruleStringArrayEntry )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3544:3: lv_entries_5_0= ruleStringArrayEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringArrayResourceAccess().getEntriesStringArrayEntryParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource7849);
            	    lv_entries_5_0=ruleStringArrayEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStringArrayResourceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_5_0, 
            	            		"StringArrayEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleStringArrayResource7864); 

                	newLeafNode(otherlv_6, grammarAccess.getStringArrayResourceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringArrayResource"


    // $ANTLR start "entryRuleStringArrayEntry"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3572:1: entryRuleStringArrayEntry returns [EObject current=null] : iv_ruleStringArrayEntry= ruleStringArrayEntry EOF ;
    public final EObject entryRuleStringArrayEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayEntry = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3573:2: (iv_ruleStringArrayEntry= ruleStringArrayEntry EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3574:2: iv_ruleStringArrayEntry= ruleStringArrayEntry EOF
            {
             newCompositeNode(grammarAccess.getStringArrayEntryRule()); 
            pushFollow(FOLLOW_ruleStringArrayEntry_in_entryRuleStringArrayEntry7900);
            iv_ruleStringArrayEntry=ruleStringArrayEntry();

            state._fsp--;

             current =iv_ruleStringArrayEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayEntry7910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringArrayEntry"


    // $ANTLR start "ruleStringArrayEntry"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3581:1: ruleStringArrayEntry returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringArrayEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3584:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3586:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3586:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3587:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringArrayEntry7953); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getStringArrayEntryAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringArrayEntryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleStringArrayEntry7970); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringArrayEntryAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3607:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3608:1: (lv_value_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3608:1: (lv_value_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3609:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringArrayEntry7989); 

            			newLeafNode(lv_value_2_0, grammarAccess.getStringArrayEntryAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringArrayEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringArrayEntry"


    // $ANTLR start "entryRuleDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3633:1: entryRuleDrawableResource returns [EObject current=null] : iv_ruleDrawableResource= ruleDrawableResource EOF ;
    public final EObject entryRuleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3634:2: (iv_ruleDrawableResource= ruleDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3635:2: iv_ruleDrawableResource= ruleDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource8030);
            iv_ruleDrawableResource=ruleDrawableResource();

            state._fsp--;

             current =iv_ruleDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrawableResource8040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrawableResource"


    // $ANTLR start "ruleDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3642:1: ruleDrawableResource returns [EObject current=null] : (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) ;
    public final EObject ruleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject this_BitmapDrawableResource_0 = null;

        EObject this_TransitionDrawableResource_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3645:28: ( (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3646:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3646:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_ID) ) {
                    alt50=2;
                }
                else if ( (LA50_1==54) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3647:5: this_BitmapDrawableResource_0= ruleBitmapDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getDrawableResourceAccess().getBitmapDrawableResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource8087);
                    this_BitmapDrawableResource_0=ruleBitmapDrawableResource();

                    state._fsp--;

                     
                            current = this_BitmapDrawableResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3657:5: this_TransitionDrawableResource_1= ruleTransitionDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getDrawableResourceAccess().getTransitionDrawableResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource8114);
                    this_TransitionDrawableResource_1=ruleTransitionDrawableResource();

                    state._fsp--;

                     
                            current = this_TransitionDrawableResource_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrawableResource"


    // $ANTLR start "entryRuleBitmapDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3673:1: entryRuleBitmapDrawableResource returns [EObject current=null] : iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF ;
    public final EObject entryRuleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitmapDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3674:2: (iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3675:2: iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getBitmapDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource8149);
            iv_ruleBitmapDrawableResource=ruleBitmapDrawableResource();

            state._fsp--;

             current =iv_ruleBitmapDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitmapDrawableResource8159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitmapDrawableResource"


    // $ANTLR start "ruleBitmapDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3682:1: ruleBitmapDrawableResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3685:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3686:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3686:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3686:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3686:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3687:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3687:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3688:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource8201); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBitmapDrawableResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBitmapDrawableResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleBitmapDrawableResource8218); 

                	newLeafNode(otherlv_1, grammarAccess.getBitmapDrawableResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3708:1: ( (lv_filename_2_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3709:1: (lv_filename_2_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3709:1: (lv_filename_2_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3710:3: lv_filename_2_0= RULE_ID
            {
            lv_filename_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource8235); 

            			newLeafNode(lv_filename_2_0, grammarAccess.getBitmapDrawableResourceAccess().getFilenameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBitmapDrawableResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitmapDrawableResource"


    // $ANTLR start "entryRuleTransitionDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3734:1: entryRuleTransitionDrawableResource returns [EObject current=null] : iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF ;
    public final EObject entryRuleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3735:2: (iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3736:2: iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getTransitionDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource8276);
            iv_ruleTransitionDrawableResource=ruleTransitionDrawableResource();

            state._fsp--;

             current =iv_ruleTransitionDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionDrawableResource8286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionDrawableResource"


    // $ANTLR start "ruleTransitionDrawableResource"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3743:1: ruleTransitionDrawableResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3746:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3747:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3747:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3747:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3747:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3748:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3748:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3749:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8328); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTransitionDrawableResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDrawableResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3765:2: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3766:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3766:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3767:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDrawableResourceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8353); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionDrawableResourceAccess().getFromBitmapDrawableResourceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleTransitionDrawableResource8365); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionDrawableResourceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3782:1: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3783:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3783:1: (otherlv_3= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3784:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDrawableResourceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8385); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionDrawableResourceAccess().getToBitmapDrawableResourceCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionDrawableResource"


    // $ANTLR start "entryRuleDimensionValue"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3803:1: entryRuleDimensionValue returns [String current=null] : iv_ruleDimensionValue= ruleDimensionValue EOF ;
    public final String entryRuleDimensionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDimensionValue = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3804:2: (iv_ruleDimensionValue= ruleDimensionValue EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3805:2: iv_ruleDimensionValue= ruleDimensionValue EOF
            {
             newCompositeNode(grammarAccess.getDimensionValueRule()); 
            pushFollow(FOLLOW_ruleDimensionValue_in_entryRuleDimensionValue8422);
            iv_ruleDimensionValue=ruleDimensionValue();

            state._fsp--;

             current =iv_ruleDimensionValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionValue8433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionValue"


    // $ANTLR start "ruleDimensionValue"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3812:1: ruleDimensionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) ) ;
    public final AntlrDatatypeRuleToken ruleDimensionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3815:28: ( (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3816:1: (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3816:1: (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3817:5: this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' )
            {
             
                    newCompositeNode(grammarAccess.getDimensionValueAccess().getFLOATParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFLOAT_in_ruleDimensionValue8480);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            		current.merge(this_FLOAT_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3827:1: (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt51=1;
                }
                break;
            case 60:
                {
                alt51=2;
                }
                break;
            case 61:
                {
                alt51=3;
                }
                break;
            case 62:
                {
                alt51=4;
                }
                break;
            case 63:
                {
                alt51=5;
                }
                break;
            case 64:
                {
                alt51=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3828:2: kw= 'dp'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleDimensionValue8499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getDpKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3835:2: kw= 'sp'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDimensionValue8518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getSpKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3842:2: kw= 'pt'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDimensionValue8537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getPtKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3849:2: kw= 'px'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDimensionValue8556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getPxKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3856:2: kw= 'mm'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDimensionValue8575); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getMmKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3863:2: kw= 'in'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleDimensionValue8594); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getInKeyword_1_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionValue"


    // $ANTLR start "entryRuleBOOL"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3876:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3877:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3878:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL8636);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL8647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3885:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'YES' | kw= 'NO' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3888:28: ( (kw= 'YES' | kw= 'NO' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3889:1: (kw= 'YES' | kw= 'NO' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3889:1: (kw= 'YES' | kw= 'NO' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            else if ( (LA52_0==66) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3890:2: kw= 'YES'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleBOOL8685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getYESKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3897:2: kw= 'NO'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleBOOL8704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getNOKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleFLOAT"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3910:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3911:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3912:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT8745);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT8756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3919:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3922:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3923:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3923:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3923:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT8796); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3930:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==14) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3931:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleFLOAT8815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT8830); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleApiLevel"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3951:1: ruleApiLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) ) ;
    public final Enumerator ruleApiLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3953:28: ( ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3954:1: ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3954:1: ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt54=1;
                }
                break;
            case 68:
                {
                alt54=2;
                }
                break;
            case 69:
                {
                alt54=3;
                }
                break;
            case 70:
                {
                alt54=4;
                }
                break;
            case 71:
                {
                alt54=5;
                }
                break;
            case 72:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3954:2: (enumLiteral_0= 'Android 2.2' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3954:2: (enumLiteral_0= 'Android 2.2' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3954:4: enumLiteral_0= 'Android 2.2'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleApiLevel8891); 

                            current = grammarAccess.getApiLevelAccess().getAPI8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getApiLevelAccess().getAPI8EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3960:6: (enumLiteral_1= 'Android 2.3.1' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3960:6: (enumLiteral_1= 'Android 2.3.1' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3960:8: enumLiteral_1= 'Android 2.3.1'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleApiLevel8908); 

                            current = grammarAccess.getApiLevelAccess().getAPI9EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getApiLevelAccess().getAPI9EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3966:6: (enumLiteral_2= 'Android 2.3.3' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3966:6: (enumLiteral_2= 'Android 2.3.3' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3966:8: enumLiteral_2= 'Android 2.3.3'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleApiLevel8925); 

                            current = grammarAccess.getApiLevelAccess().getAPI10EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getApiLevelAccess().getAPI10EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3972:6: (enumLiteral_3= 'Android 3.0' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3972:6: (enumLiteral_3= 'Android 3.0' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3972:8: enumLiteral_3= 'Android 3.0'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleApiLevel8942); 

                            current = grammarAccess.getApiLevelAccess().getAPI11EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getApiLevelAccess().getAPI11EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3978:6: (enumLiteral_4= 'Android 3.1' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3978:6: (enumLiteral_4= 'Android 3.1' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3978:8: enumLiteral_4= 'Android 3.1'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleApiLevel8959); 

                            current = grammarAccess.getApiLevelAccess().getAPI12EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getApiLevelAccess().getAPI12EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3984:6: (enumLiteral_5= 'Android 4.0' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3984:6: (enumLiteral_5= 'Android 4.0' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3984:8: enumLiteral_5= 'Android 4.0'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleApiLevel8976); 

                            current = grammarAccess.getApiLevelAccess().getAPI14EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getApiLevelAccess().getAPI14EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApiLevel"


    // $ANTLR start "ruleDataTypes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3994:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3996:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3997:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3997:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt55=1;
                }
                break;
            case 74:
                {
                alt55=2;
                }
                break;
            case 75:
                {
                alt55=3;
                }
                break;
            case 76:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3997:2: (enumLiteral_0= 'String' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3997:2: (enumLiteral_0= 'String' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3997:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleDataTypes9021); 

                            current = grammarAccess.getDataTypesAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4003:6: (enumLiteral_1= 'float' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4003:6: (enumLiteral_1= 'float' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4003:8: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleDataTypes9038); 

                            current = grammarAccess.getDataTypesAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getFLOATEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4009:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4009:6: (enumLiteral_2= 'boolean' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4009:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleDataTypes9055); 

                            current = grammarAccess.getDataTypesAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4015:6: (enumLiteral_3= 'int' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4015:6: (enumLiteral_3= 'int' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4015:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleDataTypes9072); 

                            current = grammarAccess.getDataTypesAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getINTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "ruleLayoutStyle"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4025:1: ruleLayoutStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) ) ;
    public final Enumerator ruleLayoutStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4027:28: ( ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4028:1: ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4028:1: ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt56=1;
                }
                break;
            case 78:
                {
                alt56=2;
                }
                break;
            case 79:
                {
                alt56=3;
                }
                break;
            case 80:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4028:2: (enumLiteral_0= 'fill' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4028:2: (enumLiteral_0= 'fill' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4028:4: enumLiteral_0= 'fill'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleLayoutStyle9117); 

                            current = grammarAccess.getLayoutStyleAccess().getFILLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLayoutStyleAccess().getFILLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4034:6: (enumLiteral_1= 'wrap' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4034:6: (enumLiteral_1= 'wrap' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4034:8: enumLiteral_1= 'wrap'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleLayoutStyle9134); 

                            current = grammarAccess.getLayoutStyleAccess().getWRAPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLayoutStyleAccess().getWRAPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4040:6: (enumLiteral_2= 'fill&wrap' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4040:6: (enumLiteral_2= 'fill&wrap' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4040:8: enumLiteral_2= 'fill&wrap'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleLayoutStyle9151); 

                            current = grammarAccess.getLayoutStyleAccess().getFILL_WRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLayoutStyleAccess().getFILL_WRAPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4046:6: (enumLiteral_3= 'wrap&fill' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4046:6: (enumLiteral_3= 'wrap&fill' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4046:8: enumLiteral_3= 'wrap&fill'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleLayoutStyle9168); 

                            current = grammarAccess.getLayoutStyleAccess().getWRAP_FILLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLayoutStyleAccess().getWRAP_FILLEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutStyle"

    // Delegated rules


    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA44_eotS =
        "\13\uffff";
    static final String DFA44_eofS =
        "\7\uffff\1\12\3\uffff";
    static final String DFA44_minS =
        "\2\4\1\uffff\1\4\3\uffff\1\4\3\uffff";
    static final String DFA44_maxS =
        "\1\71\1\66\1\uffff\1\102\3\uffff\1\100\3\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\6\1\uffff\1\7\1\3\1\1\1\uffff\1\4\1\5\1\2";
    static final String DFA44_specialS =
        "\13\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\62\uffff\1\2\1\uffff\1\2",
            "\1\4\61\uffff\1\3",
            "",
            "\1\4\1\6\1\7\1\10\71\uffff\2\5",
            "",
            "",
            "",
            "\1\12\11\uffff\1\11\3\uffff\1\12\44\uffff\1\12\1\uffff\1\12"+
            "\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2907:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAndroTextModelRoot_in_entryRuleAndroTextModelRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroTextModelRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAndroTextModelRoot123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAndroTextModelRoot144 = new BitSet(new long[]{0x0020000081812000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAndroTextModelRoot167 = new BitSet(new long[]{0x0020000081812000L});
    public static final BitSet FOLLOW_ruleModelRoot_in_ruleAndroTextModelRoot189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelRoot_in_entryRuleModelRoot225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelRoot235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroGenModelRoot_in_ruleModelRoot282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroidApplication_in_ruleModelRoot309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroGuiModelRoot_in_ruleModelRoot336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroDataModelRoot_in_ruleModelRoot363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroResModelRoot_in_ruleModelRoot390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName581 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName615 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard721 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroGenModelRoot_in_entryRuleAndroGenModelRoot795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroGenModelRoot805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAndroGenModelRoot842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroGenModelRoot859 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroGenModelRoot876 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_ruleAndroGenModelRoot897 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleAndroGenModelRoot910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetApplication_in_entryRuleTargetApplication946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetApplication956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTargetApplication993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTargetApplication1016 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTargetApplication1028 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTargetApplication1040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTargetApplication1061 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_12_in_ruleTargetApplication1074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAndroidPackageName_in_ruleTargetApplication1095 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTargetApplication1109 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_ruleApiLevel_in_ruleTargetApplication1130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTargetApplication1142 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTargetApplication1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroidPackageName_in_entryRuleAndroidPackageName1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidPackageName1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidPackageName1261 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAndroidPackageName1280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidPackageName1295 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAndroidApplication_in_entryRuleAndroidApplication1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidApplication1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAndroidApplication1389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidApplication1406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroidApplication1423 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAndroidApplication1435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAndroidApplication1458 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleAndroidApplication1479 = new BitSet(new long[]{0x000000000A040000L});
    public static final BitSet FOLLOW_ruleAndroidApplicationModelElement_in_ruleAndroidApplication1500 = new BitSet(new long[]{0x000000000A040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroidApplication1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroidApplicationModelElement_in_entryRuleAndroidApplicationModelElement1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidApplicationModelElement1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleAndroidApplicationModelElement1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_ruleAndroidApplicationModelElement1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActivity1715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1732 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_entryRuleTabActivity1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabActivity1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTabActivity1855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabActivity1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroDataModelRoot_in_entryRuleAndroDataModelRoot1913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroDataModelRoot1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAndroDataModelRoot1960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroDataModelRoot1977 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroDataModelRoot1994 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAndroDataModelRoot2015 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroDataModelRoot2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntity2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2128 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleEntity2146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2166 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity2180 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2201 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleEntity2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2302 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProperty2319 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleProperty2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypesRef_in_ruleTypeRef2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityTypeRef_in_ruleTypeRef2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypesRef_in_entryRuleDataTypesRef2495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypesRef2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataTypesRef2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityTypeRef_in_entryRuleEntityTypeRef2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityTypeRef2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityTypeRef2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroGuiModelRoot_in_entryRuleAndroGuiModelRoot2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroGuiModelRoot2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAndroGuiModelRoot2724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroGuiModelRoot2741 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroGuiModelRoot2758 = new BitSet(new long[]{0x0010003300040000L});
    public static final BitSet FOLLOW_ruleRootLayout_in_ruleAndroGuiModelRoot2779 = new BitSet(new long[]{0x0010003300040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroGuiModelRoot2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleUIElement2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleUIElement2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLayout_in_ruleLayout3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLayout_in_entryRuleRootLayout3037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootLayout3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseLayout_in_ruleRootLayout3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceScreen_in_ruleRootLayout3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseLayout_in_entryRuleBaseLayout3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseLayout3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearLayout_in_ruleBaseLayout3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteLayout_in_ruleBaseLayout3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameLayout_in_ruleBaseLayout3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeLayout_in_ruleBaseLayout3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteLayout_in_entryRuleAbsoluteLayout3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteLayout3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAbsoluteLayout3376 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbsoluteLayout3393 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleAbsoluteLayout3420 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAbsoluteLayout3432 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleAbsoluteLayout3453 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleAbsoluteLayout3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearLayout_in_entryRuleLinearLayout3502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearLayout3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinearLayout3549 = new BitSet(new long[]{0x0000000C00000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinearLayout3566 = new BitSet(new long[]{0x0000000C00000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_34_in_ruleLinearLayout3591 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_35_in_ruleLinearLayout3622 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleLinearLayout3645 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLinearLayout3657 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleLinearLayout3678 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleLinearLayout3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameLayout_in_entryRuleFrameLayout3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameLayout3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFrameLayout3774 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrameLayout3791 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleFrameLayout3818 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFrameLayout3830 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleFrameLayout3851 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleFrameLayout3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeLayout_in_entryRuleRelativeLayout3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeLayout3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelativeLayout3947 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelativeLayout3964 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRelativeLayout3991 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelativeLayout4003 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleRelativeLayout4024 = new BitSet(new long[]{0x0011F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleRelativeLayout4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_ruleWidget4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_ruleWidget4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWidget4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListView_in_ruleWidget4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioGroup_in_ruleWidget4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleWidget4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatingBar_in_ruleWidget4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToggleButton_in_ruleWidget4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_entryRuleTextView4381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextView4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTextView4428 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextView4445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextView4468 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleTextView4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_entryRuleEditText4530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditText4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEditText4577 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditText4594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditText4617 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleEditText4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton4679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleButton4726 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton4743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton4766 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleButton4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListView_in_entryRuleListView4828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListView4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleListView4875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListView4892 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleListView4918 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleListView4930 = new BitSet(new long[]{0x00000C0000040000L});
    public static final BitSet FOLLOW_42_in_ruleListView4943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListView4966 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_43_in_ruleListView4981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListView5004 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleListView5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner5054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinner5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSpinner5101 = new BitSet(new long[]{0x0000040000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinner5118 = new BitSet(new long[]{0x0000040000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_42_in_ruleSpinner5137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpinner5160 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleSpinner5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCheckBox5266 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBox5283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckBox5306 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleCheckBox5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioGroup_in_entryRuleRadioGroup5368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioGroup5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRadioGroup5415 = new BitSet(new long[]{0x0000000C00000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRadioGroup5432 = new BitSet(new long[]{0x0000000C00000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_34_in_ruleRadioGroup5457 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_35_in_ruleRadioGroup5488 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRadioGroup5511 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRadioGroup5523 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleRadioGroup5544 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRadioGroup5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatingBar_in_entryRuleRatingBar5593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRatingBar5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRatingBar5640 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRatingBar5657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRatingBar5680 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRatingBar5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToggleButton_in_entryRuleToggleButton5742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToggleButton5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleToggleButton5789 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToggleButton5806 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleToggleButton5824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToggleButton5841 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleToggleButton5858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToggleButton5875 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleToggleButton5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton5937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleRadioButton5984 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRadioButton6001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioButton6024 = new BitSet(new long[]{0x0000000000000010L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRadioButton6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceScreen_in_entryRulePreferenceScreen6086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferenceScreen6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePreferenceScreen6133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreferenceScreen6150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferenceScreen6172 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePreferenceScreen6189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePreferenceScreen6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroResModelRoot_in_entryRuleAndroResModelRoot6237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroResModelRoot6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAndroResModelRoot6284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroResModelRoot6301 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroResModelRoot6318 = new BitSet(new long[]{0x0280000000040010L});
    public static final BitSet FOLLOW_ruleResource_in_ruleAndroResModelRoot6339 = new BitSet(new long[]{0x0280000000040010L});
    public static final BitSet FOLLOW_18_in_ruleAndroResModelRoot6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource6388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringResource_in_ruleResource6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerResource_in_ruleResource6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanResource_in_ruleResource6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorResource_in_ruleResource6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionResource_in_ruleResource6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayResource_in_ruleResource6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_ruleResource6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringResource_in_entryRuleStringResource6642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringResource6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringResource6694 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleStringResource6711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringResource6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerResource_in_entryRuleIntegerResource6769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerResource6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerResource6821 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleIntegerResource6838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerResource6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanResource_in_entryRuleBooleanResource6896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanResource6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanResource6948 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBooleanResource6965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanResource6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorResource_in_entryRuleColorResource7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorResource7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorResource7074 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleColorResource7091 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleColorResource7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionResource_in_entryRuleDimensionResource7149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionResource7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDimensionResource7201 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleDimensionResource7218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDimensionValue_in_ruleDimensionResource7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayResource_in_entryRuleArrayResource7275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayResource7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayResource_in_ruleArrayResource7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayResource_in_ruleArrayResource7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayResource_in_entryRuleIntegerArrayResource7394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerArrayResource7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIntegerArrayResource7441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerArrayResource7458 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerArrayResource7475 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource7497 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_56_in_ruleIntegerArrayResource7510 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource7531 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIntegerArrayResource7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_entryRuleIntegerArrayEntry7582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerArrayEntry7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerArrayEntry7635 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleIntegerArrayEntry7652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerArrayEntry7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayResource_in_entryRuleStringArrayResource7712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayResource7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleStringArrayResource7759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringArrayResource7776 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringArrayResource7793 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource7815 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_56_in_ruleStringArrayResource7828 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource7849 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringArrayResource7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_entryRuleStringArrayEntry7900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayEntry7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringArrayEntry7953 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleStringArrayEntry7970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringArrayEntry7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource8030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrawableResource8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource8149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitmapDrawableResource8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource8201 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBitmapDrawableResource8218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource8276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionDrawableResource8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8353 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTransitionDrawableResource8365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionValue_in_entryRuleDimensionValue8422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionValue8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleDimensionValue8480 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59_in_ruleDimensionValue8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDimensionValue8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDimensionValue8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDimensionValue8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDimensionValue8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDimensionValue8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL8636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBOOL8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBOOL8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT8745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT8796 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFLOAT8815 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleApiLevel8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleApiLevel8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleApiLevel8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleApiLevel8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleApiLevel8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleApiLevel8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDataTypes9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDataTypes9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDataTypes9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDataTypes9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleLayoutStyle9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleLayoutStyle9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleLayoutStyle9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleLayoutStyle9168 = new BitSet(new long[]{0x0000000000000002L});

}