package com.java.lambda.expressions;

public class WithoutLambdaExpressionThreadExample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread - 1");
            }
        }).start();
    }
}
