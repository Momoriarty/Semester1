/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan05;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.println("Hasil a & b: " + (a & b));
        System.out.println("Hasil a | b: " + (a | b));
        System.out.println("Hasil a ^ b: " + (a ^ b));
    }
}
