import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b = 0; 

        while (true) {
            System.out.print("Masukkan Angka: ");
            a = s.nextInt();

            if (a < 0) {
                break;
            }
            b += a;
        }
        System.out.println("Hasil: " + b);
        s.close();
    }
}
