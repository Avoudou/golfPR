package runnables;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;

public class PolygoneTest {

	public static void main(String[] args) {

		float[] anArray = new float[8];

		anArray[0] = 0;
		anArray[1] = 0;
		anArray[2] = 0;
		anArray[3] = 10;
		anArray[4] = 10;
		anArray[5] = 10;
		anArray[6] = 10;
		anArray[7] = 0;

		Polygon polygone = new Polygon(anArray);
		System.out.println(anArray);
		System.out.println(polygone.getVertices());

		System.out.println(polygone.area());
		polygone.setPosition(8, 8);
		polygone.rotate(40);

		Vector2 aVector = new Vector2(3, 3);
		System.out.println(polygone.contains(5, 5));
		
		
		Intersector anIntersector = new Intersector();
		// anIntersector.intersectLinePlane(x, y, z, x2, y2, z2, plane, intersection)

	}

}
