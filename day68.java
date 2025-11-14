public class Persegi4x4 {
    public static void main(String[] args) {

        int ukuran = 4; // ukuran persegi 4x4

        for (int i = 0; i < ukuran; i++) {      // loop baris
            for (int j = 0; j < ukuran; j++) {  // loop kolom
                System.out.print("* ");
            }
            System.out.println(); // pindah baris
        }

    }
}