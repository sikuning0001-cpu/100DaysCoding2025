package KerjaSoal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan = 0, bonus = 0, potongan, totalGaji;
        char statusTunjangan, statusBonus;

        System.out.println("====================================");
        System.out.println("     PROGRAM MENGHITUNG GAJI KARYAWAN");
        System.out.println("====================================");

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Apakah mendapat tunjangan? (y/n): ");
        statusTunjangan = input.next().charAt(0);
        if (statusTunjangan == 'y' || statusTunjangan == 'Y') {
            System.out.print("Masukkan jumlah tunjangan: ");
            tunjangan = input.nextDouble();
        } else {
            tunjangan = 0;
        }

        System.out.print("Apakah mendapat bonus? (y/n): ");
        statusBonus = input.next().charAt(0);
        if (statusBonus == 'y' || statusBonus == 'Y') {
            System.out.print("Masukkan jumlah bonus: ");
            bonus = input.nextDouble();
        } else {
            bonus = 0;
        }

        System.out.print("Masukkan potongan: ");
        potongan = input.nextDouble();

   
        if (tunjangan > 0 && bonus > 0)
            System.out.println("Karyawan mendapat tunjangan dan bonus.");
        else if (tunjangan > 0)
            System.out.println("Karyawan hanya mendapat tunjangan.");
        else if (bonus > 0)
            System.out.println("Karyawan hanya mendapat bonus.");
        else
            System.out.println("Karyawan tidak mendapat tunjangan maupun bonus.");

        totalGaji = gajiPokok + tunjangan + bonus - potongan;
        System.out.println("------------------------------------");
        System.out.println("Total Gaji Diterima: " + totalGaji);
    }
}
