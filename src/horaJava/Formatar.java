package horaJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class Formatar {
	public static void main(String[] args) {

		LocalDate ld = LocalDate.parse("2019-09-20");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(ld.format(dtf));
		System.out.println(dtf.format(ld));
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	System.out.println();
	
		LocalDateTime ldt = LocalDateTime.parse("2019-08-20T19:09:30");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(ldt.format(dtf1));
		System.out.println(dtf1.format(ldt));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
	System.out.println();	
		
		Instant i = Instant.parse("2019-10-20T20:20:20Z");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println(dtf2.format(i));
		System.out.println(dtf3.format(i));
		System.out.println(i.toString());
		
	}
}
