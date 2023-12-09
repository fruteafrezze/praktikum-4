/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4oktober2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bilangan;
        
        System.out.println("PROGRAM PEMILIHAN BILANGAN");
        System.out.println("antara bil. Genap dan bil. Ganjil");
        System.out.print("masukan bilangan : ");
        bilangan = in.nextInt();
        
        System.out.println("____________________________________");
        if (bilangan%2 == 0) {
            System.out.println("bilangan genap");
        }
        else {
            System.out.println("bilangan ganjil");
        }
        
    }
}
