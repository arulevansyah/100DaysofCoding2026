import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pin;

        System.out.print("Masukkan PIN: ");
        pin = s.nextInt();

        while (pin != 123456) {
            System.out.println("PIN Salah. Silakan coba lagi.");
            System.out.print("Masukkan PIN: ");
            pin = s.nextInt();
        }

        System.out.println("PIN Benar. Akses Diberikan.");

        s.close();
    }
}
