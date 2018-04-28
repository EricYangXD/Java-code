import java.io.*;
import java.net.*;
import java.util.*;

public class MulticastServerThread extends QuoteServerThread
// ��QuoteServerThread�̳еõ��µķ������߳���MulticastServerThread
{
	private long FIVE_SECOND = 5000; // ���峣����5����

	public MulticastServerThread(String name) throws IOException {
		super("MulticastServerThread");
		// ���ø��࣬Ҳ����QuoteServerThread�Ĺ��캯��
	}

	public void run() // ��д������߳�����
	{
		while (moreQuotes) {
			// ���ݱ�־�����ж��Ƿ����ѭ��
			try {
				byte[] buf = new byte[256];
				// ����������
				String dString = null;
				if (in == null)
					dString = new Date().toString();
				// �����ʼ����ʱ����ļ�ʧ���ˣ�
				// ��ʹ��������ΪҪ���͵��ַ���
				else
					dString = getNextQuotes();
				// ������ó�Ա�������ļ��ж����ַ���
				buf = dString.getBytes();
				// ��Stringת�����ֽ����飬�Ա㴫��send it
				InetAddress group = InetAddress.getByName("230.0.0.1");
				// �õ�230.0.0.1�ĵ�ַ��Ϣ
				DatagramPacket packet = new DatagramPacket(buf, buf.length,
						group, 4446);
				// ���ݻ��������㲥��ַ���Ͷ˿ںŴ���DatagramPacket����
				socket.send(packet); // ���͸�Packet
				try {
					sleep((long) (Math.random() * FIVE_SECOND));
					// ����ȴ�һ��ʱ�䣬0��5��֮��
				} catch (InterruptedException e) {
				} // �쳣����
			} catch (IOException e) { // �쳣����
				e.printStackTrace(); // ��ӡ����ջ

				moreQuotes = false; // �ý���ѭ����־
			}
		}
		socket.close(); // �رչ㲥�׽ӿ�
	}
}
