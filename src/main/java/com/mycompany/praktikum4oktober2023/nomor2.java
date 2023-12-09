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
public class nomor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bil1, bil2;
        
        System.out.println("PROGRAM PERBANDINGAN 2 BILANGAN");
        System.out.print("masukan bilangan 1 : ");
        bil1= in.nextInt();
        System.out.print("masukan bilangan 2 : ");
        bil2= in.nextInt();
        
        if (bil1 > bil2) {
            System.out.println("bilangan 1 lebih besar");
        } else {
            System.out.println("bilangan 2 lebih besar");
        }
    }
}
