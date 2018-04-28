import java.awt.*;
import java.awt.event.*; //事件处理机制，下一节的内容 

public class ep6_9 implements MouseListener {
	CardLayout layout = new CardLayout(); // 实例化一个牌布局管理器对象
	Frame f = new Frame("CardLayout");
	Button page1Button;
	Label page2Label; // Label是标签，实际上是一行字符串
	TextArea page3Text; // 多行多列的文本区域
	Button page3Top;
	Button page3Bottom;

	public static void main(String args[]) {
		new ep6_9().go();
	}

	public void go() {
		f.setLayout(layout); // 设置为牌布局管理器layout
		f.add(page1Button = new Button("Button page"), "page1Button"); 
		// 第二个参数"page1Button"表示的是你对这层牌所取的名字
		page1Button.addMouseListener(this); // 注册监听器
		f.add(page2Label = new Label("Label page"), "page2Label");
		page2Label.addMouseListener(this); // 注册监听器
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		panel.add(page3Text = new TextArea("Composite page"), "Center");
		page3Text.addMouseListener(this);
		panel.add(page3Top = new Button("Top button"), "North");
		page3Top.addMouseListener(this);
		panel.add(page3Bottom = new Button("Bottom button"), "South");
		page3Bottom.addMouseListener(this);
		f.add(panel, "panel");
		f.setSize(200, 200);
		f.setVisible(true);
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
