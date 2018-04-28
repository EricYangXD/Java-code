class Student {
	float height, weight;
	String head, ear, hand, foot, mouth;

	void speak(String s) {
		head = "昂着头";
		System.out.println(s);
	}
}

class ep3_6 {
	public static void main(String args[]) {
		Student ZhangSan, LiSi;// 声明对象
		ZhangSan = new Student(); // 为对象分配内存
		LiSi = new Student();
		ZhangSan.height = 1.80f; // 对象给自己的变量赋值
		ZhangSan.head = "大头";
		ZhangSan.ear = "一双大耳朵";
		LiSi.height = 1.62f; // 对象给自己的变量赋值
		LiSi.weight = 1000f;
		LiSi.head = "绣发飘飘";
		System.out.println("ZhangSan的身高：" + ZhangSan.height);
		System.out.println("ZhangSan的头：" + ZhangSan.head);
		System.out.println("LiSi的重量：" + LiSi.weight);
		System.out.println("LiSi的头：" + LiSi.head);
		ZhangSan.speak("我想学外语"); // 对象调用方法
		System.out.println("ZhangSan现在的头：" + ZhangSan.head);
		LiSi.speak("我要考托福"); // 对象调用方法
		System.out.println("LiSi现在的头：" + LiSi.head);
	}
}