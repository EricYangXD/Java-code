import java.io.*;
import java.net.*;

public class QuoteClient {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			// ���������ʱ��û�и���Server�����֣���ô�����˳�
			System.out.println("Usage:java QuoteClient ");
			// ��ӡ������Ϣ
			return; // ����
		}
		DatagramSocket socket = new DatagramSocket();
		// �������ݱ��׽���
		byte[] buf = new byte[256]; // ����������
		InetAddress address = InetAddress.getByName(args[0]);
		// �������и����ĵ�һ������Ĭ��ΪServer�����֣�ͨ�����õ�Server��IP��Ϣ
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
				4445);
		// ����DatagramPacket����
		socket.send(packet); // ����
		packet = new DatagramPacket(buf, buf.length);
		// �����µ�DatagramPacket���������������ݱ�
		socket.receive(packet); // ����
		String received = new String(packet.getData());
		// ���ݽ��յ����ֽ�����������Ӧ���ַ���
		System.out.println("Quote of the Moment:" + received);
		// ��ӡ���ɵ��ַ���

		socket.close(); // �ر��׽ӿ�
	}
}
