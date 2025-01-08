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
public class latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;

        System.out.print("Username :");
        username = sc.nextLine();
        System.out.print("Password :");
        password = sc.nextLine();

        System.out.println(username.equals("admin") || password.equals("1234"));
    }
}
//Arifin