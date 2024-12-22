/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasClassroom;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("Input 10 Angka");
        for (int i = 0; i < 10; i++) {
            angka[i] = sc.nextInt();
        }

        System.out.println("Angka dalam urutan kebalik");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + "");
        }
    }
}
