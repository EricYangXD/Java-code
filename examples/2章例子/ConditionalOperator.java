import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入学生分数: ");
		int scoreOfStudent = scanner.nextInt();
		System.out.println("该生是否及格? " + (scoreOfStudent >= 60 ? '是' : '否'));
	}
}
