package com.java.examples;

public class ConcatenateFirstandLastNameintoOneString {

    public static void main(String[] args) {
       String fullName= ConcatenateFirstandLastNameintoOneString.concatNames("Narender ","Konreddy");
       System.out.println(fullName);
    }

    private static String concatNames(String s1, String s2) {

        return s1.concat(s2);
    }
}
