import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class ep10_5 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.javasoft.com/cgi-bin/backwards");
		// ����һURL����
		URLConnection con = url.openConnection();
		// ��URL�����ȡURLConnection����
		DataInputStream dis = new DataInputStream(con.getInputStream());
		// ��URLConnection��ȡ��������������DataInputStream����
		PrintStream ps = new PrintStream(con.getOutputStream());
		// ��URLConnection��ȡ�������������PrintStream����
		String line = dis.readLine(); // �ӷ���������һ��
		ps.println("client��"); // �������д���ַ��� "client��"
	}
}