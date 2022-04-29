package com.java.example1;

public class StringtoIntegerandViceVersa {

    public static void main(String[] args) {
        int i = StringtoIntegerandViceVersa.toInt("23");

        String s = StringtoIntegerandViceVersa.toStr(23);

        System.out.println(i+" "+s);

    }

    private static String toStr(int i) {

        return Integer.toString(i);
    }
    private  static int toInt(String s){

        return Integer.parseInt(s);
    }
}
