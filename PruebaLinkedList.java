
package pruebadelist;

import java.util.Iterator;
import java.util.LinkedList;

public class PruebaLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> linky = new LinkedList<>();
        
        linky.add(10);
        linky.add(100);
        linky.add(77);
        linky.add(999);
                
        System.out.println(linky);
       
        Iterator it = linky.iterator();
       
        int mayor = 0;
        int i = 0;
        
        while(it.hasNext()){
            if ((int)it.next() > mayor) {
                mayor = (int)(linky.get(i));
            }
            i++;
        }
        System.out.println(mayor);
        
    }
}
