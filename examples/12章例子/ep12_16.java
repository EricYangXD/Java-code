import java.util.*;

public class ep12_16 {
	public static void main(String args[]) {
		Integer one = new Integer(1), two = new Integer(2), three = new Integer(
				3), four = new Integer(4), five = new Integer(5), six = new Integer(
				6);
		HashSet A = new HashSet(), B = new HashSet(), tempSet = new HashSet();
		A.add(one);
		A.add(two);
		A.add(three);
		A.add(four);
		B.add(one);
		B.add(two);
		B.add(five);
		B.add(six);
		tempSet = (HashSet) A.clone();
		A.removeAll(B); // A变成调用该方法之前的A集合与B集合的差集
		B.removeAll(tempSet); // B变成调用该方法之前的B集合与tempSet集合的差集
		B.addAll(A); // B就是最初的A与B的对称差
		int number = B.size();
		System.out.println("A和B的对称差集合有" + number + "个元素:");
		Iterator iter = B.iterator();
		while (iter.hasNext()) {
			Integer te = (Integer) iter.next();
			System.out.print(" " + te.intValue());
		}
	}
}
