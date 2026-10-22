import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga: ");
        int tinggi = s.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        s.close();
    }
}
