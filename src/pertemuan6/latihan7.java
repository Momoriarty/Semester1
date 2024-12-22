/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        String ket;

        System.out.print("Input Nilai :");
        nilai = sc.nextInt();

        if (nilai >= 75 && nilai <= 100) {
            ket = "Selamat, Anda Lulus!";
        } else if (nilai < 75 && nilai >= 50) {
            ket = "Anda Harus belajar lebih giat";
        } else if (nilai < 50) {
            ket = "Anda gagal, Coba lagi";
        } else {
            ket = "Nilai Tidak Valid, Coba lagi";
        }
        System.out.println(ket);
    }
}
