package com.java.lambda.expressions;

public class LambdaExpressionThreadExample2 {
    public static void main(String[] args) {

        new Thread(()-> System.out.println("Thread -2")).start();
    }
}
