public class Day14 {
    public static void main(String[] args) {

        // Data awal
        int uangawal = 50000;
        int pemasukan = 20000;
        int  pengeluaran = 15000;

        // Menghitung total uang setelah mendapat pemasukan
        int totaluang = uangawal + pemasukan;

        // Menghitung sisa uang setelah pengeluaran
        int sisauang = totaluang - pengeluaran;

        // Menampilkan hasil
        System.out.println("=== DATA KEUANGAN ===");
        System.out.println("uang awal: " + uangawal);
        System.out.println("pemasukan: " + pemasukan);
        System.out.println("pengeluaran: " + pengeluaran);
        System.out.println("total uang: " + totaluang);
        System.out.println("sisa uang: " + sisauang);
    }
}
