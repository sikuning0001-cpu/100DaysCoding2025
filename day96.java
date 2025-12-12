public class OperasiAritmatika {

    // Method non-void untuk penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method non-void untuk pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Method non-void untuk perkalian
    public static int kali(int a, int b) {
        return a * b;
    }

    // Method non-void untuk pembagian
    public static double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        int x = 20;
        int y = 5;

        System.out.println("Hasil Penjumlahan : " + tambah(x, y));
        System.out.println("Hasil Pengurangan : " + kurang(x, y));
        System.out.println("Hasil Perkalian   : " + kali(x, y));
        System.out.println("Hasil Pembagian   : " + bagi(x, y));
    }
}