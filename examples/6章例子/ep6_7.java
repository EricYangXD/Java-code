import java.awt.*;

public class ep6_7 {
	public static void main(String args[]) {
		Frame f = new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.add("North", new Button("North"));
		// 第一个参数表示把按钮添加到容器的North区域
		f.add("South", new Button("South"));
		// 第一个参数表示把按钮添加到容器的South区域
		f.add("East", new Button("East"));
		// 第一个参数表示把按钮添加到容器的East区域
		f.add("West", new Button("West"));
		// 第一个参数表示把按钮添加到容器的West区域
		f.add("Center", new Button("Center"));
		// 第一个参数表示把按钮添加到容器的Center区域
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
