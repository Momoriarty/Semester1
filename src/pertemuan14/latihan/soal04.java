/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan14.latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class soal04 {

    public static void main(String[] args) {

        int angka[][] = new int[3][3],tertinggi = Integer.MIN_VALUE;
        String lokasi = null;

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length; j++) {
                angka[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai : "));
                System.out.print(angka[i][j] + "\t");
                tertinggi = Math.max(tertinggi, angka[i][j]);
                if (tertinggi <= angka[i][j]) {
                    lokasi = i + "," + j;
                }
            }
            System.out.println(" ");
        }

        System.out.println("");

        for (int i = 0; i < angka.length; i++) {
            for (int[] angka1 : angka) {
                System.out.print(angka1[i] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Data Terbesar : " + tertinggi);
        System.out.println("Berada pada cell: " + lokasi);
    }
}
