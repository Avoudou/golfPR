package testClasses;

import searchTree.SearchState;

public class DoubleValueTestState extends SearchState {

	private double doubleValue;

	public DoubleValueTestState(double value) {
		this.doubleValue = value;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public DoubleValueTestState cloneState() {
		DoubleValueTestState clone = new DoubleValueTestState(doubleValue);
		return clone;
	}
}
