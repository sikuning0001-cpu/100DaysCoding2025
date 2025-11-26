import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Menentukan jumlah elemen array
        System.out.print("Masukkan jumlah data: ");
        int jumlah = in.nextInt();

        // Membuat array dengan panjang sesuai input
        int[] angka = new int[jumlah];

        // Input elemen array
        System.out.println("\nMasukkan elemen array:");
        for(int i = 0; i < angka.length; i++){
            System.out.print("Data ke-" + (i+1) + ": ");
            angka[i] = in.nextInt();
        }

        // Output array
        System.out.println("\nIsi array:");
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
    }
}