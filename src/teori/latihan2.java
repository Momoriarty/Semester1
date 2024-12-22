/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, terbesar = Integer.MIN_VALUE, terkecil = Integer.MAX_VALUE;
        double avg = 0;

        System.out.print("Masukkan Jumlah angka : ");
        jumlah = sc.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
            avg += angka[i];
            terbesar = Math.max(terbesar, angka[i]);
            terkecil = Math.min(terkecil, angka[i]);
        }

        System.out.println("Nilai Rata-rata : " + (avg / angka.length));
        System.out.println("Terbesar : " + terbesar);
        System.out.println("Terkecil : " + terkecil);
    }
}
