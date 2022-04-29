package com.java.example1;

public class BrokenBridge {

    public static void main(String[] args) {

        boolean flag=BrokenBridge.brokenBridge("########");
        System.out.println(flag);
    }

    private static boolean brokenBridge(String s) {

        return !s.contains(" ");
    }
}
