package golfTest;

import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;

public class GolfToxicArea {

	private Polygon toxicArea;
	private Vector2 possition;
	private int xDim;
	private int yDim;

	public GolfToxicArea(float xDim, float yDim, Vector2 possition) {

		this.setxDim((int) xDim);
		this.setyDim((int) yDim);

		float[] anArray = new float[8];

		anArray[0] = 0;
		anArray[1] = 0;
		anArray[2] = 0;
		anArray[3] = yDim;
		anArray[4] = xDim;
		anArray[5] = yDim;
		anArray[6] = xDim;
		anArray[7] = 0;
		toxicArea = (new Polygon(anArray));
		toxicArea.setPosition(possition.x, possition.y);
		this.possition = (possition);
	}

	public Polygon getToxicArea() {
		return toxicArea;
	}

	public Vector2 getPossition() {
		return possition;
	}

	public int getxDim() {
		return xDim;
	}

	public void setxDim(int xDim) {
		this.xDim = xDim;
	}

	public int getyDim() {
		return yDim;
	}

	private void setyDim(int yDim) {
		this.yDim = yDim;
	}
}
