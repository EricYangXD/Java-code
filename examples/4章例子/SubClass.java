class SubClass extends SuperClass {
	int x;

	SubClass() {
		super(); // ���ø���Ĺ��췽��
		x = 5; // super( ) Ҫ���ڷ����еĵ�һ��
		System.out.println("in SubClass :x=" + x);
	}

	void doSomething() {
		super.doSomething(); // ���ø���ķ���
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x=" + super.x + " sub.x=" + x);
	}
}
