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
		A.removeAll(B); // A��ɵ��ø÷���֮ǰ��A������B���ϵĲ
		B.removeAll(tempSet); // B��ɵ��ø÷���֮ǰ��B������tempSet���ϵĲ
		B.addAll(A); // B���������A��B�ĶԳƲ�
		int number = B.size();
		System.out.println("A��B�ĶԳƲ����" + number + "��Ԫ��:");
		Iterator iter = B.iterator();
		while (iter.hasNext()) {
			Integer te = (Integer) iter.next();
			System.out.print(" " + te.intValue());
		}
	}
}
