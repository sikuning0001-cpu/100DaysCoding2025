import java.util.Scanner;

public class VertikalGaris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Masukkan angka > 0");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        sc.close();
    }
}