package basics.datetime.syntax.deprecated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

//utilização da classe date utilizada antes do JAVA 7/8.

public class DateClass {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date(); //Instancia a data de agora, captando a a data do sistema
        Date x2 = new Date(System.currentTimeMillis()); //Instancia uma data pegando os milisegundos do sistema.
        Date x3 = new Date(0L); //Instancia uma data com os milisegundos informados, no caso a data inicial que começaram a "contar", no caso 01/01/1970, porém na zone time do sistema.
        Date x4 = new Date(1000L * 60L * 60L * 5L); // mesma coisa que anterior porém utiliza o calculo em parentezes para ajustar a zonetime para a zone time zulu.

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("-------------");

        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("-------------");

        System.out.println("x1: " + sdf3.format(x1)); // Formatados no padrão GMT.
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));

    }

}
