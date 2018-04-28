import java.awt.event.*;
import java.awt.*;

class MyDialog extends Dialog implements ActionListener // �����Ի�����
{
	static final int YES = 1, NO = 0;
	int message = -1;
	Button yes, no;

	MyDialog(Frame f, String s, boolean b) // ���췽��
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
		button = new Button("�򿪶Ի���");
		button.addActionListener(this);
		setLayout(new FlowLayout());
		add(button);
		add(text);
		dialog = new MyDialog(this, "����ģʽ", true);
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
			dialog.setVisible(true); // �Ի��򼤻�״̬ʱ,������������
			// �Ի�����ʧ�������������ִ�У�
			if (dialog.getMessage() == MyDialog.YES) // ��������˶Ի����"yes"��ť
			{
				text.append("\n�㵥���˶Ի����yes��ť");
			} else if (dialog.getMessage() == MyDialog.NO) // ��������˶Ի����"no"��ť
			{
				text.append("\n�㵥���˶Ի����No��ť");
			}
		}
	}
}

public class ep6_20 {
	public static void main(String args[]) {
		new Dwindow("���Ի���Ĵ���");
	}
}
