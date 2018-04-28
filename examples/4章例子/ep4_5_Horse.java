class ep4_5_Horse extends ep4_5_Animal { // 定义继承Animal的子类
	String str;

	ep4_5_Horse(String s) {
		super(s); // 调用父类的构造方法
	}

	void eat() { // 重写父类的抽象方法
		System.out.println("马吃草料！");
	}
}