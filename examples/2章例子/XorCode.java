public class XorCode {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("����ǰ��" + ch);
		ch = (char) (ch ^ 7);
		System.out.println("�����" + ch);
		ch = (char) (ch ^ 7);
		System.out.println("���룺" + ch);
	}
}
