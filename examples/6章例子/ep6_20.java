import java.awt.event.*;
import java.awt.*;

class MyDialog extends Dialog implements ActionListener // 建立对话框类
{
	static final int YES = 1, NO = 0;
	int message = -1;
	Button yes, no;

	MyDialog(Frame f, String s, boolean b) // 构造方法
	{
		super(f, s, b);
		yes = new Button("Yes");
		yes.addActionListener(this);
		no = new Button("No");
		no.addActionListener(this);
		setLayout(new FlowLayout());
		add(yes);
		add(no);
		setBounds(60, 60, 100, 100);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				message = -1;
				setVisible(false);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == yes) {
			message = YES;
			setVisible(false);
		} else if (e.getSource() == no) {
			message = NO;
			setVisible(false);
		}
	}

	public int getMessage() {
		return message;
	}
}

class Dwindow extends Frame implements ActionListener {
	TextArea text;
	Button button;
	MyDialog dialog;

	Dwindow(String s) {
		super(s);
		text = new TextArea(5, 22);
		button = new Button("打开对话框");
		button.addActionListener(this);
		setLayout(new FlowLayout());
		add(button);
		add(text);
		dialog = new MyDialog(this, "我有模式", true);
		setBounds(60, 60, 300, 300);
		setVisible(true);
		validate();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			dialog.setVisible(true); // 对话框激活状态时,堵塞下面的语句
			// 对话框消失后下面的语句继续执行：
			if (dialog.getMessage() == MyDialog.YES) // 如果单击了对话框的"yes"按钮
			{
				text.append("\n你单击了对话框的yes按钮");
			} else if (dialog.getMessage() == MyDialog.NO) // 如果单击了对话框的"no"按钮
			{
				text.append("\n你单击了对话框的No按钮");
			}
		}
	}
}

public class ep6_20 {
	public static void main(String args[]) {
		new Dwindow("带对话框的窗口");
	}
}
