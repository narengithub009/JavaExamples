package com.java.examples;

public class FramesPerSecond {

    public static void main(String[] args) {
       int totalFrames= FramesPerSecond.framePerSec(10,25);
        System.out.println(totalFrames);
    }

    private static int framePerSec(int i, int i1) {

        return (i*(i1*60));
    }
}
