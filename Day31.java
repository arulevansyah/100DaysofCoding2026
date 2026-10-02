public class Day31 {
    public static void main(String[] args) {
        // Operator AND (&&)
        System.out.println("Hasil True\t: " + (true && true));
        System.out.println("Hasil False\t: " + (true && false));
        System.out.println("Hasil False\t: " + (false && false));

        // Operator OR (||)
        System.out.println("\nHasil True\t: " + (true || true));
        System.out.println("Hasil True\t: " + (true || false));
        System.out.println("Hasil False\t: " + (false || false));

        // Operator NOT (!)
        System.out.println("\nHasil False\t: " + !true);
        System.out.println("Hasil True\t: " + !false);
    }
}
