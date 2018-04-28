import java.awt.*;
import java.awt.event.*; //�¼�������ƣ���һ�ڵ����� 

public class ep6_9 implements MouseListener {
	CardLayout layout = new CardLayout(); // ʵ����һ���Ʋ��ֹ���������
	Frame f = new Frame("CardLayout");
	Button page1Button;
	Label page2Label; // Label�Ǳ�ǩ��ʵ������һ���ַ���
	TextArea page3Text; // ���ж��е��ı�����
	Button page3Top;
	Button page3Bottom;

	public static void main(String args[]) {
		new ep6_9().go();
	}

	public void go() {
		f.setLayout(layout); // ����Ϊ�Ʋ��ֹ�����layout
		f.add(page1Button = new Button("Button page"), "page1Button"); 
		// �ڶ�������"page1Button"��ʾ��������������ȡ������
		page1Button.addMouseListener(this); // ע�������
		f.add(page2Label = new Label("Label page"), "page2Label");
		page2Label.addMouseListener(this); // ע�������
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
