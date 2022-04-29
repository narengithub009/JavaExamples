package com.java.lambda;

public class StaticMethodTest {
    public static void main(String[] args) {

        SuperClass obj=new SubClass();
        obj.method();

    }
}

class SuperClass{
     void method(){
        System.out.println("superClass method");
    }
}

class SubClass extends SuperClass{

     void method(){
        System.out.println("SubClass method");
    }
}