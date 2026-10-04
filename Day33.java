import java.util.Scanner;
public class Day33 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Nilai\t\t: ");
        int nilai = s.nextInt();
        System.out.print("Masukkan Kehadiran\t: ");
        boolean kehadiran = s.nextBoolean();

        if (nilai >=70 && Kehadiran ){
            System.out.println("SELAMAT KAMU LULUS!");
        } else {
            System.out.println("MAAF KAMU TIDAK LULUS!");
        }

        
        s.close();
    }
}
