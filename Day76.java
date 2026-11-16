public class Day76 {
    public static void main(String[] args) {

        // Deklarasi
        String kalimat = "Saya sedang belajar java";
        String kalimatspasi = "    Saya sedang belajar java    ";

        // Substring()
        String a = kalimat.substring(20);
        System.out.println("Hasil Substring\t: " + a);

        // Replace()
        String b = kalimat.replace("java", "python");
        System.out.println("Hasil Replace\t: " + b);

        // Trim()
        System.out.println("Hasil Trim\t: " + kalimatspasi.trim());
    }
}
