package com.ishikanae.praktikumpob.prakpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        // deklarasi array isi 3
        int[] myNumbers = {1,2,3};
        
        //uji cba print nilai array index ke-10
        try {
            
            System.out.println(myNumbers[10]);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Eror : Array tidak sebesar itu!");
        }
  
        System.out.println("Proses selesai!!");
    }
}


