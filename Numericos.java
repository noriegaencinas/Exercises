package BinYDec;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Angel
 */
public class Numericos {

    Scanner join = new Scanner(System.in);    
    int num;
    char dec;
    ArrayList lista = new ArrayList();
        
    public void PedirCaso() {
        System.out.println("Introduce el sistema númerico a convertir");
        System.out.println("b -> binario a decimal");
        System.out.println("d -> decimal a binario");
        dec = join.next().charAt(0);
    }
    
    public void PedirNumero(){
        num = join.nextInt();
    }
    
    public void Proceso(){
        int largo;
        int resultado = 0;
        int j = 0;
        switch(dec){
            case 'b':
            case 'B':
                String cad = Integer.toString(num);                
                String pza;
                for (int i = cad.length(); i > 0 ; i--) {
                    pza = cad.substring(j, j+1);
                    resultado += Math.pow(2, i)*Integer.parseInt(pza);
                    j++;
                }
                lista.add(resultado);
                break;
            case 'd':
            case 'D':
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
    
    public void ImprimirResultados(){
        System.out.println(lista);
    }

    public static void main(String[] args) {
        Numericos n = new Numericos();
        n.PedirCaso();
        n.PedirNumero();
        n.Proceso();
        n.ImprimirResultados();
    }
}
