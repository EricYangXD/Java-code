class Variable {
	int x = 0, y = 0, z = 0;  //��ĳ�Ա����
	void init(int x, int y) {
		this.x = x;
		this.y = y;
		int z = 5; 		//�ֲ�����
		System.out.println("** ��ʼ���� **");
		System.out.println("x=" + x + " y=" + y + " z=" + z);
	}
}
public class VariableTest {
	public static void main(String args[]) {
		Variable v = new Variable();
		System.out.println("** ��ʼ��֮ǰ **");
		System.out.println("x=" + v.x + " y=" + v.y + " z=" + v.z);
		v.init(20, 30);
		System.out.println("** ��ʼ��֮�� **");
		System.out.println("x=" + v.x + " y=" + v.y + " z=" + v.z);
	}
}
