package com.java.lambda;

public class LambdaExpression_FunctionalInterface_calculatorSum__ReferenceToInstanceMethod {

    public static void main(String[] args) {
        MyInteger1 myInteger1=new MyInteger1();
        CalculateInterface<Integer,Integer> anInterface=myInteger1::sum;
        Integer result=anInterface.sumMethod(23, 34);
        System.out.println(result);

    }
}
@FunctionalInterface
interface  CalculateInterface<A,B>{
    A sumMethod(B a,B b);
}
class MyInteger1{

    int sum(Integer a, Integer b){
        return (a+b);
    }
}