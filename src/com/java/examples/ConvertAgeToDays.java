package com.java.examples;

public class ConvertAgeToDays {
    int days=365;
    public static void main(String[] args) {
        ConvertAgeToDays ageToDays=new ConvertAgeToDays();
        System.out.println(ageToDays.convertYearsToDays(65));
    }

    private int convertYearsToDays(int i) {

        return i*days;
    }
}
