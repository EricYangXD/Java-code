package chapter11;

import java.applet.Applet;//Applet�������е�Java applet�ĸ��ࣻ
import java.awt.Graphics;//�ڽ�����ʾ���ʱ����Ҫ�õ���Graphics�Ķ���

public class HelloEducation extends Applet {
	// ����Ա�������ȡ��ΪHelloEducation
	// ���е�applet������Applet�������
	public String s;
	public void init() {
		s = new String("Welcome to Tongfang Education");
		// ����һ���ַ�������
	}
	public void paint(Graphics g) {
		g.drawString(s, 25, 25); // �������������Ϊ��25��25����λ����ʾ�ַ���s
	}
}
