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
public class latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int total;
        System.out.print("Banyak Perkalian :");
        total = sc.nextInt();
        System.out.print("Pengali :");
        int kali = sc.nextInt();
        do {
            System.out.println(i + " x " + kali + " = " + (i * kali));
            i++;
        } while (i <= total);

    }
}
