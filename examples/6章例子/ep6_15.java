import java.awt.*;
import java.awt.event.*;
import java.util.*;

class WindowTextArea extends Frame implements TextListener, ActionListener {
	TextArea text1, text2;
	Button buttonClear;

	WindowTextArea() {
		setLayout(new FlowLayout());
		text1 = new TextArea(6, 15);
		text2 = new TextArea(6, 15);
		buttonClear = new Button("Çå¿Õ");
		add(text1);
		add(text2);
		add(buttonClear);
		text2.setEditable(false);
		text1.addTextListener(this);
		buttonClear.addActionListener(this);
		setBounds(100, 100, 350, 160);
		setVisible(true);
		validate();
	}

	public void textValueChanged(TextEvent e) {
		String s = text1.getText();
		StringTokenizer fenxi = new StringTokenizer(s, " ,'\n'");
		int n = fenxi.countTokens();
		String a[] = new String[n];
		for (int i = 0; i <= n - 1; i++) {
			String temp = fenxi.nextToken();
			a[i] = temp;
		}
		Arrays.sort(a);
		text2.setText(null);
		for (int i = 0; i < n; i++) {
			text2.append(a[i] + "\n");
		}
	}

	public void actionPerformed(ActionEvent e) {
		text1.setText(null);
	}
}

public class ep6_15 {
	public static void main(String args[]) {
		WindowTextArea win = new WindowTextArea();
	}
}
