import java.util.Scanner;

public class Day12 {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        // Membuat input scanner
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("Umur: ");
        int umur = s.nextInt();
        System.out.print("Tinggi: ");
        double tinggi = s.nextDouble();
        System.out.print("Jenis kelamin: ");
        char jeniskelamin = s.next().charAt(0);

        // Menampilkan biodata
        System.out.println();
        System.out.println("=== BIODATA ===");
        System.out.printf("Nama\t: %s%n", nama);
        System.out.printf("Umur\t: %d tahun%n", umur);
        System.out.printf("Tinggi\t: %.1f cm%n", tinggi);
        System.out.printf("Jenis kelamin\t: %c%n", jeniskelamin);

        // Menutup scanner
        s.close();
    }
}
