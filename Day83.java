import java.util.Scanner;
public class Day83 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Masukkan jumlah angka: ");
        int jumlah = s.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
            sum += angka[i];
        }
        System.out.println("\n=== HASIL ===");
        System.out.println("Hasil penjumlahan: " + sum);


        s.close();
    }
}
