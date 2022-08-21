package matrices;


public class SumaDeMatrices {
    
    int[][] res = new int[3][3];
    
    public int[][] getMatriz(){
        int[][] x = new int[3][3];
        for (int i = 0; i < x.length; i++) {            
            for (int j = 0; j < x.length; j++) {                
                x[i][j] = (int)(Math.random()*4);
            }            
        }
        return x;
    }
    
    public void SumarMatrices(int[][] p, int[][] s){
        for (int i = 0; i < p.length; i++) {            
            for (int j = 0; j < p.length; j++) {                
                res[i][j] = p[i][j] + s[i][j];
            }            
        }
    }

    public void MostrarMatriz(int[][] x, int[][] y, int[][] z){        
        for (int i = 0; i < x.length; i++) {            
            for (int j = 0; j < x.length; j++) {                
                System.out.print("[" + x[i][j] + "]");
            }            
            
            System.out.print((i==1)?"  +  ":"     ");
            
            for (int j = 0; j < x.length; j++) {                
                System.out.print("[" + y[i][j] + "]");
            }            
            
            System.out.print((i==1)?"  =  ":"     ");
            
            for (int j = 0; j < x.length; j++) {                
                System.out.print("[" + z[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        SumaDeMatrices s = new SumaDeMatrices();  
        int[][] ej1 = s.getMatriz();        
        int[][] ej2 = s.getMatriz();        
        s.SumarMatrices(ej1, ej2);
        s.MostrarMatriz(ej1, ej2, s.res);
    }
}
