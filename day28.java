public class Day28OperatorPerbandingan {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");

        // Operator ==
        System.out.println("Apakah a == b ? " + (a == b)); // false
        System.out.println("Apakah a == c ? " + (a == c)); // true

        // Operator !=
        System.out.println("Apakah a != b ? " + (a != b)); // true
        System.out.println("Apakah a != c ? " + (a != c)); // false
    }
}