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
public class soal04 {

    public static void main(String[] args) {
        String nama[] = {"Ani", "Ari", "Budi", "Joni", "Joko"};
        int[] nilai = new int[nama.length];
        double avg = 0;
        int org = 0;
        int tertinggi = Integer.MIN_VALUE;
        System.out.println(" Nama \tNilai");
        System.out.println(" -------------");
        for (int i = 0; i < nama.length; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai si " + nama[i]));
            System.out.println("| " + nama[i] + "\t " + nilai[i] + "    |");
            avg += nilai[i];
        }
        System.out.println(" -------------");

        avg = (double) avg / nilai.length;
        System.out.println("Rata-rata : " + avg);
        System.out.println("Nilai Diatas Rata-rata");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= avg) {
                org++;
                System.out.println(nama[i] + ": " + nilai[i]);

            }
            tertinggi = Math.max(tertinggi, nilai[i]);
        }
        System.out.println(org + " Orang diatas rata rata");

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= tertinggi) {
                System.out.println("Nilai tertinggi adalah " + nama[i] + ": " + nilai[i]);
            }
        }

    }
}
