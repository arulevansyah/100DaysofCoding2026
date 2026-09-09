public class Day8 {
    public static void main(String[] args) {
        /**
         * Day 8 - Deklarasi, insialisasi dan update variabel
         * Soal: Program data player
         */

         // Deklarasi dan inisialisasi variabel
        String nama_player = "Jefri";
        int level = 1;

        // Menampilkan nilai awal
        System.out.println("=== DATA AWAL ===");
        System.out.println("Nama : " + nama_player);
        System.out.println("Level : " + level);

        // Update nilai variabel
        nama_player = "Jefri Pro";
        level = 5;

        // Menampilkan nilai akhir
        System.out.println();
        System.out.println("=== DATA AKHIR ===");
        System.out.println("Nama : " + nama_player);
        System.out.println("Level : " + level);
    }
}
