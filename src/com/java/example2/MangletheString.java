package com.java.example2;

import java.util.Arrays;

public class MangletheString {
    public static void main(String[] args) {
        MangletheString mangletheString=new MangletheString();
        mangletheString.mangle("The quick brown fox.");
    }

    private void mangle(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<=s.length()-1;i++){
            if((s.charAt(i)>97&&s.charAt(i)<122)||s.charAt(i)>65&&s.charAt(i)<90) {
                ch[i] = (char) ((s.charAt(i)) + 1);
            }
        }

        System.out.println(toString(ch));
    }
    public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }
}
