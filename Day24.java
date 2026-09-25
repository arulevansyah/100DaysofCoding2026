import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Panjang: ");
        Double panjang = s.nextDouble();

        System.out.print("Masukkan Lebar: ");
        Double lebar = s.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang: " + luas + " CM²");

        s.close();
    }
}
