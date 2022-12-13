package com.ishikanae.praktikumpob.prakpbo.pertemuan3.animal;

public class Animals {
    //Attribute
    private String nama;
    private int usia;
    private String warna;
    
    //Constructor
    public Animals() {
        
    } 
    
    // this = memanggil attribute
    // Alt + insert -> Constructor -> Select All 
    public Animals(String nama, int usia, String warna) {
        this.nama = nama;
        this.usia = usia;
        this.warna = warna;
    }
   
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Warna : " + warna);
    }
    // ALt + Insert -> Getter & Setter -> Select All
    // getter & setter = 
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
