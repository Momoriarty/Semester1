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
public class Coba5 {

    public static void main(String[] args) {
        double r, luas, phi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Jari-jari :");
        r = sc.nextDouble();

        luas = phi * Math.pow(r, 2);
        System.out.println("luas : " + luas);
    }
}
