import java.util.*;

class TreeOne {
	public static void main(String args[]) {
		TreeSet mytree = new TreeSet();
		mytree.add("boy");
		mytree.add("zoo");
		mytree.add("apple");
		mytree.add("girl");
		Iterator te = mytree.iterator();
		while (te.hasNext())
			System.out.println("" + te.next());
	}
}