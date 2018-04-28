import java.applet.*;
import java.awt.*;

public class ep14_2 extends Applet {
	public void paint(Graphics g) {
		g.drawOval(0, 0, 100, 100);
		g.drawRoundRect(110, 10, 90, 60, 50, 30);
		g.setColor(Color.black);
		g.fillArc(0, 0, 100, 100, -90, -180);
		g.setColor(Color.white);
		g.fillArc(0, 0, 100, 100, -90, 180);
		g.fillArc(25, 0, 50, 50, -90, -180);
		g.setColor(Color.black);
		g.fillOval(40, 15, 20, 20);
		g.fillArc(25, 50, 50, 50, 90, -180);
		g.setColor(Color.white);
		g.fillOval(40, 65, 20, 20);
		g.setColor(Color.black);
		int px[] = { 50, 70, 170 };
		int py[] = { 120, 150, 80 };
		g.drawPolygon(px, py, 3);
	}
}