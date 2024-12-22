/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char ch : charArray) {
            if (!isVowel(ch)) {
                result.append(ch);  
            }
        }

        System.out.println("Output: " + result.toString());
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
