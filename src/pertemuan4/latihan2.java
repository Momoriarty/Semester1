/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c;
        double f;

        System.out.print("Celcius :");
        c = sc.nextDouble();

        f = 1.8 * c + 32;
        System.out.println("Fahrenheit :" + f);
    }
}
//Arifin