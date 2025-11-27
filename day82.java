import java.util.Scanner;

public class IsiAksesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();

        int[] data = new int[n];

        // Mengisi array dengan perulangan
        System.out.println("\n=== Input Elemen Array ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = in.nextInt();
        }

        // Menampilkan isi array dengan perulangan
        System.out.println("\n=== Isi Array ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " = " + data[i]);
        }
    }
}