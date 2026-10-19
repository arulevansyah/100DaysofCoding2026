import java.util.Scanner;

public class Day48 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        int a = s.nextInt();
        
        System.out.print("Masukkan Operator: ");
        char operator = s.next().charAt(0);

        System.out.print("Masukkan Angka Kedua: ");
        int b = s.nextInt();

        switch (operator) {
            case '+':
            System.out.println("Hasil: " + (a + b));
            break;
            case '-':
            System.out.println("Hasil: " + (a - b));
            break;
            case '*':
            System.out.println("Hasil: " + (a * b));
            break;
            case '/':
            if (b != 0) {
                System.out.println("Hasil: " + (a / b));
            } else {
                System.out.println("Tidak Valid!");
            }
            break;
            case '%':
            if (b != 0) {
                System.out.println("Hasil: " + (a % b));
            } else {
                System.out.println("Tidak Valid!");
            }
            break;
            default:
            System.out.println("Operator Tidak Valid!");
        }



        s.close();
    }
}
