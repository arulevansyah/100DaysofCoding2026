import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Nilai N: ");
      int n = s.nextInt();
      
      System.out.print("Nilai M: ");
      int m = s.nextInt();
      
      System.out.println();
      for (int i = m; i <= n; i += m) {
          System.out.print(i + " ");
      }
      
      
      
      
      
      s.close();
    }
}
