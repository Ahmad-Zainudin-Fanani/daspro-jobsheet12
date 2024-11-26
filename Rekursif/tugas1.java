package Rekursif;

import java.util.Scanner;

public class tugas1 {
        static void deretRekursif(int n) {
            if (n < 0) {
                return;
            }
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
        static void deretIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
    
            // Input bilangan n
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
    
            System.out.print("Deret Rekursif: ");
            deretRekursif(n);
            System.out.println();
            System.out.print("Deret Iteratif: ");
            deretIteratif(n);
            System.out.println();
        }
    }