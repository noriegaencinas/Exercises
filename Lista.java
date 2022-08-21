package FC2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    Scanner join = new Scanner(System.in);
    int vs = 5;
    ArrayList rs = new ArrayList();
    int a[][] = new int[vs][vs];
    int b[][] = new int[vs][vs];
    int ide[][] = new int[vs][vs];
    int ide_t[][] = new int[vs][vs];
    int pm[][] = new int[vs][vs];
    int sm[][] = new int[vs][vs];

    public void Identidades() {
        String cad = "";
        int contador = 1;
        for (int i = 1; i <= vs; i++) {
            for (int j = 1; j <= vs; j++) {
                for (int k = 1; k <= vs; k++) {
                    for (int l = 1; l <= vs; l++) {
                        for (int m = 1; m <= vs; m++) {
                            cad = Integer.toString(i) + Integer.toString(j) + Integer.toString(k) + Integer.toString(l) + Integer.toString(m);
                            if (getSeRepite(cad) == false) {
                                ConvertirAArreglo(cad, contador);
                                MultiplicarArreglo(ide, a, pm);
                                ArregloTraspuesto(ide, ide_t);
                                MultiplicarArreglo(pm, ide_t, sm);
                                CompararArreglo(sm, b, cad);
                                contador++;
                            }
                        }
                    }
                }
            }
        }
        Resumen();
    }

    public void MultiplicarArreglo(int[][] arreglo1, int[][] arreglo2, int[][] arregloproducto) {
        int res = 0;
        for (int k = 0; k < arreglo1.length; k++) {
            for (int i = 0; i < arreglo1.length; i++) {
                for (int j = 0; j < arreglo1.length; j++) {
                    res += arreglo1[k][j] * arreglo2[j][i];
                }
                arregloproducto[k][i] = (res >= 1) ? 1 : 0;
                res = 0;
            }
        }
    }

    public void CompararArreglo(int[][] arreglo1, int[][] arreglo2, String cad) {
        boolean es_iso = false;
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                es_iso = (arreglo1[i][j] == arreglo2[i][j]);
                if (es_iso == false) {
                    break;
                }
            }
            if (es_iso == false) {
                break;
            }
        }
        if (es_iso) {
            addToResumen(cad);
        }
        System.out.println("Las gráficas son isomórficas? " + es_iso);
    }

    public void ArregloTraspuesto(int[][] arreglo1, int[][] arreglo2) {
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1.length; j++) {
                arreglo2[j][i] = arreglo1[i][j];
            }
        }
    }

    public void ConvertirAArreglo(String cad, int cont) {
        int comp[][] = new int[vs][vs];
        for (int i = 0; i < vs; i++) {
            for (int j = 0; j < vs; j++) {
                if (i == j) {
                    comp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < vs; i++) {
            for (Integer j = 1; j <= vs; j++) {
                if (cad.substring(i, i + 1).equals(j.toString())) {
                    ide[i] = comp[j - 1];
                }
            }
        }
        ImprimirArreglo(ide, Integer.toString(cont));
    }

    public void Resumen() {
        System.out.println("");
        System.out.println("La siguiente matríz demostró que A1 y A2 son isomórficas:");
        System.out.println("---------------------------------------------------------");
        for (Object r : rs) {
            ConvertirAArreglo(r.toString(), 0);
        }
    }

    public void addToResumen(String cad) {
        rs.add(cad);
    }

    public boolean getSeRepite(String cad) {
        char caract[] = cad.toCharArray();
        int contador = 0;
        for (int i = 0; i < caract.length; i++) {
            for (int j = 0; j < caract.length; j++) {
                if (caract[i] == caract[j]) {
                    contador++;
                }
            }
        }
        return contador > caract.length;
    }

    public void ImprimirArreglo(int[][] arreglo, String nombre) {
        System.out.println("Matríz: " + nombre);
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void IntroducirArreglo(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.println("Introduce el valor en la posición[" + (i + 1) + "][" + (j + 1) + "]: ");
                arreglo[i][j] = join.nextInt();
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Lista s = new Lista();
        s.IntroducirArreglo(s.a);
        s.IntroducirArreglo(s.b);
        s.ImprimirArreglo(s.a, "A");
        s.ImprimirArreglo(s.b, "B");
        s.Identidades();
    }
}
