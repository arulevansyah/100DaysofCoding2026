import java.util.Scanner;

public class Day72 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("""
             \n=== KANTIN KAMPUS === 
            1. Nasi Goreng (Rp15000) 
            2. Mie Goreng (Rp12000) 
            3. Ayam Geprek (Rp18000) 
            4. Keluar 
            """);

            System.out.print("\nPilih Menu: ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nAnda Memilih Nasi Goreng");
                    System.out.println("Harga: Rp15.000");
                    break;
                case 2:
                    System.out.println("\nAnda Memilih Mie Goreng");
                    System.out.println("Harga: Rp12.000");
                    break;
                case 3:
                    System.out.println("\nAnda Memilih Ayam Geprek");
                    System.out.println("Harga: Rp18.000");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nPilihan Tidak Tersedia!");
                    break;
            }

        } while (pilihan != 4);
        System.out.println("Terima kasih telah menggunakan layanan kantin!");

        s.close();
    }
}
