abstract class ep4_5_Animal { // 定义抽象类
	String str;
	ep4_5_Animal(String s) { // 定义抽象类的一般方法
		str = s;
	}
	abstract void eat(); // 定义抽象方法
}
class ep4_5_Horse extends ep4_5_Animal { // 定义继承Animal的子类
	String str;
	ep4_5_Horse(String s) {
		super(s); // 调用父类的构造方法
	}
	void eat() { // 重写父类的抽象方法
		System.out.println("马吃草料！");
	}
}
class ep4_5_Dog extends ep4_5_Animal {
	String str;
	ep4_5_Dog(String s) {
		super(s);
	}
	void eat() {
		System.out.println("狗吃骨头！");
	}
}
class ep4_5 {
	public static void main(String args[]) {
		ep4_5_Horse Horse1 = new ep4_5_Horse("马");
		ep4_5_Dog Dog1 = new ep4_5_Dog("狗");
		Horse1.eat();
		Dog1.eat();
	}
}
