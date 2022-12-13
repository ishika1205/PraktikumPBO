package com.ishikanae.praktikumpob.prakpbo.pertemuan5;

public class array2 {
    public static void main(String[] args) {
        //pembuatan array
        String[] names = {"Ana","Juna","Aliya"};
        
        //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i +" : "+ names[i]);
        }
    }
}

