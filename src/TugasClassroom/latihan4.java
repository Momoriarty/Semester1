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
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genap = 0, ganjil = 0;
        int[] angka = new int[10];
        System.out.println("Input 10 Angka : ");
        for (int i = 0; i < 10; i++) {
            angka[i] = sc.nextInt();
        }
        for (int data : angka) {
            if (data % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }
        
        System.out.println("Jumlah Bilangan Ganjil : " + ganjil);
        System.out.println("Jumlah Bilangan Genap : " + genap);
    }
}
