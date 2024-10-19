/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Clase2 extends clase {

    protected int[][] tablero = new int[9][9];

    public void preparandotablero() {

        tablero[0][2] = n[0][2];
        tablero[0][6] = n[0][6];
        tablero[0][7] = n[0][7];
        tablero[1][1] = n[1][1];
        tablero[1][2] = n[1][2];
        tablero[1][4] = n[1][4];
        tablero[1][5] = n[1][6];
        tablero[1][6] = n[1][6];
        tablero[2][1] = n[2][1];
        tablero[2][4] = n[2][4];
        tablero[2][5] = n[2][5];
        tablero[2][8] = n[2][8];
        System.arraycopy(n[3], 0, tablero[3], 0, 8);
        tablero[4][4] = n[4][4];
        tablero[4][7] = n[4][7];
        tablero[5][1] = n[5][1];
        tablero[5][2] = n[5][2];
        tablero[5][5] = n[5][5];
        tablero[6][0] = n[6][0];
        tablero[6][4] = n[6][4];
        tablero[6][2] = n[6][2];
        tablero[6][8] = n[6][8];
        tablero[7][1] = n[7][1];
        tablero[7][4] = n[7][4];
        System.arraycopy(n[8], 0, tablero[8], 0, 4);
        tablero[8][5] = n[8][6];
        tablero[8][5] = n[8][6];
        tablero[8][8] = n[8][8];

    }

    public void jugar() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(tablero[i][j] + " ");
                if (j == 2 || j == 5 || j == 8) {
                    System.out.print("\t");
                }
                if (i == 2 && j == 8 || i == 5 && j == 8 || i == 8 && j == 8) {
                    System.out.println();
                }

            }
            System.out.println();

        }
        for (int x = 0; x < 43; x++) {
            int fila, columna, num;
            boolean pase = false;
            boolean correcta = false;
            do {
                System.out.println("En que posición va a colocar el numero:");
                System.out.print("Fila: ");
                fila = entrada.nextInt();
                System.out.print("Columna: ");
                columna = entrada.nextInt();
                System.out.print("Introdusca el numero: ");
                num = entrada.nextInt();
                if (tablero[fila - 1][columna - 1] != 0) {
                    System.out.println("");
                    System.out.println("\nESTA POSICIÓN YA ESTA LLENA ");
                } else {
                    pase = true;
                }
                if (num != n[fila - 1][columna - 1] ) {
                    System.out.println("");
                    System.out.println("NUMERO INCORRECTO SIGUE INTENTANDO");
                } else {

                    System.out.println("");
                    System.out.println("BIEN HECHO");
                    tablero[fila - 1][columna - 1] = n[fila - 1][columna - 1];
                    correcta = true;
                }

            } while (fila < 0 && fila > 9 && columna < 0 && columna > 9 && pase == true && correcta == true);
             
            System.out.println("");
            for (int y = 0; y < 9; y++) {

                for (int j = 0; j < 9; j++) {
                    System.out.print(tablero[y][j] + " ");
                    if (j == 2 || j == 5 || j == 8) {
                        System.out.print("\t");
                    }
                    if (y == 2 && j == 8 || y == 5 && j == 8 || y == 8 && j == 8) {
                        System.out.println();
                    }

                }
                System.out.println();

            }

        }

    }
}
