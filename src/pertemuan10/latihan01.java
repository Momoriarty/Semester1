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
public class latihan01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, countGanjil = 0, countGenap = 0;

        System.out.print("Input Bilangan : ");
        int nilai = sc.nextInt();
        System.out.println("Deret Bilangan :");

        while (i <= nilai) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                countGenap++;
            } else {
                countGanjil++;
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("Banyak Genap :" + countGenap);
        System.out.println("Banyak Ganjil :" + countGanjil);
    }
}
