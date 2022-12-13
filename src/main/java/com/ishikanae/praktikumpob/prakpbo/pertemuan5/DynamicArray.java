package com.ishikanae.praktikumpob.prakpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        float jum,x,rata;
        System.out.println("Masukkan banyak data : ");
        n = input.nextInt();
        jum=0;
        i=1;
        while (i<=n){
            System.out.println("Data ke-" + i + " : ");
            x = input.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Rata-rata : " +rata);
        
        
    }
}
