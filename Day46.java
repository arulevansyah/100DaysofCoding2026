import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("""
            === MENU MAKANAN ===
        1. Burger           = Rp25.000
        2. Pizza            = Rp45.000
        3. Kebab            = Rp15.000
        4. Hot Dog          = Rp15.000
        5. French Fries     = Rp10.000
        ==============================
        """);
        System.out.print("Pilih Menu: ");
        int pilih = s.nextInt();

        switch (pilih) {
            case 1 -> System.out.println("Kamu pilih Burger = Rp25.000");
            case 2 -> System.out.println("Kamu pilih Pizza = Rp45.000");
            case 3 -> System.out.println("Kamu pilih Kebab = Rp15.000");
            case 4 -> System.out.println("Kamu pilih Hot Dog = Rp15.000");
            case 5 -> System.out.println("Kamu pilih French Fries = Rp10.000");
            default -> System.out.println("Tidak Ada Di Dalam Menu!");
        }



        s.close();
    }
}
