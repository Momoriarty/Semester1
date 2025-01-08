/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status;
        int a, b;

        System.out.print("A :");
        a = sc.nextInt();

        System.out.print("B :");
        b = sc.nextInt();

        status = a > b;
        System.out.println(a + " > " + b + " " + status);

        status = a >= b;
        System.out.println(a + " >= " + b + " " + status);

        status = a < b;
        System.out.println(a + " < " + b + " " + status);

        status = a <= b;
        System.out.println(a + " <= " + b + " " + status);

        status = a == b;
        System.out.println(a + " == " + b + " " + status);

        status = a != b;
        System.out.println(a + " != " + b + " " + status);
    }
}
//Arifin