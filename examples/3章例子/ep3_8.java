class People {
	String face;

	void setFace(String s) {
		face = s;
	}
}

class C {
	void f(int x, double y, People p) {
		x = x + 1;
		y = y + 1;
		p.setFace("Ц��");
		System.out.println("����x��y��ֵ�ֱ���:" + x + "," + y);
		System.out.println("��������p��face��:" + p.face);
	}
}

public class ep3_8 {
	public static void main(String args[]) {
		int x = 100;
		double y = 100.88;
		People zhang = new People();
		zhang.setFace("�����������");
		C a = new C();
		a.f(x, y, zhang);
		System.out.println("main������x��y��ֵ��Ȼ�ֱ���:" + x + "," + y);
		System.out.println("main�����ж���zhang��face��:" + zhang.face);
	}
}