import java.util.Scanner;
public class Day55 {
    static void cekAngka(int angka) {
        if (angka == 7) {
            System.out.println("Angka berhasil ditemukan!");
            return;
        }
        System.out.println("Angka belum ditemukan!");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Tebak angka (1-10): ");
            int angka = input.nextInt();
            if (angka < 1 || angka > 10) {
                System.out.println("Angka harus 1-10!");
                continue;
            }
            if (angka == 0) {
                break;
            }
            cekAngka(angka);
            if (angka == 7) {
                break;
            }
        }
        System.out.println("Permainan selesai!");
        input.close();
    }
}
