import java.awt.*;

public class ep6_10 {
	private Frame f;
	private Panel p;
	private Button bw, bc;
	private Button bfile, bhelp;

	public static void main(String args[]) {
		ep6_10 gui = new ep6_10();
		gui.go();
	}

	public void go() {
		f = new Frame("GUI example 3");
		bw = new Button("West");
		bc = new Button("Work space region");
		f.add(bw, "West");
		f.add(bc, "Center");
		p = new Panel();
		f.add(p, "North");
		bfile = new Button("File");
		bhelp = new Button("Help");
		p.add(bfile);
		p.add(bhelp);
		f.pack();
		f.setVisible(true);
	}
}
