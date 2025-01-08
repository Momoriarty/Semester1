/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author LAB282
 */
public class soal06 {

    public static void main(String[] args) {

        int bil[][] = {{1, 7}, {3, 2}, {8, 7}};

        for (int[] bil1 : bil) {
            for (int j = 0; j < bil1.length; j++) {
                System.out.print(bil1[j] + " ");
            }
            System.out.println("");
        }
    }
}
