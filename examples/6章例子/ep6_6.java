import java.awt.*;

class ep6_6 extends Frame {
	static Frame frm = new Frame("流式布局管理器应用");

	public static void main(String args[]) {
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
		Button but = new Button("按钮");
		Label lab = new Label("标签");
		frm.setLayout(flow); // 设置布局为流式布局
		frm.setSize(200, 150);
		frm.setBackground(Color.RED);
		frm.add(but);
		frm.add(lab);
		frm.add(new TextField("流式布局", 18));
		frm.setVisible(true);
	}
}