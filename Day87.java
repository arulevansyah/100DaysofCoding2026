import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Data awal: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = s.nextInt();

        System.out.print("Masukkan nilai baru: ");
        int nilaibaru = s.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            angka[indeks] = nilaibaru;
            System.out.print("\nData setelah diubah: ");
            for (int i = 0; i < angka.length; i++) {
                System.out.print(angka[i] + " ");
            }
        } else {
            System.out.println("Indeks tidak valid!");
        }
        s.close();
    }
}
