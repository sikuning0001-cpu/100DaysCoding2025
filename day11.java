import java.util.Scanner; // import class Scanner

public class Day11 {
    public static void main(String[] args) {
        // Buat objek Scanner untuk baca input user
        Scanner sc = new Scanner(System.in);

        // Input String
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        // Input integer
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        // Output
        System.out.println("Halo " + nama + ", umurmu " + umur);
    }
}