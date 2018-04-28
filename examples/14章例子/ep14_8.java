import java.awt.*;
import java.awt.event.*;

class Imagecanvas extends Canvas {
	Toolkit tool;
	Image image;

	Imagecanvas() {
		setSize(200, 200);
		tool = getToolkit();// 得到一个Toolkit对象。
		image = tool.getImage("niu.jpg");// 由tool负责获取图像。
	}

	public void paint(Graphics g) {
		g.drawImage(image, 10, 10, image.getWidth(this), image.getHeight(this),
				this);
	}

	public Image getImage() {
		return image;
	}
}

public class ep14_8 {
	public static void main(String args[]) {
		Imagecanvas canvas = new Imagecanvas();
		Frame frame = new Frame();
		frame.add(canvas, BorderLayout.CENTER);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setIconImage(canvas.getImage());
		frame.validate();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}