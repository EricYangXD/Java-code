public class ep7_8 {
	public static void main(String[] args) {
		Thread thread = new Thread(
		// �����������д��
				new Runnable() {
					public void run() {
						while (true) {
							System.out.print("T");
						}
					}
				});
		// ����ΪDaemon�߳�
		thread.setDaemon(true);
		thread.start();
	}
}
