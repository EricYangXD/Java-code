import java.util.*;
import java.awt.*;
import java.applet.*;
import java.text.*;

public class AnimatorDemo extends Applet implements Runnable {
	Thread timer; // 用于显示时钟的线程
	int lastxs, lastys, lastxm, lastym, lastxh, lastyh;
	SimpleDateFormat formatter; // 格式化时间显示
	String lastdate; // 保存当前时间的字符串
	Font clockFaceFont; // 设置显示时钟里面的数字的字体
	Date currentDate; // 显示当前时间
	Color handColor; // 用于显示时针、分针和表盘的颜色
	Color numberColor; // 用于显示秒针和数字的颜色

	public void init() {
		int x, y;
		lastxs = lastys = lastxm = lastym = lastxh = lastyh = 0;
		formatter = new SimpleDateFormat("yyyy EEE MMM dd hh:mm:ss ");
		currentDate = new Date();
		lastdate = formatter.format(currentDate);
		clockFaceFont = new Font("Serif", Font.PLAIN, 14);
		handColor = Color.blue;
		numberColor = Color.darkGray;
		try {
			setBackground(new Color(Integer.parseInt(getParameter("bgcolor"),
					16)));
		} catch (Exception E) {
		}
		try {
			handColor = new Color(Integer
					.parseInt(getParameter("fgcolor1"), 16));
		} catch (Exception E) {
		}
		try {
			numberColor = new Color(Integer.parseInt(getParameter("fgcolor2"),
					16));
		} catch (Exception E) {
		}
		resize(300, 300); // 设置时钟窗口大小
	}

	// 计算四分之一的圆弧
	public void plotpoints(int x0, int y0, int x, int y, Graphics g) {
		g.drawLine(x0 + x, y0 + y, x0 + x, y0 + y);
		g.drawLine(x0 + y, y0 + x, x0 + y, y0 + x);
		g.drawLine(x0 + y, y0 - x, x0 + y, y0 - x);
		g.drawLine(x0 + x, y0 - y, x0 + x, y0 - y);
		g.drawLine(x0 - x, y0 - y, x0 - x, y0 - y);
		g.drawLine(x0 - y, y0 - x, x0 - y, y0 - x);
		g.drawLine(x0 - y, y0 + x, x0 - y, y0 + x);
		g.drawLine(x0 - x, y0 + y, x0 - x, y0 + y);
	}

	// 用Bresenham算法来画圆，其中(x0,y0)是圆的中心，r为圆半径
	public void circle(int x0, int y0, int r, Graphics g) {
		int x, y;
		float d;
		x = 0;
		y = r;
		d = 5 / 4 - r;
		plotpoints(x0, y0, x, y, g);
		while (y > x) {
			if (d < 0) {
				d = d + 2 * x + 3;
				x++;
			} else {
				d = d + 2 * (x - y) + 5;
				x++;
				y--;
			}
			plotpoints(x0, y0, x, y, g);
		}
	}

	public void paint(Graphics g) {
		int xh, yh, xm, ym, xs, ys, s = 0, m = 10, h = 10, xcenter, ycenter;
		String today;
		currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("s", Locale
				.getDefault());
		try {
			s = Integer.parseInt(formatter.format(currentDate));
		} catch (NumberFormatException n) {
			s = 0;
		}
		formatter.applyPattern("m");
		try {
			m = Integer.parseInt(formatter.format(currentDate));
		} catch (NumberFormatException n) {
			m = 10;
		}
		formatter.applyPattern("h");
		try {
			h = Integer.parseInt(formatter.format(currentDate));
		} catch (NumberFormatException n) {
			h = 10;
		}
		formatter.applyPattern("EEE MMM dd HH:mm:ss yyyy");
		today = formatter.format(currentDate);
		// 设置时钟的表盘的中心点为(80,55)
		xcenter = 80;
		ycenter = 55;
		// a= s* pi/2 - pi/2 (to switch 0,0 from 3:00 to 12:00)
		// x = r(cos a) + xcenter, y = r(sin a) + ycenter
		xs = (int) (Math.cos(s * 3.14f / 30 - 3.14f / 2) * 45 + xcenter);
		ys = (int) (Math.sin(s * 3.14f / 30 - 3.14f / 2) * 45 + ycenter);
		xm = (int) (Math.cos(m * 3.14f / 30 - 3.14f / 2) * 40 + xcenter);
		ym = (int) (Math.sin(m * 3.14f / 30 - 3.14f / 2) * 40 + ycenter);
		xh = (int) (Math.cos((h * 30 + m / 2) * 3.14f / 180 - 3.14f / 2) * 30 + xcenter);
		yh = (int) (Math.sin((h * 30 + m / 2) * 3.14f / 180 - 3.14f / 2) * 30 + ycenter);
		// 画时钟最外面的圆盘其中心在(xcenter,ycenter)半径为50
		g.setFont(clockFaceFont);
		g.setColor(handColor);
		circle(xcenter, ycenter, 50, g);
		// 画时钟表盘里的数字
		g.setColor(numberColor);
		g.drawString("9", xcenter - 45, ycenter + 3);
		g.drawString("3", xcenter + 40, ycenter + 3);
		g.drawString("12", xcenter - 5, ycenter - 37);
		g.drawString("6", xcenter - 3, ycenter + 45);
		// 如果必要的话抹去然后重画
		g.setColor(getBackground());
		if (xs != lastxs || ys != lastys) {
			g.drawLine(xcenter, ycenter, lastxs, lastys);
			g.drawString(lastdate, 5, 125);
		}
		if (xm != lastxm || ym != lastym) {
			g.drawLine(xcenter, ycenter - 1, lastxm, lastym);
			g.drawLine(xcenter - 1, ycenter, lastxm, lastym);
		}
		if (xh != lastxh || yh != lastyh) {
			g.drawLine(xcenter, ycenter - 1, lastxh, lastyh);
			g.drawLine(xcenter - 1, ycenter, lastxh, lastyh);
		}
		g.setColor(numberColor);
		g.drawString("", 5, 125);
		g.drawString(today, 5, 125);
		g.drawLine(xcenter, ycenter, xs, ys);
		g.setColor(handColor);
		g.drawLine(xcenter, ycenter - 1, xm, ym);
		g.drawLine(xcenter - 1, ycenter, xm, ym);
		g.drawLine(xcenter, ycenter - 1, xh, yh);
		g.drawLine(xcenter - 1, ycenter, xh, yh);
		lastxs = xs;
		lastys = ys;
		lastxm = xm;
		lastym = ym;
		lastxh = xh;
		lastyh = yh;
		lastdate = today;
		currentDate = null;
	}

	// applet的启动方法
	public void start() {
		timer = new Thread(this);
		timer.start();
	}

	// applet的停止方法
	public void stop() {
		timer = null;
	}

	// 线程的run方法
	public void run() {
		Thread me = Thread.currentThread();
		while (timer == me) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
			}
			repaint();
		}
	}

	// 注意：这里重写了update()方法，只是调用了paint()方法来消除闪烁现象
	public void update(Graphics g) {
		paint(g);
	}
}
