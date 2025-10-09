package day33;

public class Day33OperatorOR {
    public static void main(String[] args) {
        boolean hujan = true;
        boolean bawaPayung = false;

        System.out.println("Apakah hujan? " + hujan);
        System.out.println("Apakah bawa payung? " + bawaPayung + "\n");

        System.out.println("Boleh keluar rumah? " + (hujan == false || bawaPayung == true));
    }
}
