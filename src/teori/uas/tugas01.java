package teori.uas;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;

public class tugas01 {

    public static void main(String[] args) {
        boolean status = true;

        while (status) {
            int aksi = Integer.parseInt(JOptionPane.showInputDialog("Pilih Aksi Yang Diinginkan: \n 1.Pemantauan Kemajuan Proyek \n 2.Exit"));

            switch (aksi) {
                case 1:
                     int jp = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Proyek yang sedang dikelola:"));
                    String[][] proyek = new String[jp][3];
                    int total[] = new int[jp];

                    for (int i = 0; i < proyek.length; i++) {
                        proyek[i][0] = JOptionPane.showInputDialog("Masukkan nama proyek ke-" + (i + 1));
                        for (int j = 0; j < 5; j++) {
                            int kemajuan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan persentase kemajuan tahapan " + (j + 1) + " untuk proyek " + proyek[i][0]));
                            total[i] += kemajuan;
                        }
                        total[i] = total[i] / 5;
                        proyek[i][1] = String.valueOf(total[i]);
                        proyek[i][2] = total[i] == 100 ? "Selesai"
                                : total[i] >= 50 ? "Dalam Proses" : "Tertunda";
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
