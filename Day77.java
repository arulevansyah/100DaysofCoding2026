public class Day77 {
    public static void main(String[] args) {

        // Deklarasi
        String nama = "Arul Evansyah";
        String prodi = "    Informatika     ";
        String kalimat = "Saya sedang belajar java!";

        // 1. length()
        System.out.println("Jumlah karakter\t: " + nama.length());

        // 2. toUpperCase()
        System.out.println("Huruf Besar\t: " + nama.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Huruf Kecil\t: " + nama.toLowerCase());

        // 4. equals()
        System.out.println("Cek Nama\t: Arul Evansyah ? " + nama.equals("Arul Evansyah"));

        // 5. equalsIgnoreCase()
        System.out.println("Cek Nama\t: Arul Evansyah ? " + nama.equalsIgnoreCase("arul evansyah"));

        // 6. contains()
        System.out.println("Cek Kata\t: " + kalimat.contains("java"));

        // 7. isEmpty()
        System.out.println("Nama Kosong\t: " + nama.isEmpty());

        // 8. substring()
        System.out.println("Karakter Awal\t: " + nama.substring(0, 5));

        // 9. replace()
        System.out.println("Ganti Kata\t: " + kalimat.replace("java", "python"));

        // 10. trim()
        System.out.println("Perbaiki Spasi\t: " + prodi.trim());
    }
}
