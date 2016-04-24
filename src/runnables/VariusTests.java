package runnables;

import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.GolfHole;
import golfTestAI.GolfTestAction;
import golfTestAI.GolfTestEvaluator;
import golfTestAI.GolfTestGenerator;
import golfTestAI.GolfTestState;
import searchTree.TreeNode;

import com.badlogic.gdx.math.Vector2;

public class VariusTests {

	public static void main(String[] args) {
		Vector2 startPosit = new Vector2(0, 50);
		Vector2 targetPosit = new Vector2(0, 0);

		GolfBall ball = new GolfBall(startPosit);
		GolfHole target = new GolfHole(targetPosit);
		GolfCourt court = new GolfCourt(target);
		court.setHole(target);

		GolfTestState rootState = new GolfTestState(ball, court);
		TreeNode<GolfTestState, GolfTestAction> rootNode = new TreeNode<GolfTestState, GolfTestAction>(null);
		rootNode.setState(rootState);
		rootNode.setNodeDeapth(0);
		GolfTestEvaluator evaluator = new GolfTestEvaluator();
		// System.out.println(evaluator.evaluateNode(rootNode));

		GolfTestGenerator generator = new GolfTestGenerator();
		TreeNode<GolfTestState, GolfTestAction> testNode = generator.generateChildNode(rootNode);
		System.out.println(rootNode.getState().getCourt().getHole().getPossition());
		System.out.println(testNode.getState().getCourt().getHole().getPossition());
		// System.out.println(evaluator.evaluateNode(testNode));
		// System.out.println(testNode.getValueOfNode());
		// System.out.println(rootNode.getState().getBall().getBallPosition().sub(targetPosit).len());

	}

}
