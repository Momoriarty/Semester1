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
public class latihan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int nilai;
        int i = 1;
        System.out.println("No \tNama \tNilai");
        do {
            System.out.print(i + "\t");
            nama = sc.next();
            System.out.println("\t");
            nilai = sc.nextInt();
            System.out.println("");
            i++;

        } while (i <= 5);

    }
}
