import java.util.Scanner;

public class OddDecider4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int replay = 0;
		do {
			System.out.print("输入整数值：");
			input = scanner.nextInt();
			System.out.println("输入数为奇数？" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("继续(1:继续 0:结束)？");
			replay = scanner.nextInt();
		} while (replay == 1);
	}
}
