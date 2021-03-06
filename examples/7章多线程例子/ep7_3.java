import java.awt.Graphics;
import java.util.Date;

public class ep7_3 extends java.applet.Applet implements Runnable {// 实现接口
	Thread clockThread;

	public void start() {
		if (clockThread == null) {
			clockThread = new Thread(this, "Clock");
			clockThread.start(); // 启动线程
		}
	}

	public void run() { // run()方法中是线程执行的内容
		while (clockThread != null) {
			repaint(); // 刷新显示画面
			try {
				clockThread.sleep(1000);// 睡眠1秒，即每隔1秒执行一次
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {
		Date now = new Date(); // 获得当前的时间对象
		g.drawString(now.getHours() + ":" + now.getMinutes() + ":"
				+ now.getSeconds(), 5, 10);// 显示当前时间
	}

	public void stop() {
		clockThread.stop();
		clockThread = null;
	}
}
