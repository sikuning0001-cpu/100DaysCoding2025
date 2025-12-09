import java.util.Scanner;

public class PembulatanAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        double ceil = Math.ceil(angka);
        double floor = Math.floor(angka);
        long round = Math.round(angka);

        System.out.println("\n=== Hasil Pembulatan ===");
        System.out.println("Angka asli : " + angka);
        System.out.println("Ceil  (ke atas)     : " + ceil);
        System.out.println("Floor (ke bawah)    : " + floor);
        System.out.println("Round (terdekat)    : " + round);
    }
}
