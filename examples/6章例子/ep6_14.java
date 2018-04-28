import java.awt.*;

class WindowText extends Frame {
	TextField text1, text2;

	WindowText(String s) {
		super(s);
		setLayout(new FlowLayout());
		text1 = new TextField("输入密码：", 10);
		text1.setEditable(false);
		text2 = new TextField(10);
		text2.setEchoChar('*');
		add(text1);
		add(text2);
		setBounds(100, 100, 200, 150);
		setVisible(true);
		validate();
	}
}

public class ep6_14 {
	public static void main(String args[]) {
		WindowText win = new WindowText("添加了文本框的窗口");
	}
}
