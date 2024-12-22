/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ket;
        System.out.print("Input Usia :");
        int usia = sc.nextInt();

        if (usia < 12 && usia >= 0) {
            ket = "Anak-anak";
        } else if (usia >= 12 && usia <= 19) {
            ket = "Remaja";
        } else if (usia >= 20 && usia <= 59) {
            ket = "Dewasa";
        } else if (usia > 60) {
            ket = "Lansia";
        } else {
            ket = "Usia tidak valid";
        }
        System.out.println(ket);
    }
}
