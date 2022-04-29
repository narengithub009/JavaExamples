package com.java.examples;

public class TheFarmProblem {

    public static void main(String[] args) {

        int totalLegs=TheFarmProblem.findTotalLegs(2,4,4);
        System.out.println(totalLegs);
    }

    private static int findTotalLegs(int i, int i1, int i2) {

        int chikenLegs=2;
        int cowLegs=4;
        int pigLegs=4;
        return (i*chikenLegs)+(i1*cowLegs)+(i2*pigLegs);
    }
}
