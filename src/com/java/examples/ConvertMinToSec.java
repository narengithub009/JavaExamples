package com.java.examples;

public class ConvertMinToSec {

    static int sec=60;

    public long convert(long mins){

        return mins*sec;
    }

    public static void main(String[] args) {

        ConvertMinToSec  minToSec=new ConvertMinToSec();
        System.out.println("Min To Sec "+minToSec.convert(4));

    }
}
