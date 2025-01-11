package teori.uas;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;

public class tugas01 {

    public static void main(String[] args) {
        int jp = 0, aksi;
        boolean status = true;

        while (status) {
            aksi = Integer.parseInt(JOptionPane.showInputDialog("Pilih Aksi Yang Diinginkan: \n 1.Pemantauan Kemajuan Proyek \n 2.Exit"));

            switch (aksi) {
                case 1:
                    jp = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Proyek yang sedang dikelola:"));
                    String[][] proyek = new String[jp][3];
                    int total[] = new int[jp];

                    for (int i = 0; i < proyek.length; i++) {
                        for (int j = 0; j < proyek[i].length; j++) {
                            if (j == 0) {
                                proyek[i][0] = JOptionPane.showInputDialog("Masukkan nama proyek ke-" + (i + 1));
                            } else if (j == 1) {
                                for (int k = 0; k < 5; k++) {
                                    int kemajuan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan persentase kemajuan tahapan " + (k + 1) + " untuk proyek " + proyek[i][0]));
                                    total[i] += kemajuan;
                                }
                                total[i] = total[i] / 5;
                                proyek[i][1] = String.valueOf(total[i]);
                                if (total[i] == 100) {
                                    proyek[i][2] = "Selesai";
                                } else if (total[i] >= 50) {
                                    proyek[i][2] = "Dalam Proses";
                                } else {
                                    proyek[i][2] = "Tertunda";
                                }
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Hasil Perhitungan Dapat dilihat pada Terminal");

                    System.out.println("------------------------------------------------");
                    System.out.println("Laporan Kemajuan Projek");
                    System.out.println("------------------------------------------------");
                    for (String[] proyek1 : proyek) {
                        System.out.println("Proyek : " + proyek1[0]);
                        System.out.println("Rata-Rata Kemajuan : " + proyek1[1] + "%");
                        System.out.println("Status : " + proyek1[2]);
                    }
                    System.out.println("------------------------------------------------");
                    break;

                case 2:
                    status = false;
                    System.out.println("Anda Keluar dari sistem");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid, silahkan coba lagi");
            }

        }
    }
}
