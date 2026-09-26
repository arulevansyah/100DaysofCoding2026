import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari: ");
        double jarijari = s.nextDouble();

        double luas = Math.PI * jarijari * jarijari;

        System.out.println("Luas Lingkaran: " + luas + " CM²");

        s.close();
    }
}
