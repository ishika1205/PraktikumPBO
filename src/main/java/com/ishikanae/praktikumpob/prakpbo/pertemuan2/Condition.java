package com.ishikanae.praktikumpob.prakpbo.pertemuan2;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        //ketik scanner klik lampu klik add import
        
        System.out.print("Masukkan bilangan bulat : ");
        int bilangan = input.nextInt();
        //input.next(diisi sesuai dgn tipe data yg dipakai)
        
        if(bilangan > 0) //jika bil>0 maka bil tsb bernilai positif
            System.out.println(bilangan + " adalah bilangan positif");
        else if(bilangan < 0) //jika bil<0 maka bil tsb bernilai negatif
            System.out.println(bilangan + " adalah bilangan negatif");
        else //jika yg dimasukkan angka 0
            System.out.println(bilangan + " adalah nol");
    }
    
}
