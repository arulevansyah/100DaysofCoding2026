import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nilai = new int[5];
        int sum = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + ": ");
            nilai[i] = s.nextInt();
        }
        
        System.out.println("\n=== Hasil Nilai ===");
        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
            System.out.println("Hasil Nilai Ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("\nTotal: " + sum);

        s.close();
    }
}
