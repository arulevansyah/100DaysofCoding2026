import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Masukkan Angka: ");
      int a = s.nextInt();
      long hasil = 1;
      
      for (int i = 1; i <= a; i++) {
          hasil *= i;
      }
      System.out.println("Hasil: " + hasil);
      
      
      s.close();
    }
}
