package com.java.examples;

public class IstheStringEmpty {

    public static void main(String[] args) {
        System.out.println(IstheStringEmpty.isStringEmpty("a"));
    }

    private static boolean isStringEmpty(String s) {

        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
