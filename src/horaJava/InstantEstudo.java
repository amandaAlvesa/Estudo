package horaJava;

import java.time.Instant;
import java.time.LocalDateTime;

/*/
	data-hora global: quando o momento exato interressa a outras pessoas
		instant
		
	  timezone (fuso horario):
		-gmt ou z time, hrr de londres
		-sao paulo -3
		-portugal +1
/*/

public class InstantEstudo {

	public static void main(String[] args) {
		Instant i0 = Instant.now();
		System.out.println("Data Londres = " +  i0);
		
		LocalDateTime i1 = LocalDateTime.now();
		System.out.println("Data Parana = " + i1);
	}
}
