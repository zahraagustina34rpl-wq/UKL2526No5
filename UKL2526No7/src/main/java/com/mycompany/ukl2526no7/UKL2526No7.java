/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526no7;

/**
 *
 * @author LOQ 6
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Cookies {
    String nama;
    double hargaProduksi;
    double hargaJual;
    int jumlahTerjual;
    double totalBiaya;
    double totalPendapatan;
    double labaRugi;
    String status;

    public Cookies(String nama, double hargaProduksi, double hargaJual, int jumlahTerjual) {
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.jumlahTerjual = jumlahTerjual;
        hitungData();
    }

    private void hitungData() {
        this.totalBiaya = this.hargaProduksi * this.jumlahTerjual;
        this.totalPendapatan = this.hargaJual * this.jumlahTerjual;
        this.labaRugi = this.totalPendapatan - this.totalBiaya;

        if (this.labaRugi > 0)
            this.status = "Laba";
        else if (this.labaRugi < 0)
            this.status = "Rugi";
        else
            this.status = "Impas";
    }
}

public class UKL2526No7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cookies> daftarCookies = new ArrayList<>();
        double totalLabaRugiKeseluruhan = 0;
        double labaTertinggi = Double.MIN_VALUE;
        String cookiesLabaTertinggi = "Tidak ada";
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        nf.setMaximumFractionDigits(0);

        System.out.print("Masukkan jumlah jenis cookies yang ingin dihitung: ");
        int jumlahJenis = scanner.nextInt();
        
        for (int i = 0; i < jumlahJenis; i++) {
            System.out.println("\nCookies ke-" + (i + 1) + ":");
            scanner.nextLine();

            System.out.print("Nama cookies: ");
            String nama = scanner.nextLine();
            System.out.print("Harga produksi per bungkus (Rp): ");
            double hargaProduksi = scanner.nextDouble();
            System.out.print("Harga jual per bungkus (Rp): ");
            double hargaJual = scanner.nextDouble();
            System.out.print("Jumlah terjual (bungkus): ");
            int jumlahTerjual = scanner.nextInt();

            Cookies c = new Cookies(nama, hargaProduksi, hargaJual, jumlahTerjual);
            daftarCookies.add(c);

            totalLabaRugiKeseluruhan += c.labaRugi;

            if (c.labaRugi > labaTertinggi) {
                labaTertinggi = c.labaRugi;
                cookiesLabaTertinggi = c.nama;
            }
        }

        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-18s | %-12s | %-8s |%n",
                "Nama Cookies", "Total Biaya", "Total Pendapatan", "Laba/Rugi", "Status");
        System.out.println("----------------------------------------------------------------------------------");

        for (Cookies c : daftarCookies) {
            System.out.printf("| %-20s | %-15s | %-18s | %-12s | %-8s |%n",
                    c.nama,
                    nf.format(c.totalBiaya),
                    nf.format(c.totalPendapatan),
                    nf.format(c.labaRugi),
                    c.status
            );
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\nTotal laba/rugi keseluruhan toko: " + nf.format(totalLabaRugiKeseluruhan));
        System.out.println("Jenis cookies dengan laba tertinggi: " + cookiesLabaTertinggi +
                " (" + nf.format(labaTertinggi) + ")");

        scanner.close();
    }
}
