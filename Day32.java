public class Day32 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Kombinasi Increment, Decrement, Perbandingan, dan Logika
        boolean hasil = ((++a == 6) && (b-- != 10)) || ((a > 5) && (b <= 9) && !(a >= 10));

        System.out.println("\nHasil\t\t: " + hasil);
        System.out.println("Nilai akhir a\t: " + a);
        System.out.println("Nilai akhir b\t: " + b);
    }
}
