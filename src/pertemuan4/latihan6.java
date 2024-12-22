/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author LAB282
 */
public class latihan6 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("AND Kondisi:");
        System.out.println("Status 1: " + ((a > b) && (a >= b)));
        System.out.println("Status 2: " + ((a > b) && (a < b)));
        System.out.println("Status 3: " + ((a == b) && (a >= b)));
        System.out.println("Status 4: " + ((a != b) && (a <= b)));

        System.out.println("\nOR Kondisi:");
        System.out.println("Status 1: " + ((a > b) || (a >= b)));
        System.out.println("Status 2: " + ((a > b) || (a < b)));
        System.out.println("Status 3: " + ((a == b) || (a >= b)));
        System.out.println("Status 4: " + ((a != b) || (a <= b)));

        System.out.println("\nXOR Kondisi:");
        System.out.println("Status 1: " + ((a > b) ^ (a >= b)));
        System.out.println("Status 2: " + ((a > b) ^ (a < b)));
        System.out.println("Status 3: " + ((a == b) ^ (a >= b)));
        System.out.println("Status 4: " + ((a != b) ^ (a <= b)));
    }
}
//Arifin

//        int a = 5;
//        int b = 3;
//
//        boolean[] statusand = {
//            (a > b) && (a >= b),
//            (a > b) && (a < b),
//            (a == b) && (a >= b),
//            (a != b) && (a <= b)
//        };
//
//        System.out.println("\nXOR Conditions:");
//        for (int i = 0; i < statusand.length; i++) {
//            System.out.println("Status " + (i + 1) + ": " + statusand[i]);
//        }
//
//        boolean[] statusor = {
//            (a > b) || (a >= b),
//            (a > b) || (a < b),
//            (a == b) || (a >= b),
//            (a != b) || (a <= b)
//        };
//
//        System.out.println("\nXOR Conditions:");
//        for (int i = 0; i < statusor.length; i++) {
//            System.out.println("Status " + (i + 1) + ": " + statusor[i]);
//        }
//
//        boolean[] statuses = {
//            (a > b) ^ (a >= b),
//            (a > b) ^ (a < b),
//            (a == b) ^ (a >= b),
//            (a != b) ^ (a <= b)
//        };
//
//        System.out.println("\nXOR Conditions:");
//        for (int i = 0; i < statuses.length; i++) {
//            System.out.println("Status " + (i + 1) + ": " + statuses[i]);
//        }

