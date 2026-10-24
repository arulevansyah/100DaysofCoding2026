import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = s.nextInt();

        do {
            System.out.println(angka);
            angka++;
        } while (angka <=10);

        s.close();
    }
}
