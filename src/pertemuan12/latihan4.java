/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, tujuan, asal;
        int nilai = 0;
        int i = 0;
        String[] namap = new String[100];
        String[] tujuanp = new String[100];
        String[] asalp = new String[100];

        while (nilai != 2) {
            // Show menu
            nilai = Integer.parseInt(JOptionPane.showInputDialog("1.Tambahkan Data\n"
                    + " 2.<<exit>"));

            if (nilai == 1) {
                if (i < 100) {
                    System.out.println("Pengunjung ke-" + (i + 1));
                    System.out.print("Nama Pengunjung: ");
                    nama = sc.nextLine(); 
                    namap[i] = nama;

                    System.out.print("Tujuan Pengunjung: ");
                    tujuan = sc.nextLine();
                    tujuanp[i] = tujuan;

                    System.out.print("Asal Pengunjung: ");
                    asal = sc.nextLine();
                    asalp[i] = asal;

                    i++;
                    System.out.println("");
                } else {
                    System.out.println("Data sudah penuh. Tidak bisa menambahkan data baru.");
                    break;
                }
            } else if (nilai == 2) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }
        }
        System.out.println("Data Pengunjung:");
        for (int j = 0; j < i; j++) {
            System.out.println("Pengunjung " + (j + 1) + ": " + namap[j] + ", Tujuan: " + tujuanp[j] + ", Asal: " + asalp[j]);
        }
    }
}
