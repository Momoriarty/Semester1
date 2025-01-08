package pertemuan14.latihan;

public class soal02 {

    public static void main(String[] args) {
        int angka[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 2, 3}
        }, no = 0;

        for (int[] angka1 : angka) {
            for (int i = 0; i < angka1.length; i++) {
                System.out.print(angka1[i] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int[] angka1 : angka) {
            int totalb = 0;
            for (int i = 0; i < angka1.length; i++) {
                totalb += angka1[i];
            }
            System.out.println("Baris " + no++ + " :" + totalb);
        }
        System.out.println(" ");
        no = 0;
        for (int j = 0; j < angka[j].length; j++) {
            int totalk = 0;
            for (int[] angka1 : angka) {
                totalk += angka1[j];
            }
            System.out.println("Kolom " + no++ + " :" + totalk);
        }

    }
}
