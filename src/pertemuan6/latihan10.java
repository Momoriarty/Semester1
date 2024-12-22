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
public class latihan10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jekel, ket;
        int usia;

        System.out.print("Masukkan Jenis Kelaamin P / L: ");
        jekel = sc.nextLine();
        System.out.print("Input Usia :");
        usia = sc.nextInt();

        if ("l".equalsIgnoreCase(jekel) && usia < 20) {
            ket = "Laki-laki Remaja";
            System.out.println(ket);
        } else if ("p".equalsIgnoreCase(jekel) && usia < 20) {
            ket = "Perempuan Remaja";
            System.out.println(ket);
        } else {
            if ("l".equalsIgnoreCase(jekel)) {
                jekel = "Laki-laki";
            } else {
                jekel = "Perempuan";
            }
            ket = "Dewasa";
            System.out.println(jekel + " " + ket);
        }
    }
}
