import java.util.*;

public class ep12_2 {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add("is");
		list.add("a");
		int number = list.size();
		System.out.println("现在链表中有" + number + "个节点：");
		for (int i = 0; i < number; i++) {
			String temp = (String) list.get(i);
			System.out.println("第" + i + "节点中的数据：" + temp);
		}
		list.add(0, "It");
		number = list.size();
		list.add(number - 1, "door");
		number = list.size();
		System.out.println("现在链表中有" + number + "个节点：");

		for (int i = 0; i < number; i++) {
			String temp = (String) list.get(i);
			System.out.println("第" + i + "节点中的数据：" + temp);
		}
		list.remove(0);
		list.remove(1);
		list.set(0, "open");
		number = list.size();
		System.out.println("现在链表中有" + number + "个节点：");
		for (int i = 0; i < number; i++) {
			String temp = (String) list.get(i);
			System.out.println("第" + i + "节点中的数据：" + temp);
		}
	}
}