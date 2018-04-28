import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Boy extends Applet implements ActionListener {
	Button button;
	URL url;
	TextField text;

	public void init() {
		text = new TextField(18);
		button = new Button("确定");
		add(new Label("输入网址:"));
		add(text);
		add(button);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			try {
				url = new URL(text.getText().trim());
				getAppletContext().showDocument(url);
			} catch (MalformedURLException g) {
				text.setText("不正确的URL:" + url);
			}
		}
	}
}