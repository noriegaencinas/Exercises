package fc1;

public class Burbuja{
    public static void main(String[] args) {
        
        int array[] = new int[10000];
        int cont;
        long in, fin;
        double tiempo;
        
        in = System.nanoTime();
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100+1);
        }
        
        for(int j = array.length-1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(array[i]>array[i+1]){
                    cont = array[i];
                    array[i] = array[i+1];
                    array[i+1] = cont;
                }
            }
        } 
        
        fin = System.nanoTime();
        tiempo = (double)(fin-in);
        System.out.println("El tiempo de ejecución del programa fue: " + tiempo + " nanosegundos");
        
    }
}
