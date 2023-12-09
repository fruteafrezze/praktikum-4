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
public class nomor6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a, b, c, hasil;
        
        System.out.println("program mencari tahu segitiga siku-siku");
        System.out.print("masukan panjang sisi a : ");
        a=in.nextDouble();
        System.out.print("masukan panjang sisi b : ");
        b=in.nextDouble();
        System.out.print("masukan panjang sisi c : ");
        c=in.nextDouble();
        
        hasil=Math.sqrt(Math.pow(c, 2)-Math.pow(b, 2));
        
        if (a == hasil) {
            System.out.println("maka segitiga tersebut siku-siku");
        } else {
            System.out.println("maka segitiga bukan segitiga siku-siku");
        }
    }
}
