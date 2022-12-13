package com.ishikanae.praktikumpob.prakpbo.pertemuan3.tugas;

public class Sepatu {
    private int ukuran;
    private String merk;
    private String warna;
    private int harga;
    
    public Sepatu (String merk, int ukuran, String warna, int harga){
        this.ukuran = ukuran;
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }
    
    public void showProfile (){
        System.out.println("Merk sepatu : " + merk);
        System.out.println("Ukuran sepatu : " + ukuran);
        System.out.println("Warna : " + warna);
        System.out.println("Harga sepatu : " + harga);
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public int getUkuran() {
        return ukuran;
    }
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public int getHarga (){
        return harga;
    }
    public void setHarga (int harga){
        this.harga = harga;
    }
}
