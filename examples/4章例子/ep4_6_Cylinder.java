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