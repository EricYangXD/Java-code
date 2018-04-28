public class XorCode {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("±àÂëÇ°£º" + ch);
		ch = (char) (ch ^ 7);
		System.out.println("±àÂëºó£º" + ch);
		ch = (char) (ch ^ 7);
		System.out.println("½âÂë£º" + ch);
	}
}
