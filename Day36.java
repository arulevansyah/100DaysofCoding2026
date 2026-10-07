import java.util.Scanner;

public class Day36 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = s.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Ini Bilangan Genap");
        } else {
            System.out.println("Ini Bilangan Ganjil");
        }


        s.close();
    }
}
