import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ѧ������: ");
		int scoreOfStudent = scanner.nextInt();
		System.out.println("�����Ƿ񼰸�? " + (scoreOfStudent >= 60 ? '��' : '��'));
	}
}
