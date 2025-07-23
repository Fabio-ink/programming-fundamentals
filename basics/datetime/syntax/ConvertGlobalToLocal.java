package basics.datetime.syntax;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertGlobalToLocal {
    public static void main(String[] args) {
        
    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

    LocalDate d04 = LocalDate.parse("2022-07-20"); 
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
	Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

    /* for (String s : ZoneId.getAvailableZoneIds()){ // Este método apresenta todas as zoneIds disponiveis para utilização e imprime elas.
            System.out.println(s);
        }
    
    */
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Converte o Instant para uma data local buscando o ZoneId da maquina local.
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //Converte o Instant para uma data local com o ZoneID selecionado.
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("------");
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);
        System.out.println("------");
        System.out.println("D04 - dia = " + d04.getDayOfMonth()); 
        System.out.println("D04 - mês = " + d04.getMonthValue());
        System.out.println("D04 - mês = " + d04.getYear());
        System.out.println("------");
        System.out.println("D05 - hora = " + d05.getHour());
        System.out.println("D05 - minutos = " + d05.getMinute());
        System.out.println("D05 - segundos = " + d05.getSecond());
    }
}
