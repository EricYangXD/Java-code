import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

class ��Ʒ extends Panel {
	String ����, ����;
	int ���;
	float ����;

	��Ʒ(String ����, String ����, int ���, float ����) {
		this.���� = ����;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
	}
}

class ShowWin extends JFrame implements ActionListener {

	LinkedList goods_list = null;
	JTextField �����ı��� = new JTextField(), �����ı��� = new JTextField(),
			����ı��� = new JTextField(), �����ı��� = new JTextField(),
			ɾ���ı��� = new JTextField();
	JButton b_add = new JButton("�����Ʒ"), b_del = new JButton("ɾ����Ʒ"),
			b_show = new JButton("��ʾ��Ʒ�嵥");
	JTextArea ��ʾ�� = new JTextArea();

	ShowWin() {
		goods_list = new LinkedList();
		Container con = getContentPane();
		JScrollPane pane = new JScrollPane(��ʾ��);
		��ʾ��.setEditable(false);
		JPanel save = new JPanel();
		save.setLayout(new GridLayout(5, 2));
		save.add(new Label("�������:"));
		save.add(�����ı���);
		save.add(new Label("��������:"));
		save.add(�����ı���);
		save.add(new Label("������:"));
		save.add(����ı���);
		save.add(new Label("���뵥��:"));
		save.add(�����ı���);
		save.add(new Label("������:"));
		save.add(b_add);
		JPanel del = new JPanel();
		del.setLayout(new GridLayout(2, 2));
		del.add(new Label("����ɾ���Ĵ���:"));
		del.add(ɾ���ı���);
		del.add(new Label("���ɾ��:"));
		del.add(b_del);
		JPanel show = new JPanel();
		show.setLayout(new BorderLayout());
		show.add(pane, BorderLayout.CENTER);
		show.add(b_show, BorderLayout.SOUTH);
		JSplitPane split_one, split_two;
		split_one = new JSplitPane(JSplitPane.VERTICAL_SPLIT, save, del);
		split_two = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,
				split_one, show);
		con.add(split_two, BorderLayout.CENTER);
		b_add.addActionListener(this);
		b_del.addActionListener(this);
		b_show.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_add) {
			String daihao = null, mingcheng = null;
			int kucun = 0;
			float danjia = 0.0f;
			daihao = �����ı���.getText();
			mingcheng = �����ı���.getText();
			kucun = Integer.parseInt(����ı���.getText());
			danjia = Float.valueOf(�����ı���.getText()).floatValue();
			��Ʒ goods = new ��Ʒ(daihao, mingcheng, kucun, danjia);
			goods_list.add(goods);
			try {
				FileOutputStream file = new FileOutputStream("goods.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(goods_list);
				out.close();
			} catch (IOException event) {
			}
		} else if (e.getSource() == b_del) {
			String daihao = ɾ���ı���.getText();
			try {
				FileInputStream come_in = new FileInputStream("goods.txt");
				ObjectInputStream in = new ObjectInputStream(come_in);
				goods_list = (LinkedList) in.readObject();
				in.close();
			} catch (ClassNotFoundException event) {
			} catch (IOException event) {
			}
			int number = goods_list.size();
			for (int i = 0; i < number; i++) {
				��Ʒ temp = (��Ʒ) goods_list.get(i);
				if (temp.����.equals(daihao)) {
					goods_list.remove(i);
				}
				try {
					FileOutputStream file = new FileOutputStream("goods.txt");
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(goods_list);
					out.close();
				} catch (IOException event) {
				}
			}
		} else if (e.getSource() == b_show) {
			��ʾ��.setText(null);
			try {
				FileInputStream come_in = new FileInputStream("goods.txt");
				ObjectInputStream in = new ObjectInputStream(come_in);
				goods_list = (LinkedList) in.readObject();
			} catch (ClassNotFoundException event) {
			} catch (IOException event) {
			}
			Iterator iter = goods_list.iterator();
			while (iter.hasNext()) {
				��Ʒ te = (��Ʒ) iter.next();
				��ʾ��.append("��Ʒ����:" + te.���� + "     ");
				��ʾ��.append("��Ʒ����:" + te.���� + "     ");
				��ʾ��.append("��Ʒ���:" + te.��� + "     ");
				��ʾ��.append("��Ʒ����:" + te.���� + "     ");
				��ʾ��.append("\n");
			}
		}
	}
}

public class LinkListFour {
	public static void main(String args[]) {
		ShowWin win = new ShowWin();
		win.setSize(100, 100);
		win.setVisible(true);
		win.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
