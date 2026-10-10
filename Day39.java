import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();
    char c = s.next().charAt(0);

    if (c == 'A') {
        System.out.println(a + b);
    } if (c == 'B') {
        System.out.println(a - b);
    } if (c == 'C') {
        System.out.println(a * b);
    } if (c == 'D') {
        System.out.println(a / b);
    } else {
        System.out.println("TIDAK VALID!");
    }

    s.close();
    }
}
