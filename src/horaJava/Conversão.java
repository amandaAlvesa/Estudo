package horaJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversão {

	public static void main(String[] args) {
		Instant i = Instant.parse("2023-10-20T23:12:00Z");
		System.out.println(i.toString());
		
		LocalDate ld = LocalDate.ofInstant(i, ZoneId.of("Portugal"));
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.of("Portugal"));
		System.out.println(ldt);
		
System.out.println();
		
		Instant ldt1 = Instant.now();
		System.out.println(ldt1);
		System.out.println(LocalDateTime.ofInstant(ldt1, ZoneId.of("Portugal")));
	}
}
