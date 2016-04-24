package golfTest;

import com.badlogic.gdx.math.Vector2;

public class Force {
	private Vector2 force;

	public Force(Vector2 force) {
		super();
		this.force = force;
	}

	public Vector2 getForce() {
		return force;
	}

	public void setForce(Vector2 force) {
		this.force = force;
	}

}
