package golfTestAI;

import golfTest.Force;
import golfTest.MovesManager;
import searchTree.AbstractAction;

public class GolfTestAction extends AbstractAction<GolfTestState> {

	private Force force;

	public GolfTestAction(Force force) {
		super();
		this.force = force;
	}

	public Force getForce() {
		return force;
	}

	public void applyAction(GolfTestState aState, MovesManager moveManager) {
		moveManager.applyForce(force, aState.getBall());

	}

}
