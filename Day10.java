public class Day10 {
    public static void main(String[]args) {
        // Deklarasi dan inisialisasi data karakter
        byte level = 10;
        short jumlah_items = 50;
        int exp = 1000;
        long gold = 50000L;

        // Menampilkan batas maksimal setiap tipe data
        System.out.println("=== BATAS MAKSIMAL TIPE DATA === ");
        System.out.println("Maks byte: " + Byte.MAX_VALUE);
        System.out.println("Maks short: " + Short.MAX_VALUE);
        System.out.println("Maks int: " + Integer.MAX_VALUE);
        System.out.println("Maks Long: " + Long.MAX_VALUE);

        // Menampilkan data awal karakter
        System.out.println();
        System.out.println("=== DATA AWAL KARAKTER ===");
        System.out.println("Level: " + level);
        System.out.println("Item: " + jumlah_items);
        System.out.println("Exp: " + exp);
        System.out.println("Gold: " + gold);

        // Menambahkan hadiah dari misi
        level += 2;
        jumlah_items += 5;
        exp += 250;
        gold += 10000;

        // Menampilkan data setelah misi
        System.out.println();
        System.out.println("=== DATA SETELAH MISI ===");
        System.out.println("Level: " + level);
        System.out.println("Item: " + jumlah_items);
        System.out.println("EXP: " + exp);
        System.out.println("Gold: " + gold);
    }
}
