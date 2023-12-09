                        
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
public class nomor4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargaPerBuah, hargaMinimal, diskon, totalBelanja, totalHarga, potonganHarga;
        int jumlahBarang;
        
        hargaPerBuah = 100000;
        hargaMinimal = 1000000;
        diskon = (10.0/100.0);
        
        System.out.println("program menghitung potongan harga");
        System.out.println("anda akan mendapatkan potongan sebesar 10% jika total belanja Rp 1.000.000");
        System.out.print("masukan jumlah barang yang dibeli :");
        jumlahBarang=in.nextInt ();
        totalBelanja= jumlahBarang*hargaPerBuah;
        
        if (totalBelanja >= hargaMinimal) {
            potonganHarga=totalBelanja*diskon;
            totalHarga= totalBelanja - potonganHarga;
            System.out.println("maka anda mendapat potongan sebesar " +  potonganHarga);
            System.out.println("dan total belanja anda sebesar "+totalHarga);
        } else {
            System.out.println("total belanjaan anda "+ totalBelanja);
        }
    }
}
