import java.util.Scanner;

public class PenjumlahanNegatifStop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            int angka = in.nextInt();

            if (angka < 0) {
                break; // berhenti jika angka negatif
            }

            total += angka; // tambahkan ke total
        }

        System.out.println("Total penjumlahan = " + total);
    }
}