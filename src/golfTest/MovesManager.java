package golfTest;

public class MovesManager {



	public void applyForce(Force aForce, GolfBall ball) {
		ball.setBallPosition(ball.getBallPosition().add(aForce.getForce()));
	}




}
