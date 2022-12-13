package com.ishikanae.praktikumpob.prakpbo.pertemuan4.tugas;

public class MainBentuk {
    public static void main(String[] args) {
        //pembuatan object
        Bentuk bentuk = new Bentuk();
        Lingkaran lingkaran = new Lingkaran ();
        Persegi persegi = new Persegi();
        
        //mengisi nilai attribute
        bentuk.nama = "Lingkaran";
        bentuk.rumus = "Keliling";
       
        
        //pemanggilan method
        bentuk.showInfo();
        lingkaran.keliling();
        persegi.luas();
    }  
}
