package com.java.example1;

public class RepeatString {

    public static void main(String[] args) {

        RepeatString.repeatStr("anny",4);
    }

    private static void repeatStr(String x, int i) {
        String s=x;

        for (int j=i;j>1;j--){

          s=s.concat(x);

        }
        System.out.print(s);
    }
}
