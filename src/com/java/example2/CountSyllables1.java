package com.java.example2;

public class CountSyllables1 {
    public static void main(String[] args) {

        CountSyllables1.numberSyllables("buf-fet-hjg-gjhg-jjh");
    }

    private static void numberSyllables(String s) {

        String str[]=s.split("-");
        System.out.println(str.length);
    }
}
