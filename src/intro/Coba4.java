/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Coba4 {

    public static void main(String[] args) {
        int alas, tinggi;
        double luas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Alas :");
        alas = sc.nextInt();

        System.out.print("Tinggi :");
        tinggi = sc.nextInt();

        luas = (double) (alas * tinggi) / 2;
        System.out.println("luas : " + luas);
    }
}
