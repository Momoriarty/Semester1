/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15.latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class soal01 {

    public static void main(String[] args) {
        int angka[][] = new int[4][3];

        for (int[] angka1 : angka) {
            for (int j = 0; j < angka1.length; j++) {
                if (j < 2) {
                    angka1[j] = Integer.parseInt(JOptionPane.showInputDialog("Input Angka : "));
                    System.out.print(angka1[j] + " ");
                } else {
                    System.out.print(angka1[0] + angka1[1]);
                }
            }
            System.out.println("");
        }
    }
}
