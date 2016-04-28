package testClasses;

import searchTree.TreeNode;
import evaluationPack.NodeEvaluator;

public class IntegerNodeTestEvaluator extends NodeEvaluator<IntegerValueTestState> {
	// private final int stepCost = 7;
	private TreeNode<IntegerValueTestState, IntegerValueAction> rootNode;

	public IntegerNodeTestEvaluator(TreeNode<IntegerValueTestState, IntegerValueAction> rootNode) {
		rootNode.setValueOfNode(rootNode.getState().getintValue());
		this.rootNode = rootNode;

	}
	@Override
	public double evaluateNode(TreeNode<IntegerValueTestState, ?> aNode) {
		// if (aNode.getState().getintValue() % 23 == 0) {
		// return aNode.getState().getintValue() - 9;
		// }
		if (aNode.getState().getintValue() < 0) {
			return rootNode.getState().getintValue() * 10;
		}

		int valueOfNode = aNode.getState().getintValue();
		return valueOfNode;
	}


}
