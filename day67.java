import java.util.Scanner;

public class GarisHorizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*"); // tidak pakai println agar sejajar
        }
        System.out.println(); // ganti baris setelah selesai
        sc.close();
    }
}