package learning.lesson3;

import java.awt.geom.Point2D;

public class TelevisionRun {

	public static void main(String[] args) {
		Point2D.Float size1 = new Point2D.Float(25, 25);
		int color1 = 5;
		TelevisionMono tvMono1 = new TelevisionMono(size1, color1);
		tvMono1.playChanel();
		tvMono1.playChanel(7);
		TelevisionColor tvColor1 = new TelevisionColor(size1, color1);
		tvColor1.playChanel();
		tvColor1.playChanel(8);
	}

}
