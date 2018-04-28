import java.applet.Applet;
import java.awt.*;

public class ep3_15 extends Applet {
	Button redbutton;

	public void init() {
		redbutton = new Button("我是一个红色的按钮");
		redbutton.setBackground(Color.red);
		redbutton.setForeground(Color.white);
		add(redbutton);
	}
}