import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ep5_14 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar(); // 表示当前日期
		System.out.println(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss EEEE")
				.format(cal.getTime()));
		cal.clear();
		cal.set(Calendar.YEAR, 2006);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 15);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 33);
		cal.set(Calendar.SECOND, 55);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEE")
				.format(cal.getTime()));
	}
}