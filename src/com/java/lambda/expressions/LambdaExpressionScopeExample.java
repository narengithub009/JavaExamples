package com.java.lambda.expressions;

public class LambdaExpressionScopeExample {
    public static void main(String[] args) {

        final int x=10;
        int y=20;
        CalInterface anInterface=(a,b)->{

               return a+b+x+y;
        };
        int result=anInterface.sumMethod(10,20);
        System.out.println(result);
    }
}

@FunctionalInterface
interface CalInterface{
    public int sumMethod(int a,int b);
}