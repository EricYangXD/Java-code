import java.applet.Applet;
import java.awt.*;

public class ep3_15 extends Applet {
	Button redbutton;

	public void init() {
		redbutton = new Button("����һ����ɫ�İ�ť");
		redbutton.setBackground(Color.red);
		redbutton.setForeground(Color.white);
		add(redbutton);
	}
}