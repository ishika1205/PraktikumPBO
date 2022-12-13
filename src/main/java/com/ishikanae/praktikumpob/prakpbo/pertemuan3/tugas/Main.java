package com.ishikanae.praktikumpob.prakpbo.pertemuan3.tugas;

public class Main {
    public static void main(String[] args) {
        Sepatu sport = new Sepatu ("Adidas", 37, "Hitam", 300000);
        Sepatu pria = new Sepatu ("Aerostreet", 40 , "Putih", 200000);
        Sepatu wanita = new Sepatu ("Fladeo", 38, "Cream", 250000);
        
        
        sport.showProfile();
        pria.showProfile();
        wanita.showProfile();

    }
}
