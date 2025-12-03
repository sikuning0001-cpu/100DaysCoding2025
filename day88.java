public class Main {
    public static void main(String[] args) {
        
        // Deklarasi dan inisialisasi array
        String[] namaBuah = {"Apel", "Mangga", "Jeruk", "Pisang", "Semangka"};

        // Cetak semua elemen array dengan for-each
        System.out.println("Daftar Buah:");

        for(String buah : namaBuah){
            System.out.println("- " + buah);
        }
    }
}