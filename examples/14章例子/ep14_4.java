import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class ep14_4 extends Applet {
	public void paint(Graphics g) {
		Graphics2D g_2d = (Graphics2D) g;
		BasicStroke bs_1 = new BasicStroke(16, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_BEVEL);
		BasicStroke bs_2 = new BasicStroke(16f, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_MITER);
		BasicStroke bs_3 = new BasicStroke(16f, BasicStroke.CAP_SQUARE,
				BasicStroke.JOIN_ROUND);
		Line2D redLineOne = new Line2D.Double(0, 16, 120, 16);
		Line2D redLineTwo = new Line2D.Double(120, 16, 120, 70);
		g_2d.setStroke(bs_1);
		g_2d.setColor(Color.red);
		g_2d.draw(redLineOne);
		g_2d.draw(redLineTwo);
		g_2d.setColor(Color.blue);
		Line2D blueLineOne = new Line2D.Double(0, 40, 85, 40);
		Line2D blueLineTwo = new Line2D.Double(85, 40, 85, 80);
		g_2d.setStroke(bs_2);
		g_2d.draw(blueLineOne);
		g_2d.draw(blueLineTwo);
		g_2d.setColor(Color.green);
		Line2D greanLineOne = new Line2D.Double(0, 80, 65, 80);
		Line2D greanLineTwo = new Line2D.Double(65, 80, 65, 120);
		g_2d.setStroke(bs_3);
		g_2d.draw(greanLineOne);
		g_2d.draw(greanLineTwo);

	}
}