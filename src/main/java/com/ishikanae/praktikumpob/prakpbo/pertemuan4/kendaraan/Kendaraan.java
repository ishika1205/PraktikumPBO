package com.ishikanae.praktikumpob.prakpbo.pertemuan4.kendaraan;

public class Kendaraan {
    String nama;
    int jumlahRoda;
    
    public void nyalakanMesin (){
        System.out.println("Mesin " + nama + " telah dinyalakan !");
    }
    
    public void showInfo (){
        System.out.println("Nama kendaraan :" + nama);
        System.out.println("Jumlah roda : " + jumlahRoda);
        
        extraInfo();
    }

    private void extraInfo() {
       
    }
}
