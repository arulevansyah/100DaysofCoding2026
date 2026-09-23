public class Day22 {
    public static void main(String[] args) {
        
        // Sebelum
        int a = 10;
        int b = 20;

        System.out.println("\nSebelum");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        // Sesudah
        int sementara = a;
        a = b;
        b = sementara;

        System.out.println("\nSesudah");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
