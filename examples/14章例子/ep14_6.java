import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class ep14_6 extends Applet {
	public void paint(Graphics g) {
		Graphics2D g_2d = (Graphics2D) g;
		String s = "旋转起来";
		Ellipse2D ellipse = new Ellipse2D.Double(30, 30, 80, 30);
		AffineTransform trans = new AffineTransform();
		for (int i = 1; i <= 24; i++) {
			trans.rotate(15.0 * Math.PI / 180, 70, 45);
			g_2d.setTransform(trans);
			// 现在画的就是旋转后的椭圆样子
			g_2d.draw(ellipse);
		}
		for (int i = 1; i <= 12; i++) {
			trans.rotate(30.0 * Math.PI / 180, 60, 160);
			g_2d.setTransform(trans);
			// 现在画的就是旋转后的字符串
			g_2d.drawString(s, 60, 160);
		}
	}
}