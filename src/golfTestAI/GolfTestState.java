package golfTestAI;

import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.GolfHole;
import searchTree.SearchState;

import com.badlogic.gdx.math.Vector2;

public class GolfTestState extends SearchState {
 private GolfBall ball;
	private GolfCourt court;

	public GolfTestState(GolfBall ball, GolfCourt court) {
		this.ball = ball;
		this.court = court;
	}

	public GolfBall getBall() {
		return ball;
	}

	public void setBall(GolfBall ball) {
		this.ball = ball;
	}

	public GolfCourt getCourt() {
		return court;
	}

	public void setCourt(GolfCourt court) {
		this.court = court;
	}

	public GolfTestState cloneState() {
		GolfBall newBall = new GolfBall(new Vector2(ball.getBallPosition()));
		GolfCourt newCourt = new GolfCourt(new GolfHole(new Vector2(court.getHole().getPossition())));
		GolfTestState cloneState = new GolfTestState(newBall, newCourt);
		return cloneState;
	}

}
