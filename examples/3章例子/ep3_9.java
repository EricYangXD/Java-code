class ���� {
	float �ϵ�, ��;
	static float �µ�;

	����(float x, float y, float h) {
		�ϵ� = x;
		�µ� = y;
		�� = h;
	}

	float ��ȡ�µ�() {
		return �µ�;
	}

	void �޸��µ�(float b) {
		�µ� = b;
	}
}

class ep3_9 {
	public static void main(String args[]) {
		���� laderOne = new ����(3.0f, 10.0f, 20), laderTwo = new ����(2.0f, 3.0f, 10);
		����.�µ� = 200; // ͨ���������������
		System.out.println("laderOne���µ�:" + laderOne.��ȡ�µ�());
		System.out.println("laderTwo���µ�:" + laderTwo.��ȡ�µ�());
		laderTwo.�޸��µ�(60); // ͨ��������������
		System.out.println("laderOne���µ�:" + laderOne.��ȡ�µ�());
		System.out.println("laderTwo���µ�:" + laderTwo.��ȡ�µ�());
	}
}