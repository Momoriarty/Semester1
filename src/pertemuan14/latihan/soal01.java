package pertemuan14.latihan;

import javax.swing.JOptionPane;

public class soal01 {

    public static void main(String[] args) {
        int angka[][] = new int[3][3], ganjil = 0, genap = 0, total = 0;

        for (int[] angka1 : angka) {
            for (int j = 0; j < angka1.length; j++) {
                angka1[j] = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai : "));
                System.out.print(angka1[j] + " ");
                if (angka1[j] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
                total += angka1[j];
            }
            System.out.println("");
        }
        System.out.println("Genap  :" + genap);
        System.out.println("Ganjil :" + ganjil);
        System.out.println("Total  :" + total);
    }
}
