import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class ep10_5 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.javasoft.com/cgi-bin/backwards");
		// 创建一URL对象
		URLConnection con = url.openConnection();
		// 由URL对象获取URLConnection对象
		DataInputStream dis = new DataInputStream(con.getInputStream());
		// 由URLConnection获取输入流，并构造DataInputStream对象
		PrintStream ps = new PrintStream(con.getOutputStream());
		// 由URLConnection获取输出流，并构造PrintStream对象
		String line = dis.readLine(); // 从服务器读入一行
		ps.println("client…"); // 向服务器写出字符串 "client…"
	}
}