import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nama\t: ");
        String nama = s.nextLine();

        
        System.out.println("\nNama\t\t: " + nama);
        System.out.println("Jumlah Karakter\t: " + nama.length());
        System.out.println("Huruf Besar\t: " + nama.toUpperCase());
        System.out.println("Huruf Kecil\t: " + nama.toLowerCase());

        s.close();
    }
}
