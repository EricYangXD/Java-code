import java.util.Scanner;

public class OddDecider4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int replay = 0;
		do {
			System.out.print("��������ֵ��");
			input = scanner.nextInt();
			System.out.println("������Ϊ������" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("����(1:���� 0:����)��");
			replay = scanner.nextInt();
		} while (replay == 1);
	}
}
