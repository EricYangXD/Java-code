import java.text.*;

public class OutputTest1 {
	public static void main(String args[]) {
		double x;
		x = 100.0 / 3.0;
		NumberFormat f1 = NumberFormat.getNumberInstance();// ���ָ�ʽ
		String s = f1.format(x);
		System.out.println(s);
		NumberFormat f2 = NumberFormat.getPercentInstance();// �ٷֱȸ�ʽ
		s = f2.format(x);
		System.out.println(s);
		NumberFormat f3 = NumberFormat.getCurrencyInstance();// ���Ҹ�ʽ�����ϵͳ�����й�
		s = f3.format(x);
		System.out.println(s);
	}
}
