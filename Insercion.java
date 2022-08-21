package fc1;

public class Insercion{
    public static void main(String[] args) {
        
        int array[] = new int[10];
        int cont, j;
        long in, fin;
        double tiempo;
          
        in = System.nanoTime();
                
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100+1);
        }        
                 
        for(int i = 1; i < array.length; i++){            
            cont = array[i];            
            for(j = i; j>0 && cont < array[j-1]; j--){
                array[j] = array[j-1];                
            }
            array[j] = cont;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");           
        }
        
        fin = System.nanoTime();
        tiempo = (double)(fin-in);
        System.out.println("El tiempo de ejecución del programa fue: " + tiempo + " nanosegundos");
        
    }
}