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
public class latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suhu;
        String ket;

        System.out.print("Input Suhu :");
        suhu = sc.nextInt();

        if (suhu >= 30) {
            ket = "Cuaca Panas!";
        } else if (suhu < 30 && suhu >= 15) {
            ket = "Cuaca Sedang";
        } else {
            ket = "Cuaca Dingin";
        }
        System.out.println(ket);
    }
}
