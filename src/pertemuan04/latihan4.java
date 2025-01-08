/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double luas;
        double alas;
        double tinggi;
        double sisi_miring;

        System.out.print("Masukan Alas : ");
        alas = sc.nextDouble();
        System.out.print("Masukan Tinggi : ");
        tinggi = sc.nextDouble();

        luas = alas * tinggi * 0.5;
        System.out.println("Luas :" + luas);

        sisi_miring = Math.sqrt(alas) + Math.sqrt(tinggi);
        System.out.print("Sisi miring :" + sisi_miring);

    }
}
//Arifin