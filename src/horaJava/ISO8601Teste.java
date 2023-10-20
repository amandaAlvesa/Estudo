package horaJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*/  
 	padrao iso 8601:
		-[hora]_ano-mes-diaThora:minuto:segundos.fraçãodesegundos
		-hora_ano-mes-diaThora:minuto:segundos-03:00(sp)
/*/

public class ISO8601Teste {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("2004-08-05");
		System.out.println(ld);

		LocalDateTime ldt = LocalDateTime.parse("2004-08-05T13:17:30");
		System.out.println(ldt);

		Instant i = Instant.parse("2004-08-05T13:17:30Z");
		System.out.println(i);

		Instant isp = Instant.parse("2004-08-05T13:17:30-03:00");
		System.out.println(isp);
	}
}
