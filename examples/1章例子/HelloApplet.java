import java.awt.Graphics; //在进行显示输出时，需要用到类Graphics的对象；
import java.applet.Applet; //Applet类是所有的Java Applet的父类；
/*
 * 给这个类取名为HelloApplet，
 * 因为所有的applet程序都是Applet类的子类。
 */

public class HelloApplet extends Applet {
	public String s;

	public void init() {
		s = new String("欢迎学习Java Applet!"); // 生成一个字符串对象
	}

	public void paint(Graphics g) {
		g.drawString(s, 25, 25); // 在浏览器中坐标为（25，25）的位置显示字符串s
	}
}
