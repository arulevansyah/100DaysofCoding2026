import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = s.nextInt();

        String hasil = (nilai >= 70) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status: " + hasil);



        s.close();
    }
}
