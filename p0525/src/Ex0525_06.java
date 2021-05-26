import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0525_06 {

	public static void main(String[] args) {
		
		//Calendar 객체 사용
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyy/MM/dd hh:mm:ss");
		//Calendar cal2 = new Calendar();
		Calendar cal = Calendar.getInstance();
		String today3 = sdf3.format(cal.getTime());
		System.out.println("Calendar객체 시간 : "+ today3);
		
		//Date객체 사용 - 날짜 시간을 구함.
		Date time = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");
		String today = sdf1.format(time);
		System.out.println("Date 객체 시간 : "+ time);
		System.out.println(today);
		
		Date time2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String today2 = sdf2.format(time2);
		System.out.println("Date2 객체 시간 : "+ today2);
		
		
		Singleton s = Singleton.getIntSingleton();
		Singleton s2 = Singleton.getIntSingleton();
		

		System.out.println(s);
		System.out.println(s2);
		
		s.setName("홍길동");
		
		System.out.println("학번 : "+s.getStu_num());
		System.out.println("이름 : "+s.getName());
		
	}

}
