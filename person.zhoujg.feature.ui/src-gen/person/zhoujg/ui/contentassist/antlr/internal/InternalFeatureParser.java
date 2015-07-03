package person.zhoujg.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import person.zhoujg.services.FeatureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFeatureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'opt'", "'!'", "'not'", "'true'", "'false'", "'int'", "'string'", "'bool'", "'>'", "'>='", "'=='", "'<'", "'<='", "'<>'", "'recommend'", "'require'", "'exclude'", "'harm'", "'->'", "'<->'", "'and'", "'or'", "'&&'", "'||'", "'root'", "'feature'", "'ref'", "'{'", "'}'", "'rules'", "'['", "']'", "'..'", "'attrs {'", "'('", "')'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g"; }


     
     	private FeatureGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FeatureGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRootDeclaration"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:61:1: entryRuleRootDeclaration : ruleRootDeclaration EOF ;
    public final void entryRuleRootDeclaration() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:62:1: ( ruleRootDeclaration EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:63:1: ruleRootDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRootDeclaration_in_entryRuleRootDeclaration67);
            ruleRootDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootDeclaration74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRootDeclaration"


    // $ANTLR start "ruleRootDeclaration"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:70:1: ruleRootDeclaration : ( ( rule__RootDeclaration__Group__0 ) ) ;
    public final void ruleRootDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:74:2: ( ( ( rule__RootDeclaration__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:75:1: ( ( rule__RootDeclaration__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:75:1: ( ( rule__RootDeclaration__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:76:1: ( rule__RootDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:77:1: ( rule__RootDeclaration__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:77:2: rule__RootDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__RootDeclaration__Group__0_in_ruleRootDeclaration100);
            rule__RootDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootDeclaration"


    // $ANTLR start "entryRuleFeatureDeclaration"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:89:1: entryRuleFeatureDeclaration : ruleFeatureDeclaration EOF ;
    public final void entryRuleFeatureDeclaration() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:90:1: ( ruleFeatureDeclaration EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:91:1: ruleFeatureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureDeclaration_in_entryRuleFeatureDeclaration127);
            ruleFeatureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureDeclaration134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeatureDeclaration"


    // $ANTLR start "ruleFeatureDeclaration"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:98:1: ruleFeatureDeclaration : ( ( rule__FeatureDeclaration__Group__0 ) ) ;
    public final void ruleFeatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:102:2: ( ( ( rule__FeatureDeclaration__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:103:1: ( ( rule__FeatureDeclaration__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:103:1: ( ( rule__FeatureDeclaration__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:104:1: ( rule__FeatureDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:105:1: ( rule__FeatureDeclaration__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:105:2: rule__FeatureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__0_in_ruleFeatureDeclaration160);
            rule__FeatureDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "entryRuleFeatureBody"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:117:1: entryRuleFeatureBody : ruleFeatureBody EOF ;
    public final void entryRuleFeatureBody() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:118:1: ( ruleFeatureBody EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:119:1: ruleFeatureBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureBody_in_entryRuleFeatureBody187);
            ruleFeatureBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureBody194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeatureBody"


    // $ANTLR start "ruleFeatureBody"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:126:1: ruleFeatureBody : ( ( rule__FeatureBody__Group__0 ) ) ;
    public final void ruleFeatureBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:130:2: ( ( ( rule__FeatureBody__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:131:1: ( ( rule__FeatureBody__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:131:1: ( ( rule__FeatureBody__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:132:1: ( rule__FeatureBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:133:1: ( rule__FeatureBody__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:133:2: rule__FeatureBody__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__0_in_ruleFeatureBody220);
            rule__FeatureBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureBody"


    // $ANTLR start "entryRuleStandaloneCardinality"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:145:1: entryRuleStandaloneCardinality : ruleStandaloneCardinality EOF ;
    public final void entryRuleStandaloneCardinality() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:146:1: ( ruleStandaloneCardinality EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:147:1: ruleStandaloneCardinality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleStandaloneCardinality_in_entryRuleStandaloneCardinality247);
            ruleStandaloneCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandaloneCardinality254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStandaloneCardinality"


    // $ANTLR start "ruleStandaloneCardinality"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:154:1: ruleStandaloneCardinality : ( ( rule__StandaloneCardinality__Alternatives ) ) ;
    public final void ruleStandaloneCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:158:2: ( ( ( rule__StandaloneCardinality__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:159:1: ( ( rule__StandaloneCardinality__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:159:1: ( ( rule__StandaloneCardinality__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:160:1: ( rule__StandaloneCardinality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:161:1: ( rule__StandaloneCardinality__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:161:2: rule__StandaloneCardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Alternatives_in_ruleStandaloneCardinality280);
            rule__StandaloneCardinality__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandaloneCardinality"


    // $ANTLR start "entryRuleGroupCardinality"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:173:1: entryRuleGroupCardinality : ruleGroupCardinality EOF ;
    public final void entryRuleGroupCardinality() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:174:1: ( ruleGroupCardinality EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:175:1: ruleGroupCardinality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality307);
            ruleGroupCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupCardinality314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGroupCardinality"


    // $ANTLR start "ruleGroupCardinality"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:182:1: ruleGroupCardinality : ( ( ( rule__GroupCardinality__Group__0 ) ) ( ( rule__GroupCardinality__Group__0 )* ) ) ;
    public final void ruleGroupCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:186:2: ( ( ( ( rule__GroupCardinality__Group__0 ) ) ( ( rule__GroupCardinality__Group__0 )* ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:187:1: ( ( ( rule__GroupCardinality__Group__0 ) ) ( ( rule__GroupCardinality__Group__0 )* ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:187:1: ( ( ( rule__GroupCardinality__Group__0 ) ) ( ( rule__GroupCardinality__Group__0 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:188:1: ( ( rule__GroupCardinality__Group__0 ) ) ( ( rule__GroupCardinality__Group__0 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:188:1: ( ( rule__GroupCardinality__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:189:1: ( rule__GroupCardinality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:190:1: ( rule__GroupCardinality__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:190:2: rule__GroupCardinality__Group__0
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group__0_in_ruleGroupCardinality342);
            rule__GroupCardinality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getGroup()); 
            }

            }

            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:193:1: ( ( rule__GroupCardinality__Group__0 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:194:1: ( rule__GroupCardinality__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:195:1: ( rule__GroupCardinality__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:195:2: rule__GroupCardinality__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupCardinality__Group__0_in_ruleGroupCardinality354);
            	    rule__GroupCardinality__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupCardinality"


    // $ANTLR start "entryRuleAttributePart"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:208:1: entryRuleAttributePart : ruleAttributePart EOF ;
    public final void entryRuleAttributePart() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:209:1: ( ruleAttributePart EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:210:1: ruleAttributePart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePart_in_entryRuleAttributePart384);
            ruleAttributePart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePart391); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributePart"


    // $ANTLR start "ruleAttributePart"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:217:1: ruleAttributePart : ( ( rule__AttributePart__Group__0 ) ) ;
    public final void ruleAttributePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:221:2: ( ( ( rule__AttributePart__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:222:1: ( ( rule__AttributePart__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:222:1: ( ( rule__AttributePart__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:223:1: ( rule__AttributePart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:224:1: ( rule__AttributePart__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:224:2: rule__AttributePart__Group__0
            {
            pushFollow(FOLLOW_rule__AttributePart__Group__0_in_ruleAttributePart417);
            rule__AttributePart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributePart"


    // $ANTLR start "entryRuleRuleBody"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:236:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:237:1: ( ruleRuleBody EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:238:1: ruleRuleBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyRule()); 
            }
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody444);
            ruleRuleBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody451); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:245:1: ruleRuleBody : ( ( rule__RuleBody__Group__0 ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:249:2: ( ( ( rule__RuleBody__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:250:1: ( ( rule__RuleBody__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:250:1: ( ( rule__RuleBody__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:251:1: ( rule__RuleBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:252:1: ( rule__RuleBody__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:252:2: rule__RuleBody__Group__0
            {
            pushFollow(FOLLOW_rule__RuleBody__Group__0_in_ruleRuleBody477);
            rule__RuleBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleAttribute"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:264:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:265:1: ( ruleAttribute EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:266:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute504);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute511); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:273:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:277:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:278:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:278:1: ( ( rule__Attribute__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:279:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:280:1: ( rule__Attribute__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:280:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute537);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFeatureExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:292:1: entryRuleFeatureExpr : ruleFeatureExpr EOF ;
    public final void entryRuleFeatureExpr() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:293:1: ( ruleFeatureExpr EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:294:1: ruleFeatureExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureExpr_in_entryRuleFeatureExpr564);
            ruleFeatureExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureExpr571); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeatureExpr"


    // $ANTLR start "ruleFeatureExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:301:1: ruleFeatureExpr : ( ( rule__FeatureExpr__Group__0 ) ) ;
    public final void ruleFeatureExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:305:2: ( ( ( rule__FeatureExpr__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:306:1: ( ( rule__FeatureExpr__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:306:1: ( ( rule__FeatureExpr__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:307:1: ( rule__FeatureExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:308:1: ( rule__FeatureExpr__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:308:2: rule__FeatureExpr__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureExpr__Group__0_in_ruleFeatureExpr597);
            rule__FeatureExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureExpr"


    // $ANTLR start "entryRuleLogicExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:320:1: entryRuleLogicExpr : ruleLogicExpr EOF ;
    public final void entryRuleLogicExpr() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:321:1: ( ruleLogicExpr EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:322:1: ruleLogicExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprRule()); 
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_entryRuleLogicExpr624);
            ruleLogicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExpr631); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicExpr"


    // $ANTLR start "ruleLogicExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:329:1: ruleLogicExpr : ( ( rule__LogicExpr__Group__0 ) ) ;
    public final void ruleLogicExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:333:2: ( ( ( rule__LogicExpr__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:334:1: ( ( rule__LogicExpr__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:334:1: ( ( rule__LogicExpr__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:335:1: ( rule__LogicExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:336:1: ( rule__LogicExpr__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:336:2: rule__LogicExpr__Group__0
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group__0_in_ruleLogicExpr657);
            rule__LogicExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicExpr"


    // $ANTLR start "entryRuleBasicExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:348:1: entryRuleBasicExpr : ruleBasicExpr EOF ;
    public final void entryRuleBasicExpr() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:349:1: ( ruleBasicExpr EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:350:1: ruleBasicExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprRule()); 
            }
            pushFollow(FOLLOW_ruleBasicExpr_in_entryRuleBasicExpr684);
            ruleBasicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicExpr691); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicExpr"


    // $ANTLR start "ruleBasicExpr"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:357:1: ruleBasicExpr : ( ( rule__BasicExpr__Group__0 ) ) ;
    public final void ruleBasicExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:361:2: ( ( ( rule__BasicExpr__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:362:1: ( ( rule__BasicExpr__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:362:1: ( ( rule__BasicExpr__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:363:1: ( rule__BasicExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:364:1: ( rule__BasicExpr__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:364:2: rule__BasicExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BasicExpr__Group__0_in_ruleBasicExpr717);
            rule__BasicExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicExpr"


    // $ANTLR start "entryRuleAtom"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:376:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:377:1: ( ruleAtom EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:378:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom744);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom751); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:385:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:389:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:390:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:390:1: ( ( rule__Atom__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:391:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:392:1: ( rule__Atom__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:392:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom777);
            rule__Atom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleLiteral"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:404:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:405:1: ( ruleLiteral EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:406:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral804);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral811); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:413:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:417:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:418:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:418:1: ( ( rule__Literal__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:419:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:420:1: ( rule__Literal__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:420:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral837);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBOOL"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:432:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:433:1: ( ruleBOOL EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:434:1: ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL864);
            ruleBOOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL871); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:441:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:445:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:446:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:446:1: ( ( rule__BOOL__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:447:1: ( rule__BOOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:448:1: ( rule__BOOL__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:448:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL897);
            rule__BOOL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleQualifiedName"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:460:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:461:1: ( ruleQualifiedName EOF )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:462:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName924);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName931); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:469:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:473:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:474:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:474:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:475:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:476:1: ( rule__QualifiedName__Group__0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:476:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName957);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeType"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:489:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:493:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:494:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:494:1: ( ( rule__AttributeType__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:495:1: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:496:1: ( rule__AttributeType__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:496:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType994);
            rule__AttributeType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleComparationOP"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:508:1: ruleComparationOP : ( ( rule__ComparationOP__Alternatives ) ) ;
    public final void ruleComparationOP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:512:1: ( ( ( rule__ComparationOP__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:513:1: ( ( rule__ComparationOP__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:513:1: ( ( rule__ComparationOP__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:514:1: ( rule__ComparationOP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparationOPAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:515:1: ( rule__ComparationOP__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:515:2: rule__ComparationOP__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparationOP__Alternatives_in_ruleComparationOP1030);
            rule__ComparationOP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparationOPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparationOP"


    // $ANTLR start "ruleFeatureOP"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:527:1: ruleFeatureOP : ( ( rule__FeatureOP__Alternatives ) ) ;
    public final void ruleFeatureOP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:531:1: ( ( ( rule__FeatureOP__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:532:1: ( ( rule__FeatureOP__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:532:1: ( ( rule__FeatureOP__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:533:1: ( rule__FeatureOP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureOPAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:534:1: ( rule__FeatureOP__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:534:2: rule__FeatureOP__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureOP__Alternatives_in_ruleFeatureOP1066);
            rule__FeatureOP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureOPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureOP"


    // $ANTLR start "ruleLogicOP"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:546:1: ruleLogicOP : ( ( rule__LogicOP__Alternatives ) ) ;
    public final void ruleLogicOP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:550:1: ( ( ( rule__LogicOP__Alternatives ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:551:1: ( ( rule__LogicOP__Alternatives ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:551:1: ( ( rule__LogicOP__Alternatives ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:552:1: ( rule__LogicOP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOPAccess().getAlternatives()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:553:1: ( rule__LogicOP__Alternatives )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:553:2: rule__LogicOP__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOP__Alternatives_in_ruleLogicOP1102);
            rule__LogicOP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOP"


    // $ANTLR start "rule__FeatureDeclaration__Alternatives_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:564:1: rule__FeatureDeclaration__Alternatives_1 : ( ( ( rule__FeatureDeclaration__Group_1_0__0 ) ) | ( ( rule__FeatureDeclaration__Group_1_1__0 ) ) );
    public final void rule__FeatureDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:568:1: ( ( ( rule__FeatureDeclaration__Group_1_0__0 ) ) | ( ( rule__FeatureDeclaration__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:569:1: ( ( rule__FeatureDeclaration__Group_1_0__0 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:569:1: ( ( rule__FeatureDeclaration__Group_1_0__0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:570:1: ( rule__FeatureDeclaration__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureDeclarationAccess().getGroup_1_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:571:1: ( rule__FeatureDeclaration__Group_1_0__0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:571:2: rule__FeatureDeclaration__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_0__0_in_rule__FeatureDeclaration__Alternatives_11137);
                    rule__FeatureDeclaration__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureDeclarationAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:575:6: ( ( rule__FeatureDeclaration__Group_1_1__0 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:575:6: ( ( rule__FeatureDeclaration__Group_1_1__0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:576:1: ( rule__FeatureDeclaration__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureDeclarationAccess().getGroup_1_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:577:1: ( rule__FeatureDeclaration__Group_1_1__0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:577:2: rule__FeatureDeclaration__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_1__0_in_rule__FeatureDeclaration__Alternatives_11155);
                    rule__FeatureDeclaration__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureDeclarationAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Alternatives_1"


    // $ANTLR start "rule__StandaloneCardinality__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:586:1: rule__StandaloneCardinality__Alternatives : ( ( ( ( rule__StandaloneCardinality__Group_0__0 ) ) ( ( rule__StandaloneCardinality__Group_0__0 )* ) ) | ( 'opt' ) );
    public final void rule__StandaloneCardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:590:1: ( ( ( ( rule__StandaloneCardinality__Group_0__0 ) ) ( ( rule__StandaloneCardinality__Group_0__0 )* ) ) | ( 'opt' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:591:1: ( ( ( rule__StandaloneCardinality__Group_0__0 ) ) ( ( rule__StandaloneCardinality__Group_0__0 )* ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:591:1: ( ( ( rule__StandaloneCardinality__Group_0__0 ) ) ( ( rule__StandaloneCardinality__Group_0__0 )* ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:592:1: ( ( rule__StandaloneCardinality__Group_0__0 ) ) ( ( rule__StandaloneCardinality__Group_0__0 )* )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:592:1: ( ( rule__StandaloneCardinality__Group_0__0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:593:1: ( rule__StandaloneCardinality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStandaloneCardinalityAccess().getGroup_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:594:1: ( rule__StandaloneCardinality__Group_0__0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:594:2: rule__StandaloneCardinality__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__0_in_rule__StandaloneCardinality__Alternatives1190);
                    rule__StandaloneCardinality__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStandaloneCardinalityAccess().getGroup_0()); 
                    }

                    }

                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:597:1: ( ( rule__StandaloneCardinality__Group_0__0 )* )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:598:1: ( rule__StandaloneCardinality__Group_0__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStandaloneCardinalityAccess().getGroup_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:599:1: ( rule__StandaloneCardinality__Group_0__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==41) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:599:2: rule__StandaloneCardinality__Group_0__0
                    	    {
                    	    pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__0_in_rule__StandaloneCardinality__Alternatives1202);
                    	    rule__StandaloneCardinality__Group_0__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStandaloneCardinalityAccess().getGroup_0()); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:604:6: ( 'opt' )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:604:6: ( 'opt' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:605:1: 'opt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStandaloneCardinalityAccess().getOptKeyword_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__StandaloneCardinality__Alternatives1224); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStandaloneCardinalityAccess().getOptKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Alternatives"


    // $ANTLR start "rule__LogicExpr__Alternatives_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:617:1: rule__LogicExpr__Alternatives_0 : ( ( '!' ) | ( 'not' ) );
    public final void rule__LogicExpr__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:621:1: ( ( '!' ) | ( 'not' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:622:1: ( '!' )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:622:1: ( '!' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:623:1: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicExprAccess().getExclamationMarkKeyword_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__LogicExpr__Alternatives_01259); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicExprAccess().getExclamationMarkKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:630:6: ( 'not' )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:630:6: ( 'not' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:631:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicExprAccess().getNotKeyword_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__LogicExpr__Alternatives_01279); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicExprAccess().getNotKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Alternatives_0"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:643:1: rule__Atom__Alternatives : ( ( ( rule__Atom__LiteralAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:647:1: ( ( ( rule__Atom__LiteralAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:648:1: ( ( rule__Atom__LiteralAssignment_0 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:648:1: ( ( rule__Atom__LiteralAssignment_0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:649:1: ( rule__Atom__LiteralAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getLiteralAssignment_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:650:1: ( rule__Atom__LiteralAssignment_0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:650:2: rule__Atom__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Atom__LiteralAssignment_0_in_rule__Atom__Alternatives1313);
                    rule__Atom__LiteralAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getLiteralAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:654:6: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:654:6: ( ( rule__Atom__Group_1__0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:655:1: ( rule__Atom__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:656:1: ( rule__Atom__Group_1__0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:656:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1331);
                    rule__Atom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:665:1: rule__Literal__Alternatives : ( ( ( rule__Literal__StrAssignment_0 ) ) | ( ( rule__Literal__IntAssignment_1 ) ) | ( ( rule__Literal__BoolAssignment_2 ) ) | ( ( rule__Literal__NameAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:669:1: ( ( ( rule__Literal__StrAssignment_0 ) ) | ( ( rule__Literal__IntAssignment_1 ) ) | ( ( rule__Literal__BoolAssignment_2 ) ) | ( ( rule__Literal__NameAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 14:
            case 15:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:670:1: ( ( rule__Literal__StrAssignment_0 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:670:1: ( ( rule__Literal__StrAssignment_0 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:671:1: ( rule__Literal__StrAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStrAssignment_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:672:1: ( rule__Literal__StrAssignment_0 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:672:2: rule__Literal__StrAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__StrAssignment_0_in_rule__Literal__Alternatives1364);
                    rule__Literal__StrAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStrAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:676:6: ( ( rule__Literal__IntAssignment_1 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:676:6: ( ( rule__Literal__IntAssignment_1 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:677:1: ( rule__Literal__IntAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntAssignment_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:678:1: ( rule__Literal__IntAssignment_1 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:678:2: rule__Literal__IntAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__IntAssignment_1_in_rule__Literal__Alternatives1382);
                    rule__Literal__IntAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:682:6: ( ( rule__Literal__BoolAssignment_2 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:682:6: ( ( rule__Literal__BoolAssignment_2 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:683:1: ( rule__Literal__BoolAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBoolAssignment_2()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:684:1: ( rule__Literal__BoolAssignment_2 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:684:2: rule__Literal__BoolAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__BoolAssignment_2_in_rule__Literal__Alternatives1400);
                    rule__Literal__BoolAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBoolAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:688:6: ( ( rule__Literal__NameAssignment_3 ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:688:6: ( ( rule__Literal__NameAssignment_3 ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:689:1: ( rule__Literal__NameAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNameAssignment_3()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:690:1: ( rule__Literal__NameAssignment_3 )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:690:2: rule__Literal__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__NameAssignment_3_in_rule__Literal__Alternatives1418);
                    rule__Literal__NameAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNameAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:699:1: rule__BOOL__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:703:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:704:1: ( 'true' )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:704:1: ( 'true' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:705:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BOOL__Alternatives1452); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:712:6: ( 'false' )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:712:6: ( 'false' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:713:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BOOL__Alternatives1472); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:725:1: rule__AttributeType__Alternatives : ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'bool' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:729:1: ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'bool' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:730:1: ( ( 'int' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:730:1: ( ( 'int' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:731:1: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:732:1: ( 'int' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:732:3: 'int'
                    {
                    match(input,16,FOLLOW_16_in_rule__AttributeType__Alternatives1507); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:737:6: ( ( 'string' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:737:6: ( ( 'string' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:738:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:739:1: ( 'string' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:739:3: 'string'
                    {
                    match(input,17,FOLLOW_17_in_rule__AttributeType__Alternatives1528); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:744:6: ( ( 'bool' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:744:6: ( ( 'bool' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:745:1: ( 'bool' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:746:1: ( 'bool' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:746:3: 'bool'
                    {
                    match(input,18,FOLLOW_18_in_rule__AttributeType__Alternatives1549); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__ComparationOP__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:756:1: rule__ComparationOP__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparationOP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:760:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '<>' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:761:1: ( ( '>' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:761:1: ( ( '>' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:762:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getGTEnumLiteralDeclaration_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:763:1: ( '>' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:763:3: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__ComparationOP__Alternatives1585); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getGTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:768:6: ( ( '>=' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:768:6: ( ( '>=' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:769:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getGEEnumLiteralDeclaration_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:770:1: ( '>=' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:770:3: '>='
                    {
                    match(input,20,FOLLOW_20_in_rule__ComparationOP__Alternatives1606); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getGEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:775:6: ( ( '==' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:775:6: ( ( '==' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:776:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getEQEnumLiteralDeclaration_2()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:777:1: ( '==' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:777:3: '=='
                    {
                    match(input,21,FOLLOW_21_in_rule__ComparationOP__Alternatives1627); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:782:6: ( ( '<' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:782:6: ( ( '<' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:783:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getLTEnumLiteralDeclaration_3()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:784:1: ( '<' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:784:3: '<'
                    {
                    match(input,22,FOLLOW_22_in_rule__ComparationOP__Alternatives1648); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getLTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:789:6: ( ( '<=' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:789:6: ( ( '<=' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:790:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getLEEnumLiteralDeclaration_4()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:791:1: ( '<=' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:791:3: '<='
                    {
                    match(input,23,FOLLOW_23_in_rule__ComparationOP__Alternatives1669); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getLEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:796:6: ( ( '<>' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:796:6: ( ( '<>' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:797:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparationOPAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:798:1: ( '<>' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:798:3: '<>'
                    {
                    match(input,24,FOLLOW_24_in_rule__ComparationOP__Alternatives1690); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparationOPAccess().getNEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparationOP__Alternatives"


    // $ANTLR start "rule__FeatureOP__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:808:1: rule__FeatureOP__Alternatives : ( ( ( 'recommend' ) ) | ( ( 'require' ) ) | ( ( 'exclude' ) ) | ( ( 'harm' ) ) | ( ( '->' ) ) | ( ( '<->' ) ) );
    public final void rule__FeatureOP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:812:1: ( ( ( 'recommend' ) ) | ( ( 'require' ) ) | ( ( 'exclude' ) ) | ( ( 'harm' ) ) | ( ( '->' ) ) | ( ( '<->' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:813:1: ( ( 'recommend' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:813:1: ( ( 'recommend' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:814:1: ( 'recommend' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getRECEnumLiteralDeclaration_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:815:1: ( 'recommend' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:815:3: 'recommend'
                    {
                    match(input,25,FOLLOW_25_in_rule__FeatureOP__Alternatives1726); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getRECEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:820:6: ( ( 'require' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:820:6: ( ( 'require' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:821:1: ( 'require' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:822:1: ( 'require' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:822:3: 'require'
                    {
                    match(input,26,FOLLOW_26_in_rule__FeatureOP__Alternatives1747); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:827:6: ( ( 'exclude' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:827:6: ( ( 'exclude' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:828:1: ( 'exclude' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_2()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:829:1: ( 'exclude' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:829:3: 'exclude'
                    {
                    match(input,27,FOLLOW_27_in_rule__FeatureOP__Alternatives1768); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:834:6: ( ( 'harm' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:834:6: ( ( 'harm' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:835:1: ( 'harm' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getHAREnumLiteralDeclaration_3()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:836:1: ( 'harm' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:836:3: 'harm'
                    {
                    match(input,28,FOLLOW_28_in_rule__FeatureOP__Alternatives1789); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getHAREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:841:6: ( ( '->' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:841:6: ( ( '->' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:842:1: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_4()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:843:1: ( '->' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:843:3: '->'
                    {
                    match(input,29,FOLLOW_29_in_rule__FeatureOP__Alternatives1810); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getREQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:848:6: ( ( '<->' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:848:6: ( ( '<->' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:849:1: ( '<->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_5()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:850:1: ( '<->' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:850:3: '<->'
                    {
                    match(input,30,FOLLOW_30_in_rule__FeatureOP__Alternatives1831); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureOPAccess().getEXCEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureOP__Alternatives"


    // $ANTLR start "rule__LogicOP__Alternatives"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:860:1: rule__LogicOP__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__LogicOP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:864:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:865:1: ( ( 'and' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:865:1: ( ( 'and' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:866:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:867:1: ( 'and' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:867:3: 'and'
                    {
                    match(input,31,FOLLOW_31_in_rule__LogicOP__Alternatives1867); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:872:6: ( ( 'or' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:872:6: ( ( 'or' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:873:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:874:1: ( 'or' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:874:3: 'or'
                    {
                    match(input,32,FOLLOW_32_in_rule__LogicOP__Alternatives1888); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:879:6: ( ( '&&' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:879:6: ( ( '&&' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:880:1: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_2()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:881:1: ( '&&' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:881:3: '&&'
                    {
                    match(input,33,FOLLOW_33_in_rule__LogicOP__Alternatives1909); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOPAccess().getANDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:886:6: ( ( '||' ) )
                    {
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:886:6: ( ( '||' ) )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:887:1: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_3()); 
                    }
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:888:1: ( '||' )
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:888:3: '||'
                    {
                    match(input,34,FOLLOW_34_in_rule__LogicOP__Alternatives1930); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOPAccess().getOREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOP__Alternatives"


    // $ANTLR start "rule__RootDeclaration__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:900:1: rule__RootDeclaration__Group__0 : rule__RootDeclaration__Group__0__Impl rule__RootDeclaration__Group__1 ;
    public final void rule__RootDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:904:1: ( rule__RootDeclaration__Group__0__Impl rule__RootDeclaration__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:905:2: rule__RootDeclaration__Group__0__Impl rule__RootDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__RootDeclaration__Group__0__Impl_in_rule__RootDeclaration__Group__01963);
            rule__RootDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RootDeclaration__Group__1_in_rule__RootDeclaration__Group__01966);
            rule__RootDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__0"


    // $ANTLR start "rule__RootDeclaration__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:912:1: rule__RootDeclaration__Group__0__Impl : ( 'root' ) ;
    public final void rule__RootDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:916:1: ( ( 'root' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:917:1: ( 'root' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:917:1: ( 'root' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:918:1: 'root'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getRootKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__RootDeclaration__Group__0__Impl1994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getRootKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RootDeclaration__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:931:1: rule__RootDeclaration__Group__1 : rule__RootDeclaration__Group__1__Impl rule__RootDeclaration__Group__2 ;
    public final void rule__RootDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:935:1: ( rule__RootDeclaration__Group__1__Impl rule__RootDeclaration__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:936:2: rule__RootDeclaration__Group__1__Impl rule__RootDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__RootDeclaration__Group__1__Impl_in_rule__RootDeclaration__Group__12025);
            rule__RootDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RootDeclaration__Group__2_in_rule__RootDeclaration__Group__12028);
            rule__RootDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__1"


    // $ANTLR start "rule__RootDeclaration__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:943:1: rule__RootDeclaration__Group__1__Impl : ( ( rule__RootDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RootDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:947:1: ( ( ( rule__RootDeclaration__NameAssignment_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:948:1: ( ( rule__RootDeclaration__NameAssignment_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:948:1: ( ( rule__RootDeclaration__NameAssignment_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:949:1: ( rule__RootDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getNameAssignment_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:950:1: ( rule__RootDeclaration__NameAssignment_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:950:2: rule__RootDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RootDeclaration__NameAssignment_1_in_rule__RootDeclaration__Group__1__Impl2055);
            rule__RootDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RootDeclaration__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:960:1: rule__RootDeclaration__Group__2 : rule__RootDeclaration__Group__2__Impl rule__RootDeclaration__Group__3 ;
    public final void rule__RootDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:964:1: ( rule__RootDeclaration__Group__2__Impl rule__RootDeclaration__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:965:2: rule__RootDeclaration__Group__2__Impl rule__RootDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__RootDeclaration__Group__2__Impl_in_rule__RootDeclaration__Group__22085);
            rule__RootDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RootDeclaration__Group__3_in_rule__RootDeclaration__Group__22088);
            rule__RootDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__2"


    // $ANTLR start "rule__RootDeclaration__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:972:1: rule__RootDeclaration__Group__2__Impl : ( ( rule__RootDeclaration__InCardAssignment_2 )? ) ;
    public final void rule__RootDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:976:1: ( ( ( rule__RootDeclaration__InCardAssignment_2 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:977:1: ( ( rule__RootDeclaration__InCardAssignment_2 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:977:1: ( ( rule__RootDeclaration__InCardAssignment_2 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:978:1: ( rule__RootDeclaration__InCardAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getInCardAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:979:1: ( rule__RootDeclaration__InCardAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:979:2: rule__RootDeclaration__InCardAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RootDeclaration__InCardAssignment_2_in_rule__RootDeclaration__Group__2__Impl2115);
                    rule__RootDeclaration__InCardAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getInCardAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RootDeclaration__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:989:1: rule__RootDeclaration__Group__3 : rule__RootDeclaration__Group__3__Impl ;
    public final void rule__RootDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:993:1: ( rule__RootDeclaration__Group__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:994:2: rule__RootDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RootDeclaration__Group__3__Impl_in_rule__RootDeclaration__Group__32146);
            rule__RootDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__3"


    // $ANTLR start "rule__RootDeclaration__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1000:1: rule__RootDeclaration__Group__3__Impl : ( ( rule__RootDeclaration__BodyAssignment_3 )? ) ;
    public final void rule__RootDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1004:1: ( ( ( rule__RootDeclaration__BodyAssignment_3 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1005:1: ( ( rule__RootDeclaration__BodyAssignment_3 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1005:1: ( ( rule__RootDeclaration__BodyAssignment_3 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1006:1: ( rule__RootDeclaration__BodyAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getBodyAssignment_3()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1007:1: ( rule__RootDeclaration__BodyAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1007:2: rule__RootDeclaration__BodyAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RootDeclaration__BodyAssignment_3_in_rule__RootDeclaration__Group__3__Impl2173);
                    rule__RootDeclaration__BodyAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1025:1: rule__FeatureDeclaration__Group__0 : rule__FeatureDeclaration__Group__0__Impl rule__FeatureDeclaration__Group__1 ;
    public final void rule__FeatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1029:1: ( rule__FeatureDeclaration__Group__0__Impl rule__FeatureDeclaration__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1030:2: rule__FeatureDeclaration__Group__0__Impl rule__FeatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__0__Impl_in_rule__FeatureDeclaration__Group__02212);
            rule__FeatureDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__1_in_rule__FeatureDeclaration__Group__02215);
            rule__FeatureDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__0"


    // $ANTLR start "rule__FeatureDeclaration__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1037:1: rule__FeatureDeclaration__Group__0__Impl : ( ( rule__FeatureDeclaration__OutCardAssignment_0 )? ) ;
    public final void rule__FeatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1041:1: ( ( ( rule__FeatureDeclaration__OutCardAssignment_0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1042:1: ( ( rule__FeatureDeclaration__OutCardAssignment_0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1042:1: ( ( rule__FeatureDeclaration__OutCardAssignment_0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1043:1: ( rule__FeatureDeclaration__OutCardAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getOutCardAssignment_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1044:1: ( rule__FeatureDeclaration__OutCardAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11||LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1044:2: rule__FeatureDeclaration__OutCardAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FeatureDeclaration__OutCardAssignment_0_in_rule__FeatureDeclaration__Group__0__Impl2242);
                    rule__FeatureDeclaration__OutCardAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getOutCardAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1054:1: rule__FeatureDeclaration__Group__1 : rule__FeatureDeclaration__Group__1__Impl rule__FeatureDeclaration__Group__2 ;
    public final void rule__FeatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1058:1: ( rule__FeatureDeclaration__Group__1__Impl rule__FeatureDeclaration__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1059:2: rule__FeatureDeclaration__Group__1__Impl rule__FeatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__1__Impl_in_rule__FeatureDeclaration__Group__12273);
            rule__FeatureDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__2_in_rule__FeatureDeclaration__Group__12276);
            rule__FeatureDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__1"


    // $ANTLR start "rule__FeatureDeclaration__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1066:1: rule__FeatureDeclaration__Group__1__Impl : ( ( rule__FeatureDeclaration__Alternatives_1 ) ) ;
    public final void rule__FeatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1070:1: ( ( ( rule__FeatureDeclaration__Alternatives_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1071:1: ( ( rule__FeatureDeclaration__Alternatives_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1071:1: ( ( rule__FeatureDeclaration__Alternatives_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1072:1: ( rule__FeatureDeclaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getAlternatives_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1073:1: ( rule__FeatureDeclaration__Alternatives_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1073:2: rule__FeatureDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Alternatives_1_in_rule__FeatureDeclaration__Group__1__Impl2303);
            rule__FeatureDeclaration__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1083:1: rule__FeatureDeclaration__Group__2 : rule__FeatureDeclaration__Group__2__Impl rule__FeatureDeclaration__Group__3 ;
    public final void rule__FeatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1087:1: ( rule__FeatureDeclaration__Group__2__Impl rule__FeatureDeclaration__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1088:2: rule__FeatureDeclaration__Group__2__Impl rule__FeatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__2__Impl_in_rule__FeatureDeclaration__Group__22333);
            rule__FeatureDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__3_in_rule__FeatureDeclaration__Group__22336);
            rule__FeatureDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__2"


    // $ANTLR start "rule__FeatureDeclaration__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1095:1: rule__FeatureDeclaration__Group__2__Impl : ( ( rule__FeatureDeclaration__InCardAssignment_2 )? ) ;
    public final void rule__FeatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1099:1: ( ( ( rule__FeatureDeclaration__InCardAssignment_2 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1100:1: ( ( rule__FeatureDeclaration__InCardAssignment_2 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1100:1: ( ( rule__FeatureDeclaration__InCardAssignment_2 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1101:1: ( rule__FeatureDeclaration__InCardAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getInCardAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1102:1: ( rule__FeatureDeclaration__InCardAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1102:2: rule__FeatureDeclaration__InCardAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeatureDeclaration__InCardAssignment_2_in_rule__FeatureDeclaration__Group__2__Impl2363);
                    rule__FeatureDeclaration__InCardAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getInCardAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1112:1: rule__FeatureDeclaration__Group__3 : rule__FeatureDeclaration__Group__3__Impl ;
    public final void rule__FeatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1116:1: ( rule__FeatureDeclaration__Group__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1117:2: rule__FeatureDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group__3__Impl_in_rule__FeatureDeclaration__Group__32394);
            rule__FeatureDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__3"


    // $ANTLR start "rule__FeatureDeclaration__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1123:1: rule__FeatureDeclaration__Group__3__Impl : ( ( rule__FeatureDeclaration__BodyAssignment_3 )? ) ;
    public final void rule__FeatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1127:1: ( ( ( rule__FeatureDeclaration__BodyAssignment_3 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1128:1: ( ( rule__FeatureDeclaration__BodyAssignment_3 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1128:1: ( ( rule__FeatureDeclaration__BodyAssignment_3 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1129:1: ( rule__FeatureDeclaration__BodyAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getBodyAssignment_3()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1130:1: ( rule__FeatureDeclaration__BodyAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1130:2: rule__FeatureDeclaration__BodyAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FeatureDeclaration__BodyAssignment_3_in_rule__FeatureDeclaration__Group__3__Impl2421);
                    rule__FeatureDeclaration__BodyAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_0__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1148:1: rule__FeatureDeclaration__Group_1_0__0 : rule__FeatureDeclaration__Group_1_0__0__Impl rule__FeatureDeclaration__Group_1_0__1 ;
    public final void rule__FeatureDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1152:1: ( rule__FeatureDeclaration__Group_1_0__0__Impl rule__FeatureDeclaration__Group_1_0__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1153:2: rule__FeatureDeclaration__Group_1_0__0__Impl rule__FeatureDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_0__0__Impl_in_rule__FeatureDeclaration__Group_1_0__02460);
            rule__FeatureDeclaration__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_0__1_in_rule__FeatureDeclaration__Group_1_0__02463);
            rule__FeatureDeclaration__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_0__0"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_0__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1160:1: rule__FeatureDeclaration__Group_1_0__0__Impl : ( 'feature' ) ;
    public final void rule__FeatureDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1164:1: ( ( 'feature' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1165:1: ( 'feature' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1165:1: ( 'feature' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1166:1: 'feature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getFeatureKeyword_1_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__FeatureDeclaration__Group_1_0__0__Impl2491); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getFeatureKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_0__0__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_0__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1179:1: rule__FeatureDeclaration__Group_1_0__1 : rule__FeatureDeclaration__Group_1_0__1__Impl ;
    public final void rule__FeatureDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1183:1: ( rule__FeatureDeclaration__Group_1_0__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1184:2: rule__FeatureDeclaration__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_0__1__Impl_in_rule__FeatureDeclaration__Group_1_0__12522);
            rule__FeatureDeclaration__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_0__1"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_0__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1190:1: rule__FeatureDeclaration__Group_1_0__1__Impl : ( ( rule__FeatureDeclaration__NameAssignment_1_0_1 ) ) ;
    public final void rule__FeatureDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1194:1: ( ( ( rule__FeatureDeclaration__NameAssignment_1_0_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1195:1: ( ( rule__FeatureDeclaration__NameAssignment_1_0_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1195:1: ( ( rule__FeatureDeclaration__NameAssignment_1_0_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1196:1: ( rule__FeatureDeclaration__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getNameAssignment_1_0_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1197:1: ( rule__FeatureDeclaration__NameAssignment_1_0_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1197:2: rule__FeatureDeclaration__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__NameAssignment_1_0_1_in_rule__FeatureDeclaration__Group_1_0__1__Impl2549);
            rule__FeatureDeclaration__NameAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getNameAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_0__1__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_1__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1211:1: rule__FeatureDeclaration__Group_1_1__0 : rule__FeatureDeclaration__Group_1_1__0__Impl rule__FeatureDeclaration__Group_1_1__1 ;
    public final void rule__FeatureDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1215:1: ( rule__FeatureDeclaration__Group_1_1__0__Impl rule__FeatureDeclaration__Group_1_1__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1216:2: rule__FeatureDeclaration__Group_1_1__0__Impl rule__FeatureDeclaration__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_1__0__Impl_in_rule__FeatureDeclaration__Group_1_1__02583);
            rule__FeatureDeclaration__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_1__1_in_rule__FeatureDeclaration__Group_1_1__02586);
            rule__FeatureDeclaration__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_1__0"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_1__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1223:1: rule__FeatureDeclaration__Group_1_1__0__Impl : ( 'ref' ) ;
    public final void rule__FeatureDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1227:1: ( ( 'ref' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1228:1: ( 'ref' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1228:1: ( 'ref' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1229:1: 'ref'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getRefKeyword_1_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__FeatureDeclaration__Group_1_1__0__Impl2614); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getRefKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_1__0__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_1__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1242:1: rule__FeatureDeclaration__Group_1_1__1 : rule__FeatureDeclaration__Group_1_1__1__Impl ;
    public final void rule__FeatureDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1246:1: ( rule__FeatureDeclaration__Group_1_1__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1247:2: rule__FeatureDeclaration__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__Group_1_1__1__Impl_in_rule__FeatureDeclaration__Group_1_1__12645);
            rule__FeatureDeclaration__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_1__1"


    // $ANTLR start "rule__FeatureDeclaration__Group_1_1__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1253:1: rule__FeatureDeclaration__Group_1_1__1__Impl : ( ( rule__FeatureDeclaration__RefAssignment_1_1_1 ) ) ;
    public final void rule__FeatureDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1257:1: ( ( ( rule__FeatureDeclaration__RefAssignment_1_1_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1258:1: ( ( rule__FeatureDeclaration__RefAssignment_1_1_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1258:1: ( ( rule__FeatureDeclaration__RefAssignment_1_1_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1259:1: ( rule__FeatureDeclaration__RefAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getRefAssignment_1_1_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1260:1: ( rule__FeatureDeclaration__RefAssignment_1_1_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1260:2: rule__FeatureDeclaration__RefAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__FeatureDeclaration__RefAssignment_1_1_1_in_rule__FeatureDeclaration__Group_1_1__1__Impl2672);
            rule__FeatureDeclaration__RefAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getRefAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_1_1__1__Impl"


    // $ANTLR start "rule__FeatureBody__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1274:1: rule__FeatureBody__Group__0 : rule__FeatureBody__Group__0__Impl rule__FeatureBody__Group__1 ;
    public final void rule__FeatureBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1278:1: ( rule__FeatureBody__Group__0__Impl rule__FeatureBody__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1279:2: rule__FeatureBody__Group__0__Impl rule__FeatureBody__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__0__Impl_in_rule__FeatureBody__Group__02706);
            rule__FeatureBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group__1_in_rule__FeatureBody__Group__02709);
            rule__FeatureBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__0"


    // $ANTLR start "rule__FeatureBody__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1286:1: rule__FeatureBody__Group__0__Impl : ( () ) ;
    public final void rule__FeatureBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1290:1: ( ( () ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1291:1: ( () )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1291:1: ( () )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1292:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getFeatureBodyAction_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1293:1: ()
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1295:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getFeatureBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__0__Impl"


    // $ANTLR start "rule__FeatureBody__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1305:1: rule__FeatureBody__Group__1 : rule__FeatureBody__Group__1__Impl rule__FeatureBody__Group__2 ;
    public final void rule__FeatureBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1309:1: ( rule__FeatureBody__Group__1__Impl rule__FeatureBody__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1310:2: rule__FeatureBody__Group__1__Impl rule__FeatureBody__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__1__Impl_in_rule__FeatureBody__Group__12767);
            rule__FeatureBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group__2_in_rule__FeatureBody__Group__12770);
            rule__FeatureBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__1"


    // $ANTLR start "rule__FeatureBody__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1317:1: rule__FeatureBody__Group__1__Impl : ( '{' ) ;
    public final void rule__FeatureBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1321:1: ( ( '{' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1322:1: ( '{' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1322:1: ( '{' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1323:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__FeatureBody__Group__1__Impl2798); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__1__Impl"


    // $ANTLR start "rule__FeatureBody__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1336:1: rule__FeatureBody__Group__2 : rule__FeatureBody__Group__2__Impl rule__FeatureBody__Group__3 ;
    public final void rule__FeatureBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1340:1: ( rule__FeatureBody__Group__2__Impl rule__FeatureBody__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1341:2: rule__FeatureBody__Group__2__Impl rule__FeatureBody__Group__3
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__2__Impl_in_rule__FeatureBody__Group__22829);
            rule__FeatureBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group__3_in_rule__FeatureBody__Group__22832);
            rule__FeatureBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__2"


    // $ANTLR start "rule__FeatureBody__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1348:1: rule__FeatureBody__Group__2__Impl : ( ( rule__FeatureBody__AttrsAssignment_2 )? ) ;
    public final void rule__FeatureBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1352:1: ( ( ( rule__FeatureBody__AttrsAssignment_2 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1353:1: ( ( rule__FeatureBody__AttrsAssignment_2 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1353:1: ( ( rule__FeatureBody__AttrsAssignment_2 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1354:1: ( rule__FeatureBody__AttrsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getAttrsAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1355:1: ( rule__FeatureBody__AttrsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1355:2: rule__FeatureBody__AttrsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeatureBody__AttrsAssignment_2_in_rule__FeatureBody__Group__2__Impl2859);
                    rule__FeatureBody__AttrsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getAttrsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__2__Impl"


    // $ANTLR start "rule__FeatureBody__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1365:1: rule__FeatureBody__Group__3 : rule__FeatureBody__Group__3__Impl rule__FeatureBody__Group__4 ;
    public final void rule__FeatureBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1369:1: ( rule__FeatureBody__Group__3__Impl rule__FeatureBody__Group__4 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1370:2: rule__FeatureBody__Group__3__Impl rule__FeatureBody__Group__4
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__3__Impl_in_rule__FeatureBody__Group__32890);
            rule__FeatureBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group__4_in_rule__FeatureBody__Group__32893);
            rule__FeatureBody__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__3"


    // $ANTLR start "rule__FeatureBody__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1377:1: rule__FeatureBody__Group__3__Impl : ( ( rule__FeatureBody__FeaturesAssignment_3 )* ) ;
    public final void rule__FeatureBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1381:1: ( ( ( rule__FeatureBody__FeaturesAssignment_3 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1382:1: ( ( rule__FeatureBody__FeaturesAssignment_3 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1382:1: ( ( rule__FeatureBody__FeaturesAssignment_3 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1383:1: ( rule__FeatureBody__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getFeaturesAssignment_3()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1384:1: ( rule__FeatureBody__FeaturesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==11||(LA19_0>=36 && LA19_0<=37)||LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1384:2: rule__FeatureBody__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FeatureBody__FeaturesAssignment_3_in_rule__FeatureBody__Group__3__Impl2920);
            	    rule__FeatureBody__FeaturesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getFeaturesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__3__Impl"


    // $ANTLR start "rule__FeatureBody__Group__4"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1394:1: rule__FeatureBody__Group__4 : rule__FeatureBody__Group__4__Impl rule__FeatureBody__Group__5 ;
    public final void rule__FeatureBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1398:1: ( rule__FeatureBody__Group__4__Impl rule__FeatureBody__Group__5 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1399:2: rule__FeatureBody__Group__4__Impl rule__FeatureBody__Group__5
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__4__Impl_in_rule__FeatureBody__Group__42951);
            rule__FeatureBody__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group__5_in_rule__FeatureBody__Group__42954);
            rule__FeatureBody__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__4"


    // $ANTLR start "rule__FeatureBody__Group__4__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1406:1: rule__FeatureBody__Group__4__Impl : ( ( rule__FeatureBody__Group_4__0 )? ) ;
    public final void rule__FeatureBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1410:1: ( ( ( rule__FeatureBody__Group_4__0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1411:1: ( ( rule__FeatureBody__Group_4__0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1411:1: ( ( rule__FeatureBody__Group_4__0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1412:1: ( rule__FeatureBody__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getGroup_4()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1413:1: ( rule__FeatureBody__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1413:2: rule__FeatureBody__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FeatureBody__Group_4__0_in_rule__FeatureBody__Group__4__Impl2981);
                    rule__FeatureBody__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__4__Impl"


    // $ANTLR start "rule__FeatureBody__Group__5"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1423:1: rule__FeatureBody__Group__5 : rule__FeatureBody__Group__5__Impl ;
    public final void rule__FeatureBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1427:1: ( rule__FeatureBody__Group__5__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1428:2: rule__FeatureBody__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group__5__Impl_in_rule__FeatureBody__Group__53012);
            rule__FeatureBody__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__5"


    // $ANTLR start "rule__FeatureBody__Group__5__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1434:1: rule__FeatureBody__Group__5__Impl : ( '}' ) ;
    public final void rule__FeatureBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1438:1: ( ( '}' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1439:1: ( '}' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1439:1: ( '}' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1440:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,39,FOLLOW_39_in_rule__FeatureBody__Group__5__Impl3040); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group__5__Impl"


    // $ANTLR start "rule__FeatureBody__Group_4__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1465:1: rule__FeatureBody__Group_4__0 : rule__FeatureBody__Group_4__0__Impl rule__FeatureBody__Group_4__1 ;
    public final void rule__FeatureBody__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1469:1: ( rule__FeatureBody__Group_4__0__Impl rule__FeatureBody__Group_4__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1470:2: rule__FeatureBody__Group_4__0__Impl rule__FeatureBody__Group_4__1
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group_4__0__Impl_in_rule__FeatureBody__Group_4__03083);
            rule__FeatureBody__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureBody__Group_4__1_in_rule__FeatureBody__Group_4__03086);
            rule__FeatureBody__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group_4__0"


    // $ANTLR start "rule__FeatureBody__Group_4__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1477:1: rule__FeatureBody__Group_4__0__Impl : ( ( 'rules' ) ) ;
    public final void rule__FeatureBody__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1481:1: ( ( ( 'rules' ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1482:1: ( ( 'rules' ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1482:1: ( ( 'rules' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1483:1: ( 'rules' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getRulesKeyword_4_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1484:1: ( 'rules' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1485:2: 'rules'
            {
            match(input,40,FOLLOW_40_in_rule__FeatureBody__Group_4__0__Impl3115); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getRulesKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group_4__0__Impl"


    // $ANTLR start "rule__FeatureBody__Group_4__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1496:1: rule__FeatureBody__Group_4__1 : rule__FeatureBody__Group_4__1__Impl ;
    public final void rule__FeatureBody__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1500:1: ( rule__FeatureBody__Group_4__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1501:2: rule__FeatureBody__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureBody__Group_4__1__Impl_in_rule__FeatureBody__Group_4__13147);
            rule__FeatureBody__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group_4__1"


    // $ANTLR start "rule__FeatureBody__Group_4__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1507:1: rule__FeatureBody__Group_4__1__Impl : ( ( rule__FeatureBody__RuleBodyAssignment_4_1 ) ) ;
    public final void rule__FeatureBody__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1511:1: ( ( ( rule__FeatureBody__RuleBodyAssignment_4_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1512:1: ( ( rule__FeatureBody__RuleBodyAssignment_4_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1512:1: ( ( rule__FeatureBody__RuleBodyAssignment_4_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1513:1: ( rule__FeatureBody__RuleBodyAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getRuleBodyAssignment_4_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1514:1: ( rule__FeatureBody__RuleBodyAssignment_4_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1514:2: rule__FeatureBody__RuleBodyAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FeatureBody__RuleBodyAssignment_4_1_in_rule__FeatureBody__Group_4__1__Impl3174);
            rule__FeatureBody__RuleBodyAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getRuleBodyAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__Group_4__1__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1528:1: rule__StandaloneCardinality__Group_0__0 : rule__StandaloneCardinality__Group_0__0__Impl rule__StandaloneCardinality__Group_0__1 ;
    public final void rule__StandaloneCardinality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1532:1: ( rule__StandaloneCardinality__Group_0__0__Impl rule__StandaloneCardinality__Group_0__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1533:2: rule__StandaloneCardinality__Group_0__0__Impl rule__StandaloneCardinality__Group_0__1
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__0__Impl_in_rule__StandaloneCardinality__Group_0__03208);
            rule__StandaloneCardinality__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__1_in_rule__StandaloneCardinality__Group_0__03211);
            rule__StandaloneCardinality__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__0"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1540:1: rule__StandaloneCardinality__Group_0__0__Impl : ( '[' ) ;
    public final void rule__StandaloneCardinality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1544:1: ( ( '[' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1545:1: ( '[' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1545:1: ( '[' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1546:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__StandaloneCardinality__Group_0__0__Impl3239); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getLeftSquareBracketKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__0__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1559:1: rule__StandaloneCardinality__Group_0__1 : rule__StandaloneCardinality__Group_0__1__Impl rule__StandaloneCardinality__Group_0__2 ;
    public final void rule__StandaloneCardinality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1563:1: ( rule__StandaloneCardinality__Group_0__1__Impl rule__StandaloneCardinality__Group_0__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1564:2: rule__StandaloneCardinality__Group_0__1__Impl rule__StandaloneCardinality__Group_0__2
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__1__Impl_in_rule__StandaloneCardinality__Group_0__13270);
            rule__StandaloneCardinality__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__2_in_rule__StandaloneCardinality__Group_0__13273);
            rule__StandaloneCardinality__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__1"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1571:1: rule__StandaloneCardinality__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__StandaloneCardinality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1575:1: ( ( RULE_INT ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1576:1: ( RULE_INT )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1576:1: ( RULE_INT )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1577:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StandaloneCardinality__Group_0__1__Impl3300); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__1__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1588:1: rule__StandaloneCardinality__Group_0__2 : rule__StandaloneCardinality__Group_0__2__Impl rule__StandaloneCardinality__Group_0__3 ;
    public final void rule__StandaloneCardinality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1592:1: ( rule__StandaloneCardinality__Group_0__2__Impl rule__StandaloneCardinality__Group_0__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1593:2: rule__StandaloneCardinality__Group_0__2__Impl rule__StandaloneCardinality__Group_0__3
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__2__Impl_in_rule__StandaloneCardinality__Group_0__23329);
            rule__StandaloneCardinality__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__3_in_rule__StandaloneCardinality__Group_0__23332);
            rule__StandaloneCardinality__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__2"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1600:1: rule__StandaloneCardinality__Group_0__2__Impl : ( ( rule__StandaloneCardinality__Group_0_2__0 )? ) ;
    public final void rule__StandaloneCardinality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1604:1: ( ( ( rule__StandaloneCardinality__Group_0_2__0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1605:1: ( ( rule__StandaloneCardinality__Group_0_2__0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1605:1: ( ( rule__StandaloneCardinality__Group_0_2__0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1606:1: ( rule__StandaloneCardinality__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getGroup_0_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1607:1: ( rule__StandaloneCardinality__Group_0_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1607:2: rule__StandaloneCardinality__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0_2__0_in_rule__StandaloneCardinality__Group_0__2__Impl3359);
                    rule__StandaloneCardinality__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__2__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1617:1: rule__StandaloneCardinality__Group_0__3 : rule__StandaloneCardinality__Group_0__3__Impl ;
    public final void rule__StandaloneCardinality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1621:1: ( rule__StandaloneCardinality__Group_0__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1622:2: rule__StandaloneCardinality__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0__3__Impl_in_rule__StandaloneCardinality__Group_0__33390);
            rule__StandaloneCardinality__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__3"


    // $ANTLR start "rule__StandaloneCardinality__Group_0__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1628:1: rule__StandaloneCardinality__Group_0__3__Impl : ( ']' ) ;
    public final void rule__StandaloneCardinality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1632:1: ( ( ']' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1633:1: ( ']' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1633:1: ( ']' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1634:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getRightSquareBracketKeyword_0_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__StandaloneCardinality__Group_0__3__Impl3418); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getRightSquareBracketKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0__3__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0_2__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1655:1: rule__StandaloneCardinality__Group_0_2__0 : rule__StandaloneCardinality__Group_0_2__0__Impl rule__StandaloneCardinality__Group_0_2__1 ;
    public final void rule__StandaloneCardinality__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1659:1: ( rule__StandaloneCardinality__Group_0_2__0__Impl rule__StandaloneCardinality__Group_0_2__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1660:2: rule__StandaloneCardinality__Group_0_2__0__Impl rule__StandaloneCardinality__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0_2__0__Impl_in_rule__StandaloneCardinality__Group_0_2__03457);
            rule__StandaloneCardinality__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0_2__1_in_rule__StandaloneCardinality__Group_0_2__03460);
            rule__StandaloneCardinality__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0_2__0"


    // $ANTLR start "rule__StandaloneCardinality__Group_0_2__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1667:1: rule__StandaloneCardinality__Group_0_2__0__Impl : ( '..' ) ;
    public final void rule__StandaloneCardinality__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1671:1: ( ( '..' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1672:1: ( '..' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1672:1: ( '..' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1673:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getFullStopFullStopKeyword_0_2_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__StandaloneCardinality__Group_0_2__0__Impl3488); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getFullStopFullStopKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0_2__0__Impl"


    // $ANTLR start "rule__StandaloneCardinality__Group_0_2__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1686:1: rule__StandaloneCardinality__Group_0_2__1 : rule__StandaloneCardinality__Group_0_2__1__Impl ;
    public final void rule__StandaloneCardinality__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1690:1: ( rule__StandaloneCardinality__Group_0_2__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1691:2: rule__StandaloneCardinality__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StandaloneCardinality__Group_0_2__1__Impl_in_rule__StandaloneCardinality__Group_0_2__13519);
            rule__StandaloneCardinality__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0_2__1"


    // $ANTLR start "rule__StandaloneCardinality__Group_0_2__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1697:1: rule__StandaloneCardinality__Group_0_2__1__Impl : ( RULE_INT ) ;
    public final void rule__StandaloneCardinality__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1701:1: ( ( RULE_INT ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1702:1: ( RULE_INT )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1702:1: ( RULE_INT )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1703:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_2_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StandaloneCardinality__Group_0_2__1__Impl3546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandaloneCardinalityAccess().getINTTerminalRuleCall_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandaloneCardinality__Group_0_2__1__Impl"


    // $ANTLR start "rule__GroupCardinality__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1718:1: rule__GroupCardinality__Group__0 : rule__GroupCardinality__Group__0__Impl rule__GroupCardinality__Group__1 ;
    public final void rule__GroupCardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1722:1: ( rule__GroupCardinality__Group__0__Impl rule__GroupCardinality__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1723:2: rule__GroupCardinality__Group__0__Impl rule__GroupCardinality__Group__1
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group__0__Impl_in_rule__GroupCardinality__Group__03579);
            rule__GroupCardinality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GroupCardinality__Group__1_in_rule__GroupCardinality__Group__03582);
            rule__GroupCardinality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__0"


    // $ANTLR start "rule__GroupCardinality__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1730:1: rule__GroupCardinality__Group__0__Impl : ( '<' ) ;
    public final void rule__GroupCardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1734:1: ( ( '<' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1735:1: ( '<' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1735:1: ( '<' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1736:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getLessThanSignKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__GroupCardinality__Group__0__Impl3610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getLessThanSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__0__Impl"


    // $ANTLR start "rule__GroupCardinality__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1749:1: rule__GroupCardinality__Group__1 : rule__GroupCardinality__Group__1__Impl rule__GroupCardinality__Group__2 ;
    public final void rule__GroupCardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1753:1: ( rule__GroupCardinality__Group__1__Impl rule__GroupCardinality__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1754:2: rule__GroupCardinality__Group__1__Impl rule__GroupCardinality__Group__2
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group__1__Impl_in_rule__GroupCardinality__Group__13641);
            rule__GroupCardinality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GroupCardinality__Group__2_in_rule__GroupCardinality__Group__13644);
            rule__GroupCardinality__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__1"


    // $ANTLR start "rule__GroupCardinality__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1761:1: rule__GroupCardinality__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__GroupCardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1765:1: ( ( RULE_INT ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1766:1: ( RULE_INT )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1766:1: ( RULE_INT )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1767:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GroupCardinality__Group__1__Impl3671); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__1__Impl"


    // $ANTLR start "rule__GroupCardinality__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1778:1: rule__GroupCardinality__Group__2 : rule__GroupCardinality__Group__2__Impl rule__GroupCardinality__Group__3 ;
    public final void rule__GroupCardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1782:1: ( rule__GroupCardinality__Group__2__Impl rule__GroupCardinality__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1783:2: rule__GroupCardinality__Group__2__Impl rule__GroupCardinality__Group__3
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group__2__Impl_in_rule__GroupCardinality__Group__23700);
            rule__GroupCardinality__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GroupCardinality__Group__3_in_rule__GroupCardinality__Group__23703);
            rule__GroupCardinality__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__2"


    // $ANTLR start "rule__GroupCardinality__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1790:1: rule__GroupCardinality__Group__2__Impl : ( ( rule__GroupCardinality__Group_2__0 )? ) ;
    public final void rule__GroupCardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1794:1: ( ( ( rule__GroupCardinality__Group_2__0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1795:1: ( ( rule__GroupCardinality__Group_2__0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1795:1: ( ( rule__GroupCardinality__Group_2__0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1796:1: ( rule__GroupCardinality__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getGroup_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1797:1: ( rule__GroupCardinality__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1797:2: rule__GroupCardinality__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GroupCardinality__Group_2__0_in_rule__GroupCardinality__Group__2__Impl3730);
                    rule__GroupCardinality__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__2__Impl"


    // $ANTLR start "rule__GroupCardinality__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1807:1: rule__GroupCardinality__Group__3 : rule__GroupCardinality__Group__3__Impl ;
    public final void rule__GroupCardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1811:1: ( rule__GroupCardinality__Group__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1812:2: rule__GroupCardinality__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group__3__Impl_in_rule__GroupCardinality__Group__33761);
            rule__GroupCardinality__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__3"


    // $ANTLR start "rule__GroupCardinality__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1818:1: rule__GroupCardinality__Group__3__Impl : ( '>' ) ;
    public final void rule__GroupCardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1822:1: ( ( '>' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1823:1: ( '>' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1823:1: ( '>' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1824:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__GroupCardinality__Group__3__Impl3789); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group__3__Impl"


    // $ANTLR start "rule__GroupCardinality__Group_2__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1845:1: rule__GroupCardinality__Group_2__0 : rule__GroupCardinality__Group_2__0__Impl rule__GroupCardinality__Group_2__1 ;
    public final void rule__GroupCardinality__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1849:1: ( rule__GroupCardinality__Group_2__0__Impl rule__GroupCardinality__Group_2__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1850:2: rule__GroupCardinality__Group_2__0__Impl rule__GroupCardinality__Group_2__1
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group_2__0__Impl_in_rule__GroupCardinality__Group_2__03828);
            rule__GroupCardinality__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GroupCardinality__Group_2__1_in_rule__GroupCardinality__Group_2__03831);
            rule__GroupCardinality__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group_2__0"


    // $ANTLR start "rule__GroupCardinality__Group_2__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1857:1: rule__GroupCardinality__Group_2__0__Impl : ( '..' ) ;
    public final void rule__GroupCardinality__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1861:1: ( ( '..' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1862:1: ( '..' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1862:1: ( '..' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1863:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getFullStopFullStopKeyword_2_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__GroupCardinality__Group_2__0__Impl3859); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getFullStopFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group_2__0__Impl"


    // $ANTLR start "rule__GroupCardinality__Group_2__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1876:1: rule__GroupCardinality__Group_2__1 : rule__GroupCardinality__Group_2__1__Impl ;
    public final void rule__GroupCardinality__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1880:1: ( rule__GroupCardinality__Group_2__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1881:2: rule__GroupCardinality__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupCardinality__Group_2__1__Impl_in_rule__GroupCardinality__Group_2__13890);
            rule__GroupCardinality__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group_2__1"


    // $ANTLR start "rule__GroupCardinality__Group_2__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1887:1: rule__GroupCardinality__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__GroupCardinality__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1891:1: ( ( RULE_INT ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1892:1: ( RULE_INT )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1892:1: ( RULE_INT )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1893:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_2_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GroupCardinality__Group_2__1__Impl3917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupCardinalityAccess().getINTTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupCardinality__Group_2__1__Impl"


    // $ANTLR start "rule__AttributePart__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1908:1: rule__AttributePart__Group__0 : rule__AttributePart__Group__0__Impl rule__AttributePart__Group__1 ;
    public final void rule__AttributePart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1912:1: ( rule__AttributePart__Group__0__Impl rule__AttributePart__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1913:2: rule__AttributePart__Group__0__Impl rule__AttributePart__Group__1
            {
            pushFollow(FOLLOW_rule__AttributePart__Group__0__Impl_in_rule__AttributePart__Group__03950);
            rule__AttributePart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePart__Group__1_in_rule__AttributePart__Group__03953);
            rule__AttributePart__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__0"


    // $ANTLR start "rule__AttributePart__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1920:1: rule__AttributePart__Group__0__Impl : ( () ) ;
    public final void rule__AttributePart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1924:1: ( ( () ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1925:1: ( () )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1925:1: ( () )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1926:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getAttributePartAction_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1927:1: ()
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1929:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getAttributePartAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__0__Impl"


    // $ANTLR start "rule__AttributePart__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1939:1: rule__AttributePart__Group__1 : rule__AttributePart__Group__1__Impl rule__AttributePart__Group__2 ;
    public final void rule__AttributePart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1943:1: ( rule__AttributePart__Group__1__Impl rule__AttributePart__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1944:2: rule__AttributePart__Group__1__Impl rule__AttributePart__Group__2
            {
            pushFollow(FOLLOW_rule__AttributePart__Group__1__Impl_in_rule__AttributePart__Group__14011);
            rule__AttributePart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePart__Group__2_in_rule__AttributePart__Group__14014);
            rule__AttributePart__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__1"


    // $ANTLR start "rule__AttributePart__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1951:1: rule__AttributePart__Group__1__Impl : ( 'attrs {' ) ;
    public final void rule__AttributePart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1955:1: ( ( 'attrs {' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1956:1: ( 'attrs {' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1956:1: ( 'attrs {' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1957:1: 'attrs {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getAttrsKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__AttributePart__Group__1__Impl4042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getAttrsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__1__Impl"


    // $ANTLR start "rule__AttributePart__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1970:1: rule__AttributePart__Group__2 : rule__AttributePart__Group__2__Impl rule__AttributePart__Group__3 ;
    public final void rule__AttributePart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1974:1: ( rule__AttributePart__Group__2__Impl rule__AttributePart__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1975:2: rule__AttributePart__Group__2__Impl rule__AttributePart__Group__3
            {
            pushFollow(FOLLOW_rule__AttributePart__Group__2__Impl_in_rule__AttributePart__Group__24073);
            rule__AttributePart__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePart__Group__3_in_rule__AttributePart__Group__24076);
            rule__AttributePart__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__2"


    // $ANTLR start "rule__AttributePart__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1982:1: rule__AttributePart__Group__2__Impl : ( ( rule__AttributePart__AttrAssignment_2 )* ) ;
    public final void rule__AttributePart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1986:1: ( ( ( rule__AttributePart__AttrAssignment_2 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1987:1: ( ( rule__AttributePart__AttrAssignment_2 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1987:1: ( ( rule__AttributePart__AttrAssignment_2 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1988:1: ( rule__AttributePart__AttrAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getAttrAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1989:1: ( rule__AttributePart__AttrAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=16 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1989:2: rule__AttributePart__AttrAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AttributePart__AttrAssignment_2_in_rule__AttributePart__Group__2__Impl4103);
            	    rule__AttributePart__AttrAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getAttrAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__2__Impl"


    // $ANTLR start "rule__AttributePart__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:1999:1: rule__AttributePart__Group__3 : rule__AttributePart__Group__3__Impl ;
    public final void rule__AttributePart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2003:1: ( rule__AttributePart__Group__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2004:2: rule__AttributePart__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributePart__Group__3__Impl_in_rule__AttributePart__Group__34134);
            rule__AttributePart__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__3"


    // $ANTLR start "rule__AttributePart__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2010:1: rule__AttributePart__Group__3__Impl : ( '}' ) ;
    public final void rule__AttributePart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2014:1: ( ( '}' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2015:1: ( '}' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2015:1: ( '}' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2016:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__AttributePart__Group__3__Impl4162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__Group__3__Impl"


    // $ANTLR start "rule__RuleBody__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2037:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2041:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2042:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
            {
            pushFollow(FOLLOW_rule__RuleBody__Group__0__Impl_in_rule__RuleBody__Group__04201);
            rule__RuleBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleBody__Group__1_in_rule__RuleBody__Group__04204);
            rule__RuleBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0"


    // $ANTLR start "rule__RuleBody__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2049:1: rule__RuleBody__Group__0__Impl : ( () ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2053:1: ( ( () ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2054:1: ( () )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2054:1: ( () )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2055:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getRuleBodyAction_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2056:1: ()
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2058:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getRuleBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0__Impl"


    // $ANTLR start "rule__RuleBody__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2068:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2072:1: ( rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2073:2: rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2
            {
            pushFollow(FOLLOW_rule__RuleBody__Group__1__Impl_in_rule__RuleBody__Group__14262);
            rule__RuleBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleBody__Group__2_in_rule__RuleBody__Group__14265);
            rule__RuleBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1"


    // $ANTLR start "rule__RuleBody__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2080:1: rule__RuleBody__Group__1__Impl : ( '{' ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2084:1: ( ( '{' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2085:1: ( '{' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2085:1: ( '{' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2086:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__RuleBody__Group__1__Impl4293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1__Impl"


    // $ANTLR start "rule__RuleBody__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2099:1: rule__RuleBody__Group__2 : rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3 ;
    public final void rule__RuleBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2103:1: ( rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2104:2: rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3
            {
            pushFollow(FOLLOW_rule__RuleBody__Group__2__Impl_in_rule__RuleBody__Group__24324);
            rule__RuleBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleBody__Group__3_in_rule__RuleBody__Group__24327);
            rule__RuleBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2"


    // $ANTLR start "rule__RuleBody__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2111:1: rule__RuleBody__Group__2__Impl : ( ( rule__RuleBody__RulesAssignment_2 )* ) ;
    public final void rule__RuleBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2115:1: ( ( ( rule__RuleBody__RulesAssignment_2 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2116:1: ( ( rule__RuleBody__RulesAssignment_2 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2116:1: ( ( rule__RuleBody__RulesAssignment_2 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2117:1: ( rule__RuleBody__RulesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getRulesAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2118:1: ( rule__RuleBody__RulesAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)||(LA24_0>=12 && LA24_0<=15)||LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2118:2: rule__RuleBody__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RuleBody__RulesAssignment_2_in_rule__RuleBody__Group__2__Impl4354);
            	    rule__RuleBody__RulesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getRulesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2__Impl"


    // $ANTLR start "rule__RuleBody__Group__3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2128:1: rule__RuleBody__Group__3 : rule__RuleBody__Group__3__Impl ;
    public final void rule__RuleBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2132:1: ( rule__RuleBody__Group__3__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2133:2: rule__RuleBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleBody__Group__3__Impl_in_rule__RuleBody__Group__34385);
            rule__RuleBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__3"


    // $ANTLR start "rule__RuleBody__Group__3__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2139:1: rule__RuleBody__Group__3__Impl : ( '}' ) ;
    public final void rule__RuleBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2143:1: ( ( '}' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2144:1: ( '}' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2144:1: ( '}' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2145:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__RuleBody__Group__3__Impl4413); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2166:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2170:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2171:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04452);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04455);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2178:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2182:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2183:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2183:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2184:1: ( rule__Attribute__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2185:1: ( rule__Attribute__TypeAssignment_0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2185:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl4482);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2195:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2199:1: ( rule__Attribute__Group__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2200:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14512);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2206:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2210:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2211:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2211:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2212:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2213:1: ( rule__Attribute__NameAssignment_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2213:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4539);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__FeatureExpr__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2227:1: rule__FeatureExpr__Group__0 : rule__FeatureExpr__Group__0__Impl rule__FeatureExpr__Group__1 ;
    public final void rule__FeatureExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2231:1: ( rule__FeatureExpr__Group__0__Impl rule__FeatureExpr__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2232:2: rule__FeatureExpr__Group__0__Impl rule__FeatureExpr__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureExpr__Group__0__Impl_in_rule__FeatureExpr__Group__04573);
            rule__FeatureExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureExpr__Group__1_in_rule__FeatureExpr__Group__04576);
            rule__FeatureExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__0"


    // $ANTLR start "rule__FeatureExpr__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2239:1: rule__FeatureExpr__Group__0__Impl : ( ( rule__FeatureExpr__LeftAssignment_0 ) ) ;
    public final void rule__FeatureExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2243:1: ( ( ( rule__FeatureExpr__LeftAssignment_0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2244:1: ( ( rule__FeatureExpr__LeftAssignment_0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2244:1: ( ( rule__FeatureExpr__LeftAssignment_0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2245:1: ( rule__FeatureExpr__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getLeftAssignment_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2246:1: ( rule__FeatureExpr__LeftAssignment_0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2246:2: rule__FeatureExpr__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__FeatureExpr__LeftAssignment_0_in_rule__FeatureExpr__Group__0__Impl4603);
            rule__FeatureExpr__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getLeftAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__0__Impl"


    // $ANTLR start "rule__FeatureExpr__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2256:1: rule__FeatureExpr__Group__1 : rule__FeatureExpr__Group__1__Impl rule__FeatureExpr__Group__2 ;
    public final void rule__FeatureExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2260:1: ( rule__FeatureExpr__Group__1__Impl rule__FeatureExpr__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2261:2: rule__FeatureExpr__Group__1__Impl rule__FeatureExpr__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureExpr__Group__1__Impl_in_rule__FeatureExpr__Group__14633);
            rule__FeatureExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FeatureExpr__Group__2_in_rule__FeatureExpr__Group__14636);
            rule__FeatureExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__1"


    // $ANTLR start "rule__FeatureExpr__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2268:1: rule__FeatureExpr__Group__1__Impl : ( ( rule__FeatureExpr__OpAssignment_1 ) ) ;
    public final void rule__FeatureExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2272:1: ( ( ( rule__FeatureExpr__OpAssignment_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2273:1: ( ( rule__FeatureExpr__OpAssignment_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2273:1: ( ( rule__FeatureExpr__OpAssignment_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2274:1: ( rule__FeatureExpr__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getOpAssignment_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2275:1: ( rule__FeatureExpr__OpAssignment_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2275:2: rule__FeatureExpr__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureExpr__OpAssignment_1_in_rule__FeatureExpr__Group__1__Impl4663);
            rule__FeatureExpr__OpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getOpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__1__Impl"


    // $ANTLR start "rule__FeatureExpr__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2285:1: rule__FeatureExpr__Group__2 : rule__FeatureExpr__Group__2__Impl ;
    public final void rule__FeatureExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2289:1: ( rule__FeatureExpr__Group__2__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2290:2: rule__FeatureExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureExpr__Group__2__Impl_in_rule__FeatureExpr__Group__24693);
            rule__FeatureExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__2"


    // $ANTLR start "rule__FeatureExpr__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2296:1: rule__FeatureExpr__Group__2__Impl : ( ( rule__FeatureExpr__RightAssignment_2 ) ) ;
    public final void rule__FeatureExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2300:1: ( ( ( rule__FeatureExpr__RightAssignment_2 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2301:1: ( ( rule__FeatureExpr__RightAssignment_2 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2301:1: ( ( rule__FeatureExpr__RightAssignment_2 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2302:1: ( rule__FeatureExpr__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getRightAssignment_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2303:1: ( rule__FeatureExpr__RightAssignment_2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2303:2: rule__FeatureExpr__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__FeatureExpr__RightAssignment_2_in_rule__FeatureExpr__Group__2__Impl4720);
            rule__FeatureExpr__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getRightAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__Group__2__Impl"


    // $ANTLR start "rule__LogicExpr__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2319:1: rule__LogicExpr__Group__0 : rule__LogicExpr__Group__0__Impl rule__LogicExpr__Group__1 ;
    public final void rule__LogicExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2323:1: ( rule__LogicExpr__Group__0__Impl rule__LogicExpr__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2324:2: rule__LogicExpr__Group__0__Impl rule__LogicExpr__Group__1
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group__0__Impl_in_rule__LogicExpr__Group__04756);
            rule__LogicExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicExpr__Group__1_in_rule__LogicExpr__Group__04759);
            rule__LogicExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__0"


    // $ANTLR start "rule__LogicExpr__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2331:1: rule__LogicExpr__Group__0__Impl : ( ( rule__LogicExpr__Alternatives_0 )? ) ;
    public final void rule__LogicExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2335:1: ( ( ( rule__LogicExpr__Alternatives_0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2336:1: ( ( rule__LogicExpr__Alternatives_0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2336:1: ( ( rule__LogicExpr__Alternatives_0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2337:1: ( rule__LogicExpr__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getAlternatives_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2338:1: ( rule__LogicExpr__Alternatives_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=12 && LA25_0<=13)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2338:2: rule__LogicExpr__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__LogicExpr__Alternatives_0_in_rule__LogicExpr__Group__0__Impl4786);
                    rule__LogicExpr__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__0__Impl"


    // $ANTLR start "rule__LogicExpr__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2348:1: rule__LogicExpr__Group__1 : rule__LogicExpr__Group__1__Impl rule__LogicExpr__Group__2 ;
    public final void rule__LogicExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2352:1: ( rule__LogicExpr__Group__1__Impl rule__LogicExpr__Group__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2353:2: rule__LogicExpr__Group__1__Impl rule__LogicExpr__Group__2
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group__1__Impl_in_rule__LogicExpr__Group__14817);
            rule__LogicExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicExpr__Group__2_in_rule__LogicExpr__Group__14820);
            rule__LogicExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__1"


    // $ANTLR start "rule__LogicExpr__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2360:1: rule__LogicExpr__Group__1__Impl : ( ( rule__LogicExpr__LeftLogicExprAssignment_1 ) ) ;
    public final void rule__LogicExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2364:1: ( ( ( rule__LogicExpr__LeftLogicExprAssignment_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2365:1: ( ( rule__LogicExpr__LeftLogicExprAssignment_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2365:1: ( ( rule__LogicExpr__LeftLogicExprAssignment_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2366:1: ( rule__LogicExpr__LeftLogicExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getLeftLogicExprAssignment_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2367:1: ( rule__LogicExpr__LeftLogicExprAssignment_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2367:2: rule__LogicExpr__LeftLogicExprAssignment_1
            {
            pushFollow(FOLLOW_rule__LogicExpr__LeftLogicExprAssignment_1_in_rule__LogicExpr__Group__1__Impl4847);
            rule__LogicExpr__LeftLogicExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getLeftLogicExprAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__1__Impl"


    // $ANTLR start "rule__LogicExpr__Group__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2377:1: rule__LogicExpr__Group__2 : rule__LogicExpr__Group__2__Impl ;
    public final void rule__LogicExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2381:1: ( rule__LogicExpr__Group__2__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2382:2: rule__LogicExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group__2__Impl_in_rule__LogicExpr__Group__24877);
            rule__LogicExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__2"


    // $ANTLR start "rule__LogicExpr__Group__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2388:1: rule__LogicExpr__Group__2__Impl : ( ( rule__LogicExpr__Group_2__0 )* ) ;
    public final void rule__LogicExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2392:1: ( ( ( rule__LogicExpr__Group_2__0 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2393:1: ( ( rule__LogicExpr__Group_2__0 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2393:1: ( ( rule__LogicExpr__Group_2__0 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2394:1: ( rule__LogicExpr__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getGroup_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2395:1: ( rule__LogicExpr__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=31 && LA26_0<=34)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2395:2: rule__LogicExpr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LogicExpr__Group_2__0_in_rule__LogicExpr__Group__2__Impl4904);
            	    rule__LogicExpr__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group__2__Impl"


    // $ANTLR start "rule__LogicExpr__Group_2__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2411:1: rule__LogicExpr__Group_2__0 : rule__LogicExpr__Group_2__0__Impl rule__LogicExpr__Group_2__1 ;
    public final void rule__LogicExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2415:1: ( rule__LogicExpr__Group_2__0__Impl rule__LogicExpr__Group_2__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2416:2: rule__LogicExpr__Group_2__0__Impl rule__LogicExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group_2__0__Impl_in_rule__LogicExpr__Group_2__04941);
            rule__LogicExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicExpr__Group_2__1_in_rule__LogicExpr__Group_2__04944);
            rule__LogicExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__0"


    // $ANTLR start "rule__LogicExpr__Group_2__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2423:1: rule__LogicExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__LogicExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2427:1: ( ( () ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2428:1: ( () )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2428:1: ( () )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getLogicExprLeftLogicExprAction_2_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2430:1: ()
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2432:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getLogicExprLeftLogicExprAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__0__Impl"


    // $ANTLR start "rule__LogicExpr__Group_2__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2442:1: rule__LogicExpr__Group_2__1 : rule__LogicExpr__Group_2__1__Impl rule__LogicExpr__Group_2__2 ;
    public final void rule__LogicExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2446:1: ( rule__LogicExpr__Group_2__1__Impl rule__LogicExpr__Group_2__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2447:2: rule__LogicExpr__Group_2__1__Impl rule__LogicExpr__Group_2__2
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group_2__1__Impl_in_rule__LogicExpr__Group_2__15002);
            rule__LogicExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicExpr__Group_2__2_in_rule__LogicExpr__Group_2__15005);
            rule__LogicExpr__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__1"


    // $ANTLR start "rule__LogicExpr__Group_2__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2454:1: rule__LogicExpr__Group_2__1__Impl : ( ( rule__LogicExpr__LogicOPAssignment_2_1 ) ) ;
    public final void rule__LogicExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2458:1: ( ( ( rule__LogicExpr__LogicOPAssignment_2_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2459:1: ( ( rule__LogicExpr__LogicOPAssignment_2_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2459:1: ( ( rule__LogicExpr__LogicOPAssignment_2_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2460:1: ( rule__LogicExpr__LogicOPAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getLogicOPAssignment_2_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2461:1: ( rule__LogicExpr__LogicOPAssignment_2_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2461:2: rule__LogicExpr__LogicOPAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LogicExpr__LogicOPAssignment_2_1_in_rule__LogicExpr__Group_2__1__Impl5032);
            rule__LogicExpr__LogicOPAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getLogicOPAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__1__Impl"


    // $ANTLR start "rule__LogicExpr__Group_2__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2471:1: rule__LogicExpr__Group_2__2 : rule__LogicExpr__Group_2__2__Impl ;
    public final void rule__LogicExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2475:1: ( rule__LogicExpr__Group_2__2__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2476:2: rule__LogicExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicExpr__Group_2__2__Impl_in_rule__LogicExpr__Group_2__25062);
            rule__LogicExpr__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__2"


    // $ANTLR start "rule__LogicExpr__Group_2__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2482:1: rule__LogicExpr__Group_2__2__Impl : ( ( rule__LogicExpr__RightAssignment_2_2 ) ) ;
    public final void rule__LogicExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2486:1: ( ( ( rule__LogicExpr__RightAssignment_2_2 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2487:1: ( ( rule__LogicExpr__RightAssignment_2_2 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2487:1: ( ( rule__LogicExpr__RightAssignment_2_2 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2488:1: ( rule__LogicExpr__RightAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getRightAssignment_2_2()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2489:1: ( rule__LogicExpr__RightAssignment_2_2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2489:2: rule__LogicExpr__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__LogicExpr__RightAssignment_2_2_in_rule__LogicExpr__Group_2__2__Impl5089);
            rule__LogicExpr__RightAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getRightAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__Group_2__2__Impl"


    // $ANTLR start "rule__BasicExpr__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2505:1: rule__BasicExpr__Group__0 : rule__BasicExpr__Group__0__Impl rule__BasicExpr__Group__1 ;
    public final void rule__BasicExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2509:1: ( rule__BasicExpr__Group__0__Impl rule__BasicExpr__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2510:2: rule__BasicExpr__Group__0__Impl rule__BasicExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BasicExpr__Group__0__Impl_in_rule__BasicExpr__Group__05125);
            rule__BasicExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicExpr__Group__1_in_rule__BasicExpr__Group__05128);
            rule__BasicExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group__0"


    // $ANTLR start "rule__BasicExpr__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2517:1: rule__BasicExpr__Group__0__Impl : ( ( rule__BasicExpr__LExprAssignment_0 ) ) ;
    public final void rule__BasicExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2521:1: ( ( ( rule__BasicExpr__LExprAssignment_0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2522:1: ( ( rule__BasicExpr__LExprAssignment_0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2522:1: ( ( rule__BasicExpr__LExprAssignment_0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2523:1: ( rule__BasicExpr__LExprAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getLExprAssignment_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2524:1: ( rule__BasicExpr__LExprAssignment_0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2524:2: rule__BasicExpr__LExprAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicExpr__LExprAssignment_0_in_rule__BasicExpr__Group__0__Impl5155);
            rule__BasicExpr__LExprAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getLExprAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group__0__Impl"


    // $ANTLR start "rule__BasicExpr__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2534:1: rule__BasicExpr__Group__1 : rule__BasicExpr__Group__1__Impl ;
    public final void rule__BasicExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2538:1: ( rule__BasicExpr__Group__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2539:2: rule__BasicExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicExpr__Group__1__Impl_in_rule__BasicExpr__Group__15185);
            rule__BasicExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group__1"


    // $ANTLR start "rule__BasicExpr__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2545:1: rule__BasicExpr__Group__1__Impl : ( ( rule__BasicExpr__Group_1__0 )? ) ;
    public final void rule__BasicExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2549:1: ( ( ( rule__BasicExpr__Group_1__0 )? ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2550:1: ( ( rule__BasicExpr__Group_1__0 )? )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2550:1: ( ( rule__BasicExpr__Group_1__0 )? )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2551:1: ( rule__BasicExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getGroup_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2552:1: ( rule__BasicExpr__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=19 && LA27_0<=24)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2552:2: rule__BasicExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicExpr__Group_1__0_in_rule__BasicExpr__Group__1__Impl5212);
                    rule__BasicExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group__1__Impl"


    // $ANTLR start "rule__BasicExpr__Group_1__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2566:1: rule__BasicExpr__Group_1__0 : rule__BasicExpr__Group_1__0__Impl rule__BasicExpr__Group_1__1 ;
    public final void rule__BasicExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2570:1: ( rule__BasicExpr__Group_1__0__Impl rule__BasicExpr__Group_1__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2571:2: rule__BasicExpr__Group_1__0__Impl rule__BasicExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicExpr__Group_1__0__Impl_in_rule__BasicExpr__Group_1__05247);
            rule__BasicExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicExpr__Group_1__1_in_rule__BasicExpr__Group_1__05250);
            rule__BasicExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group_1__0"


    // $ANTLR start "rule__BasicExpr__Group_1__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2578:1: rule__BasicExpr__Group_1__0__Impl : ( ( rule__BasicExpr__CompOpAssignment_1_0 ) ) ;
    public final void rule__BasicExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2582:1: ( ( ( rule__BasicExpr__CompOpAssignment_1_0 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2583:1: ( ( rule__BasicExpr__CompOpAssignment_1_0 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2583:1: ( ( rule__BasicExpr__CompOpAssignment_1_0 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2584:1: ( rule__BasicExpr__CompOpAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getCompOpAssignment_1_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2585:1: ( rule__BasicExpr__CompOpAssignment_1_0 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2585:2: rule__BasicExpr__CompOpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BasicExpr__CompOpAssignment_1_0_in_rule__BasicExpr__Group_1__0__Impl5277);
            rule__BasicExpr__CompOpAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getCompOpAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BasicExpr__Group_1__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2595:1: rule__BasicExpr__Group_1__1 : rule__BasicExpr__Group_1__1__Impl ;
    public final void rule__BasicExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2599:1: ( rule__BasicExpr__Group_1__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2600:2: rule__BasicExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicExpr__Group_1__1__Impl_in_rule__BasicExpr__Group_1__15307);
            rule__BasicExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group_1__1"


    // $ANTLR start "rule__BasicExpr__Group_1__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2606:1: rule__BasicExpr__Group_1__1__Impl : ( ( rule__BasicExpr__RExprAssignment_1_1 ) ) ;
    public final void rule__BasicExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2610:1: ( ( ( rule__BasicExpr__RExprAssignment_1_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2611:1: ( ( rule__BasicExpr__RExprAssignment_1_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2611:1: ( ( rule__BasicExpr__RExprAssignment_1_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2612:1: ( rule__BasicExpr__RExprAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getRExprAssignment_1_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2613:1: ( rule__BasicExpr__RExprAssignment_1_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2613:2: rule__BasicExpr__RExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicExpr__RExprAssignment_1_1_in_rule__BasicExpr__Group_1__1__Impl5334);
            rule__BasicExpr__RExprAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getRExprAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2627:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2631:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2632:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__05368);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__05371);
            rule__Atom__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2639:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2643:1: ( ( '(' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2644:1: ( '(' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2644:1: ( '(' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2645:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Atom__Group_1__0__Impl5399); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2658:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2662:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2663:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__15430);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__15433);
            rule__Atom__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2670:1: rule__Atom__Group_1__1__Impl : ( ( rule__Atom__SubAssignment_1_1 ) ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2674:1: ( ( ( rule__Atom__SubAssignment_1_1 ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2675:1: ( ( rule__Atom__SubAssignment_1_1 ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2675:1: ( ( rule__Atom__SubAssignment_1_1 ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2676:1: ( rule__Atom__SubAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getSubAssignment_1_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2677:1: ( rule__Atom__SubAssignment_1_1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2677:2: rule__Atom__SubAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atom__SubAssignment_1_1_in_rule__Atom__Group_1__1__Impl5460);
            rule__Atom__SubAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getSubAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2687:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2691:1: ( rule__Atom__Group_1__2__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2692:2: rule__Atom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__25490);
            rule__Atom__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2698:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2702:1: ( ( ')' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2703:1: ( ')' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2703:1: ( ')' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2704:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,46,FOLLOW_46_in_rule__Atom__Group_1__2__Impl5518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2723:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2727:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2728:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05555);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05558);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2735:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2739:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2740:1: ( RULE_ID )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2740:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2741:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2752:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2756:1: ( rule__QualifiedName__Group__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2757:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15614);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2763:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2767:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2768:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2768:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2769:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2770:1: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2770:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5641);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2784:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2788:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2789:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05676);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05679);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2796:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2800:1: ( ( '.' ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2801:1: ( '.' )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2801:1: ( '.' )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2802:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__QualifiedName__Group_1__0__Impl5707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2815:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2819:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2820:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15738);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2826:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2830:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2831:1: ( RULE_ID )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2831:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2832:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__RootDeclaration__NameAssignment_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2848:1: rule__RootDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RootDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2852:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2853:1: ( RULE_ID )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2853:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2854:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootDeclaration__NameAssignment_15803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RootDeclaration__InCardAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2863:1: rule__RootDeclaration__InCardAssignment_2 : ( ruleGroupCardinality ) ;
    public final void rule__RootDeclaration__InCardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2867:1: ( ( ruleGroupCardinality ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2868:1: ( ruleGroupCardinality )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2868:1: ( ruleGroupCardinality )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2869:1: ruleGroupCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGroupCardinality_in_rule__RootDeclaration__InCardAssignment_25834);
            ruleGroupCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__InCardAssignment_2"


    // $ANTLR start "rule__RootDeclaration__BodyAssignment_3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2878:1: rule__RootDeclaration__BodyAssignment_3 : ( ruleFeatureBody ) ;
    public final void rule__RootDeclaration__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2882:1: ( ( ruleFeatureBody ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2883:1: ( ruleFeatureBody )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2883:1: ( ruleFeatureBody )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2884:1: ruleFeatureBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeatureBody_in_rule__RootDeclaration__BodyAssignment_35865);
            ruleFeatureBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootDeclaration__BodyAssignment_3"


    // $ANTLR start "rule__FeatureDeclaration__OutCardAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2893:1: rule__FeatureDeclaration__OutCardAssignment_0 : ( ruleStandaloneCardinality ) ;
    public final void rule__FeatureDeclaration__OutCardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2897:1: ( ( ruleStandaloneCardinality ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2898:1: ( ruleStandaloneCardinality )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2898:1: ( ruleStandaloneCardinality )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2899:1: ruleStandaloneCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getOutCardStandaloneCardinalityParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStandaloneCardinality_in_rule__FeatureDeclaration__OutCardAssignment_05896);
            ruleStandaloneCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getOutCardStandaloneCardinalityParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__OutCardAssignment_0"


    // $ANTLR start "rule__FeatureDeclaration__NameAssignment_1_0_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2908:1: rule__FeatureDeclaration__NameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__FeatureDeclaration__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2912:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2913:1: ( RULE_ID )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2913:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2914:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureDeclaration__NameAssignment_1_0_15927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__NameAssignment_1_0_1"


    // $ANTLR start "rule__FeatureDeclaration__RefAssignment_1_1_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2923:1: rule__FeatureDeclaration__RefAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureDeclaration__RefAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2927:1: ( ( ( RULE_ID ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2928:1: ( ( RULE_ID ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2928:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2929:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getRefFeatureCrossReference_1_1_1_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2930:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2931:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getRefFeatureIDTerminalRuleCall_1_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureDeclaration__RefAssignment_1_1_15962); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getRefFeatureIDTerminalRuleCall_1_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getRefFeatureCrossReference_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__RefAssignment_1_1_1"


    // $ANTLR start "rule__FeatureDeclaration__InCardAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2942:1: rule__FeatureDeclaration__InCardAssignment_2 : ( ruleGroupCardinality ) ;
    public final void rule__FeatureDeclaration__InCardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2946:1: ( ( ruleGroupCardinality ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2947:1: ( ruleGroupCardinality )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2947:1: ( ruleGroupCardinality )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2948:1: ruleGroupCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGroupCardinality_in_rule__FeatureDeclaration__InCardAssignment_25997);
            ruleGroupCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getInCardGroupCardinalityParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__InCardAssignment_2"


    // $ANTLR start "rule__FeatureDeclaration__BodyAssignment_3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2957:1: rule__FeatureDeclaration__BodyAssignment_3 : ( ruleFeatureBody ) ;
    public final void rule__FeatureDeclaration__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2961:1: ( ( ruleFeatureBody ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2962:1: ( ruleFeatureBody )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2962:1: ( ruleFeatureBody )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2963:1: ruleFeatureBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeatureBody_in_rule__FeatureDeclaration__BodyAssignment_36028);
            ruleFeatureBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getBodyFeatureBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__BodyAssignment_3"


    // $ANTLR start "rule__FeatureBody__AttrsAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2972:1: rule__FeatureBody__AttrsAssignment_2 : ( ruleAttributePart ) ;
    public final void rule__FeatureBody__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2976:1: ( ( ruleAttributePart ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2977:1: ( ruleAttributePart )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2977:1: ( ruleAttributePart )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2978:1: ruleAttributePart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getAttrsAttributePartParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePart_in_rule__FeatureBody__AttrsAssignment_26059);
            ruleAttributePart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getAttrsAttributePartParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__AttrsAssignment_2"


    // $ANTLR start "rule__FeatureBody__FeaturesAssignment_3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2987:1: rule__FeatureBody__FeaturesAssignment_3 : ( ruleFeatureDeclaration ) ;
    public final void rule__FeatureBody__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2991:1: ( ( ruleFeatureDeclaration ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2992:1: ( ruleFeatureDeclaration )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2992:1: ( ruleFeatureDeclaration )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:2993:1: ruleFeatureDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getFeaturesFeatureDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeatureDeclaration_in_rule__FeatureBody__FeaturesAssignment_36090);
            ruleFeatureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getFeaturesFeatureDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__FeaturesAssignment_3"


    // $ANTLR start "rule__FeatureBody__RuleBodyAssignment_4_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3002:1: rule__FeatureBody__RuleBodyAssignment_4_1 : ( ruleRuleBody ) ;
    public final void rule__FeatureBody__RuleBodyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3006:1: ( ( ruleRuleBody ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3007:1: ( ruleRuleBody )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3007:1: ( ruleRuleBody )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3008:1: ruleRuleBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureBodyAccess().getRuleBodyRuleBodyParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleRuleBody_in_rule__FeatureBody__RuleBodyAssignment_4_16121);
            ruleRuleBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureBodyAccess().getRuleBodyRuleBodyParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureBody__RuleBodyAssignment_4_1"


    // $ANTLR start "rule__AttributePart__AttrAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3017:1: rule__AttributePart__AttrAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributePart__AttrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3021:1: ( ( ruleAttribute ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3022:1: ( ruleAttribute )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3022:1: ( ruleAttribute )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3023:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePartAccess().getAttrAttributeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributePart__AttrAssignment_26152);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePartAccess().getAttrAttributeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePart__AttrAssignment_2"


    // $ANTLR start "rule__RuleBody__RulesAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3032:1: rule__RuleBody__RulesAssignment_2 : ( ruleFeatureExpr ) ;
    public final void rule__RuleBody__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3036:1: ( ( ruleFeatureExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3037:1: ( ruleFeatureExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3037:1: ( ruleFeatureExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3038:1: ruleFeatureExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleBodyAccess().getRulesFeatureExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFeatureExpr_in_rule__RuleBody__RulesAssignment_26183);
            ruleFeatureExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleBodyAccess().getRulesFeatureExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__RulesAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3047:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3051:1: ( ( ruleAttributeType ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3052:1: ( ruleAttributeType )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3052:1: ( ruleAttributeType )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3053:1: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_06214);
            ruleAttributeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3062:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3066:1: ( ( RULE_ID ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3067:1: ( RULE_ID )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3067:1: ( RULE_ID )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3068:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_16245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__FeatureExpr__LeftAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3077:1: rule__FeatureExpr__LeftAssignment_0 : ( ruleLogicExpr ) ;
    public final void rule__FeatureExpr__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3081:1: ( ( ruleLogicExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3082:1: ( ruleLogicExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3082:1: ( ruleLogicExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3083:1: ruleLogicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getLeftLogicExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_rule__FeatureExpr__LeftAssignment_06276);
            ruleLogicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getLeftLogicExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__LeftAssignment_0"


    // $ANTLR start "rule__FeatureExpr__OpAssignment_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3092:1: rule__FeatureExpr__OpAssignment_1 : ( ruleFeatureOP ) ;
    public final void rule__FeatureExpr__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3096:1: ( ( ruleFeatureOP ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3097:1: ( ruleFeatureOP )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3097:1: ( ruleFeatureOP )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3098:1: ruleFeatureOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getOpFeatureOPEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFeatureOP_in_rule__FeatureExpr__OpAssignment_16307);
            ruleFeatureOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getOpFeatureOPEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__OpAssignment_1"


    // $ANTLR start "rule__FeatureExpr__RightAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3107:1: rule__FeatureExpr__RightAssignment_2 : ( ruleLogicExpr ) ;
    public final void rule__FeatureExpr__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3111:1: ( ( ruleLogicExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3112:1: ( ruleLogicExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3112:1: ( ruleLogicExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3113:1: ruleLogicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureExprAccess().getRightLogicExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_rule__FeatureExpr__RightAssignment_26338);
            ruleLogicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureExprAccess().getRightLogicExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureExpr__RightAssignment_2"


    // $ANTLR start "rule__LogicExpr__LeftLogicExprAssignment_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3122:1: rule__LogicExpr__LeftLogicExprAssignment_1 : ( ruleBasicExpr ) ;
    public final void rule__LogicExpr__LeftLogicExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3126:1: ( ( ruleBasicExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3127:1: ( ruleBasicExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3127:1: ( ruleBasicExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3128:1: ruleBasicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getLeftLogicExprBasicExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicExpr_in_rule__LogicExpr__LeftLogicExprAssignment_16369);
            ruleBasicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getLeftLogicExprBasicExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__LeftLogicExprAssignment_1"


    // $ANTLR start "rule__LogicExpr__LogicOPAssignment_2_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3137:1: rule__LogicExpr__LogicOPAssignment_2_1 : ( ruleLogicOP ) ;
    public final void rule__LogicExpr__LogicOPAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3141:1: ( ( ruleLogicOP ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3142:1: ( ruleLogicOP )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3142:1: ( ruleLogicOP )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3143:1: ruleLogicOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getLogicOPLogicOPEnumRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOP_in_rule__LogicExpr__LogicOPAssignment_2_16400);
            ruleLogicOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getLogicOPLogicOPEnumRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__LogicOPAssignment_2_1"


    // $ANTLR start "rule__LogicExpr__RightAssignment_2_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3152:1: rule__LogicExpr__RightAssignment_2_2 : ( ruleBasicExpr ) ;
    public final void rule__LogicExpr__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3156:1: ( ( ruleBasicExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3157:1: ( ruleBasicExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3157:1: ( ruleBasicExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3158:1: ruleBasicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExprAccess().getRightBasicExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleBasicExpr_in_rule__LogicExpr__RightAssignment_2_26431);
            ruleBasicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExprAccess().getRightBasicExprParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpr__RightAssignment_2_2"


    // $ANTLR start "rule__BasicExpr__LExprAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3167:1: rule__BasicExpr__LExprAssignment_0 : ( ruleAtom ) ;
    public final void rule__BasicExpr__LExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3171:1: ( ( ruleAtom ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3172:1: ( ruleAtom )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3172:1: ( ruleAtom )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3173:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getLExprAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__BasicExpr__LExprAssignment_06462);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getLExprAtomParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__LExprAssignment_0"


    // $ANTLR start "rule__BasicExpr__CompOpAssignment_1_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3182:1: rule__BasicExpr__CompOpAssignment_1_0 : ( ruleComparationOP ) ;
    public final void rule__BasicExpr__CompOpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3186:1: ( ( ruleComparationOP ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3187:1: ( ruleComparationOP )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3187:1: ( ruleComparationOP )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3188:1: ruleComparationOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getCompOpComparationOPEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleComparationOP_in_rule__BasicExpr__CompOpAssignment_1_06493);
            ruleComparationOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getCompOpComparationOPEnumRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__CompOpAssignment_1_0"


    // $ANTLR start "rule__BasicExpr__RExprAssignment_1_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3197:1: rule__BasicExpr__RExprAssignment_1_1 : ( ruleAtom ) ;
    public final void rule__BasicExpr__RExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3201:1: ( ( ruleAtom ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3202:1: ( ruleAtom )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3202:1: ( ruleAtom )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3203:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExprAccess().getRExprAtomParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__BasicExpr__RExprAssignment_1_16524);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExprAccess().getRExprAtomParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExpr__RExprAssignment_1_1"


    // $ANTLR start "rule__Atom__LiteralAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3212:1: rule__Atom__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Atom__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3216:1: ( ( ruleLiteral ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3217:1: ( ruleLiteral )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3217:1: ( ruleLiteral )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3218:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLiteralLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Atom__LiteralAssignment_06555);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLiteralLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__LiteralAssignment_0"


    // $ANTLR start "rule__Atom__SubAssignment_1_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3227:1: rule__Atom__SubAssignment_1_1 : ( ruleLogicExpr ) ;
    public final void rule__Atom__SubAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3231:1: ( ( ruleLogicExpr ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3232:1: ( ruleLogicExpr )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3232:1: ( ruleLogicExpr )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3233:1: ruleLogicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getSubLogicExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpr_in_rule__Atom__SubAssignment_1_16586);
            ruleLogicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getSubLogicExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__SubAssignment_1_1"


    // $ANTLR start "rule__Literal__StrAssignment_0"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3242:1: rule__Literal__StrAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Literal__StrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3246:1: ( ( RULE_STRING ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3247:1: ( RULE_STRING )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3247:1: ( RULE_STRING )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3248:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__StrAssignment_06617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__StrAssignment_0"


    // $ANTLR start "rule__Literal__IntAssignment_1"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3257:1: rule__Literal__IntAssignment_1 : ( RULE_INT ) ;
    public final void rule__Literal__IntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3261:1: ( ( RULE_INT ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3262:1: ( RULE_INT )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3262:1: ( RULE_INT )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3263:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIntINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__IntAssignment_16648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIntINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__IntAssignment_1"


    // $ANTLR start "rule__Literal__BoolAssignment_2"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3272:1: rule__Literal__BoolAssignment_2 : ( ruleBOOL ) ;
    public final void rule__Literal__BoolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3276:1: ( ( ruleBOOL ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3277:1: ( ruleBOOL )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3277:1: ( ruleBOOL )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3278:1: ruleBOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getBoolBOOLParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__Literal__BoolAssignment_26679);
            ruleBOOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getBoolBOOLParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__BoolAssignment_2"


    // $ANTLR start "rule__Literal__NameAssignment_3"
    // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3287:1: rule__Literal__NameAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Literal__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3291:1: ( ( ( ruleQualifiedName ) ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3292:1: ( ( ruleQualifiedName ) )
            {
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3292:1: ( ( ruleQualifiedName ) )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3293:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameFeatureCrossReference_3_0()); 
            }
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3294:1: ( ruleQualifiedName )
            // ../person.zhoujg.feature.ui/src-gen/person/zhoujg/ui/contentassist/antlr/internal/InternalFeature.g:3295:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameFeatureQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Literal__NameAssignment_36714);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameFeatureQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameFeatureCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRootDeclaration_in_entryRuleRootDeclaration67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootDeclaration74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__0_in_ruleRootDeclaration100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDeclaration_in_entryRuleFeatureDeclaration127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureDeclaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__0_in_ruleFeatureDeclaration160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_entryRuleFeatureBody187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureBody194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__0_in_ruleFeatureBody220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandaloneCardinality_in_entryRuleStandaloneCardinality247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandaloneCardinality254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Alternatives_in_ruleStandaloneCardinality280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupCardinality314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__0_in_ruleGroupCardinality342 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__0_in_ruleGroupCardinality354 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttributePart_in_entryRuleAttributePart384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePart391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__0_in_ruleAttributePart417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__0_in_ruleRuleBody477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureExpr_in_entryRuleFeatureExpr564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureExpr571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__0_in_ruleFeatureExpr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_entryRuleLogicExpr624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExpr631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__0_in_ruleLogicExpr657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_entryRuleBasicExpr684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicExpr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group__0_in_ruleBasicExpr717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparationOP__Alternatives_in_ruleComparationOP1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureOP__Alternatives_in_ruleFeatureOP1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOP__Alternatives_in_ruleLogicOP1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_0__0_in_rule__FeatureDeclaration__Alternatives_11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_1__0_in_rule__FeatureDeclaration__Alternatives_11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__0_in_rule__StandaloneCardinality__Alternatives1190 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__0_in_rule__StandaloneCardinality__Alternatives1202 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_11_in_rule__StandaloneCardinality__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__LogicExpr__Alternatives_01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__LogicExpr__Alternatives_01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__LiteralAssignment_0_in_rule__Atom__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__StrAssignment_0_in_rule__Literal__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__IntAssignment_1_in_rule__Literal__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BoolAssignment_2_in_rule__Literal__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_in_rule__Literal__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOL__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOL__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttributeType__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComparationOP__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComparationOP__Alternatives1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComparationOP__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComparationOP__Alternatives1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComparationOP__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComparationOP__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FeatureOP__Alternatives1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FeatureOP__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FeatureOP__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FeatureOP__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FeatureOP__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FeatureOP__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LogicOP__Alternatives1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LogicOP__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LogicOP__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__LogicOP__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__0__Impl_in_rule__RootDeclaration__Group__01963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__1_in_rule__RootDeclaration__Group__01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RootDeclaration__Group__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__1__Impl_in_rule__RootDeclaration__Group__12025 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__2_in_rule__RootDeclaration__Group__12028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__NameAssignment_1_in_rule__RootDeclaration__Group__1__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__2__Impl_in_rule__RootDeclaration__Group__22085 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__3_in_rule__RootDeclaration__Group__22088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__InCardAssignment_2_in_rule__RootDeclaration__Group__2__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__Group__3__Impl_in_rule__RootDeclaration__Group__32146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDeclaration__BodyAssignment_3_in_rule__RootDeclaration__Group__3__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__0__Impl_in_rule__FeatureDeclaration__Group__02212 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__1_in_rule__FeatureDeclaration__Group__02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__OutCardAssignment_0_in_rule__FeatureDeclaration__Group__0__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__1__Impl_in_rule__FeatureDeclaration__Group__12273 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__2_in_rule__FeatureDeclaration__Group__12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Alternatives_1_in_rule__FeatureDeclaration__Group__1__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__2__Impl_in_rule__FeatureDeclaration__Group__22333 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__3_in_rule__FeatureDeclaration__Group__22336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__InCardAssignment_2_in_rule__FeatureDeclaration__Group__2__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group__3__Impl_in_rule__FeatureDeclaration__Group__32394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__BodyAssignment_3_in_rule__FeatureDeclaration__Group__3__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_0__0__Impl_in_rule__FeatureDeclaration__Group_1_0__02460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_0__1_in_rule__FeatureDeclaration__Group_1_0__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FeatureDeclaration__Group_1_0__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_0__1__Impl_in_rule__FeatureDeclaration__Group_1_0__12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__NameAssignment_1_0_1_in_rule__FeatureDeclaration__Group_1_0__1__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_1__0__Impl_in_rule__FeatureDeclaration__Group_1_1__02583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_1__1_in_rule__FeatureDeclaration__Group_1_1__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FeatureDeclaration__Group_1_1__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__Group_1_1__1__Impl_in_rule__FeatureDeclaration__Group_1_1__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDeclaration__RefAssignment_1_1_1_in_rule__FeatureDeclaration__Group_1_1__1__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__0__Impl_in_rule__FeatureBody__Group__02706 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__1_in_rule__FeatureBody__Group__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__1__Impl_in_rule__FeatureBody__Group__12767 = new BitSet(new long[]{0x000013B000000800L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__2_in_rule__FeatureBody__Group__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FeatureBody__Group__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__2__Impl_in_rule__FeatureBody__Group__22829 = new BitSet(new long[]{0x000013B000000800L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__3_in_rule__FeatureBody__Group__22832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__AttrsAssignment_2_in_rule__FeatureBody__Group__2__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__3__Impl_in_rule__FeatureBody__Group__32890 = new BitSet(new long[]{0x000013B000000800L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__4_in_rule__FeatureBody__Group__32893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__FeaturesAssignment_3_in_rule__FeatureBody__Group__3__Impl2920 = new BitSet(new long[]{0x0000023000000802L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__4__Impl_in_rule__FeatureBody__Group__42951 = new BitSet(new long[]{0x000013B000000800L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__5_in_rule__FeatureBody__Group__42954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group_4__0_in_rule__FeatureBody__Group__4__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group__5__Impl_in_rule__FeatureBody__Group__53012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FeatureBody__Group__5__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group_4__0__Impl_in_rule__FeatureBody__Group_4__03083 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group_4__1_in_rule__FeatureBody__Group_4__03086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FeatureBody__Group_4__0__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__Group_4__1__Impl_in_rule__FeatureBody__Group_4__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureBody__RuleBodyAssignment_4_1_in_rule__FeatureBody__Group_4__1__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__0__Impl_in_rule__StandaloneCardinality__Group_0__03208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__1_in_rule__StandaloneCardinality__Group_0__03211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StandaloneCardinality__Group_0__0__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__1__Impl_in_rule__StandaloneCardinality__Group_0__13270 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__2_in_rule__StandaloneCardinality__Group_0__13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StandaloneCardinality__Group_0__1__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__2__Impl_in_rule__StandaloneCardinality__Group_0__23329 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__3_in_rule__StandaloneCardinality__Group_0__23332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0_2__0_in_rule__StandaloneCardinality__Group_0__2__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0__3__Impl_in_rule__StandaloneCardinality__Group_0__33390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StandaloneCardinality__Group_0__3__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0_2__0__Impl_in_rule__StandaloneCardinality__Group_0_2__03457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0_2__1_in_rule__StandaloneCardinality__Group_0_2__03460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StandaloneCardinality__Group_0_2__0__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandaloneCardinality__Group_0_2__1__Impl_in_rule__StandaloneCardinality__Group_0_2__13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StandaloneCardinality__Group_0_2__1__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__0__Impl_in_rule__GroupCardinality__Group__03579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__1_in_rule__GroupCardinality__Group__03582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GroupCardinality__Group__0__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__1__Impl_in_rule__GroupCardinality__Group__13641 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__2_in_rule__GroupCardinality__Group__13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GroupCardinality__Group__1__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__2__Impl_in_rule__GroupCardinality__Group__23700 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__3_in_rule__GroupCardinality__Group__23703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group_2__0_in_rule__GroupCardinality__Group__2__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group__3__Impl_in_rule__GroupCardinality__Group__33761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GroupCardinality__Group__3__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group_2__0__Impl_in_rule__GroupCardinality__Group_2__03828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group_2__1_in_rule__GroupCardinality__Group_2__03831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__GroupCardinality__Group_2__0__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupCardinality__Group_2__1__Impl_in_rule__GroupCardinality__Group_2__13890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GroupCardinality__Group_2__1__Impl3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__0__Impl_in_rule__AttributePart__Group__03950 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__1_in_rule__AttributePart__Group__03953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__1__Impl_in_rule__AttributePart__Group__14011 = new BitSet(new long[]{0x0000008000070000L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__2_in_rule__AttributePart__Group__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AttributePart__Group__1__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__2__Impl_in_rule__AttributePart__Group__24073 = new BitSet(new long[]{0x0000008000070000L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__3_in_rule__AttributePart__Group__24076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePart__AttrAssignment_2_in_rule__AttributePart__Group__2__Impl4103 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_rule__AttributePart__Group__3__Impl_in_rule__AttributePart__Group__34134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AttributePart__Group__3__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__0__Impl_in_rule__RuleBody__Group__04201 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__1_in_rule__RuleBody__Group__04204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__1__Impl_in_rule__RuleBody__Group__14262 = new BitSet(new long[]{0x000020800000F070L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__2_in_rule__RuleBody__Group__14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RuleBody__Group__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__2__Impl_in_rule__RuleBody__Group__24324 = new BitSet(new long[]{0x000020800000F070L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__3_in_rule__RuleBody__Group__24327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__RulesAssignment_2_in_rule__RuleBody__Group__2__Impl4354 = new BitSet(new long[]{0x000020000000F072L});
    public static final BitSet FOLLOW_rule__RuleBody__Group__3__Impl_in_rule__RuleBody__Group__34385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RuleBody__Group__3__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__0__Impl_in_rule__FeatureExpr__Group__04573 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__1_in_rule__FeatureExpr__Group__04576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__LeftAssignment_0_in_rule__FeatureExpr__Group__0__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__1__Impl_in_rule__FeatureExpr__Group__14633 = new BitSet(new long[]{0x000020000000F070L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__2_in_rule__FeatureExpr__Group__14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__OpAssignment_1_in_rule__FeatureExpr__Group__1__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__Group__2__Impl_in_rule__FeatureExpr__Group__24693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureExpr__RightAssignment_2_in_rule__FeatureExpr__Group__2__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__0__Impl_in_rule__LogicExpr__Group__04756 = new BitSet(new long[]{0x000020000000F070L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__1_in_rule__LogicExpr__Group__04759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Alternatives_0_in_rule__LogicExpr__Group__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__1__Impl_in_rule__LogicExpr__Group__14817 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__2_in_rule__LogicExpr__Group__14820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__LeftLogicExprAssignment_1_in_rule__LogicExpr__Group__1__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group__2__Impl_in_rule__LogicExpr__Group__24877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__0_in_rule__LogicExpr__Group__2__Impl4904 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__0__Impl_in_rule__LogicExpr__Group_2__04941 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__1_in_rule__LogicExpr__Group_2__04944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__1__Impl_in_rule__LogicExpr__Group_2__15002 = new BitSet(new long[]{0x000020000000F070L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__2_in_rule__LogicExpr__Group_2__15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__LogicOPAssignment_2_1_in_rule__LogicExpr__Group_2__1__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__Group_2__2__Impl_in_rule__LogicExpr__Group_2__25062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExpr__RightAssignment_2_2_in_rule__LogicExpr__Group_2__2__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group__0__Impl_in_rule__BasicExpr__Group__05125 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group__1_in_rule__BasicExpr__Group__05128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__LExprAssignment_0_in_rule__BasicExpr__Group__0__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group__1__Impl_in_rule__BasicExpr__Group__15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group_1__0_in_rule__BasicExpr__Group__1__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group_1__0__Impl_in_rule__BasicExpr__Group_1__05247 = new BitSet(new long[]{0x000020000000F070L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group_1__1_in_rule__BasicExpr__Group_1__05250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__CompOpAssignment_1_0_in_rule__BasicExpr__Group_1__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__Group_1__1__Impl_in_rule__BasicExpr__Group_1__15307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExpr__RExprAssignment_1_1_in_rule__BasicExpr__Group_1__1__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__05368 = new BitSet(new long[]{0x000020000000F070L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__05371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atom__Group_1__0__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__15430 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__15433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__SubAssignment_1_1_in_rule__Atom__Group_1__1__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__25490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Atom__Group_1__2__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05555 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5641 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__QualifiedName__Group_1__0__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootDeclaration__NameAssignment_15803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_rule__RootDeclaration__InCardAssignment_25834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_rule__RootDeclaration__BodyAssignment_35865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandaloneCardinality_in_rule__FeatureDeclaration__OutCardAssignment_05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureDeclaration__NameAssignment_1_0_15927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureDeclaration__RefAssignment_1_1_15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCardinality_in_rule__FeatureDeclaration__InCardAssignment_25997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureBody_in_rule__FeatureDeclaration__BodyAssignment_36028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePart_in_rule__FeatureBody__AttrsAssignment_26059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDeclaration_in_rule__FeatureBody__FeaturesAssignment_36090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__FeatureBody__RuleBodyAssignment_4_16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributePart__AttrAssignment_26152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureExpr_in_rule__RuleBody__RulesAssignment_26183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_06214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_16245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_rule__FeatureExpr__LeftAssignment_06276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureOP_in_rule__FeatureExpr__OpAssignment_16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_rule__FeatureExpr__RightAssignment_26338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_rule__LogicExpr__LeftLogicExprAssignment_16369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOP_in_rule__LogicExpr__LogicOPAssignment_2_16400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExpr_in_rule__LogicExpr__RightAssignment_2_26431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__BasicExpr__LExprAssignment_06462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparationOP_in_rule__BasicExpr__CompOpAssignment_1_06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__BasicExpr__RExprAssignment_1_16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Atom__LiteralAssignment_06555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpr_in_rule__Atom__SubAssignment_1_16586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__StrAssignment_06617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__IntAssignment_16648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__Literal__BoolAssignment_26679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Literal__NameAssignment_36714 = new BitSet(new long[]{0x0000000000000002L});

}