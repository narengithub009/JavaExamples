package test;

import java.util.stream.IntStream;

public class JavaLangcodePoint {

    static  String str="Narender";

    public static void main(String[] args) {

        IntStream intStream = str.codePoints();
        intStream.forEach(System.out::println);

    }
}
