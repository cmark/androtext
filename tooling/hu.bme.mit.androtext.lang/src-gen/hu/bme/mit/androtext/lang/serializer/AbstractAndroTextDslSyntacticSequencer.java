package hu.bme.mit.androtext.lang.serializer;

import com.google.inject.Inject;
import hu.bme.mit.androtext.lang.services.AndroTextDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractAndroTextDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AndroTextDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BaseGameActivity_RightCurlyBracketKeyword_2_1_a;
	protected AbstractElementAlias match_BaseGameActivity_RightCurlyBracketKeyword_2_1_p;
	protected AbstractElementAlias match_LinearLayout_HorizontalKeyword_2_1_q;
	protected AbstractElementAlias match_RadioGroup_VerticalKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AndroTextDslGrammarAccess) access;
		match_BaseGameActivity_RightCurlyBracketKeyword_2_1_a = new TokenAlias(true, true, grammarAccess.getBaseGameActivityAccess().getRightCurlyBracketKeyword_2_1());
		match_BaseGameActivity_RightCurlyBracketKeyword_2_1_p = new TokenAlias(true, false, grammarAccess.getBaseGameActivityAccess().getRightCurlyBracketKeyword_2_1());
		match_LinearLayout_HorizontalKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getLinearLayoutAccess().getHorizontalKeyword_2_1());
		match_RadioGroup_VerticalKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getRadioGroupAccess().getVerticalKeyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BaseGameActivity_RightCurlyBracketKeyword_2_1_a.equals(syntax))
				emit_BaseGameActivity_RightCurlyBracketKeyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BaseGameActivity_RightCurlyBracketKeyword_2_1_p.equals(syntax))
				emit_BaseGameActivity_RightCurlyBracketKeyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LinearLayout_HorizontalKeyword_2_1_q.equals(syntax))
				emit_LinearLayout_HorizontalKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RadioGroup_VerticalKeyword_2_1_q.equals(syntax))
				emit_RadioGroup_VerticalKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_BaseGameActivity_RightCurlyBracketKeyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_BaseGameActivity_RightCurlyBracketKeyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'horizontal'?
	 */
	protected void emit_LinearLayout_HorizontalKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'vertical'?
	 */
	protected void emit_RadioGroup_VerticalKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
