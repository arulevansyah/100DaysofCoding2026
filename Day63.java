import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }
        System.out.println("Hasil: " + hasil);

        s.close();
    }
}
