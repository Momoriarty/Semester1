/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan09;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input Nama Ke-" + i + ":");
            nama = sc.nextLine();
        }
    }
}
// String[] nama = {"Ali", "Budi", "Cici", "Dewi"};   
//        for (String s : nama) {
//            System.out.println(s);
//        }
