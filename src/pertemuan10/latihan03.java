/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class latihan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        String nama, simbol = null;
        System.out.println("No \tNama \tNilai \tNilai-HURUF");
        for (int i = 1; i <= 5; i++) {

            System.out.print(i);
            nama = JOptionPane.showInputDialog("Masukkan Nama ke-" + i);
            System.out.print("\t" + nama);
            String inputNilai = JOptionPane.showInputDialog("Masukkan Nilai untuk " + nama + ":");
            int nilai = Integer.parseInt(inputNilai);

            if (nilai >= 80) {
                simbol = "A";
            } else if (nilai >= 71 && nilai < 80) {
                simbol = "B";
            } else if (nilai >= 61 && nilai < 70) {
                simbol = "C";
            } else {
                simbol = "D";
            }

            System.out.print("\t" + nilai + "\t" + simbol + "\n");

            total += nilai;
        }

        for (int i = 1; i <= 50; i++) {
            System.out.print("=");
        }
        System.out.println("\nRata-Rata Nilai : " + ((double) total / 5));
    }
}
