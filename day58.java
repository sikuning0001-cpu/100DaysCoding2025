import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        // Cetak dari 1 sampai n
        System.out.println("Angka dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // pindah baris
        
        // Cetak dari n sampai 1
        System.out.println("Angka dari " + n + " sampai 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}