package KerjaSoal;

import java.util.Scanner;

public class NewClass {
   Scanner in = new Scanner(System.in);
    static void ganjilGenap(){
        NewClass b = new NewClass();
        int a = b.in.nextInt();
        if (a%2==0) {
            System.out.println("GENAP");
        }else{
            System.out.println("GANJIL");
        }
    }
    public static void main(String[] args) {
        ganjilGenap();
        
    }
}