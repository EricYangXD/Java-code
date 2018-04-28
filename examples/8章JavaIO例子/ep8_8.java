import java.io.*;

public class ep8_8 {
	public static void main(String args[]) {
		int n = -1;
		try {
			ByteArrayOutputStream outByte = new ByteArrayOutputStream();
			byte a[] = "你好，内存条!".getBytes();
			outByte.write(a);
			outByte.close();
			ByteArrayInputStream inByte = new ByteArrayInputStream(outByte
					.toByteArray());
			byte tom[] = new byte[8];
			while ((n = inByte.read(tom, 0, 4)) != -1) {
				System.out.print(new String(tom, 0, n));
			}
			inByte.close();
			char jerry[] = new char[8];
			CharArrayWriter outChar = new CharArrayWriter();
			char b[] = "你的价格是多少？".toCharArray();
			outChar.write(b);
			outChar.close();
			CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
			while ((n = inChar.read(jerry, 0, 4)) != -1) {
				System.out.print(new String(jerry, 0, n));
			}
			inChar.close();
		} catch (IOException e) {
		}
	}
}
