
package TPascal;

public class TPascal {
    public static void main(String[] args) {
    
        TPascal t = new TPascal();
        int arreglo[][] = t.GenerarArreglo();
        arreglo = t.IntroducirDatosArreglo(arreglo);
        t.ImprimirTriangulo(arreglo);
        
    }       
    public int[][] GenerarArreglo(){
        int arreglo[][] = new int[10][10];
        return arreglo;
    }
    public int[][] IntroducirDatosArreglo(int[][] arreglo){
        int contador = 1;
        int esp = 9;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (j == esp || j == 9) {
                    arreglo[i][j] = 1;
                }
                if (j < esp) {
                    arreglo[i][j] = 0;
                }
                if (j > esp && j!=esp && j!=9){
                    arreglo[i][j] = arreglo[i-1][j] + arreglo[i-1][j+1];
                }
            }
            esp--;
        }
        return arreglo;
    }
    public void ImprimirTriangulo(int[][] arreglo){
        int esp = 9;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (j < esp) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("[" + arreglo[i][j] + "]");
                }
            }
            System.out.println("");
            esp--;
        }        
    }
}