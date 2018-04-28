class MethodOverloading {
	void receive(int i) {
		System.out.println("Receive one int data");
		System.out.println("i=" + i);
	}
	void receive(int x, int y) {
		System.out.println("Receive two int datas");
		System.out.println("x=" + x + " y=" + y);
	}
}

public class MethodOverloadingTest {
	public static void main(String args[]) {
		MethodOverloading mo = new MethodOverloading();
		mo.receive(1);
		mo.receive(2, 3);
	}
}
