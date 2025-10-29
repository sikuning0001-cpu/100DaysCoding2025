import java.util.Scanner;

public class JumlahAngkaPositif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int jumlah = 0;

        System.out.println("=== Program Jumlah Angka Positif ===");
        System.out.println("Masukkan angka positif (0 atau negatif untuk berhenti):");

        // Perulangan while
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        while (angka > 0) {
            jumlah += angka; // Menambahkan angka ke total
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        }

        System.out.println("Total jumlah angka positif: " + jumlah);
        input.close();
    }
}