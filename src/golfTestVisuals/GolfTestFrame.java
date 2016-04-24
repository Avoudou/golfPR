package golfTestVisuals;

import golfTest.GolfBall;
import golfTest.GolfCourt;

import javax.swing.JFrame;

public class GolfTestFrame extends JFrame {
	private GolfTestPanel represPanel;
	private GolfCourt court;
	private GolfBall ball;

	private final int xAxisSize = 900;
	private final int yAxisSize = 700;

	public GolfTestFrame(GolfCourt court, GolfBall ball) {
		this.court = court;
		this.ball = ball;
		setSize(xAxisSize, yAxisSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("golf ai test");
		setResizable(false);
		represPanel = new GolfTestPanel(court, ball);

		getContentPane().add(represPanel);
		setVisible(true);
	}

	public void refresh() {
		represPanel.repaint();
	}

}
