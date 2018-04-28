import java.text.*;

public class OutputTest1 {
	public static void main(String args[]) {
		double x;
		x = 100.0 / 3.0;
		NumberFormat f1 = NumberFormat.getNumberInstance();// 数字格式
		String s = f1.format(x);
		System.out.println(s);
		NumberFormat f2 = NumberFormat.getPercentInstance();// 百分比格式
		s = f2.format(x);
		System.out.println(s);
		NumberFormat f3 = NumberFormat.getCurrencyInstance();// 货币格式，这跟系统区域有关
		s = f3.format(x);
		System.out.println(s);
	}
}
