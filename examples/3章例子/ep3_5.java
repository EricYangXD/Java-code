class Student {
	float height, weight;
	String head, ear, hand, foot, mouth;
	void speak(String s) {
		System.out.println(s);
	}
}
class ep3_5 {
	public static void main(String args[]) {
		Student ZhangSan; // 声明对象
		// 为对象分配内存，使用new 运算符和默认的构造方法
		ZhangSan = new Student();
	}
}
