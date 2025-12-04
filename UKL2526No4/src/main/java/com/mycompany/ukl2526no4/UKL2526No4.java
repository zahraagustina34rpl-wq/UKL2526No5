/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526no4;

/**
 *
 * @author LOQ 6
 */
import java.util.Scanner;
import java.util.ArrayList;
public class UKL2526No4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duplikatPertama = -1;
        
        System.out.print("Masukkan jumlah elemen array: ");
        int a = input.nextInt();
        int[] array = new int[a];
        System.out.println("Masukkan elemen array:");
        for (int b = 0; b <  a; b++){
            array[b] = input.nextInt();
        }
        
        System.out.print("Array: { ");
        for (int b : array){
            System.out.print(b + " ");
        } 
        System.out.println("}");
        System.out.println("Array yang memiliki duplikat: ");
        
        for (int b = 0; b < array.length; b++){
            for (int k = b + 1; k < array.length; k++){
                if (array[b] == array [k]){
                    if (duplikatPertama == -1){
                        duplikatPertama = array[b];
                        System.out.print(array[b]);
                    }
                }
            }
        }
        if (duplikatPertama == -1){
            System.out.print("Tidak ada");
        }
    }
}
