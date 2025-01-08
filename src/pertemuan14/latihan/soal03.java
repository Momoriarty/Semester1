package pertemuan14.latihan;

public class soal03 {

    public static void main(String[] args) {
        int data[][] = new int[3][3], nilai = 0;
        int matriks[][] = new int[3][3];
        // int total[][] = new int[3][3];

        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                data1[j] = nilai += 2;
                System.out.print(data1[j] + "\t");

            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                if (i == j) {
                    matriks[i][j] = 1;
                } else {
                    matriks[i][j] = 0;
                }
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // total[i][j] = data[i][j] + matriks[i][j];
                System.out.print(data[i][j] + matriks[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
