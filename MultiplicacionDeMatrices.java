package matrices;


public class MultiplicacionDeMatrices {

    int[][] ej1 = new int[2][3];
    int[][] ej2 = new int[3][2];
    int[][] ej3 = new int[2][2];
    
    public void SetMatriz(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int)(Math.random()*4);
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void MultiplicarMatrices(int[][] x, int[][] y, int[][] z){
        int res = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    res += x[i][k]*y[k][j];                    
                }
                z[i][j] = res;
                res = 0;
            }
        }
    }
    
    public void MostrarMatrices(int[][] x, int[][] y, int[][] z){
        int mayor = 3;
        for (int i = 0; i < 3; i++) {
            if (i<2) {
                for (int j = 0; j < x[i].length; j++) {
                    System.out.print("[" + x[i][j] + "]");                    
                }                
            }    
            else{
                System.out.print("\t ");
            }
            System.out.print((i==1)?"  *  ":"     ");
            for (int j = 0; j < y[i].length; j++) {
                System.out.print("[" + y[i][j] + "]");
            }
            System.out.print((i==1)?"  =  ":"     ");
            if (i<2) {
                for (int j = 0; j < z[i].length; j++) {
                    System.out.print("[" + z[i][j] + "]");
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        MultiplicacionDeMatrices m = new MultiplicacionDeMatrices();
        m.SetMatriz(m.ej1);
        m.SetMatriz(m.ej2);        
        m.MultiplicarMatrices(m.ej1, m.ej2, m.ej3);
        m.MostrarMatrices(m.ej1, m.ej2, m.ej3);
    }
}
