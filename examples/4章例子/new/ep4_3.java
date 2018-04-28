class ep4_3_student {
	int num;
	String name;
	ep4_3_student(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println("姓名：" + name + "\n学号：" + num);
	}
}
class ep4_3_univer extends ep4_3_student {
	boolean 婚否;
	ep4_3_univer(int num, String name, boolean b) {
		super(num, name);
		婚否 = b;
		System.out.println("婚否：" + 婚否);
	}
}
class ep4_3 {
	public static void main(String args[]) {
		ep4_3_univer student_one = new ep4_3_univer(1234, "小强", false);
	}
}
