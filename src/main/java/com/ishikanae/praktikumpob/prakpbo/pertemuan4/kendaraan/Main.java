package com.ishikanae.praktikumpob.prakpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object 
        /*
        Mobil mb = new Mobil ();
        Kendaraan kn = new Kendaraan ();
        */
        Motor mtr = new Motor ();
        
        //Mengisi nilai attribue
        /*
        mb.nama = "Expender sport";
        mb.jumlahRoda = 4;
        */
        
        mtr.nama = "Beat Street";
        mtr.jumlahRoda = 2;
        
        /*
        kn.nama = "Kendaraan misterius";
        kn.jumlahRoda = 3;
        */
        //Uji coba pemanggilan method
        mtr.showInfo();
        mtr.belok("Kanan");
        mtr.extraInfo();
        /*
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kiri");
        mb.belok();
        kn.showInfo();
        kn.nyalakanMesin();
*/
    }
}
