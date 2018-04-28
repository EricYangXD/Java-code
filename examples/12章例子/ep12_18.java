import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ep12_18 extends Applet implements MouseMotionListener,
		MouseListener {
	int x = -1, y = -1;
	Vector v = null;
	int n = 1;

	public void init() {
		setBackground(Color.green);
		addMouseMotionListener(this);
		addMouseListener(this);
		v = new Vector();
	}

	public void paint(Graphics g) {
		if (x != -1 && y != -1) {
			n = v.size();
			for (int i = 0; i < n - 1; i++) {
				Point p1 = (Point) v.elementAt(i);
				Point p2 = (Point) v.elementAt(i + 1);
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
		}
	}

	public void mouseDragged(MouseEvent e) {
		x = (int) e.getX();
		y = (int) e.getY();
		Point p = new Point(x, y);
		v.addElement(p);
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		v.removeAllElements();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void update(Graphics g) {
		paint(g);
	}
}
