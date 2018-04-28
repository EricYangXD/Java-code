import java.awt.*;
import java.applet.*;
import java.util.*;

public class ep11_9 extends Applet implements Runnable {
	AudioClip audioClip;
	Thread ShapeThread = null;
	Random RandomNumber = new Random();
	Color ImageColor;

	public void init() {
		audioClip = getAudioClip(getCodeBase(), "Sample.AU");// 创建一个AudioClip对象
	}

	public void start() {
		if (ShapeThread == null) {
			ShapeThread = new Thread(this);
			ShapeThread.start();
		}
	}

	public void run() {
		while (true) {
			switch (RandomNumber.nextInt(5)) { // 把随机数转换为0~4之间的值
			case 0:
				ImageColor = Color.black;
				break;
			case 1:
				ImageColor = Color.blue;
				break;
			case 2:
				ImageColor = Color.cyan;
				break;
			case 3:
				ImageColor = Color.magenta;
				break;
			case 4:
				ImageColor = Color.orange;
				break;
			default:
				ImageColor = Color.red;
			}
			try {
				ShapeThread.sleep(300); // 线程睡眠
			} catch (InterruptedException e) {
				// 忽略异常
				repaint();
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(ImageColor);
		audioClip.play(); // 播放声音
		switch (RandomNumber.nextInt(2)) // 获取随机数与2整除的余数
		{
		case 0:
			g.fillRect(25, 25, 200, 200); // 添充一个矩形
			break;
		default:
			g.fillOval(25, 25, 200, 200); // 添充一个椭圆
			break;
		}
	}
}