package com.java.examples;

public class AreaOfTriangle {
    public float areaOfTriangle(float base,float height){
        return (base*height)/2;
    }
    public static void main(String[] args) {
        AreaOfTriangle area=new AreaOfTriangle();
        System.out.println(area.areaOfTriangle(3,2));
    }
}
