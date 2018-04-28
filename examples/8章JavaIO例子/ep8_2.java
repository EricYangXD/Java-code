import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ep8_2 {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("text.txt");
			System.out.print("content of text is : ");
			int b;
			while ((b = fis.read()) != -1) // 顺序读取文件text里的内容并赋值给整型变量b,直到文件结束为止。
			{
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}