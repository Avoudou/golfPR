package testClasses;

import searchTree.GoalAchived;

public class DoubleTestGoalAchieved extends GoalAchived<DoubleValueTestState> {

	@Override
	public boolean test(DoubleValueTestState aState) {
		if (aState.getDoubleValue() == 0) {
			return true;
		}
		return false;
	}

}
