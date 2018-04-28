public class ep7_5 {
	public static void main(String args[]) {
		ThreadJoin a = new ThreadJoin();
		a.customer.start();
		a.tvMaker.start();
	}
}

class ThreadJoin implements Runnable {
	TV tv;
	Thread customer, tvMaker;

	ThreadJoin() {
		customer = new Thread(this);
		tvMaker = new Thread(this);
		customer.setName("�˿�");
		tvMaker.setName("�������쳧");
	}

	public void run() {
		if (Thread.currentThread() == customer) {
			System.out.println(customer.getName() + "��" + tvMaker.getName()
					+ "��������");
			try {
				tvMaker.join(); // �߳�customer��ʼ�ȴ�tvMaker����
			} catch (InterruptedException e) {
			}
			System.out.println(customer.getName() + "����һ̨���ӣ�" + tv.name
					+ " ��Ǯ:" + tv.price);
		} else if (Thread.currentThread() == tvMaker) {
			System.out.println(tvMaker.getName() + "��ʼ��������,���...");
			try {
				tvMaker.sleep(2000);
			} catch (InterruptedException e) {
			}
			tv = new TV("������", 3288);
			System.out.println(tvMaker.getName() + "�������");
		}
	}
}

class TV {
	float price;
	String name;

	TV(String name, float price) {
		this.name = name;
		this.price = price;
	}
}
