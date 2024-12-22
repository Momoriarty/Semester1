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
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int i = 1;
        do {
            System.out.print("Input Nama Ke-" + i + ":");
            nama = sc.nextLine();
            i++;
        } while (i <= 5);

    }
}
