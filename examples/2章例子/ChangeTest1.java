public class ChangeTest1 {
	public static void main(String args[]) {
		int i1 = 10;
		float f1 = 3.14f;
		double d1 = 3.1415926;
		// ע���Сд
		Integer I1 = new Integer(i1);// ����integer��
		Float F1 = new Float(f1); // ����float��
		Double D1 = new Double(d1); // ����double��
		// �ֱ���ð�װ���tostring()����ת��Ϊ�ַ���
		String si1 = I1.toString();// ע���Сд��toString�ڴ˲�ת
		String si2 = F1.toString();
		String si3 = D1.toString();
		System.out.println(si1);
		System.out.println(si2);
		System.out.println(si3);

	}
}
