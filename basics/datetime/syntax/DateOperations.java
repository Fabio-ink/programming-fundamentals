package basics.datetime.syntax;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateOperations {
    public static void main(String[] args) {
        
    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

    LocalDate d04 = LocalDate.parse("2022-07-20"); 
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
	Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

    LocalDate pastWeekLocalDate = d04.minusDays(7); //Mesma coisa para mês, ano, etc...
    LocalDate nextWeekLocalDate = d04.plusDays(7);

    System.out.println("------");
    System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
    System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

    LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // Quando falamos de um LocalDateTime, podemos fazer as operações também com o tempo da data, como hora, minuto e segundo.
    LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

    System.out.println("------");
    System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
    System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Para o Instant não podemos simplesmente utilizar da forma anterior, devemos utilizar está formula para fazer a mesma operação.
    Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

    System.out.println("------");
    System.out.println("pastWeekInstant = " + pastWeekInstant);
    System.out.println("nextWeekInstant = " + nextWeekInstant);

    //Duração
    
    // Duration t1 = Duration.between(pastWeekLocalDate, d04); // Não é possivel fazer isso diretamente pois o Local Date não possui segundos para servirem de medida.
    // Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0)); // É possivel fazer desta forma ou da forma abaixo.
    Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // Converte o LocalDate para um LocalDateTime para fazer a medição.
    Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
    Duration t3 = Duration.between(pastWeekInstant, d06);
    Duration t4 = Duration.between(d06, pastWeekInstant); // É possivel fazer invertido porém a duração acaba sendo negativa pelo primeiro parametro se tratar de um tempo posterior ao segundo parametro

    System.out.println("------");
    System.out.println("T1 - dias = " + t1.toDays());
    System.out.println("T2 - dias = " + t2.toDays());
    System.out.println("T3 - dias = " + t3.toDays());
    System.out.println("T4 - dias = " + t4.toDays());
    System.out.println("------");

    }

}
