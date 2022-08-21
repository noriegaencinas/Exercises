
package dds2;

import java.util.Scanner;

public class EntreArreglos {
        
    Scanner join = new Scanner(System.in);
    int az[][] = new int[3][3];
    int za[][] = new int[3][3];           
    
    public int[][] getAZ(){
        return az;
    }
    
    public int[][] getZA(){
        return za;
    }
    
    public void Rellenar(int[][] arreglo){
        char dec;
        System.out.println("Desea generar el arreglo automáticamente o introducirlo manual?");
        System.out.println("a = automático");
        System.out.println("m = manual");
        dec = join.next().charAt(0);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch(dec){
                    case 'a':
                    case 'A': arreglo[i][j] = (int)(Math.random()*10);
                        break;
                    case 'm':
                    case 'M': System.out.println("Introduce el número dentro de la posición [" + i + "][" + j + "]");
                              arreglo[i][j] = join.nextInt();  
                        break;
                }                
            }
        }
    } 
    
    public void VasitosDeAgua(int[][] arreglo1, int[][] arreglo2){
        int vaso;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vaso = arreglo1[i][j];
                arreglo1[i][j] = arreglo2[i][j];
                arreglo2[i][j] = vaso;
            }            
        }
        System.out.println("Los datos dentro de los arreglos han sido intercambiados!");
    }
    
    public void Imprimir(int[][] arreglo){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
    EntreArreglos p = new EntreArreglos();    
    p.Rellenar(p.getAZ());
    p.Imprimir(p.getAZ());
    p.Rellenar(p.getZA());
    p.Imprimir(p.getZA());   
    p.VasitosDeAgua(p.getAZ(), p.getZA());
    p.Imprimir(p.getAZ());
    p.Imprimir(p.getZA());    
    }
}
