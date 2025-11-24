import java.util.Scanner;

public class LatihanString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String teks = in.nextLine();

        System.out.println("\n=== HASIL LATIHAN STRING ===");

        // 1. Length
        System.out.println("Panjang teks: " + teks.length());

        // 2. Uppercase
        System.out.println("Uppercase: " + teks.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase: " + teks.toLowerCase());

        // 4. isEmpty
        System.out.println("Apakah kosong? " + teks.isEmpty());

        // 5. Substring (jika panjang minimal 5)
        if (teks.length() >= 5) {
            System.out.println("Substring(0,5): " + teks.substring(0, 5));
        } else {
            System.out.println("Substring(0,5): Teks terlalu pendek");
        }

        // 6. replace
        System.out.println("Replace spasi dengan '-': " + teks.replace(" ", "-"));

        // 7. trim
        System.out.println("Trim (hapus spasi di depan dan belakang): '" + teks.trim() + "'");
    }
}