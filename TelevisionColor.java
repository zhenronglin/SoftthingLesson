package learning.lesson3;

import java.awt.geom.Point2D;

public class TelevisionColor extends Television {

	public TelevisionColor(Point2D.Float size, int color) {
		super(size, color);
	}

	@Override
	public void playChanel() {
		System.out.println("�J���[TV�̔ԑg�������B�`�����l����"+getChanel()+";���ʂ�"+getVoice());
	}

}
