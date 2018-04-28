class ep5_2_a {
	protected String name;

	public ep5_2_a(String a) {
		name = a;
	}
}

class ep5_2 {
	public static void main(String args[]) {
		ep5_2_a One = new ep5_2_a("abc");
		Class b = One.getClass(); // 用变量b调用getClass()方法
		System.out.println("对象One所属的类为：" + b);
	}
}