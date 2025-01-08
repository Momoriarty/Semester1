/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan06;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ket, huruf;

        System.out.print("Huruf :");
        huruf = sc.nextLine();

        if ("a".equalsIgnoreCase(huruf)) {
            ket = "Huruf Adalah : " + huruf;
        } else {
            ket = "Huruf Bukan A";
        }
        
        System.out.println(ket);
    }
}
