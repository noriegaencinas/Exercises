package dds2;

import java.util.Scanner;

public class Gato5x5 {

    int a = 5; // esta es la variable que modifica la cantidad de filas y columnas del gato
    int arreglo[][] = new int[a][a];
    boolean ganador = false;
    int jugador = 0;
    boolean done = false; //permite que no se sigan ejecutando los procesos while cuando ya hay ganador pero el ciclo no ha terminado

    public void ImprimirGato() {
        if (done == false) { //permite que no se sigan ejecutando los procesos while cuando ya hay ganador pero el ciclo no ha terminado
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print((arreglo[i][j] != 0) ? arreglo[i][j] : " ");
                    System.out.print((j < (a - 1)) ? "|" : "");//Solo es diseño para colocar las separaciones
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public void Proceso() {
        while (ganador == false) {
            TurnoJugador();
            TurnoPC();
            QuedanTurnos();
            RestartJugadores();
        }
    }

    public void TurnoJugador() {
        jugador++; //permite que se puedan introducir más turnos de jugadores
        if (done == false) { //permite que no se sigan ejecutando los procesos while cuando ya hay ganador pero el ciclo no ha terminado
            System.out.println("Turno del jugador: (" + jugador + ")");
            Scanner join = new Scanner(System.in);
            boolean ocupado = false;
            while (ocupado == false) {
                System.out.println("Introduce la fila: ");
                int f = join.nextInt();
                System.out.println("Introduce la columna: ");
                int c = join.nextInt();
                if (f < a && f >= 0 && c < a && c >= 0) {
                    if (arreglo[f][c] == 0) {
                        arreglo[f][c] = jugador;
                        ocupado = true;
                    } else {
                        System.out.println("Celda ocupada, vuelve a intentarlo!");
                    }
                } else {
                    System.out.println("Celda fuera de limites, vuelve a intentarlo!");
                }
            }
            ImprimirGato();
            VerificarGanador(false);
        }
    }

    public void VerificarGanador(boolean esPrueba) { //si el valor de esprueba es true no afectara la pos-ejecución del programa
        if (ganador == false) {
            for (int i = 0; i < a; i++) { //Este for verifica si hay ganador en las filas
                for (int j = 1; j < a; j++) {
                    ganador = (arreglo[i][j] == arreglo[i][j - 1] && arreglo[i][j] != 0);
                    if (ganador == false) {
                        break;
                    }
                }
                if (ganador) {
                    break;
                }
            }
        }
        if (ganador == false) {
            for (int j = 0; j < a; j++) { //Este for verifica si hay ganador en las columnas                
                for (int i = 1; i < a; i++) {
                    ganador = (arreglo[i][j] == arreglo[i - 1][j] && arreglo[i][j] != 0);
                    if (ganador == false) {
                        break;
                    }
                }
                if (ganador) {
                    break;
                }
            }
        }
        if (ganador == false) {
            for (int i = 1; i < a; i++) { //Este for verifica si hay ganador en la diagonal decreciente
                ganador = (arreglo[i][i] == arreglo[i - 1][i - 1] && arreglo[i][i] != 0);
                if (ganador == false) {
                    break;
                }
            }
        }

        if (ganador == false) { //Este for verifica si hay ganador en la diagonal creciente
            int j = 0;
            for (int i = (a - 1); i > 0; i--) {
                ganador = (arreglo[i][j] == arreglo[i - 1][j + 1] && arreglo[i][j] != 0);
                j++;
                if (ganador == false) {
                    break;
                }
            }
        }
        if (esPrueba == false) {
            if (ganador == true && done == false) {
                System.out.println("El jugador " + jugador + " ganó la partida!");
                done = true;
            }
        }
    }

    public void TurnoPC() {
        jugador++; //permite que se puedan introducir más turnos de computadora
        if (done == false) { //permite que no se sigan ejecutando los procesos while cuando ya hay ganador pero el ciclo no ha terminado
            System.out.println("Turno de la computadora! (" + jugador + ")");
            boolean hecho = false; //esta variable restringe a el metodo de manera que solo permite hacer un remplazo por llamada al metodo
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (arreglo[i][j] == 0 && hecho == false) {
                        arreglo[i][j] = 1; //permite usar esta secuencia ya sea si el turno del jugador sea primero o segundp
                        VerificarGanador(true);
                        if (ganador) {
                            arreglo[i][j] = jugador;
                            hecho = true;
                            ganador = false;
                        } else {
                            arreglo[i][j] = 0;
                        }
                    }
                }
            }
            if (hecho == false) {
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        if (arreglo[i][j] == 0 && hecho == false) {
                            arreglo[i][j] = (jugador);
                            hecho = true;
                        }
                    }
                }
            }
        }
        ImprimirGato();
        VerificarGanador(false);
    }

    public void QuedanTurnos() {  //permite que no se cicle hasta el infinito
        int esp_vacios = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                esp_vacios = (arreglo[i][j] == 0) ? esp_vacios + 1 : esp_vacios;
            }
        }
        if (esp_vacios == 0) {
            ganador = true;
            done = true;
            System.out.println("El juego termino sin ganadores!");
        }
    }

    public void RestartJugadores() {
        jugador = 0;
    }

    public static void main(String[] args) {
        Gato5x5 g = new Gato5x5();
        g.ImprimirGato();
        g.Proceso();
    }
}
