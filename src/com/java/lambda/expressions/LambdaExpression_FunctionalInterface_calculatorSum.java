package com.java.lambda.expressions;

public class LambdaExpression_FunctionalInterface_calculatorSum {
    public static void main(String[] args) {
        
        CalSum calSum=(a,b)->a+b;
        int result=calSum.sumMethod(12,23);
        System.out.println(result);
    }
}

@FunctionalInterface
interface CalSum{
    
    int sumMethod(int a, int b);
}