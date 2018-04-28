public class ep7_2 {
	public static void main(String args[]) {
		People teacher, student;
		ComputerSum sum = new ComputerSum();
		teacher = new People("��ʦ", 200, sum);
		student = new People("ѧ��", 200, sum);
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
	int timeLength; // �߳����ߵ�ʱ�䳤��
	ComputerSum sum;

	People(String s, int timeLength, ComputerSum sum) {
		setName(s); // ����Thread��ķ���setNameΪ�߳��������
		this.timeLength = timeLength;
		this.sum = sum;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			int m = sum.getSum();
			sum.setSum(m + 1);
			System.out.println("����" + getName() + ",���ڵĺ�:" + sum.getSum());
			try {
				sleep(timeLength);
				} catch (InterruptedException e) {
			}
		}
	}
}
