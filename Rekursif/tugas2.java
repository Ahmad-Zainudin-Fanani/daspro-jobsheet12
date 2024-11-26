package Rekursif;

import java.util.Scanner;

public class tugas2 {
        static int hitungPenjumlahan(int n) {
        // Menggunakan rumus penjumlahan deret aritmatika
        if (n == 1) {
            return (1);
        } else {
            return (n + hitungPenjumlahan(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;

        // Input nilai f
        System.out.print("Masukkan nilai f: ");
        f = sc.nextInt();

        // Menghitung penjumlahan menggunakan fungsi rekursif
        int hasil = hitungPenjumlahan(f);
        System.out.println("Penjumlahan 1 + 2 + ... + " + f + " = " + hasil);
    }
}