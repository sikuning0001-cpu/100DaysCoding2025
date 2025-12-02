import java.util.Scanner;

public class CariElemenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Elemen yang dicari
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = in.nextInt();

        // Proses pencarian
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == cari) {
                ditemukan = true;
                posisi = i;
                break; // boleh break karena cukup cari posisi pertama
            }
        }

        // Output hasil
        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + cari + " TIDAK ditemukan dalam array.");
        }
    }
}