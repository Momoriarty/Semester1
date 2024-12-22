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
import java.util.Scanner;

public class latihan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMahasiswa = new String[3];
        double[] nilaiMahasiswa = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
            System.out.print("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ": ");
            nilaiMahasiswa[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalNilai = 0;
        for (int i = 0; i < 3; i++) {
            totalNilai += nilaiMahasiswa[i];
        }
        double rataRata = totalNilai / 3;

        int jumlahDiAtasRataRata = 0;
        for (int i = 0; i < 3; i++) {
            if (nilaiMahasiswa[i] > rataRata) {
                jumlahDiAtasRataRata++;
            }
        }

        System.out.println("\nNama\t\tNilai");
        for (int i = 0; i < 3; i++) {
            System.out.println(namaMahasiswa[i] + "\t\t" + nilaiMahasiswa[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Ada " + jumlahDiAtasRataRata + " nilai yang di atas rata-rata");

    }
}
