import java.util.*;
import java.awt.event.*;
import java.awt.*;

class ��Ŀ implements Comparable {
	String name;
	double time;

	��Ŀ(String ����, double �ݳ�ʱ��) {
		name = ����;
		time = �ݳ�ʱ��;
	}

	public int compareTo(Object b) {
		��Ŀ item = (��Ŀ) b;
		return (int) ((this.time - item.time) * 1000);
	}
}

class Win extends Frame implements ActionListener {
	TreeSet ��Ŀ�嵥 = null;
	TextField �����ı��� = new TextField(10), ʱ���ı��� = new TextField(5),
			ɾ���ı��� = new TextField(5);
	Button b_add = new Button("��ӽ�Ŀ"), b_del = new Button("ɾ����Ŀ"),
			b_show = new Button("��ʾ��Ŀ�嵥");
	TextArea ��ʾ�� = new TextArea();

	Win() {
		��Ŀ�嵥 = new TreeSet(new Comparator() {
			public int compare(Object a, Object b) {
				��Ŀ item_1 = (��Ŀ) a;
				��Ŀ item_2 = (��Ŀ) b;
				return item_1.compareTo(item_2);
			}
		});
		Panel ��Ŀ�������� = new Panel();
		��Ŀ��������.add(new Label("��Ŀ����:"));
		��Ŀ��������.add(�����ı���);
		��Ŀ��������.add(new Label("�ݳ�ʱ��:"));
		��Ŀ��������.add(ʱ���ı���);
		��Ŀ��������.add(new Label("������:"));
		��Ŀ��������.add(b_add);
		��Ŀ��������.add(b_show);
		Panel ��Ŀ��ɾ���� = new Panel();
		��Ŀ��ɾ����.add(new Label("�����ݳ���ʱ��:"));
		��Ŀ��ɾ����.add(ɾ���ı���);
		��Ŀ��ɾ����.add(new Label("���ɾ��:"));
		��Ŀ��ɾ����.add(b_del);
		Panel ��Ŀ����ʾ�� = new Panel();
		��Ŀ����ʾ��.add(��ʾ��);
		��ʾ��.setBackground(Color.pink);
		b_add.addActionListener(this);
		b_del.addActionListener(this);
		b_show.addActionListener(this);
		add(��Ŀ��������, "North");
		add(��Ŀ����ʾ��, "Center");
		add(��Ŀ��ɾ����, "South");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_add) {
			String ���� = null;
			double ʱ�� = 0.0;
			���� = �����ı���.getText();
			try {
				ʱ�� = Double.valueOf(ʱ���ı���.getText()).doubleValue();
			} catch (NumberFormatException ee) {
				ʱ���ı���.setText("���������ʱ���ʵ��");
			}
			��Ŀ programme = new ��Ŀ(����, ʱ��);
			��Ŀ�嵥.add(programme);
			showing();
		} else if (e.getSource() == b_del) {
			��Ŀ ��ɾ����Ŀ = null;
			double time = Double.valueOf(ɾ���ı���.getText()).doubleValue();
			Iterator te = ��Ŀ�嵥.iterator();
			while (te.hasNext()) {
				��Ŀ item = (��Ŀ) te.next();
				if (Math.abs(item.time - time) <= 0.000001d) {
					��ɾ����Ŀ = item;
				}
			}
			if (��ɾ����Ŀ != null)
				��Ŀ�嵥.remove(��ɾ����Ŀ);
			showing();
		} else if (e.getSource() == b_show) {
			showing();
		}
	}

	void showing() {
		��ʾ��.setText(null);
		Iterator iter = ��Ŀ�嵥.iterator();
		while (iter.hasNext()) {
			��Ŀ item = (��Ŀ) iter.next();
			��ʾ��.append("��Ŀ����:" + item.name + "�ݳ�ʱ��: " + item.time);
			��ʾ��.append("\n");
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
