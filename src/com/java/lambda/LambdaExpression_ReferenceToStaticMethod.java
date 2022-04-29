package com.java.lambda;

public class LambdaExpression_ReferenceToStaticMethod {
    public static void main(String[] args) {

        MyInterface anInterface=Integer::valueOf;
        Integer result=anInterface.convertStringtoInteger("200");
        System.out.println(result);
    }
}
interface MyInterface{

    int convertStringtoInteger(String str);
}