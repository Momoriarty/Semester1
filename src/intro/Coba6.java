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
public class Coba6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nuts, nuas;
        double total;
        String nama;

        System.out.print("Nama :");
        nama = sc.nextLine();
        System.out.print("Nilai UTS :");
        nuts = sc.nextInt();
        System.out.print("Nilai UAS :");
        nuas = sc.nextInt();

        total = (nuts + nuas) * 0.5;
        boolean status = total > 60;

        System.out.println("Status : " + status);
    }
}