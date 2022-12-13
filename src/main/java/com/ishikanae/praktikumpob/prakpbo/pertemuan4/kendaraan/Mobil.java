package com.ishikanae.praktikumpob.prakpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan {
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke " + arah + " ! ");
    }
    public void extraInfo (){
        System.out.println("Tipe kendaraan : Mobil ");
    }
    public void belok (){
        System.out.println("Eror : Harap masukkan arah belok ! (Kanan/kiri) ");
    }
}
