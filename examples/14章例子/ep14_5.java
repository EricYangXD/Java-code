import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class ep14_5 extends Applet {
	public void paint(Graphics g) {
		Graphics2D g_2d = (Graphics2D) g;
		GradientPaint gradient_1 = new GradientPaint(0, 0, Color.red, 50, 50,
				Color.green, false);
		g_2d.setPaint(gradient_1);
		Rectangle2D rect_1 = new Rectangle2D.Double(0, 0, 50, 50);
		g_2d.fill(rect_1);
		GradientPaint gradient_2 = new GradientPaint(60, 50, Color.white, 150,
				50, Color.red, false);
		g_2d.setPaint(gradient_2);
		Rectangle2D rect_2 = new Rectangle2D.Double(60, 50, 90, 50);
		g_2d.fill(rect_2);
	}
}