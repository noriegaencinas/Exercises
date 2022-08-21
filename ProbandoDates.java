package pruebaDeDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProbandoDates {

    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate);

        SimpleDateFormat fecha = new SimpleDateFormat("dd:MM:yy");
        System.out.println(fecha.format(currentDate));        
        
        SimpleDateFormat nombreDia = new SimpleDateFormat("EE");
        System.out.println(nombreDia.format(currentDate));
    }
}
