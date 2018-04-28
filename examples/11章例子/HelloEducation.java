package chapter11;

import java.applet.Applet;//Applet类是所有的Java applet的父类；
import java.awt.Graphics;//在进行显示输出时，需要用到类Graphics的对象；

public class HelloEducation extends Applet {
	// 程序员给这个类取名为HelloEducation
	// 所有的applet程序都是Applet类的子类
	public String s;
	public void init() {
		s = new String("Welcome to Tongfang Education");
		// 生成一个字符串对象
	}
	public void paint(Graphics g) {
		g.drawString(s, 25, 25); // 在浏览器中坐标为（25，25）的位置显示字符串s
	}
}
