public class MaxValueArray {
    public static void main(String[] args) {
        int[] data = {10, 50, 7, 90, 30};  // contoh isi array

        int max = data[0];  // anggap nilai pertama adalah yang tertinggi

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("Nilai tertinggi: " + max);
    }
}