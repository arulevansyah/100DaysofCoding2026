import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Angka 1: ");
    int angka1 = s.nextInt();
    System.out.print("Masukkan Angka 2: ");
    int pilihan;
    int angka2 = s.nextInt();
    do {
        System.out.print("""
            1. Penjumlahan
            2. Perkalian
            3. Pengurang
            4. Berhenti
            """);
            System.out.print("Pilihan: ");
            pilihan = s.nextInt();
            
            switch (pilihan) {
            case 1:
            System.out.println("Hasil Penjumlahan: " + (angka1 + angka2));
            break;
            case 2:
            System.out.println("Hasil Perkalian: " + (angka1 * angka2));
            break;
            case 3:
            System.out.println("Hasil Pengurangan: " + (angka1 - angka2));
            break;
            case 4:
            System.out.println("Tidak ada operasi, Program berhenti");
            break;
            default:
            }
    } while (pilihan != 4);

   



    s.close();
 }
}
