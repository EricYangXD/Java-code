import java.awt.*;

public class ep6_7 {
	public static void main(String args[]) {
		Frame f = new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.add("North", new Button("North"));
		// ��һ��������ʾ�Ѱ�ť��ӵ�������North����
		f.add("South", new Button("South"));
		// ��һ��������ʾ�Ѱ�ť��ӵ�������South����
		f.add("East", new Button("East"));
		// ��һ��������ʾ�Ѱ�ť��ӵ�������East����
		f.add("West", new Button("West"));
		// ��һ��������ʾ�Ѱ�ť��ӵ�������West����
		f.add("Center", new Button("Center"));
		// ��һ��������ʾ�Ѱ�ť��ӵ�������Center����
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
