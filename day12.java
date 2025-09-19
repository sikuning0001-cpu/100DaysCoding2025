 import java.util.Scanner; // import Scanner agar bisa input dari keyboard

public class day12 {
    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner sc = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Nama: "); // pakai print (tanpa newline)
        String nama = sc.nextLine();         // String : untuk teks

        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();             // int : untuk angka bulat

        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();        // double : untuk angka desimal

        // Output menggunakan println, print, dan printf
        System.out.println("===biodatana tomakappa==="); // println : ada newline otomatis
        System.out.print("Nama: ");                          // print : tanpa newline
        System.out.println(nama);                            // println : pindah baris setelah nama

        // printf : format output
        System.out.printf("Umur: %d tahun\n", umur); 
        System.out.printf("IPK : %.2f\n", ipk); // %.2f : tampilkan 2 angka di belakang koma
    }
}
