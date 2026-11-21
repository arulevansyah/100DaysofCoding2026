import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

        System.out.println("\n=== DATA NILAI ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);
        }

        s.close();
    }
}
