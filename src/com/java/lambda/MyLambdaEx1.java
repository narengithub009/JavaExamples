package com.java.lambda;

public class MyLambdaEx1 {


    public static void main(String[] args) {
        //MyLambdaEx1 javaLambdaEx=new MyLambdaEx1();
        MyLambda myLambda=()->System.out.println("My Lambda Expression");
        myLambda.myRefMethod();
    }
}
