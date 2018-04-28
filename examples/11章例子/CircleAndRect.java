import java.applet.*;
import java.awt.*;

public class CircleAndRect extends Applet implements Runnable {
	Thread left, right;
	Graphics mypen;
	int x, y;

	public void init() {
		left = new Thread(this);
		right = new Thread(this);
		x = 10;
		y = 10;
		mypen = getGraphics();
	}

	public void start() {
		try {
			left.start();
			right.start();
		} catch (Exception e) {
		}
	}

	public void run() {
		while (true) {
			if (Thread.currentThread() == left) {
				x = x + 1;
				if (x > 240)
					x = 10;
				mypen.setColor(Color.blue);
				mypen.clearRect(10, 10, 300, 40);
				mypen.drawRect(10 + x, 10, 40, 40);
				try {
					left.sleep(60);
				} catch (InterruptedException e) {
				}
			} else if (Thread.currentThread() == right) {
				y = y + 1;
				if (y > 240)
					y = 10;
				mypen.setColor(Color.red);
				mypen.clearRect(10, 90, 300, 40);
				mypen.drawOval(10 + y, 90, 40, 40);
				try {
					right.sleep(60);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}