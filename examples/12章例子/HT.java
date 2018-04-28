import java.util.*;
import java.util.Enumeration;

class Student {
	int english = 0;
	String name, number;

	Student(String na, String nu, int e) {
		english = e;
		name = na;
		number = nu;
	}
}

public class HT {
	public static void main(String args[]) {
		Hashtable hashtable = new Hashtable();
		hashtable.put("199901", new Student("199901", "王小林", 98));
		hashtable.put("199902", new Student("199902", "能林茂", 70));
		hashtable.put("199903", new Student("199903", "多种林", 93));
		hashtable.put("199904", new Student("199904", "围林蛤", 46));
		hashtable.put("199905", new Student("199905", "夹贸林", 77));
		hashtable.put("199906", new Student("199906", "噔林可", 55));
		hashtable.put("199907", new Student("199907", "降王林", 68));
		hashtable.put("199908", new Student("199908", "纠林咯", 76));
		Student stu = (Student) hashtable.get("199902"); // 检索一个元素。
		System.out.println(stu.number + "  " + stu.name + "  " + stu.english);
		hashtable.remove("199906"); // 删除一个元素
		System.out.println("散列表中现在含有：" + hashtable.size() + "个元素");
		Enumeration v_enum = hashtable.elements();
		while (v_enum.hasMoreElements()) // 遍历当前散列表。
		{
			Student s = (Student) v_enum.nextElement();
			System.out.println(s.number + "  " + s.name + "  " + s.english);
		}
	}
}
