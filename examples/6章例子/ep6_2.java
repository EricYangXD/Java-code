import java.awt.*;

public class ep6_2 extends Frame {
	public ep6_2(String str) {
		super(str);
	}

	public static void main(String args[]) {
		ep6_2 fr = new ep6_2("Frame with Panel");
		Panel pan = new Panel();
		fr.setSize(200, 200);
		fr.setBackground(Color.red); // 框架fr的背景颜色设置为红色
		fr.setLayout(null); // 取消布局管理器
		pan.setSize(100, 100);
		pan.setBackground(Color.yellow); // 设置面板pan的背景颜色为黄色
		fr.add(pan); // 用add方法把面板pan添加到框架fr中
		fr.setVisible(true);
	}
}