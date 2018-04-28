import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

class 商品 extends Panel {
	String 代号, 名称;
	int 库存;
	float 单价;

	商品(String 代号, String 名称, int 库存, float 单价) {
		this.代号 = 代号;
		this.名称 = 名称;
		this.库存 = 库存;
		this.单价 = 单价;
	}
}

class ShowWin extends JFrame implements ActionListener {

	LinkedList goods_list = null;
	JTextField 代号文本框 = new JTextField(), 名称文本框 = new JTextField(),
			库存文本框 = new JTextField(), 单价文本框 = new JTextField(),
			删除文本框 = new JTextField();
	JButton b_add = new JButton("添加商品"), b_del = new JButton("删除商品"),
			b_show = new JButton("显示商品清单");
	JTextArea 显示区 = new JTextArea();

	ShowWin() {
		goods_list = new LinkedList();
		Container con = getContentPane();
		JScrollPane pane = new JScrollPane(显示区);
		显示区.setEditable(false);
		JPanel save = new JPanel();
		save.setLayout(new GridLayout(5, 2));
		save.add(new Label("输入代号:"));
		save.add(代号文本框);
		save.add(new Label("输入名称:"));
		save.add(名称文本框);
		save.add(new Label("输入库存:"));
		save.add(库存文本框);
		save.add(new Label("输入单价:"));
		save.add(单价文本框);
		save.add(new Label("点击添加:"));
		save.add(b_add);
		JPanel del = new JPanel();
		del.setLayout(new GridLayout(2, 2));
		del.add(new Label("输入删除的代号:"));
		del.add(删除文本框);
		del.add(new Label("点击删除:"));
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
			daihao = 代号文本框.getText();
			mingcheng = 名称文本框.getText();
			kucun = Integer.parseInt(库存文本框.getText());
			danjia = Float.valueOf(单价文本框.getText()).floatValue();
			商品 goods = new 商品(daihao, mingcheng, kucun, danjia);
			goods_list.add(goods);
			try {
				FileOutputStream file = new FileOutputStream("goods.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(goods_list);
				out.close();
			} catch (IOException event) {
			}
		} else if (e.getSource() == b_del) {
			String daihao = 删除文本框.getText();
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
				商品 temp = (商品) goods_list.get(i);
				if (temp.代号.equals(daihao)) {
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
			显示区.setText(null);
			try {
				FileInputStream come_in = new FileInputStream("goods.txt");
				ObjectInputStream in = new ObjectInputStream(come_in);
				goods_list = (LinkedList) in.readObject();
			} catch (ClassNotFoundException event) {
			} catch (IOException event) {
			}
			Iterator iter = goods_list.iterator();
			while (iter.hasNext()) {
				商品 te = (商品) iter.next();
				显示区.append("商品代号:" + te.代号 + "     ");
				显示区.append("商品名称:" + te.名称 + "     ");
				显示区.append("商品库存:" + te.库存 + "     ");
				显示区.append("商品单价:" + te.单价 + "     ");
				显示区.append("\n");
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
