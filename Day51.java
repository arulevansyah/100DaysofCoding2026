import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan Tinggi Segitiga: ");
    int angka = in.nextInt();
    
    for (int baris = 1; baris <= angka; baris++) {
    for (int kolom = 1; kolom <= baris; kolom++) {
        System.out.print(kolom + " ");
    }
        System.out.println();
   }
 }
}
