import java.awt.*;
import java.awt.event.*;

public class ep6_11 {
	public static void main(String args[]) {
		Frame f = new Frame("Test");
		Button b = new Button("Press Me!");
		b.addActionListener(new ButtonHandler());
		// 注册监听器进行授权,该方法的参数是事件处理者对象,本方法授权处理ActionEvent，因为方法名是addActionListener
		f.setLayout(new FlowLayout()); // 设置布局管理器
		f.add(b);
		f.setSize(200, 100);
		f.setVisible(true);
	}
}

class ButtonHandler implements ActionListener {
	// 实现接口ActionListener才能做事件ActionEvent的处理者
	public void actionPerformed(ActionEvent e)
	// 系统产生的ActionEvent事件对象被当作参数传递给该方法
	{
		System.out.println("Action occurred");
		// 本接口只有一个方法，因此事件发生时，系统会自动调用本方法，需要做的操作就把代码写在则个方法里。
	}
}
