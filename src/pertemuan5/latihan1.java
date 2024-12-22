/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int x, z, h;

        System.out.println("Nilai A :" + a);
        System.out.print("Nilai X :");
        x = sc.nextInt();

        h = x * a++;
        System.out.println("z : " + h);
        h = x * ++a;
        System.out.println("z : " + h);
        h = x * a--;
        System.out.println("z : " + h);
        h = x * --a;
        System.out.println("z : " + h);
    }
}
