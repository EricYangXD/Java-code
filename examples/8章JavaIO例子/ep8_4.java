import java.io.*;

public class ep8_4 {
	public static void main(String args[]) {
		try {
			InputStreamReader ir;
			BufferedReader in;
			ir = new InputStreamReader(System.in);
			// 从键盘接收了一个字符串的输入，并创建了一个字符输入流的对象
			in = new BufferedReader(ir);
			String s = in.readLine();
			// 从输入流in中读入一行，并将读取的值赋值给字符串变量s
			System.out.println("Input value is: " + s);
			int i = Integer.parseInt(s);// 转换成int型
			i *= 2;
			System.out.println("Input value changed after doubled: " + i);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
