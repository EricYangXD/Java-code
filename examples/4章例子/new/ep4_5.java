abstract class ep4_5_Animal { // ���������
	String str;
	ep4_5_Animal(String s) { // ����������һ�㷽��
		str = s;
	}
	abstract void eat(); // ������󷽷�
}
class ep4_5_Horse extends ep4_5_Animal { // ����̳�Animal������
	String str;
	ep4_5_Horse(String s) {
		super(s); // ���ø���Ĺ��췽��
	}
	void eat() { // ��д����ĳ��󷽷�
		System.out.println("��Բ��ϣ�");
	}
}
class ep4_5_Dog extends ep4_5_Animal {
	String str;
	ep4_5_Dog(String s) {
		super(s);
	}
	void eat() {
		System.out.println("���Թ�ͷ��");
	}
}
class ep4_5 {
	public static void main(String args[]) {
		ep4_5_Horse Horse1 = new ep4_5_Horse("��");
		ep4_5_Dog Dog1 = new ep4_5_Dog("��");
		Horse1.eat();
		Dog1.eat();
	}
}
