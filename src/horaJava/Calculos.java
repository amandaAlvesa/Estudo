package horaJava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("2004-08-05");
		System.out.println(ld.minusDays(2));
		
		LocalDateTime ldt = LocalDateTime.parse("2019-08-20T19:09:30");
		System.out.println(ldt.plusHours(2));
		
		Instant i = Instant.parse("2090-02-20T14:03:10Z");
		Instant ia = i.minus(72, ChronoUnit.DAYS);
		System.out.println(ia);
		
	System.out.println();
	
		LocalDate before = LocalDate.parse("2004-08-05");
		LocalDate after = LocalDate.parse("2023-10-20");
		Duration d = Duration.between(before.atStartOfDay(), after.atTime(23,0));
		System.out.println(d.toMinutes());


		LocalDateTime before1 = LocalDateTime.parse("2004-08-05T12:09:30");
		LocalDateTime after1 = LocalDateTime.parse("2023-10-20T23:36:30");
		Duration d1 = Duration.between(before1, after1);
		System.out.println(d1.toDays());
	}
}
