package teori;

import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare arrays to store data for customers
        String[] nama = new String[5];
        int[] jml_barang = new int[5];
        int[] total = new int[5];
        int total_harga = 0;
        int harga_terbesar = 0;
        int id = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nama Pelanggan Ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();

            System.out.print("Masukkan jumlah barang yang dibeli pelanggan Ke-" + (i + 1) + ": ");
            jml_barang[i] = sc.nextInt();
            total[i] = jml_barang[i] * 10000;
            System.out.println("Total Harga: " + total[i]);
            System.out.println();

            sc.nextLine();
        }

        System.out.println("Data Transaksi Pelanggan :");
        for (int j = 0; j < nama.length; j++) {
            System.out.println((j + 1) + ". Nama: " + nama[j] + ", Jumlah Barang :" + jml_barang[j] + ", Total Harga :" + total[j]);
            total_harga += total[j];
            if (total[j] > harga_terbesar) {
                harga_terbesar = total[j];
                id = j;
            }
        }

        System.out.println("Total belanja semua Pelanggan: Rp. " + total_harga);
        System.out.println("Pelanggan dengan pengeluaran terbesar adalah: Pelanggan : " + nama[id] + " dengan Harga Rp. " + harga_terbesar);

    }
}
