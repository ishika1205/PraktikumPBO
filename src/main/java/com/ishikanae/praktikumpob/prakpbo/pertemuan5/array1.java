package com.ishikanae.praktikumpob.prakpbo.pertemuan5;

public class array1 {
    public static void main(String[] args) {
        //pembuatan array
        String[] names = new String[5];
        
        //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //nilai array
        names[0] = "Ana";
        names[1] = "Juna";
        names[2] = "Aliya";
        
        //menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i +" : "+ names[i]);
        }
    }
}
