class Point {
	int x, y;

	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class ep3_7 {
	public static void main(String args[]) {
		Point p1, p2; // ��������p1��p2
		p1 = new Point(10, 10); // Ϊ��������ڴ棬ʹ�� new �����еĹ��췽��
		p2 = new Point(23, 35); // Ϊ��������ڴ棬ʹ�� new �����еĹ��췽��
		System.out.println(p1 == p2);
		p1 = p2;
		System.out.println(p1 == p2);
	}
}