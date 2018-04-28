import java.applet.*;
import java.awt.*;

public class ep14_1 extends Applet {
	Font f1 = new Font("隶书", Font.BOLD, 28);
	Font f2 = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 16);

	public void paint(Graphics g) {
		g.setFont(f1);
		g.drawString("计算机科学技术", 10, 30);
		g.setFont(f2);
		char a[] = "I Love You".toCharArray();
		int x = 80, y = 0;
		for (int i = 0; i < a.length; i++) {
			y = x - 15;
			g.drawChars(a, i, 1, x, y);
			x = x + 8;
		}
	}
}