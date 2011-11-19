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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_COLOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'*'", "'generator'", "'{'", "'}'", "'target'", "'project'", "'platform'", "'version'", "'application'", "'datamodel'", "'activity'", "'layout'", "'tabactivity'", "'entity'", "'extends'", "':'", "'guimodel'", "'absolutelayout'", "'linearlayout'", "'horizontal'", "'vertical'", "'framelayout'", "'relativelayout'", "'textview'", "'edittext'", "'button'", "'listview'", "'entries'", "'listitem'", "'spinner'", "'checkbox'", "'radiogroup'", "'ratingbar'", "'togglebutton'", "'textOn'", "'textOff'", "'radiobutton'", "'preference'", "'preferencescreen'", "'preferencecategery'", "'edittextpreference'", "'listpreference'", "'checkboxpreference'", "'ringtonepreference'", "'key'", "'summary'", "'enabled'", "'persistent'", "'dialogTitle'", "'defaultValue'", "'entryValues'", "'resources'", "'='", "'intarray'", "','", "'stringarray'", "'<->'", "'dp'", "'sp'", "'pt'", "'px'", "'mm'", "'in'", "'true'", "'false'", "'Android 2.2'", "'Android 2.3.1'", "'Android 2.3.3'", "'Android 3.0'", "'Android 3.1'", "'Android 4.0'", "'String'", "'float'", "'boolean'", "'int'", "'fill'", "'wrap'", "'fill&wrap'", "'wrap&fill'"
    };
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
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
    public static final int RULE_STRING=6;
    public static final int T__71=71;
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
    public static final int T__59=59;
    public static final int RULE_INT=5;
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
            case 66:
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:423:1: ruleTargetApplication returns [EObject current=null] : (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersionCode ) ) otherlv_11= '}' ) ;
    public final EObject ruleTargetApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_projectName_4_0 = null;

        AntlrDatatypeRuleToken lv_packageName_6_0 = null;

        Enumerator lv_target_8_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:426:28: ( (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersionCode ) ) otherlv_11= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:1: (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersionCode ) ) otherlv_11= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:1: (otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersionCode ) ) otherlv_11= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:427:3: otherlv_0= 'target' ( ( ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_projectName_4_0= ruleQualifiedName ) ) (otherlv_5= 'package' ( (lv_packageName_6_0= ruleAndroidPackageName ) ) )? otherlv_7= 'platform' ( (lv_target_8_0= ruleApiLevel ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersionCode ) ) otherlv_11= '}'
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
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:520:1: ( (lv_version_10_0= ruleVersionCode ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:521:1: (lv_version_10_0= ruleVersionCode )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:521:1: (lv_version_10_0= ruleVersionCode )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:522:3: lv_version_10_0= ruleVersionCode
            {
             
            	        newCompositeNode(grammarAccess.getTargetApplicationAccess().getVersionVersionCodeParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleVersionCode_in_ruleTargetApplication1163);
            lv_version_10_0=ruleVersionCode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_10_0, 
                    		"VersionCode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleTargetApplication1175); 

                	newLeafNode(otherlv_11, grammarAccess.getTargetApplicationAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleVersionCode"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:550:1: entryRuleVersionCode returns [String current=null] : iv_ruleVersionCode= ruleVersionCode EOF ;
    public final String entryRuleVersionCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionCode = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:551:2: (iv_ruleVersionCode= ruleVersionCode EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:552:2: iv_ruleVersionCode= ruleVersionCode EOF
            {
             newCompositeNode(grammarAccess.getVersionCodeRule()); 
            pushFollow(FOLLOW_ruleVersionCode_in_entryRuleVersionCode1212);
            iv_ruleVersionCode=ruleVersionCode();

            state._fsp--;

             current =iv_ruleVersionCode.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionCode1223); 

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
    // $ANTLR end "entryRuleVersionCode"


    // $ANTLR start "ruleVersionCode"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:559:1: ruleVersionCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleVersionCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:562:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:563:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:563:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:563:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersionCode1263); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionCodeAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleVersionCode1281); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionCodeAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersionCode1296); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionCodeAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleVersionCode"


    // $ANTLR start "entryRuleAndroidPackageName"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:591:1: entryRuleAndroidPackageName returns [String current=null] : iv_ruleAndroidPackageName= ruleAndroidPackageName EOF ;
    public final String entryRuleAndroidPackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndroidPackageName = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:592:2: (iv_ruleAndroidPackageName= ruleAndroidPackageName EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:593:2: iv_ruleAndroidPackageName= ruleAndroidPackageName EOF
            {
             newCompositeNode(grammarAccess.getAndroidPackageNameRule()); 
            pushFollow(FOLLOW_ruleAndroidPackageName_in_entryRuleAndroidPackageName1342);
            iv_ruleAndroidPackageName=ruleAndroidPackageName();

            state._fsp--;

             current =iv_ruleAndroidPackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidPackageName1353); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:600:1: ruleAndroidPackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleAndroidPackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:603:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:604:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:604:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:604:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidPackageName1393); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAndroidPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:611:1: (kw= '.' this_ID_2= RULE_ID )+
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
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:612:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleAndroidPackageName1412); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAndroidPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidPackageName1427); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:632:1: entryRuleAndroidApplication returns [EObject current=null] : iv_ruleAndroidApplication= ruleAndroidApplication EOF ;
    public final EObject entryRuleAndroidApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidApplication = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:633:2: (iv_ruleAndroidApplication= ruleAndroidApplication EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:634:2: iv_ruleAndroidApplication= ruleAndroidApplication EOF
            {
             newCompositeNode(grammarAccess.getAndroidApplicationRule()); 
            pushFollow(FOLLOW_ruleAndroidApplication_in_entryRuleAndroidApplication1474);
            iv_ruleAndroidApplication=ruleAndroidApplication();

            state._fsp--;

             current =iv_ruleAndroidApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidApplication1484); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:641:1: ruleAndroidApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )? ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:644:28: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )? ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:645:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )? ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:645:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )? ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:645:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )? ( (lv_mainActivity_5_0= ruleActivity ) ) ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAndroidApplication1521); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroidApplicationAccess().getApplicationKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:649:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:650:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:650:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:651:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidApplication1538); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroidApplication1555); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroidApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:671:1: (otherlv_3= 'datamodel' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:671:3: otherlv_3= 'datamodel' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAndroidApplication1568); 

                        	newLeafNode(otherlv_3, grammarAccess.getAndroidApplicationAccess().getDatamodelKeyword_3_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:675:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:676:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:676:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:677:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAndroidApplicationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getDatarootAndroDataModelRootCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAndroidApplication1591);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:690:4: ( (lv_mainActivity_5_0= ruleActivity ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:691:1: (lv_mainActivity_5_0= ruleActivity )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:691:1: (lv_mainActivity_5_0= ruleActivity )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:692:3: lv_mainActivity_5_0= ruleActivity
            {
             
            	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getMainActivityActivityParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleActivity_in_ruleAndroidApplication1614);
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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:708:2: ( (lv_modelElements_6_0= ruleAndroidApplicationModelElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:709:1: (lv_modelElements_6_0= ruleAndroidApplicationModelElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:709:1: (lv_modelElements_6_0= ruleAndroidApplicationModelElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:710:3: lv_modelElements_6_0= ruleAndroidApplicationModelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroidApplicationAccess().getModelElementsAndroidApplicationModelElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndroidApplicationModelElement_in_ruleAndroidApplication1635);
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
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleAndroidApplication1648); 

                	newLeafNode(otherlv_7, grammarAccess.getAndroidApplicationAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:738:1: entryRuleAndroidApplicationModelElement returns [EObject current=null] : iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF ;
    public final EObject entryRuleAndroidApplicationModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidApplicationModelElement = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:739:2: (iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:740:2: iv_ruleAndroidApplicationModelElement= ruleAndroidApplicationModelElement EOF
            {
             newCompositeNode(grammarAccess.getAndroidApplicationModelElementRule()); 
            pushFollow(FOLLOW_ruleAndroidApplicationModelElement_in_entryRuleAndroidApplicationModelElement1684);
            iv_ruleAndroidApplicationModelElement=ruleAndroidApplicationModelElement();

            state._fsp--;

             current =iv_ruleAndroidApplicationModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidApplicationModelElement1694); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:747:1: ruleAndroidApplicationModelElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity ) ;
    public final EObject ruleAndroidApplicationModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_TabActivity_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:750:28: ( (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:751:1: (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:751:1: (this_Activity_0= ruleActivity | this_TabActivity_1= ruleTabActivity )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:752:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getAndroidApplicationModelElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleAndroidApplicationModelElement1741);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:762:5: this_TabActivity_1= ruleTabActivity
                    {
                     
                            newCompositeNode(grammarAccess.getAndroidApplicationModelElementAccess().getTabActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTabActivity_in_ruleAndroidApplicationModelElement1768);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:778:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:779:2: (iv_ruleActivity= ruleActivity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:780:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1803);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1813); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:787:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:790:28: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:791:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:791:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:791:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'layout' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleActivity1850); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:795:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:796:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:796:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:797:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1867); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleActivity1884); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLayoutKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:817:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:818:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:818:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:819:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getLayoutRootLayoutCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity1907);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:840:1: entryRuleTabActivity returns [EObject current=null] : iv_ruleTabActivity= ruleTabActivity EOF ;
    public final EObject entryRuleTabActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabActivity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:841:2: (iv_ruleTabActivity= ruleTabActivity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:842:2: iv_ruleTabActivity= ruleTabActivity EOF
            {
             newCompositeNode(grammarAccess.getTabActivityRule()); 
            pushFollow(FOLLOW_ruleTabActivity_in_entryRuleTabActivity1943);
            iv_ruleTabActivity=ruleTabActivity();

            state._fsp--;

             current =iv_ruleTabActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabActivity1953); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:849:1: ruleTabActivity returns [EObject current=null] : (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTabActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:852:28: ( (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:853:1: (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:853:1: (otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:853:3: otherlv_0= 'tabactivity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleTabActivity1990); 

                	newLeafNode(otherlv_0, grammarAccess.getTabActivityAccess().getTabactivityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:857:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:858:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:858:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabActivity2007); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:883:1: entryRuleAndroDataModelRoot returns [EObject current=null] : iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF ;
    public final EObject entryRuleAndroDataModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroDataModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:884:2: (iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:885:2: iv_ruleAndroDataModelRoot= ruleAndroDataModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroDataModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroDataModelRoot_in_entryRuleAndroDataModelRoot2048);
            iv_ruleAndroDataModelRoot=ruleAndroDataModelRoot();

            state._fsp--;

             current =iv_ruleAndroDataModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroDataModelRoot2058); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:892:1: ruleAndroDataModelRoot returns [EObject current=null] : (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroDataModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:895:28: ( (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:896:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:896:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:896:3: otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAndroDataModelRoot2095); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroDataModelRootAccess().getDatamodelKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:900:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:901:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:901:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:902:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroDataModelRoot2112); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroDataModelRoot2129); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroDataModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:922:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:923:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:923:1: (lv_entities_3_0= ruleEntity )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:924:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroDataModelRootAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleAndroDataModelRoot2150);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroDataModelRoot2163); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:952:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:953:2: (iv_ruleEntity= ruleEntity EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:954:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2199);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2209); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:961:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:964:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:965:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:965:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:965:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleEntity2246); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:969:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:970:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:970:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:971:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2263); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:987:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:987:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleEntity2281); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:991:1: ( (otherlv_3= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:992:1: (otherlv_3= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:992:1: (otherlv_3= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:993:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2301); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEntity2315); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1008:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1009:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1009:1: (lv_properties_5_0= ruleProperty )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1010:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2336);
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
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEntity2349); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1038:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1039:2: (iv_ruleProperty= ruleProperty EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1040:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2385);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2395); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1047:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1050:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1051:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1051:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1051:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1051:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1052:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1052:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1053:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2437); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleProperty2454); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1073:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1074:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1074:1: (lv_type_2_0= ruleTypeRef )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1075:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleProperty2475);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1099:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1100:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1101:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2511);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2521); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1108:1: ruleTypeRef returns [EObject current=null] : (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypesRef_0 = null;

        EObject this_EntityTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1111:28: ( (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1112:1: (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1112:1: (this_DataTypesRef_0= ruleDataTypesRef | this_EntityTypeRef_1= ruleEntityTypeRef )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=86 && LA15_0<=89)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1113:5: this_DataTypesRef_0= ruleDataTypesRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getDataTypesRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataTypesRef_in_ruleTypeRef2568);
                    this_DataTypesRef_0=ruleDataTypesRef();

                    state._fsp--;

                     
                            current = this_DataTypesRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1123:5: this_EntityTypeRef_1= ruleEntityTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getEntityTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityTypeRef_in_ruleTypeRef2595);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1139:1: entryRuleDataTypesRef returns [EObject current=null] : iv_ruleDataTypesRef= ruleDataTypesRef EOF ;
    public final EObject entryRuleDataTypesRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypesRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1140:2: (iv_ruleDataTypesRef= ruleDataTypesRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1141:2: iv_ruleDataTypesRef= ruleDataTypesRef EOF
            {
             newCompositeNode(grammarAccess.getDataTypesRefRule()); 
            pushFollow(FOLLOW_ruleDataTypesRef_in_entryRuleDataTypesRef2630);
            iv_ruleDataTypesRef=ruleDataTypesRef();

            state._fsp--;

             current =iv_ruleDataTypesRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypesRef2640); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1148:1: ruleDataTypesRef returns [EObject current=null] : ( (lv_type_0_0= ruleDataTypes ) ) ;
    public final EObject ruleDataTypesRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1151:28: ( ( (lv_type_0_0= ruleDataTypes ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1152:1: ( (lv_type_0_0= ruleDataTypes ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1152:1: ( (lv_type_0_0= ruleDataTypes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1153:1: (lv_type_0_0= ruleDataTypes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1153:1: (lv_type_0_0= ruleDataTypes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1154:3: lv_type_0_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypesRefAccess().getTypeDataTypesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleDataTypesRef2685);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1178:1: entryRuleEntityTypeRef returns [EObject current=null] : iv_ruleEntityTypeRef= ruleEntityTypeRef EOF ;
    public final EObject entryRuleEntityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeRef = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1179:2: (iv_ruleEntityTypeRef= ruleEntityTypeRef EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1180:2: iv_ruleEntityTypeRef= ruleEntityTypeRef EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRefRule()); 
            pushFollow(FOLLOW_ruleEntityTypeRef_in_entryRuleEntityTypeRef2720);
            iv_ruleEntityTypeRef=ruleEntityTypeRef();

            state._fsp--;

             current =iv_ruleEntityTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityTypeRef2730); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1187:1: ruleEntityTypeRef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleEntityTypeRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1190:28: ( ( ( ruleQualifiedName ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1191:1: ( ( ruleQualifiedName ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1191:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1192:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1192:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1193:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityTypeRefAccess().getTypeEntityCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntityTypeRef2777);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1214:1: entryRuleAndroGuiModelRoot returns [EObject current=null] : iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF ;
    public final EObject entryRuleAndroGuiModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroGuiModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1215:2: (iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1216:2: iv_ruleAndroGuiModelRoot= ruleAndroGuiModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroGuiModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroGuiModelRoot_in_entryRuleAndroGuiModelRoot2812);
            iv_ruleAndroGuiModelRoot=ruleAndroGuiModelRoot();

            state._fsp--;

             current =iv_ruleAndroGuiModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroGuiModelRoot2822); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1223:1: ruleAndroGuiModelRoot returns [EObject current=null] : (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroGuiModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rootLayout_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1226:28: ( (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1227:1: (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1227:1: (otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1227:3: otherlv_0= 'guimodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rootLayout_3_0= ruleRootLayout ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAndroGuiModelRoot2859); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroGuiModelRootAccess().getGuimodelKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1231:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1232:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1232:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1233:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroGuiModelRoot2876); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroGuiModelRoot2893); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroGuiModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1253:1: ( (lv_rootLayout_3_0= ruleRootLayout ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=33)||(LA16_0>=36 && LA16_0<=37)||LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1254:1: (lv_rootLayout_3_0= ruleRootLayout )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1254:1: (lv_rootLayout_3_0= ruleRootLayout )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1255:3: lv_rootLayout_3_0= ruleRootLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroGuiModelRootAccess().getRootLayoutRootLayoutParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRootLayout_in_ruleAndroGuiModelRoot2914);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroGuiModelRoot2927); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1283:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1284:2: (iv_ruleUIElement= ruleUIElement EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1285:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement2963);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement2973); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1292:1: ruleUIElement returns [EObject current=null] : (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Widget_0 = null;

        EObject this_Layout_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1295:28: ( (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1296:1: (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1296:1: (this_Widget_0= ruleWidget | this_Layout_1= ruleLayout )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=38 && LA17_0<=41)||(LA17_0>=44 && LA17_0<=48)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=32 && LA17_0<=33)||(LA17_0>=36 && LA17_0<=37)||LA17_0==53) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1297:5: this_Widget_0= ruleWidget
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getWidgetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWidget_in_ruleUIElement3020);
                    this_Widget_0=ruleWidget();

                    state._fsp--;

                     
                            current = this_Widget_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1307:5: this_Layout_1= ruleLayout
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLayout_in_ruleUIElement3047);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1323:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1324:2: (iv_ruleLayout= ruleLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1325:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout3082);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout3092); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1332:1: ruleLayout returns [EObject current=null] : this_RootLayout_0= ruleRootLayout ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_RootLayout_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1335:28: (this_RootLayout_0= ruleRootLayout )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1337:5: this_RootLayout_0= ruleRootLayout
            {
             
                    newCompositeNode(grammarAccess.getLayoutAccess().getRootLayoutParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRootLayout_in_ruleLayout3138);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1353:1: entryRuleRootLayout returns [EObject current=null] : iv_ruleRootLayout= ruleRootLayout EOF ;
    public final EObject entryRuleRootLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1354:2: (iv_ruleRootLayout= ruleRootLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1355:2: iv_ruleRootLayout= ruleRootLayout EOF
            {
             newCompositeNode(grammarAccess.getRootLayoutRule()); 
            pushFollow(FOLLOW_ruleRootLayout_in_entryRuleRootLayout3172);
            iv_ruleRootLayout=ruleRootLayout();

            state._fsp--;

             current =iv_ruleRootLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootLayout3182); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1362:1: ruleRootLayout returns [EObject current=null] : (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen ) ;
    public final EObject ruleRootLayout() throws RecognitionException {
        EObject current = null;

        EObject this_BaseLayout_0 = null;

        EObject this_PreferenceScreen_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1365:28: ( (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1366:1: (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1366:1: (this_BaseLayout_0= ruleBaseLayout | this_PreferenceScreen_1= rulePreferenceScreen )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=33)||(LA18_0>=36 && LA18_0<=37)) ) {
                alt18=1;
            }
            else if ( (LA18_0==53) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1367:5: this_BaseLayout_0= ruleBaseLayout
                    {
                     
                            newCompositeNode(grammarAccess.getRootLayoutAccess().getBaseLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseLayout_in_ruleRootLayout3229);
                    this_BaseLayout_0=ruleBaseLayout();

                    state._fsp--;

                     
                            current = this_BaseLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1377:5: this_PreferenceScreen_1= rulePreferenceScreen
                    {
                     
                            newCompositeNode(grammarAccess.getRootLayoutAccess().getPreferenceScreenParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePreferenceScreen_in_ruleRootLayout3256);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1393:1: entryRuleBaseLayout returns [EObject current=null] : iv_ruleBaseLayout= ruleBaseLayout EOF ;
    public final EObject entryRuleBaseLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1394:2: (iv_ruleBaseLayout= ruleBaseLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1395:2: iv_ruleBaseLayout= ruleBaseLayout EOF
            {
             newCompositeNode(grammarAccess.getBaseLayoutRule()); 
            pushFollow(FOLLOW_ruleBaseLayout_in_entryRuleBaseLayout3291);
            iv_ruleBaseLayout=ruleBaseLayout();

            state._fsp--;

             current =iv_ruleBaseLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseLayout3301); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1402:1: ruleBaseLayout returns [EObject current=null] : (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout ) ;
    public final EObject ruleBaseLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LinearLayout_0 = null;

        EObject this_AbsoluteLayout_1 = null;

        EObject this_FrameLayout_2 = null;

        EObject this_RelativeLayout_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1405:28: ( (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1406:1: (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1406:1: (this_LinearLayout_0= ruleLinearLayout | this_AbsoluteLayout_1= ruleAbsoluteLayout | this_FrameLayout_2= ruleFrameLayout | this_RelativeLayout_3= ruleRelativeLayout )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1407:5: this_LinearLayout_0= ruleLinearLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getLinearLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinearLayout_in_ruleBaseLayout3348);
                    this_LinearLayout_0=ruleLinearLayout();

                    state._fsp--;

                     
                            current = this_LinearLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1417:5: this_AbsoluteLayout_1= ruleAbsoluteLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getAbsoluteLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbsoluteLayout_in_ruleBaseLayout3375);
                    this_AbsoluteLayout_1=ruleAbsoluteLayout();

                    state._fsp--;

                     
                            current = this_AbsoluteLayout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1427:5: this_FrameLayout_2= ruleFrameLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getFrameLayoutParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFrameLayout_in_ruleBaseLayout3402);
                    this_FrameLayout_2=ruleFrameLayout();

                    state._fsp--;

                     
                            current = this_FrameLayout_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1437:5: this_RelativeLayout_3= ruleRelativeLayout
                    {
                     
                            newCompositeNode(grammarAccess.getBaseLayoutAccess().getRelativeLayoutParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRelativeLayout_in_ruleBaseLayout3429);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1453:1: entryRuleAbsoluteLayout returns [EObject current=null] : iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF ;
    public final EObject entryRuleAbsoluteLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1454:2: (iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1455:2: iv_ruleAbsoluteLayout= ruleAbsoluteLayout EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteLayoutRule()); 
            pushFollow(FOLLOW_ruleAbsoluteLayout_in_entryRuleAbsoluteLayout3464);
            iv_ruleAbsoluteLayout=ruleAbsoluteLayout();

            state._fsp--;

             current =iv_ruleAbsoluteLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteLayout3474); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1462:1: ruleAbsoluteLayout returns [EObject current=null] : (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1465:28: ( (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1466:1: (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1466:1: (otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1466:3: otherlv_0= 'absolutelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAbsoluteLayout3511); 

                	newLeafNode(otherlv_0, grammarAccess.getAbsoluteLayoutAccess().getAbsolutelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1470:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1471:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1471:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbsoluteLayout3528); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1488:2: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1489:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1489:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1490:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getAbsoluteLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleAbsoluteLayout3554);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAbsoluteLayout3566); 

                	newLeafNode(otherlv_3, grammarAccess.getAbsoluteLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1510:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=32 && LA20_0<=33)||(LA20_0>=36 && LA20_0<=41)||(LA20_0>=44 && LA20_0<=48)||LA20_0==53) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1511:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1511:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1512:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbsoluteLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleAbsoluteLayout3587);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleAbsoluteLayout3600); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1540:1: entryRuleLinearLayout returns [EObject current=null] : iv_ruleLinearLayout= ruleLinearLayout EOF ;
    public final EObject entryRuleLinearLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1541:2: (iv_ruleLinearLayout= ruleLinearLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1542:2: iv_ruleLinearLayout= ruleLinearLayout EOF
            {
             newCompositeNode(grammarAccess.getLinearLayoutRule()); 
            pushFollow(FOLLOW_ruleLinearLayout_in_entryRuleLinearLayout3636);
            iv_ruleLinearLayout=ruleLinearLayout();

            state._fsp--;

             current =iv_ruleLinearLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearLayout3646); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1549:1: ruleLinearLayout returns [EObject current=null] : (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1552:28: ( (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1553:1: (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1553:1: (otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1553:3: otherlv_0= 'linearlayout' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleUIElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLinearLayout3683); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearLayoutAccess().getLinearlayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1557:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1558:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1558:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1559:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinearLayout3700); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1575:2: ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1575:3: ( (lv_orientation_2_0= 'horizontal' ) )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1575:3: ( (lv_orientation_2_0= 'horizontal' ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1576:1: (lv_orientation_2_0= 'horizontal' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1576:1: (lv_orientation_2_0= 'horizontal' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1577:3: lv_orientation_2_0= 'horizontal'
                    {
                    lv_orientation_2_0=(Token)match(input,34,FOLLOW_34_in_ruleLinearLayout3724); 

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
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1591:7: otherlv_3= 'vertical'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleLinearLayout3755); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinearLayoutAccess().getVerticalKeyword_2_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1595:3: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1596:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1596:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1597:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getLinearLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleLinearLayout3778);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleLinearLayout3790); 

                	newLeafNode(otherlv_5, grammarAccess.getLinearLayoutAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1617:1: ( (lv_elements_6_0= ruleUIElement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=33)||(LA22_0>=36 && LA22_0<=41)||(LA22_0>=44 && LA22_0<=48)||LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1618:1: (lv_elements_6_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1618:1: (lv_elements_6_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1619:3: lv_elements_6_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinearLayoutAccess().getElementsUIElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleLinearLayout3811);
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
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleLinearLayout3824); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1647:1: entryRuleFrameLayout returns [EObject current=null] : iv_ruleFrameLayout= ruleFrameLayout EOF ;
    public final EObject entryRuleFrameLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrameLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1648:2: (iv_ruleFrameLayout= ruleFrameLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1649:2: iv_ruleFrameLayout= ruleFrameLayout EOF
            {
             newCompositeNode(grammarAccess.getFrameLayoutRule()); 
            pushFollow(FOLLOW_ruleFrameLayout_in_entryRuleFrameLayout3860);
            iv_ruleFrameLayout=ruleFrameLayout();

            state._fsp--;

             current =iv_ruleFrameLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameLayout3870); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1656:1: ruleFrameLayout returns [EObject current=null] : (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1659:28: ( (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1660:1: (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1660:1: (otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1660:3: otherlv_0= 'framelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFrameLayout3907); 

                	newLeafNode(otherlv_0, grammarAccess.getFrameLayoutAccess().getFramelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1664:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1665:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1665:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1666:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrameLayout3924); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1682:2: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1683:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1683:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1684:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getFrameLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleFrameLayout3950);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFrameLayout3962); 

                	newLeafNode(otherlv_3, grammarAccess.getFrameLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1704:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=32 && LA23_0<=33)||(LA23_0>=36 && LA23_0<=41)||(LA23_0>=44 && LA23_0<=48)||LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1705:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1705:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1706:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleFrameLayout3983);
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
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFrameLayout3996); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1734:1: entryRuleRelativeLayout returns [EObject current=null] : iv_ruleRelativeLayout= ruleRelativeLayout EOF ;
    public final EObject entryRuleRelativeLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeLayout = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1735:2: (iv_ruleRelativeLayout= ruleRelativeLayout EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1736:2: iv_ruleRelativeLayout= ruleRelativeLayout EOF
            {
             newCompositeNode(grammarAccess.getRelativeLayoutRule()); 
            pushFollow(FOLLOW_ruleRelativeLayout_in_entryRuleRelativeLayout4032);
            iv_ruleRelativeLayout=ruleRelativeLayout();

            state._fsp--;

             current =iv_ruleRelativeLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeLayout4042); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1743:1: ruleRelativeLayout returns [EObject current=null] : (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1746:28: ( (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1747:1: (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1747:1: (otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1747:3: otherlv_0= 'relativelayout' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleRelativeLayout4079); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeLayoutAccess().getRelativelayoutKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1751:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1752:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1752:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelativeLayout4096); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1769:2: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1770:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1770:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1771:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRelativeLayoutAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRelativeLayout4122);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRelativeLayout4134); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1791:1: ( (lv_elements_4_0= ruleUIElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=32 && LA24_0<=33)||(LA24_0>=36 && LA24_0<=41)||(LA24_0>=44 && LA24_0<=48)||LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1792:1: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1792:1: (lv_elements_4_0= ruleUIElement )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1793:3: lv_elements_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativeLayoutAccess().getElementsUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleRelativeLayout4155);
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
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRelativeLayout4168); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1821:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1822:2: (iv_ruleWidget= ruleWidget EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1823:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget4204);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget4214); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1830:1: ruleWidget returns [EObject current=null] : (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1833:28: ( (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1834:1: (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1834:1: (this_TextView_0= ruleTextView | this_EditText_1= ruleEditText | this_Button_2= ruleButton | this_ListView_3= ruleListView | this_Spinner_4= ruleSpinner | this_RadioGroup_5= ruleRadioGroup | this_CheckBox_6= ruleCheckBox | this_RatingBar_7= ruleRatingBar | this_ToggleButton_8= ruleToggleButton )
            int alt25=9;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            case 44:
                {
                alt25=5;
                }
                break;
            case 46:
                {
                alt25=6;
                }
                break;
            case 45:
                {
                alt25=7;
                }
                break;
            case 47:
                {
                alt25=8;
                }
                break;
            case 48:
                {
                alt25=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1835:5: this_TextView_0= ruleTextView
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextView_in_ruleWidget4261);
                    this_TextView_0=ruleTextView();

                    state._fsp--;

                     
                            current = this_TextView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1845:5: this_EditText_1= ruleEditText
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEditText_in_ruleWidget4288);
                    this_EditText_1=ruleEditText();

                    state._fsp--;

                     
                            current = this_EditText_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1855:5: this_Button_2= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleWidget4315);
                    this_Button_2=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1865:5: this_ListView_3= ruleListView
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getListViewParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleListView_in_ruleWidget4342);
                    this_ListView_3=ruleListView();

                    state._fsp--;

                     
                            current = this_ListView_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1875:5: this_Spinner_4= ruleSpinner
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSpinner_in_ruleWidget4369);
                    this_Spinner_4=ruleSpinner();

                    state._fsp--;

                     
                            current = this_Spinner_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1885:5: this_RadioGroup_5= ruleRadioGroup
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getRadioGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadioGroup_in_ruleWidget4396);
                    this_RadioGroup_5=ruleRadioGroup();

                    state._fsp--;

                     
                            current = this_RadioGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1895:5: this_CheckBox_6= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCheckBoxParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleWidget4423);
                    this_CheckBox_6=ruleCheckBox();

                    state._fsp--;

                     
                            current = this_CheckBox_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1905:5: this_RatingBar_7= ruleRatingBar
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getRatingBarParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleRatingBar_in_ruleWidget4450);
                    this_RatingBar_7=ruleRatingBar();

                    state._fsp--;

                     
                            current = this_RatingBar_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1915:5: this_ToggleButton_8= ruleToggleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getToggleButtonParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleToggleButton_in_ruleWidget4477);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1931:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1932:2: (iv_ruleTextView= ruleTextView EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1933:2: iv_ruleTextView= ruleTextView EOF
            {
             newCompositeNode(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_ruleTextView_in_entryRuleTextView4512);
            iv_ruleTextView=ruleTextView();

            state._fsp--;

             current =iv_ruleTextView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextView4522); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1940:1: ruleTextView returns [EObject current=null] : (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1943:28: ( (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1944:1: (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1944:1: (otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1944:3: otherlv_0= 'textview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTextView4559); 

                	newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTextviewKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1948:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1949:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1949:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1950:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextView4576); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1966:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1967:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1967:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1968:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextView4598); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1984:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1985:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1985:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:1986:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getTextViewAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleTextView4624);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2010:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2011:2: (iv_ruleEditText= ruleEditText EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2012:2: iv_ruleEditText= ruleEditText EOF
            {
             newCompositeNode(grammarAccess.getEditTextRule()); 
            pushFollow(FOLLOW_ruleEditText_in_entryRuleEditText4660);
            iv_ruleEditText=ruleEditText();

            state._fsp--;

             current =iv_ruleEditText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditText4670); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2019:1: ruleEditText returns [EObject current=null] : (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2022:28: ( (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2023:1: (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2023:1: (otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2023:3: otherlv_0= 'edittext' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEditText4707); 

                	newLeafNode(otherlv_0, grammarAccess.getEditTextAccess().getEdittextKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2027:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2028:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2028:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2029:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditText4724); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2045:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2046:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2046:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2047:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditText4746); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2063:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2064:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2064:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2065:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getEditTextAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleEditText4772);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2089:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2090:2: (iv_ruleButton= ruleButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2091:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton4808);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton4818); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2098:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2101:28: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2102:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2102:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2102:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleButton4855); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2106:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2107:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2107:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2108:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton4872); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2124:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2125:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2125:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2126:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton4894); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2142:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2143:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2143:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2144:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleButton4920);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2168:1: entryRuleListView returns [EObject current=null] : iv_ruleListView= ruleListView EOF ;
    public final EObject entryRuleListView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListView = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2169:2: (iv_ruleListView= ruleListView EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2170:2: iv_ruleListView= ruleListView EOF
            {
             newCompositeNode(grammarAccess.getListViewRule()); 
            pushFollow(FOLLOW_ruleListView_in_entryRuleListView4956);
            iv_ruleListView=ruleListView();

            state._fsp--;

             current =iv_ruleListView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListView4966); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2177:1: ruleListView returns [EObject current=null] : (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2180:28: ( (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2181:1: (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2181:1: (otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2181:3: otherlv_0= 'listview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_layoutStyle_2_0= ruleLayoutStyle ) ) otherlv_3= '{' (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleListView5003); 

                	newLeafNode(otherlv_0, grammarAccess.getListViewAccess().getListviewKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2186:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2186:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListView5020); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2203:2: ( (lv_layoutStyle_2_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2204:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2204:1: (lv_layoutStyle_2_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2205:3: lv_layoutStyle_2_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getListViewAccess().getLayoutStyleLayoutStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleListView5046);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleListView5058); 

                	newLeafNode(otherlv_3, grammarAccess.getListViewAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2225:1: (otherlv_4= 'entries' ( ( ruleQualifiedName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2225:3: otherlv_4= 'entries' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleListView5071); 

                        	newLeafNode(otherlv_4, grammarAccess.getListViewAccess().getEntriesKeyword_4_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2229:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2230:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2230:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2231:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getListViewAccess().getEntriesArrayResourceCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleListView5094);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2244:4: (otherlv_6= 'listitem' ( ( ruleQualifiedName ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2244:6: otherlv_6= 'listitem' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleListView5109); 

                        	newLeafNode(otherlv_6, grammarAccess.getListViewAccess().getListitemKeyword_5_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2248:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2249:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2249:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2250:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getListViewAccess().getLayoutLayoutCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleListView5132);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleListView5146); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2275:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2276:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2277:2: iv_ruleSpinner= ruleSpinner EOF
            {
             newCompositeNode(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_ruleSpinner_in_entryRuleSpinner5182);
            iv_ruleSpinner=ruleSpinner();

            state._fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinner5192); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2284:1: ruleSpinner returns [EObject current=null] : (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_layoutStyle_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2287:28: ( (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2288:1: (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2288:1: (otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2288:3: otherlv_0= 'spinner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSpinner5229); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinnerAccess().getSpinnerKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2292:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2293:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2293:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2294:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinner5246); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2310:2: (otherlv_2= 'entries' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2310:4: otherlv_2= 'entries' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSpinner5264); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpinnerAccess().getEntriesKeyword_2_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2314:1: ( ( ruleQualifiedName ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2315:1: ( ruleQualifiedName )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2315:1: ( ruleQualifiedName )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2316:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinnerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSpinnerAccess().getEntriesResourceCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpinner5287);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2329:4: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2330:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2330:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2331:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getSpinnerAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleSpinner5310);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2355:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2356:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2357:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox5346);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox5356); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2364:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2367:28: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2368:1: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2368:1: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2368:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCheckBox5393); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckboxKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2372:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2373:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2373:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2374:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBox5410); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2390:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2391:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2391:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2392:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckBox5432); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2408:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2409:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2409:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2410:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getCheckBoxAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleCheckBox5458);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2434:1: entryRuleRadioGroup returns [EObject current=null] : iv_ruleRadioGroup= ruleRadioGroup EOF ;
    public final EObject entryRuleRadioGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioGroup = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2435:2: (iv_ruleRadioGroup= ruleRadioGroup EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2436:2: iv_ruleRadioGroup= ruleRadioGroup EOF
            {
             newCompositeNode(grammarAccess.getRadioGroupRule()); 
            pushFollow(FOLLOW_ruleRadioGroup_in_entryRuleRadioGroup5494);
            iv_ruleRadioGroup=ruleRadioGroup();

            state._fsp--;

             current =iv_ruleRadioGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioGroup5504); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2443:1: ruleRadioGroup returns [EObject current=null] : (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2446:28: ( (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2447:1: (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2447:1: (otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2447:3: otherlv_0= 'radiogroup' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )? ( (lv_layoutStyle_4_0= ruleLayoutStyle ) ) otherlv_5= '{' ( (lv_radiobuttons_6_0= ruleRadioButton ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleRadioGroup5541); 

                	newLeafNode(otherlv_0, grammarAccess.getRadioGroupAccess().getRadiogroupKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2451:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2452:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2452:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2453:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRadioGroup5558); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2469:2: ( ( (lv_orientation_2_0= 'horizontal' ) ) | otherlv_3= 'vertical' )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            else if ( (LA29_0==35) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2469:3: ( (lv_orientation_2_0= 'horizontal' ) )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2469:3: ( (lv_orientation_2_0= 'horizontal' ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2470:1: (lv_orientation_2_0= 'horizontal' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2470:1: (lv_orientation_2_0= 'horizontal' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2471:3: lv_orientation_2_0= 'horizontal'
                    {
                    lv_orientation_2_0=(Token)match(input,34,FOLLOW_34_in_ruleRadioGroup5582); 

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
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2485:7: otherlv_3= 'vertical'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRadioGroup5613); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadioGroupAccess().getVerticalKeyword_2_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2489:3: ( (lv_layoutStyle_4_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2490:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2490:1: (lv_layoutStyle_4_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2491:3: lv_layoutStyle_4_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRadioGroupAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRadioGroup5636);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleRadioGroup5648); 

                	newLeafNode(otherlv_5, grammarAccess.getRadioGroupAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2511:1: ( (lv_radiobuttons_6_0= ruleRadioButton ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2512:1: (lv_radiobuttons_6_0= ruleRadioButton )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2512:1: (lv_radiobuttons_6_0= ruleRadioButton )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2513:3: lv_radiobuttons_6_0= ruleRadioButton
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRadioGroupAccess().getRadiobuttonsRadioButtonParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRadioButton_in_ruleRadioGroup5669);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRadioGroup5682); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2541:1: entryRuleRatingBar returns [EObject current=null] : iv_ruleRatingBar= ruleRatingBar EOF ;
    public final EObject entryRuleRatingBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingBar = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2542:2: (iv_ruleRatingBar= ruleRatingBar EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2543:2: iv_ruleRatingBar= ruleRatingBar EOF
            {
             newCompositeNode(grammarAccess.getRatingBarRule()); 
            pushFollow(FOLLOW_ruleRatingBar_in_entryRuleRatingBar5718);
            iv_ruleRatingBar=ruleRatingBar();

            state._fsp--;

             current =iv_ruleRatingBar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRatingBar5728); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2550:1: ruleRatingBar returns [EObject current=null] : (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleRatingBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_numStars_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2553:28: ( (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2554:1: (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2554:1: (otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2554:3: otherlv_0= 'ratingbar' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numStars_2_0= RULE_INT ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleRatingBar5765); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingBarAccess().getRatingbarKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2558:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2559:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2559:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRatingBar5782); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2576:2: ( (lv_numStars_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2577:1: (lv_numStars_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2577:1: (lv_numStars_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2578:3: lv_numStars_2_0= RULE_INT
            {
            lv_numStars_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRatingBar5804); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2594:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2595:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2595:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2596:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRatingBarAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRatingBar5830);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2620:1: entryRuleToggleButton returns [EObject current=null] : iv_ruleToggleButton= ruleToggleButton EOF ;
    public final EObject entryRuleToggleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToggleButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2621:2: (iv_ruleToggleButton= ruleToggleButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2622:2: iv_ruleToggleButton= ruleToggleButton EOF
            {
             newCompositeNode(grammarAccess.getToggleButtonRule()); 
            pushFollow(FOLLOW_ruleToggleButton_in_entryRuleToggleButton5866);
            iv_ruleToggleButton=ruleToggleButton();

            state._fsp--;

             current =iv_ruleToggleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToggleButton5876); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2629:1: ruleToggleButton returns [EObject current=null] : (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2632:28: ( (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2633:1: (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2633:1: (otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2633:3: otherlv_0= 'togglebutton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'textOn' ( (lv_textOn_3_0= RULE_STRING ) ) otherlv_4= 'textOff' ( (lv_textOff_5_0= RULE_STRING ) ) ( (lv_layoutStyle_6_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleToggleButton5913); 

                	newLeafNode(otherlv_0, grammarAccess.getToggleButtonAccess().getTogglebuttonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2637:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2638:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2638:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2639:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToggleButton5930); 

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

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleToggleButton5947); 

                	newLeafNode(otherlv_2, grammarAccess.getToggleButtonAccess().getTextOnKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2659:1: ( (lv_textOn_3_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2660:1: (lv_textOn_3_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2660:1: (lv_textOn_3_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2661:3: lv_textOn_3_0= RULE_STRING
            {
            lv_textOn_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToggleButton5964); 

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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleToggleButton5981); 

                	newLeafNode(otherlv_4, grammarAccess.getToggleButtonAccess().getTextOffKeyword_4());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2681:1: ( (lv_textOff_5_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2682:1: (lv_textOff_5_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2682:1: (lv_textOff_5_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2683:3: lv_textOff_5_0= RULE_STRING
            {
            lv_textOff_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleToggleButton5998); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2699:2: ( (lv_layoutStyle_6_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2700:1: (lv_layoutStyle_6_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2700:1: (lv_layoutStyle_6_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2701:3: lv_layoutStyle_6_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getToggleButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleToggleButton6024);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2725:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2726:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2727:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton6060);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton6070); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2734:1: ruleRadioButton returns [EObject current=null] : (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Enumerator lv_layoutStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2737:28: ( (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2738:1: (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2738:1: (otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2738:3: otherlv_0= 'radiobutton' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleRadioButton6107); 

                	newLeafNode(otherlv_0, grammarAccess.getRadioButtonAccess().getRadiobuttonKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2742:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2743:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2743:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2744:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRadioButton6124); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2760:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2761:1: (lv_text_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2761:1: (lv_text_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2762:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRadioButton6146); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2778:2: ( (lv_layoutStyle_3_0= ruleLayoutStyle ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2779:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2779:1: (lv_layoutStyle_3_0= ruleLayoutStyle )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2780:3: lv_layoutStyle_3_0= ruleLayoutStyle
            {
             
            	        newCompositeNode(grammarAccess.getRadioButtonAccess().getLayoutStyleLayoutStyleEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutStyle_in_ruleRadioButton6172);
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


    // $ANTLR start "entryRuleAbstractPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2804:1: entryRuleAbstractPreference returns [EObject current=null] : iv_ruleAbstractPreference= ruleAbstractPreference EOF ;
    public final EObject entryRuleAbstractPreference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPreference = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2805:2: (iv_ruleAbstractPreference= ruleAbstractPreference EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2806:2: iv_ruleAbstractPreference= ruleAbstractPreference EOF
            {
             newCompositeNode(grammarAccess.getAbstractPreferenceRule()); 
            pushFollow(FOLLOW_ruleAbstractPreference_in_entryRuleAbstractPreference6208);
            iv_ruleAbstractPreference=ruleAbstractPreference();

            state._fsp--;

             current =iv_ruleAbstractPreference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractPreference6218); 

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
    // $ANTLR end "entryRuleAbstractPreference"


    // $ANTLR start "ruleAbstractPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2813:1: ruleAbstractPreference returns [EObject current=null] : (this_Preference_0= rulePreference | this_EditTextPreference_1= ruleEditTextPreference | this_ListPreference_2= ruleListPreference | this_CheckBoxPreference_3= ruleCheckBoxPreference | this_RingtonePrefence_4= ruleRingtonePrefence | this_PreferenceCategory_5= rulePreferenceCategory | this_PreferenceScreen_6= rulePreferenceScreen ) ;
    public final EObject ruleAbstractPreference() throws RecognitionException {
        EObject current = null;

        EObject this_Preference_0 = null;

        EObject this_EditTextPreference_1 = null;

        EObject this_ListPreference_2 = null;

        EObject this_CheckBoxPreference_3 = null;

        EObject this_RingtonePrefence_4 = null;

        EObject this_PreferenceCategory_5 = null;

        EObject this_PreferenceScreen_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2816:28: ( (this_Preference_0= rulePreference | this_EditTextPreference_1= ruleEditTextPreference | this_ListPreference_2= ruleListPreference | this_CheckBoxPreference_3= ruleCheckBoxPreference | this_RingtonePrefence_4= ruleRingtonePrefence | this_PreferenceCategory_5= rulePreferenceCategory | this_PreferenceScreen_6= rulePreferenceScreen ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2817:1: (this_Preference_0= rulePreference | this_EditTextPreference_1= ruleEditTextPreference | this_ListPreference_2= ruleListPreference | this_CheckBoxPreference_3= ruleCheckBoxPreference | this_RingtonePrefence_4= ruleRingtonePrefence | this_PreferenceCategory_5= rulePreferenceCategory | this_PreferenceScreen_6= rulePreferenceScreen )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2817:1: (this_Preference_0= rulePreference | this_EditTextPreference_1= ruleEditTextPreference | this_ListPreference_2= ruleListPreference | this_CheckBoxPreference_3= ruleCheckBoxPreference | this_RingtonePrefence_4= ruleRingtonePrefence | this_PreferenceCategory_5= rulePreferenceCategory | this_PreferenceScreen_6= rulePreferenceScreen )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt31=1;
                }
                break;
            case 55:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case 58:
                {
                alt31=5;
                }
                break;
            case 54:
                {
                alt31=6;
                }
                break;
            case 53:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2818:5: this_Preference_0= rulePreference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getPreferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePreference_in_ruleAbstractPreference6265);
                    this_Preference_0=rulePreference();

                    state._fsp--;

                     
                            current = this_Preference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2828:5: this_EditTextPreference_1= ruleEditTextPreference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getEditTextPreferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEditTextPreference_in_ruleAbstractPreference6292);
                    this_EditTextPreference_1=ruleEditTextPreference();

                    state._fsp--;

                     
                            current = this_EditTextPreference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2838:5: this_ListPreference_2= ruleListPreference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getListPreferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListPreference_in_ruleAbstractPreference6319);
                    this_ListPreference_2=ruleListPreference();

                    state._fsp--;

                     
                            current = this_ListPreference_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2848:5: this_CheckBoxPreference_3= ruleCheckBoxPreference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getCheckBoxPreferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCheckBoxPreference_in_ruleAbstractPreference6346);
                    this_CheckBoxPreference_3=ruleCheckBoxPreference();

                    state._fsp--;

                     
                            current = this_CheckBoxPreference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2858:5: this_RingtonePrefence_4= ruleRingtonePrefence
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getRingtonePrefenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleRingtonePrefence_in_ruleAbstractPreference6373);
                    this_RingtonePrefence_4=ruleRingtonePrefence();

                    state._fsp--;

                     
                            current = this_RingtonePrefence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2868:5: this_PreferenceCategory_5= rulePreferenceCategory
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getPreferenceCategoryParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePreferenceCategory_in_ruleAbstractPreference6400);
                    this_PreferenceCategory_5=rulePreferenceCategory();

                    state._fsp--;

                     
                            current = this_PreferenceCategory_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2878:5: this_PreferenceScreen_6= rulePreferenceScreen
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPreferenceAccess().getPreferenceScreenParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePreferenceScreen_in_ruleAbstractPreference6427);
                    this_PreferenceScreen_6=rulePreferenceScreen();

                    state._fsp--;

                     
                            current = this_PreferenceScreen_6; 
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
    // $ANTLR end "ruleAbstractPreference"


    // $ANTLR start "entryRulePreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2894:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2895:2: (iv_rulePreference= rulePreference EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2896:2: iv_rulePreference= rulePreference EOF
            {
             newCompositeNode(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_rulePreference_in_entryRulePreference6462);
            iv_rulePreference=rulePreference();

            state._fsp--;

             current =iv_rulePreference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreference6472); 

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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2903:1: rulePreference returns [EObject current=null] : (otherlv_0= 'preference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preferenceAttributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2906:28: ( (otherlv_0= 'preference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2907:1: (otherlv_0= 'preference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2907:1: (otherlv_0= 'preference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2907:3: otherlv_0= 'preference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_rulePreference6509); 

                	newLeafNode(otherlv_0, grammarAccess.getPreferenceAccess().getPreferenceKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2911:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2912:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2912:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2913:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreference6526); 

            			newLeafNode(lv_title_1_0, grammarAccess.getPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePreference6543); 

                	newLeafNode(otherlv_2, grammarAccess.getPreferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2933:1: ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2934:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2934:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2935:3: lv_preferenceAttributes_3_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_rulePreference6564);
            lv_preferenceAttributes_3_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_3_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePreference6576); 

                	newLeafNode(otherlv_4, grammarAccess.getPreferenceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRulePreferenceScreen"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2963:1: entryRulePreferenceScreen returns [EObject current=null] : iv_rulePreferenceScreen= rulePreferenceScreen EOF ;
    public final EObject entryRulePreferenceScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferenceScreen = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2964:2: (iv_rulePreferenceScreen= rulePreferenceScreen EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2965:2: iv_rulePreferenceScreen= rulePreferenceScreen EOF
            {
             newCompositeNode(grammarAccess.getPreferenceScreenRule()); 
            pushFollow(FOLLOW_rulePreferenceScreen_in_entryRulePreferenceScreen6612);
            iv_rulePreferenceScreen=rulePreferenceScreen();

            state._fsp--;

             current =iv_rulePreferenceScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferenceScreen6622); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2972:1: rulePreferenceScreen returns [EObject current=null] : (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) ) ( (lv_preferences_5_0= ruleAbstractPreference ) )* otherlv_6= '}' ) ;
    public final EObject rulePreferenceScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_preferenceAttributes_4_0 = null;

        EObject lv_preferences_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2975:28: ( (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) ) ( (lv_preferences_5_0= ruleAbstractPreference ) )* otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2976:1: (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) ) ( (lv_preferences_5_0= ruleAbstractPreference ) )* otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2976:1: (otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) ) ( (lv_preferences_5_0= ruleAbstractPreference ) )* otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2976:3: otherlv_0= 'preferencescreen' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) ) ( (lv_preferences_5_0= ruleAbstractPreference ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulePreferenceScreen6659); 

                	newLeafNode(otherlv_0, grammarAccess.getPreferenceScreenAccess().getPreferencescreenKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2980:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2981:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2981:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2982:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreferenceScreen6676); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2998:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2999:1: (lv_title_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:2999:1: (lv_title_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3000:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferenceScreen6698); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePreferenceScreen6715); 

                	newLeafNode(otherlv_3, grammarAccess.getPreferenceScreenAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3020:1: ( (lv_preferenceAttributes_4_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3021:1: (lv_preferenceAttributes_4_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3021:1: (lv_preferenceAttributes_4_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3022:3: lv_preferenceAttributes_4_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getPreferenceScreenAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_rulePreferenceScreen6736);
            lv_preferenceAttributes_4_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPreferenceScreenRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_4_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3038:2: ( (lv_preferences_5_0= ruleAbstractPreference ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=52 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3039:1: (lv_preferences_5_0= ruleAbstractPreference )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3039:1: (lv_preferences_5_0= ruleAbstractPreference )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3040:3: lv_preferences_5_0= ruleAbstractPreference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreferenceScreenAccess().getPreferencesAbstractPreferenceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractPreference_in_rulePreferenceScreen6757);
            	    lv_preferences_5_0=ruleAbstractPreference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPreferenceScreenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"preferences",
            	            		lv_preferences_5_0, 
            	            		"AbstractPreference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePreferenceScreen6770); 

                	newLeafNode(otherlv_6, grammarAccess.getPreferenceScreenAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRulePreferenceCategory"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3068:1: entryRulePreferenceCategory returns [EObject current=null] : iv_rulePreferenceCategory= rulePreferenceCategory EOF ;
    public final EObject entryRulePreferenceCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferenceCategory = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3069:2: (iv_rulePreferenceCategory= rulePreferenceCategory EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3070:2: iv_rulePreferenceCategory= rulePreferenceCategory EOF
            {
             newCompositeNode(grammarAccess.getPreferenceCategoryRule()); 
            pushFollow(FOLLOW_rulePreferenceCategory_in_entryRulePreferenceCategory6806);
            iv_rulePreferenceCategory=rulePreferenceCategory();

            state._fsp--;

             current =iv_rulePreferenceCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferenceCategory6816); 

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
    // $ANTLR end "entryRulePreferenceCategory"


    // $ANTLR start "rulePreferenceCategory"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3077:1: rulePreferenceCategory returns [EObject current=null] : (otherlv_0= 'preferencecategery' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferences_3_0= ruleAbstractPreference ) )* otherlv_4= '}' ) ;
    public final EObject rulePreferenceCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preferences_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3080:28: ( (otherlv_0= 'preferencecategery' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferences_3_0= ruleAbstractPreference ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3081:1: (otherlv_0= 'preferencecategery' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferences_3_0= ruleAbstractPreference ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3081:1: (otherlv_0= 'preferencecategery' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferences_3_0= ruleAbstractPreference ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3081:3: otherlv_0= 'preferencecategery' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferences_3_0= ruleAbstractPreference ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_rulePreferenceCategory6853); 

                	newLeafNode(otherlv_0, grammarAccess.getPreferenceCategoryAccess().getPreferencecategeryKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3085:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3086:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3086:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3087:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferenceCategory6870); 

            			newLeafNode(lv_title_1_0, grammarAccess.getPreferenceCategoryAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferenceCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePreferenceCategory6887); 

                	newLeafNode(otherlv_2, grammarAccess.getPreferenceCategoryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3107:1: ( (lv_preferences_3_0= ruleAbstractPreference ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=52 && LA33_0<=58)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3108:1: (lv_preferences_3_0= ruleAbstractPreference )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3108:1: (lv_preferences_3_0= ruleAbstractPreference )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3109:3: lv_preferences_3_0= ruleAbstractPreference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreferenceCategoryAccess().getPreferencesAbstractPreferenceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractPreference_in_rulePreferenceCategory6908);
            	    lv_preferences_3_0=ruleAbstractPreference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPreferenceCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"preferences",
            	            		lv_preferences_3_0, 
            	            		"AbstractPreference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePreferenceCategory6921); 

                	newLeafNode(otherlv_4, grammarAccess.getPreferenceCategoryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePreferenceCategory"


    // $ANTLR start "entryRuleEditTextPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3137:1: entryRuleEditTextPreference returns [EObject current=null] : iv_ruleEditTextPreference= ruleEditTextPreference EOF ;
    public final EObject entryRuleEditTextPreference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditTextPreference = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3138:2: (iv_ruleEditTextPreference= ruleEditTextPreference EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3139:2: iv_ruleEditTextPreference= ruleEditTextPreference EOF
            {
             newCompositeNode(grammarAccess.getEditTextPreferenceRule()); 
            pushFollow(FOLLOW_ruleEditTextPreference_in_entryRuleEditTextPreference6957);
            iv_ruleEditTextPreference=ruleEditTextPreference();

            state._fsp--;

             current =iv_ruleEditTextPreference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditTextPreference6967); 

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
    // $ANTLR end "entryRuleEditTextPreference"


    // $ANTLR start "ruleEditTextPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3146:1: ruleEditTextPreference returns [EObject current=null] : (otherlv_0= 'edittextpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) otherlv_5= '}' ) ;
    public final EObject ruleEditTextPreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_preferenceAttributes_3_0 = null;

        EObject lv_dialogPreferenceAttributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3149:28: ( (otherlv_0= 'edittextpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) otherlv_5= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3150:1: (otherlv_0= 'edittextpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) otherlv_5= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3150:1: (otherlv_0= 'edittextpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) otherlv_5= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3150:3: otherlv_0= 'edittextpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleEditTextPreference7004); 

                	newLeafNode(otherlv_0, grammarAccess.getEditTextPreferenceAccess().getEdittextpreferenceKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3154:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3155:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3155:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3156:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditTextPreference7021); 

            			newLeafNode(lv_title_1_0, grammarAccess.getEditTextPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditTextPreferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEditTextPreference7038); 

                	newLeafNode(otherlv_2, grammarAccess.getEditTextPreferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3176:1: ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3177:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3177:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3178:3: lv_preferenceAttributes_3_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getEditTextPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_ruleEditTextPreference7059);
            lv_preferenceAttributes_3_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditTextPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_3_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3194:2: ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3195:1: (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3195:1: (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3196:3: lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getEditTextPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDialogPreferenceAttributes_in_ruleEditTextPreference7080);
            lv_dialogPreferenceAttributes_4_0=ruleDialogPreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditTextPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"dialogPreferenceAttributes",
                    		lv_dialogPreferenceAttributes_4_0, 
                    		"DialogPreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEditTextPreference7092); 

                	newLeafNode(otherlv_5, grammarAccess.getEditTextPreferenceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEditTextPreference"


    // $ANTLR start "entryRuleListPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3224:1: entryRuleListPreference returns [EObject current=null] : iv_ruleListPreference= ruleListPreference EOF ;
    public final EObject entryRuleListPreference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListPreference = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3225:2: (iv_ruleListPreference= ruleListPreference EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3226:2: iv_ruleListPreference= ruleListPreference EOF
            {
             newCompositeNode(grammarAccess.getListPreferenceRule()); 
            pushFollow(FOLLOW_ruleListPreference_in_entryRuleListPreference7128);
            iv_ruleListPreference=ruleListPreference();

            state._fsp--;

             current =iv_ruleListPreference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListPreference7138); 

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
    // $ANTLR end "entryRuleListPreference"


    // $ANTLR start "ruleListPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3233:1: ruleListPreference returns [EObject current=null] : (otherlv_0= 'listpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) ) otherlv_6= '}' ) ;
    public final EObject ruleListPreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_preferenceAttributes_3_0 = null;

        EObject lv_dialogPreferenceAttributes_4_0 = null;

        EObject lv_listPreferenceAttributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3236:28: ( (otherlv_0= 'listpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) ) otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3237:1: (otherlv_0= 'listpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) ) otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3237:1: (otherlv_0= 'listpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) ) otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3237:3: otherlv_0= 'listpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) ) ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleListPreference7175); 

                	newLeafNode(otherlv_0, grammarAccess.getListPreferenceAccess().getListpreferenceKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3241:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3242:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3242:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3243:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListPreference7192); 

            			newLeafNode(lv_title_1_0, grammarAccess.getListPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListPreferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleListPreference7209); 

                	newLeafNode(otherlv_2, grammarAccess.getListPreferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3263:1: ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3264:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3264:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3265:3: lv_preferenceAttributes_3_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getListPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_ruleListPreference7230);
            lv_preferenceAttributes_3_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_3_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3281:2: ( (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3282:1: (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3282:1: (lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3283:3: lv_dialogPreferenceAttributes_4_0= ruleDialogPreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getListPreferenceAccess().getDialogPreferenceAttributesDialogPreferenceAttributesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDialogPreferenceAttributes_in_ruleListPreference7251);
            lv_dialogPreferenceAttributes_4_0=ruleDialogPreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"dialogPreferenceAttributes",
                    		lv_dialogPreferenceAttributes_4_0, 
                    		"DialogPreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3299:2: ( (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3300:1: (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3300:1: (lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3301:3: lv_listPreferenceAttributes_5_0= ruleListPreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getListPreferenceAccess().getListPreferenceAttributesListPreferenceAttributesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleListPreferenceAttributes_in_ruleListPreference7272);
            lv_listPreferenceAttributes_5_0=ruleListPreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"listPreferenceAttributes",
                    		lv_listPreferenceAttributes_5_0, 
                    		"ListPreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleListPreference7284); 

                	newLeafNode(otherlv_6, grammarAccess.getListPreferenceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleListPreference"


    // $ANTLR start "entryRuleCheckBoxPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3329:1: entryRuleCheckBoxPreference returns [EObject current=null] : iv_ruleCheckBoxPreference= ruleCheckBoxPreference EOF ;
    public final EObject entryRuleCheckBoxPreference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBoxPreference = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3330:2: (iv_ruleCheckBoxPreference= ruleCheckBoxPreference EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3331:2: iv_ruleCheckBoxPreference= ruleCheckBoxPreference EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxPreferenceRule()); 
            pushFollow(FOLLOW_ruleCheckBoxPreference_in_entryRuleCheckBoxPreference7320);
            iv_ruleCheckBoxPreference=ruleCheckBoxPreference();

            state._fsp--;

             current =iv_ruleCheckBoxPreference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBoxPreference7330); 

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
    // $ANTLR end "entryRuleCheckBoxPreference"


    // $ANTLR start "ruleCheckBoxPreference"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3338:1: ruleCheckBoxPreference returns [EObject current=null] : (otherlv_0= 'checkboxpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) ;
    public final EObject ruleCheckBoxPreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preferenceAttributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3341:28: ( (otherlv_0= 'checkboxpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:1: (otherlv_0= 'checkboxpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:1: (otherlv_0= 'checkboxpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3342:3: otherlv_0= 'checkboxpreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleCheckBoxPreference7367); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckBoxPreferenceAccess().getCheckboxpreferenceKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3346:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3347:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3347:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3348:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckBoxPreference7384); 

            			newLeafNode(lv_title_1_0, grammarAccess.getCheckBoxPreferenceAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxPreferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCheckBoxPreference7401); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckBoxPreferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3368:1: ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3369:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3369:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3370:3: lv_preferenceAttributes_3_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCheckBoxPreferenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_ruleCheckBoxPreference7422);
            lv_preferenceAttributes_3_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCheckBoxPreferenceRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_3_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleCheckBoxPreference7434); 

                	newLeafNode(otherlv_4, grammarAccess.getCheckBoxPreferenceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCheckBoxPreference"


    // $ANTLR start "entryRuleRingtonePrefence"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3398:1: entryRuleRingtonePrefence returns [EObject current=null] : iv_ruleRingtonePrefence= ruleRingtonePrefence EOF ;
    public final EObject entryRuleRingtonePrefence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRingtonePrefence = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3399:2: (iv_ruleRingtonePrefence= ruleRingtonePrefence EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3400:2: iv_ruleRingtonePrefence= ruleRingtonePrefence EOF
            {
             newCompositeNode(grammarAccess.getRingtonePrefenceRule()); 
            pushFollow(FOLLOW_ruleRingtonePrefence_in_entryRuleRingtonePrefence7470);
            iv_ruleRingtonePrefence=ruleRingtonePrefence();

            state._fsp--;

             current =iv_ruleRingtonePrefence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRingtonePrefence7480); 

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
    // $ANTLR end "entryRuleRingtonePrefence"


    // $ANTLR start "ruleRingtonePrefence"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3407:1: ruleRingtonePrefence returns [EObject current=null] : (otherlv_0= 'ringtonepreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) ;
    public final EObject ruleRingtonePrefence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preferenceAttributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3410:28: ( (otherlv_0= 'ringtonepreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3411:1: (otherlv_0= 'ringtonepreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3411:1: (otherlv_0= 'ringtonepreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3411:3: otherlv_0= 'ringtonepreference' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleRingtonePrefence7517); 

                	newLeafNode(otherlv_0, grammarAccess.getRingtonePrefenceAccess().getRingtonepreferenceKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3415:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3416:1: (lv_title_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3416:1: (lv_title_1_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3417:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRingtonePrefence7534); 

            			newLeafNode(lv_title_1_0, grammarAccess.getRingtonePrefenceAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRingtonePrefenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRingtonePrefence7551); 

                	newLeafNode(otherlv_2, grammarAccess.getRingtonePrefenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3437:1: ( (lv_preferenceAttributes_3_0= rulePreferenceAttributes ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3438:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3438:1: (lv_preferenceAttributes_3_0= rulePreferenceAttributes )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3439:3: lv_preferenceAttributes_3_0= rulePreferenceAttributes
            {
             
            	        newCompositeNode(grammarAccess.getRingtonePrefenceAccess().getPreferenceAttributesPreferenceAttributesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreferenceAttributes_in_ruleRingtonePrefence7572);
            lv_preferenceAttributes_3_0=rulePreferenceAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRingtonePrefenceRule());
            	        }
                   		set(
                   			current, 
                   			"preferenceAttributes",
                    		lv_preferenceAttributes_3_0, 
                    		"PreferenceAttributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRingtonePrefence7584); 

                	newLeafNode(otherlv_4, grammarAccess.getRingtonePrefenceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRingtonePrefence"


    // $ANTLR start "entryRulePreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3467:1: entryRulePreferenceAttributes returns [EObject current=null] : iv_rulePreferenceAttributes= rulePreferenceAttributes EOF ;
    public final EObject entryRulePreferenceAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferenceAttributes = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3468:2: (iv_rulePreferenceAttributes= rulePreferenceAttributes EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3469:2: iv_rulePreferenceAttributes= rulePreferenceAttributes EOF
            {
             newCompositeNode(grammarAccess.getPreferenceAttributesRule()); 
            pushFollow(FOLLOW_rulePreferenceAttributes_in_entryRulePreferenceAttributes7620);
            iv_rulePreferenceAttributes=rulePreferenceAttributes();

            state._fsp--;

             current =iv_rulePreferenceAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferenceAttributes7630); 

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
    // $ANTLR end "entryRulePreferenceAttributes"


    // $ANTLR start "rulePreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3476:1: rulePreferenceAttributes returns [EObject current=null] : (otherlv_0= 'key' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )? (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )? (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )? ) ;
    public final EObject rulePreferenceAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_summary_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_enabled_5_0 = null;

        AntlrDatatypeRuleToken lv_persistent_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3479:28: ( (otherlv_0= 'key' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )? (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )? (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )? ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3480:1: (otherlv_0= 'key' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )? (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )? (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )? )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3480:1: (otherlv_0= 'key' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )? (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )? (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3480:3: otherlv_0= 'key' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )? (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )? (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_rulePreferenceAttributes7667); 

                	newLeafNode(otherlv_0, grammarAccess.getPreferenceAttributesAccess().getKeyKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3484:1: ( (lv_key_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3485:1: (lv_key_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3485:1: (lv_key_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3486:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreferenceAttributes7684); 

            			newLeafNode(lv_key_1_0, grammarAccess.getPreferenceAttributesAccess().getKeyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferenceAttributesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3502:2: (otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3502:4: otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_rulePreferenceAttributes7702); 

                        	newLeafNode(otherlv_2, grammarAccess.getPreferenceAttributesAccess().getSummaryKeyword_2_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3506:1: ( (lv_summary_3_0= RULE_STRING ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3507:1: (lv_summary_3_0= RULE_STRING )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3507:1: (lv_summary_3_0= RULE_STRING )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3508:3: lv_summary_3_0= RULE_STRING
                    {
                    lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferenceAttributes7719); 

                    			newLeafNode(lv_summary_3_0, grammarAccess.getPreferenceAttributesAccess().getSummarySTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPreferenceAttributesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"summary",
                            		lv_summary_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3524:4: (otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3524:6: otherlv_4= 'enabled' ( (lv_enabled_5_0= ruleBOOL ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_rulePreferenceAttributes7739); 

                        	newLeafNode(otherlv_4, grammarAccess.getPreferenceAttributesAccess().getEnabledKeyword_3_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3528:1: ( (lv_enabled_5_0= ruleBOOL ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3529:1: (lv_enabled_5_0= ruleBOOL )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3529:1: (lv_enabled_5_0= ruleBOOL )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3530:3: lv_enabled_5_0= ruleBOOL
                    {
                     
                    	        newCompositeNode(grammarAccess.getPreferenceAttributesAccess().getEnabledBOOLParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOL_in_rulePreferenceAttributes7760);
                    lv_enabled_5_0=ruleBOOL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPreferenceAttributesRule());
                    	        }
                           		set(
                           			current, 
                           			"enabled",
                            		lv_enabled_5_0, 
                            		"BOOL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3546:4: (otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3546:6: otherlv_6= 'persistent' ( (lv_persistent_7_0= ruleBOOL ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_62_in_rulePreferenceAttributes7775); 

                        	newLeafNode(otherlv_6, grammarAccess.getPreferenceAttributesAccess().getPersistentKeyword_4_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3550:1: ( (lv_persistent_7_0= ruleBOOL ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3551:1: (lv_persistent_7_0= ruleBOOL )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3551:1: (lv_persistent_7_0= ruleBOOL )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3552:3: lv_persistent_7_0= ruleBOOL
                    {
                     
                    	        newCompositeNode(grammarAccess.getPreferenceAttributesAccess().getPersistentBOOLParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOL_in_rulePreferenceAttributes7796);
                    lv_persistent_7_0=ruleBOOL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPreferenceAttributesRule());
                    	        }
                           		set(
                           			current, 
                           			"persistent",
                            		lv_persistent_7_0, 
                            		"BOOL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulePreferenceAttributes"


    // $ANTLR start "entryRuleDialogPreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3576:1: entryRuleDialogPreferenceAttributes returns [EObject current=null] : iv_ruleDialogPreferenceAttributes= ruleDialogPreferenceAttributes EOF ;
    public final EObject entryRuleDialogPreferenceAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogPreferenceAttributes = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3577:2: (iv_ruleDialogPreferenceAttributes= ruleDialogPreferenceAttributes EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3578:2: iv_ruleDialogPreferenceAttributes= ruleDialogPreferenceAttributes EOF
            {
             newCompositeNode(grammarAccess.getDialogPreferenceAttributesRule()); 
            pushFollow(FOLLOW_ruleDialogPreferenceAttributes_in_entryRuleDialogPreferenceAttributes7834);
            iv_ruleDialogPreferenceAttributes=ruleDialogPreferenceAttributes();

            state._fsp--;

             current =iv_ruleDialogPreferenceAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogPreferenceAttributes7844); 

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
    // $ANTLR end "entryRuleDialogPreferenceAttributes"


    // $ANTLR start "ruleDialogPreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3585:1: ruleDialogPreferenceAttributes returns [EObject current=null] : ( (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDialogPreferenceAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dialogTitle_1_0=null;
        Token otherlv_2=null;
        Token lv_defaultValue_3_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3588:28: ( ( (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3589:1: ( (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3589:1: ( (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3589:2: (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3589:2: (otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3589:4: otherlv_0= 'dialogTitle' ( (lv_dialogTitle_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleDialogPreferenceAttributes7882); 

                        	newLeafNode(otherlv_0, grammarAccess.getDialogPreferenceAttributesAccess().getDialogTitleKeyword_0_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3593:1: ( (lv_dialogTitle_1_0= RULE_STRING ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3594:1: (lv_dialogTitle_1_0= RULE_STRING )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3594:1: (lv_dialogTitle_1_0= RULE_STRING )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3595:3: lv_dialogTitle_1_0= RULE_STRING
                    {
                    lv_dialogTitle_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDialogPreferenceAttributes7899); 

                    			newLeafNode(lv_dialogTitle_1_0, grammarAccess.getDialogPreferenceAttributesAccess().getDialogTitleSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDialogPreferenceAttributesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dialogTitle",
                            		lv_dialogTitle_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3611:4: (otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3611:6: otherlv_2= 'defaultValue' ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleDialogPreferenceAttributes7919); 

                        	newLeafNode(otherlv_2, grammarAccess.getDialogPreferenceAttributesAccess().getDefaultValueKeyword_1_0());
                        
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3615:1: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3616:1: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3616:1: (lv_defaultValue_3_0= RULE_STRING )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3617:3: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDialogPreferenceAttributes7936); 

                    			newLeafNode(lv_defaultValue_3_0, grammarAccess.getDialogPreferenceAttributesAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDialogPreferenceAttributesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_3_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleDialogPreferenceAttributes"


    // $ANTLR start "entryRuleListPreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3641:1: entryRuleListPreferenceAttributes returns [EObject current=null] : iv_ruleListPreferenceAttributes= ruleListPreferenceAttributes EOF ;
    public final EObject entryRuleListPreferenceAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListPreferenceAttributes = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3642:2: (iv_ruleListPreferenceAttributes= ruleListPreferenceAttributes EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3643:2: iv_ruleListPreferenceAttributes= ruleListPreferenceAttributes EOF
            {
             newCompositeNode(grammarAccess.getListPreferenceAttributesRule()); 
            pushFollow(FOLLOW_ruleListPreferenceAttributes_in_entryRuleListPreferenceAttributes7979);
            iv_ruleListPreferenceAttributes=ruleListPreferenceAttributes();

            state._fsp--;

             current =iv_ruleListPreferenceAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListPreferenceAttributes7989); 

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
    // $ANTLR end "entryRuleListPreferenceAttributes"


    // $ANTLR start "ruleListPreferenceAttributes"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3650:1: ruleListPreferenceAttributes returns [EObject current=null] : (otherlv_0= 'entries' ( ( ruleQualifiedName ) ) otherlv_2= 'entryValues' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleListPreferenceAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3653:28: ( (otherlv_0= 'entries' ( ( ruleQualifiedName ) ) otherlv_2= 'entryValues' ( ( ruleQualifiedName ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3654:1: (otherlv_0= 'entries' ( ( ruleQualifiedName ) ) otherlv_2= 'entryValues' ( ( ruleQualifiedName ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3654:1: (otherlv_0= 'entries' ( ( ruleQualifiedName ) ) otherlv_2= 'entryValues' ( ( ruleQualifiedName ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3654:3: otherlv_0= 'entries' ( ( ruleQualifiedName ) ) otherlv_2= 'entryValues' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleListPreferenceAttributes8026); 

                	newLeafNode(otherlv_0, grammarAccess.getListPreferenceAttributesAccess().getEntriesKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3658:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3659:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3659:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3660:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListPreferenceAttributesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getListPreferenceAttributesAccess().getEntriesStringArrayEntryCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleListPreferenceAttributes8049);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleListPreferenceAttributes8061); 

                	newLeafNode(otherlv_2, grammarAccess.getListPreferenceAttributesAccess().getEntryValuesKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3677:1: ( ( ruleQualifiedName ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3678:1: ( ruleQualifiedName )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3678:1: ( ruleQualifiedName )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3679:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListPreferenceAttributesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getListPreferenceAttributesAccess().getEntryValuesStringArrayEntryCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleListPreferenceAttributes8084);
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
    // $ANTLR end "ruleListPreferenceAttributes"


    // $ANTLR start "entryRuleAndroResModelRoot"
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3700:1: entryRuleAndroResModelRoot returns [EObject current=null] : iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF ;
    public final EObject entryRuleAndroResModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroResModelRoot = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3701:2: (iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3702:2: iv_ruleAndroResModelRoot= ruleAndroResModelRoot EOF
            {
             newCompositeNode(grammarAccess.getAndroResModelRootRule()); 
            pushFollow(FOLLOW_ruleAndroResModelRoot_in_entryRuleAndroResModelRoot8120);
            iv_ruleAndroResModelRoot=ruleAndroResModelRoot();

            state._fsp--;

             current =iv_ruleAndroResModelRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroResModelRoot8130); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3709:1: ruleAndroResModelRoot returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' ) ;
    public final EObject ruleAndroResModelRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resources_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3712:28: ( (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3713:1: (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3713:1: (otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3713:3: otherlv_0= 'resources' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResource ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleAndroResModelRoot8167); 

                	newLeafNode(otherlv_0, grammarAccess.getAndroResModelRootAccess().getResourcesKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3717:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3718:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3718:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroResModelRoot8184); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAndroResModelRoot8201); 

                	newLeafNode(otherlv_2, grammarAccess.getAndroResModelRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3739:1: ( (lv_resources_3_0= ruleResource ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==68||LA39_0==70) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3740:1: (lv_resources_3_0= ruleResource )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3740:1: (lv_resources_3_0= ruleResource )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3741:3: lv_resources_3_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroResModelRootAccess().getResourcesResourceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleAndroResModelRoot8222);
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
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAndroResModelRoot8235); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3769:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3770:2: (iv_ruleResource= ruleResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3771:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource8271);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource8281); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3778:1: ruleResource returns [EObject current=null] : (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3781:28: ( (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3782:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3782:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )
            int alt40=7;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3783:5: this_StringResource_0= ruleStringResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getStringResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringResource_in_ruleResource8328);
                    this_StringResource_0=ruleStringResource();

                    state._fsp--;

                     
                            current = this_StringResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3793:5: this_IntegerResource_1= ruleIntegerResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getIntegerResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerResource_in_ruleResource8355);
                    this_IntegerResource_1=ruleIntegerResource();

                    state._fsp--;

                     
                            current = this_IntegerResource_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3803:5: this_BooleanResource_2= ruleBooleanResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getBooleanResourceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanResource_in_ruleResource8382);
                    this_BooleanResource_2=ruleBooleanResource();

                    state._fsp--;

                     
                            current = this_BooleanResource_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3813:5: this_ColorResource_3= ruleColorResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getColorResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleColorResource_in_ruleResource8409);
                    this_ColorResource_3=ruleColorResource();

                    state._fsp--;

                     
                            current = this_ColorResource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3823:5: this_DimensionResource_4= ruleDimensionResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDimensionResourceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDimensionResource_in_ruleResource8436);
                    this_DimensionResource_4=ruleDimensionResource();

                    state._fsp--;

                     
                            current = this_DimensionResource_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3833:5: this_ArrayResource_5= ruleArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getArrayResourceParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleArrayResource_in_ruleResource8463);
                    this_ArrayResource_5=ruleArrayResource();

                    state._fsp--;

                     
                            current = this_ArrayResource_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3843:5: this_DrawableResource_6= ruleDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDrawableResourceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDrawableResource_in_ruleResource8490);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3859:1: entryRuleStringResource returns [EObject current=null] : iv_ruleStringResource= ruleStringResource EOF ;
    public final EObject entryRuleStringResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3860:2: (iv_ruleStringResource= ruleStringResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3861:2: iv_ruleStringResource= ruleStringResource EOF
            {
             newCompositeNode(grammarAccess.getStringResourceRule()); 
            pushFollow(FOLLOW_ruleStringResource_in_entryRuleStringResource8525);
            iv_ruleStringResource=ruleStringResource();

            state._fsp--;

             current =iv_ruleStringResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringResource8535); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3868:1: ruleStringResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3871:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3872:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3872:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3872:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3872:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3873:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3873:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3874:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringResource8577); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleStringResource8594); 

                	newLeafNode(otherlv_1, grammarAccess.getStringResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3894:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3895:1: (lv_value_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3895:1: (lv_value_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3896:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringResource8611); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3920:1: entryRuleIntegerResource returns [EObject current=null] : iv_ruleIntegerResource= ruleIntegerResource EOF ;
    public final EObject entryRuleIntegerResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3921:2: (iv_ruleIntegerResource= ruleIntegerResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3922:2: iv_ruleIntegerResource= ruleIntegerResource EOF
            {
             newCompositeNode(grammarAccess.getIntegerResourceRule()); 
            pushFollow(FOLLOW_ruleIntegerResource_in_entryRuleIntegerResource8652);
            iv_ruleIntegerResource=ruleIntegerResource();

            state._fsp--;

             current =iv_ruleIntegerResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerResource8662); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3929:1: ruleIntegerResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3932:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3933:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3933:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3933:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3933:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3934:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3934:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3935:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerResource8704); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleIntegerResource8721); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3955:1: ( (lv_value_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3956:1: (lv_value_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3956:1: (lv_value_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3957:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerResource8738); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3981:1: entryRuleBooleanResource returns [EObject current=null] : iv_ruleBooleanResource= ruleBooleanResource EOF ;
    public final EObject entryRuleBooleanResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3982:2: (iv_ruleBooleanResource= ruleBooleanResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3983:2: iv_ruleBooleanResource= ruleBooleanResource EOF
            {
             newCompositeNode(grammarAccess.getBooleanResourceRule()); 
            pushFollow(FOLLOW_ruleBooleanResource_in_entryRuleBooleanResource8779);
            iv_ruleBooleanResource=ruleBooleanResource();

            state._fsp--;

             current =iv_ruleBooleanResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanResource8789); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3990:1: ruleBooleanResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) ;
    public final EObject ruleBooleanResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3993:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3994:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3994:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3995:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3995:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:3996:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanResource8831); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleBooleanResource8848); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4016:1: ( (lv_value_2_0= ruleBOOL ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4017:1: (lv_value_2_0= ruleBOOL )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4017:1: (lv_value_2_0= ruleBOOL )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4018:3: lv_value_2_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanResourceAccess().getValueBOOLParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanResource8869);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4042:1: entryRuleColorResource returns [EObject current=null] : iv_ruleColorResource= ruleColorResource EOF ;
    public final EObject entryRuleColorResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4043:2: (iv_ruleColorResource= ruleColorResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4044:2: iv_ruleColorResource= ruleColorResource EOF
            {
             newCompositeNode(grammarAccess.getColorResourceRule()); 
            pushFollow(FOLLOW_ruleColorResource_in_entryRuleColorResource8905);
            iv_ruleColorResource=ruleColorResource();

            state._fsp--;

             current =iv_ruleColorResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorResource8915); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4051:1: ruleColorResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) ) ;
    public final EObject ruleColorResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4054:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4055:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4055:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4055:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX_COLOR ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4055:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4056:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4056:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4057:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorResource8957); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleColorResource8974); 

                	newLeafNode(otherlv_1, grammarAccess.getColorResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4077:1: ( (lv_value_2_0= RULE_HEX_COLOR ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4078:1: (lv_value_2_0= RULE_HEX_COLOR )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4078:1: (lv_value_2_0= RULE_HEX_COLOR )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4079:3: lv_value_2_0= RULE_HEX_COLOR
            {
            lv_value_2_0=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleColorResource8991); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4103:1: entryRuleDimensionResource returns [EObject current=null] : iv_ruleDimensionResource= ruleDimensionResource EOF ;
    public final EObject entryRuleDimensionResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4104:2: (iv_ruleDimensionResource= ruleDimensionResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4105:2: iv_ruleDimensionResource= ruleDimensionResource EOF
            {
             newCompositeNode(grammarAccess.getDimensionResourceRule()); 
            pushFollow(FOLLOW_ruleDimensionResource_in_entryRuleDimensionResource9032);
            iv_ruleDimensionResource=ruleDimensionResource();

            state._fsp--;

             current =iv_ruleDimensionResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionResource9042); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4112:1: ruleDimensionResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) ) ;
    public final EObject ruleDimensionResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4115:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4116:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4116:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4116:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDimensionValue ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4116:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4117:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4117:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4118:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDimensionResource9084); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleDimensionResource9101); 

                	newLeafNode(otherlv_1, grammarAccess.getDimensionResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4138:1: ( (lv_value_2_0= ruleDimensionValue ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4139:1: (lv_value_2_0= ruleDimensionValue )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4139:1: (lv_value_2_0= ruleDimensionValue )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4140:3: lv_value_2_0= ruleDimensionValue
            {
             
            	        newCompositeNode(grammarAccess.getDimensionResourceAccess().getValueDimensionValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDimensionValue_in_ruleDimensionResource9122);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4164:1: entryRuleArrayResource returns [EObject current=null] : iv_ruleArrayResource= ruleArrayResource EOF ;
    public final EObject entryRuleArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4165:2: (iv_ruleArrayResource= ruleArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4166:2: iv_ruleArrayResource= ruleArrayResource EOF
            {
             newCompositeNode(grammarAccess.getArrayResourceRule()); 
            pushFollow(FOLLOW_ruleArrayResource_in_entryRuleArrayResource9158);
            iv_ruleArrayResource=ruleArrayResource();

            state._fsp--;

             current =iv_ruleArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayResource9168); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4173:1: ruleArrayResource returns [EObject current=null] : (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource ) ;
    public final EObject ruleArrayResource() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerArrayResource_0 = null;

        EObject this_StringArrayResource_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4176:28: ( (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4177:1: (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4177:1: (this_IntegerArrayResource_0= ruleIntegerArrayResource | this_StringArrayResource_1= ruleStringArrayResource )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            else if ( (LA41_0==70) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4178:5: this_IntegerArrayResource_0= ruleIntegerArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getArrayResourceAccess().getIntegerArrayResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerArrayResource_in_ruleArrayResource9215);
                    this_IntegerArrayResource_0=ruleIntegerArrayResource();

                    state._fsp--;

                     
                            current = this_IntegerArrayResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4188:5: this_StringArrayResource_1= ruleStringArrayResource
                    {
                     
                            newCompositeNode(grammarAccess.getArrayResourceAccess().getStringArrayResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayResource_in_ruleArrayResource9242);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4204:1: entryRuleIntegerArrayResource returns [EObject current=null] : iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF ;
    public final EObject entryRuleIntegerArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4205:2: (iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4206:2: iv_ruleIntegerArrayResource= ruleIntegerArrayResource EOF
            {
             newCompositeNode(grammarAccess.getIntegerArrayResourceRule()); 
            pushFollow(FOLLOW_ruleIntegerArrayResource_in_entryRuleIntegerArrayResource9277);
            iv_ruleIntegerArrayResource=ruleIntegerArrayResource();

            state._fsp--;

             current =iv_ruleIntegerArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerArrayResource9287); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4213:1: ruleIntegerArrayResource returns [EObject current=null] : (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4216:28: ( (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4217:1: (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4217:1: (otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4217:3: otherlv_0= 'intarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleIntegerArrayResource9324); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerArrayResourceAccess().getIntarrayKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4222:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4222:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerArrayResource9341); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIntegerArrayResource9358); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerArrayResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4243:1: ( ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4243:2: ( (lv_entries_3_0= ruleIntegerArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )*
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4243:2: ( (lv_entries_3_0= ruleIntegerArrayEntry ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4244:1: (lv_entries_3_0= ruleIntegerArrayEntry )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4244:1: (lv_entries_3_0= ruleIntegerArrayEntry )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4245:3: lv_entries_3_0= ruleIntegerArrayEntry
            {
             
            	        newCompositeNode(grammarAccess.getIntegerArrayResourceAccess().getEntriesIntegerArrayEntryParserRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource9380);
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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4261:2: (otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4261:4: otherlv_4= ',' ( (lv_entries_5_0= ruleIntegerArrayEntry ) )
            	    {
            	    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleIntegerArrayResource9393); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIntegerArrayResourceAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4265:1: ( (lv_entries_5_0= ruleIntegerArrayEntry ) )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4266:1: (lv_entries_5_0= ruleIntegerArrayEntry )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4266:1: (lv_entries_5_0= ruleIntegerArrayEntry )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4267:3: lv_entries_5_0= ruleIntegerArrayEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerArrayResourceAccess().getEntriesIntegerArrayEntryParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource9414);
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
            	    break loop42;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleIntegerArrayResource9429); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4295:1: entryRuleIntegerArrayEntry returns [EObject current=null] : iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF ;
    public final EObject entryRuleIntegerArrayEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerArrayEntry = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4296:2: (iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4297:2: iv_ruleIntegerArrayEntry= ruleIntegerArrayEntry EOF
            {
             newCompositeNode(grammarAccess.getIntegerArrayEntryRule()); 
            pushFollow(FOLLOW_ruleIntegerArrayEntry_in_entryRuleIntegerArrayEntry9465);
            iv_ruleIntegerArrayEntry=ruleIntegerArrayEntry();

            state._fsp--;

             current =iv_ruleIntegerArrayEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerArrayEntry9475); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4304:1: ruleIntegerArrayEntry returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerArrayEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4307:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_INT ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4308:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4309:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4309:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4310:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerArrayEntry9518); 

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

                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleIntegerArrayEntry9535); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntegerArrayEntryAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4330:3: ( (lv_value_2_0= RULE_INT ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4331:1: (lv_value_2_0= RULE_INT )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4331:1: (lv_value_2_0= RULE_INT )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4332:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerArrayEntry9554); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4356:1: entryRuleStringArrayResource returns [EObject current=null] : iv_ruleStringArrayResource= ruleStringArrayResource EOF ;
    public final EObject entryRuleStringArrayResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4357:2: (iv_ruleStringArrayResource= ruleStringArrayResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4358:2: iv_ruleStringArrayResource= ruleStringArrayResource EOF
            {
             newCompositeNode(grammarAccess.getStringArrayResourceRule()); 
            pushFollow(FOLLOW_ruleStringArrayResource_in_entryRuleStringArrayResource9595);
            iv_ruleStringArrayResource=ruleStringArrayResource();

            state._fsp--;

             current =iv_ruleStringArrayResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayResource9605); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4365:1: ruleStringArrayResource returns [EObject current=null] : (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4368:28: ( (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4369:1: (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4369:1: (otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}' )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4369:3: otherlv_0= 'stringarray' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleStringArrayResource9642); 

                	newLeafNode(otherlv_0, grammarAccess.getStringArrayResourceAccess().getStringarrayKeyword_0());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4374:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4374:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringArrayResource9659); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringArrayResource9676); 

                	newLeafNode(otherlv_2, grammarAccess.getStringArrayResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4395:1: ( ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )* )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4395:2: ( (lv_entries_3_0= ruleStringArrayEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )*
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4395:2: ( (lv_entries_3_0= ruleStringArrayEntry ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4396:1: (lv_entries_3_0= ruleStringArrayEntry )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4396:1: (lv_entries_3_0= ruleStringArrayEntry )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4397:3: lv_entries_3_0= ruleStringArrayEntry
            {
             
            	        newCompositeNode(grammarAccess.getStringArrayResourceAccess().getEntriesStringArrayEntryParserRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource9698);
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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4413:2: (otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==69) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4413:4: otherlv_4= ',' ( (lv_entries_5_0= ruleStringArrayEntry ) )
            	    {
            	    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleStringArrayResource9711); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStringArrayResourceAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4417:1: ( (lv_entries_5_0= ruleStringArrayEntry ) )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4418:1: (lv_entries_5_0= ruleStringArrayEntry )
            	    {
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4418:1: (lv_entries_5_0= ruleStringArrayEntry )
            	    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4419:3: lv_entries_5_0= ruleStringArrayEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringArrayResourceAccess().getEntriesStringArrayEntryParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource9732);
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
            	    break loop44;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleStringArrayResource9747); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4447:1: entryRuleStringArrayEntry returns [EObject current=null] : iv_ruleStringArrayEntry= ruleStringArrayEntry EOF ;
    public final EObject entryRuleStringArrayEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayEntry = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4448:2: (iv_ruleStringArrayEntry= ruleStringArrayEntry EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4449:2: iv_ruleStringArrayEntry= ruleStringArrayEntry EOF
            {
             newCompositeNode(grammarAccess.getStringArrayEntryRule()); 
            pushFollow(FOLLOW_ruleStringArrayEntry_in_entryRuleStringArrayEntry9783);
            iv_ruleStringArrayEntry=ruleStringArrayEntry();

            state._fsp--;

             current =iv_ruleStringArrayEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayEntry9793); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4456:1: ruleStringArrayEntry returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringArrayEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4459:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4460:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4461:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4461:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4462:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringArrayEntry9836); 

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

                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleStringArrayEntry9853); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringArrayEntryAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4482:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4483:1: (lv_value_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4483:1: (lv_value_2_0= RULE_STRING )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4484:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringArrayEntry9872); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4508:1: entryRuleDrawableResource returns [EObject current=null] : iv_ruleDrawableResource= ruleDrawableResource EOF ;
    public final EObject entryRuleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4509:2: (iv_ruleDrawableResource= ruleDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4510:2: iv_ruleDrawableResource= ruleDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource9913);
            iv_ruleDrawableResource=ruleDrawableResource();

            state._fsp--;

             current =iv_ruleDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrawableResource9923); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4517:1: ruleDrawableResource returns [EObject current=null] : (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) ;
    public final EObject ruleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject this_BitmapDrawableResource_0 = null;

        EObject this_TransitionDrawableResource_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4520:28: ( (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4521:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4521:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==67) ) {
                    alt46=1;
                }
                else if ( (LA46_1==RULE_ID) ) {
                    alt46=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4522:5: this_BitmapDrawableResource_0= ruleBitmapDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getDrawableResourceAccess().getBitmapDrawableResourceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource9970);
                    this_BitmapDrawableResource_0=ruleBitmapDrawableResource();

                    state._fsp--;

                     
                            current = this_BitmapDrawableResource_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4532:5: this_TransitionDrawableResource_1= ruleTransitionDrawableResource
                    {
                     
                            newCompositeNode(grammarAccess.getDrawableResourceAccess().getTransitionDrawableResourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource9997);
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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4548:1: entryRuleBitmapDrawableResource returns [EObject current=null] : iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF ;
    public final EObject entryRuleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitmapDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4549:2: (iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4550:2: iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getBitmapDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource10032);
            iv_ruleBitmapDrawableResource=ruleBitmapDrawableResource();

            state._fsp--;

             current =iv_ruleBitmapDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitmapDrawableResource10042); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4557:1: ruleBitmapDrawableResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4560:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4561:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4561:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4561:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_filename_2_0= RULE_ID ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4561:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4562:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4562:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4563:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource10084); 

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

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleBitmapDrawableResource10101); 

                	newLeafNode(otherlv_1, grammarAccess.getBitmapDrawableResourceAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4583:1: ( (lv_filename_2_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4584:1: (lv_filename_2_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4584:1: (lv_filename_2_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4585:3: lv_filename_2_0= RULE_ID
            {
            lv_filename_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource10118); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4609:1: entryRuleTransitionDrawableResource returns [EObject current=null] : iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF ;
    public final EObject entryRuleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDrawableResource = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4610:2: (iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4611:2: iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF
            {
             newCompositeNode(grammarAccess.getTransitionDrawableResourceRule()); 
            pushFollow(FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource10159);
            iv_ruleTransitionDrawableResource=ruleTransitionDrawableResource();

            state._fsp--;

             current =iv_ruleTransitionDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionDrawableResource10169); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4618:1: ruleTransitionDrawableResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4621:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4622:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4622:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4622:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '<->' ( (otherlv_3= RULE_ID ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4622:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4623:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4623:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4624:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10211); 

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

            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4640:2: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4641:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4641:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4642:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDrawableResourceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10236); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionDrawableResourceAccess().getFromBitmapDrawableResourceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleTransitionDrawableResource10248); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionDrawableResourceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_2());
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4657:1: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4658:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4658:1: (otherlv_3= RULE_ID )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4659:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDrawableResourceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10268); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4678:1: entryRuleDimensionValue returns [String current=null] : iv_ruleDimensionValue= ruleDimensionValue EOF ;
    public final String entryRuleDimensionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDimensionValue = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4679:2: (iv_ruleDimensionValue= ruleDimensionValue EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4680:2: iv_ruleDimensionValue= ruleDimensionValue EOF
            {
             newCompositeNode(grammarAccess.getDimensionValueRule()); 
            pushFollow(FOLLOW_ruleDimensionValue_in_entryRuleDimensionValue10305);
            iv_ruleDimensionValue=ruleDimensionValue();

            state._fsp--;

             current =iv_ruleDimensionValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionValue10316); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4687:1: ruleDimensionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) ) ;
    public final AntlrDatatypeRuleToken ruleDimensionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4690:28: ( (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4691:1: (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4691:1: (this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4692:5: this_FLOAT_0= ruleFLOAT (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' )
            {
             
                    newCompositeNode(grammarAccess.getDimensionValueAccess().getFLOATParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFLOAT_in_ruleDimensionValue10363);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            		current.merge(this_FLOAT_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4702:1: (kw= 'dp' | kw= 'sp' | kw= 'pt' | kw= 'px' | kw= 'mm' | kw= 'in' )
            int alt47=6;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt47=1;
                }
                break;
            case 73:
                {
                alt47=2;
                }
                break;
            case 74:
                {
                alt47=3;
                }
                break;
            case 75:
                {
                alt47=4;
                }
                break;
            case 76:
                {
                alt47=5;
                }
                break;
            case 77:
                {
                alt47=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4703:2: kw= 'dp'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleDimensionValue10382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getDpKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4710:2: kw= 'sp'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleDimensionValue10401); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getSpKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4717:2: kw= 'pt'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleDimensionValue10420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getPtKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4724:2: kw= 'px'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleDimensionValue10439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getPxKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4731:2: kw= 'mm'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleDimensionValue10458); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDimensionValueAccess().getMmKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4738:2: kw= 'in'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleDimensionValue10477); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4751:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4752:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4753:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL10519);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL10530); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4760:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4763:28: ( (kw= 'true' | kw= 'false' ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4764:1: (kw= 'true' | kw= 'false' )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4764:1: (kw= 'true' | kw= 'false' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            else if ( (LA48_0==79) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4765:2: kw= 'true'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleBOOL10568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4772:2: kw= 'false'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleBOOL10587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                        

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4785:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4786:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4787:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT10628);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT10639); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4794:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4797:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4798:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4798:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4798:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT10679); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4805:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4806:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleFLOAT10698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT10713); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4826:1: ruleApiLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) ) ;
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
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4828:28: ( ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4829:1: ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4829:1: ( (enumLiteral_0= 'Android 2.2' ) | (enumLiteral_1= 'Android 2.3.1' ) | (enumLiteral_2= 'Android 2.3.3' ) | (enumLiteral_3= 'Android 3.0' ) | (enumLiteral_4= 'Android 3.1' ) | (enumLiteral_5= 'Android 4.0' ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt50=1;
                }
                break;
            case 81:
                {
                alt50=2;
                }
                break;
            case 82:
                {
                alt50=3;
                }
                break;
            case 83:
                {
                alt50=4;
                }
                break;
            case 84:
                {
                alt50=5;
                }
                break;
            case 85:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4829:2: (enumLiteral_0= 'Android 2.2' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4829:2: (enumLiteral_0= 'Android 2.2' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4829:4: enumLiteral_0= 'Android 2.2'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleApiLevel10774); 

                            current = grammarAccess.getApiLevelAccess().getAPI8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getApiLevelAccess().getAPI8EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4835:6: (enumLiteral_1= 'Android 2.3.1' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4835:6: (enumLiteral_1= 'Android 2.3.1' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4835:8: enumLiteral_1= 'Android 2.3.1'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleApiLevel10791); 

                            current = grammarAccess.getApiLevelAccess().getAPI9EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getApiLevelAccess().getAPI9EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4841:6: (enumLiteral_2= 'Android 2.3.3' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4841:6: (enumLiteral_2= 'Android 2.3.3' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4841:8: enumLiteral_2= 'Android 2.3.3'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_82_in_ruleApiLevel10808); 

                            current = grammarAccess.getApiLevelAccess().getAPI10EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getApiLevelAccess().getAPI10EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4847:6: (enumLiteral_3= 'Android 3.0' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4847:6: (enumLiteral_3= 'Android 3.0' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4847:8: enumLiteral_3= 'Android 3.0'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_83_in_ruleApiLevel10825); 

                            current = grammarAccess.getApiLevelAccess().getAPI11EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getApiLevelAccess().getAPI11EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4853:6: (enumLiteral_4= 'Android 3.1' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4853:6: (enumLiteral_4= 'Android 3.1' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4853:8: enumLiteral_4= 'Android 3.1'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_84_in_ruleApiLevel10842); 

                            current = grammarAccess.getApiLevelAccess().getAPI12EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getApiLevelAccess().getAPI12EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4859:6: (enumLiteral_5= 'Android 4.0' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4859:6: (enumLiteral_5= 'Android 4.0' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4859:8: enumLiteral_5= 'Android 4.0'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_85_in_ruleApiLevel10859); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4869:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4871:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4872:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4872:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'int' ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt51=1;
                }
                break;
            case 87:
                {
                alt51=2;
                }
                break;
            case 88:
                {
                alt51=3;
                }
                break;
            case 89:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4872:2: (enumLiteral_0= 'String' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4872:2: (enumLiteral_0= 'String' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4872:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleDataTypes10904); 

                            current = grammarAccess.getDataTypesAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4878:6: (enumLiteral_1= 'float' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4878:6: (enumLiteral_1= 'float' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4878:8: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleDataTypes10921); 

                            current = grammarAccess.getDataTypesAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getFLOATEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4884:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4884:6: (enumLiteral_2= 'boolean' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4884:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleDataTypes10938); 

                            current = grammarAccess.getDataTypesAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4890:6: (enumLiteral_3= 'int' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4890:6: (enumLiteral_3= 'int' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4890:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleDataTypes10955); 

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
    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4900:1: ruleLayoutStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) ) ;
    public final Enumerator ruleLayoutStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4902:28: ( ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) ) )
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4903:1: ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) )
            {
            // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4903:1: ( (enumLiteral_0= 'fill' ) | (enumLiteral_1= 'wrap' ) | (enumLiteral_2= 'fill&wrap' ) | (enumLiteral_3= 'wrap&fill' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt52=1;
                }
                break;
            case 91:
                {
                alt52=2;
                }
                break;
            case 92:
                {
                alt52=3;
                }
                break;
            case 93:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4903:2: (enumLiteral_0= 'fill' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4903:2: (enumLiteral_0= 'fill' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4903:4: enumLiteral_0= 'fill'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleLayoutStyle11000); 

                            current = grammarAccess.getLayoutStyleAccess().getFILLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLayoutStyleAccess().getFILLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4909:6: (enumLiteral_1= 'wrap' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4909:6: (enumLiteral_1= 'wrap' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4909:8: enumLiteral_1= 'wrap'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleLayoutStyle11017); 

                            current = grammarAccess.getLayoutStyleAccess().getWRAPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLayoutStyleAccess().getWRAPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4915:6: (enumLiteral_2= 'fill&wrap' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4915:6: (enumLiteral_2= 'fill&wrap' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4915:8: enumLiteral_2= 'fill&wrap'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleLayoutStyle11034); 

                            current = grammarAccess.getLayoutStyleAccess().getFILL_WRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLayoutStyleAccess().getFILL_WRAPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4921:6: (enumLiteral_3= 'wrap&fill' )
                    {
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4921:6: (enumLiteral_3= 'wrap&fill' )
                    // ../hu.bme.mit.androtext.lang/src-gen/hu/bme/mit/androtext/lang/parser/antlr/internal/InternalAndroTextDsl.g:4921:8: enumLiteral_3= 'wrap&fill'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_93_in_ruleLayoutStyle11051); 

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


    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA40_eotS =
        "\13\uffff";
    static final String DFA40_eofS =
        "\5\uffff\1\12\5\uffff";
    static final String DFA40_minS =
        "\2\4\1\uffff\1\4\1\uffff\1\4\5\uffff";
    static final String DFA40_maxS =
        "\1\106\1\103\1\uffff\1\117\1\uffff\1\115\5\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\6\1\uffff\1\7\1\uffff\1\1\1\3\1\4\1\5\1\2";
    static final String DFA40_specialS =
        "\13\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\77\uffff\1\2\1\uffff\1\2",
            "\1\4\76\uffff\1\3",
            "",
            "\1\4\1\5\1\6\1\10\106\uffff\2\7",
            "",
            "\1\12\11\uffff\1\11\3\uffff\1\12\61\uffff\1\12\1\uffff\1\12"+
            "\1\uffff\6\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "3782:1: (this_StringResource_0= ruleStringResource | this_IntegerResource_1= ruleIntegerResource | this_BooleanResource_2= ruleBooleanResource | this_ColorResource_3= ruleColorResource | this_DimensionResource_4= ruleDimensionResource | this_ArrayResource_5= ruleArrayResource | this_DrawableResource_6= ruleDrawableResource )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAndroTextModelRoot_in_entryRuleAndroTextModelRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroTextModelRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAndroTextModelRoot123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAndroTextModelRoot144 = new BitSet(new long[]{0x0000000081812000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAndroTextModelRoot167 = new BitSet(new long[]{0x0000000081812000L,0x0000000000000004L});
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
    public static final BitSet FOLLOW_21_in_ruleTargetApplication1109 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_ruleApiLevel_in_ruleTargetApplication1130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTargetApplication1142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersionCode_in_ruleTargetApplication1163 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTargetApplication1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionCode_in_entryRuleVersionCode1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionCode1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersionCode1263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVersionCode1281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersionCode1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroidPackageName_in_entryRuleAndroidPackageName1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidPackageName1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidPackageName1393 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAndroidPackageName1412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidPackageName1427 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAndroidApplication_in_entryRuleAndroidApplication1474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidApplication1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAndroidApplication1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidApplication1538 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroidApplication1555 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleAndroidApplication1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAndroidApplication1591 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleAndroidApplication1614 = new BitSet(new long[]{0x000000000B040000L});
    public static final BitSet FOLLOW_ruleAndroidApplicationModelElement_in_ruleAndroidApplication1635 = new BitSet(new long[]{0x000000000B040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroidApplication1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroidApplicationModelElement_in_entryRuleAndroidApplicationModelElement1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidApplicationModelElement1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleAndroidApplicationModelElement1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_ruleAndroidApplicationModelElement1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActivity1850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1867 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_entryRuleTabActivity1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabActivity1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTabActivity1990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabActivity2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroDataModelRoot_in_entryRuleAndroDataModelRoot2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroDataModelRoot2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAndroDataModelRoot2095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroDataModelRoot2112 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroDataModelRoot2129 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAndroDataModelRoot2150 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroDataModelRoot2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntity2246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2263 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleEntity2281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2301 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity2315 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2336 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleEntity2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2437 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProperty2454 = new BitSet(new long[]{0x0000000000000010L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleProperty2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypesRef_in_ruleTypeRef2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityTypeRef_in_ruleTypeRef2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypesRef_in_entryRuleDataTypesRef2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypesRef2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataTypesRef2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityTypeRef_in_entryRuleEntityTypeRef2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityTypeRef2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityTypeRef2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroGuiModelRoot_in_entryRuleAndroGuiModelRoot2812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroGuiModelRoot2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAndroGuiModelRoot2859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroGuiModelRoot2876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroGuiModelRoot2893 = new BitSet(new long[]{0x0020003300040000L});
    public static final BitSet FOLLOW_ruleRootLayout_in_ruleAndroGuiModelRoot2914 = new BitSet(new long[]{0x0020003300040000L});
    public static final BitSet FOLLOW_18_in_ruleAndroGuiModelRoot2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement2963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleUIElement3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleUIElement3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLayout_in_ruleLayout3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLayout_in_entryRuleRootLayout3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootLayout3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseLayout_in_ruleRootLayout3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceScreen_in_ruleRootLayout3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseLayout_in_entryRuleBaseLayout3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseLayout3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearLayout_in_ruleBaseLayout3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteLayout_in_ruleBaseLayout3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameLayout_in_ruleBaseLayout3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeLayout_in_ruleBaseLayout3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteLayout_in_entryRuleAbsoluteLayout3464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteLayout3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAbsoluteLayout3511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbsoluteLayout3528 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleAbsoluteLayout3554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAbsoluteLayout3566 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleAbsoluteLayout3587 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleAbsoluteLayout3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearLayout_in_entryRuleLinearLayout3636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearLayout3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinearLayout3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinearLayout3700 = new BitSet(new long[]{0x0000000C00000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_34_in_ruleLinearLayout3724 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_35_in_ruleLinearLayout3755 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleLinearLayout3778 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLinearLayout3790 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleLinearLayout3811 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleLinearLayout3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameLayout_in_entryRuleFrameLayout3860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameLayout3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFrameLayout3907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrameLayout3924 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleFrameLayout3950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFrameLayout3962 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleFrameLayout3983 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleFrameLayout3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeLayout_in_entryRuleRelativeLayout4032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeLayout4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelativeLayout4079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelativeLayout4096 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRelativeLayout4122 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelativeLayout4134 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleRelativeLayout4155 = new BitSet(new long[]{0x0021F3F300040000L});
    public static final BitSet FOLLOW_18_in_ruleRelativeLayout4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_ruleWidget4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_ruleWidget4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWidget4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListView_in_ruleWidget4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioGroup_in_ruleWidget4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleWidget4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatingBar_in_ruleWidget4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToggleButton_in_ruleWidget4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_entryRuleTextView4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextView4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTextView4559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextView4576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextView4598 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleTextView4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_entryRuleEditText4660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditText4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEditText4707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditText4724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditText4746 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleEditText4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton4808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleButton4855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton4872 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton4894 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleButton4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListView_in_entryRuleListView4956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListView4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleListView5003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListView5020 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleListView5046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleListView5058 = new BitSet(new long[]{0x00000C0000040000L});
    public static final BitSet FOLLOW_42_in_ruleListView5071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListView5094 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_43_in_ruleListView5109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListView5132 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleListView5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner5182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinner5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSpinner5229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinner5246 = new BitSet(new long[]{0x0000040000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_42_in_ruleSpinner5264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpinner5287 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleSpinner5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCheckBox5393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBox5410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckBox5432 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleCheckBox5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioGroup_in_entryRuleRadioGroup5494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioGroup5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRadioGroup5541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRadioGroup5558 = new BitSet(new long[]{0x0000000C00000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_34_in_ruleRadioGroup5582 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_35_in_ruleRadioGroup5613 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRadioGroup5636 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRadioGroup5648 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleRadioGroup5669 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRadioGroup5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatingBar_in_entryRuleRatingBar5718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRatingBar5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRatingBar5765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRatingBar5782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRatingBar5804 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRatingBar5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToggleButton_in_entryRuleToggleButton5866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToggleButton5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleToggleButton5913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToggleButton5930 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleToggleButton5947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToggleButton5964 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleToggleButton5981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleToggleButton5998 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleToggleButton6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton6060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleRadioButton6107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRadioButton6124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRadioButton6146 = new BitSet(new long[]{0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleRadioButton6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPreference_in_entryRuleAbstractPreference6208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPreference6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_ruleAbstractPreference6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditTextPreference_in_ruleAbstractPreference6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListPreference_in_ruleAbstractPreference6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxPreference_in_ruleAbstractPreference6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRingtonePrefence_in_ruleAbstractPreference6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceCategory_in_ruleAbstractPreference6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceScreen_in_ruleAbstractPreference6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_entryRulePreference6462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreference6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePreference6509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreference6526 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePreference6543 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_rulePreference6564 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePreference6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceScreen_in_entryRulePreferenceScreen6612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferenceScreen6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreferenceScreen6659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreferenceScreen6676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferenceScreen6698 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePreferenceScreen6715 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_rulePreferenceScreen6736 = new BitSet(new long[]{0x07F0003300040000L});
    public static final BitSet FOLLOW_ruleAbstractPreference_in_rulePreferenceScreen6757 = new BitSet(new long[]{0x07F0003300040000L});
    public static final BitSet FOLLOW_18_in_rulePreferenceScreen6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceCategory_in_entryRulePreferenceCategory6806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferenceCategory6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePreferenceCategory6853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferenceCategory6870 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePreferenceCategory6887 = new BitSet(new long[]{0x07F0003300040000L});
    public static final BitSet FOLLOW_ruleAbstractPreference_in_rulePreferenceCategory6908 = new BitSet(new long[]{0x07F0003300040000L});
    public static final BitSet FOLLOW_18_in_rulePreferenceCategory6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditTextPreference_in_entryRuleEditTextPreference6957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditTextPreference6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEditTextPreference7004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditTextPreference7021 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEditTextPreference7038 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_ruleEditTextPreference7059 = new BitSet(new long[]{0x8000000000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDialogPreferenceAttributes_in_ruleEditTextPreference7080 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEditTextPreference7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListPreference_in_entryRuleListPreference7128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListPreference7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleListPreference7175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListPreference7192 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleListPreference7209 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_ruleListPreference7230 = new BitSet(new long[]{0x8000040000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDialogPreferenceAttributes_in_ruleListPreference7251 = new BitSet(new long[]{0x8000040000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleListPreferenceAttributes_in_ruleListPreference7272 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleListPreference7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxPreference_in_entryRuleCheckBoxPreference7320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBoxPreference7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCheckBoxPreference7367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckBoxPreference7384 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCheckBoxPreference7401 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_ruleCheckBoxPreference7422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheckBoxPreference7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRingtonePrefence_in_entryRuleRingtonePrefence7470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRingtonePrefence7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRingtonePrefence7517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRingtonePrefence7534 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRingtonePrefence7551 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_ruleRingtonePrefence7572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRingtonePrefence7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceAttributes_in_entryRulePreferenceAttributes7620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferenceAttributes7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePreferenceAttributes7667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreferenceAttributes7684 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePreferenceAttributes7702 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferenceAttributes7719 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePreferenceAttributes7739 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleBOOL_in_rulePreferenceAttributes7760 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePreferenceAttributes7775 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleBOOL_in_rulePreferenceAttributes7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogPreferenceAttributes_in_entryRuleDialogPreferenceAttributes7834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogPreferenceAttributes7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDialogPreferenceAttributes7882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDialogPreferenceAttributes7899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDialogPreferenceAttributes7919 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDialogPreferenceAttributes7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListPreferenceAttributes_in_entryRuleListPreferenceAttributes7979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListPreferenceAttributes7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleListPreferenceAttributes8026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListPreferenceAttributes8049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleListPreferenceAttributes8061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListPreferenceAttributes8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndroResModelRoot_in_entryRuleAndroResModelRoot8120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroResModelRoot8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAndroResModelRoot8167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroResModelRoot8184 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndroResModelRoot8201 = new BitSet(new long[]{0x0000000000040010L,0x0000000000000050L});
    public static final BitSet FOLLOW_ruleResource_in_ruleAndroResModelRoot8222 = new BitSet(new long[]{0x0000000000040010L,0x0000000000000050L});
    public static final BitSet FOLLOW_18_in_ruleAndroResModelRoot8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource8271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringResource_in_ruleResource8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerResource_in_ruleResource8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanResource_in_ruleResource8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorResource_in_ruleResource8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionResource_in_ruleResource8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayResource_in_ruleResource8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_ruleResource8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringResource_in_entryRuleStringResource8525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringResource8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringResource8577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStringResource8594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringResource8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerResource_in_entryRuleIntegerResource8652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerResource8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerResource8704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleIntegerResource8721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerResource8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanResource_in_entryRuleBooleanResource8779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanResource8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanResource8831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBooleanResource8848 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanResource8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorResource_in_entryRuleColorResource8905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorResource8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorResource8957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleColorResource8974 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleColorResource8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionResource_in_entryRuleDimensionResource9032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionResource9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDimensionResource9084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDimensionResource9101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDimensionValue_in_ruleDimensionResource9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayResource_in_entryRuleArrayResource9158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayResource9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayResource_in_ruleArrayResource9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayResource_in_ruleArrayResource9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayResource_in_entryRuleIntegerArrayResource9277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerArrayResource9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIntegerArrayResource9324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerArrayResource9341 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerArrayResource9358 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource9380 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleIntegerArrayResource9393 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_ruleIntegerArrayResource9414 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_ruleIntegerArrayResource9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerArrayEntry_in_entryRuleIntegerArrayEntry9465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerArrayEntry9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerArrayEntry9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleIntegerArrayEntry9535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerArrayEntry9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayResource_in_entryRuleStringArrayResource9595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayResource9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleStringArrayResource9642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringArrayResource9659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringArrayResource9676 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource9698 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStringArrayResource9711 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_ruleStringArrayResource9732 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_ruleStringArrayResource9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayEntry_in_entryRuleStringArrayEntry9783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayEntry9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringArrayEntry9836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStringArrayEntry9853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringArrayEntry9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource9913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrawableResource9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource10032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitmapDrawableResource10042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource10084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBitmapDrawableResource10101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource10159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionDrawableResource10169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleTransitionDrawableResource10248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionValue_in_entryRuleDimensionValue10305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionValue10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleDimensionValue10363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_72_in_ruleDimensionValue10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDimensionValue10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDimensionValue10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDimensionValue10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDimensionValue10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDimensionValue10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL10519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBOOL10568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleBOOL10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT10628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT10679 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFLOAT10698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT10713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleApiLevel10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleApiLevel10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleApiLevel10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleApiLevel10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleApiLevel10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleApiLevel10859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDataTypes10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDataTypes10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDataTypes10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDataTypes10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLayoutStyle11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLayoutStyle11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleLayoutStyle11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleLayoutStyle11051 = new BitSet(new long[]{0x0000000000000002L});

}