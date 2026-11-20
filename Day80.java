import java.util.Scanner;
public class Day80 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nama = {"Tono", "Jono", "Abdul", "Iyan", "Asep", "Udin"};

        System.out.print("Masukkan nomor absen (1-6): ");
        int absen = s.nextInt();

        System.out.println("\n=== ABSEN KELAS A ===");
        System.out.println("Nama yang dipanggil: " + nama[absen - 1]);

        s.close();
    }
}
