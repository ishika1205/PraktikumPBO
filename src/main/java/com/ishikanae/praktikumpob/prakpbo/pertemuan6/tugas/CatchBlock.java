package com.ishikanae.praktikumpob.prakpbo.pertemuan6.tugas;

import java.util.Scanner;

public class CatchBlock {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Try Block Entered");
            System.out.println("Enter first integer :");
            x = input.nextInt();
            System.out.println("Enter second integer :");
            y = input.nextInt();
            System.out.println(x + "/" + y + "=" + (x/y));
            System.out.println("Try block ended!");
        }
        catch (ArithmeticException e){
            System.out.println("Denominator cannot be zero while integer division");
        }
        System.out.println("Statement after try catch block");
    }
}
