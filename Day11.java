import java.util.Scanner;

    public class Day11 {
        public static void main(String[]args) {
            
            // Membuat objek scanner untuk menerima input pengguna
            Scanner input = new Scanner(System.in);

            // Membuat input scanner untuk menerima input dari pengguna
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();

            System.out.print("Masukkan tinggi badan: ");
            double tinggi = input.nextDouble();

            System.out.print("Masukkan jenis kelamin: ");
            char jeniskelamin = input.next().charAt(0);

            // Menampilkan biodata menggunakan printf
            System.out.println();
            System.out.println("=== BIODATA ===");

            System.out.printf("Nama\t\t: %s%n", nama);
            System.out.printf("Umur\t\t: %d tahun%n", umur);
            System.out.printf("Tinggi\t\t: %.1f cm%n", tinggi);
            System.out.printf("Jenis kelamin\t: %c%n", jeniskelamin);

            // Menutup scanner
            input.close();
        }
    }
