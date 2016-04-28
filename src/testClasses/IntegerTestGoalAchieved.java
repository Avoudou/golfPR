package testClasses;

import searchTree.GoalAchived;

public class IntegerTestGoalAchieved extends GoalAchived<IntegerValueTestState> {

	@Override
	public boolean test(IntegerValueTestState aState) {
		if (aState.getintValue() == 0) {
			return true;
		}
		return false;
	}

}
