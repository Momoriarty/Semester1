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
public class soal4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukin Angka 1-7 :");
        int hari = sc.nextInt();
        String ket;

        switch (hari) {
            case 1:
                ket = "Senin";
                break;
            case 2:
                ket = "Selana";
                break;
            case 3:
                ket = "Rabu";
                break;
            case 4:
                ket = "Kamis";
                break;
            case 5:
                ket = "Jumat";
                break;
            case 6:
                ket = "Sabtu";
                break;
            case 7:
                ket = "Minggu";
                break;
            default:
                ket = "Angka yang anda masukkan tidak valid";
                break;
        }

        System.out.println(ket);
    }
}
