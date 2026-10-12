import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan suhu ruangan: ");
        int suhu = s.nextInt();
        System.out.print("Masukkan kelembapan ruangan: ");
        int kelembapan = s.nextInt();


        if (suhu >=18 && suhu <=28 && kelembapan >=40 && kelembapan <=60) {
            System.out.println("Ruangan Nyaman");
        } else if (suhu <18 || kelembapan <40 ) {
            System.out.println("Suhu Atau Kelembapan Terlalu Rendah");
        } else if (suhu >28 || kelembapan >60) {
            System.out.println("Suhu Atau Kelembapan Terlalu Tinggi");
        } else {
            System.out.println("Tidak Valid!");
        }


        s.close();
    }
}
