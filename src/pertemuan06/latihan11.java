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
public class latihan11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bulan;

        System.out.print("Masukkan Bulan 1-12 :");
        bulan = sc.nextInt();

        if (bulan < 1 || bulan > 12) {
            System.out.println("Bulan Tidak Valid");
        } else {
            if (bulan == 2) {
                System.out.println("Bulan Februari");
            }
            if (bulan % 2 == 0) {
                System.out.println("Bulan Genap");
            } else {
                System.out.println("Bulan Ganjil");
            }
        }
    }
}
