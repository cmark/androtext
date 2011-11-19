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
	protected AbstractElementAlias match_LinearLayout_VerticalKeyword_2_1_q;
	protected AbstractElementAlias match_RadioGroup_VerticalKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AndroTextDslGrammarAccess) access;
		match_LinearLayout_VerticalKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getLinearLayoutAccess().getVerticalKeyword_2_1());
		match_RadioGroup_VerticalKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getRadioGroupAccess().getVerticalKeyword_2_1());
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
			if(match_LinearLayout_VerticalKeyword_2_1_q.equals(syntax))
				emit_LinearLayout_VerticalKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RadioGroup_VerticalKeyword_2_1_q.equals(syntax))
				emit_RadioGroup_VerticalKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'vertical'?
	 */
	protected void emit_LinearLayout_VerticalKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
