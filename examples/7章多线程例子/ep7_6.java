class ep7_6 {
	public static void main(String args[]) {
		Thread t1 = new MyThread("T1");
		t1.setPriority(Thread.MIN_PRIORITY); // 设置优先级为最小
		t1.start();
		Thread t2 = new MyThread("T2");
		t2.setPriority(Thread.MAX_PRIORITY); // 设置优先级为最大
		t2.start();
		Thread t3 = new MyThread("T3");
		t3.setPriority(Thread.MAX_PRIORITY); // 设置优先级为最大
		t3.start();
	}
}

class MyThread extends Thread {
	String message;

	MyThread(String message) {
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println(message + " " + getPriority());// 获得线程的优先级
	}
}
