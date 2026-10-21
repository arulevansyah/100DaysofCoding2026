import java.util.Scanner;

public class Day50 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = s.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka: " + angka + " Adalah " + hasil);

        s.close();
    }
}
