package auth;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class auth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] akun = new String[2][2];

        for (String[] akun1 : akun) {
            System.out.print("Username: ");
            akun1[0] = scanner.nextLine();
            System.out.print("Password: ");
            akun1[1] = scanner.nextLine();
        }

        for (String[] data : akun) {
            System.out.println("Username: " + data[0] + ", Password: " + data[1]);
        }

        System.out.println(Arrays.deepToString(akun));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/auth/test.txt", true))) {
            for (String[] data : akun) {
                writer.write(Arrays.deepToString(akun));
                writer.newLine();
            }
            System.out.println("Data berhasil ditambahkan ke file src/auth/test.txt!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
