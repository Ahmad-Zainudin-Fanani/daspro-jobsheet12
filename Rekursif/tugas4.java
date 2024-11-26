package Rekursif;

import java.util.Scanner;

public class tugas4 {
        static int pasanganProduktif(int n) {
        if (n == 1 || n == 2) {
            return 0;
        } else {
            return pasanganBelumProduktif(n - 2);
        }
    }
    static int pasanganBelumProduktif(int n) {
        if (n == 1 || n == 2) {
            return (1);
        } else {
            return (pasanganProduktif(n - 1) + pasanganBelumProduktif(n - 1));
        }
    }

    // Fungsi utama untuk menghitung total pasangan pada bulan ke-n
    static int totalPasangan(int n) {
        return pasanganProduktif(n) + pasanganBelumProduktif(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menghitung total pasangan marmut pada bulan ke-12
        int bulan = 12;
        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah: " + totalPasangan(bulan));
    }
}