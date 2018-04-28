import java.io.*;
import java.net.*;
import java.util.*;

//�������߳� 
public class QuoteServerThread extends Thread {
	protected DatagramSocket socket = null;
	// ��¼�ͱ������������DatagramSocket����
	protected BufferedReader in = null;
	// �������ļ���һ��Reader
	protected boolean moreQuotes = true;

	// ��־�������Ƿ��������

	public QuoteServerThread() throws IOException {
		// �޲����Ĺ��캯��
		this("QuoteServerThread");
		// ��QuoteServerThreadΪĬ��ֵ���ô������Ĺ��캯��
	}

	public QuoteServerThread(String name) throws IOException {
		super(name); // ���ø���Ĺ��캯��
		socket = new DatagramSocket(4445);
		// �ڶ˿�4445�������ݱ��׽���
		try {
			in = new BufferedReader(new FileReader(" one-liners.txt"));
			// ��һ���ļ���������Ӧ��BufferReader����
		} catch (FileNotFoundException e) { // �쳣����
			System.err
					.println("Could not open quote file. Serving time instead.");
			// ��ӡ������Ϣ
		}
	}

	public void run() // �߳�����
	{
		while (moreQuotes) {
			try {
				byte[] buf = new byte[256]; // ����������
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				// �ɻ���������DatagramPacket����
				socket.receive(packet); // �������ݱ�
				String dString = null;
				if (in == null)
					dString = new Date().toString();
				// �����ʼ����ʱ����ļ�ʧ���ˣ�
				// ��ʹ��������ΪҪ���͵��ַ���
				else
					dString = getNextQuotes();
				// ������ó�Ա�������ļ��ж����ַ���
				buf = dString.getBytes();
				// ��Stringת�����ֽ����飬�Ա㴫��
				InetAddress address = packet.getAddress();
				// ��Client�˴�����Packet�еõ�Client��ַ
				int port = packet.getPort(); // �Ͷ˿ں�
				packet = new DatagramPacket(buf, buf.length, address, port);
				// ���ݿͻ�����Ϣ����DatagramPacket
				socket.send(packet); // �������ݱ�
			} catch (IOException e) { // �쳣����
				e.printStackTrace(); // ��ӡ����ջ
				moreQuotes = false; // ��־������false���Խ���ѭ��
			}
		}
		socket.close(); // �ر����ݱ��׽���
	}

	protected String getNextQuotes() {
		// ��Ա���������ļ��ж�����
		String returnValue = null;
		try {
			if ((returnValue = in.readLine()) == null) {
				// ���ļ��ж�һ�У�����������ļ�β
				in.close(); // �ر�������
				moreQuotes = false;
				// ��־������false���Խ���ѭ��
				returnValue = "No more quotes. Goodbye.";
				// �÷���ֵ
			} // ���򷵻��ַ�����Ϊ���ļ��������ַ���
		} catch (IOException e) { // �쳣����
			returnValue = "IOException occurred in server";
			// ���쳣����ֵ
		}
		return returnValue; // �����ַ���
	}
}
