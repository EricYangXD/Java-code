import java.awt.*;

public class ep6_4 {
	private Frame f;
	private Button b1;
	private Button b2;

	public static void main(String args[]) {
		ep6_4 that = new ep6_4();
		that.go();
	}

	public void go() {
		f = new Frame("GUI example");
		f.setLayout(new FlowLayout());
		// ���ò��ֹ�����ΪFlowLayout
		b1 = new Button("Press Me");
		// ��ť����ʾ�ַ�"Press Me"
		b2 = new Button("Don't Press Me");
		f.add(b1);
		f.add(b2);
		f.pack();
		// �������У��ô��ھ���С��С���ո��ܹ�����סb1��b2������ť
		f.setVisible(true);
	}
}
