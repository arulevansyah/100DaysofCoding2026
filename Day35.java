import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan kode tiket: ");
        int kodetiket = s.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = s.nextInt();

        System.out.print("Masukkan saldo: ");
        int saldo = s.nextInt();

        int pemeriksaan = kodetiket * umur % 100;
        System.out.println("Nilai Pemeriksaan: " + pemeriksaan);

        if (pemeriksaan >= 20 && pemeriksaan <= 80) {
            if (umur < 17) {
                if (saldo >= 100000) {
                    System.out.println("Status Tiket: VALID");
                } else {
                    System.out.println("Status Tiket: TIDAK VALID");
                }
            } else {
                if (saldo >= 50000) {
                    System.out.println("Status Tiket: VALID");
                } else {
                    System.out.println("Status Tiket: TIDAK VALID");
                }
            }
        } else {
            System.out.println("Status Tiket: TIDAK VALID");
        }

        s.close();
    }
}
