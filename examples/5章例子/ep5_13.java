import java.util.Date;
import java.text.SimpleDateFormat;

class ep5_13 {
	public static void main(String args[]) {
		Date nowTime = new Date();
		System.out.println(nowTime);
		SimpleDateFormat matter1 = new SimpleDateFormat(
				" 'time':yyyy年MM月dd日E 北京时间");
		System.out.println(matter1.format(nowTime));
		SimpleDateFormat matter2 = new SimpleDateFormat(
				"北京时间:yyyy年MM月dd日HH时mm分ss秒");
		System.out.println(matter2.format(nowTime));
		Date date1 = new Date(1000), date2 = new Date(-1000);
		System.out.println(matter2.format(date1));
		System.out.println(matter2.format(date2));
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
