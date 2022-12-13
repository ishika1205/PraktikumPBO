package com.ishikanae.praktikumpob.prakpbo.pertemuan6.tugas;

public class NumberExcep {
    public static void main(String[] args) {
         try {
        
        String myString = "6";
        int angka = Integer.parseInt(myString);
            System.out.println(angka);
        
        }catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan string tidak dapat di parse karena bukan angka");
        }
    }
}
