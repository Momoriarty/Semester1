/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan07;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kupon, ket;

        System.out.print("Masukin kode kupon:");
        kupon = sc.next().toUpperCase();

        switch (kupon) {
            case "SAVE10":
                ket = "Diskon: 10%";
                break;
            case "SAVE20":
                ket = "Diskon: 20%";
                break;
            case "SAVE30":
                ket = "Diskon: 30%";
                break;
            case "None":
                ket = "Tidak ada diskon";
                break;
            default:
                ket = "Kode kupon tidak valid";
                break;
        }

        System.out.println(ket);
    }
}
