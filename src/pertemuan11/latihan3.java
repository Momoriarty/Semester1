/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        boolean prima = false;

        System.out.print("Input Bilangan : ");
        nilai = sc.nextInt();

        for (int i = 2; i <= nilai; i++) {
            prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println(i + " ");
            }
        }

    }
}
