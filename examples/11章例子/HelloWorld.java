import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet // 继承Appelet类，这是Appelet Java程序的特点
{
	public void paint(Graphics g) {
		g.drawString("Hello World!", 5, 35);
	}
}