/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class soal07 {

    public static void main(String[] args) {

        int angka[][] = new int[2][3];
        int ganjil = 0, genap = 0;

        for (int[] angka1 : angka) {
            for (int j = 0; j < angka1.length; j++) {
                angka1[j] = Integer.parseInt(JOptionPane.showInputDialog("Inpun Nilai : "));
                System.out.print(angka1[j] + " ");
                if (angka1[j] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }
            System.out.println("");
        }
        System.out.println("Genap  :" + genap);
        System.out.println("Ganjil :" + ganjil);

    }
}
