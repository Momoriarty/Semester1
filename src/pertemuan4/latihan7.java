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
public class latihan7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A :");
        int a = sc.nextInt();
        
        boolean status = a > 0 && a <= 10 ;
        System.out.print("Status;" + status);
    }
}
//Arifin