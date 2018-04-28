import java.io.Serializable;

public class ep8_5 implements Serializable {
	int id; // 学号
	String name; // 姓名
	int age; // 年龄
	String department; // 系别

	public ep8_5(int id, String name, int age, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
}
