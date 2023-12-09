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
public class nomor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           
        double tinggiBadan, beratBadan;
        System.out.println("program perhitungan berat badan ideal");
        System.out.print("masukan tinggi badan : ");
        tinggiBadan=in.nextDouble();
        System.out.print("masukan berat badan : ");
        beratBadan=in.nextDouble();
        System.out.println("maka anda termasuk : ");
        
        
        if ((tinggiBadan-beratBadan)< 90) {
            System.out.println("terlalu gemuk");
        } else if ((tinggiBadan-beratBadan)>110) {
            System.out.println("terlalu kurus");
        } else {
            System.out.println("berat ideal");
        }
    }
 
}
