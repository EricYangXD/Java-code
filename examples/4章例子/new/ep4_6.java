interface ep4_6_a { // �����1���ӿ�
	double pi = 3.14;
	abstract double area();
}
interface ep4_6_b { // �����2���ӿ�
	abstract void setColor(String c);
}
interface ep4_6_c extends ep4_6_a, ep4_6_b { // �ӿڵĶ��ؼ̳�
	abstract void volume();
}
class ep4_6_Cylinder implements ep4_6_c { // �Ե�3���ӿ�ʵ����
	double radius;
	int height;
	String color;
	public ep4_6_Cylinder(double r, int h) {
		radius = r;
		height = h;
	}
	public double area() { // ʵ�ֵ�1���ӿڵķ���
		return radius * radius * pi;
	}
	public void setColor(String c) { // ʵ�ֵ�2���ӿڵķ���
		color = c;
		System.out.println("��״����ɫ��" + color);
	}
	public void volume() { // ʵ�ֵ�3���ӿڵķ���
		System.out.println("Բ����������" + area() * height);
	}
}
class ep4_6 {
	public static void main(String args[]) {
		ep4_6_Cylinder One = new ep4_6_Cylinder(3.0, 5);
		One.setColor("��ɫ");
		One.volume();
	}
}
