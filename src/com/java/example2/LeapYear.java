package com.java.example2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year : ");
        long year=scanner.nextLong();
        boolean isLeap=false;
        if(year%4==0){
            if(year%100==0){
                if (year%400==0)
                    isLeap=true;
                else
                    isLeap=false;
            }
            else
                isLeap=true;
        }else{
            isLeap=false;

        }

        if (isLeap)
            System.out.println(+year+ " is Leap year");
        else
            System.out.println(+year+ " is not Leap year");
    }
}
