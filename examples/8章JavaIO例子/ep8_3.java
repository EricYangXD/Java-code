import java.io.*;

public class ep8_3 {
	public static void main(String args[]) {
		RandomAccessFile in_and_out = null;
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			in_and_out = new RandomAccessFile("tom.dat", "rw");
		} catch (Exception e) {
		}
		try {
			for (int i = 0; i < data.length; i++) {
				in_and_out.writeInt(data[i]);
			}
			for (long i = data.length - 1; i >= 0; i--) {
				in_and_out.seek(i * 4);
				// 每隔4个字节往前读取一个整数
				System.out.print("," + in_and_out.readInt());
			}
			in_and_out.close();
		} catch (IOException e) {
		}
	}
}
