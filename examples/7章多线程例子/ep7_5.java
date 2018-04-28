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
		customer.setName("顾客");
		tvMaker.setName("电视制造厂");
	}

	public void run() {
		if (Thread.currentThread() == customer) {
			System.out.println(customer.getName() + "等" + tvMaker.getName()
					+ "生产电视");
			try {
				tvMaker.join(); // 线程customer开始等待tvMaker结束
			} catch (InterruptedException e) {
			}
			System.out.println(customer.getName() + "买了一台电视：" + tv.name
					+ " 价钱:" + tv.price);
		} else if (Thread.currentThread() == tvMaker) {
			System.out.println(tvMaker.getName() + "开始生产电视,请等...");
			try {
				tvMaker.sleep(2000);
			} catch (InterruptedException e) {
			}
			tv = new TV("红星牌", 3288);
			System.out.println(tvMaker.getName() + "生产完毕");
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
