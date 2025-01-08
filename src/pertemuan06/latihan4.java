/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan06;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        String ket;

        System.out.print("Usia :");
        usia = sc.nextInt();

        if (usia < 18) {
            ket = "Anda masih remaja";
        } else {
            ket = "Anda sudah dewasa";
        }
        System.out.println(ket);
    }
}
