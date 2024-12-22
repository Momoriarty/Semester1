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
public class latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        boolean status = true;
        String username = null;
        

        while (i <= 3 && status == true) {
            username = JOptionPane.showInputDialog("Masukkan username ke-" + i);
            System.out.println("username Ke-" + i + ": " + username);

            if ("admin".equalsIgnoreCase(username)) {
                System.out.println("Login Berhasil");
                status = false;
            } else {
                System.out.println("Login Gagal");
                if (i == 3) {
                    status = false;
                }
                if (status == false) {
                    System.out.println("Anda Tidak boleh masuk");
                }

            }
            i++;

        }

    }
}
