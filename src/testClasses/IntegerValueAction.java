package testClasses;

import searchTree.AbstractAction;

public class IntegerValueAction extends AbstractAction<IntegerValueTestState> {

	private int increment = 0;
	private int incrementRange;

	public IntegerValueAction(int incrementRange) {
		this.incrementRange = incrementRange;
		calculateIncr();
	}

	public void applyAction(IntegerValueTestState aState) {

		aState.setintValue(aState.getintValue() - increment);
	}

	private void calculateIncr() {
		increment = (int) (Math.random() * incrementRange) + 1;
	}

	public int getAction() {
		return increment;
	}

}
