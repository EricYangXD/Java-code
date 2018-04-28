public class IncrementDecrement2 {
	public static void main(String[] args) {
		int i = 0;
		int number = 0;
		number = i++; // 相当于number = i; i = i + 1;
		System.out.println(number);
		number = i--; // 相当于 number = i; i = i - 1;
		System.out.println(number);
	}
}
