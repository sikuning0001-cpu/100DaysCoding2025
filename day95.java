public class CetakSederhana {

    // Method void dengan parameter
    static void cetakPesan(String pesan) {
        System.out.println(pesan);
    }

    public static void main(String[] args) {
        // Memanggil method dan mengirim parameter
        cetakPesan("Halo, ini dicetak dari method void!");
        cetakPesan("Method dengan parameter itu gampang kok!");
    }
}