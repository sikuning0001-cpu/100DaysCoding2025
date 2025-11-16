import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        // Mencetak pola persegi panjang
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("* ");
            }
            System.out.println(); // pindah baris
        }
    }
}