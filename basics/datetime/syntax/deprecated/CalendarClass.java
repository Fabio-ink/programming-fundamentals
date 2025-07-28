package basics.datetime.syntax.deprecated;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

    //utilização da classe date utilizada antes do JAVA 7/8.
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));
        System.out.println("---------------");

        //Acima como acrescentar alguma informação a uma data (dia,hora,minuto,etc).

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf2.format(d));
        
        cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); // O mês começa em "0", por isso o 1 + a data.

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

        //Acima como "pegar" alguma informação de uma data (dia,mês,hora,minuto,etc).
        
    }

}
