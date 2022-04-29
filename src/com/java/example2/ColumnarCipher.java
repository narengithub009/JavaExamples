package com.java.example2;

import java.util.Locale;

public class ColumnarCipher {

    public static void main(String[] args) {

        String msg = ColumnarCipher.msg("Meet me by the lake at midnight. Bring shovel.");
        System.out.println(msg);
    }

    private static String msg(String s) {

        return s.replace((" "),"").toLowerCase(Locale.ROOT).replace(".","");
    }
}
