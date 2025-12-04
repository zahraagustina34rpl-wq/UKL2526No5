/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526.no2;

/**
 *
 * @author LOQ 6
 */
import java.util.Scanner;
public class UKL2526No2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};
        
        System.out.println("Masukkan jumlah uang: ");
        int jumlahUang = input.nextInt();
        int sisa = jumlahUang;
        
        System.out.println("Hasil Pecahan: ");
        for (int a: pecahan){
            int lembarUang = sisa / a;
            if (lembarUang > 0){
                String jenis = (a >=1000) ? "lembar" : "koin";
                System.out.println(lembarUang + " " + jenis + " " + a);
            }
            sisa %= a;
        }
        if (sisa > 0){
            System.out.println("Sisa uang yang tidak dapat dipecah: " + sisa);
        }
    }
}
