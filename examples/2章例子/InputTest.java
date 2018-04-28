import javax.swing.*;
public class InputTest {
	public static void main(String args[]) {
		String name = JOptionPane.showInputDialog("please input you name:");
		String input = JOptionPane.showInputDialog("please input you age:");
		int age = Integer.parseInt(input);
		System.out.println("your name:" + name + "  you age:" + age);
		System.exit(0);
	}
}
