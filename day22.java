import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1 (integer): ");
        int sisi1 = input.nextInt();

        System.out.print("Masukkan sisi 2 (desimal): ");
        double sisi2 = input.nextDouble();

        System.out.println("Luas persegi: " + (sisi1 * sisi2));
    }
}