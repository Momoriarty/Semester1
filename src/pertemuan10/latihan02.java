/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, countGanjil = 0, countGenap = 0, total = 0, nilai = 0;

        do {
            System.out.print("Bilangan ke " + i + " : ");
            nilai = sc.nextInt();

            total = total + nilai;
            if (nilai % 2 == 0) {
                countGenap++;
            } else {
                countGanjil++;
            }

            i++;
        } while (i <= 5);
        System.out.println(" ");
        System.out.println("Banyak Genap :" + countGenap);
        System.out.println("Banyak Ganjil :" + countGanjil);
        System.out.println("Total :" + total);
    }
}
