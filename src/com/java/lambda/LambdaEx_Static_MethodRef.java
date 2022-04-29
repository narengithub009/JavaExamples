package com.java.lambda;

public class LambdaEx_Static_MethodRef {

    public static void main(String[] args) {
        CalculatorInterface anInterface=MyInteger::sum;
        //CalculatorInterface anInterface=(a,b)->a+b;
        Integer sumTotal=anInterface.sumMethod(12,34);
        System.out.println(sumTotal);
    }
}

class MyInteger{

    public static int sum(int x, int y){
        return  (x+y);
    }
}
@FunctionalInterface
interface CalculatorInterface{
    int sumMethod(int a,int b);
}