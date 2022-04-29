package com.java.lambda;

public class JavaLambdaEx {

    public static void main(String[] args) {

        MyLambda myLambda= new MyLambda(){

            @Override
            public void myRefMethod() {
                System.out.println("Anonymous implementation::::");
            }
        };

        myLambda.myRefMethod();
    }
}

@FunctionalInterface
interface MyLambda{
    void myRefMethod();

    default void defaultMethod(){

    }
    static void staticMethod(){

    }
}