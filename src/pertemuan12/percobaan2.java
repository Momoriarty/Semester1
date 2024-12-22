/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

/**
 *
 * @author LAB282
 */
public class percobaan2 {

    public static void main(String[] args) {
        int i = 0, elemen;

        int[] a = {13, 20, 32};

        System.out.println("Looping array menggunakan Foreach");
        for (int angka : a) {
            elemen = i + 1;
            System.out.println("Elemen " + elemen + ":" + angka);
            i++;
        }
        System.out.println();
        System.out.println("Accesing With For");
        for (int j = 0; j < a.length; j++) {
            System.out.println("Elemen " + a[j]);
        }
    }
}
