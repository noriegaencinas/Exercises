
package fc1;

import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        
        Euclides e = new Euclides();
        Scanner join = new Scanner(System.in);
        int num_uno, num_dos, mcd, residuo;  
        
        System.out.println("Introduce el primer número: ");
        num_uno = join.nextInt();
        System.out.println("Introduce el segundo número: ");
        num_dos = join.nextInt();
        mcd = e.Algoritmo(num_uno,num_dos);
        System.out.println("El máximo común divisor de " + num_uno + " y " + num_dos + " es : " + mcd );
    }
    
    int Algoritmo(int num_uno, int num_dos){
        if(num_dos == 0){
            return num_uno;
        }
        else{
            return Algoritmo(num_dos, num_uno%num_dos);
        }
    }
}
/*
        if(num_uno > num_dos){
            residuo = num_uno%num_dos;            
            while(residuo != 0){
                num_uno = num_dos;
                num_dos = residuo;                
                residuo = num_uno%num_dos;
            }            
            System.out.println("El MCD es: " + num_dos);
        }
        else{
            residuo = num_dos%num_uno;
            while(residuo != 0){
                num_dos = num_uno;
                num_uno = residuo;                
                residuo = num_dos%num_uno;
            }            
            System.out.println("El MCD es: " + num_uno);
        } 
*/