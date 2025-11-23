import java.util.Scanner;

public class ManipulasiStringSederhana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = in.nextLine();

        System.out.print("Masukkan kata yang ingin diganti: ");
        String lama = in.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String baru = in.nextLine();

        System.out.println("\n=== HASIL MANIPULASI STRING ===");

        // 1. trim()
        String hasilTrim = teks.trim();
        System.out.println("1. Trim       : " + hasilTrim);

        // 2. substring() (ambil 3 karakter pertama)
        String sub = hasilTrim.substring(0, 3);
        System.out.println("2. Substring  : " + sub);

        // 3. replace()
        String hasilReplace = hasilTrim.replace(lama, baru);
        System.out.println("3. Replace    : " + hasilReplace);
    }
}