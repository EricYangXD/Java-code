import java.io.*;

class ep8_7 {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		try {
			pis.connect(pos);
			Producer pro = new Producer(pos);
			Consumer con = new Consumer(pis);
			pro.start();
			con.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread {
	private PipedInputStream pis;

	public Consumer(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		try {
			byte[] b = new byte[100];
			int len = pis.read(b);
			System.out.println(new String(b, 0, len));
			pis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Producer extends Thread {
	private PipedOutputStream pos;

	public Producer(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		try {
			pos.write("³úºÌÈÕµ±Îç£¬º¹µÎºÌÏÂÍÁ£¬Ë­ÖªÅÌÖÐ²Í£¬Á£Á£½ÔÐÁ¿à£¡".getBytes());
			pos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
