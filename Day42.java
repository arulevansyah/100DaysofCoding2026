
import java.util.Scanner;

public class Day42 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Gaji Pokok: ");
        double gajipokok = s.nextDouble();
        System.out.print("Masukkan Potongan Bulanan: ");
        double potongan = s.nextDouble();

        double gajibersih = (gajipokok - potongan);

        if (gajibersih == 0 && gajipokok > 0) {
            System.out.println("Gaji Bersih Nol: Harap Hubungi HRD!");
        } else if (gajibersih >= 5000000 && gajibersih <=10000000 && potongan >= 500000 && potongan <= 1000000) {
            System.out.println("Gaji Bersih Standar");
        } else if (gajibersih < 5000000 || potongan > 1000000 ) {
            System.out.println("Gaji Bersih Terlalu Rendah atau Potongan Terlalu Besar");
        } else if (gajibersih > 10000000 || potongan < 500000) {
            System.out.println("Gaji Bersih Tinggi atau Potongan Sangat Kecil");
        } 
        
        s.close();
    }
}
