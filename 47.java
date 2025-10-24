import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        System.out.print("Masukkan angka (1-7): ");
        int n = new Scanner(System.in).nextInt();

        switch (n) {
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            case 4 -> System.out.println("Kamis");
            case 5 -> System.out.println("Jumat");
            case 6 -> System.out.println("Sabtu");
            case 7 -> System.out.println("Minggu");
            default -> System.out.println("Salah! Masukkan angka 1-7.");
        }
    }
}