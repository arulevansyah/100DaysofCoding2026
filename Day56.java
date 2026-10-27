import java.util.Scanner;

public class Day56 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int angka = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= angka; i++) {
            sum +=i;
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = angka; i >= 1; i--) {
            sum +=i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);

        s.close();
    }
}
