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


		Vector2 startPosit = new Vector2(69, 100);
		Vector2 targetPosit = new Vector2(-250, -70);

		GolfBall ball = new GolfBall(startPosit);
		GolfHole target = new GolfHole(targetPosit);
		GolfCourt court = new GolfCourt(target);
		court.setHole(target);
		GolfToxicArea toxicArea = new GolfToxicArea(65, 200, new Vector2(-200, -150));
		GolfToxicArea toxicArea2 = new GolfToxicArea(65, 200, new Vector2(-100, 80));
		GolfToxicArea toxicArea3 = new GolfToxicArea(65, 200, new Vector2(-0, -100));
		court.addToxicArea(toxicArea);
		court.addToxicArea(toxicArea2);
		court.addToxicArea(toxicArea3);

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

