import java.util.Scanner;

public class KelipatanM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai n dan m
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();

        System.out.println("Kelipatan " + m + " dari 1 sampai " + n + " adalah:");

        // Loop untuk mencari kelipatan m
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}