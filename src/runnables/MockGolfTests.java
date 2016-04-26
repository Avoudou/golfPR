package runnables;

import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.GolfHole;
import golfTest.GolfToxicArea;
import golfTestVisuals.GolfTestFrame;

import java.util.Timer;
import java.util.TimerTask;

import com.badlogic.gdx.math.Vector2;

public class MockGolfTests {

	public static void main(String[] args) {


		Vector2 startPosit = new Vector2(100, 100);
		Vector2 targetPosit = new Vector2(-230, 60);

		GolfBall ball = new GolfBall(startPosit);
		GolfHole target = new GolfHole(targetPosit);
		GolfCourt court = new GolfCourt(target);
		court.setHole(target);
		GolfToxicArea toxicArea = new GolfToxicArea(50, 400, new Vector2(30, -200));
		court.addToxicArea(toxicArea);
		System.out.println(court.getToxicAreasList().get(0).getToxicArea());

		GolfTestFrame window = new GolfTestFrame(court, ball);

		Timer refreshTimer = new Timer();
		TimerTask refreshRate = new TimerTask() {

			@Override
			public void run() {
				window.refresh();

			}
		};
		refreshTimer.schedule(refreshRate, 0, 16);

		//
		// GolfTestState rootState = new GolfTestState(ball, court);
		// TreeNode<GolfTestState, GolfTestAction> rootNode = new TreeNode<GolfTestState, GolfTestAction>(null);
		// rootNode.setState(rootState);
		// rootNode.setNodeDeapth(0);
		//
		//
		// GolfTestGenerator generator = new GolfTestGenerator();
		// GolfTestGoalChecker goalTester = new GolfTestGoalChecker();
		//
		// TreeOperator<GolfTestState, GolfTestAction> treeOperator = new TreeOperator<GolfTestState, GolfTestAction>(
		// rootNode, generator, goalTester);
		// TreeNode<GolfTestState, GolfTestAction> solutionNode = treeOperator.runSearch();
		// GolfTestEvaluator evaluator = new GolfTestEvaluator();
		// rootNode.setValueOfNode(evaluator.evaluateNode(rootNode));
		//
		// System.out.println("Found sol at depth " + solutionNode.getNodeDeapth() + " " + "GoalState="
		// + solutionNode.getState().getBall().getBallPosition() + " evaluationOFposition = "
		// + solutionNode.getValueOfNode());
		// TreeNode<GolfTestState, GolfTestAction> tempNode = solutionNode;
		// while (tempNode.getParent() != null) {
		//
		// System.out.println("ballPosition at step : " + tempNode.getParent().getNodeDeapth() + "  ="
		// + tempNode.getParent().getState().getBall().getBallPosition() + " value  ="
		// + tempNode.getParent().getValueOfNode());
		//
		// tempNode = tempNode.getParent();
		// }


		// System.out.println(evaluator.evaluateNode(rootNode));
		// MovesManager movemanager = new MovesManager();
		// movemanager.applyForce(new Force(new Vector2(110, 150)), ball);
		//

	}

	}

