import java.util.*;
import java.awt.event.*;
import java.awt.*;

class 节目 implements Comparable {
	String name;
	double time;

	节目(String 名称, double 演出时间) {
		name = 名称;
		time = 演出时间;
	}

	public int compareTo(Object b) {
		节目 item = (节目) b;
		return (int) ((this.time - item.time) * 1000);
	}
}

class Win extends Frame implements ActionListener {
	TreeSet 节目清单 = null;
	TextField 名称文本框 = new TextField(10), 时间文本框 = new TextField(5),
			删除文本框 = new TextField(5);
	Button b_add = new Button("添加节目"), b_del = new Button("删除节目"),
			b_show = new Button("显示节目清单");
	TextArea 显示区 = new TextArea();

	Win() {
		节目清单 = new TreeSet(new Comparator() {
			public int compare(Object a, Object b) {
				节目 item_1 = (节目) a;
				节目 item_2 = (节目) b;
				return item_1.compareTo(item_2);
			}
		});
		Panel 节目单输入区 = new Panel();
		节目单输入区.add(new Label("节目名称:"));
		节目单输入区.add(名称文本框);
		节目单输入区.add(new Label("演出时间:"));
		节目单输入区.add(时间文本框);
		节目单输入区.add(new Label("点击添加:"));
		节目单输入区.add(b_add);
		节目单输入区.add(b_show);
		Panel 节目单删除区 = new Panel();
		节目单删除区.add(new Label("输入演出的时间:"));
		节目单删除区.add(删除文本框);
		节目单删除区.add(new Label("点击删除:"));
		节目单删除区.add(b_del);
		Panel 节目单显示区 = new Panel();
		节目单显示区.add(显示区);
		显示区.setBackground(Color.pink);
		b_add.addActionListener(this);
		b_del.addActionListener(this);
		b_show.addActionListener(this);
		add(节目单输入区, "North");
		add(节目单显示区, "Center");
		add(节目单删除区, "South");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_add) {
			String 名称 = null;
			double 时间 = 0.0;
			名称 = 名称文本框.getText();
			try {
				时间 = Double.valueOf(时间文本框.getText()).doubleValue();
			} catch (NumberFormatException ee) {
				时间文本框.setText("请输入代表时间的实数");
			}
			节目 programme = new 节目(名称, 时间);
			节目清单.add(programme);
			showing();
		} else if (e.getSource() == b_del) {
			节目 待删除节目 = null;
			double time = Double.valueOf(删除文本框.getText()).doubleValue();
			Iterator te = 节目清单.iterator();
			while (te.hasNext()) {
				节目 item = (节目) te.next();
				if (Math.abs(item.time - time) <= 0.000001d) {
					待删除节目 = item;
				}
			}
			if (待删除节目 != null)
				节目清单.remove(待删除节目);
			showing();
		} else if (e.getSource() == b_show) {
			showing();
		}
	}

	void showing() {
		显示区.setText(null);
		Iterator iter = 节目清单.iterator();
		while (iter.hasNext()) {
			节目 item = (节目) iter.next();
			显示区.append("节目名称:" + item.name + "演出时间: " + item.time);
			显示区.append("\n");
		}
	}
}

public class Tree_3 {
	public static void main(String args[]) {
		Win win = new Win();
		win.setSize(500, 250);
		win.setVisible(true);
		win.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
