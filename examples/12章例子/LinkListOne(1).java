import java.util.*;

public class LinkListOne {
	public static void main(String args[]) {
		LinkedList mylist = new LinkedList();
		mylist.add("It");// �����еĵ�һ���ڵ㡣
		mylist.add("is");// �����еĵڶ����ڵ㡣
		mylist.add("a");// �����еĵ������ڵ㡣
		mylist.add("door");// �����еĵ��ĸ��ڵ㡣
		int number = mylist.size();// ��ȡ����ĳ��ȡ�
		for (int i = 0; i < number; i++) {
			String temp = (String) mylist.get(i);
			System.out.println("��" + i + "�ڵ��е�����:" + temp);
		}
	}
}