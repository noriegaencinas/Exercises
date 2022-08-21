
package dds2;

import java.util.Scanner;

public class EncontrarNum {
    public static void main(String[] args) {
               
        Scanner join = new Scanner(System.in);
        char dec;       
        int min = 0, max = 1000, num = 500;
    
        System.out.println("Piensa en un número entre 1 y 1000");
        System.out.println("Ahora, ¿Este número es mayor(+) o menor(-) a " + num + "?");
        System.out.println("Si el número es " + num + ", digita (=)");
        dec = join.next().charAt(0);
        
        while(dec != '='){
            if (dec == '+') {
                min = num;                
            }   
            else if (dec == '-') {
                max = num;                
            }
            num = Math.round((max-min)/2) + min;
            System.out.println("Ahora, ¿Este número es mayor(+) o menor(-) a " + num + "?");
            System.out.println("Si el número es " + num + ", digita (=)");
            dec = join.next().charAt(0);           
        }
        System.out.println("El número encontrado fue el: " + num);   
    }
}
    
    
    

