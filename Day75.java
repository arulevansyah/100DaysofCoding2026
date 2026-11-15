public class Day75 {
    public static void main(String[] args) {

        // Deklarasi
        String nama = "Arul";
        String namakosong = "";
        String kalimat = "Saya sedang belajar java";

        // Equals()
        System.out.println("\n=== HASIL PENGECEKAN ===");
        System.out.println("Equals()");
        System.out.println("Hasil true\t: " + nama.equals("Arul"));
        System.out.println("Hasil false\t: " + nama.equals("arul"));

        // EqualsIgnoreCase()
        System.out.println("\nEqualsIgnoreCase()");
        System.out.println("Hasil true\t: " + nama.equalsIgnoreCase("Arul"));
        System.out.println("Hasil true\t: " + nama.equalsIgnoreCase("arul"));

        // Contains()
        System.out.println("\nContains()");
        System.out.println("Hasil true\t: " + kalimat.contains("java"));
        System.out.println("Hasil false\t: " + kalimat.contains("pyhthon"));

        // isEmpty()
        System.out.println("\nisEmpty()");
        System.out.println("Hasil true\t: " + namakosong.isEmpty());
        System.out.println("Hasil false\t: " + nama.isEmpty());
        System.out.println("=======================");

    }
}
