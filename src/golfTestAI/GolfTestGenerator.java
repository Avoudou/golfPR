package golfTestAI;

import golfTest.MovesManager;
import nodeGenerationPackg.NodeGenerator;
import searchTree.TreeNode;

public class GolfTestGenerator extends NodeGenerator<GolfTestState, GolfTestAction> {

	private MovesManager moveManager = new MovesManager();
	private GolfTestEvaluator evaluator = new GolfTestEvaluator();
	private ActionGenerator forceGenerator = new ActionGenerator();

	public GolfTestGenerator() {

	}

	@Override
	public TreeNode<GolfTestState, GolfTestAction> generateChildNode(TreeNode<GolfTestState, GolfTestAction> aNode) {

		TreeNode<GolfTestState, GolfTestAction> childNode = new TreeNode<GolfTestState, GolfTestAction>(aNode);
		GolfTestState childState = aNode.getState().cloneState();
		GolfTestAction action = new GolfTestAction(forceGenerator.generateRandomForce());
		action.applyAction(childState, moveManager);
		childNode.setState(childState);
		childNode.setAction(action);
		childNode.setNodeDeapth(aNode.getNodeDeapth() + 1);
		childNode.setValueOfNode(evaluator.evaluateNode(childNode));
		aNode.addChildNode(childNode);
		// System.out.println(childNode.getValueOfNode());
		return childNode;
	}

}
