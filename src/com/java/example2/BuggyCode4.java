package com.java.example2;

public class BuggyCode4 {

    public static void main(String[] args) {
        String str = BuggyCode4.greeting("Naren");
        System.out.println(str);

    }

    private static String greeting(String str) {

        String s="Narender";
        if(str.equalsIgnoreCase(s)){
            return "Hello, my Love!";
        }else {
            return "Hello, " + str + "!";
        }
    }

}
