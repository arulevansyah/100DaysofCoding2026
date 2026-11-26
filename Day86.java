import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah: ");
        int jumlah = s.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = s.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angaka " + cari + " ditemukan dalam array");
        } else {
            System.out.println("Angka tidak " + cari + " ditemukan dalam array");
        }

        s.close();
    }
}
