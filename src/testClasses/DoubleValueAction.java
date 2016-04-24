package testClasses;

import searchTree.AbstractAction;

public class DoubleValueAction extends AbstractAction<DoubleValueTestState> {

	private double increment = 0;
	private int incrementRange;

	public DoubleValueAction(int incrementRange) {
		this.incrementRange = incrementRange;
		calculateIncr();
	}

	public void applyAction(DoubleValueTestState aState) {

		aState.setDoubleValue(aState.getDoubleValue() - increment);
	}

	private void calculateIncr() {
		increment = (int) (Math.random() * incrementRange) + 1;
	}

	public double getAction() {
		return increment;
	}

}
