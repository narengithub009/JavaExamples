package com.java.example2;

public class TothePowerof {

    public static void main(String[] args) {
        long l = TothePowerof.calPower(-12, 10);

        System.out.println(l);
    }

    private static long calPower(int i, int i1) {

        long result=0;
        if(i>=0&&i1>=0) {
            result = (long) Math.pow(i, i1);
            return result;
        }
        return -1;
    }


}
