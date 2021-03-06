package golfTestAI;

import searchTree.GoalAchived;

import com.badlogic.gdx.math.Vector2;

public class GolfTestGoalChecker extends GoalAchived<GolfTestState> {
	private final int diameterOfTarget = 5;

	@Override
	public boolean test(GolfTestState aState) {
		Vector2 difference = aState.getCourt().getHole().getPossition().cpy().sub(aState.getBall().getBallPosition());
		return difference.len() < diameterOfTarget;
	}

}
