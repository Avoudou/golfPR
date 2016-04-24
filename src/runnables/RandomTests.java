package runnables;

import golfTest.GolfBall;
import golfTest.GolfCourt;
import golfTest.GolfHole;
import golfTestAI.GolfTestState;

import com.badlogic.gdx.math.Vector2;

public class RandomTests {

	public static void main(String[] args) {
		Vector2 startPosit = new Vector2(0, 20);
		Vector2 targetPosit = new Vector2(0, 0);

		GolfBall ball = new GolfBall(startPosit);
		GolfHole target = new GolfHole(targetPosit);
		GolfCourt court = new GolfCourt(target);
		court.setHole(target);

		GolfTestState rootState = new GolfTestState(ball, court);

		GolfTestState testAState = rootState.cloneState();

		System.out.println(rootState.getCourt().getHole().getPossition());
		System.out.println(testAState.getCourt().getHole().getPossition());
		// target.setPossition(new Vector2(40, 40));
		System.out.println();
		System.out.println(rootState.getCourt().getHole().getPossition());
		System.out.println(testAState.getCourt().getHole().getPossition());

	}

}
