import java.util.Random;

class RandInt {
	private Random r = null;

	public RandInt() {
		r = new Random();
	}

	public int getint() {
		return r.nextInt();
	}
}

class RandDouble {
	private Random r = null;

	public RandDouble() {
		r = new Random();
	}

	public double getDouble() {
		return r.nextDouble();
	}
}

public class ep5_17 {
	public static void main(String[] s) {
		RandInt rInt = new RandInt();
		System.out.println("产生3个随机生成的整型数字");
		for (int i = 0; i < 3; i++) {
			System.out.println(rInt.getint() + "");
		}
		RandDouble rDouble = new RandDouble();
		System.out.println("产生3个随机生成的Double类型数字");
		for (int i = 0; i < 3; i++) {
			System.out.println(rDouble.getDouble() + "");
		}
	}
}
