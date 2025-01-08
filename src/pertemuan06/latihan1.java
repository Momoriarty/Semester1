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
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ket = null;
        int nilai;

        System.out.print("Nilai : ");
        nilai = sc.nextInt();

        if (nilai > 50) {
            ket = "Lulus";
        }

        System.out.println("Keterangan :" + ket);
    }
}
