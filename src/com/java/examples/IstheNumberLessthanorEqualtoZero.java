package com.java.examples;

public class IstheNumberLessthanorEqualtoZero {
    public static void main(String[] args) {
       boolean result= IstheNumberLessthanorEqualtoZero.numberIsLessthanorEqlToZero(0);
       System.out.println(result);
    }

    private static boolean numberIsLessthanorEqlToZero(int i) {

        if(i<=0){
            return true;
        }
        return false;
    }
}
