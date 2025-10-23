import java.util.Scanner;

public class MenuSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih: Tambah Data");
                // Tambahkan logika tambah data di sini
                break;
            case 2:
                System.out.println("Anda memilih: Lihat Data");
                // Tambahkan logika lihat data di sini
                break;
            case 3:
                System.out.println("Anda memilih: Hapus Data");
                // Tambahkan logika hapus data di sini
                break;
            case 4:
                System.out.println("Terima kasih, program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid! Silakan pilih antara 1-4.");
        }

        input.close();
    }
}