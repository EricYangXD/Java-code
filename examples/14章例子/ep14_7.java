import java.applet.*;
import java.awt.*;

public class ep14_7 extends Applet {
	Image img;

	public void start() {
		img = getImage(getCodeBase(), "14_7.jpg");
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, 200, 150, this);
	}
}