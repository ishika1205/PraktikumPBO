package com.ishikanae.praktikumpob.prakpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
        //Object dari class Animals
        Animals kucing = new Animals("Mako", 8 , "Putih");
        Animals ikan = new Animals();
        Animals kangguru = new Animals();
        
      
        //Demo getter & setter
        System.out.println("Nama kucing (before) : " + kucing.getNama());
        kucing.setNama("Mako");
        System.out.println("Nama kucing (after) : " + kucing.getNama());
    }
}
