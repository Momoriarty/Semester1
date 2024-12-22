/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bilangan = new int[10];

        System.out.println("Input 10 Bilangan, kisaran 1-5 :");
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = sc.nextInt();
            while (bilangan[i] < 1 || bilangan[i] > 5) {
                System.out.println("Tidak Valid");
                bilangan[i] = sc.nextInt();
            }
        }

        for (int i = 1; i <= 5; i++) {
            int count = 0;
            for (int j = 0; j < bilangan.length; j++) {
                if (bilangan[j] == i) {
                    count++;
                }
            }
            System.out.println("Angka " + i + " muncul : " + count + " kali");
        }
    }
}
