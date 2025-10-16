import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double total = 0;

        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng   - Rp15000");
        System.out.println("2. Mie Ayam      - Rp12000");
        System.out.println("3. Bakso         - Rp13000");
        System.out.println("4. Sate Ayam     - Rp18000");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            total = 15000;
            System.out.println("Anda memilih Nasi Goreng.");
        } else if (pilihan == 2) {
            total = 12000;
            System.out.println("Anda memilih Mie Ayam.");
        } else if (pilihan == 3) {
            total = 13000;
            System.out.println("Anda memilih Bakso.");
        } else if (pilihan == 4) {
            total = 18000;
            System.out.println("Anda memilih Sate Ayam.");
        } else if (pilihan == 5) {
            System.out.println("Terima kasih! Program selesai.");
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        // hanya tampilkan total kalau bukan pilihan 5
        if (pilihan >= 1 && pilihan <= 4) {
            System.out.println("Total yang harus dibayar: Rp" + total);
            System.out.println("Terima kasih telah memesan!");
        }
    }
}