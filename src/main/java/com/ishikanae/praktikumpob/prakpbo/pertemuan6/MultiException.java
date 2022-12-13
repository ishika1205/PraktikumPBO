package com.ishikanae.praktikumpob.prakpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        try {
            System.out.print("Masukkan bilangan :");
            int bilangan = input.nextInt();
            
            System.out.print("Masukkan pembagi :");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println("Hasil pembagian (dibulatkan) : " + hasil);
        }
        catch(ArithmeticException | InputMismatchException e) {
            System.out.println("Eror : Tidak dapat memproses");
        }
        System.out.println("Proses selesai..");
    }
}
