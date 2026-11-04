import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = s.nextInt();
        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("Hasil: " + factorial);

        s.close();
    }
}
