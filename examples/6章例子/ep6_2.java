import java.awt.*;

public class ep6_2 extends Frame {
	public ep6_2(String str) {
		super(str);
	}

	public static void main(String args[]) {
		ep6_2 fr = new ep6_2("Frame with Panel");
		Panel pan = new Panel();
		fr.setSize(200, 200);
		fr.setBackground(Color.red); // ���fr�ı�����ɫ����Ϊ��ɫ
		fr.setLayout(null); // ȡ�����ֹ�����
		pan.setSize(100, 100);
		pan.setBackground(Color.yellow); // �������pan�ı�����ɫΪ��ɫ
		fr.add(pan); // ��add���������pan��ӵ����fr��
		fr.setVisible(true);
	}
}