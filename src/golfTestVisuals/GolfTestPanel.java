package golfTestVisuals;

import golfTest.Force;
import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.MovesManager;
import golfTestAI.GolfTestAction;
import golfTestAI.GolfTestEvaluator;
import golfTestAI.GolfTestGenerator;
import golfTestAI.GolfTestGoalChecker;
import golfTestAI.GolfTestState;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import searchTree.TreeNode;
import searchTree.TreeOperator;

public class GolfTestPanel extends JPanel {

	private GolfCourt court;
	private GolfBall ball;
	private int courtCenterX;
	private int courtCenterY;
	private CustomKeyListener listener = new CustomKeyListener();

	public GolfTestPanel(GolfCourt court, GolfBall ball) {
		this.court = court;
		this.ball = ball;
		courtCenterX = court.getDiameter() / 2;
		courtCenterY = court.getDiameter() / 2;
		addKeyListener(new CustomKeyListener());
		setFocusable(true);
	}

	@Override
	public void paintComponent(Graphics graph) {
		super.paintComponent(graph);
		drawCourt(graph);
		drawBall(graph);

	}

	public void drawCourt(Graphics graph) {
		graph.setColor(Color.GREEN);
		graph.fillOval(0, 0, court.getDiameter(), court.getDiameter());
		drawTargetArea(graph);
		drawToxicArea(graph);
	}

	public void drawBall(Graphics graph) {
		graph.setColor(Color.WHITE);
		graph.fillOval((int) (courtCenterX + ball.getBallPosition().x),
				(int) (courtCenterY + ball.getBallPosition().y), 5, 5);

	}

	public void drawTargetArea(Graphics graph) {
		graph.setColor(Color.BLACK);
		graph.fillOval((int) (courtCenterX + court.getHole().getPossition().x) - 10, (int) (courtCenterY + court
				.getHole().getPossition().y) - 10, 20, 20);

	}

	public void drawToxicArea(Graphics graph) {
		graph.setColor(Color.RED);
		graph.fillRect((int) (courtCenterX + court.getToxicAreasList().get(0).getPossition().x),
				(int) (courtCenterY + court.getToxicAreasList().get(0).getPossition().y), 50, 400);
	}

	class CustomKeyListener implements KeyListener {
		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_B) {
				System.out.println("b is pressed");
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

				TreeNode<GolfTestState, GolfTestAction> tempNode = solutionNode;
				while (tempNode.getNodeDeapth() != 1) {
					tempNode = tempNode.getParent();

				}
				System.out.println(tempNode.getState().getBall().getBallPosition());
					Force forceToNext = new Force(tempNode.getAction().getForce().getForce().cpy());
					MovesManager moveManager = new MovesManager();
					moveManager.applyForce(forceToNext, ball);
				// GolfTestGoalChecker checkGoal = new GolfTestGoalChecker();
				// System.out.println(checkGoal.test(tempNode.getState()));

					repaint();


			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
