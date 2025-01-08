/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan06;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int angka3 = sc.nextInt();

        int terbesar = angka1;
        if (angka2 > terbesar) {
            terbesar = angka2;
        }
        if (angka3 > terbesar) {
            terbesar = angka3;
        }
        System.out.println("Angka terbesar di antara ketiga angka tersebut adalah: " + terbesar);
    }
}
