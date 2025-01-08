/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan07;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukin Angka Pertama:");
        angka1 = sc.nextDouble();
        System.out.print("Pilih Operator (+, -, /, *):");
        operator = sc.next().charAt(0);
        System.out.print("Masukin Angka Kedua:");
        angka2 = sc.nextDouble();
        String ket;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Angka kedua tidak boleh 0");
                }
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }

        System.out.println(hasil);
    }
}
