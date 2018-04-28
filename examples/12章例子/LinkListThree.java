import java.util.*;

class Student {
	String name;
	int number;
	float score;

	Student(String name, int number, float score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
}

public class LinkListThree {
	public static void main(String args[]) {
		LinkedList mylist = new LinkedList();
		Student stu_1 = new Student("赵好民", 9012, 80.0f), stu_2 = new Student(
				"钱小青", 9013, 90.0f), stu_3 = new Student("孙力枚", 9014, 78.0f), stu_4 = new Student(
				"周左右", 9015, 55.0f);
		mylist.add(stu_1);
		mylist.add(stu_2);
		mylist.add(stu_3);
		mylist.add(stu_4);
		Iterator iter = mylist.iterator();
		while (iter.hasNext()) {
			Student te = (Student) iter.next();
			System.out.println(te.name + " " + te.number + "  " + te.score);
		}
	}
}