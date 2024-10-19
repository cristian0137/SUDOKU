/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;


import static sudoku.clase.generateShuDu;


/**
 *
 * @author crist
 */
public class Sudoku {
    //Cristian Alberto Hernandez Vergara 
    //Jose Gregorio Orozco Campo
    public static void main(String[] args) {
        int[][] shuDu = generateShuDu();
        Clase2 e = new Clase2();
        e.preparandotablero();
        e.jugar();
        
    }

}
