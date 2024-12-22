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
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String ket;

        System.out.print("Angka :");
        angka = sc.nextInt();

        if (angka > 10) {
            ket = "Angka Lebih besar dari 10";
        } else {
            ket = "Angka Lebih kecil dari 10";
        }
        System.out.println(ket);
    }
}
