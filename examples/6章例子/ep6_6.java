import java.awt.*;

class ep6_6 extends Frame {
	static Frame frm = new Frame("��ʽ���ֹ�����Ӧ��");

	public static void main(String args[]) {
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
		Button but = new Button("��ť");
		Label lab = new Label("��ǩ");
		frm.setLayout(flow); // ���ò���Ϊ��ʽ����
		frm.setSize(200, 150);
		frm.setBackground(Color.RED);
		frm.add(but);
		frm.add(lab);
		frm.add(new TextField("��ʽ����", 18));
		frm.setVisible(true);
	}
}