class 梯形 {
	float 上底, 高;
	static float 下底;

	梯形(float x, float y, float h) {
		上底 = x;
		下底 = y;
		高 = h;
	}

	float 获取下底() {
		return 下底;
	}

	void 修改下底(float b) {
		下底 = b;
	}
}

class ep3_9 {
	public static void main(String args[]) {
		梯形 laderOne = new 梯形(3.0f, 10.0f, 20), laderTwo = new 梯形(2.0f, 3.0f, 10);
		梯形.下底 = 200; // 通过类名操作类变量
		System.out.println("laderOne的下底:" + laderOne.获取下底());
		System.out.println("laderTwo的下底:" + laderTwo.获取下底());
		laderTwo.修改下底(60); // 通过对象操作类变量
		System.out.println("laderOne的下底:" + laderOne.获取下底());
		System.out.println("laderTwo的下底:" + laderTwo.获取下底());
	}
}