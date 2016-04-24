package runnables;

import searchTree.TreeNode;
import searchTree.TreeOperator;
import testClasses.DoubleNodeTestEvaluator;
import testClasses.DoubleTestGoalAchieved;
import testClasses.DoubleValueAction;
import testClasses.DoubleValueTestGenerator;
import testClasses.DoubleValueTestState;

public class AiTestA {

	public static void main(String[] args) {
		DoubleValueTestState rootState = new DoubleValueTestState(500);
		TreeNode<DoubleValueTestState, DoubleValueAction> rootNode = new TreeNode<DoubleValueTestState, DoubleValueAction>(
				null);
		rootNode.setState(rootState);
		rootNode.setNodeDeapth(0);

		DoubleNodeTestEvaluator evaluator = new DoubleNodeTestEvaluator(rootNode);
		evaluator.evaluateNode(rootNode);
		DoubleTestGoalAchieved goalTest = new DoubleTestGoalAchieved();
		DoubleValueTestGenerator generator = new DoubleValueTestGenerator(evaluator);

		TreeOperator<DoubleValueTestState, DoubleValueAction> mySearchTree = new TreeOperator<DoubleValueTestState, DoubleValueAction>(
				rootNode, generator, goalTest);
		System.out.println(mySearchTree.getTree().getRootNode());

		TreeNode<DoubleValueTestState, DoubleValueAction> solutionNode = mySearchTree.runSearch();

		System.out.println("Found sol at depth " + solutionNode.getNodeDeapth() + " " + "GoalState="
				+ solutionNode.getState().getDoubleValue());
		TreeNode<DoubleValueTestState, DoubleValueAction> tempNode = solutionNode;
		while (tempNode.getParent() != null) {

			System.out.println(tempNode.getParent().getState().getDoubleValue());
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
