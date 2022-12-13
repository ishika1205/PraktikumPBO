package com.ishikanae.praktikumpob.prakpbo.pertemuan6.tugas;

public class ClassNot {
    public static void main(String[] args) {
        try {
            Class.forName("FindMissingClass");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
