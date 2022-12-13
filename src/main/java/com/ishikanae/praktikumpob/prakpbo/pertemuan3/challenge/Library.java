package com.ishikanae.praktikumpob.prakpbo.pertemuan3.challenge;

public class Library {
    private String nama;
    private int visitorsToday;
    private int yearBuilt;
    
    public Library (String nama,int visitorsToday, int yearBuilt) {
        this.nama = nama;
        this.visitorsToday = visitorsToday ;
        this.yearBuilt = yearBuilt;
    }
    
    public void showProfile (){
        System.out.println("Nama : " + nama);
        System.out.println("Pengunjung : "+ visitorsToday);
        System.out.println("Tahun dibangun : "+ yearBuilt);
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBulit() {
        return yearBuilt;
    }

    public void setYearBulit(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
