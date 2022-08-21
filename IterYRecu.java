package fc1;

import java.util.Scanner;

public class IterYRecu {

    public static void main(String[] args) {
        IterYRecu e = new IterYRecu();
        Scanner join = new Scanner(System.in);
        int num;

        System.out.println("Introduce la posición del número de la sucesión que deseas conocer: ");
        num = join.nextInt();
        
        System.out.println("Con iteración: ");
        int it = e.iteracion(num);
        System.out.println(it);
        
        System.out.println("Con recursividad: ");        
        int recu = e.recursividad(num);
        System.out.println(recu);
    }
 
    int iteracion(int num) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < num; i++) {
            c = a;
            a = b + c;
            b = c;     
        }        
        return a;
    }    
    
    int recursividad(int num) {
        if (num == 0) {
            return 0;   
        } 
        else if (num == 1) {
            return 1;
        } 
        else {
            return recursividad(num - 1) + recursividad(num - 2);
        }
    }    
}
