
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int total = 0;

        System.out.print("A :");
        a = sc.nextInt();

        int hasil = (int) (Math.pow(a, 2) + Math.pow(a, 3) + Math.pow(a, 4) + Math.pow(a, 5));
        System.out.println("Hasil: " + hasil);

    }
}
//Arifin

//        for (int pangkat = 0; pangkat <= 5; pangkat++) {
//            int hasil = (int) Math.pow(a, pangkat); // hitung pangkat dan simpan di hasil
//            total += hasil; // Tambahkan hasil ke total
//            System.out.println("hasil setelah pangkat " + a + " ^ " + pangkat + ": " + hasil);
//        }
//
//        System.out.println("Total hasil: " + total); // tampilkan total akhir
//
//        Scanner sc = new Scanner(System.in);
//        int a;
//        int[] pangkat = {2, 3, 4, 5};
//        int hasil = 0;
//        int total = 0;
//
//        System.out.print("A :");
//        a = sc.nextInt();
//
//        for (int i = 0; i < pangkat.length; i++) {
//            hasil = (int) Math.pow(a, pangkat[i]); // hitung pangkat dan tambahkan ke hasil
//
//            total += hasil;
//            System.out.println("hasil setelah pangkat " + a + " " + pangkat[i] + ": " + hasil);
//        }
//
//        System.out.println("Total hasil: " + total); // tampilkan total akhir
//    

