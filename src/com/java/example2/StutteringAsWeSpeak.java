package com.java.example2;

import java.text.MessageFormat;

public class StutteringAsWeSpeak {
    public static void main(String[] args) {

        String shuttering = StutteringAsWeSpeak.shuttering("dazzling");
        System.out.println(shuttering);
    }

    private static String shuttering(String s) {
        String s1=s.charAt(0)+""+s.charAt(1);
       // MessageFormat messageFormat=new MessageFormat(s);
        return (s1+"..."+s1+"..."+s+"!");
    }
}
