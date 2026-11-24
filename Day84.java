import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlah = s.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

        int terbesar = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        System.out.println("\n=== HASIL ===");
        System.out.println("Angka terbesar: " + terbesar);

        s.close();
    }
}
