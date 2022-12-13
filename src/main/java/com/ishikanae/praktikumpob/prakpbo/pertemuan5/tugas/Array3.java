package com.ishikanae.praktikumpob.prakpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah kata : ");
        int n=input.nextInt();
        
        //Deklarasi array
        String kata[] = new String[n];
        
        //Input data ke array
        for(int i=0; i<kata.length; i++){
            System.out.println("Kata ke " + (i+1) + " : ");
            kata[i] = input.next();
        }
        //menampilkan data dalam array
        System.out.println("Kata yang dimasukkan : ");
        for(int i=0; i<kata.length; i++){
            System.out.println(kata[i]);
        }
    }
}
