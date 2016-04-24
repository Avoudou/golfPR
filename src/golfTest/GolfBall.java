package golfTest;

import com.badlogic.gdx.math.Vector2;

public class GolfBall {

	private Vector2 ballPosition;

	public GolfBall(Vector2 possit) {
		ballPosition = possit;

	}

	public Vector2 getBallPosition() {
		return ballPosition;
	}

	public void setBallPosition(Vector2 ballPosition) {
		this.ballPosition = ballPosition;
	}
}
