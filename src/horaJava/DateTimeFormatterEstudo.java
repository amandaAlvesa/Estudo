package horaJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class DateTimeFormatterEstudo {

	public static void main(String[] args){

		DateTimeFormatter dtf0 = DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate ld = LocalDate.parse("09/09/09", dtf0);
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.parse("09/09/09 09:09:09",DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
		System.out.println(ldt);		
	}
}
