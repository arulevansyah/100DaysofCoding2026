import java.util.Scanner;
public class Day45 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Hari: ");
        int hari = s.nextInt();

        switch (hari) {
            case 1:
            System.out.println("Hari Ke-1: Senin");
            break;
            case 2:
            System.out.println("Hari Ke-2: Selasa");
            break;
            case 3:
            System.out.println("Hari Ke-3: Rabu");
            break;
            case 4:
            System.out.println("Hari Ke-4: Kamis");
            break;
            case 5:
            System.out.println("Hari Ke-5: Jumat");
            break;
            case 6:
            System.out.println("Hari Ke-6: Sabtu");
            break;
            case 7:
            System.out.println("Hari Ke-7: Minggu");
            break;
            default:
            System.out.println("Hari Tidak Valid!");
        }



        s.close();
    }
}
