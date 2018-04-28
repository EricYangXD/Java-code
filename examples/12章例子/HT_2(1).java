import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

class 学生 extends JPanel {
	String 学号, 姓名;
	float 分数;

	学生(String 学号, String 姓名, float 分数) {
		this.学号 = 学号;
		this.姓名 = 姓名;
		this.分数 = 分数;
	}
}

class ShowWin extends JFrame implements ActionListener {
	Hashtable hashtable = new Hashtable();
	JTextField 学号文本框 = new JTextField(), 姓名文本框 = new JTextField(),
			分数文本框 = new JTextField(), 查询文本框 = new JTextField();
	JButton b_add = new JButton("添加成绩"), b_show = new JButton("显示成绩");
	JTextField 成绩显示条 = new JTextField();

	ShowWin() {
		Container con = getContentPane();
		JPanel 成绩输入区 = new JPanel();
		成绩输入区.setLayout(new GridLayout(5, 2));
		成绩输入区.add(new Label("成绩输入区:"));
		成绩输入区.add(new Label());
		成绩输入区.add(new Label("考生学号:"));
		成绩输入区.add(学号文本框);
		成绩输入区.add(new JLabel("考生姓名:"));
		成绩输入区.add(姓名文本框);
		成绩输入区.add(new Label("考生成绩:"));
		成绩输入区.add(分数文本框);
		成绩输入区.add(new Label("点击添加:"));
		成绩输入区.add(b_add);
		JPanel 查询显示区 = new JPanel();
		查询显示区.setLayout(new GridLayout(3, 2));
		查询显示区.add(new Label("成绩查询区:"));
		查询显示区.add(new Label());
		查询显示区.add(new Label("输入考生的学号："));
		查询显示区.add(查询文本框);
		查询显示区.add(b_show);
		查询显示区.add(成绩显示条);
		JSplitPane split;
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, 成绩输入区, 查询显示区);
		con.add(split, BorderLayout.CENTER);
		con.add(new Label("成绩输入和查询系统"), BorderLayout.NORTH);
		b_add.addActionListener(this);
		b_show.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_add) {
			String 学号 = null, 姓名 = null;
			float 分数 = 0.0f;
			try {
				学号 = 学号文本框.getText();
				姓名 = 姓名文本框.getText();
			} catch (NullPointerException ee) {
				学号文本框.setText("请输入学号");
				姓名文本框.setText("请输入姓名");
			}
			try {
				分数 = Float.valueOf(分数文本框.getText()).floatValue();
			} catch (NumberFormatException ee) {
				分数文本框.setText("请输入数字字符");
			}
			学生 stu = new 学生(学号, 姓名, 分数);
			hashtable.put(学号, stu);
			try {
				FileOutputStream file = new FileOutputStream("score.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(hashtable);
				out.close();
			} catch (IOException event) {
			}
		} else if (e.getSource() == b_show) {
			String temp = null;
			temp = 查询文本框.getText();
			成绩显示条.setText(null);
			try {
				FileInputStream come_in = new FileInputStream("score.txt");
				ObjectInputStream in = new ObjectInputStream(come_in);
				hashtable = (Hashtable) in.readObject();
				in.close();
			} catch (ClassNotFoundException event) {
			} catch (IOException event) {
				System.out.println("文件无法读出");
			}
			学生 s = (学生) hashtable.get(temp);
			成绩显示条.setText("姓名:" + s.姓名 + "学号:" + s.学号 + "成绩:" + s.分数);
		}
	}
}

public class HT_2 {
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
