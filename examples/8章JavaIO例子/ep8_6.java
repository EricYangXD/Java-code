import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ep8_6 {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		ep8_5 stu = new ep8_5(981036, "Liu Ming", 18, "CSD");
		FileOutputStream fo;
		fo = new FileOutputStream("data.ser");
		// 保存对象的状态
		ObjectOutputStream so = new ObjectOutputStream(fo);
		try {
			so.writeObject(stu);
			so.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		FileInputStream fi = new FileInputStream("data.ser");
		ObjectInputStream si = new ObjectInputStream(fi);
		// 恢复对象的状态
		try {
			stu = (ep8_5) si.readObject();
			System.out.println(stu.id);
			System.out.println(stu.name);
			si.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
