package asesorias;

import java.util.Scanner;

/**
 *
 * @author Apolo
 */
public class Matriz2 {

    /*en una matriz de n por m se guardan la cantidad de votos de unas elecciones
     las columnas van a ser los partidos y las filas van a ser las regiones
     se pide calcular el total de votos por partido y la cantidad de votos por región
     */
    private static void Imprimir_matriz(int n, int m, String matriz[][]) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("El partido %s tuvo %s voto(s).", matriz[i][0], matriz[i][1]));    
        }
    }
    
    
    public static void Llenar_matriz(String matriz[][], int n, int m) {
        Scanner t = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre del partido.");
            matriz[i][0] = t.next();
                do {
                    
                    System.out.println("Por favor ingrese un valor para el voto.");
                    
                    while (!t.hasNextInt()) {
                        System.out.println("Error, el valor que ingreso no es un dato entero.");
                        System.out.println("Ingrese un nuevo dato.");
                        t.next();
                    }
                    contador = t.nextInt();
                if (contador < 0 || contador > 15) {
                    System.out.println("El dato tiene que se mayor o igual a 0 ó menor o igual a 15.");
                } else {
                    matriz[i][1] = Integer.toString(contador);
                }
                    
                } while (contador < 0 || contador > 15);
        }
        Imprimir_matriz(n, m, matriz);
    }

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int n, m;
        System.out.println("Digite la cantidad de filas : ");
        n = t.nextInt();
        System.out.println("Digite la cantidad de columnas : ");
        m = t.nextInt();

        String matriz[][] = new String[n][m];
        Llenar_matriz(matriz, n, m);

    }
}
