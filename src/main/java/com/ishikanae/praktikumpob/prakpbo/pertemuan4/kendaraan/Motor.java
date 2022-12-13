package com.ishikanae.praktikumpob.prakpbo.pertemuan4.kendaraan;

public class Motor extends Kendaraan{
    public void belok(String arah){
        System.out.println("Motor " + nama + " belok ke " + arah + " ! ");
    }
    public void extraInfo (){
        System.out.println("Tipe kendaraan : Motor");
    }
}
