import java.util.*;

class StudentKey implements Comparable {
	double d = 0;

	StudentKey(double d) {
		this.d = d;
	}

	public int compareTo(Object b) {
		StudentKey st = (StudentKey) b;
		if ((this.d - st.d) == 0) {
			return -1;
		} else {
			return (int) ((this.d - st.d) * 1000);
		}
	}
}

class Student1 {
	String name = null;
	double math, english;

	Student1(String s, double m, double e) {
		name = s;
		math = m;
		english = e;
	}
}

public class ep12_12 {
	public static void main(String args[]) {
		TreeMap treemap = new TreeMap(new Comparator() {
			public int compare(Object a, Object b) {
				StudentKey key1 = (StudentKey) a;
				StudentKey key2 = (StudentKey) b;
				return key1.compareTo(key2);
			}
		});
		String str[] = { "赵一", "钱二", "孙三", "李四" };
		double math[] = { 89, 45, 78, 76 };
		double english[] = { 67, 66, 90, 56 };
		Student1 student[] = new Student1[4];
		for (int k = 0; k < student.length; k++) {
			student[k] = new Student1(str[k], math[k], english[k]);
		}
		StudentKey key[] = new StudentKey[4];
		for (int k = 0; k < key.length; k++) {
			key[k] = new StudentKey(student[k].math);
		}
		for (int k = 0; k < student.length; k++) {
			treemap.put(key[k], student[k]);
		}
		int number = treemap.size();
		System.out.println("树映射中有" + number + "个对象,按数学成绩排序:");
		Collection collection = treemap.values();
		Iterator iter = collection.iterator();
		while (iter.hasNext()) {
			Student1 stu = (Student1) iter.next();
			System.out.println("姓名 " + stu.name + " 数学 " + stu.math);
		}
		treemap.clear();
		for (int k = 0; k < key.length; k++) {
			key[k] = new StudentKey(student[k].english);
		}
		for (int k = 0; k < student.length; k++) {
			treemap.put(key[k], student[k]);
		}
		number = treemap.size();
		System.out.println("树映射中有" + number + "个对象:按英语成绩排序:");
		collection = treemap.values();
		iter = collection.iterator();
		while (iter.hasNext()) {
			Student1 stu = (Student1) iter.next();
			System.out.println("姓名 " + stu.name + " 英语 " + stu.english);
		}
	}
}
