import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("""
            ====== FAST FOOD RESTAURANT ======
            1. Beef Burger        = Rp20.000
            2. Cheeseburger       = Rp25.000
            3. Double Beef Burger = Rp32.000
            4. Chicken Original   = Rp15.000
            5. Chicken Crispy     = Rp17.000
            6. Chicken Spicy      = Rp18.000
            7. French Fries       = Rp10.000
            8. Chicken Nuggets    = Rp12.000
            9. Onion Rings        = Rp13.000
            10. Personal Pizza    = Rp25.000
            11. Beef Pizza        = Rp35.000
            12. Cheese Pizza      = Rp30.000
            =================================
                """);
        System.out.print("Pilih Menu: ");
        int makanan = s.nextInt();


        if (makanan == 1 ) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Beef Burger
            Harga      : Rp20.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 2) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Cheeseburger
            Harga      : Rp25.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 3) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Double Beef Burger
            Harga      : Rp32.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 4) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Chicken Original
            Harga      : Rp15.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 5) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Chicken Crispy 
            Harga      : Rp17.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 6) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Chicken Spicy
            Harga      : Rp18.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 7) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : French Fries
            Harga      : Rp10.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 8) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Chicken Nuggets
            Harga      : Rp12.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 9) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Onion Rings
            Harga      : Rp13.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 10) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Personal Pizza 
            Harga      : Rp25.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 11) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Beef Pizza 
            Harga      : Rp35.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else if (makanan == 12) {
            System.out.println("""
            \n================================
                    PESANAN BERHASIL!
            ================================
            Menu       : Cheese Pizza
            Harga      : Rp30.000
            Status     : Berhasil dipesan
            ================================
              Terima kasih telah memesan!
            ================================
            """);
        } else {
            System.out.println("""
            ================================ 
                    ORDER FAILED! 
            ================================ 
            Maaf, menu yang Anda pilih 
            tidak tersedia. 
            
            Silakan pilih menu nomor 1-12. 
            ================================
                    """);
        }

        s.close();
    }
}
