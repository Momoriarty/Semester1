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
public class Coba3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang :");
        int panjang = sc.nextInt();

        System.out.print("Lebar :");
        int lebar = sc.nextInt();

        if (panjang != lebar) {
            int luas = panjang * lebar;
            System.out.println("luas : " + luas);
        } else {
            System.out.println("Hello world");
        }
    }
}
