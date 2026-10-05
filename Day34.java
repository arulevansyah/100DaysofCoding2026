import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Umur\t: ");
        int umur = s.nextInt();

        if (umur >=0 && umur<=5) {
            System.out.println("Balita");
        } else if (umur >=6 && umur <=12) {
            System.out.println("Anak-Anak");
        } else if (umur >=13 && umur <=17) {
            System.out.println("Remaja");
        } else if (umur >=18 && umur <=59 ) {
            System.out.println("Dewasa");
        } else if (umur >=60 && umur <=200) {
            System.out.println("Lansia");
        } else {
            System.out.println("TIDAK ADA MANUSIA HIDUP SELAMA ITU!");
        }


        s.close();
    }
}
