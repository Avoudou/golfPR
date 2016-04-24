package testClasses;

import nodeGenerationPackg.NodeGenerator;
import searchTree.TreeNode;

public class DoubleValueTestGenerator extends NodeGenerator<DoubleValueTestState, DoubleValueAction> {

	private DoubleNodeTestEvaluator evaluator;
	private int range = 10;

	public DoubleValueTestGenerator(DoubleNodeTestEvaluator evaluator) {
		this.evaluator = evaluator;
	}

	public TreeNode<DoubleValueTestState, DoubleValueAction> generateChildNode(
			TreeNode<DoubleValueTestState, DoubleValueAction> aNode) {

		TreeNode<DoubleValueTestState, DoubleValueAction> childNode = new TreeNode<DoubleValueTestState, DoubleValueAction>(
				aNode);
		DoubleValueTestState childState = aNode.getState().cloneState();
		DoubleValueAction action = new DoubleValueAction(range);
		action.applyAction(childState);
		childNode.setState(childState);
		childNode.setAction(action);
		childNode.setNodeDeapth(aNode.getNodeDeapth() + 1);
		childNode.setValueOfNode(evaluator.evaluateNode(childNode));
		aNode.addChildNode(childNode);
		// System.out.println(childNode.getValueOfNode());
		return childNode;
	}

}
