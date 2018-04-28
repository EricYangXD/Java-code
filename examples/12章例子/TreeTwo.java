import java.util.*;
import java.awt.*;

class TreeTwo {
	public static void main(String args[]) {
		TreeSet mytree = new TreeSet(new Comparator() {
			public int compare(Object a, Object b) {
				NewStudent stu1 = (NewStudent) a;
				NewStudent stu2 = (NewStudent) b;
				return stu1.compareTo(stu2);
			}
		});
		NewStudent st1, st2, st3, st4;
		st1 = new NewStudent(90, "zhan ying");
		st2 = new NewStudent(66, "wang heng");
		st3 = new NewStudent(86, "Liuh qing");
		st4 = new NewStudent(76, "yage ming");
		mytree.add(st1);
		mytree.add(st2);
		mytree.add(st3);
		mytree.add(st4);
		Iterator te = mytree.iterator();
		while (te.hasNext()) {
			NewStudent stu = (NewStudent) te.next();
			System.out.println("" + stu.name + "  " + stu.english);
		}
	}
}
