import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
	public static void main(String[] args) throws Exception {
		// 声明抛出所有例外
		URL tirc = new URL("http://www.btbu.edu.cn/");
		// 构建一URL对象
		BufferedReader in = new BufferedReader(new InputStreamReader(tirc
				.openStream()));
		// 使用openStream得到一输入流并由此构造一个BufferedReader对象
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			// 从输入流不断的读数据，直到读完为止
			System.out.println(inputLine); // 把读入的数据打印到屏幕上
		in.close(); // 关闭输入流
	}
}