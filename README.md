# LATIHAN-UKL---SOAL-SULIT
import java.util.Scanner;

public class SoalSulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0; 
        
        // Meminta nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + i + ": ");
            double nilai = input.nextDouble(); 
            totalNilai += nilai; 
        }
        
        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;
        
        // Menampilkan hasil
        System.out.println("\nRekap Nilai Ujian:");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai ujian: " + totalNilai);
        System.out.println("Rata-rata nilai ujian: " + rataRata);
        
        // Menutup scanner
        input.close();
    }
}

import java.util.Scanner;

public class SoalSulit2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Meminta ukuran matriks dari pengguna
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        // Membuat dua buah matriks dan satu matriks hasil
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Memasukkan nilai untuk matriks A
        System.out.println("\nMasukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }

        // Memasukkan nilai untuk matriks B
        System.out.println("\nMasukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Menjumlahkan kedua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("\nHasil Penjumlahan Matriks (A + B):");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println(); // ganti baris
        }

        input.close();
    }
}

