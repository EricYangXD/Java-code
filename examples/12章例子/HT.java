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
		hashtable.put("199901", new Student("199901", "��С��", 98));
		hashtable.put("199902", new Student("199902", "����ï", 70));
		hashtable.put("199903", new Student("199903", "������", 93));
		hashtable.put("199904", new Student("199904", "Χ�ָ�", 46));
		hashtable.put("199905", new Student("199905", "��ó��", 77));
		hashtable.put("199906", new Student("199906", "���ֿ�", 55));
		hashtable.put("199907", new Student("199907", "������", 68));
		hashtable.put("199908", new Student("199908", "���ֿ�", 76));
		Student stu = (Student) hashtable.get("199902"); // ����һ��Ԫ�ء�
		System.out.println(stu.number + "  " + stu.name + "  " + stu.english);
		hashtable.remove("199906"); // ɾ��һ��Ԫ��
		System.out.println("ɢ�б������ں��У�" + hashtable.size() + "��Ԫ��");
		Enumeration v_enum = hashtable.elements();
		while (v_enum.hasMoreElements()) // ������ǰɢ�б�
		{
			Student s = (Student) v_enum.nextElement();
			System.out.println(s.number + "  " + s.name + "  " + s.english);
		}
	}
}
