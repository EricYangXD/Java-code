import java.awt.*;
import java.awt.event.*;

class WindoTen extends Frame implements ActionListener {
	Panel p;
	ScrollPane scrollpane;

	WindoTen() {
		setLayout(new FlowLayout());
		p = new Panel();
		scrollpane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		p.add(new Button("one"));
		p.add(new Button("two"));
		p.add(new Button("three"));
		p.add(new Button("four"));
		scrollpane.add(p);
		add(scrollpane);
		setBounds(60, 60, 200, 200);
		setVisible(true);
		validate();
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

public class ep6_3 {
	public static void main(String args[]) {
		new WindoTen();
	}
}
