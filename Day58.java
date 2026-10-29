import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int f = s.nextInt();
      
      System.out.println("Angka Ganjil");
      for (int i = f; i >= 1; i--) {
          if (i % 2 != 0) {
              System.out.print(i + " ");
          }
      }
      
      System.out.println();
      System.out.println("\nAngka Genap");
      for (int i = f; i >= 1; i--) {
          if (i % 2 == 0) {
              System.out.print(i + " ");
          }
      }
      
      
      s.close();
    }
}
