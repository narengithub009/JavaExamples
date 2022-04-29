package com.java.example2;

public class Multidivision {
    public static void main(String[] args) {

        boolean abcmath = Multidivision.abcmath(5, 2, 0);
        System.out.println(abcmath);
    }

    private static boolean abcmath(int i, int i1, int i2) {

        int mul=0;
        boolean res=false;
        int temp=0;
        for(int j=0;j<=i1;j++){

        mul = (i+mul);
       i=  mul;
        }

    try {
        if(mul%i2==0){
            res=true;
        }else{
            res=false;
        }
    }catch (ArithmeticException e){
        System.out.println("I2 should be non zero ");
    }

    return res;
    }
}
