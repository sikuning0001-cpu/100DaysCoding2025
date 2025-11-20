import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Hitung Penjumlahan");
            System.out.println("2. Hitung Perkalian");
            System.out.println("3. Tampilkan Pesan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    int a = in.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    int b = in.nextInt();
                    System.out.println("Hasil penjumlahan: " + (a + b));
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    int x = in.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    int y = in.nextInt();
                    System.out.println("Hasil perkalian: " + (x * y));
                    break;

                case 3:
                    System.out.println("Halo! Ini adalah program menu berulang.");
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 4);  // selama pilihan bukan 4, ulangi menu

        in.close();
    }
}