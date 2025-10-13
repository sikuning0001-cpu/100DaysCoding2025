import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Anda lulus.");

            if (nilai >= 90) {
                System.out.println("Nilai Anda sangat baik (A).");
            } else if (nilai >= 75) {
                System.out.println("Nilai Anda baik (B).");
            } else {
                System.out.println("Nilai Anda cukup (C).");
            }

        } else {
            System.out.println("Anda tidak lulus.");
        }
    }
}