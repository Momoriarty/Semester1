/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan07;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total_belanja, diskon = 0, total_harga;
        String ket;

        System.out.print("Input Total Belanja :");
        total_belanja = sc.nextDouble();

        if (total_belanja >= 500000) {
            diskon = 0.20;
        } else if (total_belanja >= 200000) {
            diskon = 0.10;
        } else {
            ket = "Tidak ada diskon";
        }

        total_harga = total_belanja - (total_belanja * diskon);
        System.out.println("Total Bayar : " + total_harga);
    }
}
