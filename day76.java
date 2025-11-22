import java.util.Scanner;

public class CekStringLengkap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks utama: ");
        String teks = input.nextLine();

        System.out.print("Masukkan teks pembanding: ");
        String banding = input.nextLine();

        System.out.print("Masukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN STRING ===");

        // 1. Cek apakah teks utama kosong
        if (teks.isEmpty()) {
            System.out.println("1. Teks utama KOSONG (isEmpty).");
        } else {
            System.out.println("1. Teks utama TIDAK kosong (isEmpty).");
        }

        // 2. Cek apakah sama persis
        if (teks.equals(banding)) {
            System.out.println("2. Teks sama persis (equals).");
        } else {
            System.out.println("2. Teks TIDAK sama persis (equals).");
        }

        // 3. Cek tanpa membedakan huruf besar/kecil
        if (teks.equalsIgnoreCase(banding)) {
            System.out.println("3. Teks sama (ignore case).");
        } else {
            System.out.println("3. Teks TIDAK sama (ignore case).");
        }

        // 4. Cek apakah mengandung kata tertentu
        if (teks.contains(cari)) {
            System.out.println("4. Teks mengandung kata \"" + cari + "\".");
        } else {
            System.out.println("4. Teks TIDAK mengandung kata \"" + cari + "\".");
        }

        // 5. Cek apakah dimulai dengan kata tertentu
        if (teks.startsWith(cari)) {
            System.out.println("5. Teks dimulai dengan \"" + cari + "\".");
        } else {
            System.out.println("5. Teks TIDAK dimulai dengan \"" + cari + "\".");
        }

        // 6. Cek apakah diakhiri kata tertentu
        if (teks.endsWith(cari)) {
            System.out.println("6. Teks diakhiri dengan \"" + cari + "\".");
        } else {
            System.out.println("6. Teks TIDAK diakhiri dengan \"" + cari + "\".");
        }
    }
}