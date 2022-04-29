package com.java.maths;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        float principleAmt,rateOfIntrest,timePeriod;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Principle Amt : ");
        principleAmt=s.nextFloat();
        System.out.println("Enter rate of intrest : ");
        rateOfIntrest=s.nextFloat();
        System.out.println("Enter time period : ");
        timePeriod=s.nextFloat();

        float simple_intrest;

        simple_intrest=(principleAmt*rateOfIntrest*timePeriod)/100;
        System.out.println(simple_intrest);
    }
}
