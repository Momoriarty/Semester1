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
public class soal01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        for (int data : angka) {
            System.out.print(data + " ");
        }
    }
} 
