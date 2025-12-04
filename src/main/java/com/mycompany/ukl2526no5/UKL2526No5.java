/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526no5;

/**
 *
 * @author LOQ 6
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UKL2526No5 {
    private static final int TargetMenang = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int kemenanganKomputer = 0;
        int kemenanganPemain = 0;
        int ronde = 1;
        
        List<Integer> riwayatKomputer = new ArrayList<>();
        List<Integer> riwayatPemain = new ArrayList<>();
        
        System.out.println("=== Selamat datang di permainan Lempar Dadu ===");
        System.out.println("Siapa yang mencapai " + TargetMenang + " lebih dulu, dia pemenangnya");
        while(kemenanganKomputer < TargetMenang && kemenanganPemain < TargetMenang){
            System.out.println("Ronde " + ronde);
            
            System.out.print("masukkan angka berapa saja lalu tekan enter untuk melempar dadu Anda: ");
            input.next();
            int nilaiKomputer = random.nextInt(6) + 1;
            int nilaiPemain = random.nextInt(6) + 1;
            riwayatKomputer.add(nilaiKomputer);
            riwayatPemain.add(nilaiPemain);
            System.out.println("Nilai dadu komputer: " + nilaiKomputer);
            System.out.println("Nilai dadu pemain: " + nilaiPemain);
            if (nilaiPemain > nilaiKomputer) {
                System.out.println("Hasil ronde: Pemain menang di ronde ini!");
                kemenanganPemain++;
            } else if (nilaiKomputer > nilaiPemain) {
                System.out.println("Hasil ronde: Komputer menang di ronde ini!");
                kemenanganKomputer++;
            } else {
                System.out.println("Hasil ronde: Seri!");
            }

            System.out.println("Skor saat ini -> Pemain: " + kemenanganPemain + " | Komputer: " + kemenanganKomputer);
            ronde++;
        }
        
        System.out.println(" PERMAINAN SELESAI ");
        String pemenangAkhir = (kemenanganPemain == TargetMenang) ? "Pemain" : "Komputer";
        System.out.println("Pemenangnya adalah: " + pemenangAkhir + "!");
        System.out.println("--- Rekap Riwayat Lemparan ---");
        System.out.println("Riwayat lemparan komputer: " + riwayatKomputer);
        System.out.println("Riwayat lemparan pemain:   " + riwayatPemain);

        System.out.println("--- Total Kemenangan ---");
        System.out.println("Total kemenangan pemain:   " + kemenanganPemain + " kali");
        System.out.println("Total kemenangan komputer: " + kemenanganKomputer + " kali");
    }
}
