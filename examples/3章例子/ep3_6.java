class Student {
	float height, weight;
	String head, ear, hand, foot, mouth;

	void speak(String s) {
		head = "����ͷ";
		System.out.println(s);
	}
}

class ep3_6 {
	public static void main(String args[]) {
		Student ZhangSan, LiSi;// ��������
		ZhangSan = new Student(); // Ϊ��������ڴ�
		LiSi = new Student();
		ZhangSan.height = 1.80f; // ������Լ��ı�����ֵ
		ZhangSan.head = "��ͷ";
		ZhangSan.ear = "һ˫�����";
		LiSi.height = 1.62f; // ������Լ��ı�����ֵ
		LiSi.weight = 1000f;
		LiSi.head = "�巢ƮƮ";
		System.out.println("ZhangSan����ߣ�" + ZhangSan.height);
		System.out.println("ZhangSan��ͷ��" + ZhangSan.head);
		System.out.println("LiSi��������" + LiSi.weight);
		System.out.println("LiSi��ͷ��" + LiSi.head);
		ZhangSan.speak("����ѧ����"); // ������÷���
		System.out.println("ZhangSan���ڵ�ͷ��" + ZhangSan.head);
		LiSi.speak("��Ҫ���и�"); // ������÷���
		System.out.println("LiSi���ڵ�ͷ��" + LiSi.head);
	}
}