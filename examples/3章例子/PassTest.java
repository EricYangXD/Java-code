import java.io.*;

public class PassTest {
	float ptValue;

	public void changeInt(int value) {
		value = 55; // 在方法内部对值参数进行了修改
	}

	public void changeObjValue(PassTest ref) {
		ref.ptValue = 99f; // 在方法内部对引用参数进行了修改
	}

	public static void main(String args[]) {
		int val;
		PassTest pt = new PassTest();
		val = 11;
		System.out.println("初始的整型值是: " + val);
		pt.changeInt(val); // 值参数
		System.out.println("改变后整型值是: " + val);
		// 值参数值的修改，没有影响值参数的值
		pt.ptValue = 101f;
		System.out.println("初始的整型值是: " + pt.ptValue);
		pt.changeObjValue(pt); // 引用类型的参数
		System.out.println("改变后整型值是: " + pt.ptValue);
		// 引用参数值的修改，改变了引用参数的值
	}
}