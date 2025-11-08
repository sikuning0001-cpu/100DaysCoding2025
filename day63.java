import java.util.Scanner;

public class Perkalian1SampaiN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        long hasil = 1; // gunakan long untuk menampung hasil besar
        
        for (int i = 1; i <= n; i++) {
            hasil *= i; // sama dengan hasil = hasil * i
        }
        
        System.out.println("Hasil perkalian dari 1 sampai " + n + " adalah: " + hasil);
        
        input.close();
    }
}