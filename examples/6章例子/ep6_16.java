import java.awt.*;
import java.awt.event.*;
class Mypanel1 extends Panel implements ItemListener {
	Checkbox box1, box2, box3;
	CheckboxGroup sex;
	TextArea text;
	Mypanel1(TextArea text) {
		this.text = text;
		sex = new CheckboxGroup();
		box1 = new Checkbox("��", true, sex);
		box2 = new Checkbox("Ů", false, sex);
		box1.addItemListener(this);
		box2.addItemListener(this);
		add(box1);
		add(box2);
	}
	public void itemStateChanged(ItemEvent e) {
		Checkbox box = (Checkbox) e.getSource();
		if (box.getState()) {
			int n = text.getCaretPosition();
			text.insert(box.getLabel(), n);
		}
	}
}
class Mypanel2 extends Panel implements ItemListener {
	Checkbox box1, box2, box3;
	TextArea text;
	Mypanel2(TextArea text) {
		this.text = text;
		box1 = new Checkbox("����");
		box2 = new Checkbox("����");
		box1.addItemListener(this);
		box2.addItemListener(this);
		add(box1);
		add(box2);
	}
	public void itemStateChanged(ItemEvent e) {
		Checkbox box = (Checkbox) e.getItemSelectable();
		if (box.getState()) {
			int n = text.getCaretPosition();
			text.insert(box.getLabel(), n);
		}
	}
}
class WindowBox extends Frame {
	Mypanel1 panel1;
	Mypanel2 panel2;
	TextArea text;
	WindowBox() {
		text = new TextArea();
		panel1 = new Mypanel1(text);
		panel2 = new Mypanel2(text);
		add(panel1, BorderLayout.SOUTH);
		add(panel2, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		setSize(200, 200);
		setVisible(true);
		validate();
	}
}
public class ep6_16 {
	public static void main(String args[]) {
		new WindowBox();
	}
}
