package couse;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		//System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		int mounth = 1+cal.get(Calendar.MONTH);
		System.out.println("Mounth: " + mounth);
		
	}

}
