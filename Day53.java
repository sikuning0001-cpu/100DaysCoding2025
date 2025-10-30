package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukka batas jumlah elemen: ");
        int b = in.nextInt();
        int a[] = new int[b];
        a[0] = 10;
        a[1] = 20;
        for (int i = 0; i <= b; i++) {
            System.out.println(a[i]);
            if (a[i] == 10) {
                System.out.println(" angka dalam array " + a[i]);
                break;
            }

        }

    }

}


