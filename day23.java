import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();

        int luas = p * l;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}