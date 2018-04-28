class ep4_2_a {
	int n;
	float f() {
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
class ep4_2_b extends ep4_2_a {
	int n;
	float f() {
		float c;
		super.n = n;
		c = super.f();
		return c / n;
	}
	float g() {
		float c;
		c = super.f();
		return c / 2;
	}
}
class ep4_2 {
	public static void main(String args[]) {
		ep4_2_b aver = new ep4_2_b();
		aver.n = 100;
		System.out.println("result_one=" + aver.f());
		System.out.println("result_two=" + aver.g());
	}
}
