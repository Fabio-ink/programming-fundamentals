package basics.datetime.syntax;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSyntax {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        // cria uma formatação para o objeto, para que a data seja apresentada como dia/mes/ano, conforme apresentado na documentação acima.
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // cria uma formatação para o objeto, para que a data seja apresentada como dia/mes/ano - hora, conforme apresentado na documentação acima.
		
		LocalDate d01 = LocalDate.now(); //pega o ano-mes-dia de agora
		LocalDateTime d02 = LocalDateTime.now(); //pega o ano-mes-hora de agora, captando a fração do segundo também
		Instant d03 = Instant.now(); //pega o ano-mes-hora de agora, captando a fração do segundo e define a timezone também, padrão zulu timezone (Londres)
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //define a data cujo será captada
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //define a data e horário cujo será captada
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //define a data, horário e timezone cujo será captada (Z = zulu timezone (londres))
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //define a data, horário e timezone cujo será captada (Selecionou qual seria a timezone, -03:00 (São paulo))
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // utiliza a formação para recepcionar e apresentar a data conforme formatação

        //LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // É possivel utilizar a formatação diretamente na instanciação do objeto

		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // utiliza a formação para recepcionar e apresentar a data conforme formatação

		LocalDate d10 = LocalDate.of(2022, 07, 20); //recebe apenas as informações referentes ao campos, similar a um construtor
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30); //recebe apenas as informações referentes ao campos, similar a um construtor
		
		System.out.println("d01 = " + d01.toString());
        //System.out.println("d01 = " + d01); // É possivel imprimir este obejto sem utilizar o .toString, pois por padrão ele vem padronizado desta forma

		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}

}
