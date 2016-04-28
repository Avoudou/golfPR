package testClasses;

import searchTree.SearchState;

public class IntegerValueTestState extends SearchState {

	private int intValue;

	public IntegerValueTestState(int value) {
		this.intValue = value;
	}

	public int getintValue() {
		return intValue;
	}

	public void setintValue(int intValue) {
		this.intValue = intValue;
	}

	public IntegerValueTestState cloneState() {
		IntegerValueTestState clone = new IntegerValueTestState(intValue);
		return clone;
	}
}
