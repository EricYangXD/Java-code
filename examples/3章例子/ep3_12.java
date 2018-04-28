class ep3_12_a {
	static final double pi = 3.1415926; // 声明静态常量

	public final void f() { // 声明最终方法
		System.out.println("pi=" + pi);
	}
}

class ep3_12_b extends ep3_12_a {
	private int num = 100;

	public void f() { // 出错，不可覆盖父类的最终方法
		System.out.println("num=" + num);
	}
}

class ep3_12 {
	public static void main(String args[]) {
		ep3_12_b One = new ep3_12_b();
		One.f();
	}
}