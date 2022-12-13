package com.ishikanae.praktikumpob.prakpbo.pertemuan2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password; //deklarasi
        
        System.out.println("====Sistem Login Sederhana====");
        System.out.print("\n Username :");
        username = input.next(); // masukkan username
        System.out.print("\n Password :");
        password = input.next(); //masukkan password
        
        if(username.equals("Ishika")&& password.equals("21103047")) {
            //jika user & pass yg dimasukkan sesuai
            System.out.println("\n Login sukses!");
        }else{
            //jika user & pass yg dimasukkan tdk sesuai
            System.out.println("\n Login gagal!");
        }
    }
}
