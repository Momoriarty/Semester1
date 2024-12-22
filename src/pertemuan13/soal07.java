/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class soal07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka[][] = new int[2][3];
        int ganjil = 0, genap = 0;

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                angka[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inpun Nilai : "));
                System.out.print(angka[i][j] + " ");
                if (angka[i][j] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }
            System.out.println("");
        }
        System.out.println("Genap  :" + genap);
        System.out.println("Ganjil :" + ganjil);

    }
}
