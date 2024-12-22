/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Input Tahun : ");
        tahun = sc.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("Ini tahun Kabisat");
        } else {
            System.out.println("Ini bukan tahun Kabisat");
        }
    }
}
