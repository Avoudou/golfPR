package golfTestAI;

import golfTest.Force;

import com.badlogic.gdx.math.Vector2;

public class ActionGenerator {

	// private final int maxForceValue = 14;
	private final int maxXYcoordinate = 20;

	public Force generateRandomForce() {

		float a = (float) (maxXYcoordinate * Math.sin(Math.random() * 2 * Math.PI));
		float b = (float) (maxXYcoordinate * Math.sin(Math.random() * 2 * Math.PI));
		Vector2 randomVector = new Vector2(a, b);

		return new Force(randomVector);
	}

}
