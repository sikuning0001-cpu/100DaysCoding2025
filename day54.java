public class ContohContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // lewati angka 5
            }

            System.out.println("Angka: " + i);
        }
    }
}