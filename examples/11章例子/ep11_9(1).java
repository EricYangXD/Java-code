import java.awt.*;
import java.applet.*;
import java.util.*;

public class ep11_9 extends Applet implements Runnable {
	AudioClip audioClip;
	Thread ShapeThread = null;
	Random RandomNumber = new Random();
	Color ImageColor;

	public void init() {
		audioClip = getAudioClip(getCodeBase(), "Sample.AU");// ����һ��AudioClip����
	}

	public void start() {
		if (ShapeThread == null) {
			ShapeThread = new Thread(this);
			ShapeThread.start();
		}
	}

	public void run() {
		while (true) {
			switch (RandomNumber.nextInt(5)) { // �������ת��Ϊ0~4֮���ֵ
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
				ShapeThread.sleep(300); // �߳�˯��
			} catch (InterruptedException e) {
				// �����쳣
				repaint();
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(ImageColor);
		audioClip.play(); // ��������
		switch (RandomNumber.nextInt(2)) // ��ȡ�������2����������
		{
		case 0:
			g.fillRect(25, 25, 200, 200); // ���һ������
			break;
		default:
			g.fillOval(25, 25, 200, 200); // ���һ����Բ
			break;
		}
	}
}