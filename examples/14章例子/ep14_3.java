import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class ep14_3 extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		Graphics2D g_2d = (Graphics2D) g;
		Ellipse2D ellipse = new Ellipse2D.Double(20, 30, 100, 50);
		Line2D line = new Line2D.Double(70, 30, 70, 10);
		g_2d.setColor(Color.red);
		g_2d.draw(line);
		for (int i = 1, k = 0; i <= 6; i++) {
			ellipse.setFrame(20 + k, 30, 100 - 2 * k, 50);
			if (i <= 5)
				g_2d.draw(ellipse);
			else
				g_2d.fill(ellipse);
			k = k + 5;
		}
	}
}