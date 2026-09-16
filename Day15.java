import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Jumlahbuku = input.nextInt();
        int Hargaperbuku = input.nextInt();
        int Jumlahorang = input.nextInt();

        int Totalharga = Hargaperbuku * Jumlahbuku;
        int Biayaperorang = Totalharga / Jumlahorang;

        System.out.println();
        System.out.printf("Jumlah buku: %d%n", Jumlahbuku);
        System.out.printf("Harga per buku: %d%n", Hargaperbuku);
        System.out.printf("Total harga: %d%n", Totalharga);
        System.out.printf("Jumlah orang: %d%n", Jumlahorang);
        System.out.printf("Biaya per orang: %d%n", Biayaperorang);
        
        input.close();
    }
}
