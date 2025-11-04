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