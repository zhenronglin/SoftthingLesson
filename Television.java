package learning.lesson3;

import java.awt.geom.Point2D;

/**
 * ÉeÉåÉrÇÃêªë¢é¿ââ
 * @author sys-user
 *
 */
public abstract class Television {

	private Point2D.Float size;
	private int color;
	private int chanel = 1;
	private int voice = 10;

	public Television(Point2D.Float size, int color) {
		this.size=size;
		this.color=color;
	}

	public Point2D.Float getSize() {
		return size;
	}
	public int getColor() {
		return color;
	}
	public int getChanel() {
		return chanel;
	}
	public int getVoice() {
		return voice;
	}
	public void changeChanel(int chanel) {
		this.chanel = chanel;
	}
	public void changeVoice(int voice) {
		this.voice = voice;
	}
	public abstract void playChanel();
	public void playChanel(int chanel) {
		changeChanel(chanel);
		playChanel();
	}
}
