class ep3_12_a {
	static final double pi = 3.1415926; // ������̬����

	public final void f() { // �������շ���
		System.out.println("pi=" + pi);
	}
}

class ep3_12_b extends ep3_12_a {
	private int num = 100;

	public void f() { // �������ɸ��Ǹ�������շ���
		System.out.println("num=" + num);
	}
}

class ep3_12 {
	public static void main(String args[]) {
		ep3_12_b One = new ep3_12_b();
		One.f();
	}
}