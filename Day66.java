public class Day66 {
    public static void main(String[] args) {
     
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=10; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("0 ");
                }
            } 
           
            System.out.println();
        }
    }
}
