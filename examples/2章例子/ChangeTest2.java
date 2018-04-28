public class ChangeTest2 {
	public static void main(String args[]) {
		int i;
		char c1 = 'A';
		i = c1;
		System.out.println(i);
		char c2 = (char) (i + 2); // 此处要强制转换
		System.out.println(c2);
	}
}
