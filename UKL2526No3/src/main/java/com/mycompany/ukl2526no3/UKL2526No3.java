/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526no3;

/**
 *
 * @author LOQ 6
 */
import java.util.Random;
import java.util.Scanner;
public class UKL2526No3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean Bermain = true;
        
        
        System.out.println("Selamat datang di kuis Matematika");
        
         do{
            int bilangan1 = rand.nextInt(10) + 1;
            int bilangan2 = rand.nextInt(10) + 1;
            System.out.println("Silahkan memilih operator");
            System.out.println(" 1 Perkalian , 2 Pembagian, 3 Modulus, 4 penjumlahan, 5 pengurangan ");
            int pilih = input.nextInt();
            char operator;
            double hasilbenar = 0;
            
            
            switch (pilih){
                case 1:
                    operator = '*';
                    hasilbenar = bilangan1 * bilangan2;
                    break;
                    
                case 2:
                    operator = '/';
                    hasilbenar = (double) bilangan1 / bilangan2;
                    break;
                    
                case 3:
                    operator = '%';
                    hasilbenar = bilangan1 % bilangan2;
                    break;
                    
                case 4:
                    operator = '+';
                    hasilbenar = bilangan1 % bilangan2;
                    break;
                    
                case 5:
                    operator = '-';
                    hasilbenar = bilangan1 % bilangan2;
                    break;
                    
                default:
                    operator = '+';
                }
            
            System.out.println("Hasil dari " + bilangan1 + " " +operator+ " " + bilangan2 + " " + "=");
            int hasil;
            try {
                double jawabanUser = input.nextDouble();
                if (Math.abs(jawabanUser - hasilbenar) < 0.001){
                    System.out.println("Selamat jawaban anda benar");
                } else {
                    System.out.println("Jawaban anda salah");
                    System.out.println("Jawaban yang benar adalah: " + hasilbenar);
                }
            } catch (java.util.InputMismatchException e){
                System.out.println("Input tidak valid. Silahkan masukkan angka!");
                input.next();
            }
            System.out.print("Ingin melanjutkan kuisnya kaka?");
            String pilihan = input.next();
            if (pilihan.toLowerCase().contains("t")){
                Bermain = false;
            }
            
        } while (Bermain);
        
        System.out.println("kuis telah selesai kaka. Terimakasih");
        input.close();
          
    }
}
