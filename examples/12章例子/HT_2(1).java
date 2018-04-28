import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

class ѧ�� extends JPanel {
	String ѧ��, ����;
	float ����;

	ѧ��(String ѧ��, String ����, float ����) {
		this.ѧ�� = ѧ��;
		this.���� = ����;
		this.���� = ����;
	}
}

class ShowWin extends JFrame implements ActionListener {
	Hashtable hashtable = new Hashtable();
	JTextField ѧ���ı��� = new JTextField(), �����ı��� = new JTextField(),
			�����ı��� = new JTextField(), ��ѯ�ı��� = new JTextField();
	JButton b_add = new JButton("��ӳɼ�"), b_show = new JButton("��ʾ�ɼ�");
	JTextField �ɼ���ʾ�� = new JTextField();

	ShowWin() {
		Container con = getContentPane();
		JPanel �ɼ������� = new JPanel();
		�ɼ�������.setLayout(new GridLayout(5, 2));
		�ɼ�������.add(new Label("�ɼ�������:"));
		�ɼ�������.add(new Label());
		�ɼ�������.add(new Label("����ѧ��:"));
		�ɼ�������.add(ѧ���ı���);
		�ɼ�������.add(new JLabel("��������:"));
		�ɼ�������.add(�����ı���);
		�ɼ�������.add(new Label("�����ɼ�:"));
		�ɼ�������.add(�����ı���);
		�ɼ�������.add(new Label("������:"));
		�ɼ�������.add(b_add);
		JPanel ��ѯ��ʾ�� = new JPanel();
		��ѯ��ʾ��.setLayout(new GridLayout(3, 2));
		��ѯ��ʾ��.add(new Label("�ɼ���ѯ��:"));
		��ѯ��ʾ��.add(new Label());
		��ѯ��ʾ��.add(new Label("���뿼����ѧ�ţ�"));
		��ѯ��ʾ��.add(��ѯ�ı���);
		��ѯ��ʾ��.add(b_show);
		��ѯ��ʾ��.add(�ɼ���ʾ��);
		JSplitPane split;
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, �ɼ�������, ��ѯ��ʾ��);
		con.add(split, BorderLayout.CENTER);
		con.add(new Label("�ɼ�����Ͳ�ѯϵͳ"), BorderLayout.NORTH);
		b_add.addActionListener(this);
		b_show.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_add) {
			String ѧ�� = null, ���� = null;
			float ���� = 0.0f;
			try {
				ѧ�� = ѧ���ı���.getText();
				���� = �����ı���.getText();
			} catch (NullPointerException ee) {
				ѧ���ı���.setText("������ѧ��");
				�����ı���.setText("����������");
			}
			try {
				���� = Float.valueOf(�����ı���.getText()).floatValue();
			} catch (NumberFormatException ee) {
				�����ı���.setText("�����������ַ�");
			}
			ѧ�� stu = new ѧ��(ѧ��, ����, ����);
			hashtable.put(ѧ��, stu);
			try {
				FileOutputStream file = new FileOutputStream("score.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(hashtable);
				out.close();
			} catch (IOException event) {
			}
		} else if (e.getSource() == b_show) {
			String temp = null;
			temp = ��ѯ�ı���.getText();
			�ɼ���ʾ��.setText(null);
			try {
				FileInputStream come_in = new FileInputStream("score.txt");
				ObjectInputStream in = new ObjectInputStream(come_in);
				hashtable = (Hashtable) in.readObject();
				in.close();
			} catch (ClassNotFoundException event) {
			} catch (IOException event) {
				System.out.println("�ļ��޷�����");
			}
			ѧ�� s = (ѧ��) hashtable.get(temp);
			�ɼ���ʾ��.setText("����:" + s.���� + "ѧ��:" + s.ѧ�� + "�ɼ�:" + s.����);
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
