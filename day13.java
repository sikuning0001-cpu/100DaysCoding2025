import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();

        System.out.print("Masukkan harga buku: ");
        double harga = sc.nextDouble();

        System.out.print("Masukkan jumlah eksemplar: ");
        int jumlah = sc.nextInt();

        System.out.print("Apakah tersedia versi e-book (true/false): ");
        boolean ebook = sc.nextBoolean();

        System.out.print("Masukkan kode rak: ");
        char kodeRak = sc.next().charAt(0);

        System.out.printf("Buku berjudul \"%s\" dengan kode rak %c berharga Rp%.2f,%n", judul, kodeRak, harga);
        System.out.printf("jumlah eksemplar yang tersedia adalah %d.%n", jumlah);
        System.out.printf("Apakah tersedia versi e-book? %b%n", ebook);
    }
}