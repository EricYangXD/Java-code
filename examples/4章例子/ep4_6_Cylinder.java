class ep4_6_Cylinder implements ep4_6_c { // 以第3个接口实现类
	double radius;
	int height;
	String color;

	public ep4_6_Cylinder(double r, int h) {
		radius = r;
		height = h;
	}

	public double area() { // 实现第1个接口的方法
		return radius * radius * pi;
	}

	public void setColor(String c) { // 实现第2个接口的方法
		color = c;
		System.out.println("形状的颜色：" + color);
	}

	public void volume() { // 实现第3个接口的方法
		System.out.println("圆柱体的体积：" + area() * height);
	}
}