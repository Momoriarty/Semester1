/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mau berapa hitungan mundur..? :");
        int nilai = sc.nextInt();
        System.out.println("Hitung mundur roket meluncur:");
        for (int i = 1; nilai >= i; --nilai) {
            System.out.print(nilai + " ");
            if (nilai == 1) {
                System.out.print("-->Goo!!");
            }
        }
    }
}
