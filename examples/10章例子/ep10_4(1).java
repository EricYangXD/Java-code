import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ep10_4 {
	public static void main(String[] args) {
		try {
			URL netchinaren = new URL("http://edu.chinaren.com/index.shtml");
			URLConnection tc = netchinaren.openConnection();
		} catch (MalformedURLException e) { // ����URL()����ʧ��
			// ��
		} catch (IOException e) { // openConnection()ʧ��
			// ��
		}
	}
}