import java.util.Scanner;

public class LuasPersegi {

    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        int sisi = input.nextInt();

        int luas = hitungLuas(sisi);
        System.out.println("Luas persegi = " + luas);
    }
}