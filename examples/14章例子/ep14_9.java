import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class ep14_9 {
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setSize(170, 170);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		PrintJob p = f.getToolkit().getPrintJob(f, "ok", null);
		Graphics g = p.getGraphics();
		g.drawRect(30, 30, 40, 40);
		g.dispose();
		p.end();
	}
}