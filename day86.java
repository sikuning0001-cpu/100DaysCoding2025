import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        // input angka
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        // cari angka minimum
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Angka minimal adalah: " + min);
    }
}