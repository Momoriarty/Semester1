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
public class soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        String ket = null, kode = null;

        System.out.print("Input Nilai :");
        nilai = sc.nextInt();

        if (nilai >= 81 && nilai <= 100) {
            ket = "Istimewa!";
            kode = "A";
        } else if (nilai >= 76 && nilai <= 80) {
            ket = "Amat Baik";
            kode = "AB";
        } else if (nilai >= 66 && nilai <= 75) {
            ket = "Baik";
            kode = "B";
        } else if (nilai >= 61 && nilai <= 65) {
            ket = "Cukup Baik";
            kode = "CB";
        } else if (nilai >= 51 && nilai <= 60) {
            ket = "Cukup";
            kode = "C";
        } else if (nilai >= 0 && nilai <= 50) {
            ket = "Tidak Lulus";
            kode = "F";
        }
        System.out.println(kode + " " + ket);
    }
}
