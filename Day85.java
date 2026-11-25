import java.util.Scanner;
public class Day85 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Masukkan jumlah angka: ");
    int jumlah = s.nextInt();

    int[] angka = new int[jumlah];

    for (int i = 0; i < angka.length; i++) {
        System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
        angka[i] = s.nextInt();
    }

    int terkecil = angka[0];

    for (int i = 1; i < angka.length; i++) {
        if (angka[i] < terkecil) {
            terkecil = angka[i];
        }
    }

    System.out.println("\n=== Hasil ===");
    System.out.println("Angka terkecil: " + terkecil);

    s.close();
    }
}
