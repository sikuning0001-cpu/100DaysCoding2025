public class Day21Alt {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Sebelum: a=" + a + ", b=" + b);

        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("Sesudah: a=" + a + ", b=" + b);
    }
}