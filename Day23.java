import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        double sisi = s.nextDouble();

        double luas = sisi * sisi;

        System.out.println("Luas persegi: " + luas + " cm²");

        s.close();
    }
}
