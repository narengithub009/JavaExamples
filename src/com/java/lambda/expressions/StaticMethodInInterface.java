package com.java.lambda.expressions;

public class StaticMethodInInterface {
    public static void main(String[] args) {
        Animals1.food();
    }

}
class Cow implements Animals1{

}
interface Animals1{
    public  static void food(){
        System.out.println("Animals eat food");
    }
}