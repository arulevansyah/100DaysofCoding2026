import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=== Buat Akun Baru ===");
        System.out.print("Masukkan Username: ");
        String usernamebaru = s.nextLine();
        System.out.print("Masukkan Password: ");
        String passwordbaru = s.nextLine();

        System.out.println("\n=== Halaman Login ===");
        System.out.print("Masukkan Username: ");
        String username = s.nextLine();
        System.out.print("Masukkan Password: ");
        String password = s.nextLine();
        
        while (!username.equals(usernamebaru) || !password.equals(passwordbaru)) {
            System.out.println("\nUsername Atau Password Anda Salah, Silahkan Coba Lagi!");
            System.out.print("Masukkan Username: ");
            username = s.nextLine();
            System.out.print("Masukkan Password: ");
            password = s.nextLine();
        }
        System.out.println("\nAnda Berhasil Login!");

        s.close();
    }
}
