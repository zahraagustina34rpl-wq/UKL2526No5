/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526no6;

/**
 *
 * @author LOQ 6
 */
import java.util.Scanner;
public class UKL2526No6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaPeminjam;
        String JudulBuku;
        char kategori;
        int lamaPeminjaman;
        int tarifPerHari = 0;
        
        
        System.out.println("Masukkan nama peminjam: ");
        namaPeminjam = input.nextLine();
        System.out.println("Masukkan Judul Buku: ");
        JudulBuku = input.nextLine();
        System.out.print("Masukkan Kategori Buku (A/B/C): ");
        kategori = Character.toUpperCase(input.next().charAt(0));
        System.out.print("Masukkan Lama Peminjaman (hari): ");
        lamaPeminjaman = input.nextInt();
        
        switch (kategori){
            case 'A':
            tarifPerHari = 2000;
            break;
            case 'B':
            tarifPerHari = 1500;
            break;
            case 'C':
            tarifPerHari = 1000;
            break;
            default:
                System.out.println("Kategori buku tidak valid. Program berhenti.");
                return;
        }
        double biayaPeminjamanAwal = tarifPerHari * lamaPeminjaman;
        int batasHari = 7;
        int tarifDendaPerhari = 500;
        double dendaKeterlambatan = 0;
        
        if (lamaPeminjaman > batasHari){
            int hariTerlambat = lamaPeminjaman - batasHari;
            dendaKeterlambatan = hariTerlambat * tarifDendaPerhari;
        }
        
        double  totalBiayaAkhir = biayaPeminjamanAwal + dendaKeterlambatan;
        System.out.println("=== Rincian Biaya Peminjaman ===");
        System.out.println("Nama Peminjam           : " + namaPeminjam);
        System.out.println("Judul Buku              : " + JudulBuku);
        System.out.println("Kategori Buku           : " + kategori);
        System.out.println("Lama Peminjaman         : " + lamaPeminjaman + " hari");
        System.out.println("Biaya Peminjaman Awal   : Rp " + (int)biayaPeminjamanAwal);
        System.out.println("Denda Keterlambatan     : Rp " + (int)dendaKeterlambatan);
        System.out.println("----------------------------------------");
        System.out.println("Total Biaya Akhir       : Rp " + (int)totalBiayaAkhir);
        
    }
}
