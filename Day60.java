import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int sum = 0;
      
      for (int i = 1; i <= a; i++) {
          sum += i;
          System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("Hasil Penjumlahan: " + sum);
      s.close();
    }
}
