import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
	public static void main(String[] args) throws Exception {
		// �����׳���������
		URL tirc = new URL("http://www.btbu.edu.cn/");
		// ����һURL����
		BufferedReader in = new BufferedReader(new InputStreamReader(tirc
				.openStream()));
		// ʹ��openStream�õ�һ���������ɴ˹���һ��BufferedReader����
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			// �����������ϵĶ����ݣ�ֱ������Ϊֹ
			System.out.println(inputLine); // �Ѷ�������ݴ�ӡ����Ļ��
		in.close(); // �ر�������
	}
}