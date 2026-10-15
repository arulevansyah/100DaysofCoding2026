import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = s.nextInt();

        if (nilai >=85 && nilai <=100) {
            System.out.println("Predikat Nilai A");
        } else if (nilai <85 && nilai >=75) {
            System.out.println("Predikat Nilai B");
        } else if (nilai <75 && nilai >=65) {
            System.out.println("Predikat Nilai C");
        } else if (nilai <65 && nilai >=50) {
            System.out.println("Predikat Nilai D");
        } else if (nilai <50 && nilai >=0) {
            System.out.println("Predikat Nilai E");
        } else {
            System.out.println("Nilai Tidak Valid!");
        }

        s.close();
    }
}
