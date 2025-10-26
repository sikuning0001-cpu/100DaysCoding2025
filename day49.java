import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai anda: ");
        int nilai = input.nextInt();
        String hasil = (nilai >= 70) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status anda: " + hasil);
        input.close();
    }
}