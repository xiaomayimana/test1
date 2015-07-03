package person.zhoujg.parser.antlr.internal; 

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
import person.zhoujg.services.FeatureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFeatureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'root'", "'feature'", "'ref'", "'{'", "'rules'", "'}'", "'['", "'..'", "']'", "'opt'", "'<'", "'>'", "'attrs {'", "'!'", "'not'", "'('", "')'", "'true'", "'false'", "'.'", "'int'", "'string'", "'bool'", "'>='", "'=='", "'<='", "'<>'", "'recommend'", "'require'", "'exclude'", "'harm'", "'->'", "'<->'", "'and'", "'or'", "'&&'", "'||'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFeatureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureParser.tokenNames; }
    public String getGrammarFileName() { return "../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g"; }



     	private FeatureGrammarAccess grammarAccess;
     	
        public InternalFeatureParser(TokenStream input, FeatureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootDeclaration";	
       	}
       	
       	@Override
       	protected FeatureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRootDeclaration"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:68:1: entryRuleRootDeclaration returns [EObject current=null] : iv_ruleRootDeclaration= ruleRootDeclaration EOF ;
    public final EObject entryRuleRootDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootDeclaration = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:69:2: (iv_ruleRootDeclaration= ruleRootDeclaration EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:70:2: iv_ruleRootDeclaration= ruleRootDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRootDeclaration_in_entryRuleRootDeclaration75);
            iv_ruleRootDeclaration=ruleRootDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootDeclaration85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRootDeclaration"


    // $ANTLR start "ruleRootDeclaration"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:77:1: ruleRootDeclaration returns [EObject current=null] : (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inCard_2_0= ruleGroupCardinality ) )? ( (lv_body_3_0= ruleFeatureBody ) )? ) ;
    public final EObject ruleRootDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_inCard_2_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:80:28: ( (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inCard_2_0= ruleGroupCardinality ) )? ( (lv_body_3_0= ruleFeatureBody ) )? ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:81:1: (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inCard_2_0= ruleGroupCardinality ) )? ( (lv_body_3_0= ruleFeatureBody ) )? )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:81:1: (otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inCard_2_0= ruleGroupCardinality ) )? ( (lv_body_3_0= ruleFeatureBody ) )? )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:81:3: otherlv_0= 'root' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inCard_2_0= ruleGroupCardinality ) )? ( (lv_body_3_0= ruleFeatureBody ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRootDeclaration122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRootDeclarationAccess().getRootKeyword_0());
                  
            }
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:86:1: (lv_name_1_0= RULE_ID )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootDeclaration139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRootDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRootDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:103:2: ( (lv_inCard_2_0= ruleGroupCardinality ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:104:1: (lv_inCard_2_0= ruleGroupCardinality )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:104:1: (lv_inCard_2_0= ruleGroupCardinality )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:105:3: lv_inCard_2_0= ruleGroupCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRootDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupCardinality_in_ruleRootDeclaration165);
                    lv_inCard_2_0=ruleGroupCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRootDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"inCard",
                              		lv_inCard_2_0, 
                              		"GroupCardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:121:3: ( (lv_body_3_0= ruleFeatureBody ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:122:1: (lv_body_3_0= ruleFeatureBody )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:122:1: (lv_body_3_0= ruleFeatureBody )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:123:3: lv_body_3_0= ruleFeatureBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRootDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureBody_in_ruleRootDeclaration187);
                    lv_body_3_0=ruleFeatureBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRootDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_3_0, 
                              		"FeatureBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRootDeclaration"


    // $ANTLR start "entryRuleFeatureDeclaration"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:147:1: entryRuleFeatureDeclaration returns [EObject current=null] : iv_ruleFeatureDeclaration= ruleFeatureDeclaration EOF ;
    public final EObject entryRuleFeatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDeclaration = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:148:2: (iv_ruleFeatureDeclaration= ruleFeatureDeclaration EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:149:2: iv_ruleFeatureDeclaration= ruleFeatureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureDeclaration_in_entryRuleFeatureDeclaration224);
            iv_ruleFeatureDeclaration=ruleFeatureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureDeclaration234); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureDeclaration"


    // $ANTLR start "ruleFeatureDeclaration"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:156:1: ruleFeatureDeclaration returns [EObject current=null] : ( ( (lv_outCard_0_0= ruleStandaloneCardinality ) )? ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) ) ( (lv_inCard_5_0= ruleGroupCardinality ) )? ( (lv_body_6_0= ruleFeatureBody ) )? ) ;
    public final EObject ruleFeatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_outCard_0_0 = null;

        AntlrDatatypeRuleToken lv_inCard_5_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:159:28: ( ( ( (lv_outCard_0_0= ruleStandaloneCardinality ) )? ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) ) ( (lv_inCard_5_0= ruleGroupCardinality ) )? ( (lv_body_6_0= ruleFeatureBody ) )? ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:160:1: ( ( (lv_outCard_0_0= ruleStandaloneCardinality ) )? ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) ) ( (lv_inCard_5_0= ruleGroupCardinality ) )? ( (lv_body_6_0= ruleFeatureBody ) )? )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:160:1: ( ( (lv_outCard_0_0= ruleStandaloneCardinality ) )? ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) ) ( (lv_inCard_5_0= ruleGroupCardinality ) )? ( (lv_body_6_0= ruleFeatureBody ) )? )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:160:2: ( (lv_outCard_0_0= ruleStandaloneCardinality ) )? ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) ) ( (lv_inCard_5_0= ruleGroupCardinality ) )? ( (lv_body_6_0= ruleFeatureBody ) )?
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:160:2: ( (lv_outCard_0_0= ruleStandaloneCardinality ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17||LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:161:1: (lv_outCard_0_0= ruleStandaloneCardinality )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:161:1: (lv_outCard_0_0= ruleStandaloneCardinality )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:162:3: lv_outCard_0_0= ruleStandaloneCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getOutCardStandaloneCardinalityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStandaloneCardinality_in_ruleFeatureDeclaration280);
                    lv_outCard_0_0=ruleStandaloneCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"outCard",
                              		lv_outCard_0_0, 
                              		"StandaloneCardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:178:3: ( (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:178:4: (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:178:4: (otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:178:6: otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFeatureDeclaration295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFeatureDeclarationAccess().getFeatureKeyword_1_0_0());
                          
                    }
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:182:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:183:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:183:1: (lv_name_2_0= RULE_ID )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:184:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureDeclaration312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getFeatureDeclarationAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:201:6: (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:201:6: (otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:201:8: otherlv_3= 'ref' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFeatureDeclaration337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFeatureDeclarationAccess().getRefKeyword_1_1_0());
                          
                    }
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:205:1: ( (otherlv_4= RULE_ID ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:206:1: (otherlv_4= RULE_ID )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:206:1: (otherlv_4= RULE_ID )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:207:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureDeclaration357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getFeatureDeclarationAccess().getRefFeatureCrossReference_1_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:218:4: ( (lv_inCard_5_0= ruleGroupCardinality ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:219:1: (lv_inCard_5_0= ruleGroupCardinality )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:219:1: (lv_inCard_5_0= ruleGroupCardinality )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:220:3: lv_inCard_5_0= ruleGroupCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupCardinality_in_ruleFeatureDeclaration380);
                    lv_inCard_5_0=ruleGroupCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"inCard",
                              		lv_inCard_5_0, 
                              		"GroupCardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:236:3: ( (lv_body_6_0= ruleFeatureBody ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:237:1: (lv_body_6_0= ruleFeatureBody )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:237:1: (lv_body_6_0= ruleFeatureBody )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:238:3: lv_body_6_0= ruleFeatureBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureBody_in_ruleFeatureDeclaration402);
                    lv_body_6_0=ruleFeatureBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_6_0, 
                              		"FeatureBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "entryRuleFeatureBody"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:262:1: entryRuleFeatureBody returns [EObject current=null] : iv_ruleFeatureBody= ruleFeatureBody EOF ;
    public final EObject entryRuleFeatureBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureBody = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:263:2: (iv_ruleFeatureBody= ruleFeatureBody EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:264:2: iv_ruleFeatureBody= ruleFeatureBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureBodyRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureBody_in_entryRuleFeatureBody439);
            iv_ruleFeatureBody=ruleFeatureBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureBody449); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureBody"


    // $ANTLR start "ruleFeatureBody"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:271:1: ruleFeatureBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_attrs_2_0= ruleAttributePart ) )? ( (lv_features_3_0= ruleFeatureDeclaration ) )* ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFeatureBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_ruleBody_5_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:274:28: ( ( () otherlv_1= '{' ( (lv_attrs_2_0= ruleAttributePart ) )? ( (lv_features_3_0= ruleFeatureDeclaration ) )* ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )? otherlv_6= '}' ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:275:1: ( () otherlv_1= '{' ( (lv_attrs_2_0= ruleAttributePart ) )? ( (lv_features_3_0= ruleFeatureDeclaration ) )* ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )? otherlv_6= '}' )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:275:1: ( () otherlv_1= '{' ( (lv_attrs_2_0= ruleAttributePart ) )? ( (lv_features_3_0= ruleFeatureDeclaration ) )* ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )? otherlv_6= '}' )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:275:2: () otherlv_1= '{' ( (lv_attrs_2_0= ruleAttributePart ) )? ( (lv_features_3_0= ruleFeatureDeclaration ) )* ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )? otherlv_6= '}'
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:275:2: ()
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:276:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeatureBodyAccess().getFeatureBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFeatureBody495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFeatureBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:285:1: ( (lv_attrs_2_0= ruleAttributePart ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:286:1: (lv_attrs_2_0= ruleAttributePart )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:286:1: (lv_attrs_2_0= ruleAttributePart )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:287:3: lv_attrs_2_0= ruleAttributePart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureBodyAccess().getAttrsAttributePartParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributePart_in_ruleFeatureBody516);
                    lv_attrs_2_0=ruleAttributePart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"attrs",
                              		lv_attrs_2_0, 
                              		"AttributePart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:303:3: ( (lv_features_3_0= ruleFeatureDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=12 && LA8_0<=13)||LA8_0==17||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:304:1: (lv_features_3_0= ruleFeatureDeclaration )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:304:1: (lv_features_3_0= ruleFeatureDeclaration )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:305:3: lv_features_3_0= ruleFeatureDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFeatureBodyAccess().getFeaturesFeatureDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureDeclaration_in_ruleFeatureBody538);
            	    lv_features_3_0=ruleFeatureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFeatureBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_3_0, 
            	              		"FeatureDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:3: ( ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) && (synpred1_InternalFeature())) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:4: ( ( 'rules' )=>otherlv_4= 'rules' ) ( (lv_ruleBody_5_0= ruleRuleBody ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:4: ( ( 'rules' )=>otherlv_4= 'rules' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:5: ( 'rules' )=>otherlv_4= 'rules'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFeatureBody560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFeatureBodyAccess().getRulesKeyword_4_0());
                          
                    }

                    }

                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:326:2: ( (lv_ruleBody_5_0= ruleRuleBody ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:327:1: (lv_ruleBody_5_0= ruleRuleBody )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:327:1: (lv_ruleBody_5_0= ruleRuleBody )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:328:3: lv_ruleBody_5_0= ruleRuleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureBodyAccess().getRuleBodyRuleBodyParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRuleBody_in_ruleFeatureBody582);
                    lv_ruleBody_5_0=ruleRuleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"ruleBody",
                              		lv_ruleBody_5_0, 
                              		"RuleBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFeatureBody596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFeatureBodyAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeatureBody"


    // $ANTLR start "entryRuleStandaloneCardinality"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:356:1: entryRuleStandaloneCardinality returns [String current=null] : iv_ruleStandaloneCardinality= ruleStandaloneCardinality EOF ;
    public final String entryRuleStandaloneCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStandaloneCardinality = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:357:2: (iv_ruleStandaloneCardinality= ruleStandaloneCardinality EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:358:2: iv_ruleStandaloneCardinality= ruleStandaloneCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandaloneCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleStandaloneCardinality_in_entryRuleStandaloneCardinality633);
            iv_ruleStandaloneCardinality=ruleStandaloneCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandaloneCardinality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandaloneCardinality644); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandaloneCardinality"


    // $ANTLR start "ruleStandaloneCardinality"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:365:1: ruleStandaloneCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+ | kw= 'opt' ) ;
    public final AntlrDatatypeRuleToken ruleStandaloneCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:368:28: ( ( (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+ | kw= 'opt' ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:369:1: ( (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+ | kw= 'opt' )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:369:1: ( (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+ | kw= 'opt' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:369:2: (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:369:2: (kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:370:2: kw= '[' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= ']'
                    	    {
                    	    kw=(Token)match(input,17,FOLLOW_17_in_ruleStandaloneCardinality683); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getStandaloneCardinalityAccess().getLeftSquareBracketKeyword_0_0()); 
                    	          
                    	    }
                    	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStandaloneCardinality698); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_INT_1);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_INT_1, grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_1()); 
                    	          
                    	    }
                    	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:382:1: (kw= '..' this_INT_3= RULE_INT )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==18) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:383:2: kw= '..' this_INT_3= RULE_INT
                    	            {
                    	            kw=(Token)match(input,18,FOLLOW_18_in_ruleStandaloneCardinality717); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      current.merge(kw);
                    	                      newLeafNode(kw, grammarAccess.getStandaloneCardinalityAccess().getFullStopFullStopKeyword_0_2_0()); 
                    	                  
                    	            }
                    	            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStandaloneCardinality732); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_INT_3);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_INT_3, grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_2_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    kw=(Token)match(input,19,FOLLOW_19_in_ruleStandaloneCardinality752); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getStandaloneCardinalityAccess().getRightSquareBracketKeyword_0_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:403:2: kw= 'opt'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleStandaloneCardinality773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStandaloneCardinalityAccess().getOptKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStandaloneCardinality"


    // $ANTLR start "entryRuleGroupCardinality"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:416:1: entryRuleGroupCardinality returns [String current=null] : iv_ruleGroupCardinality= ruleGroupCardinality EOF ;
    public final String entryRuleGroupCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGroupCardinality = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:417:2: (iv_ruleGroupCardinality= ruleGroupCardinality EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:418:2: iv_ruleGroupCardinality= ruleGroupCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality814);
            iv_ruleGroupCardinality=ruleGroupCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupCardinality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupCardinality825); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroupCardinality"


    // $ANTLR start "ruleGroupCardinality"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:425:1: ruleGroupCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= '>' )+ ;
    public final AntlrDatatypeRuleToken ruleGroupCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:428:28: ( (kw= '<' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= '>' )+ )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:429:1: (kw= '<' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= '>' )+
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:429:1: (kw= '<' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= '>' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:430:2: kw= '<' this_INT_1= RULE_INT (kw= '..' this_INT_3= RULE_INT )? kw= '>'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleGroupCardinality863); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getGroupCardinalityAccess().getLessThanSignKeyword_0()); 
            	          
            	    }
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGroupCardinality878); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_1, grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:442:1: (kw= '..' this_INT_3= RULE_INT )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==18) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:443:2: kw= '..' this_INT_3= RULE_INT
            	            {
            	            kw=(Token)match(input,18,FOLLOW_18_in_ruleGroupCardinality897); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getGroupCardinalityAccess().getFullStopFullStopKeyword_2_0()); 
            	                  
            	            }
            	            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGroupCardinality912); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_3);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_3, grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_2_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleGroupCardinality932); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getGroupCardinalityAccess().getGreaterThanSignKeyword_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroupCardinality"


    // $ANTLR start "entryRuleAttributePart"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:469:1: entryRuleAttributePart returns [EObject current=null] : iv_ruleAttributePart= ruleAttributePart EOF ;
    public final EObject entryRuleAttributePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePart = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:470:2: (iv_ruleAttributePart= ruleAttributePart EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:471:2: iv_ruleAttributePart= ruleAttributePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributePartRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePart_in_entryRuleAttributePart973);
            iv_ruleAttributePart=ruleAttributePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePart983); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributePart"


    // $ANTLR start "ruleAttributePart"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:478:1: ruleAttributePart returns [EObject current=null] : ( () otherlv_1= 'attrs {' ( (lv_attr_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleAttributePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attr_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:481:28: ( ( () otherlv_1= 'attrs {' ( (lv_attr_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:482:1: ( () otherlv_1= 'attrs {' ( (lv_attr_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:482:1: ( () otherlv_1= 'attrs {' ( (lv_attr_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:482:2: () otherlv_1= 'attrs {' ( (lv_attr_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:482:2: ()
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:483:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributePartAccess().getAttributePartAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAttributePart1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributePartAccess().getAttrsKeyword_1());
                  
            }
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:492:1: ( (lv_attr_2_0= ruleAttribute ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:493:1: (lv_attr_2_0= ruleAttribute )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:493:1: (lv_attr_2_0= ruleAttribute )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:494:3: lv_attr_2_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributePartAccess().getAttrAttributeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributePart1050);
            	    lv_attr_2_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributePartRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attr",
            	              		lv_attr_2_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAttributePart1063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributePartAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributePart"


    // $ANTLR start "entryRuleRuleBody"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:522:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:523:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:524:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleBodyRule()); 
            }
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody1099);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody1109); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:531:1: ruleRuleBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_rules_2_0= ruleFeatureExpr ) )* otherlv_3= '}' ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rules_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:534:28: ( ( () otherlv_1= '{' ( (lv_rules_2_0= ruleFeatureExpr ) )* otherlv_3= '}' ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:535:1: ( () otherlv_1= '{' ( (lv_rules_2_0= ruleFeatureExpr ) )* otherlv_3= '}' )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:535:1: ( () otherlv_1= '{' ( (lv_rules_2_0= ruleFeatureExpr ) )* otherlv_3= '}' )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:535:2: () otherlv_1= '{' ( (lv_rules_2_0= ruleFeatureExpr ) )* otherlv_3= '}'
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:535:2: ()
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:536:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleBodyAccess().getRuleBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRuleBody1155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuleBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:545:1: ( (lv_rules_2_0= ruleFeatureExpr ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||(LA16_0>=24 && LA16_0<=26)||(LA16_0>=28 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:546:1: (lv_rules_2_0= ruleFeatureExpr )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:546:1: (lv_rules_2_0= ruleFeatureExpr )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:547:3: lv_rules_2_0= ruleFeatureExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleBodyAccess().getRulesFeatureExprParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureExpr_in_ruleRuleBody1176);
            	    lv_rules_2_0=ruleFeatureExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_2_0, 
            	              		"FeatureExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleRuleBody1189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleAttribute"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:575:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:576:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:577:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1225);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:584:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:587:28: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:588:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:588:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:588:2: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:588:2: ( (lv_type_0_0= ruleAttributeType ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:589:1: (lv_type_0_0= ruleAttributeType )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:589:1: (lv_type_0_0= ruleAttributeType )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:590:3: lv_type_0_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute1281);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"AttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:606:2: ( (lv_name_1_0= RULE_ID ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:607:1: (lv_name_1_0= RULE_ID )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:607:1: (lv_name_1_0= RULE_ID )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFeatureExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:632:1: entryRuleFeatureExpr returns [EObject current=null] : iv_ruleFeatureExpr= ruleFeatureExpr EOF ;
    public final EObject entryRuleFeatureExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureExpr = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:633:2: (iv_ruleFeatureExpr= ruleFeatureExpr EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:634:2: iv_ruleFeatureExpr= ruleFeatureExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureExprRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureExpr_in_entryRuleFeatureExpr1339);
            iv_ruleFeatureExpr=ruleFeatureExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureExpr1349); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureExpr"


    // $ANTLR start "ruleFeatureExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:641:1: ruleFeatureExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleLogicExpr ) ) ( (lv_op_1_0= ruleFeatureOP ) ) ( (lv_right_2_0= ruleLogicExpr ) ) ) ;
    public final EObject ruleFeatureExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:644:28: ( ( ( (lv_left_0_0= ruleLogicExpr ) ) ( (lv_op_1_0= ruleFeatureOP ) ) ( (lv_right_2_0= ruleLogicExpr ) ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:645:1: ( ( (lv_left_0_0= ruleLogicExpr ) ) ( (lv_op_1_0= ruleFeatureOP ) ) ( (lv_right_2_0= ruleLogicExpr ) ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:645:1: ( ( (lv_left_0_0= ruleLogicExpr ) ) ( (lv_op_1_0= ruleFeatureOP ) ) ( (lv_right_2_0= ruleLogicExpr ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:645:2: ( (lv_left_0_0= ruleLogicExpr ) ) ( (lv_op_1_0= ruleFeatureOP ) ) ( (lv_right_2_0= ruleLogicExpr ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:645:2: ( (lv_left_0_0= ruleLogicExpr ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:646:1: (lv_left_0_0= ruleLogicExpr )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:646:1: (lv_left_0_0= ruleLogicExpr )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:647:3: lv_left_0_0= ruleLogicExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureExprAccess().getLeftLogicExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_ruleFeatureExpr1395);
            lv_left_0_0=ruleLogicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeatureExprRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"LogicExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:663:2: ( (lv_op_1_0= ruleFeatureOP ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:664:1: (lv_op_1_0= ruleFeatureOP )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:664:1: (lv_op_1_0= ruleFeatureOP )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:665:3: lv_op_1_0= ruleFeatureOP
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureExprAccess().getOpFeatureOPEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureOP_in_ruleFeatureExpr1416);
            lv_op_1_0=ruleFeatureOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeatureExprRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"FeatureOP");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:681:2: ( (lv_right_2_0= ruleLogicExpr ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:682:1: (lv_right_2_0= ruleLogicExpr )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:682:1: (lv_right_2_0= ruleLogicExpr )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:683:3: lv_right_2_0= ruleLogicExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureExprAccess().getRightLogicExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_ruleFeatureExpr1437);
            lv_right_2_0=ruleLogicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeatureExprRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"LogicExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeatureExpr"


    // $ANTLR start "entryRuleLogicExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:707:1: entryRuleLogicExpr returns [EObject current=null] : iv_ruleLogicExpr= ruleLogicExpr EOF ;
    public final EObject entryRuleLogicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExpr = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:708:2: (iv_ruleLogicExpr= ruleLogicExpr EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:709:2: iv_ruleLogicExpr= ruleLogicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicExprRule()); 
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_entryRuleLogicExpr1473);
            iv_ruleLogicExpr=ruleLogicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExpr1483); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicExpr"


    // $ANTLR start "ruleLogicExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:716:1: ruleLogicExpr returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= 'not' )? ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) ) ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )* ) ;
    public final EObject ruleLogicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_leftLogicExpr_2_0 = null;

        Enumerator lv_logicOP_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:719:28: ( ( (otherlv_0= '!' | otherlv_1= 'not' )? ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) ) ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )* ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:720:1: ( (otherlv_0= '!' | otherlv_1= 'not' )? ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) ) ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )* )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:720:1: ( (otherlv_0= '!' | otherlv_1= 'not' )? ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) ) ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )* )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:720:2: (otherlv_0= '!' | otherlv_1= 'not' )? ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) ) ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )*
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:720:2: (otherlv_0= '!' | otherlv_1= 'not' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:720:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLogicExpr1521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getLogicExprAccess().getExclamationMarkKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:725:7: otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLogicExpr1539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicExprAccess().getNotKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:729:3: ( (lv_leftLogicExpr_2_0= ruleBasicExpr ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:730:1: (lv_leftLogicExpr_2_0= ruleBasicExpr )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:730:1: (lv_leftLogicExpr_2_0= ruleBasicExpr )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:731:3: lv_leftLogicExpr_2_0= ruleBasicExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicExprAccess().getLeftLogicExprBasicExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicExpr_in_ruleLogicExpr1562);
            lv_leftLogicExpr_2_0=ruleBasicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftLogicExpr",
                      		lv_leftLogicExpr_2_0, 
                      		"BasicExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:747:2: ( () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=44 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:747:3: () ( (lv_logicOP_4_0= ruleLogicOP ) ) ( (lv_right_5_0= ruleBasicExpr ) )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:747:3: ()
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:748:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicExprAccess().getLogicExprLeftLogicExprAction_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:753:2: ( (lv_logicOP_4_0= ruleLogicOP ) )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:754:1: (lv_logicOP_4_0= ruleLogicOP )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:754:1: (lv_logicOP_4_0= ruleLogicOP )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:755:3: lv_logicOP_4_0= ruleLogicOP
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicExprAccess().getLogicOPLogicOPEnumRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicOP_in_ruleLogicExpr1593);
            	    lv_logicOP_4_0=ruleLogicOP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"logicOP",
            	              		lv_logicOP_4_0, 
            	              		"LogicOP");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:771:2: ( (lv_right_5_0= ruleBasicExpr ) )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:772:1: (lv_right_5_0= ruleBasicExpr )
            	    {
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:772:1: (lv_right_5_0= ruleBasicExpr )
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:773:3: lv_right_5_0= ruleBasicExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicExprAccess().getRightBasicExprParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicExpr_in_ruleLogicExpr1614);
            	    lv_right_5_0=ruleBasicExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"BasicExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicExpr"


    // $ANTLR start "entryRuleBasicExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:797:1: entryRuleBasicExpr returns [EObject current=null] : iv_ruleBasicExpr= ruleBasicExpr EOF ;
    public final EObject entryRuleBasicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicExpr = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:798:2: (iv_ruleBasicExpr= ruleBasicExpr EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:799:2: iv_ruleBasicExpr= ruleBasicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicExprRule()); 
            }
            pushFollow(FOLLOW_ruleBasicExpr_in_entryRuleBasicExpr1652);
            iv_ruleBasicExpr=ruleBasicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicExpr1662); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicExpr"


    // $ANTLR start "ruleBasicExpr"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:806:1: ruleBasicExpr returns [EObject current=null] : ( ( (lv_lExpr_0_0= ruleAtom ) ) ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )? ) ;
    public final EObject ruleBasicExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_lExpr_0_0 = null;

        Enumerator lv_compOp_1_0 = null;

        EObject lv_rExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:809:28: ( ( ( (lv_lExpr_0_0= ruleAtom ) ) ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )? ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:810:1: ( ( (lv_lExpr_0_0= ruleAtom ) ) ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )? )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:810:1: ( ( (lv_lExpr_0_0= ruleAtom ) ) ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )? )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:810:2: ( (lv_lExpr_0_0= ruleAtom ) ) ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )?
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:810:2: ( (lv_lExpr_0_0= ruleAtom ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:811:1: (lv_lExpr_0_0= ruleAtom )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:811:1: (lv_lExpr_0_0= ruleAtom )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:812:3: lv_lExpr_0_0= ruleAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicExprAccess().getLExprAtomParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleBasicExpr1708);
            lv_lExpr_0_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicExprRule());
              	        }
                     		set(
                     			current, 
                     			"lExpr",
                      		lv_lExpr_0_0, 
                      		"Atom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:828:2: ( ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=21 && LA19_0<=22)||(LA19_0>=34 && LA19_0<=37)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:828:3: ( (lv_compOp_1_0= ruleComparationOP ) ) ( (lv_rExpr_2_0= ruleAtom ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:828:3: ( (lv_compOp_1_0= ruleComparationOP ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:829:1: (lv_compOp_1_0= ruleComparationOP )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:829:1: (lv_compOp_1_0= ruleComparationOP )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:830:3: lv_compOp_1_0= ruleComparationOP
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicExprAccess().getCompOpComparationOPEnumRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparationOP_in_ruleBasicExpr1730);
                    lv_compOp_1_0=ruleComparationOP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"compOp",
                              		lv_compOp_1_0, 
                              		"ComparationOP");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:846:2: ( (lv_rExpr_2_0= ruleAtom ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:847:1: (lv_rExpr_2_0= ruleAtom )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:847:1: (lv_rExpr_2_0= ruleAtom )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:848:3: lv_rExpr_2_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicExprAccess().getRExprAtomParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleBasicExpr1751);
                    lv_rExpr_2_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"rExpr",
                              		lv_rExpr_2_0, 
                              		"Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicExpr"


    // $ANTLR start "entryRuleAtom"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:872:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:873:2: (iv_ruleAtom= ruleAtom EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:874:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1789);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:881:1: ruleAtom returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_literal_0_0 = null;

        EObject lv_sub_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:884:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:885:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:885:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||(LA20_0>=28 && LA20_0<=29)) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:885:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:885:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:886:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:886:1: (lv_literal_0_0= ruleLiteral )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:887:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAtom1845);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_0_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:904:6: (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:904:6: (otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:904:8: otherlv_1= '(' ( (lv_sub_2_0= ruleLogicExpr ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAtom1864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:908:1: ( (lv_sub_2_0= ruleLogicExpr ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:909:1: (lv_sub_2_0= ruleLogicExpr )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:909:1: (lv_sub_2_0= ruleLogicExpr )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:910:3: lv_sub_2_0= ruleLogicExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getSubLogicExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpr_in_ruleAtom1885);
                    lv_sub_2_0=ruleLogicExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"sub",
                              		lv_sub_2_0, 
                              		"LogicExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleAtom1897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleLiteral"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:938:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:939:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:940:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1934);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1944); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:947:1: ruleLiteral returns [EObject current=null] : ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (lv_bool_2_0= ruleBOOL ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_int_1_0=null;
        AntlrDatatypeRuleToken lv_bool_2_0 = null;


         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:950:28: ( ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (lv_bool_2_0= ruleBOOL ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:951:1: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (lv_bool_2_0= ruleBOOL ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:951:1: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (lv_bool_2_0= ruleBOOL ) ) | ( ( ruleQualifiedName ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
                {
                alt21=2;
                }
                break;
            case 28:
            case 29:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:951:2: ( (lv_str_0_0= RULE_STRING ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:951:2: ( (lv_str_0_0= RULE_STRING ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:952:1: (lv_str_0_0= RULE_STRING )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:952:1: (lv_str_0_0= RULE_STRING )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:953:3: lv_str_0_0= RULE_STRING
                    {
                    lv_str_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral1986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_str_0_0, grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"str",
                              		lv_str_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:970:6: ( (lv_int_1_0= RULE_INT ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:970:6: ( (lv_int_1_0= RULE_INT ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:971:1: (lv_int_1_0= RULE_INT )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:971:1: (lv_int_1_0= RULE_INT )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:972:3: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral2014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_int_1_0, grammarAccess.getLiteralAccess().getIntINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"int",
                              		lv_int_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:989:6: ( (lv_bool_2_0= ruleBOOL ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:989:6: ( (lv_bool_2_0= ruleBOOL ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:990:1: (lv_bool_2_0= ruleBOOL )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:990:1: (lv_bool_2_0= ruleBOOL )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:991:3: lv_bool_2_0= ruleBOOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getBoolBOOLParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBOOL_in_ruleLiteral2046);
                    lv_bool_2_0=ruleBOOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"bool",
                              		lv_bool_2_0, 
                              		"BOOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1008:6: ( ( ruleQualifiedName ) )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1008:6: ( ( ruleQualifiedName ) )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1009:1: ( ruleQualifiedName )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1009:1: ( ruleQualifiedName )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1010:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getNameFeatureCrossReference_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLiteral2075);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBOOL"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1031:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1032:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1033:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL2112);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL2123); if (state.failed) return current;

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
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1040:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1043:28: ( (kw= 'true' | kw= 'false' ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1044:1: (kw= 'true' | kw= 'false' )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1044:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1045:2: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleBOOL2161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1052:2: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleBOOL2180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleQualifiedName"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1065:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1066:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1067:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2221);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2232); if (state.failed) return current;

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
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1074:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1077:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1078:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1078:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1078:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1085:1: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1086:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedName2291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2306); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeType"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1106:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'bool' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1108:28: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'bool' ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1109:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'bool' ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1109:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'bool' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case 33:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1109:2: (enumLiteral_0= 'int' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1109:2: (enumLiteral_0= 'int' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1109:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleAttributeType2367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1115:6: (enumLiteral_1= 'string' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1115:6: (enumLiteral_1= 'string' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1115:8: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleAttributeType2384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1121:6: (enumLiteral_2= 'bool' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1121:6: (enumLiteral_2= 'bool' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1121:8: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleAttributeType2401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getBoolEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleComparationOP"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1131:1: ruleComparationOP returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<>' ) ) ;
    public final Enumerator ruleComparationOP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1133:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<>' ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1134:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1134:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<>' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            case 21:
                {
                alt25=4;
                }
                break;
            case 36:
                {
                alt25=5;
                }
                break;
            case 37:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1134:2: (enumLiteral_0= '>' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1134:2: (enumLiteral_0= '>' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1134:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleComparationOP2446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparationOPAccess().getGTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1140:6: (enumLiteral_1= '>=' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1140:6: (enumLiteral_1= '>=' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1140:8: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleComparationOP2463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparationOPAccess().getGEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1146:6: (enumLiteral_2= '==' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1146:6: (enumLiteral_2= '==' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1146:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleComparationOP2480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparationOPAccess().getEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1152:6: (enumLiteral_3= '<' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1152:6: (enumLiteral_3= '<' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1152:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_ruleComparationOP2497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getLTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparationOPAccess().getLTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1158:6: (enumLiteral_4= '<=' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1158:6: (enumLiteral_4= '<=' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1158:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_ruleComparationOP2514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparationOPAccess().getLEEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1164:6: (enumLiteral_5= '<>' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1164:6: (enumLiteral_5= '<>' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1164:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_37_in_ruleComparationOP2531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparationOPAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparationOPAccess().getNEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparationOP"


    // $ANTLR start "ruleFeatureOP"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1174:1: ruleFeatureOP returns [Enumerator current=null] : ( (enumLiteral_0= 'recommend' ) | (enumLiteral_1= 'require' ) | (enumLiteral_2= 'exclude' ) | (enumLiteral_3= 'harm' ) | (enumLiteral_4= '->' ) | (enumLiteral_5= '<->' ) ) ;
    public final Enumerator ruleFeatureOP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1176:28: ( ( (enumLiteral_0= 'recommend' ) | (enumLiteral_1= 'require' ) | (enumLiteral_2= 'exclude' ) | (enumLiteral_3= 'harm' ) | (enumLiteral_4= '->' ) | (enumLiteral_5= '<->' ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1177:1: ( (enumLiteral_0= 'recommend' ) | (enumLiteral_1= 'require' ) | (enumLiteral_2= 'exclude' ) | (enumLiteral_3= 'harm' ) | (enumLiteral_4= '->' ) | (enumLiteral_5= '<->' ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1177:1: ( (enumLiteral_0= 'recommend' ) | (enumLiteral_1= 'require' ) | (enumLiteral_2= 'exclude' ) | (enumLiteral_3= 'harm' ) | (enumLiteral_4= '->' ) | (enumLiteral_5= '<->' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case 40:
                {
                alt26=3;
                }
                break;
            case 41:
                {
                alt26=4;
                }
                break;
            case 42:
                {
                alt26=5;
                }
                break;
            case 43:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1177:2: (enumLiteral_0= 'recommend' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1177:2: (enumLiteral_0= 'recommend' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1177:4: enumLiteral_0= 'recommend'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleFeatureOP2576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getRECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getFeatureOPAccess().getRECEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1183:6: (enumLiteral_1= 'require' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1183:6: (enumLiteral_1= 'require' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1183:8: enumLiteral_1= 'require'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleFeatureOP2593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1189:6: (enumLiteral_2= 'exclude' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1189:6: (enumLiteral_2= 'exclude' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1189:8: enumLiteral_2= 'exclude'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleFeatureOP2610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1195:6: (enumLiteral_3= 'harm' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1195:6: (enumLiteral_3= 'harm' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1195:8: enumLiteral_3= 'harm'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleFeatureOP2627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getFeatureOPAccess().getHAREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1201:6: (enumLiteral_4= '->' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1201:6: (enumLiteral_4= '->' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1201:8: enumLiteral_4= '->'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleFeatureOP2644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1207:6: (enumLiteral_5= '<->' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1207:6: (enumLiteral_5= '<->' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1207:8: enumLiteral_5= '<->'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_43_in_ruleFeatureOP2661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeatureOP"


    // $ANTLR start "ruleLogicOP"
    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1217:1: ruleLogicOP returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) ) ;
    public final Enumerator ruleLogicOP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1219:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) ) )
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1220:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) )
            {
            // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1220:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            case 47:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1220:2: (enumLiteral_0= 'and' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1220:2: (enumLiteral_0= 'and' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1220:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleLogicOP2706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1226:6: (enumLiteral_1= 'or' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1226:6: (enumLiteral_1= 'or' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1226:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleLogicOP2723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1232:6: (enumLiteral_2= '&&' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1232:6: (enumLiteral_2= '&&' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1232:8: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleLogicOP2740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1238:6: (enumLiteral_3= '||' )
                    {
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1238:6: (enumLiteral_3= '||' )
                    // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:1238:8: enumLiteral_3= '||'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleLogicOP2757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicOP"

    // $ANTLR start synpred1_InternalFeature
    public final void synpred1_InternalFeature_fragment() throws RecognitionException {   
        // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:5: ( 'rules' )
        // ../person.zhoujg.feature/src-gen/person/zhoujg/parser/antlr/internal/InternalFeature.g:321:7: 'rules'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalFeature552); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalFeature

    // Delegated rules

    public final boolean synpred1_InternalFeature() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFeature_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleRootDeclaration_in_entryRuleRootDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRootDeclaration122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootDeclaration139 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_ruleRootDeclaration165 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_ruleRootDeclaration187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDeclaration_in_entryRuleFeatureDeclaration224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureDeclaration234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandaloneCardinality_in_ruleFeatureDeclaration280 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleFeatureDeclaration295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureDeclaration312 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_13_in_ruleFeatureDeclaration337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureDeclaration357 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_ruleFeatureDeclaration380 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_ruleFeatureDeclaration402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_entryRuleFeatureBody439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureBody449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFeatureBody495 = new BitSet(new long[]{0x000000000093B000L});
    public static final BitSet FOLLOW_ruleAttributePart_in_ruleFeatureBody516 = new BitSet(new long[]{0x000000000013B000L});
    public static final BitSet FOLLOW_ruleFeatureDeclaration_in_ruleFeatureBody538 = new BitSet(new long[]{0x000000000013B000L});
    public static final BitSet FOLLOW_15_in_ruleFeatureBody560 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleFeatureBody582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureBody596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandaloneCardinality_in_entryRuleStandaloneCardinality633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandaloneCardinality644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStandaloneCardinality683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStandaloneCardinality698 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleStandaloneCardinality717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStandaloneCardinality732 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStandaloneCardinality752 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_20_in_ruleStandaloneCardinality773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupCardinality825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGroupCardinality863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGroupCardinality878 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleGroupCardinality897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGroupCardinality912 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGroupCardinality932 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAttributePart_in_entryRuleAttributePart973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePart983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributePart1029 = new BitSet(new long[]{0x0000000380010000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributePart1050 = new BitSet(new long[]{0x0000000380010000L});
    public static final BitSet FOLLOW_16_in_ruleAttributePart1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRuleBody1155 = new BitSet(new long[]{0x0000000037010070L});
    public static final BitSet FOLLOW_ruleFeatureExpr_in_ruleRuleBody1176 = new BitSet(new long[]{0x0000000037010070L});
    public static final BitSet FOLLOW_16_in_ruleRuleBody1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureExpr_in_entryRuleFeatureExpr1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureExpr1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_ruleFeatureExpr1395 = new BitSet(new long[]{0x00000FC000000000L});
    public static final BitSet FOLLOW_ruleFeatureOP_in_ruleFeatureExpr1416 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_ruleFeatureExpr1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_entryRuleLogicExpr1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExpr1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLogicExpr1521 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_25_in_ruleLogicExpr1539 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_ruleLogicExpr1562 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleLogicOP_in_ruleLogicExpr1593 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_ruleLogicExpr1614 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_entryRuleBasicExpr1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicExpr1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleBasicExpr1708 = new BitSet(new long[]{0x0000003C00600002L});
    public static final BitSet FOLLOW_ruleComparationOP_in_ruleBasicExpr1730 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleBasicExpr1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAtom1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAtom1864 = new BitSet(new long[]{0x0000000037000070L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_ruleAtom1885 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAtom1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleLiteral2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLiteral2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBOOL2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBOOL2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2272 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedName2291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2306 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeType2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAttributeType2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAttributeType2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleComparationOP2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleComparationOP2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleComparationOP2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleComparationOP2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleComparationOP2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleComparationOP2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFeatureOP2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFeatureOP2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFeatureOP2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFeatureOP2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFeatureOP2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFeatureOP2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLogicOP2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLogicOP2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLogicOP2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogicOP2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalFeature552 = new BitSet(new long[]{0x0000000000000002L});

}