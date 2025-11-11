import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        // Cek jika input negatif
        if (n < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else {
            long hasil = 1; // gunakan long agar bisa menampung hasil besar

            // Perulangan untuk menghitung faktorial
            for (int i = 1; i <= n; i++) {
                hasil *= i; // sama dengan hasil = hasil * i
            }

            System.out.println("Faktorial dari " + n + " adalah: " + hasil);
        }

        input.close();
    }
}