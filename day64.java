import java.util.Scanner;
public class M_pangkat_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int M = sc.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }
        System.out.println(M + " pangkat " + N + " = " + hasil);
    }
}