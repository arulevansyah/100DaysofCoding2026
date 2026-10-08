import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = s.nextInt();

        String kode;

        if (angka == 0) {
            kode = "N";
        } else if (angka > 0) {

            if (angka % 2 == 0) {
                kode = "A";
            } else {
                kode = "B";
            }

            if (angka > 100) {
                kode = kode + "+";
            }

        } else {

            if (angka % 2 == 0) {
                kode = "C";
            } else {
                kode = "D";
            }

            if (angka < -100) {
                kode = kode + "-";
            }
        }

        System.out.println(kode);

        s.close();
    }
}
