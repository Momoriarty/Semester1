/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15.latihan;

import javax.swing.JOptionPane;

public class soal02 {

    public static void main(String[] args) {

        String nama[] = {"Andi", "Ari", "Budi"};
        int nilai[] = new int[3];
        String status[] = new String[3];

        System.out.println("Nama \t Nilai \t Status");
        for (int i = 0; i < 3; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai -" + nama[i]));
            if (nilai[i] > 60) {
                status[i] = "Lulus";
            } else {
                status[i] = "Gagal";
            }
            System.out.println(nama[i] + " \t " + nilai[i] + " \t " + status[i]);
        }
    }
}
