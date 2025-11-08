import java.util.Scanner;

public class Total1SampaiN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        int total = 0;
        
        // Perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            total += i; // sama dengan total = total + i
        }
        
        System.out.println("Total dari 1 sampai " + n + " adalah: " + total);
        
        input.close();
    }
}