import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input
        System.out.print("Nama: ");
        String nama = s.nextLine();

        System.out.print("Umur: ");
        String umurString = s.nextLine();

        System.out.print("Tinggi Badan: ");
        String tinggiString = s.nextLine();

        System.out.print("Berat Badan: ");
        String beratString = s.nextLine();

        System.out.print("Semester: ");
        String semesterString = s.nextLine();

        System.out.print("IPK: ");
        String ipkString = s.nextLine();

        System.out.print("NIM: ");
        String nimString = s.nextLine();

        System.out.print("Jumlah Penghargaan: ");
        String penghargaanString = s.nextLine();

        System.out.print("Kode Kelas: ");
        String kelasString = s.nextLine();

        // Konversi String menjadi tipe data primitif
        int umur = Integer.parseInt(umurString);
        double tinggi = Double.parseDouble(tinggiString);
        double berat = Double.parseDouble(beratString);
        short semester = Short.parseShort(semesterString);
        double ipk = Double.parseDouble(ipkString);
        long nim = Long.parseLong(nimString);
        byte penghargaan = Byte.parseByte(penghargaanString);
        char kelas = kelasString.charAt(0);

        // Perhitungan
        int tahunLahir = 2026 - umur;
        int totalPoin = (penghargaan * 10) + (semester * 5);
        double tinggiMeter = tinggi / 100;

        // Output
        System.out.println("\n=== DATA ANGGOTA UKM MULTIMEDIA ===");
        System.out.println("Nama: " + nama + " (Inisial: " + nama.charAt(0) + ")");
        System.out.println("Umur: " + umur + " tahun, Perkiraan Lahir: " + tahunLahir);
        System.out.println("Tinggi: " + tinggi + " cm (" + tinggiMeter + " m), Berat: " + berat + " kg");
        System.out.println("Semester: " + semester + ", IPK: " + ipk + ", NIM: " + nim);
        System.out.println("Kode Kelas: " + kelas + ", Jumlah Penghargaan: " + penghargaan);
        System.out.println("Total Poin Prestasi: " + totalPoin);

        s.close();
    }
  }
