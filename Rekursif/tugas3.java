package Rekursif;

import java.util.Scanner;

public class tugas3 {
        static boolean cekPrima(int n, int i) {
        // Base case 1: jika n == 1, maka bukan bilangan prima
        if (n == 1) {
            return false;
        }
        // Base case 2: jika i lebih besar atau sama dengan n, maka n adalah bilangan prima
        if (i == n) {
            return true;
        }
        // Jika n habis dibagi i, maka n bukan bilangan prima
        if (n % i == 0) {
            return false;
        }
        return cekPrima(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan n: ");
        n = sc.nextInt();

        if (cekPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}