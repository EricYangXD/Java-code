import java.awt.*;

public class ep6_1 extends Frame {
	public static void main(String args[]) {
		ep6_1 fr = new ep6_1("Hello Out There!"); // ���췽��
		fr.setSize(200, 200); // ����Frame�Ĵ�С��ȱʡΪ��0��0��
		fr.setBackground(Color.red); // ����Frame�ı�����ȱʡΪ��ɫ
		fr.setVisible(true);// ����FrameΪ�ɼ���ȱʡΪ���ɼ�
	}

	public ep6_1(String str) {
		super(str); // ���ø���Ĺ��췽��
	}
}
