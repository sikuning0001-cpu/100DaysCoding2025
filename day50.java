import java.util.Scanner;

public class GanjilGenapTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Menggunakan operator ternary untuk menentukan hasil
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println(angka + " adalah bilangan " + hasil + ".");

        input.close();
    }
}