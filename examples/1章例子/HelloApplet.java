import java.awt.Graphics; //�ڽ�����ʾ���ʱ����Ҫ�õ���Graphics�Ķ���
import java.applet.Applet; //Applet�������е�Java Applet�ĸ��ࣻ
/*
 * �������ȡ��ΪHelloApplet��
 * ��Ϊ���е�applet������Applet������ࡣ
 */

public class HelloApplet extends Applet {
	public String s;

	public void init() {
		s = new String("��ӭѧϰJava Applet!"); // ����һ���ַ�������
	}

	public void paint(Graphics g) {
		g.drawString(s, 25, 25); // �������������Ϊ��25��25����λ����ʾ�ַ���s
	}
}
