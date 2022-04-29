package com.java.examples;

public class FliptheBoolean {
    static  boolean b=false;
    public static void main(String[] args) {
       System.out.println(FliptheBoolean.reverse(b));

    }

    private static boolean reverse(boolean b) {
        return !b;
    }
}
