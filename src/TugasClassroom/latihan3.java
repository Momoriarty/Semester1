package TugasClassroom;

import java.util.Scanner;

public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[10];
        int terbesar = Integer.MIN_VALUE, terkecil = Integer.MAX_VALUE, total = 0;

        System.out.println("Input 10 Angka");
        for (int i = 0; i < 10; i++) {
            angka[i] = sc.nextInt();
            terbesar = Math.max(terbesar, angka[i]);
            terkecil = Math.min(terkecil, angka[i]);
            total += angka[i];
        }

        double rata = total / 10.0;
        System.out.println("Angka Terbesar :" + terbesar);
        System.out.println("Angka Terkecil :" + terkecil);
        System.out.println("Angka Rata-rata:" + rata);

        System.out.print("Angka Lebih besar dari rata-rata : ");
        for (int i = 0; i < 10; i++) {
            if (angka[i] > rata) {
                System.out.print(angka[i] + " ");
            }
        }
    }
}
