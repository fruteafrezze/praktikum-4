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
public class nomor5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double uts1, uts2, uas, nilaiTotal;
        
        System.out.println("program perhitungan nilai final");
        System.out.print("masukan nilai UTS 1 : ");
        uts1=in.nextDouble();
        System.out.print("masukan nilai UTS 2 : ");
        uts2=in.nextDouble();
        System.out.print("masukan nilai UAS : ");
        uas=in.nextDouble();
        
        nilaiTotal=0.3 * uts1 + 0.3 * uts2 +0.4*uas;
        
        if (nilaiTotal >= 80) {
            System.out.println("nilai anda A");
        } else if (nilaiTotal >= 65) {
            System.out.println("nilai anda B");
        } else if (nilaiTotal >= 55) {
            System.out.println("nilai anda C");
        } else if (nilaiTotal >= 50){
            System.out.println("nilai anda D");
        } else {
            System.out.println("nilai anda E");
        }
        
    }
}
