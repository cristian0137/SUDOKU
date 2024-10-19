/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Random;

/**
 *
 * @author cristian
 */
public class clase {

    protected static int[][] n = new int[9][9];
    private static int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int[][] generateShuDu() {
        
        for (int i = 0; i < 9; i++) {
            
            int time = 0;
            
            for (int j = 0; j < 9; j++) {
                
                n[i][j] = generateNum(time);
                
                if (n[i][j] == 0) {
                    
                    if (j > 0) {
                        j -= 2;
                        continue;
                    } else {
                        i--;
                        j = 8;
                        continue;
                    }
                }
                
                if (isCorret(i, j)) {
                    
                    time = 0;
                } else {
                   
                    time++;
                    
                    j--;
                }
            }
        }
        return n;
    }

    private static boolean isCorret(int row, int col) {
        return (checkRow(row) & checkLine(col) & checkNine(row, col));
    }

    private static boolean checkRow(int row) {
        for (int j = 0; j < 8; j++) {
            if (n[row][j] == 0) {
                continue;
            }
            for (int k = j + 1; k < 9; k++) {
                if (n[row][j] == n[row][k]) {
                    return false;
                }
            }

        }
        return true;
    }

    private static boolean checkLine(int col) {
        for (int j = 0; j < 8; j++) {
            if (n[j][col] == 0) {
                continue;
            }
            for (int k = j + 1; k < 9; k++) {
                if (n[j][col] == n[k][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkNine(int row, int col) {
        
        int j = row / 3 * 3;
        int k = col / 3 * 3;
        
        for (int i = 0; i < 8; i++) {
            if (n[j + i / 3][k + i % 3] == 0) {
                continue;
            }
            for (int m = i + 1; m < 9; m++) {
                if (n[j + i / 3][k + i % 3] == n[j + m / 3][k + m % 3]) {
                    return false;
                }
            }
        }
        return true;
    }
    private static Random r = new Random();

    private static int generateNum(int time) {
        
        if (time == 0) {
            for (int i = 0; i < 9; i++) {
                num[i] = i + 1;
            }
        }
       
        if (time == 9) {
            return 0;
        }
        
        int ranNum = r.nextInt(9 - time);
       
        int temp = num[8 - time];
        num[8 - time] = num[ranNum];
        num[ranNum] = temp;
        
        return num[8 - time];
    }

    public  void sudoku() {
        int[][] shuDu = generateShuDu();
       
         
        for (int i = 0; i < 9; i++) {
            
            for (int j = 0; j < 9; j++) {
                System.out.print(shuDu[i][j] + " ");
                if(j==2||j==5||j==8){
                    System.out.print("\t"); 
                }
                if(i==2&&j==8||i==5&&j==8||i==8&&j==8){
                    System.out.println();
                }

            }
            System.out.println();
           
        }
        System.out.println("");
        System.out.println("");
        
    }
    

}
