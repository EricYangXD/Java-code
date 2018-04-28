interface ep4_6_a { // 定义第1个接口
	double pi = 3.14;
	abstract double area();
}
interface ep4_6_b { // 定义第2个接口
	abstract void setColor(String c);
}
interface ep4_6_c extends ep4_6_a, ep4_6_b { // 接口的多重继承
	abstract void volume();
}
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
class ep4_6 {
	public static void main(String args[]) {
		ep4_6_Cylinder One = new ep4_6_Cylinder(3.0, 5);
		One.setColor("红色");
		One.volume();
	}
}
