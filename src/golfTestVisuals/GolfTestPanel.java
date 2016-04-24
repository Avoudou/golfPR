package golfTestVisuals;

import golfTest.GolfBall;
import golfTest.GolfCourt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GolfTestPanel extends JPanel {

	private GolfCourt court;
	private GolfBall ball;
	private int courtCenterX;
	private int courtCenterY;

	public GolfTestPanel(GolfCourt court, GolfBall ball) {
		this.court = court;
		this.ball = ball;
		courtCenterX = court.getDiameter() / 2;
		courtCenterY = court.getDiameter() / 2;
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
	}

	public void drawBall(Graphics graph) {
		graph.setColor(Color.WHITE);
		graph.fillOval((int) (courtCenterX + ball.getBallPosition().x),
				(int) (courtCenterY + ball.getBallPosition().y), 5, 5);

	}

	public void drawTargetArea(Graphics graph) {
		graph.setColor(Color.BLACK);
		graph.fillOval((int) (courtCenterX + court.getHole().getPossition().x), (int) (courtCenterY + court.getHole()
				.getPossition().y), 20, 20);

	}

	class CustomKeyListener implements KeyListener {
		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
