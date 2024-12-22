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
public class latihan1 {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        int total = 0;
        for (int value : data) {
            total += value;
        }

        System.out.println(total + 1);
        System.out.println(data[0] + 1 + " " + (data[3] + 5) + " " + (data[5] + 1));
        for (int value : data) {
            System.out.print(value + 5 + " ");
            
        }
    }
}
