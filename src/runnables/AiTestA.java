package runnables;

import searchTree.TreeNode;
import searchTree.TreeOperator;
import testClasses.IntegerNodeTestEvaluator;
import testClasses.IntegerTestGoalAchieved;
import testClasses.IntegerValueAction;
import testClasses.IntegerValueTestGenerator;
import testClasses.IntegerValueTestState;

public class AiTestA {

	public static void main(String[] args) {
		IntegerValueTestState rootState = new IntegerValueTestState(500);
		TreeNode<IntegerValueTestState, IntegerValueAction> rootNode = new TreeNode<IntegerValueTestState, IntegerValueAction>(
				null);
		rootNode.setState(rootState);
		rootNode.setNodeDeapth(0);

		IntegerNodeTestEvaluator evaluator = new IntegerNodeTestEvaluator(rootNode);
		evaluator.evaluateNode(rootNode);
		IntegerTestGoalAchieved goalTest = new IntegerTestGoalAchieved();
		IntegerValueTestGenerator generator = new IntegerValueTestGenerator(evaluator);

		TreeOperator<IntegerValueTestState, IntegerValueAction> mySearchTree = new TreeOperator<IntegerValueTestState, IntegerValueAction>(
				rootNode, generator, goalTest);
		System.out.println(mySearchTree.getTree().getRootNode());

		TreeNode<IntegerValueTestState, IntegerValueAction> solutionNode = mySearchTree.runSearch();

		System.out.println("Found sol at depth " + solutionNode.getNodeDeapth() + " " + "GoalState="
				+ solutionNode.getState().getintValue());
		TreeNode<IntegerValueTestState, IntegerValueAction> tempNode = solutionNode;
		while (tempNode.getParent() != null) {

			System.out.println(tempNode.getParent().getState().getintValue());
			tempNode = tempNode.getParent();
		}
		// TreeNode<DoubleValueTestState, DoubleValueAction> rootNode= new TreeNode<DoubleValueTestState,
		// DoubleValueAction>(null);
		// DoubleValueTestState rootState = new DoubleValueTestState(-30);
		// rootNode.setState(rootState);
		//
		// DoubleNodeTestEvaluator evaluator= new DoubleNodeTestEvaluator(rootNode);
		// evaluator.evaluateNode(rootNode);
		//
		// DoubleValueTestGenerator generator= new DoubleValueTestGenerator(evaluator);
		// TreeNode<DoubleValueTestState, DoubleValueAction> firstchild = generator.generateChildNode(rootNode);
		// System.out.println(firstchild.getValueOfNode());
	}

}
