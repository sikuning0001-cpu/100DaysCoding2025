public class ContohVoid {

    // Method void: tidak mengembalikan nilai, hanya melakukan aksi
    static void cetakAngka() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Memanggil method void
        cetakAngka();
    }
}