package runnables;

import golfTest.Force;
import golfTestAI.ActionGenerator;

public class ForceGeneratorTest {

	public static void main(String[] args) {
		ActionGenerator forcegenerator = new ActionGenerator();
		for (int i = 0; i < 60; i++) {
		Force aForce = forcegenerator.generateRandomForce();
		System.out.println(aForce.getForce().len());
		}
	}

}
