import java.util.Scanner;
public class Day69 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int baris = s.nextInt();
        int kolom = s.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
