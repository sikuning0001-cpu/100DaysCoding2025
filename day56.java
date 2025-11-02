import java.util.Scanner;

public class DoWhileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata;

        do {
            System.out.print("Masukkan kata (ketik 'stop' untuk berhenti): ");
            kata = input.nextLine();
        } while (!kata.equalsIgnoreCase("stop"));

        System.out.println("Program selesai!");
        input.close();
    }
}