/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasClassroom;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class latihan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("Input 10 Angka (1-5)");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            while (num < 1 || num > 5) {
                System.out.println("Angka harus antara 1 dan 5. Masukkan lagi:");
                num = sc.nextInt();
            }
            angka[i] = num;
        }

        for (int i = 1; i <= 5; i++) {
            int count = 0;
            for (int j = 0; j < angka.length; j++) {
                if (angka[j] == i) {
                    count++;
                }
            }
            System.out.println("Angka " + i + " muncul : " + count + " kali");
        }

    }
}
