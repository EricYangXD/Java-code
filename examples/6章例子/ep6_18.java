import java.awt.*;
import java.awt.event.*;

class WindowList extends Frame implements ItemListener, ActionListener {
	List list1, list2;
	TextArea text1, text2;
	int index = 0;

	WindowList() {
		setLayout(new FlowLayout());
		list1 = new List(3, false);
		list2 = new List(3, false);
		text1 = new TextArea(2, 20);
		text2 = new TextArea(2, 20);
		list1.add("计算1+2+...");
		list1.add("计算1*1+2*2+...");
		list1.add("计算1*1*1+2*2*2+...");
		for (int i = 1; i <= 100; i++) {
			list2.add("前" + i + "项和");
		}
		add(list1);
		add(list2);
		add(text1);
		add(text2);
		list1.addItemListener(this);
		list2.addActionListener(this);
		setSize(400, 200);
		setVisible(true);
		validate();
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getItemSelectable() == list1) {
			text1.setText(list1.getSelectedItem());
			index = list1.getSelectedIndex();
		}
	}

	public void actionPerformed(ActionEvent e) {
		int n = list2.getSelectedIndex(), sum = 0;
		String name = list2.getSelectedItem();
		switch (index) {
		case 0:
			for (int i = 1; i <= n + 1; i++) {
				sum = sum + i;
			}
			break;
		case 1:
			for (int i = 1; i <= n + 1; i++) {
				sum = sum + i * i;
			}
			break;
		case 2:
			for (int i = 1; i <= n + 1; i++) {
				sum = sum + i * i * i;
			}
			break;
		default:
			sum = -100;
		}
		text2.setText(name + "等于" + sum);
	}
}

public class ep6_18 {
	public static void main(String args[]) {
		new WindowList();
	}
}
