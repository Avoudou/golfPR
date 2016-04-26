package golfTest;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

public class GolfCourt {
	private final int diameter = 600;
	private GolfHole hole;
	private ArrayList<GolfToxicArea> toxicAreasList = new ArrayList<GolfToxicArea>();

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

	public ArrayList<GolfToxicArea> getToxicAreasList() {
		return toxicAreasList;
	}

	public void setToxicAreasList(ArrayList<GolfToxicArea> toxicAreasList) {
		this.toxicAreasList = toxicAreasList;
	}

	public void addToxicArea(GolfToxicArea anArea) {
		toxicAreasList.add(anArea);

	}

	public GolfCourt clone() {
		GolfHole aHole = new GolfHole(new Vector2(hole.getPossition().cpy()));
		GolfCourt newCourt = new GolfCourt(aHole);
		newCourt.setToxicAreasList(toxicAreasList);
		return newCourt;
	}

}
