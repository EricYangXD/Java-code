class Cubic {
	double getCubic(int n) {
		return 0;
	}
}

abstract class Sqrt {
	public abstract double getSqrt(int x);
}

class ep4_8_A {
	void f(Cubic cubic) {
		double result = cubic.getCubic(3);
		System.out.println(result);
	}
}

public class ep4_8 {
	public static void main(String args[]) {
		ep4_8_A a = new ep4_8_A();
		a.f(new Cubic() {
			double getCubic(int n) {
				return n * n * n;
			}
		});
		Sqrt ss = new Sqrt() {
			public double getSqrt(int x) {
				return Math.sqrt(x);
			}
		};
		double m = ss.getSqrt(5);
		System.out.println(m);
	}
}