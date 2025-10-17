import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("====================================");
        System.out.println("       KALKULATOR SEDERHANA");
        System.out.println("====================================");

        angka1 = input.nextDouble();
        operator = input.next().charAt(0);
        angka2 = input.nextDouble();

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.print("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.print("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.print("Hasil: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.print("Hasil: " + hasil);
            } else {
                System.out.print("Error: Pembagian dengan nol tidak diperbolehkan!");
            }
        } else {
            System.out.print("Operator tidak dikenal!");
        }
    }
}