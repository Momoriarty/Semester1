/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan09;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Berapa Bilangan..? :");
        int angka = sc.nextInt();
        int i = 1;
        while (i <= angka) {
            System.out.println(i);
            a = a + i;
            i++;
        }
        System.out.println("Total Bilangan : " + a);
    }
}
