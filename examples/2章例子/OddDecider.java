import java.util.Scanner;

public class OddDecider {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������: ");
		int number = scanner.nextInt();
		System.out.println("�Ƿ�Ϊ����? " + (number % 2 != 0 ? '��' : '��'));
	}
}
