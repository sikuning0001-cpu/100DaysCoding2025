import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();

        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran: " + luas);
    }
}