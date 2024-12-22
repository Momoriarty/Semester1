/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah data mahasiswa : ");
        int jumlah = sc.nextInt();
        int[] nim = new int[jumlah];
        String[] mahasiswa = new String[jumlah];
        String[] jurusan = new String[jumlah];
        System.out.println("Data mahasiswa yang dimasukan");
        System.out.println("------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke " + (i + 1));
            System.out.print("NIM       : ");
            int inim = sc.nextInt();
            nim[i] = inim;
            System.out.print("Mahasiswa : ");
            String mhs = sc.next();
            mahasiswa[i] = mhs;
            System.out.print("Jurusan   : ");
            String js = sc.next();
            jurusan[i] = js;
            System.out.println("");
        }

        System.out.println("NIM \tNama \tJurusan");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(nim[i] + "\t" + mahasiswa[i] + "\t" + jurusan[i]);
        }

    }
}
