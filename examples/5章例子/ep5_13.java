import java.util.Date;
import java.text.SimpleDateFormat;

class ep5_13 {
	public static void main(String args[]) {
		Date nowTime = new Date();
		System.out.println(nowTime);
		SimpleDateFormat matter1 = new SimpleDateFormat(
				" 'time':yyyy��MM��dd��E ����ʱ��");
		System.out.println(matter1.format(nowTime));
		SimpleDateFormat matter2 = new SimpleDateFormat(
				"����ʱ��:yyyy��MM��dd��HHʱmm��ss��");
		System.out.println(matter2.format(nowTime));
		Date date1 = new Date(1000), date2 = new Date(-1000);
		System.out.println(matter2.format(date1));
		System.out.println(matter2.format(date2));
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
