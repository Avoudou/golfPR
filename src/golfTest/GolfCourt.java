package golfTest;

public class GolfCourt {
	private final int diameter = 600;
	private GolfHole hole;

	public GolfCourt(GolfHole hole) {
		this.hole = hole;

	}

	public int getDiameter() {
		return diameter;
	}


	public GolfHole getHole() {
		return hole;
	}

	public void setHole(GolfHole hole) {
		this.hole = hole;
	}

}
