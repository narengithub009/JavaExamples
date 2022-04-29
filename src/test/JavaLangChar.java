package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class JavaLangChar {

    char c='K';
    static String  str="Narender";
    public static void main(String[] args) {

        IntStream parallel = str.chars().parallel();
        parallel.forEach(System.out::println);

        str.chars().parallel().forEach(n->System.out.println(Character.valueOf((char) n)));

        List<Character> list=new ArrayList<Character>();

        str.chars().map(x->x).forEach(n->list.add((char) n));
        System.out.println(list);

    }
}
