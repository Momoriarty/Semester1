/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class kuis1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gb, gpb, t, p;
//        gpb = gaji pokok bersih
//        gb = gaji  bersih
//        t = tunjangan
//        p = pajak
        String nk;
//        nk = nama karyawan

        System.out.print("Nama Karyawan: ");
        nk = sc.next();
        System.out.print("Gaji Pokok : ");
        gpb = sc.nextDouble();

        t = gpb * 0.20;
        p = gpb * 0.15 + t;
        gb = gpb + t - p;

        System.out.println("Tunjangan :" + t);
        System.out.println("Pajak : " + p);
        System.out.println("Gaji Bersih :" + gb);
    }
}
