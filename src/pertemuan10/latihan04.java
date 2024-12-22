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
public class latihan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, nilai, terbesar = 0;
        while (i <= 5) {
            System.out.print("Bilangan ke " + i + ":");
            nilai = sc.nextInt();

            if (nilai > terbesar) {
                terbesar = nilai;
            }
            i++;
        }
        System.out.println("Bilangan Terbesar: " + terbesar);
    }
}
