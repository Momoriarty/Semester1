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
public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, d;
        double c = 3;

        System.out.print("A :");
        a = sc.nextDouble();
        System.out.print("B :");
        b = sc.nextDouble();

        d = a + a * b + 11;
        System.out.println(d);
        d = a - a * b / 4 + 3;
        System.out.println(d);
        d = a / a + b * 100;
        System.out.println(d);
        d = a * a - b % 4;
        System.out.println(d);
        d = a + a / b % 3;
        System.out.println(d);
        d = a % a + b * 10;
        System.out.println(d);
        d = a + a * b + c++;
        System.out.println(d);
        d = a * a - b + 151;
        System.out.println(d);
    }
}

// System.out.println(a += a * b + 11);
//        System.out.println(a -= b / 4 + 3);
//        System.out.println(a /= a + b * 100);
//        System.out.println(a *= a - b % 4);
//        System.out.println(a += a / b % 3);
//        System.out.println(a %= a + b * 10);
//        System.out.println(a += a * b + c++);
//        System.out.println(a *= a - b + 151);
