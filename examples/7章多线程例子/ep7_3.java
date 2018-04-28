import java.awt.Graphics;
import java.util.Date;

public class ep7_3 extends java.applet.Applet implements Runnable {// ʵ�ֽӿ�
	Thread clockThread;

	public void start() {
		if (clockThread == null) {
			clockThread = new Thread(this, "Clock");
			clockThread.start(); // �����߳�
		}
	}

	public void run() { // run()���������߳�ִ�е�����
		while (clockThread != null) {
			repaint(); // ˢ����ʾ����
			try {
				clockThread.sleep(1000);// ˯��1�룬��ÿ��1��ִ��һ��
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {
		Date now = new Date(); // ��õ�ǰ��ʱ�����
		g.drawString(now.getHours() + ":" + now.getMinutes() + ":"
				+ now.getSeconds(), 5, 10);// ��ʾ��ǰʱ��
	}

	public void stop() {
		clockThread.stop();
		clockThread = null;
	}
}
