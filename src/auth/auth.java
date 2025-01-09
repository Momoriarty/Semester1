package auth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class auth {

    public static void main(String[] args) {
        boolean status = true;
        int pilihan = 0;

        while (status) {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("1.Register \n 2.Login \n 3.Lihat Akun Tersedia \n 4.Exit "));

            switch (pilihan) {
                case 1:
                    // Register
                    String username = JOptionPane.showInputDialog("Input Username");
                    String password = JOptionPane.showInputDialog("Input Password");

                    // Menyimpan data username dan password ke file
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/auth/test.txt", true))) {
                        writer.write(username + "," + password);
                        writer.newLine();
                        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan ke file src/auth/test.txt!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menulis ke file: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Login
                    String inputUsername = JOptionPane.showInputDialog("Input Username untuk Login");
                    String inputPassword = JOptionPane.showInputDialog("Input Password untuk Login");

                    boolean loginSuccessful = false;

                    try (BufferedReader reader = new BufferedReader(new FileReader("src/auth/test.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] credentials = line.split(",");
                            if (credentials.length == 2) {
                                String storedUsername = credentials[0];
                                String storedPassword = credentials[1];

                                // Periksa apakah username dan password cocok
                                if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
                                    loginSuccessful = true;
                                    break;
                                }
                            }
                        }

                        if (loginSuccessful) {
                            JOptionPane.showMessageDialog(null, "Login berhasil!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                        }

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat membaca file: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Lihat Akun Tersedia
                    try (BufferedReader reader = new BufferedReader(new FileReader("src/auth/test.txt"))) {
                        String line;
                        StringBuilder accountsList = new StringBuilder("Akun yang Terdaftar:\n");

                        while ((line = reader.readLine()) != null) {
                            String[] credentials = line.split(",");
                            if (credentials.length == 2) {
                                accountsList.append("Username: ").append(credentials[0])
                                        .append(", Password: ").append(credentials[1])
                                        .append("\n");
                            }
                        }

                        if (accountsList.length() > 0) {
                            JOptionPane.showMessageDialog(null, accountsList.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Tidak ada akun terdaftar.");
                        }

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat membaca file: " + e.getMessage());
                    }
                    break;

                case 4:
                    // Exit
                    JOptionPane.showMessageDialog(null, "Program Selesai");
                    status = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak sesuai, Mohon pilih urutan angka yang tersedia");
                    break;
            }
        }
    }
}
