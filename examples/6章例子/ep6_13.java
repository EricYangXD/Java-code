import java.awt.*;
import java.awt.event.*;

class WindowButton extends Frame implements ActionListener {
	int number;
	Label ��ʾ��;
	TextField �����;
	Button buttonGetNumber, buttonEnter;

	WindowButton(String s) {
		super(s);
		setLayout(new FlowLayout());
		buttonGetNumber = new Button("�õ�һ�������");
		add(buttonGetNumber);
		��ʾ�� = new Label("������Ĳ²⣺", Label.CENTER);
		��ʾ��.setBackground(Color.cyan);
		����� = new TextField("0", 10);
		add(��ʾ��);
		add(�����);
		buttonEnter = new Button("ȷ��");
		add(buttonEnter);
		buttonEnter.addActionListener(this);
		buttonGetNumber.addActionListener(this);
		setBounds(100, 100, 150, 150);
		setVisible(true);
		validate();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonGetNumber) {
			number = (int) (Math.random() * 100) + 1;
			��ʾ��.setText("������Ĳ²⣺");
		} else if (e.getSource() == buttonEnter) {
			int guess = 0;
			try {
				guess = Integer.parseInt(�����.getText());
				if (guess == number) {
					��ʾ��.setText("�¶��ˣ�");
				} else if (guess > number) {
					��ʾ��.setText("�´��ˣ�");
					�����.setText(null);
				} else if (guess < number) {
					��ʾ��.setText("��С�ˣ�");
					�����.setText(null);
				}
			} catch (NumberFormatException event) {
				��ʾ��.setText("�����������ַ�");
			}
		}
	}
}

public class ep6_13 {
	public static void main(String args[]) {
		WindowButton win = new WindowButton("����");
	}
}
