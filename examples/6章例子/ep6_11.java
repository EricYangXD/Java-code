import java.awt.*;
import java.awt.event.*;

public class ep6_11 {
	public static void main(String args[]) {
		Frame f = new Frame("Test");
		Button b = new Button("Press Me!");
		b.addActionListener(new ButtonHandler());
		// ע�������������Ȩ,�÷����Ĳ������¼������߶���,��������Ȩ����ActionEvent����Ϊ��������addActionListener
		f.setLayout(new FlowLayout()); // ���ò��ֹ�����
		f.add(b);
		f.setSize(200, 100);
		f.setVisible(true);
	}
}

class ButtonHandler implements ActionListener {
	// ʵ�ֽӿ�ActionListener�������¼�ActionEvent�Ĵ�����
	public void actionPerformed(ActionEvent e)
	// ϵͳ������ActionEvent�¼����󱻵����������ݸ��÷���
	{
		System.out.println("Action occurred");
		// ���ӿ�ֻ��һ������������¼�����ʱ��ϵͳ���Զ����ñ���������Ҫ���Ĳ����ͰѴ���д����������
	}
}
