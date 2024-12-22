/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class percobaan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data1 = new int[4];
        String[] data2 = new String[4];

        data1[0] = 1;
        data1[1] = 2;
        data1[3] = 4;

        System.out.println(Arrays.toString(data1));

        System.out.println("Accesing With For");
        for (int i = 0; i < data1.length; i++) {
            System.out.println("Elemen : " + data1[i]);
        }

        data1[1] = 200;
        data1[3] = 301;

        System.out.println();
        System.out.println("Menginput element via looping");
        for (int i = 0; i < data2.length; i++) {
            System.out.print("masukkan Elemen array ke-" + i + ":");
            String a = sc.next();
            data2[i] = a;
        }
        System.out.println("Elemen-elemen yang ada pada Array:");
//        System.out.println(Arrays.toString(data2));
        int index = 0;
        while (index < data2.length) {
            System.out.print(data2[index] + " ");
            index++;
        }
    }
}
