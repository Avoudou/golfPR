package runnables;

import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.GolfHole;
import golfTestAI.GolfTestAction;
import golfTestAI.GolfTestEvaluator;
import golfTestAI.GolfTestGenerator;
import golfTestAI.GolfTestGoalChecker;
import golfTestAI.GolfTestState;
import searchTree.TreeNode;
import searchTree.TreeOperator;

import com.badlogic.gdx.math.Vector2;

public class MockGolfTests {

	public static void main(String[] args) {


		Vector2 startPosit = new Vector2(0, 100);
		Vector2 targetPosit = new Vector2(0, 0);

		GolfBall ball = new GolfBall(startPosit);
		GolfHole target = new GolfHole(targetPosit);
		GolfCourt court = new GolfCourt(target);
		court.setHole(target);


		GolfTestState rootState = new GolfTestState(ball, court);
		TreeNode<GolfTestState, GolfTestAction> rootNode = new TreeNode<GolfTestState, GolfTestAction>(null);
		rootNode.setState(rootState);
		rootNode.setNodeDeapth(0);


		GolfTestGenerator generator = new GolfTestGenerator();
		GolfTestGoalChecker goalTester = new GolfTestGoalChecker();

		TreeOperator<GolfTestState, GolfTestAction> treeOperator = new TreeOperator<GolfTestState, GolfTestAction>(
				rootNode, generator, goalTester);
		TreeNode<GolfTestState, GolfTestAction> solutionNode = treeOperator.runSearch();
		GolfTestEvaluator evaluator = new GolfTestEvaluator();
		rootNode.setValueOfNode(evaluator.evaluateNode(rootNode));

		System.out.println("Found sol at depth " + solutionNode.getNodeDeapth() + " " + "GoalState="
				+ solutionNode.getState().getBall().getBallPosition() + " evaluationOFposition = "
				+ solutionNode.getValueOfNode());
		TreeNode<GolfTestState, GolfTestAction> tempNode = solutionNode;
		while (tempNode.getParent() != null) {

			System.out.println("ballPosition at step : " + tempNode.getParent().getNodeDeapth() + "  ="
					+ tempNode.getParent().getState().getBall().getBallPosition() + " value  ="
					+ tempNode.getParent().getValueOfNode());
			tempNode = tempNode.getParent();
		}


		// System.out.println(evaluator.evaluateNode(rootNode));
		// MovesManager movemanager = new MovesManager();
		// movemanager.applyForce(new Force(new Vector2(110, 150)), ball);
		//
		// GolfTestFrame window = new GolfTestFrame(court, ball);

	}

}
