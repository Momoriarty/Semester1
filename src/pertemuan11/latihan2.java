/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai = 0, pasangan1 = 0, pasangan2 = 0;

        while (nilai != 3) {
            nilai = Integer.parseInt(JOptionPane.showInputDialog("1.Pasangan Amir - Amar\n"
                    + " 2.Pasangan Amir - Amar\n 3.<<exit>"));
            switch (nilai) {
                case 1:
                    pasangan1++;
                    break;
                case 2:
                    pasangan2++;
                    break;
                default:
                    System.out.println("Pilihan Pasangan 1 :" + pasangan1);
                    System.out.println("Pilihan Pasangan 2 :" + pasangan2);
                    break;
            }
        }

    }
}
