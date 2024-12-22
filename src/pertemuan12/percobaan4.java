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
 * @author
 */
public class percobaan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data2 = new int[4];
        int jumlah = 0;
        double avg;

        for (int i = 0; i <= data2.length - 1; i++) {
            System.out.print("Masukkan elemen array ke- " + (i + 1) + ":");
            int a = sc.nextInt();
            data2[i] = a;
            jumlah += data2[i];
        }

        System.out.print("Elemen-elemen yang ada pada array : ");
        // System.out.println(Arrays.toString(data2));
        int index = 0;
        do {
            System.out.print(data2[index] + " ");
            index++;
        } while (index < data2.length);

        System.out.println("");
        avg = jumlah / data2.length;
        System.out.println("Rata-rata bilangan yang ada pada array : " + avg);
    }
}
