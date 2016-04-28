package testClasses;

import nodeGenerationPackg.NodeGenerator;
import searchTree.TreeNode;

public class IntegerValueTestGenerator extends NodeGenerator<IntegerValueTestState, IntegerValueAction> {

	private IntegerNodeTestEvaluator evaluator;
	private int range = 10;

	public IntegerValueTestGenerator(IntegerNodeTestEvaluator evaluator) {
		this.evaluator = evaluator;
	}

	public TreeNode<IntegerValueTestState, IntegerValueAction> generateChildNode(
			TreeNode<IntegerValueTestState, IntegerValueAction> aNode) {

		TreeNode<IntegerValueTestState, IntegerValueAction> childNode = new TreeNode<IntegerValueTestState, IntegerValueAction>(
				aNode);
		IntegerValueTestState childState = aNode.getState().cloneState();
		IntegerValueAction action = new IntegerValueAction(range);
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
