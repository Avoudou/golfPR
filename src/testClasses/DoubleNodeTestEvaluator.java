package testClasses;

import searchTree.TreeNode;
import evaluationPack.NodeEvaluator;

public class DoubleNodeTestEvaluator extends NodeEvaluator<DoubleValueTestState> {
	// private final int stepCost = 7;
	private TreeNode<DoubleValueTestState, DoubleValueAction> rootNode;

	public DoubleNodeTestEvaluator(TreeNode<DoubleValueTestState, DoubleValueAction> rootNode) {
		rootNode.setValueOfNode(rootNode.getState().getDoubleValue());
		this.rootNode = rootNode;

	}
	@Override
	public double evaluateNode(TreeNode<DoubleValueTestState, ?> aNode) {
		// if (aNode.getState().getDoubleValue() % 23 == 0) {
		// return aNode.getState().getDoubleValue() - 9;
		// }
		if (aNode.getState().getDoubleValue() < 0) {
			return rootNode.getState().getDoubleValue() * 10;
		}

		double valueOfNode = aNode.getState().getDoubleValue();
		return valueOfNode;
	}


}
