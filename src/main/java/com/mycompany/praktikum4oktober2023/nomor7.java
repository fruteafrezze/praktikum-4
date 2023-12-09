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
public class nomor7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil1, bil2, bil3;
        
        System.out.println("program mengurutkan bilangan dari yang terkecil ");
        System.out.print("masukan bilangan pertama : ");
        bil1=in.nextInt();
        System.out.print("masukan bilangan kedua   : ");
        bil2=in.nextInt();
        System.out.print("masukan bilangan ketiga  : ");
        bil3=in.nextInt();
        
        if (bil1 < bil2 && bil2 < bil3) {
            System.out.println("maka urutan bilangan adalah "+bil1+" , "+bil2+" , "+bil3);
        } else if (bil3 < bil2 && bil2 < bil1) {
            System.out.println("maka urutan bilangan adalah "+bil3+" , "+bil2+" , "+bil1);
        } else if (bil2 < bil1 && bil1 < bil3) {
            System.out.println("maka urutan bilangan adalah "+bil2+" , "+bil1+" , "+bil3);
        } else if (bil3 < bil1 && bil1 < bil2) {
            System.out.println("maka urutan bilangan adalah "+bil3+" , "+bil1+" , "+bil2);
        } else if (bil2 < bil3 && bil3 < bil1) {
            System.out.println("maka urutan bilangan adalah "+bil2+" , "+bil3+" , "+bil1);
        } else {
            System.out.println("maka urutan bilangan adalah "+bil1+" , "+bil3+" , "+bil2);
        }
    }
}
