
package pruebadelist;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PruebaDeList {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        lista.add("Melón");
        lista.add("Manzana");
        lista.add("Sandía");
        lista.add("Mandarina");
        System.out.println(lista);        
        
        ArrayList lista2 = new ArrayList();
        lista2.add(lista.clone());
        System.out.println(lista2);
        
        ArrayList lista3 = new ArrayList();
        lista3.add(lista2.clone());
        System.out.println(lista3);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
                        
        PruebaDeList t = new PruebaDeList();
        t.ObtenerFecha();     
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.split(" ");    
        System.out.println(values[0]);
    }
    
    public void ObtenerFecha(){
        Date currentDate = new Date();
        System.out.println(currentDate);
        ObtenerDia(currentDate);
    }
    public void ObtenerDia(Date currentDate){
        SimpleDateFormat dia = new SimpleDateFormat("EE");
        System.out.println(dia.format(currentDate));
    }    
}
