package com.java.examples;

public class ConvertHoursandMinutesintoSeconds {

    public static void main(String[] args) {
        System.out.println(ConvertHoursandMinutesintoSeconds.convertHrsAndMinsToSec(2,0)+" secs");


    }

    private static long convertHrsAndMinsToSec(int hrs, int mins) {

        return ((hrs*60)*60+mins*60);
    }
}
