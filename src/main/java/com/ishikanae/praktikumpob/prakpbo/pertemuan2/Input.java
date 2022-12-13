package com.ishikanae.praktikumpob.prakpbo.pertemuan2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //klik simbol lampu lalu pilih add import
        
        System.out.print("Masukkan nama : "); 
        String nama = input.nextLine(); 
        //input.(tergantung tipe datanya)
        System.out.print("Masukkan usia : ");
        int usia = input.nextInt();
        System.out.println("Nama saya :" + nama);
        System.out.println("Usia saya :" + usia + " tahun");
        //println: enter 
        
    }
}
