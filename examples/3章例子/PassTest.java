import java.io.*;

public class PassTest {
	float ptValue;

	public void changeInt(int value) {
		value = 55; // �ڷ����ڲ���ֵ�����������޸�
	}

	public void changeObjValue(PassTest ref) {
		ref.ptValue = 99f; // �ڷ����ڲ������ò����������޸�
	}

	public static void main(String args[]) {
		int val;
		PassTest pt = new PassTest();
		val = 11;
		System.out.println("��ʼ������ֵ��: " + val);
		pt.changeInt(val); // ֵ����
		System.out.println("�ı������ֵ��: " + val);
		// ֵ����ֵ���޸ģ�û��Ӱ��ֵ������ֵ
		pt.ptValue = 101f;
		System.out.println("��ʼ������ֵ��: " + pt.ptValue);
		pt.changeObjValue(pt); // �������͵Ĳ���
		System.out.println("�ı������ֵ��: " + pt.ptValue);
		// ���ò���ֵ���޸ģ��ı������ò�����ֵ
	}
}