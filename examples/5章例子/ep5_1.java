class ep5_1_a {
	int x = 1;
}

class ep5_1 {
	public static void main(String args[]) {
		ep5_1_a One = new ep5_1_a();
		ep5_1_a Two = new ep5_1_a();
		String a1, a2, a3 = "abc", a4 = "abc";
		a1 = new String("abc");
		a2 = new String("abc");
		System.out.println("a1.equals(a2)��" + (a1.equals(a2)));
		System.out.println("a1==a2��" + (a1 == a2));
		System.out.println("a1.equals(a3)��" + (a1.equals(a3)));
		System.out.println("a1==a3��" + (a1 == a3));
		System.out.println("a3.equals(a4)��" + (a3.equals(a4)));
		System.out.println("a3==a4��" + (a3 == a4));
		System.out.println("One.equals(Two)��" + (One.equals(Two)));
		System.out.println("One==Two��" + (One == Two));
		One = Two;
		System.out.println("��ֵ��One.equals(Two)��" + (One.equals(Two)));
		System.out.println("��ֵ��One==Two��" + (One == Two));
	}
}
