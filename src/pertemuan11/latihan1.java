/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiArray = new int[5];
        int nilai, nilaiterkecil;

        for (int i = 0; i < 5; i++) {
            System.out.print("Bilangan ke " + (i + 1) + ": ");
            nilai = sc.nextInt();
            nilaiArray[i] = nilai;
        }

        nilaiterkecil = nilaiArray[0];

        for (int i = 1; i < nilaiArray.length; i++) {
            if (nilaiArray[i] < nilaiterkecil) {
                nilaiterkecil = nilaiArray[i];
            }
        }

        System.out.println("Bilangan Terkecil: " + nilaiterkecil);
    }
}
