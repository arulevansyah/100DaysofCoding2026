import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double pi = 3.14;
    double jari = s.nextDouble();
    double luaslingkaran = pi * jari * jari;

    System.out.println(luaslingkaran);
    
    s.close();
    }
}
