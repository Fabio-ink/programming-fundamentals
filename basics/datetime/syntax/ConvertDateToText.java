package basics.datetime.syntax;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertDateToText {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Utiliza uma formatação ISO padrão, mais formatações padrões na documentação acima.
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("--------");
        System.out.println("D04 = " + d04.format(fmt1));
        System.out.println("D04 = " + fmt1.format(d04));
        System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("--------");
        System.out.println("D05 = " + d05.format(fmt1)); //Por se tratar de um LocalDateTime, o horário não se faz obrigatório podendo ser mencionado ou não.
        System.out.println("D05 = " + d05.format(fmt2));
        System.out.println("D05 = " + fmt2.format(d05));
        System.out.println("D05 = " + fmt4.format(d05)); // Formatei uma LocalDateTime para uma formatação Iso local com zonetime
        System.out.println("D05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        
        System.out.println("--------");
        // System.out.println("D06 = " + d06.format(fmt3)); // Não é possivel formatar um horário global para texto desta forma, somente utilizando o método abaixo.
        System.out.println("D06 = " + fmt3.format(d06));
        // System.out.println("D06 = " + fmt4.format(d06)); // Não é possivel utilizar uma formatação padrão padronizada para Datas locais quando estivermos utilizando um Instant.
        System.out.println("D06 = " + fmt5.format(d06));
        System.out.println("D06 = " + d06.toString()); // Se fizer desta forma ele também formata no padrão ISO, da mesma forma que o exemplo acima.
    }

}
