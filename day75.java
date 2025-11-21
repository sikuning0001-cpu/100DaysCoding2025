import java.util.Scanner;

public class MethodStringDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input teks dari user
        System.out.print("Masukkan sebuah teks: ");
        String teks = input.nextLine();

        // Menghitung panjang string
        int panjang = teks.length();

        // Mengubah menjadi huruf besar
        String besar = teks.toUpperCase();

        // Mengubah menjadi huruf kecil
        String kecil = teks.toLowerCase();

        // Output
        System.out.println("\n=== HASIL PROSES STRING ===");
        System.out.println("Teks asli      : " + teks);
        System.out.println("Panjang teks   : " + panjang);
        System.out.println("Uppercase      : " + besar);
        System.out.println("Lowercase      : " + kecil);
    }
}