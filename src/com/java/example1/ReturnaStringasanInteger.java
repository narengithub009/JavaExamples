package com.java.example1;

public class ReturnaStringasanInteger {

    public static void main(String[] args) {

       int i= ReturnaStringasanInteger.stringTOInteger("23");
       System.out.println(i);
    }

    private static int stringTOInteger(String s) {

        return Integer.parseInt(s);
    }
}
