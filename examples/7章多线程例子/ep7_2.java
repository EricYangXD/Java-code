public class ep7_2 {
	public static void main(String args[]) {
		People teacher, student;
		ComputerSum sum = new ComputerSum();
		teacher = new People("老师", 200, sum);
		student = new People("学生", 200, sum);
		teacher.start();
		student.start();
	}
}

class ComputerSum {
	int sum;

	public void setSum(int n) {
		sum = n;
	}

	public int getSum() {
		return sum;
	}
}

class People extends Thread {
	int timeLength; // 线程休眠的时间长度
	ComputerSum sum;

	People(String s, int timeLength, ComputerSum sum) {
		setName(s); // 调用Thread类的方法setName为线程起个名字
		this.timeLength = timeLength;
		this.sum = sum;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			int m = sum.getSum();
			sum.setSum(m + 1);
			System.out.println("我是" + getName() + ",现在的和:" + sum.getSum());
			try {
				sleep(timeLength);
				} catch (InterruptedException e) {
			}
		}
	}
}
