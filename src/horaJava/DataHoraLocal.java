package horaJava;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHoraLocal {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("2004-08-05");
		System.out.println(ld.getDayOfMonth());
		
		LocalDateTime ldt = LocalDateTime.parse("2019-08-20T19:09:30");
		System.out.println(ldt.getHour());
	}
	
}
