package horaJava;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*/
   -Data-hora local:usar quando a hora nao interresa a outras pessoas
		localdate
		localdatetime
/*/

public class LocalDateEstudo {
	
	public static void main(String[] args) {
		
		LocalDate ld0 = LocalDate.now();
		System.out.println(ld0);
				
		LocalDateTime ldt0 = LocalDateTime.now();
		System.out.println(ldt0);
		
		System.out.println();
		
		LocalDate ld1 = LocalDate.of(2000, 1, 2);
		System.out.println(ld1);
		
		LocalDateTime ldt1 = LocalDateTime.of(2003, 04, 05, 06, 07);
		System.out.println(ldt1 );
	}
}
