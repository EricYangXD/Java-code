package chapter3;

public class ep3_14 {
	public void getPrimnumber(int n) {
		int sum = 0, i, j;
		for (i = 1; i <= n; i++) {
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					break;
			}
			if (j > i / 2)
				System.out.print(" " + i);
		}
	}

	public static void main(String args[]) {
		ep3_14 p = new ep3_14();
		p.getPrimnumber(20);
	}
}