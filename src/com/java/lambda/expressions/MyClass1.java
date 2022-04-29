package com.java.lambda.expressions;

public class MyClass1 implements MyInterface1,MyInterface2 {
    @Override
    public void myMethod(){
        System.out.println("MyInterface1 method");

    }
}
interface MyInterface1{
    default void myMethod(){
        System.out.println("MyInterface1 method");

    }
}

interface MyInterface2{
    default void myMethod(){
        System.out.println("MyInterface1 method");

    }
}