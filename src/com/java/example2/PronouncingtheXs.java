package com.java.example2;

import java.util.Arrays;

public class PronouncingtheXs {

    public static void main(String[] args) {
        String s = PronouncingtheXs.pronounceTheWord("Inside the box was a xylophone");
        System.out.println(s);
    }

    private static String pronounceTheWord(String s) {

        String str = null;
        char j='z';
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='x'){
                str=s.replace(s.charAt(i),j);
            }
        }
        return str;

    }

}
