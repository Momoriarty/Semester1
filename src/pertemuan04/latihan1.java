/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan1 {

    public static void main(String[] args) {
        boolean status;
        int produk = 3700;
        double total;
        double diskon;
        int jumlah;

        Scanner sc = new Scanner(System.in);

        System.out.println("Harga produk satuan :" + produk);
        System.out.print("Jumlah Pembelian :");
        jumlah = sc.nextInt();

        total = produk * jumlah;
        status = total > 50000;

        if (status == true) {
            diskon = 0.10;
            double total_diskon = total * diskon;
            double nominal = total - total_diskon;
            System.out.println("Total  :" + total);
            System.out.println("Total diskon :" + total_diskon);
            System.out.println("________________________ -");
            System.out.println("Total Pembayaran :" + nominal);
            System.out.println("Status diskon : Dapat");
        } else {
            System.out.println("Total Pembayaran :" + total);
            System.out.println("Status diskon : Tidak Dapat");
        }
    }
}
//Arifin