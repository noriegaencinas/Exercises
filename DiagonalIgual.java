
package dds2;

import java.util.Scanner;

public class DiagonalIgual {
    
    Scanner join = new Scanner(System.in);
    int noriega[][] = new int[5][5];
    int numero;
    
    public void IntroducirNum(){
        System.out.println("Introduce un númerito: ");
        numero = join.nextInt();        
    }
     
    public void RellenarArreglo(){
        boolean yapaso = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j) {
                    noriega[i][j] = numero;
                    yapaso = true;
                }
                else{
                    noriega[i][j] = (yapaso)?numero+1:numero-1;
                }
            }    
            yapaso = false;
        }
    }
    
    public void ImprimirArreglo(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + noriega[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
    DiagonalIgual e = new DiagonalIgual();
    e.IntroducirNum();    
    e.RellenarArreglo();
    e.ImprimirArreglo();
    }
}
