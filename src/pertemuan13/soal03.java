/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nama = new String[5];

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
        }

        //Menampilkan array menggunakan ForEach
        for (String data : nama) {
            System.out.print(data + " ");
        }

        System.out.println("");
        //Menampilkan array menggunakan toString
        System.out.println(Arrays.toString(nama));
    }
}
