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
public class latihan6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka1, angka2;
        String ket;
        
        System.out.print("Angka 1 :");
        angka1 = sc.nextInt();

        System.out.print("Angka 2 :");
        angka2 = sc.nextInt();

        if (angka1 > angka2) {
            ket = "Angka Pertama Lebih Besar";
        } else if (angka1 == angka2) {
            ket = "Angka Pertama sama dengan Angka Kedua";
        } else {
            ket = "Angka Kedua Lebih besar";
        }
        System.out.println(ket);
    }
}
