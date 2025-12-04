/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2526;

/**
 *
 * @author LOQ 6
 */
import java.util.Scanner;
public class UKL2526 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        if(bilangan >=10 && bilangan <= 50){
        int check = 0;
        for (int a = 1; a <= bilangan; a++){
            if(bilangan % a == 0){
                check++;
            }
        }
        
        if (check == 2){
            System.out.println("merupakan bilangan prima");
        }else{
            System.out.println("merupakan bilangan non prima");
        }
        
        }else{
            System.out.println(bilangan + " input anda salah");
        }
    }
}
