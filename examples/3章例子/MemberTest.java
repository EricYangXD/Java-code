class Member {
	static int classVar;
	int instanceVar;
	static void setClassVar(int i) {
		classVar = i;
		// instanceVar=i; // �෽�����ܷ���ʵ������
	}
	static int getClassVar() {
		return classVar;
	}
	void setInstanceVar(int i) {
		classVar = i; // ʵ�������������Է����������Ҳ����ʵ������
		instanceVar = i;
	}
	int getInstanceVar() {
		return instanceVar;
	}
}
public class MemberTest {
	public static void main(String args[]) {
		Member m1 = new Member();
		Member m2 = new Member();
		m1.setClassVar(1);
		m2.setClassVar(2);
		System.out.println("m1.classVar=" + m1.getClassVar() + "m2.ClassVar="
				+ m2.getClassVar());
		m1.setInstanceVar(11);
		m2.setInstanceVar(22);
		System.out.println("m1.InstanceVar=" + m1.getInstanceVar()
				+ " m2.InstanceVar=" + m2.getInstanceVar());
	}
}
